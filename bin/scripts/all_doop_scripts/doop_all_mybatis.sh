#!/bin/bash

# doop runs for mybatis

. ./config.sh
export MACHINE_SPECIFIC_PATH
export BENCHMARK="mybatis-3-mybatis-3.5.6"
export EXTRA_BENCHMARK=""
export JVM=java_8
export COMPILED_JAR_PREFIX="mybatis-3.5.6"
export MAIN_CLASS="org.apache.ibatis.RootDriver"

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
$SCRIPT_DIR/_doop_all.sh

exit 0
#!/bin/bash

# doop runs for mybatis
BENCHMARK="mybatis-3-mybatis-3.5.6"
RESULT="mybatis-3.5.6"

for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
  if [[ "$base_analysis" -eq "basic-only" ]]; then
    USE_WHAT=USE_BASIC
  else
    USE_WHAT=USE_CALLGRAPH
  fi

  echo ./doop -a $base_analysis -i $HOME/Benchmarks/$BENCHMARK/target/mybatis-3.5.6.jar -i $HOME/Benchmarks/$BENCHMARK/target/mybatis-3.5.6-tests.jar -i $HOME/Benchmarks/$BENCHMARK/mvn_dependencies --id mybatis-$base_analysis-NORMAL --souffle-jobs 32 --main org.apache.ibatis.RootDriver --define-cpp-macro $USE_WHAT --extra-logic souffle-logic/analyses/mocks/mocks.dl &>> $HOME/results/mybatis3-results/mybatis3-$base_analysis-NORMAL.log
  ./doop -a $base_analysis -i $HOME/Benchmarks/$BENCHMARK/target/mybatis-3.5.6.jar -i $HOME/Benchmarks/$BENCHMARK/target/mybatis-3.5.6-tests.jar -i $HOME/Benchmarks/$BENCHMARK/mvn_dependencies --id mybatis-$base_analysis-NORMAL --souffle-jobs 32 --main org.apache.ibatis.RootDriver --define-cpp-macro $USE_WHAT --extra-logic souffle-logic/analyses/mocks/mocks.dl &>> $HOME/results/mybatis3-results/mybatis3-$base_analysis-NORMAL.log

  for n in NORMAL NO_INTERPROC; do
    echo rm -rf results/$RESULT/$base_analysis/java_8/mybatis-$base_analysis-$n
    rm -rf results/$RESULT/$base_analysis/java_8/mybatis-$base_analysis-$n

    echo mkdir -p results/$RESULT/$base_analysis/java_8/mybatis-$base_analysis-$n
    mkdir -p results/$RESULT/$base_analysis/java_8/mybatis-$base_analysis-$n

#    echo cp -a out/mybatis-$base_analysis-NORMAL/database/* results/$RESULT/$base_analysis/java_8/mybatis-$base_analysis-$n
#    cp -a out/mybatis-$base_analysis-NORMAL/database/* results/$RESULT/$base_analysis/java_8/mybatis-$base_analysis-$n

    echo /usr/bin/time -o $HOME/souffle-$base_analysis-$BENCHMARK-$n souffle -F out/mybatis-$base_analysis-NORMAL/database/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/$base_analysis/java_8/mybatis-$base_analysis-$n/
    /usr/bin/time -o $HOME/souffle-$base_analysis-$BENCHMARK-$n souffle -F out/mybatis-$base_analysis-NORMAL/database/ -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/$base_analysis/java_8/mybatis-$base_analysis-$n/

    echo ./count.py --file results/$RESULT/$base_analysis/java_8/mybatis-$base_analysis-$n/isMockInvocation.csv &> $HOME/results/mybatis3-results/$base_analysis-counts-$n
    ./count.py --file results/$RESULT/$base_analysis/java_8/mybatis-$base_analysis-$n/isMockInvocation.csv &> $HOME/results/mybatis3-results/$base_analysis-counts-$n
  done
done
