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

package com.google.api.services.connectors.v1.model;

/**
 * represents the Connector's Managed Zone resource
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManagedZone extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Created time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Description of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. DNS Name of the resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dns;

  /**
   * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on
   * labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Resource name of the Managed Zone. Format:
   * projects/{project}/locations/global/managedZones/{managed_zone}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The name of the Target Project
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetProject;

  /**
   * Required. The name of the Target Project VPC Network
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetVpc;

  /**
   * Output only. Updated time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Created time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Created time.
   * @param createTime createTime or {@code null} for none
   */
  public ManagedZone setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Description of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of the resource.
   * @param description description or {@code null} for none
   */
  public ManagedZone setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. DNS Name of the resource
   * @return value or {@code null} for none
   */
  public java.lang.String getDns() {
    return dns;
  }

  /**
   * Required. DNS Name of the resource
   * @param dns dns or {@code null} for none
   */
  public ManagedZone setDns(java.lang.String dns) {
    this.dns = dns;
    return this;
  }

  /**
   * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on
   * labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on
   * labels for more details. https://cloud.google.com/compute/docs/labeling-resources
   * @param labels labels or {@code null} for none
   */
  public ManagedZone setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Resource name of the Managed Zone. Format:
   * projects/{project}/locations/global/managedZones/{managed_zone}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the Managed Zone. Format:
   * projects/{project}/locations/global/managedZones/{managed_zone}
   * @param name name or {@code null} for none
   */
  public ManagedZone setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The name of the Target Project
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetProject() {
    return targetProject;
  }

  /**
   * Required. The name of the Target Project
   * @param targetProject targetProject or {@code null} for none
   */
  public ManagedZone setTargetProject(java.lang.String targetProject) {
    this.targetProject = targetProject;
    return this;
  }

  /**
   * Required. The name of the Target Project VPC Network
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetVpc() {
    return targetVpc;
  }

  /**
   * Required. The name of the Target Project VPC Network
   * @param targetVpc targetVpc or {@code null} for none
   */
  public ManagedZone setTargetVpc(java.lang.String targetVpc) {
    this.targetVpc = targetVpc;
    return this;
  }

  /**
   * Output only. Updated time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Updated time.
   * @param updateTime updateTime or {@code null} for none
   */
  public ManagedZone setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public ManagedZone set(String fieldName, Object value) {
    return (ManagedZone) super.set(fieldName, value);
  }

  @Override
  public ManagedZone clone() {
    return (ManagedZone) super.clone();
  }

}
