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

package io.bootique.help.config;

import io.bootique.help.ConsoleAppender;
import io.bootique.meta.config.ConfigValueMetadata;

import java.lang.reflect.Type;
import java.util.Objects;
import java.util.Set;

public class ConfigSectionMapGenerator extends ConfigSectionGenerator {

    private Class<?> keysType;

    public ConfigSectionMapGenerator(Class<?> keysType, ConsoleAppender out, Set<Type> seenMetadataTypes) {
        super(out, seenMetadataTypes);
        this.keysType = Objects.requireNonNull(keysType);
    }

    @Override
    protected void printNode(ConfigValueMetadata metadata, boolean asValue) {

        if (asValue) {
            out.println(metadata.getSampleValue(keysType), ": ", metadata.getValueLabel());
        } else {
            out.println(metadata.getSampleValue(keysType), ":");
        }
    }
}
