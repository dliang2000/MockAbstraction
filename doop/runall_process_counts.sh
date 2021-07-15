#!/bin/bash

line="benchmark,basic-only-intraproc,CI-intraproc,CIPP-intraproc,1-object-sens-intraproc,basic-only-interproc,CI-interproc,CIPP-interproc,1-object-sens-interproc"
echo $line

# bootique
line="bootique,"
for n in NO_INTERPROC NORMAL; do
  for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
    # bootique
    #echo bootique-$base_analysis-$n
    var=$( ./process-count.py --file bootique-results/$base_analysis-counts-$n --package io.bootique )
    line=$line$var','
  done
done
echo $line

line="commons-collections,"
for n in NO_INTERPROC NORMAL; do
  for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
    # commons-collections
    # echo commons-collections-$base_analysis-$n
    var=$( ./process-count.py --file commons-collection4-results/$base_analysis-counts-$n --package org.apache.commons.collections4 )
    line=$line$var","
  done
done
echo $line

line="flink-core,"
for n in NO_INTERPROC NORMAL; do
  for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
    # flink-core
    #echo flink-core-$base_analysis-$n
    var=$( ./process-count.py --file flink-core-results/$base_analysis-counts-$n --package org.apache.flink )
    line=$line$var','
  done
done
echo $line

line="jsonschema2pojo-core,"
for n in NO_INTERPROC NORMAL; do
  for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
    # jsonschema2pojo-core
    #echo jsonschema2pojo-$base_analysis-$n
    var=$( ./process-count.py --file jsonschema2pojo-core-results/$base_analysis-counts-$n --package org.jsonschema2pojo )
    line=$line$var','
  done
done
echo $line

line="maven-core,"
for n in NO_INTERPROC NORMAL; do
  for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
    # maven -core
    #echo maven-core-$base_analysis-$n
    var=$( ./process-count.py --file maven-core-results/$base_analysis-counts-$n --package org.apache.maven )
    line=$line$var','
  done
done
echo $line

line="microbenchmark,"
for n in NO_INTERPROC NORMAL; do
  for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
    # microbenchmark
    #echo microbenchmark-$base_analysis-$n
    var=$( ./process-count.py --file microbenchmark-results/$base_analysis-counts-$n --package ca.liang )
    line=$line$var','
  done
done
echo $line

line="quartz-core,"
for n in NO_INTERPROC NORMAL; do
  for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
    # quartz-core
    #echo quartz-core-$base_analysis-$n
    var=$( ./process-count.py --file quartz-core-results/$base_analysis-counts-$n --package org.quartz )
    line=$line$var','
  done
done
echo $line

line="vraptor-core,"
# context-insensitive context-insensitive-plusplus (remove these two base_analysis for the current bad lines)
for n in NO_INTERPROC NORMAL; do
  for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
    # vraptor-core
    #echo vraptor-core-$base_analysis-$n
    var=$( ./process-count.py --file vraptor-core-results/$base_analysis-counts-$n --package br.com.caelum.vraptor )
    line=$line$var','
  done
done
echo $line

line="mybatis,"
for n in NO_INTERPROC NORMAL; do
  for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
    # mybatis
    #echo mybatis-$base_analysis-$n
    var=$( ./process-count.py --file mybatis-results/$base_analysis-counts-$n --package org.apache.ibatis )
    line=$line$var','
  done
done
echo $line
