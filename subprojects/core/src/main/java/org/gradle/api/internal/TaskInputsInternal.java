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

package org.gradle.api.internal;

import org.gradle.api.file.FileCollection;
import org.gradle.api.internal.file.FileResolver;
import org.gradle.api.tasks.FileContentsMode;
import org.gradle.api.tasks.FileOrderMode;
import org.gradle.api.tasks.FilePathMode;
import org.gradle.api.tasks.TaskInputs;

import java.util.Map;

public interface TaskInputsInternal extends TaskInputs {
    Map<String, TaskPropertyInputFiles> getPropertyFiles();

    interface TaskPropertyInputFiles {
        FileOrderMode getOrderMode();

        FilePathMode getPathMode();

        FileContentsMode getContentsMode();

        boolean isSkipWhenEmpty();

        FileCollection resolve(FileResolver resolver);
    }
}