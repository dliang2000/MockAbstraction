#!/bin/bash

# doop runs for quartz
BENCHMARK="quartz-quartz-2.3.1-patched"
RESULT="quartz-core-2.3.1"
./doop -a basic-only -i $HOME/Benchmarks/$BENCHMARK/quartz-core/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/quartz-core/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/quartz-core/mvn_dependencies --id quartz-core-basic-new-NORMAL --souffle-jobs 32 --main org.quartz.RootDriver --define-cpp-macro USE_BASIC --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/quartz-core-results/quartz-core-basic-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir -p results/$RESULT/basic-only/java_8/

  cp -a last-analysis results/$RESULT/basic-only/java_8/quartz-core-basic-new-$n

  /usr/bin/time -o $HOME/souffle-basic-$BENCHMARK-$n souffle -F results/$RESULT/basic-only/java_8/quartz-core-basic-new-$n/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/basic-only/java_8/quartz-core-basic-new-$n/

  ./count.py --file results/$RESULT/basic-only/java_8/quartz-core-basic-new-$n/isMockInvocation.csv &> $HOME/results/quartz-core-results/basic-new-counts-$n
done

./doop -a context-insensitive -i $HOME/Benchmarks/$BENCHMARK/quartz-core/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/quartz-core/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/quartz-core/mvn_dependencies --id quartz-core-new-NORMAL --souffle-jobs 32 --main org.quartz.RootDriver --define-cpp-macro USE_CALLGRAPH --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/quartz-core-results/quartz-core-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir -p results/$RESULT/context-insensitive/java_8/

  cp -a last-analysis results/$RESULT/context-insensitive/java_8/quartz-core-new-$n

  /usr/bin/time -o $HOME/souffle-context-insensitive-$BENCHMARK-$n -F results/$RESULT/context-insensitive/java_8/quartz-core-new-$n/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/context-insensitive/java_8/quartz-core-new-$n/

  ./count.py --file results/$RESULT/context-insensitive/java_8/quartz-core-new-$n/isMockInvocation.csv &> $HOME/results/quartz-core-results/new-counts-$n
done
