/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.platform.base.component.internal;

import org.gradle.platform.base.internal.ComponentSpecIdentifier;

// TODO - implements ComponentSpec
public class AbstractComponentSpec {
    private final ComponentSpecIdentifier identifier;
    private final String typeName;

    public AbstractComponentSpec(ComponentSpecIdentifier identifier, Class<?> publicType) {
        this.typeName = publicType.getSimpleName();
        this.identifier = identifier;
    }

    public ComponentSpecIdentifier getIdentifier() {
        return identifier;
    }

    public String getName() {
        return identifier.getName();
    }

    public String getProjectPath() {
        return identifier.getProjectPath();
    }

    protected String getTypeName() {
        return typeName;
    }

    public String getDisplayName() {
        return String.format("%s '%s'", getTypeName(), getName());
    }

    @Override
    public String toString() {
        return getDisplayName();
    }
}