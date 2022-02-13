#!/bin/bash

# doop runs for mybatis
./doop -a basic-only -i $HOME/Benchmarks/mybatis-3-mybatis-3.5.6/target/mybatis-3.5.6.jar -i $HOME/Benchmarks/mybatis-3-mybatis-3.5.6/target/mybatis-3.5.6-tests.jar -i $HOME/Benchmarks/mybatis-3-mybatis-3.5.6/mvn_dependencies --id mybatis-basic-no-mock --souffle-jobs 32 --main org.apache.ibatis.RootDriver --define-cpp-macro USE_BASIC &> $HOME/results/mybatis3-results/mybatis3-basic-no-mock.log
