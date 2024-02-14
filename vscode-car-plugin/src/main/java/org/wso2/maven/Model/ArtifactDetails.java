/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.maven.Model;

/**
 * Class that represents the artifact dependencies included in artifacts.xml
 */
public class ArtifactDetails {
    private final String directory;
    private final String type;
    private final String serverRole;
    public ArtifactDetails(String directory, String type, String serverRole) {
        this.directory = directory;
        this.type = type;
        this.serverRole = serverRole;
    }
    public String getDirectory() {
        return directory;
    }
    public String getType() {
        return type;
    }
    public String getServerRole() {
        return serverRole;
    }
}
