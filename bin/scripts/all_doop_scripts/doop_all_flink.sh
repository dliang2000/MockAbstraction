#!/bin/bash

# doop runs for flink
BENCHMARK="flink-release-1.13.0-rc1"
RESULT="flink-core-1.13.0"

for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
  if [[ "$base_analysis" -eq "basic-only" ]]; then
    USE_WHAT=USE_BASIC
  else
    USE_WHAT=USE_CALLGRAPH
  fi

  echo ./doop -a $base_analysis -i $HOME/Benchmarks/$BENCHMARK/flink-core/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/flink-core/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/flink-core/mvn_dependencies --id flink-core-$base_analysis-NORMAL --souffle-jobs 32 --main org.apache.flink.RootDriver --define-cpp-macro $USE_WHAT --extra-logic souffle-logic/analyses/mocks/mocks.dl &>> $HOME/results/flink-core-results/flink-core-$base_analysis-NORMAL.log
  ./doop -a $base_analysis -i $HOME/Benchmarks/$BENCHMARK/flink-core/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/flink-core/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/flink-core/mvn_dependencies --id flink-core-$base_analysis-NORMAL --souffle-jobs 32 --main org.apache.flink.RootDriver --define-cpp-macro $USE_WHAT --extra-logic souffle-logic/analyses/mocks/mocks.dl &>> $HOME/results/flink-core-results/flink-core-$base_analysis-NORMAL.log

  for n in NORMAL NO_INTERPROC; do
    echo rm -rf results/$RESULT/$base_analysis/java_8/flink-core-$base_analysis-$n
    rm -rf results/$RESULT/$base_analysis/java_8/flink-core-$base_analysis-$n

    echo mkdir -p results/$RESULT/$base_analysis/java_8/flink-core-$base_analysis-$n
    mkdir -p results/$RESULT/$base_analysis/java_8/flink-core-$base_analysis-$n

#    echo cp -a out/flink-core-$base_analysis-NORMAL/database/* results/$RESULT/$base_analysis/java_8/flink-core-$base_analysis-$n
#    cp -a out/flink-core-$base_analysis-NORMAL/database/* results/$RESULT/$base_analysis/java_8/flink-core-$base_analysis-$n

    echo /usr/bin/time -o $HOME/souffle-$base_analysis-$BENCHMARK-$n souffle -F out/flink-core-$base_analysis-NORMAL/database/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/$base_analysis/java_8/flink-core-$base_analysis-$n/
    /usr/bin/time -o $HOME/souffle-$base_analysis-$BENCHMARK-$n souffle -F out/flink-core-$base_analysis-NORMAL/database/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/$base_analysis/java_8/flink-core-$base_analysis-$n/

    echo ./count.py --file results/$RESULT/$base_analysis/java_8/flink-core-$base_analysis-$n/isMockInvocation.csv &> $HOME/results/flink-core-results/$base_analysis-counts-$n
    ./count.py --file results/$RESULT/$base_analysis/java_8/flink-core-$base_analysis-$n/isMockInvocation.csv &> $HOME/results/flink-core-results/$base_analysis-counts-$n
  done
done
