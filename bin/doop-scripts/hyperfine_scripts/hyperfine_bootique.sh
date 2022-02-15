BENCHMARK="bootique-2.0.B1"

for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
  for n in NORMAL NO_INTERPROC; do
    ~/bin/hyperfine --warmup 3 "souffle -F out/bootique-$base_analysis-NORMAL/database/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$BENCHMARK/$base_analysis/java_8/bootique-$base_analysis-$n/" --export-csv bootique-$base_analysis-$n.csv --show-output
  done
done
