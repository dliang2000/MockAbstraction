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

package io.bootique.unit;

import io.bootique.BQCoreModule;
import io.bootique.BQCoreModuleExtender;
import io.bootique.BQModuleMetadata;
import io.bootique.BQModuleOverrideBuilder;
import io.bootique.BQModuleProvider;
import io.bootique.BQRuntime;
import io.bootique.Bootique;
import io.bootique.di.BQModule;
import io.bootique.help.ValueObjectDescriptor;
import io.bootique.log.BootLogger;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BQInternalTestFactory implements BeforeEachCallback, AfterEachCallback {

    private static final Logger LOGGER = LoggerFactory.getLogger(BQInternalTestFactory.class);

    protected Collection<BQRuntime> runtimes;

    @Override
    public void beforeEach(ExtensionContext extensionContext) {
        this.runtimes = new ArrayList<>();
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) {

        LOGGER.info("Stopping runtime...");
        Collection<BQRuntime> localRuntimes = this.runtimes;

        if (localRuntimes != null) {
            localRuntimes.forEach(runtime -> {
                try {
                    runtime.shutdown();
                } catch (Exception e) {
                    // ignore...
                }
            });
        }
    }

    public Builder app(String... args) {
        return new Builder(runtimes, args);
    }

    public static class Builder<T extends Builder<T>> {

        private Collection<BQRuntime> runtimes;
        private Bootique bootique;
        private Map<String, String> properties;
        private Map<String, String> variables;
        private Map<String, String> declaredVars;
        private Map<Class<?>, ValueObjectDescriptor> valueObjectsDescriptors;
        private Map<String, String> declaredDescriptions;


        protected Builder(Collection<BQRuntime> runtimes, String[] args) {
            this.runtimes = runtimes;
            this.properties = new HashMap<>();
            this.variables = new HashMap<>();
            this.declaredVars = new HashMap<>();
            this.valueObjectsDescriptors = new HashMap<>();
            this.declaredDescriptions = new HashMap<>();
            this.bootique = Bootique.app(args).moduleProvider(createPropertiesProvider()).moduleProvider(createVariablesProvider());
        }

        protected BQModuleProvider createPropertiesProvider() {
            return new BQModuleProvider() {

                @Override
                public BQModule module() {
                    return binder -> BQCoreModule.extend(binder).setProperties(properties);
                }

                @Override
                public BQModuleMetadata.Builder moduleBuilder() {
                    return BQModuleProvider.super
                            .moduleBuilder()
                            .name("BQInternalTestFactory:Builder:properties");
                }

                @Override
                public String name() {
                    return "BQInternalTestFactory:Builder:properties:provider";
                }
            };
        }

        protected BQModuleProvider createVariablesProvider() {
            return new BQModuleProvider() {

                @Override
                public BQModule module() {
                    return binder -> {
                        BQCoreModuleExtender extender = BQCoreModule.extend(binder).setVars(variables)
                                .addValueObjectsDescriptors(valueObjectsDescriptors);
                        declaredVars.forEach((p, n) -> extender.declareVar(p, n, declaredDescriptions.get(p)));
                    };
                }

                @Override
                public BQModuleMetadata.Builder moduleBuilder() {
                    return BQModuleProvider.super
                            .moduleBuilder()
                            .name("BQInternalTestFactory:Builder:variables");
                }

                @Override
                public String name() {
                    return "BQInternalTestFactory:Builder:variables:provider";
                }
            };
        }

        public T property(String key, String value) {
            properties.put(key, value);
            return (T) this;
        }

        public T var(String key, String value) {
            variables.put(key, value);
            return (T) this;
        }

        public T declareVar(String path, String var) {
            declaredVars.put(path, var);
            return (T) this;
        }

        public T addValueObjectsDescriptor(Class<?> type, ValueObjectDescriptor descriptor) {
            valueObjectsDescriptors.put(type, descriptor);
            return (T) this;
        }

        public T declareVar(String path, String var, String description) {
            declaredVars.put(path, var);
            declaredDescriptions.put(path, description);
            return (T) this;
        }


        public T args(String... args) {
            bootique.args(args);
            return (T) this;
        }

        public T args(Collection<String> args) {
            bootique.args(args);
            return (T) this;
        }

        public T autoLoadModules() {
            bootique.autoLoadModules();
            return (T) this;
        }

        public T module(Class<? extends BQModule> moduleType) {
            bootique.module(moduleType);
            return (T) this;
        }

        public T modules(Class<? extends BQModule>... moduleTypes) {
            bootique.modules(moduleTypes);
            return (T) this;
        }

        public T module(BQModule m) {
            bootique.module(m);
            return (T) this;
        }

        public T modules(BQModule... modules) {
            bootique.modules(modules);
            return (T) this;
        }

        public T moduleProvider(BQModuleProvider moduleProvider) {
            bootique.moduleProvider(moduleProvider);
            return (T) this;
        }

        public T bootLogger(BootLogger bootLogger) {
            bootique.bootLogger(bootLogger);
            return (T) this;
        }

        public BQModuleOverrideBuilder<T> override(Class<? extends BQModule>... overriddenTypes) {

            BQModuleOverrideBuilder<Bootique> subBuilder = bootique.override(overriddenTypes);
            return new BQModuleOverrideBuilder<T>() {

                @Override
                public T with(Class<? extends BQModule> moduleType) {
                    subBuilder.with(moduleType);
                    return (T) Builder.this;
                }

                @Override
                public T with(BQModule module) {
                    subBuilder.with(module);
                    return (T) Builder.this;
                }
            };
        }

        public BQRuntime createRuntime() {
            BQRuntime runtime = bootique.createRuntime();
            runtimes.add(runtime);
            return runtime;
        }
    }
}
