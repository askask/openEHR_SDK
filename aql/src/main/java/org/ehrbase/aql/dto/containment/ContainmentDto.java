/*
 * Copyright (c) 2023 vitasystems GmbH and Hannover Medical School.
 *
 * This file is part of project openEHR_SDK
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ehrbase.aql.dto.containment;
/**
 * @author Stefan Spiska
 */
public abstract class ContainmentDto implements ContainmentExpresionDto {

    private ContainmentExpresionDto contains;
    private int id;
    private String identifier;

    public int getId() {
        return this.id;
    }

    public void setContains(ContainmentExpresionDto contains) {
        this.contains = contains;
    }

    public ContainmentExpresionDto getContains() {
        return this.contains;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
