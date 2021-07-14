BENCHMARK="commons-collections4-4.4"

for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
  for n in NORMAL NO_INTERPROC; do
    ~/bin/hyperfine --warmup 3 "souffle -F out/commons-collections4-$base_analysis-NORMAL/database/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$BENCHMARK/$base_analysis/java_8/commons-collections4-$base_analysis-$n/" --export-csv commons-collections4-$base_analysis-$n.csv --show-output
  done
done
