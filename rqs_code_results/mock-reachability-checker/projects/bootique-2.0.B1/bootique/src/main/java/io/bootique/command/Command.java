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

import io.bootique.meta.application.CommandMetadata;
import io.bootique.cli.Cli;

@FunctionalInterface
public interface Command {

	/**
	 * Executes a command.
	 * 
	 * @param cli
	 *            command-line options object.
	 * @return CommandOutcome object that indicates to the caller whether
	 *         command was successful and whether the caller needs to continue
	 *         with command chain.
	 * @since 0.12
	 */
	CommandOutcome run(Cli cli);

	/**
	 * Returns a metadata object for this command. Default implementation
	 * generates barebone metadata based on class name.
	 * 
	 * @return metadata object describing current command.
	 * @since 0.12
	 */
	default CommandMetadata getMetadata() {
		return CommandMetadata.builder(getClass()).build();
	}
}
