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

package com.google.api.services.storagetransfer.v1.model;

/**
 * S3CompatibleMetadata contains the metadata fields that apply to the basic types of S3-compatible
 * data providers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class S3CompatibleMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Specifies the authentication and authorization method used by the storage service. When not
   * specified, Transfer Service will attempt to determine right auth method to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authMethod;

  /**
   * The Listing API to use for discovering objects. When not specified, Transfer Service will
   * attempt to determine the right API to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String listApi;

  /**
   * Specifies the network protocol of the agent. When not specified, the default value of
   * NetworkProtocol NETWORK_PROTOCOL_HTTPS is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protocol;

  /**
   * Specifies the API request model used to call the storage service. When not specified, the
   * default value of RequestModel REQUEST_MODEL_VIRTUAL_HOSTED_STYLE is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestModel;

  /**
   * Specifies the authentication and authorization method used by the storage service. When not
   * specified, Transfer Service will attempt to determine right auth method to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthMethod() {
    return authMethod;
  }

  /**
   * Specifies the authentication and authorization method used by the storage service. When not
   * specified, Transfer Service will attempt to determine right auth method to use.
   * @param authMethod authMethod or {@code null} for none
   */
  public S3CompatibleMetadata setAuthMethod(java.lang.String authMethod) {
    this.authMethod = authMethod;
    return this;
  }

  /**
   * The Listing API to use for discovering objects. When not specified, Transfer Service will
   * attempt to determine the right API to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getListApi() {
    return listApi;
  }

  /**
   * The Listing API to use for discovering objects. When not specified, Transfer Service will
   * attempt to determine the right API to use.
   * @param listApi listApi or {@code null} for none
   */
  public S3CompatibleMetadata setListApi(java.lang.String listApi) {
    this.listApi = listApi;
    return this;
  }

  /**
   * Specifies the network protocol of the agent. When not specified, the default value of
   * NetworkProtocol NETWORK_PROTOCOL_HTTPS is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getProtocol() {
    return protocol;
  }

  /**
   * Specifies the network protocol of the agent. When not specified, the default value of
   * NetworkProtocol NETWORK_PROTOCOL_HTTPS is used.
   * @param protocol protocol or {@code null} for none
   */
  public S3CompatibleMetadata setProtocol(java.lang.String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Specifies the API request model used to call the storage service. When not specified, the
   * default value of RequestModel REQUEST_MODEL_VIRTUAL_HOSTED_STYLE is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestModel() {
    return requestModel;
  }

  /**
   * Specifies the API request model used to call the storage service. When not specified, the
   * default value of RequestModel REQUEST_MODEL_VIRTUAL_HOSTED_STYLE is used.
   * @param requestModel requestModel or {@code null} for none
   */
  public S3CompatibleMetadata setRequestModel(java.lang.String requestModel) {
    this.requestModel = requestModel;
    return this;
  }

  @Override
  public S3CompatibleMetadata set(String fieldName, Object value) {
    return (S3CompatibleMetadata) super.set(fieldName, value);
  }

  @Override
  public S3CompatibleMetadata clone() {
    return (S3CompatibleMetadata) super.clone();
  }

}
