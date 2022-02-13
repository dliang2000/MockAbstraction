#!/bin/bash

# doop runs for flink
for n in NORMAL NO_INTERPROC; do
  ./doop -a context-insensitive -i $HOME/Benchmarks/flink-release-1.13.0-rc1/flink-core/target/flink-core-1.13.0.jar -i $HOME/Benchmarks/flink-release-1.13.0-rc1/flink-core/target/flink-core-1.13.0-tests.jar -i $HOME/Benchmarks/flink-release-1.13.0-rc1/flink-core/mvn_dependencies --id flink-core-mock-counts-$n --souffle-jobs 32 --main org.apache.flink.RootDriver --define-cpp-macro $n --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/flink-core-results/flink-core-$n.log
  ./count.py --file results/flink-core-1.13.0/context-insensitive/java_8/flink-core-mock-counts-$n/isMockInvocation.csv &> $HOME/results/flink-core-results/current-counts-$n
done
