#!/bin/bash

# doop runs for mybatis
BENCHMARK="mybatis-3-mybatis-3.5.6"
RESULT="mybatis-3.5.6"

./doop -a basic-only -i $HOME/Benchmarks/$BENCHMARK/target/mybatis-3.5.6.jar -i $HOME/Benchmarks/$BENCHMARK/target/mybatis-3.5.6-tests.jar -i $HOME/Benchmarks/$BENCHMARK/mvn_dependencies --id mybatis-basic-new-NORMAL --souffle-jobs 32 --main org.apache.ibatis.RootDriver --define-cpp-macro USE_BASIC --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/mybatis3-results/mybatis3-basic-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/$RESULT/basic-only/java_8/mybatis-basic-new-$n/

  mv last-analysis results/$BENCHMARK/basic-only/java_8/mybatis-basic-new-$n/

  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/basic-only/java_8/mybatis-basic-new-$n/

  ./count.py --file results/$RESULT/basic-only/java_8/mybatis-basic-new-$n/isMockInvocation.csv &> $HOME/results/mybatis3-results/basic-new-counts-$n
done

./doop -a context-insensitive -i $HOME/Benchmarks/$BENCHMARK/target/mybatis-3.5.6.jar -i $HOME/Benchmarks/$BENCHMARK/target/mybatis-3.5.6-tests.jar -i $HOME/Benchmarks/$BENCHMARK/mvn_dependencies --id mybatis-new-NORMAL --souffle-jobs 32 --main org.apache.ibatis.RootDriver --define-cpp-macro USE_CALLGRAPH --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/mybatis3-results/mybatis3-new-NORMAL.log

for n in NORMAL NO_INTERPROC; do
  mkdir results/$RESULT/context-insensitive/java_8/mybatis-new-$n/

  mv last-analysis results/$BENCHMARK/basic-only/java_8/mybatis-new-$n/

  souffle -F last-analysis -M $n souffle-logic/analyses/mocks/mocks-after.dl -D results/$RESULT/context-insensitive/java_8/mybatis-new-$n/

  ./count.py --file results/$RESULT/context-insensitive/java_8/mybatis-new-$n/isMockInvocation.csv &> $HOME/results/mybatis3-results/new-counts-$n
done
