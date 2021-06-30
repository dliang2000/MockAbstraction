#!/bin/bash

# doop runs for vraptor, no mock
./doop -a context-insensitive -i $HOME/Benchmarks/vraptor-vraptor-parent-3.5.5/vraptor-core/target/vraptor-3.5.5.jar -i $HOME/Benchmarks/vraptor-vraptor-parent-3.5.5/vraptor-core/target/vraptor-3.5.5-tests.jar -i $HOME/Benchmarks/vraptor-vraptor-parent-3.5.5/vraptor-core/mvn_dependencies --id vraptor-no-mock --souffle-jobs 32 --main br.com.caelum.vraptor.RootDriver &> $HOME/results/vraptor-core-results/vraptor-core-no-mock.log
