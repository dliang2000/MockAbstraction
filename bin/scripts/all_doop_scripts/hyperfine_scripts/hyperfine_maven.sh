BENCHMARK="maven-maven-3.8.1"
RESULT="maven-core-3.8.1"

for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
  for n in NORMAL NO_INTERPROC; do
    ~/bin/hyperfine --warmup 3 "souffle -F out/maven-core-$base_analysis-NORMAL/database/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/$base_analysis/java_8/maven-core-$base_analysis-$n/" --export-csv maven-core-$base_analysis-$n.csv --show-output
  done
done
