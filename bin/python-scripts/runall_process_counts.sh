#!/bin/bash

source ./config.sh
#echo $MACHINE_SPECIFIC_PATH

line="benchmark,basic-only-intraproc,CI-intraproc,CIPP-intraproc,1-object-sens-intraproc,basic-only-interproc,CI-interproc,CIPP-interproc,1-object-sens-interproc"
echo $line

declare -A MYMAP

MYMAP=( [bootique-2.0.B1]=io.bootique [commons-collections4-4.4]=org.apache.commons.collections4 [flink-release-1.13.0-rc1]=org.apache.flink
        [jsonschema2pojo-1.1.1]=org.jsonschema2pojo [maven-maven-3.8.1]=org.apache.maven [microbenchmark]=ca.liang [mybatis-3-mybatis-3.5.6]=org.apache.ibatis
        [quartz-quartz-2.3.1-patched]=org.quartz [vraptor-vraptor-parent-3.5.5]=br.com.caelum.vraptor )


# commons-collections4-4.4 flink-core jsonschema2pojo-core maven-core mybatis quartz-core vraptor-core
for benchmark in bootique-2.0.B1 commons-collections4-4.4 flink-release-1.13.0-rc1 jsonschema2pojo-1.1.1 maven-maven-3.8.1 microbenchmark mybatis-3-mybatis-3.5.6 quartz-quartz-2.3.1-patched vraptor-vraptor-parent-3.5.5; do
  line=$benchmark','
  for n in NO_INTERPROC NORMAL; do
    for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
      # bootique
      #echo bootique-$base_analysis-$n
      var=$( $MACHINE_SPECIFIC_PATH/doop/python-scripts/process-count.py --file $MACHINE_SPECIFIC_PATH/results/$benchmark-results/$base_analysis-counts-$n --package ${MYMAP[$benchmark]} )
      line=$line$var','
    done
  done
  echo $line
done
