#!/bin/bash

# doop runs for vraptor, no mock
./doop -a basic-only -i $HOME/Benchmarks/vraptor-vraptor-parent-3.5.5/vraptor-core/target/vraptor-3.5.5.jar -i $HOME/Benchmarks/vraptor-vraptor-parent-3.5.5/vraptor-core/target/vraptor-3.5.5-tests.jar -i $HOME/Benchmarks/vraptor-vraptor-parent-3.5.5/vraptor-core/mvn_dependencies --id vraptor-basic-no-mock --souffle-jobs 32 --main br.com.caelum.vraptor.RootDriver --define-cpp-macro USE_BASIC &> $HOME/results/vraptor-core-results/vraptor-core-basic-no-mock.log
