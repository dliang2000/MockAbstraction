#!/bin/bash

# doop runs for commons-collections4, no mock
./doop -a context-insensitive -i $HOME/Benchmarks/commons-collections4-4.4/target/commons-collections4-4.4.jar -i $HOME/Benchmarks/commons-collections4-4.4/target/commons-collections4-4.4-tests.jar -i $HOME/Benchmarks/commons-collections4-4.4/mvn_dependencies --id commons-collections4-no-mock --souffle-jobs 32 --main org.apache.commons.collections4.RootDriver &> $HOME/results/commons-collection4-results/commons-collection4-no-mock.log


# doop runs for jsonschema2pojo-1.1.1-core, no mock
./doop -a context-insensitive -i $HOME/Benchmarks/jsonschema2pojo-1.1.1/jsonschema2pojo-core/target/jsonschema2pojo-core-1.1.1.jar -i $HOME/Benchmarks/jsonschema2pojo-1.1.1/jsonschema2pojo-core/target/jsonschema2pojo-core-1.1.1-tests.jar -i $HOME/Benchmarks/jsonschema2pojo-1.1.1/jsonschema2pojo-core/mvn_dependencies --id jsonschema2pojo-no-mock --souffle-jobs 32 --main org.jsonschema2pojo.RootDriver &> $HOME/results/jsonschema2pojo-core-results/jsonschema2pojo-core-no-mock.log
