/*
 * Copyright 2019 https://github.com/hauner/openapi-generatr-spring
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.hauner.openapi.spring.model.datatypes

interface DataType {

    /**
     * todo remove
     *
     * The name of the type or property. if it not defined inline.
     *
     * @return the name of the type or property.
     */
    String getName()

    /**
     * The Java type name.
     *
     * @return the type name.
     */
    String getType()

    /**
     * Provides the list of import required for this type.
     *
     * @return the import list.
     */
    List<String> getImports()
}