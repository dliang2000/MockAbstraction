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

package io.bootique.help;

import io.bootique.meta.application.ApplicationMetadata;
import io.bootique.meta.config.ConfigValueMetadata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Default {@link HelpGenerator} implementation.
 */
public class DefaultHelpGenerator implements HelpGenerator {

    private ApplicationMetadata application;
    private int lineWidth;

    public DefaultHelpGenerator(ApplicationMetadata application, int lineWidth) {
        this.application = application;
        this.lineWidth = lineWidth;
    }

    protected HelpAppender createAppender(Appendable out) {
        return new HelpAppender(createConsoleAppender(out));
    }

    protected ConsoleAppender createConsoleAppender(Appendable out) {
        return new ConsoleAppender(out, lineWidth);
    }


    @Override
    public void append(Appendable out) {

        HelpAppender appender = createAppender(out);

        printName(appender, application.getName(), application.getDescription());
        printOptions(appender, collectOptions());
        printEnvironment(appender, application.getVariables());
    }

    protected Collection<HelpOption> collectOptions() {

        HelpOptions helpOptions = new HelpOptions();

        application.getCommands().forEach(c -> {

            // for now expose commands as simply options (commands are options in a default CLI parser)
            helpOptions.add(c.asOption());
            c.getOptions().forEach(o -> helpOptions.add(o));
        });

        application.getOptions().forEach(o -> helpOptions.add(o));
        return helpOptions.getOptions();
    }

    protected void printName(HelpAppender out, String name, String description) {

        out.printSectionName("NAME");

        Objects.requireNonNull(name);

        out.printText(name);
        if(description != null) {
            out.printDescription(description);
        }
    }

    protected void printEnvironment(HelpAppender out, Collection<ConfigValueMetadata> variables) {
        if (variables.isEmpty()) {
            return;
        }

        out.printSectionName("ENVIRONMENT");
        variables.stream().sorted(Comparator.comparing(ConfigValueMetadata::getName)).forEach(v -> {
            out.printSubsectionHeader(v.getName());
            String description = v.getDescription();
            if (description != null) {
                out.printDescription(description);
            }
        });
    }

    protected void printOptions(HelpAppender out, Collection<HelpOption> options) {

        if (options.isEmpty()) {
            return;
        }

        out.printSectionName("OPTIONS");
        options.forEach(o -> {

            String valueName = o.getOption().getValueName();
            if (valueName == null || valueName.length() == 0) {
                valueName = "val";
            }

            List<String> parts = new ArrayList<>();
            if (o.isShortNameAllowed()) {
                parts.add("-");
                parts.add(String.valueOf(o.getOption().getShortName()));

                switch (o.getOption().getValueCardinality()) {
                    case REQUIRED:
                        parts.add(" ");
                        parts.add(valueName);
                        break;
                    case OPTIONAL:
                        parts.add(" [");
                        parts.add(valueName);
                        parts.add("]");
                        break;
                }
            }

            if (o.isLongNameAllowed()) {

                if (!parts.isEmpty()) {
                    parts.add(", ");
                }

                parts.add("--");
                parts.add(o.getOption().getName());
                switch (o.getOption().getValueCardinality()) {
                    case REQUIRED:
                        parts.add("=");
                        parts.add(valueName);
                        break;
                    case OPTIONAL:
                        parts.add("[=");
                        parts.add(valueName);
                        parts.add("]");
                        break;
                }
            }

            out.printSubsectionHeader(parts);

            String description = o.getOption().getDescription();
            if (description != null) {
                out.printDescription(description);
            }
        });
    }
}
