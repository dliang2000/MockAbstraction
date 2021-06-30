#!/bin/bash

# doop runs for flink, no mock
./doop -a basic-only -i $HOME/Benchmarks/flink-release-1.13.0-rc1/flink-core/target/flink-core-1.13.0.jar -i $HOME/Benchmarks/flink-release-1.13.0-rc1/flink-core/target/flink-core-1.13.0-tests.jar -i $HOME/Benchmarks/flink-release-1.13.0-rc1/flink-core/mvn_dependencies --id flink-core-basic-no-mock --souffle-jobs 32 --main org.apache.flink.RootDriver --define-cpp-macro USE_BASIC &> $HOME/results/flink-core-results/flink-core-basic-no-mock.log
