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

import io.bootique.BQCoreModule;
import io.bootique.BQRuntime;
import io.bootique.cli.Cli;
import io.bootique.di.BQModule;
import io.bootique.di.Binder;
import io.bootique.di.Provides;
import io.bootique.help.HelpCommand;
import io.bootique.meta.application.CommandMetadata;
import io.bootique.unit.BQInternalTestFactory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import javax.inject.Singleton;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CommandManagerIT {

    @RegisterExtension
    public BQInternalTestFactory runtimeFactory = new BQInternalTestFactory();

    @Test
    public void testHelpAndModuleCommands() {
        BQRuntime runtime = runtimeFactory.app().modules(M0.class, M1.class).createRuntime();

        CommandManager commandManager = runtime.getInstance(CommandManager.class);
        assertEquals(4, commandManager.getAllCommands().size(), "help, helpconfig and module commands must be present");

        assertSame(M0.mockCommand, commandManager.lookupByName("m0command").getCommand());
        assertSame(M1.mockCommand, commandManager.lookupByName("m1command").getCommand());

        assertFalse(commandManager.getPublicDefaultCommand().isPresent());
        assertSame(runtime.getInstance(HelpCommand.class), commandManager.getPublicHelpCommand().get());
    }

    @Test
    public void testDefaultAndHelpAndModuleCommands() {

        Command defaultCommand = cli -> CommandOutcome.succeeded();
        BQModule defaultCommandModule = binder -> BQCoreModule.extend(binder).setDefaultCommand(defaultCommand);

        BQRuntime runtime = runtimeFactory.app().modules(M0.class, M1.class).module(defaultCommandModule).createRuntime();

        CommandManager commandManager = runtime.getInstance(CommandManager.class);

        assertEquals(5, commandManager.getAllCommands().size());
        assertSame(M0.mockCommand, commandManager.lookupByName("m0command").getCommand());
        assertSame(M1.mockCommand, commandManager.lookupByName("m1command").getCommand());
        assertSame(defaultCommand, commandManager.getPublicDefaultCommand().get());
        assertSame(runtime.getInstance(HelpCommand.class), commandManager.getPublicHelpCommand().get());
    }

    @Test
    public void testHiddenCommands() {

        Command hiddenCommand = new Command() {
            @Override
            public CommandOutcome run(Cli cli) {
                return CommandOutcome.succeeded();
            }

            @Override
            public CommandMetadata getMetadata() {
                return CommandMetadata.builder("xyz").hidden().build();
            }
        };

        BQRuntime runtime = runtimeFactory.app()
                .module(binder -> BQCoreModule.extend(binder).addCommand(hiddenCommand))
                .createRuntime();

        CommandManager commandManager = runtime.getInstance(CommandManager.class);

        assertEquals(3, commandManager.getAllCommands().size());

        ManagedCommand hiddenManaged = commandManager.getAllCommands().get("xyz");
        assertSame(hiddenCommand, hiddenManaged.getCommand());
        assertTrue(hiddenManaged.isHidden());
    }

    @Test
    public void testDefaultCommandWithMetadata() {

        Command defaultCommand = new Command() {
            @Override
            public CommandOutcome run(Cli cli) {
                return CommandOutcome.succeeded();
            }

            @Override
            public CommandMetadata getMetadata() {
                // note how this name intentionally matches one of the existing commands
                return CommandMetadata.builder("m0command").build();
            }
        };

        BQModule defaultCommandModule = binder -> BQCoreModule.extend(binder).setDefaultCommand(defaultCommand);

        BQRuntime runtime = runtimeFactory.app()
                .modules(M0.class, M1.class)
                .module(defaultCommandModule)
                .createRuntime();

        CommandManager commandManager = runtime.getInstance(CommandManager.class);

        // the main assertion we care about...
        assertSame(defaultCommand,
                commandManager.lookupByName("m0command").getCommand(),
                "Default command did not override another command with same name");

        // sanity check
        assertEquals(4, commandManager.getAllCommands().size());
        assertSame(M1.mockCommand, commandManager.lookupByName("m1command").getCommand());
        assertSame(runtime.getInstance(HelpCommand.class), commandManager.lookupByName("help").getCommand());
        assertSame(defaultCommand, commandManager.getPublicDefaultCommand().get());
    }

    @Test
    public void testDefaultCommandViaProvidesMethod() {

        BQRuntime runtime = runtimeFactory.app()
                .modules(M2.class)
                .createRuntime();

        CommandOutcome o = runtime.run();
        assertFalse(o.isSuccess());
        assertEquals("m2-command-label", o.getMessage());
    }

    public static class M0 implements BQModule {

        static final Command mockCommand;

        static {
            mockCommand = mock(Command.class);
            when(mockCommand.getMetadata()).thenReturn(CommandMetadata.builder("m0command").build());
        }

        @Override
        public void configure(Binder binder) {
            BQCoreModule.extend(binder).addCommand(mockCommand);
        }
    }

    public static class M1 implements BQModule {

        static final Command mockCommand;

        static {
            mockCommand = mock(Command.class);
            when(mockCommand.getMetadata()).thenReturn(CommandMetadata.builder("m1command").build());
        }

        @Override
        public void configure(Binder binder) {
            BQCoreModule.extend(binder).addCommand(mockCommand);
        }
    }

    public static class M2 implements BQModule {

        @Override
        public void configure(Binder binder) {
            BQCoreModule.extend(binder).setDefaultCommand(DefaultCommand2.class);
        }

        @Provides
        @Singleton
        DefaultCommand2 provideDefaultCommand2() {
            return new DefaultCommand2("m2-command-label");
        }
    }

    public static class DefaultCommand2 extends CommandWithMetadata {

        private String message;

        // intentionally using non-default constructor, to ensure DI can't instantiate it without a @Provides method
        public DefaultCommand2(String message) {
            super(CommandMetadata.builder(DefaultCommand2.class).build());
            this.message = message;
        }

        @Override
        public CommandOutcome run(Cli cli) {
            return CommandOutcome.failed(-1, message);
        }
    }
}
