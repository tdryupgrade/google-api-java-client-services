/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.gkehub.v1beta.model;

/**
 * ResourceRequirements allows to override the CPU and memory resource requirements of a container.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementContainerResourceRequirements extends com.google.api.client.json.GenericJson {

  /**
   * Name of the container
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerName;

  /**
   * Allows to override the CPU limit of a container
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementQuantity cpuLimit;

  /**
   * Allows to override the memory limit of a container
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigManagementQuantity memoryLimit;

  /**
   * Name of the container
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerName() {
    return containerName;
  }

  /**
   * Name of the container
   * @param containerName containerName or {@code null} for none
   */
  public ConfigManagementContainerResourceRequirements setContainerName(java.lang.String containerName) {
    this.containerName = containerName;
    return this;
  }

  /**
   * Allows to override the CPU limit of a container
   * @return value or {@code null} for none
   */
  public ConfigManagementQuantity getCpuLimit() {
    return cpuLimit;
  }

  /**
   * Allows to override the CPU limit of a container
   * @param cpuLimit cpuLimit or {@code null} for none
   */
  public ConfigManagementContainerResourceRequirements setCpuLimit(ConfigManagementQuantity cpuLimit) {
    this.cpuLimit = cpuLimit;
    return this;
  }

  /**
   * Allows to override the memory limit of a container
   * @return value or {@code null} for none
   */
  public ConfigManagementQuantity getMemoryLimit() {
    return memoryLimit;
  }

  /**
   * Allows to override the memory limit of a container
   * @param memoryLimit memoryLimit or {@code null} for none
   */
  public ConfigManagementContainerResourceRequirements setMemoryLimit(ConfigManagementQuantity memoryLimit) {
    this.memoryLimit = memoryLimit;
    return this;
  }

  @Override
  public ConfigManagementContainerResourceRequirements set(String fieldName, Object value) {
    return (ConfigManagementContainerResourceRequirements) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementContainerResourceRequirements clone() {
    return (ConfigManagementContainerResourceRequirements) super.clone();
  }

}
