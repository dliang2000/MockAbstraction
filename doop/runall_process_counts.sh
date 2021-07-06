#!/bin/bash

# bootique

for n in NO_INTERPROC NORMAL; do
  # bootique
  echo bootique-basic-$n
  ./process-count.py --file bootique-results/basic-new-counts-$n --package io.bootique
  echo bootique-CI-$n
  ./process-count.py --file bootique-results/new-counts-$n --package io.bootique

  # commons-collections
  echo commons-basic-$n
  ./process-count.py --file commons-collection4-results/basic-new-counts-$n --package org.apache.commons.collections4
  echo commons-CI-$n
  ./process-count.py --file commons-collection4-results/new-counts-$n --package org.apache.commons.collections4

  # flink-core
  echo flink-core-basic-$n
  ./process-count.py --file flink-core-results/basic-new-counts-$n --package org.apache.flink
  echo flink-core-CI-$n
  ./process-count.py --file flink-core-results/new-counts-$n --package org.apache.flink

  # jsonschema2pojo-core
  echo jsonschema2pojo-basic-$n
  ./process-count.py --file jsonschema2pojo-core-results/basic-new-counts-$n --package org.jsonschema2pojo
  echo jsonschema2pojo-CI-$n
  ./process-count.py --file jsonschema2pojo-core-results/new-counts-$n --package org.jsonschema2pojo

  # maven -core
  echo maven-core-basic-$n
  ./process-count.py --file maven-core-results/basic-new-counts-$n --package org.apache.maven
  echo maven-core-CI-$n
  ./process-count.py --file maven-core-results/new-counts-$n --package org.apache.maven

  # microbenchmark
  echo microbenchmark-basic-$n
  ./process-count.py --file microbenchmark-results/basic-new-counts-$n --package ca.liang
  echo microbenchmark-CI-$n
  ./process-count.py --file microbenchmark-results/new-counts-$n --package ca.liang

  # quartz-core
  echo quartz-core-basic-$n
  ./process-count.py --file quartz-core-results/basic-new-counts-$n --package org.quartz
  echo quartz-core-CI-$n
  ./process-count.py --file quartz-core-results/new-counts-$n --package org.quartz

  # vraptor-core
  echo vraptor-core-basic-$n
  ./process-count.py --file vraptor-core-results/basic-new-counts-$n --package br.com.caelum.vraptor
  echo vraptor-core-CI-$n
  ./process-count.py --file vraptor-core-results/new-counts-$n --package br.com.caelum.vraptor

  # mybatis
  # echo mybatis-basic-$n
  # ./process-count.py --file mybatis-results/basic-new-counts-$n --package org.apache.ibatis
  #echo mybatis-CI-$n
  #./process-count.py --file mybatis-results/new-counts-$n --package org.apache.ibatis
done
