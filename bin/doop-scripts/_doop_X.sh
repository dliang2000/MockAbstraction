#!/bin/bash

# internal script, relies on
#export BENCHMARK="microbenchmark"
#export JVM=java_8
#export COMPILED_JAR_PREFIX="payroll-test-0.0.1-SNAPSHOT"

# for base_analysis in 1-object-sensitive ; do
for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
  if [[ "$base_analysis" == "basic-only" ]]; then
      USE_WHAT=USE_BASIC
  else
      USE_WHAT=USE_CALLGRAPH
  fi
  mkdir -p $MACHINE_SPECIFIC_PATH/results/$BENCHMARK-results/
  echo ./doop -a $base_analysis -i $MACHINE_SPECIFIC_PATH/Benchmarks/$BENCHMARK$EXTRA_BENCHMARK/target/$COMPILED_JAR_PREFIX.jar -i $MACHINE_SPECIFIC_PATH/Benchmarks/$BENCHMARK$EXTRA_BENCHMARK/target/$COMPILED_JAR_PREFIX-tests.jar -i $MACHINE_SPECIFIC_PATH/Benchmarks/$BENCHMARK$EXTRA_BENCHMARK/mvn_dependencies --id $BENCHMARK-$base_analysis-NORMAL --souffle-jobs 32 --main $MAIN_CLASS --define-cpp-macro $USE_WHAT --extra-logic souffle-logic/analyses/mocks/mocks.dl | tee $MACHINE_SPECIFIC_PATH/results/$BENCHMARK-results/$BENCHMARK-$base_analysis-NORMAL.log
  ./doop -a $base_analysis -i $MACHINE_SPECIFIC_PATH/Benchmarks/$BENCHMARK$EXTRA_BENCHMARK/target/$COMPILED_JAR_PREFIX.jar -i $MACHINE_SPECIFIC_PATH/Benchmarks/$BENCHMARK$EXTRA_BENCHMARK/target/$COMPILED_JAR_PREFIX-tests.jar -i $MACHINE_SPECIFIC_PATH/Benchmarks/$BENCHMARK$EXTRA_BENCHMARK/mvn_dependencies --id $BENCHMARK-$base_analysis-NORMAL --souffle-jobs 32 --main $MAIN_CLASS --define-cpp-macro $USE_WHAT --extra-logic souffle-logic/analyses/mocks/mocks.dl | tee $MACHINE_SPECIFIC_PATH/results/$BENCHMARK-results/$BENCHMARK-$base_analysis-NORMAL.log

#  for n in NORMAL; do
  for n in NORMAL NO_INTERPROC; do
    echo rm -rf $MACHINE_SPECIFIC_PATH/results/$base_analysis/$JVM/$BENCHMARK-$base_analysis-$n
    rm -rf $MACHINE_SPECIFIC_PATH/results/$base_analysis/$JVM/$BENCHMARK-$base_analysis-$n

    echo mkdir -p $MACHINE_SPECIFIC_PATH/results/$base_analysis/$JVM/$BENCHMARK-$base_analysis-$n
    mkdir -p $MACHINE_SPECIFIC_PATH/results/$BENCHMARK-results/$base_analysis/$JVM/$BENCHMARK-$base_analysis-$n

    echo /usr/bin/time -o $MACHINE_SPECIFIC_PATH/results/$BENCHMARK-results/souffle-time-$base_analysis-$BENCHMARK-$n souffle -F out/$BENCHMARK-$base_analysis-NORMAL/database/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D $MACHINE_SPECIFIC_PATH/results/$BENCHMARK-results/$base_analysis/$JVM/$BENCHMARK-$base_analysis-$n/
    /usr/bin/time -o $MACHINE_SPECIFIC_PATH/results/$BENCHMARK-results/souffle-time-$base_analysis-$BENCHMARK-$n souffle -F out/$BENCHMARK-$base_analysis-NORMAL/database/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D $MACHINE_SPECIFIC_PATH/results/$BENCHMARK-results/$base_analysis/$JVM/$BENCHMARK-$base_analysis-$n/

    echo $MACHINE_SPECIFIC_PATH/doop/count.py --file $MACHINE_SPECIFIC_PATH/results/$BENCHMARK-results/$base_analysis/$JVM/$BENCHMARK-$base_analysis-$n/isMockInvocation.csv | tee  $MACHINE_SPECIFIC_PATH/results/$BENCHMARK-results/$base_analysis-counts-$n
    $MACHINE_SPECIFIC_PATH/doop/count.py --file $MACHINE_SPECIFIC_PATH/results/$BENCHMARK-results/$base_analysis/$JVM/$BENCHMARK-$base_analysis-$n/isMockInvocation.csv &> $MACHINE_SPECIFIC_PATH/results/$BENCHMARK-results/$base_analysis-counts-$n
  done
done
