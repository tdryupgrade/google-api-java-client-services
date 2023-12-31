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

package com.google.api.services.apigee.v1.model;

/**
 * Model definition for GoogleCloudApigeeV1TargetServerConfig.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1TargetServerConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether the target server is enabled. An empty/omitted value for this field should be
   * interpreted as true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Host name of the target server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * Target server revision name in the following format:
   * `organizations/{org}/environments/{env}/targetservers/{targetserver}/revisions/{rev}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Port number for the target server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * The protocol used by this target server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protocol;

  /**
   * TLS settings for the target server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1TlsInfoConfig tlsInfo;

  /**
   * Whether the target server is enabled. An empty/omitted value for this field should be
   * interpreted as true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whether the target server is enabled. An empty/omitted value for this field should be
   * interpreted as true.
   * @param enabled enabled or {@code null} for none
   */
  public GoogleCloudApigeeV1TargetServerConfig setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Host name of the target server.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Host name of the target server.
   * @param host host or {@code null} for none
   */
  public GoogleCloudApigeeV1TargetServerConfig setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * Target server revision name in the following format:
   * `organizations/{org}/environments/{env}/targetservers/{targetserver}/revisions/{rev}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Target server revision name in the following format:
   * `organizations/{org}/environments/{env}/targetservers/{targetserver}/revisions/{rev}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1TargetServerConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Port number for the target server.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Port number for the target server.
   * @param port port or {@code null} for none
   */
  public GoogleCloudApigeeV1TargetServerConfig setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * The protocol used by this target server.
   * @return value or {@code null} for none
   */
  public java.lang.String getProtocol() {
    return protocol;
  }

  /**
   * The protocol used by this target server.
   * @param protocol protocol or {@code null} for none
   */
  public GoogleCloudApigeeV1TargetServerConfig setProtocol(java.lang.String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * TLS settings for the target server.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1TlsInfoConfig getTlsInfo() {
    return tlsInfo;
  }

  /**
   * TLS settings for the target server.
   * @param tlsInfo tlsInfo or {@code null} for none
   */
  public GoogleCloudApigeeV1TargetServerConfig setTlsInfo(GoogleCloudApigeeV1TlsInfoConfig tlsInfo) {
    this.tlsInfo = tlsInfo;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1TargetServerConfig set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1TargetServerConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1TargetServerConfig clone() {
    return (GoogleCloudApigeeV1TargetServerConfig) super.clone();
  }

}
