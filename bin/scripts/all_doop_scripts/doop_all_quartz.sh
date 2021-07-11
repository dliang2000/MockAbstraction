#!/bin/bash

# doop runs for quartz
BENCHMARK="quartz-quartz-2.3.1-patched"
RESULT="quartz-core-2.3.1"

for base_analysis in basic-only context-insensitive context-insensitive-plusplus; do
  if [[ "$base_analysis" -eq "basic-only" ]]; then
    USE_WHAT=USE_BASIC
  else
    USE_WHAT=USE_CALLGRAPH
  fi

  echo ./doop -a $base_analysis -i $HOME/Benchmarks/$BENCHMARK/quartz-core/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/quartz-core/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/quartz-core/mvn_dependencies --id quartz-core-$base_analysis-NORMAL --souffle-jobs 32 --main org.quartz.RootDriver --define-cpp-macro $USE_WHAT --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/quartz-core-results/quartz-core-$base_analysis-NORMAL.log
  ./doop -a $base_analysis -i $HOME/Benchmarks/$BENCHMARK/quartz-core/target/$RESULT.jar -i $HOME/Benchmarks/$BENCHMARK/quartz-core/target/$RESULT-tests.jar -i $HOME/Benchmarks/$BENCHMARK/quartz-core/mvn_dependencies --id quartz-core-$base_analysis-NORMAL --souffle-jobs 32 --main org.quartz.RootDriver --define-cpp-macro $USE_WHAT --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/quartz-core-results/quartz-core-$base_analysis-NORMAL.log

  for n in NORMAL NO_INTERPROC; do
    echo rm -rf results/$RESULT/$base_analysis/java_8/quartz-core-$base_analysis-$n
    rm -rf results/$RESULT/$base_analysis/java_8/quartz-core-$base_analysis-$n

    echo mkdir -p results/$RESULT/$base_analysis/java_8/quartz-core-$base_analysis-$n
    mkdir -p results/$RESULT/$base_analysis/java_8/quartz-core-$base_analysis-$n

#    echo cp -a out/quartz-core-$base_analysis-NORMAL/database/* results/$RESULT/$base_analysis/java_8/quartz-core-$base_analysis-$n
#    cp -a out/quartz-core-$base_analysis-NORMAL/database/* results/$RESULT/$base_analysis/java_8/quartz-core-$base_analysis-$n

    echo /usr/bin/time -o $HOME/souffle-$base_analysis-$BENCHMARK-$n souffle -F out/quartz-core-$base_analysis-NORMAL/database/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/$base_analysis/java_8/quartz-core-$base_analysis-$n/
    /usr/bin/time -o $HOME/souffle-$base_analysis-$BENCHMARK-$n souffle -F out/quartz-core-$base_analysis-NORMAL/database/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/$base_analysis/java_8/quartz-core-$base_analysis-$n/

    echo ./count.py --file results/$RESULT/$base_analysis/java_8/quartz-core-$base_analysis-$n/isMockInvocation.csv &> $HOME/results/quartz-core-results/$base_analysis-counts-$n
    ./count.py --file results/$RESULT/$base_analysis/java_8/quartz-core-$base_analysis-$n/isMockInvocation.csv &> $HOME/results/quartz-core-results/$base_analysis-counts-$n
  done
done
