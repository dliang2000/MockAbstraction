#!/bin/bash

# doop runs for bootique, basic-only
for n in NORMAL NO_INTERPROC; do
  ./doop -a basic-only -i $HOME/Benchmarks/bootique-2.0.B1/bootique/target/bootique-2.0.B1.jar -i $HOME/Benchmarks/bootique-2.0.B1/bootique/target/bootique-2.0.B1-tests.jar -i $HOME/Benchmarks/bootique-2.0.B1/bootique/mvn_dependencies --id bootique-basic-$n --souffle-jobs 32 --main io.bootique.RootDriver --define-cpp-macro USE_BASIC --define-cpp-macro $n --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/bootique-results/bootique-basic-$n.log
  ./count.py --file results/bootique-2.0.B1/basic-only/java_8/bootique-basic-$n/isMockInvocation.csv &> $HOME/results/bootique-results/basic-counts-$n
done
