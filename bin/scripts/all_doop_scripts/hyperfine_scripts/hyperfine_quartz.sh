RESULT="quartz-core-2.3.1"

for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
  for n in NORMAL NO_INTERPROC; do
    ~/bin/hyperfine --warmup 3 "souffle -F results/$RESULT/$base_analysis/java_8/quartz-core-$base_analysis-$n/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/$base_analysis/java_8/quartz-core-$base_analysis-$n/" --export-markdown quartz-core-$base_analysis-$n.md --show-output
  done
done
