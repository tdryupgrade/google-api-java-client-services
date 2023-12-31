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

package com.google.api.services.beyondcorp.v1alpha.model;

/**
 * A BeyondCorp Connection resource represents a BeyondCorp protected connection to a remote
 * application. It creates all the necessary GCP components needed for creating a BeyondCorp
 * protected connection. Multiple connectors can be authorised for a single Connection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BeyondCorp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Connection extends com.google.api.client.json.GenericJson {

  /**
   * Required. Address of the remote application endpoint for the BeyondCorp Connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApplicationEndpoint applicationEndpoint;

  /**
   * Optional. List of [google.cloud.beyondcorp.v1main.Connector.name] that are authorised to be
   * associated with this Connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> connectors;

  /**
   * Output only. Timestamp when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. An arbitrary user-provided name for the connection. Cannot exceed 64 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Gateway used by the connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Gateway gateway;

  /**
   * Optional. Resource labels to represent user provided metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. Unique resource name of the connection. The name is ignored when creating a
   * connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The current state of the connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. The type of network connectivity used by the connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. A unique identifier for the instance generated by the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. Timestamp when the resource was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Required. Address of the remote application endpoint for the BeyondCorp Connection.
   * @return value or {@code null} for none
   */
  public ApplicationEndpoint getApplicationEndpoint() {
    return applicationEndpoint;
  }

  /**
   * Required. Address of the remote application endpoint for the BeyondCorp Connection.
   * @param applicationEndpoint applicationEndpoint or {@code null} for none
   */
  public Connection setApplicationEndpoint(ApplicationEndpoint applicationEndpoint) {
    this.applicationEndpoint = applicationEndpoint;
    return this;
  }

  /**
   * Optional. List of [google.cloud.beyondcorp.v1main.Connector.name] that are authorised to be
   * associated with this Connection.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getConnectors() {
    return connectors;
  }

  /**
   * Optional. List of [google.cloud.beyondcorp.v1main.Connector.name] that are authorised to be
   * associated with this Connection.
   * @param connectors connectors or {@code null} for none
   */
  public Connection setConnectors(java.util.List<java.lang.String> connectors) {
    this.connectors = connectors;
    return this;
  }

  /**
   * Output only. Timestamp when the resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when the resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public Connection setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. An arbitrary user-provided name for the connection. Cannot exceed 64 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. An arbitrary user-provided name for the connection. Cannot exceed 64 characters.
   * @param displayName displayName or {@code null} for none
   */
  public Connection setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Gateway used by the connection.
   * @return value or {@code null} for none
   */
  public Gateway getGateway() {
    return gateway;
  }

  /**
   * Optional. Gateway used by the connection.
   * @param gateway gateway or {@code null} for none
   */
  public Connection setGateway(Gateway gateway) {
    this.gateway = gateway;
    return this;
  }

  /**
   * Optional. Resource labels to represent user provided metadata.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Resource labels to represent user provided metadata.
   * @param labels labels or {@code null} for none
   */
  public Connection setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. Unique resource name of the connection. The name is ignored when creating a
   * connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Unique resource name of the connection. The name is ignored when creating a
   * connection.
   * @param name name or {@code null} for none
   */
  public Connection setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The current state of the connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the connection.
   * @param state state or {@code null} for none
   */
  public Connection setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Required. The type of network connectivity used by the connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The type of network connectivity used by the connection.
   * @param type type or {@code null} for none
   */
  public Connection setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Output only. A unique identifier for the instance generated by the system.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. A unique identifier for the instance generated by the system.
   * @param uid uid or {@code null} for none
   */
  public Connection setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. Timestamp when the resource was last modified.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when the resource was last modified.
   * @param updateTime updateTime or {@code null} for none
   */
  public Connection setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Connection set(String fieldName, Object value) {
    return (Connection) super.set(fieldName, value);
  }

  @Override
  public Connection clone() {
    return (Connection) super.clone();
  }

}
