/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.table.types.inference.strategies;

import org.apache.flink.annotation.Internal;
import org.apache.flink.table.types.DataType;
import org.apache.flink.table.types.inference.CallContext;
import org.apache.flink.table.types.inference.TypeStrategy;

import java.util.Objects;
import java.util.Optional;

/** Type strategy that returns a fixed {@link DataType}. */
@Internal
public final class ExplicitTypeStrategy implements TypeStrategy {

    private final DataType explicitDataType;

    public ExplicitTypeStrategy(DataType explicitDataType) {
        this.explicitDataType = explicitDataType;
    }

    @Override
    public Optional<DataType> inferType(CallContext callContext) {
        return Optional.of(explicitDataType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExplicitTypeStrategy that = (ExplicitTypeStrategy) o;
        return explicitDataType.equals(that.explicitDataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(explicitDataType);
    }
}
