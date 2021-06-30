#!/bin/bash

# doop runs for quartz, no mock
./doop -a context-insensitive -i $HOME/Benchmarks/quartz-quartz-2.3.1-patched/quartz-core/target/quartz-core-2.3.1.jar -i $HOME/Benchmarks/quartz-quartz-2.3.1-patched/quartz-core/target/quartz-core-2.3.1-tests.jar -i $HOME/Benchmarks/quartz-quartz-2.3.1-patched/quartz-core/mvn_dependencies --id quartz-core-no-mock --souffle-jobs 32 --main org.quartz.RootDriver &> $HOME/results/quartz-core-results/quartz-core-no-mock.log

# doop runs for maven-core, no mock
./doop -a context-insensitive -i $HOME/Benchmarks/maven-maven-3.8.1/maven-core/target/maven-core-3.8.1.jar -i $HOME/Benchmarks/maven-maven-3.8.1/maven-core/target/maven-core-3.8.1-tests.jar -i $HOME/Benchmarks/maven-maven-3.8.1/maven-core/mvn_dependencies --id maven-core-no-mock --souffle-jobs 32 --main org.apache.maven.RootDriver &> $HOME/results/maven-core-results/maven-core-no-mock.log


# doop runs for microbenchmark, no mock
./doop  -a context-insensitive -i $HOME/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT.jar -i $HOME/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT-tests.jar -i $HOME/Benchmarks/microbenchmark/mvn_dependencies --id microbenchmark-no-mock --souffle-jobs 32 --main ca.liang.RootDriver &> $HOME/results/microbenchmark-results/microbenchmark-no-mock.log
