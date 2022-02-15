#!/bin/bash

# doop runs for commons-collections4
BENCHMARK="jsonschema2pojo-1.1.1"
RESULT="jsonschema2pojo-core-1.1.1"

# doop runs for jsonschema2pojo-1.1.1-core
./doop -a basic-only -i $HOME/Benchmarks/$BENCHMARK/jsonschema2pojo-core/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/jsonschema2pojo-core/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/jsonschema2pojo-core/mvn_dependencies --id jsonschema2pojo-basic-new-NORMAL --souffle-jobs 32 --main org.jsonschema2pojo.RootDriver --define-cpp-macro USE_BASIC --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/jsonschema2pojo-core-results/jsonschema2pojo-core-basic-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir -p results/$RESULT/basic-only/java_8/

  cp -a last-analysis results/$RESULT/basic-only/java_8/jsonschema2pojo-basic-new-$n

  /usr/bin/time -o $HOME/souffle-basic-$BENCHMARK-$n souffle -F results/$RESULT/basic-only/java_8/jsonschema2pojo-basic-new-$n/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/basic-only/java_8/jsonschema2pojo-basic-new-$n/

  ./count.py --file results/$RESULT/basic-only/java_8/jsonschema2pojo-basic-new-$n/isMockInvocation.csv &> $HOME/results/jsonschema2pojo-core-results/basic-new-counts-$n
done

./doop -a context-insensitive -i $HOME/Benchmarks/$BENCHMARK/jsonschema2pojo-core/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/jsonschema2pojo-core/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/jsonschema2pojo-core/mvn_dependencies --id jsonschema2pojo-new-NORMAL --souffle-jobs 32 --main org.jsonschema2pojo.RootDriver --define-cpp-macro USE_CALLGRAPH --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/jsonschema2pojo-core-results/jsonschema2pojo-core-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir -p results/$RESULT/context-insensitive/java_8/

  cp -a last-analysis results/$RESULT/context-insensitive/java_8/jsonschema2pojo-new-$n

  /usr/bin/time -o $HOME/souffle-context-insensitive-$BENCHMARK-$n souffle -F results/$RESULT/context-insensitive/java_8/jsonschema2pojo-new-$n/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/context-insensitive/java_8/jsonschema2pojo-new-$n/

  ./count.py --file results/$RESULT/context-insensitive/java_8/jsonschema2pojo-new-$n/isMockInvocation.csv &> $HOME/results/jsonschema2pojo-core-results/new-counts-$n
done
