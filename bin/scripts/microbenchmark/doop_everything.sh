#!/bin/bash
# run this from directory of the doop build (not the doop subdir)
source ./config.sh
echo $MACHINE_SPECIFIC_PATH

for n in NORMAL NO_INTERPROC NO_COLLECTIONS NO_ARRAYS NO_FIELDS; do
  ./doop  -a context-insensitive -i ~/hacking/MockAbstraction/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT.jar -i ~/hacking/MockAbstraction/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT-tests.jar -i ~/hacking/MockAbstraction/Benchmarks/microbenchmark/mvn_dependencies/  --souffle-jobs 32 --main ca.liang.RootDriver --id context-insensitive-with-mocks --define-cpp-macro $n --extra-logic souffle-logic/analyses/mocks/mocks.dl
  $MACHINE_SPECIFIC_PATH/doop/count.py > $MACHINE_SPECIFIC_PATH/doop/microbenchmark-results/current-counts-$n
done
