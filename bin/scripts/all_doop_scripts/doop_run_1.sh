#!/bin/bash

# doop runs for bootique
for n in NORMAL NO_INTERPROC; do
  ./doop -a context-insensitive -i $HOME/Benchmarks/bootique-2.0.B1/bootique/target/bootique-2.0.B1.jar -i $HOME/Benchmarks/bootique-2.0.B1/bootique/target/bootique-2.0.B1-tests.jar -i $HOME/Benchmarks/bootique-2.0.B1/bootique/mvn_dependencies --id bootique-mock-counts-$n --souffle-jobs 32 --main io.bootique.RootDriver --define-cpp-macro $n --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/bootique-results/bootique-$n.log
  ./count.py --file results/bootique-2.0.B1/context-insensitive/java_8/bootique-mock-counts-$n/isMockInvocation.csv &> $HOME/results/bootique-results/current-counts-$n
done
