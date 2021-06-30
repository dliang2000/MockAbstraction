#!/bin/bash

# doop runs for quartz, basic-only
for n in NORMAL NO_INTERPROC; do
  ./doop -a basic-only -i $HOME/Benchmarks/quartz-quartz-2.3.1-patched/quartz-core/target/quartz-core-2.3.1.jar -i $HOME/Benchmarks/quartz-quartz-2.3.1-patched/quartz-core/target/quartz-core-2.3.1-tests.jar -i $HOME/Benchmarks/quartz-quartz-2.3.1-patched/quartz-core/mvn_dependencies --id quartz-core-basic-$n --souffle-jobs 32 --main org.quartz.RootDriver --define-cpp-macro USE_BASIC --define-cpp-macro $n --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/quartz-core-results/quartz-core-basic-$n.log
  ./count.py --file results/quartz-core-2.3.1/basic-only/java_8/quartz-core-basic-$n/isMockInvocation.csv &> $HOME/results/quartz-core-results/basic-counts-$n
done


# doop runs for maven-core
for n in NORMAL NO_INTERPROC; do
  ./doop -a basic-only -i $HOME/Benchmarks/maven-maven-3.8.1/maven-core/target/maven-core-3.8.1.jar -i $HOME/Benchmarks/maven-maven-3.8.1/maven-core/target/maven-core-3.8.1-tests.jar -i $HOME/Benchmarks/maven-maven-3.8.1/maven-core/mvn_dependencies --id maven-core-basic-$n --souffle-jobs 32 --main org.apache.maven.RootDriver --define-cpp-macro USE_BASIC --define-cpp-macro $n --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/maven-core-results/maven-core-basic-$n.log
  ./count.py --file results/maven-core-3.8.1/basic-only/java_8/maven-core-basic-$n/isMockInvocation.csv &> $HOME/results/maven-core-results/basic-counts-$n
done


# doop runs for microbenchmark
for n in NORMAL NO_INTERPROC; do
  ./doop -a basic-only -i $HOME/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT.jar -i $HOME/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT-tests.jar -i $HOME/Benchmarks/microbenchmark/mvn_dependencies --id microbenchmark-basic-$n --souffle-jobs 32 --main ca.liang.RootDriver --define-cpp-macro USE_BASIC --define-cpp-macro $n --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/microbenchmark-results/microbenchmark-basic-$n.log
  ./count.py --file results/payroll-test-0.0.1-SNAPSHOT/basic-only/java_8/microbenchmark-basic-$n/isMockInvocation.csv &> $HOME/results/microbenchmark-results/basic-counts-$n
done
