/*
 * Licensed to ObjectStyle LLC under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ObjectStyle LLC licenses
 * this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.bootique.junit5;

/**
 * Defines scopes of Bootique test tools within JUnit 5 test execution.
 *
 * @since 2.0
 */
public enum BQTestScope {

    /**
     * A scope that spans the entire JUnit run, that may include multiple test classes.
     */
    GLOBAL,

    /**
     * A scope that spans a single test class.
     */
    TEST_CLASS,

    /**
     * A scope that spans a single test method.
     */
    TEST_METHOD,

    /**
     * An implied scope based on whether the tool field is declared as a static or an instance variable. Static
     * corresponds to {@link #TEST_CLASS} scope, while instance - to {@link #TEST_METHOD}.
     */
    IMPLIED;
}
