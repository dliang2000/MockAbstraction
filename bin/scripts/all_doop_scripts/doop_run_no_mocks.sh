#!/bin/bash

./doop -a context-insensitive -i $HOME/Benchmarks/bootique-2.0.B1/bootique/target/bootique-2.0.B1.jar -i $HOME/Benchmarks/bootique-2.0.B1/bootique/target/bootique-2.0.B1-tests.jar -i $HOME/Benchmarks/bootique-2.0.B1/bootique/mvn_dependencies --id bootique-no-mock --souffle-jobs 32 --main io.bootique.RootDriver &> $HOME/results/bootique-results/bootique-no-mock.log

./doop -a context-insensitive -i $HOME/Benchmarks/quartz-quartz-2.3.1-patched/quartz-core/target/quartz-core-2.3.1.jar -i $HOME/Benchmarks/quartz-quartz-2.3.1-patched/quartz-core/target/quartz-core-2.3.1-tests.jar -i $HOME/Benchmarks/quartz-quartz-2.3.1-patched/quartz-core/mvn_dependencies --id quartz-core-no-mock --souffle-jobs 32 --main org.quartz.RootDriver &> $HOME/results/quartz-core-results/quartz-core-no-mock.log

./doop -a context-insensitive -i $HOME/Benchmarks/maven-maven-3.8.1/maven-core/target/maven-core-3.8.1.jar -i $HOME/Benchmarks/maven-maven-3.8.1/maven-core/target/maven-core-3.8.1-tests.jar -i $HOME/Benchmarks/maven-maven-3.8.1/maven-core/mvn_dependencies --id maven-core-no-mock --souffle-jobs 32 --main org.apache.maven.RootDriver &> $HOME/results/maven-core-results/maven-core-no-mock.log

./doop  -a context-insensitive -i $HOME/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT.jar -i $HOME/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT-tests.jar -i $HOME/Benchmarks/microbenchmark/mvn_dependencies --id microbenchmark-no-mock --souffle-jobs 32 --main ca.liang.RootDriver &> $HOME/results/microbenchmark-results/microbenchmark-no-mock.log

 ./doop -a context-insensitive -i $HOME/Benchmarks/commons-collections4-4.4/target/commons-collections4-4.4.jar -i $HOME/Benchmarks/commons-collections4-4.4/target/commons-collections4-4.4-tests.jar -i $HOME/Benchmarks/commons-collections4-4.4/mvn_dependencies --id commons-collections4-no-mock --souffle-jobs 32 --main org.apache.commons.collections4.RootDriver &> $HOME/results/commons-collection4-results/commons-collection4-no-mock.log

 ./doop -a context-insensitive -i $HOME/Benchmarks/mybatis-3-mybatis-3.5.6/target/mybatis-3.5.6.jar -i $HOME/Benchmarks/mybatis-3-mybatis-3.5.6/target/mybatis-3.5.6-tests.jar -i $HOME/Benchmarks/mybatis-3-mybatis-3.5.6/mvn_dependencies --id mybatis-no-mock --souffle-jobs 32 --main org.apache.ibatis.RootDriver &> $HOME/results/mybatis3-results/mybatis3-no-mock.log

 ./doop -a context-insensitive -i $HOME/Benchmarks/jsonschema2pojo-1.1.1/jsonschema2pojo-core/target/jsonschema2pojo-core-1.1.1.jar -i $HOME/Benchmarks/jsonschema2pojo-1.1.1/jsonschema2pojo-core/target/jsonschema2pojo-core-1.1.1-tests.jar -i $HOME/Benchmarks/jsonschema2pojo-1.1.1/jsonschema2pojo-core/mvn_dependencies --id jsonschema2pojo-no-mock --souffle-jobs 32 --main org.jsonschema2pojo.RootDriver &> $HOME/results/jsonschema2pojo-core-results/jsonschema2pojo-core-no-mock.log

./doop -a context-insensitive -i $HOME/Benchmarks/vraptor-vraptor-parent-3.5.5/vraptor-core/target/vraptor-3.5.5.jar -i $HOME/Benchmarks/vraptor-vraptor-parent-3.5.5/vraptor-core/target/vraptor-3.5.5-tests.jar -i $HOME/Benchmarks/vraptor-vraptor-parent-3.5.5/vraptor-core/mvn_dependencies --id vraptor-no-mock --souffle-jobs 32 --main br.com.caelum.vraptor.RootDriver &> $HOME/results/vraptor-core-results/vraptor-core-no-mock.log

 ./doop -a context-insensitive -i $HOME/Benchmarks/flink-release-1.13.0-rc1/flink-core/target/flink-core-1.13.0.jar -i $HOME/Benchmarks/flink-release-1.13.0-rc1/flink-core/target/flink-core-1.13.0-tests.jar -i $HOME/Benchmarks/flink-release-1.13.0-rc1/flink-core/mvn_dependencies --id flink-core-no-mock --souffle-jobs 32 --main org.apache.flink.RootDriver &> $HOME/results/flink-core-results/flink-core-no-mock.log
