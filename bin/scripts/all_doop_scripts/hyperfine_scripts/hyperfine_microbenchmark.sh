BENCHMARK="microbenchmark"
RESULT="payroll-test-0.0.1-SNAPSHOT"

for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
  for n in NORMAL NO_INTERPROC; do
    ~/bin/hyperfine --warmup 3 "souffle -F results/$RESULT/$base_analysis/java_8/microbenchmark-$base_analysis-$n/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/$base_analysis/java_8/microbenchmark-$base_analysis-$n/" --export-markdown microbenchmark-$base_analysis-$n.md --show-output
  done
done
