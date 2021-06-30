#!/bin/bash

# doop runs for vraptor
BENCHMARK="vraptor-vraptor-parent-3.5.5"
RESULT="vraptor-3.5.5"

./doop -a basic-only -i $HOME/Benchmarks/$BENCHMARK/vraptor-core/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/vraptor-core/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/vraptor-core/mvn_dependencies --id vraptor-basic-new-NORMAL --souffle-jobs 32 --main br.com.caelum.vraptor.RootDriver --define-cpp-macro USE_BASIC --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/vraptor-core-results/vraptor-core-basic-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/$RESULT/basic-only/java_8/vraptor-basic-new-$n/

  mv last-analysis results/$BENCHMARK/basic-only/java_8/vraptor-basic-new-$n/

  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/basic-only/java_8/vraptor-basic-new-$n/

  ./count.py --file results/$RESULT/basic-only/java_8/vraptor-basic-new-$n/isMockInvocation.csv &> $HOME/results/vraptor-core-results/basic-new-counts-$n
done

./doop -a context-insensitive -i $HOME/Benchmarks/$BENCHMARK/vraptor-core/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/vraptor-core/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/vraptor-core/mvn_dependencies --id vraptor-new-NORMAL --souffle-jobs 32 --main br.com.caelum.vraptor.RootDriver --define-cpp-macro USE_CALLGRAPH --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/vraptor-core-results/vraptor-core-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/$RESULT/context-insensitive/java_8/vraptor-new-$n/

  mv last-analysis results/$BENCHMARK/basic-only/java_8//vraptor-new-$n/ 

  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/context-insensitive/java_8/vraptor-new-$n/

  ./count.py --file results/$RESULT/context-insensitive/java_8/vraptor-new-$n/isMockInvocation.csv &> $HOME/results/vraptor-core-results/new-counts-$n
done