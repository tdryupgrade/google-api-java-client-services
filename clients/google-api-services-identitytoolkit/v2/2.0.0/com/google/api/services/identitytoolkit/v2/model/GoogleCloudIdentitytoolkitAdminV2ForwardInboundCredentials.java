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

package com.google.api.services.identitytoolkit.v2.model;

/**
 * Indicates which credentials to pass to the registered Blocking Functions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity Toolkit API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials extends com.google.api.client.json.GenericJson {

  /**
   * Whether to pass the user's OAuth identity provider's access token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean accessToken;

  /**
   * Whether to pass the user's OIDC identity provider's ID token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean idToken;

  /**
   * Whether to pass the user's OAuth identity provider's refresh token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean refreshToken;

  /**
   * Whether to pass the user's OAuth identity provider's access token.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAccessToken() {
    return accessToken;
  }

  /**
   * Whether to pass the user's OAuth identity provider's access token.
   * @param accessToken accessToken or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials setAccessToken(java.lang.Boolean accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Whether to pass the user's OIDC identity provider's ID token.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIdToken() {
    return idToken;
  }

  /**
   * Whether to pass the user's OIDC identity provider's ID token.
   * @param idToken idToken or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials setIdToken(java.lang.Boolean idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * Whether to pass the user's OAuth identity provider's refresh token.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRefreshToken() {
    return refreshToken;
  }

  /**
   * Whether to pass the user's OAuth identity provider's refresh token.
   * @param refreshToken refreshToken or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials setRefreshToken(java.lang.Boolean refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  @Override
  public GoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials set(String fieldName, Object value) {
    return (GoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials clone() {
    return (GoogleCloudIdentitytoolkitAdminV2ForwardInboundCredentials) super.clone();
  }

}
