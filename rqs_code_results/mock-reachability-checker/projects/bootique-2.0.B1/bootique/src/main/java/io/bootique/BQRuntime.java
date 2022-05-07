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

package io.bootique;

import io.bootique.annotation.Args;
import io.bootique.command.CommandOutcome;
import io.bootique.di.Injector;
import io.bootique.di.Key;
import io.bootique.log.BootLogger;
import io.bootique.run.Runner;
import io.bootique.shutdown.ShutdownManager;

import java.util.Objects;

/**
 * A wrapper around launcher DI container.
 */
public class BQRuntime {

    private Injector injector;

    public BQRuntime(Injector injector) {
        this.injector = injector;
    }

    /**
     * Returns a DI-bound instance of a given class, throwing if this class is not explicitly bound in DI.
     *
     * @param <T>  a type of the instance to return.
     * @param type a class or interface bound in DI.
     * @return a DI-bound instance of a given type.
     * @since 0.12
     */
    public <T> T getInstance(Class<T> type) {
        return getInstance(Key.get(type));
    }

    /**
     * Returns a DI-bound instance for a given DI key, throwing if such key is not explicitly bound in DI.
     *
     * @param <T>   a type of the instance to return.
     * @param diKey a DI key for a given instance.
     * @return a DI-bound instance of a given type.
     * @since 0.23
     */
    public <T> T getInstance(Key<T> diKey) {
        if(!injector.hasProvider(diKey)) {
            throw new NullPointerException("No binding for key: " + diKey);
        }
        return injector.getProvider(diKey).get();
    }

    public BootLogger getBootLogger() {
        return getInstance(BootLogger.class);
    }

    /**
     * Locates internal {@link Runner} and calls its run method.
     *
     * @return outcome of the runner execution.
     * @since 0.23
     */
    public CommandOutcome run() {
        return getInstance(Runner.class).run();
    }

    public String[] getArgs() {
        return injector.getInstance(Key.get(String[].class, Args.class));
    }

    /**
     * Executes Bootique runtime shutdown, allowing all interested DI services to perform cleanup.
     *
     * @since 0.12
     */
    public void shutdown() {
        ShutdownManager shutdownManager = injector.getInstance(ShutdownManager.class);
        BootLogger logger = getBootLogger();

        shutdown(shutdownManager, logger);
    }

    protected void shutdown(ShutdownManager shutdownManager, BootLogger logger) {
        shutdownManager.shutdown().forEach((s, th) -> {
            logger.stderr(String.format("Error performing shutdown of '%s': %s", s.getClass().getSimpleName(),
                    th.getMessage()));
        });
    }
}
