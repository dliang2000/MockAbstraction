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

package io.bootique.command;

import io.bootique.log.BootLogger;

import java.util.Collection;
import java.util.Map;

/**
 * @since 0.25
 */
public class CommandManagerWithOverridesBuilder extends CommandManagerBuilder<CommandManagerWithOverridesBuilder> {

    private Collection<Command> commandOverrides;
    private boolean hideBaseCommands;
    private BootLogger bootLogger;

    public CommandManagerWithOverridesBuilder(Collection<Command> commands, BootLogger bootLogger) {
        super(commands);
        this.bootLogger = bootLogger;
    }

    public CommandManagerWithOverridesBuilder overrideWith(Collection<Command> commands) {
        this.commandOverrides = commands;
        return this;
    }

    public CommandManagerWithOverridesBuilder hideBaseCommands(boolean flag) {
        this.hideBaseCommands = flag;
        return this;
    }

    @Override
    protected Map<String, ManagedCommand> buildCommandMap() {
        Map<String, ManagedCommand> commandMap = super.buildCommandMap();
        mergeOverrides(commandMap);
        return commandMap;
    }

    protected void mergeOverrides(Map<String, ManagedCommand> commandMap) {

        if (commandOverrides != null) {
            commandOverrides.forEach(co -> {

                ManagedCommand.Builder builder = ManagedCommand.builder(co);

                // check existing command prior to overriding... preserve existing "help" and "default" flags
                ManagedCommand existing = commandMap.get(co.getMetadata().getName());

                if (existing != null) {

                    // preserve existing flags...
                    if (existing.isHelp()) {
                        builder.asHelp();
                    }

                    if (existing.isDefault()) {
                        builder.asDefault();
                    }

                    // log override
                    String i1 = existing.getCommand().getClass().getName();
                    String i2 = co.getClass().getName();
                    bootLogger.trace(() -> String.format("Overriding command '%s' (old command: %s, new command: %s)",
                            co.getMetadata().getName(), i1, i2));
                }

                addCommand(commandMap, builder.build());
            });
        }
    }

    @Override
    protected void loadHelpCommand(Map<String, ManagedCommand> commandMap) {
        if (hideBaseCommands) {
            ManagedCommand mc = ManagedCommand.builder(helpCommand)
                    .asHidden()
                    .asHelp()
                    .build();
            addCommandNoOverride(commandMap, mc);
        } else {
            super.loadHelpCommand(commandMap);
        }
    }

    @Override
    protected void loadCommands(Map<String, ManagedCommand> commandMap) {
        if (hideBaseCommands) {
            loadBaseCommandsAsPrivate(commandMap);
        } else {
            loadBaseCommandsAsPublic(commandMap);
        }
    }

    protected void loadBaseCommandsAsPublic(Map<String, ManagedCommand> commandMap) {
        commands.forEach(c -> addCommandNoOverride(commandMap, c));
    }

    protected void loadBaseCommandsAsPrivate(Map<String, ManagedCommand> commandMap) {
        commands.forEach(c -> {
            ManagedCommand mc = ManagedCommand.builder(c).asHidden().build();
            addCommandNoOverride(commandMap, mc);
        });
    }
}