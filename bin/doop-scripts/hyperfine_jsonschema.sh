BENCHMARK="jsonschema2pojo-1.1.1"
RESULT="jsonschema2pojo-core-1.1.1"

for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
  for n in NORMAL NO_INTERPROC; do
    ~/bin/hyperfine --warmup 3 "souffle -F out/jsonschema2pojo-$base_analysis-NORMAL/database/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/$base_analysis/java_8/jsonschema2pojo-$base_analysis-$n/" --export-csv jsonschema2pojo-$base_analysis-$n.csv --show-output
  done
done
