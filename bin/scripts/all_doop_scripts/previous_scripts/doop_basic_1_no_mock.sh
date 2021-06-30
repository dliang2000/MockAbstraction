#!/bin/bash

# doop runs for bootique, no extra logic
./doop -a basic-only -i $HOME/Benchmarks/bootique-2.0.B1/bootique/target/bootique-2.0.B1.jar -i $HOME/Benchmarks/bootique-2.0.B1/bootique/target/bootique-2.0.B1-tests.jar -i $HOME/Benchmarks/bootique-2.0.B1/bootique/mvn_dependencies --id bootique-basic-no-mock --souffle-jobs 32 --main io.bootique.RootDriver --define-cpp-macro USE_BASIC &> $HOME/results/bootique-results/bootique-basic-no-mock.log