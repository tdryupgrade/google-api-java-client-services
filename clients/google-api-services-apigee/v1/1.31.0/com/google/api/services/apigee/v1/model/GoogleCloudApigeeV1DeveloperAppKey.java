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
 * Model definition for GoogleCloudApigeeV1DeveloperAppKey.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1DeveloperAppKey extends com.google.api.client.json.GenericJson {

  /**
   * List of API products for which the credential can be used. **Note**: Do not specify the list of
   * API products when creating a consumer key and secret for a developer app. Instead, use the
   * UpdateDeveloperAppKey API to make the association after the consumer key and secret are
   * created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Object> apiProducts;

  /**
   * List of attributes associated with the credential.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1Attribute> attributes;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1Attribute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1Attribute.class);
  }

  /**
   * Consumer key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerKey;

  /**
   * Secret key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerSecret;

  /**
   * Time the developer app expires in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expiresAt;

  /**
   * Input only. Expiration time, in seconds, for the consumer key. If not set or left to the
   * default value of `-1`, the API key never expires. The expiration time can't be updated after it
   * is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expiresInSeconds;

  /**
   * Time the developer app was created in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long issuedAt;

  /**
   * Scopes to apply to the app. The specified scope names must already be defined for the API
   * product that you associate with the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> scopes;

  /**
   * Status of the credential. Valid values include `approved` or `revoked`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * List of API products for which the credential can be used. **Note**: Do not specify the list of
   * API products when creating a consumer key and secret for a developer app. Instead, use the
   * UpdateDeveloperAppKey API to make the association after the consumer key and secret are
   * created.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Object> getApiProducts() {
    return apiProducts;
  }

  /**
   * List of API products for which the credential can be used. **Note**: Do not specify the list of
   * API products when creating a consumer key and secret for a developer app. Instead, use the
   * UpdateDeveloperAppKey API to make the association after the consumer key and secret are
   * created.
   * @param apiProducts apiProducts or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperAppKey setApiProducts(java.util.List<java.lang.Object> apiProducts) {
    this.apiProducts = apiProducts;
    return this;
  }

  /**
   * List of attributes associated with the credential.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1Attribute> getAttributes() {
    return attributes;
  }

  /**
   * List of attributes associated with the credential.
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperAppKey setAttributes(java.util.List<GoogleCloudApigeeV1Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Consumer key.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerKey() {
    return consumerKey;
  }

  /**
   * Consumer key.
   * @param consumerKey consumerKey or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperAppKey setConsumerKey(java.lang.String consumerKey) {
    this.consumerKey = consumerKey;
    return this;
  }

  /**
   * Secret key.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerSecret() {
    return consumerSecret;
  }

  /**
   * Secret key.
   * @param consumerSecret consumerSecret or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperAppKey setConsumerSecret(java.lang.String consumerSecret) {
    this.consumerSecret = consumerSecret;
    return this;
  }

  /**
   * Time the developer app expires in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpiresAt() {
    return expiresAt;
  }

  /**
   * Time the developer app expires in milliseconds since epoch.
   * @param expiresAt expiresAt or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperAppKey setExpiresAt(java.lang.Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Input only. Expiration time, in seconds, for the consumer key. If not set or left to the
   * default value of `-1`, the API key never expires. The expiration time can't be updated after it
   * is set.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpiresInSeconds() {
    return expiresInSeconds;
  }

  /**
   * Input only. Expiration time, in seconds, for the consumer key. If not set or left to the
   * default value of `-1`, the API key never expires. The expiration time can't be updated after it
   * is set.
   * @param expiresInSeconds expiresInSeconds or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperAppKey setExpiresInSeconds(java.lang.Long expiresInSeconds) {
    this.expiresInSeconds = expiresInSeconds;
    return this;
  }

  /**
   * Time the developer app was created in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getIssuedAt() {
    return issuedAt;
  }

  /**
   * Time the developer app was created in milliseconds since epoch.
   * @param issuedAt issuedAt or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperAppKey setIssuedAt(java.lang.Long issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Scopes to apply to the app. The specified scope names must already be defined for the API
   * product that you associate with the app.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getScopes() {
    return scopes;
  }

  /**
   * Scopes to apply to the app. The specified scope names must already be defined for the API
   * product that you associate with the app.
   * @param scopes scopes or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperAppKey setScopes(java.util.List<java.lang.String> scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * Status of the credential. Valid values include `approved` or `revoked`.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the credential. Valid values include `approved` or `revoked`.
   * @param status status or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperAppKey setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1DeveloperAppKey set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1DeveloperAppKey) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1DeveloperAppKey clone() {
    return (GoogleCloudApigeeV1DeveloperAppKey) super.clone();
  }

}
