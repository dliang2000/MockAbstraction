#!/bin/bash

# doop runs for commons-collections4

BENCHMARK="commons-collections4-4.4"

for base_analysis in basic-only context-insensitive context-insensitive-plusplus; do
  if [[ "$base_analysis" == "basic-only" ]]; then
    ./doop -a $base_analysis -i $HOME/Benchmarks/$BENCHMARK/target/$BENCHMARK.jar -i $HOME/Benchmarks/$BENCHMARK/target/$BENCHMARK-tests.jar -i $HOME/Benchmarks/$BENCHMARK/mvn_dependencies --id commons-collections4-$base_analysis-NORMAL --souffle-jobs 32 --main org.apache.commons.collections4.RootDriver --define-cpp-macro USE_BASIC --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/commons-collection4-results/commons-collection4-$base_analysis-NORMAL.log

    for n in NORMAL NO_INTERPROC; do
      mkdir -p results/$BENCHMARK/$base_analysis/java_8/

      rm -rf results/$BENCHMARK/$base_analysis/java_8/commons-collections4-$base_analysis-$n

      cp -a out/commons-collections4-$base_analysis-NORMAL/database/* results/$BENCHMARK/$base_analysis/java_8/commons-collections4-$base_analysis-$n

      /usr/bin/time -o $HOME/souffle-$base_analysis-$BENCHMARK-$n souffle -F results/$BENCHMARK/$base_analysis/java_8/commons-collections4-$base_analysis-$n/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$BENCHMARK/$base_analysis/java_8/commons-collections4-$base_analysis-$n/

      ./count.py --file results/$BENCHMARK/$base_analysis/java_8/commons-collections4-$base_analysis-$n/isMockInvocation.csv &> $HOME/results/commons-collection4-results/$base_analysis-counts-$n
    done
  else
    ./doop -a $base_analysis -i $HOME/Benchmarks/$BENCHMARK/target/$BENCHMARK.jar -i $HOME/Benchmarks/$BENCHMARK/target/$BENCHMARK-tests.jar -i $HOME/Benchmarks/$BENCHMARK/mvn_dependencies --id commons-collections4-$base_analysis-NORMAL --souffle-jobs 32 --main org.apache.commons.collections4.RootDriver --define-cpp-macro USE_CALLGRAPH --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/commons-collection4-results/commons-collection4-$base_analysis-NORMAL.log

    for n in NORMAL NO_INTERPROC; do
      mkdir -p results/$BENCHMARK/$base_analysis/java_8/

      rm -rf results/$BENCHMARK/$base_analysis/java_8/commons-collections4-$base_analysis-$n

      cp -a out/commons-collections4-$base_analysis-NORMAL/database/* results/$BENCHMARK/$base_analysis/java_8/commons-collections4-$base_analysis-$n

      /usr/bin/time -o $HOME/souffle-$base_analysis-$BENCHMARK-$n souffle -F results/$BENCHMARK/$base_analysis/java_8/commons-collections4-$base_analysis-$n/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$BENCHMARK/$base_analysis/java_8/commons-collections4-$base_analysis-$n/

      ./count.py --file results/$BENCHMARK/$base_analysis/java_8/commons-collections4-$base_analysis-$n/isMockInvocation.csv &> $HOME/results/commons-collection4-results/$base_analysis-counts-$n
    done
  fi
done
