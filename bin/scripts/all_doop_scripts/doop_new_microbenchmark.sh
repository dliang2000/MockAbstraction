#!/bin/bash

BENCHMARK="microbenchmark"
RESULT="payroll-test-0.0.1-SNAPSHOT"

# doop runs for microbenchmark
./doop -a basic-only -i $HOME/Benchmarks/$BENCHMARK/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/mvn_dependencies --id microbenchmark-basic-new-NORMAL --souffle-jobs 32 --main ca.liang.RootDriver --define-cpp-macro USE_BASIC --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/microbenchmark-results/microbenchmark-basic-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/$RESULT/basic-only/java_8/microbenchmark-basic-new-$n/

  mv last-analysis results/$BENCHMARK/basic-only/java_8/microbenchmark-basic-new-$n/

  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/basic-only/java_8/microbenchmark-basic-new-$n/

  ./count.py --file results/$RESULT/basic-only/java_8/microbenchmark-basic-new-$n/isMockInvocation.csv &> $HOME/results/microbenchmark-results/basic-new-counts-$n
done

./doop -a context-insensitive -i $HOME/Benchmarks/$BENCHMARK/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/mvn_dependencies --id microbenchmark-new-NORMAL --souffle-jobs 32 --main ca.liang.RootDriver --define-cpp-macro USE_CALLGRAPH --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/microbenchmark-results/microbenchmark-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/$RESULT/context-insensitive/java_8/microbenchmark-new-$n/

  mv last-analysis results/$BENCHMARK/basic-only/java_8/microbenchmark-new-$n/

  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/context-insensitive/java_8/microbenchmark-new-$n/

  ./count.py --file results/$RESULT/context-insensitive/java_8/microbenchmark-new-$n/isMockInvocation.csv &> $HOME/results/microbenchmark-results/new-counts-$n
done