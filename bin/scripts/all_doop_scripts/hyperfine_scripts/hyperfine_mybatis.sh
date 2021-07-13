BENCHMARK="mybatis-3-mybatis-3.5.6"
RESULT="mybatis-3.5.6"

for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
  for n in NORMAL NO_INTERPROC; do
    ~/bin/hyperfine --warmup 3 "souffle -F out/mybatis-$base_analysis-NORMAL/database/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/$base_analysis/java_8/mybatis-$base_analysis-$n/" --export-markdown mybatis-$base_analysis-$n.md --show-output
  done
done
