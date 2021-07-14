#!/bin/bash

# bootique
for base_analysis in basic-only context-insensitive context-insensitive-plusplus 1-object-sensitive; do
  for n in NO_INTERPROC NORMAL; do
    # bootique
    echo bootique-$base_analysis-$n
    ./process-count.py --file bootique-results/$base_analysis-counts-$n --package io.bootique

    # commons-collections
    echo commons-collections-$base_analysis-$n
    ./process-count.py --file commons-collection4-results/$base_analysis-counts-$n --package org.apache.commons.collections4

    # flink-core
    echo flink-core-$base_analysis-$n
    ./process-count.py --file flink-core-results/$base_analysis-counts-$n --package org.apache.flink

    # jsonschema2pojo-core
    echo jsonschema2pojo-$base_analysis-$n
    ./process-count.py --file jsonschema2pojo-core-results/$base_analysis-counts-$n --package org.jsonschema2pojo

    # maven -core
    echo maven-core-$base_analysis-$n
    ./process-count.py --file maven-core-results/$base_analysis-counts-$n --package org.apache.maven

    # microbenchmark
    echo microbenchmark-$base_analysis-$n
    ./process-count.py --file microbenchmark-results/$base_analysis-counts-$n --package ca.liang

    # quartz-core
    echo quartz-core-$base_analysis-$n
    ./process-count.py --file quartz-core-results/$base_analysis-counts-$n --package org.quartz

    # vraptor-core
    echo vraptor-core-$base_analysis-$n
    ./process-count.py --file vraptor-core-results/$base_analysis-counts-$n --package br.com.caelum.vraptor

    # mybatis
    echo mybatis-$base_analysis-$n
    ./process-count.py --file mybatis-results/$base_analysis-counts-$n --package org.apache.ibatis
  done
done
