#!/bin/bash

source ./config.sh
#echo $MACHINE_SPECIFIC_PATH

line="benchmark,basic-only-intraproc,CI-intraproc,CIPP-intraproc,1-object-sens-intraproc,basic-only-interproc,CI-interproc,CIPP-interproc,1-object-sens-interproc"
echo $line

declare -A MYMAP

MYMAP=( [mybatis-3-mybatis-3.5.6]=org.apache.ibatis )


# commons-collections4-4.4 flink-core jsonschema2pojo-core maven-core mybatis quartz-core vraptor-core
for benchmark in mybatis-3-mybatis-3.5.6; do
  line=$benchmark','
  for n in NO_INTERPROC NORMAL; do
    for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
      # bootique
      #echo bootique-$base_analysis-$n
      var=$( $MACHINE_SPECIFIC_PATH/bin/python-scripts/process-count.py --file $MACHINE_SPECIFIC_PATH/results/verification-run/$benchmark-results/$base_analysis-counts-$n --package ${MYMAP[$benchmark]} )
      line=$line$var','
    done
  done
  echo $line
done
