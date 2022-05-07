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
import io.bootique.cli.Cli;
import io.bootique.command.Command;
import io.bootique.command.CommandOutcome;
import io.bootique.di.Injector;
import io.bootique.di.Key;
import io.bootique.it.ItestModuleProvider;
import io.bootique.meta.application.CommandMetadata;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

public class BootiqueIT {

    private String[] args = new String[]{"a", "b", "c"};

    @Test
    public void testExec() {
        CommandOutcome outcome = Bootique.app(args).exec();
        assertTrue(outcome.isSuccess());
    }

    @Test
    public void testExec_Failure() {
        CommandOutcome outcome = Bootique.app("-a").module(b ->
                BQCoreModule.extend(b).addCommand(new Command() {
                    @Override
                    public CommandOutcome run(Cli cli) {
                        return CommandOutcome.failed(-1, "it failed");
                    }

                    @Override
                    public CommandMetadata getMetadata() {
                        return CommandMetadata.builder("acommand").build();
                    }
                })
        ).exec();

        assertFalse(outcome.isSuccess());
        assertEquals(-1, outcome.getExitCode());
        assertEquals("it failed", outcome.getMessage());
    }

    @Test
    public void testExec_Exception() {
        CommandOutcome outcome = Bootique.app("-a").module(b ->
                BQCoreModule.extend(b).addCommand(new Command() {
                    @Override
                    public CommandOutcome run(Cli cli) {
                        throw new RuntimeException("test exception");
                    }

                    @Override
                    public CommandMetadata getMetadata() {
                        return CommandMetadata.builder("acommand").build();
                    }
                })
        ).exec();

        assertFalse(outcome.isSuccess());
        assertEquals(1, outcome.getExitCode());
        assertNotNull(outcome.getException());
        assertEquals("test exception", outcome.getException().getMessage());
    }

    @Test
    public void testAutoLoadedProviders() {
        Collection<BQModuleProvider> autoLoaded = Bootique.app(args).autoLoadedProviders();

        assertEquals(1, autoLoaded.size());
        autoLoaded.forEach(m -> assertTrue(m instanceof ItestModuleProvider));
    }

    @Test
    public void testCreateInjector() {
        Injector i = Bootique.app(args).createInjector();

        String[] args = i.getInstance(Key.get(String[].class, Args.class));
        assertSame(this.args, args);
    }

    @Test
    public void testApp_Collection() {
        Injector i = Bootique.app(asList(args)).createInjector();

        String[] args = i.getInstance(Key.get(String[].class, Args.class));
        assertArrayEquals(this.args, args);
    }
}
