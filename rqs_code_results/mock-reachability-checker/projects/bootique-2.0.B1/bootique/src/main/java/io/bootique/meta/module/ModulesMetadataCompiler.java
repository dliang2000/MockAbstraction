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

package io.bootique.meta.module;

import io.bootique.BQModuleMetadata;
import io.bootique.meta.config.ConfigMetadataCompiler;
import io.bootique.meta.config.ConfigMetadataNode;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * @since 0.21
 */
public class ModulesMetadataCompiler {

    private ConfigMetadataCompiler configCompiler;

    public ModulesMetadataCompiler(ConfigMetadataCompiler configCompiler) {
        this.configCompiler = configCompiler;
    }

    public ModulesMetadata compile(Collection<BQModuleMetadata> modules) {
        ModulesMetadata.Builder builder = ModulesMetadata.builder();
        modules.forEach(m -> builder.addModule(toModuleMetadata(m)));
        return builder.build();
    }

    private ModuleMetadata toModuleMetadata(BQModuleMetadata module) {
        return ModuleMetadata
                .builder(module.getName())
                .description(module.getDescription())
                .providerName(module.getProviderName())
                .addConfigs(toConfigs(module))
                .build();
    }

    private Collection<ConfigMetadataNode> toConfigs(BQModuleMetadata module) {

        Map<String, Type> configTypes = module.getConfigs();
        if (configTypes.isEmpty()) {
            return Collections.emptyList();
        }

        Collection<ConfigMetadataNode> configs = new ArrayList<>();

        configTypes.forEach((prefix, type) -> {
            configs.add(configCompiler.compile(prefix, type));
        });

        return configs;
    }
}
