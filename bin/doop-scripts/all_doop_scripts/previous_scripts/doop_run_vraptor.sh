#!/bin/bash

# doop runs for vraptor
for n in NORMAL NO_INTERPROC; do
  ./doop -a context-insensitive -i $HOME/Benchmarks/vraptor-vraptor-parent-3.5.5/vraptor-core/target/vraptor-3.5.5.jar -i $HOME/Benchmarks/vraptor-vraptor-parent-3.5.5/vraptor-core/target/vraptor-3.5.5-tests.jar -i $HOME/Benchmarks/vraptor-vraptor-parent-3.5.5/vraptor-core/mvn_dependencies --id vraptor-mock-counts-$n --souffle-jobs 32 --main br.com.caelum.vraptor.RootDriver --define-cpp-macro $n --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/vraptor-core-results/vraptor-core-$n.log
  ./count.py --file results/vraptor-3.5.5/context-insensitive/java_8/vraptor-mock-counts-$n/isMockInvocation.csv &> $HOME/results/vraptor-core-results/current-counts-$n
done
