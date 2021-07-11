#!/bin/bash

# doop runs for bootique, $base_analysis

BENCHMARK="bootique-2.0.B1"

for base_analysis in basic-only context-insensitive context-insensitive-plusplus; do
  if [[ "$base_analysis" -eq "basic-only" ]]; then
    USE_WHAT=USE_BASIC
  else
    USE_WHAT=USE_CALLGRAPH
  fi

  ./doop -a $base_analysis -i $HOME/Benchmarks/$BENCHMARK/bootique/target/bootique-2.0.B1.jar -i $HOME/Benchmarks/$BENCHMARK/bootique/target/bootique-2.0.B1-tests.jar -i $HOME/Benchmarks/$BENCHMARK/bootique/mvn_dependencies --id bootique-$base_analysis-NORMAL --souffle-jobs 32 --main io.bootique.RootDriver --define-cpp-macro $USE_WHAT --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/bootique-results/bootique-$base_analysis-NORMAL.log

  for n in NORMAL NO_INTERPROC; do
    rm -rf results/$RESULT/$base_analysis/java_8/bootique-$base_analysis-$n

    mkdir -p results/$RESULT/$base_analysis/java_8/bootique-$base_analysis-$n

    cp -a out/bootique-$base_analysis-NORMAL/database/* results/$BENCHMARK/$base_analysis/java_8/bootique-$base_analysis-$n

    /usr/bin/time -o $HOME/souffle-$base_analysis-$BENCHMARK-$n souffle -F results/$BENCHMARK/$base_analysis/java_8/bootique-$base_analysis-$n/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$BENCHMARK/$base_analysis/java_8/bootique-$base_analysis-$n/

    ./count.py --file results/$BENCHMARK/$base_analysis/java_8/bootique-$base_analysis-$n/isMockInvocation.csv &> $HOME/results/bootique-results/$base_analysis-counts-$n
  done
done
