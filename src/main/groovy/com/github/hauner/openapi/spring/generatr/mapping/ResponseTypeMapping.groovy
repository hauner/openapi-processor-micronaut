/*
 * Copyright 2019 the original authors
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

package com.github.hauner.openapi.spring.generatr.mapping

/**
 * Used with {@link EndpointTypeMapping} to configure the java type that represents the response
 * schema for a content type of the endpoint.
 *
 * @author Martin Hauner
 */
class ResponseTypeMapping {

    /**
     * The content type of this mapping. Must match 1:1 with what is written in the api.
     */
    String contentType

    /**
     * The OpenAPI schema type that should be mapped to the {@link #targetTypeName} java type.
     */
    @Deprecated // use mapping
    String sourceTypeName

    /**
     * The fully qualified java type name that will be used for {@link #sourceTypeName} in an
     * {@link #contentType} response.
     */
    @Deprecated // use mapping
    String targetTypeName

    /**
     * Type mapping valid only for responses with {@link #contentType}.
     */
    TypeMapping mapping

}