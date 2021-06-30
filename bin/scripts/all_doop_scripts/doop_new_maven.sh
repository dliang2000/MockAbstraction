#!/bin/bash

# doop runs for maven
BENCHMARK="maven-maven-3.8.1"
RESULT="maven-core-3.8.1"
./doop -a basic-only -i $HOME/Benchmarks/$BENCHMARK/maven-core/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/maven-core/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/maven-core/mvn_dependencies --id maven-core-basic-new-NORMAL --souffle-jobs 32 --main org.apache.maven.RootDriver --define-cpp-macro USE_BASIC --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/maven-core-results/maven-core-basic-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/$RESULT/basic-only/java_8/maven-core-basic-new-$n/

  mv last-analysis results/$BENCHMARK/basic-only/java_8/maven-core-basic-new-$n/

  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/basic-only/java_8/maven-core-basic-new-$n/

  ./count.py --file results/$RESULT/basic-only/java_8/maven-core-basic-new-$n/isMockInvocation.csv &> $HOME/results/maven-core-results/basic-new-counts-$n
done


./doop -a context-insensitive -i $HOME/Benchmarks/$BENCHMARK/maven-core/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/maven-core/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/maven-core/mvn_dependencies --id maven-core-new-NORMAL --souffle-jobs 32 --main org.apache.maven.RootDriver --define-cpp-macro USE_CALLGRAPH --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/maven-core-results/maven-core-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/$RESULT/context-insensitive/java_8/maven-core-new-$n/

  mv last-analysis results/$BENCHMARK/basic-only/java_8/maven-core-new-$n/

  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/context-insensitive/java_8/maven-core-new-$n/

  ./count.py --file results/$RESULT/context-insensitive/java_8/maven-core-new-$n/isMockInvocation.csv &> $HOME/results/maven-core-results/new-counts-$n
done