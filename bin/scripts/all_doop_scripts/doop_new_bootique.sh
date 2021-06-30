#!/bin/bash

# doop runs for bootique, basic-only

BENCHMARK="bootique-2.0.B1"

./doop -a basic-only -i $HOME/Benchmarks/$BENCHMARK/bootique/target/bootique-2.0.B1.jar -i $HOME/Benchmarks/$BENCHMARK/bootique/target/bootique-2.0.B1-tests.jar -i $HOME/Benchmarks/$BENCHMARK/bootique/mvn_dependencies --id bootique-basic-new-NORMAL --souffle-jobs 32 --main io.bootique.RootDriver --define-cpp-macro USE_BASIC --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/bootique-results/bootique-basic-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/$BENCHMARK/basic-only/java_8/bootique-basic-new-$n/

  mv last-analysis results/$BENCHMARK/basic-only/java_8/bootique-basic-new-$n/

  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$BENCHMARK/basic-only/java_8/bootique-basic-new-$n/

  ./count.py --file results/$BENCHMARK/basic-only/java_8/bootique-basic-new-$n/isMockInvocation.csv &> $HOME/results/bootique-results/basic-new-counts-$n
done


./doop -a context-insensitive -i $HOME/Benchmarks/$BENCHMARK/bootique/target/bootique-2.0.B1.jar -i $HOME/Benchmarks/$BENCHMARK/bootique/target/bootique-2.0.B1-tests.jar -i $HOME/Benchmarks/$BENCHMARK/bootique/mvn_dependencies --id bootique-new-NORMAL --souffle-jobs 32 --main io.bootique.RootDriver --define-cpp-macro USE_CALLGRAPH --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/bootique-results/bootique-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/$BENCHMARK/context-insensitive/java_8/bootique-new-$n/

  mv last-analysis results/$BENCHMARK/context-insensitive/java_8/bootique-new-$n/
  
  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$BENCHMARK/context-insensitive/java_8/bootique-new-$n/

  ./count.py --file results/$BENCHMARK/context-insensitive/java_8/bootique-new-$n/isMockInvocation.csv &> $HOME/results/bootique-results/new-counts-$n
done
