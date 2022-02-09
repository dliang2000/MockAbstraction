#!/bin/bash

line="benchmark,basic-only-intraproc,CI-intraproc,CIPP-intraproc,1-object-sens-intraproc,basic-only-interproc,CI-interproc,CIPP-interproc,1-object-sens-interproc"
echo $line

declare -A MYMAP

MYMAP=( [bootique]=io.bootique [commons-collection4]=org.apache.commons.collections4 [flink-core]=org.apache.flink
        [jsonschema2pojo-core]=org.jsonschema2pojo [maven-core]=org.apache.maven [microbenchmark]=ca.liang
        [mybatis]=org.apache.ibatis [quartz-core]=org.quartz [vraptor-core]=br.com.caelum.vraptor )

# bootique
for benchmark in bootique commons-collection4 flink-core jsonschema2pojo-core maven-core microbenchmark mybatis quartz-core vraptor-core; do
  line=$benchmark','
  for n in NO_INTERPROC NORMAL; do
    for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
      # bootique
      #echo bootique-$base_analysis-$n
      var=$( ./process-count.py --file $benchmark-results/$base_analysis-counts-$n --package ${MYMAP[$benchmark]} )
      line=$line$var','
    done
  done
  echo $line
done
