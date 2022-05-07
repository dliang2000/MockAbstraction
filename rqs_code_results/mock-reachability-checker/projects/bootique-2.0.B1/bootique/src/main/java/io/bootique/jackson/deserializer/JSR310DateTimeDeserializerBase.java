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

package io.bootique.jackson.deserializer;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

abstract class JSR310DateTimeDeserializerBase<T> extends JSR310DeserializerBase<T> implements ContextualDeserializer {

    protected final DateTimeFormatter _formatter;

    protected JSR310DateTimeDeserializerBase(Class<T> supportedType, DateTimeFormatter f) {
        super(supportedType);
        _formatter = f;
    }

    protected abstract JsonDeserializer<T> withDateFormat(DateTimeFormatter dtf);

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext ctxt,
                                                BeanProperty property) throws JsonMappingException {
        if (property != null) {
            JsonFormat.Value format = ctxt.getAnnotationIntrospector().findFormat((Annotated) property.getMember());
            if (format != null) {
                if (format.hasPattern()) {
                    final String pattern = format.getPattern();
                    final Locale locale = format.hasLocale() ? format.getLocale() : ctxt.getLocale();
                    DateTimeFormatter df;
                    if (locale == null) {
                        df = DateTimeFormatter.ofPattern(pattern);
                    } else {
                        df = DateTimeFormatter.ofPattern(pattern, locale);
                    }
                    return withDateFormat(df);
                }
                // any use for TimeZone?
            }
        }
        return this;
    }
}
