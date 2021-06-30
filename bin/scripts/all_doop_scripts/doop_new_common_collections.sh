#!/bin/bash

# doop runs for commons-collections4

BENCHMARK="commons-collections4-4.4"

./doop -a basic-only -i $HOME/Benchmarks/$BENCHMARK/target/$BENCHMARK.jar -i $HOME/Benchmarks/$BENCHMARK/target/$BENCHMARK-tests.jar -i $HOME/Benchmarks/$BENCHMARK/mvn_dependencies --id commons-collections4-basic-new-NORMAL --souffle-jobs 32 --main org.apache.commons.collections4.RootDriver --define-cpp-macro USE_BASIC --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/commons-collection4-results/commons-collection4-basic-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/$BENCHMARK/basic-only/java_8/commons-collections4-basic-new-$n/

  mv last-analysis results/$BENCHMARK/basic-only/java_8/commons-collections4-basic-new-$n/

  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$BENCHMARK/basic-only/java_8/commons-collections4-basic-new-$n/

  ./count.py --file results/$BENCHMARK/basic-only/java_8/commons-collections4-basic-new-$n/isMockInvocation.csv &> $HOME/results/commons-collection4-results/basic-new-counts-$n
done

./doop -a context-insensitive -i $HOME/Benchmarks/$BENCHMARK/target/$BENCHMARK.jar -i $HOME/Benchmarks/$BENCHMARK/target/$BENCHMARK-tests.jar -i $HOME/Benchmarks/$BENCHMARK/mvn_dependencies --id commons-collections4-new-NORMAL --souffle-jobs 32 --main org.apache.commons.collections4.RootDriver --define-cpp-macro USE_CALLGRAPH --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/commons-collection4-results/commons-collection4-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/$BENCHMARK/context-insensitive/java_8/commons-collections4-new-$n/

  mv last-analysis results/$BENCHMARK/basic-only/java_8/commons-collections4-new-$n/
  
  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$BENCHMARK/context-insensitive/java_8/commons-collections4-new-$n/

  ./count.py --file results/$BENCHMARK/context-insensitive/java_8/commons-collections4-new-$n/isMockInvocation.csv &> $HOME/results/commons-collection4-results/new-counts-$n
done
