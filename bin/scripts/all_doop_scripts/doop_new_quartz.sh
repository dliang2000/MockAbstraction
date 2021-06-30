#!/bin/bash

# doop runs for quartz
BENCHMARK="quartz-quartz-2.3.1-patched"
./doop -a basic-only -i $HOME/Benchmarks/$BENCHMARK/quartz-core/target/quartz-core-2.3.1.jar -i $HOME/Benchmarks/$BENCHMARK/quartz-core/target/quartz-core-2.3.1-tests.jar -i $HOME/Benchmarks/$BENCHMARK/quartz-core/mvn_dependencies --id quartz-core-basic-new-NORMAL --souffle-jobs 32 --main org.quartz.RootDriver --define-cpp-macro USE_BASIC --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/quartz-core-results/quartz-core-basic-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/quartz-core-2.3.1/basic-only/java_8/quartz-core-basic-new-$n/

  mv last-analysis results/$BENCHMARK/basic-only/java_8/quartz-core-basic-new-$n/

  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/quartz-core-2.3.1/basic-only/java_8/quartz-core-basic-new-$n/

  ./count.py --file results/quartz-core-2.3.1/basic-only/java_8/quartz-core-basic-new-$n/isMockInvocation.csv &> $HOME/results/quartz-core-results/basic-new-counts-$n
done

./doop -a context-insensitive -i $HOME/Benchmarks/$BENCHMARK/quartz-core/target/quartz-core-2.3.1.jar -i $HOME/Benchmarks/$BENCHMARK/quartz-core/target/quartz-core-2.3.1-tests.jar -i $HOME/Benchmarks/$BENCHMARK/quartz-core/mvn_dependencies --id quartz-core-new-NORMAL --souffle-jobs 32 --main org.quartz.RootDriver --define-cpp-macro USE_CALLGRAPH --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/quartz-core-results/quartz-core-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/quartz-core-2.3.1/context-insensitive/java_8/quartz-core-new-$n/

  mv last-analysis results/$BENCHMARK/basic-only/java_8/quartz-core-new-$n/  

  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/quartz-core-2.3.1/context-insensitive/java_8/quartz-core-new-$n/

  ./count.py --file results/quartz-core-2.3.1/context-insensitive/java_8/quartz-core-new-$n/isMockInvocation.csv &> $HOME/results/quartz-core-results/new-counts-$n
done
