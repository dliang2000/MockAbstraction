#!/bin/bash

# doop runs for mybatis
./doop -a context-insensitive -i $HOME/Benchmarks/mybatis-3-mybatis-3.5.6/target/mybatis-3.5.6.jar -i $HOME/Benchmarks/mybatis-3-mybatis-3.5.6/target/mybatis-3.5.6-tests.jar -i $HOME/Benchmarks/mybatis-3-mybatis-3.5.6/mvn_dependencies --id mybatis-no-mock --souffle-jobs 32 --main org.apache.ibatis.RootDriver &> $HOME/results/mybatis3-results/mybatis3-no-mock.log
