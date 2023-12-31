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

package com.google.api.services.identitytoolkit.v1.model;

/**
 * Response message for SignInWithCustomToken.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity Toolkit API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIdentitytoolkitV1SignInWithCustomTokenResponse extends com.google.api.client.json.GenericJson {

  /**
   * The number of seconds until the ID token expires.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expiresIn;

  /**
   * An Identity Platform ID token for the authenticated user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String idToken;

  /**
   * Whether the authenticated user was created by this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isNewUser;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * An Identity Platform refresh token for the authenticated user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String refreshToken;

  /**
   * The number of seconds until the ID token expires.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpiresIn() {
    return expiresIn;
  }

  /**
   * The number of seconds until the ID token expires.
   * @param expiresIn expiresIn or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithCustomTokenResponse setExpiresIn(java.lang.Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * An Identity Platform ID token for the authenticated user.
   * @return value or {@code null} for none
   */
  public java.lang.String getIdToken() {
    return idToken;
  }

  /**
   * An Identity Platform ID token for the authenticated user.
   * @param idToken idToken or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithCustomTokenResponse setIdToken(java.lang.String idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * Whether the authenticated user was created by this request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsNewUser() {
    return isNewUser;
  }

  /**
   * Whether the authenticated user was created by this request.
   * @param isNewUser isNewUser or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithCustomTokenResponse setIsNewUser(java.lang.Boolean isNewUser) {
    this.isNewUser = isNewUser;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithCustomTokenResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * An Identity Platform refresh token for the authenticated user.
   * @return value or {@code null} for none
   */
  public java.lang.String getRefreshToken() {
    return refreshToken;
  }

  /**
   * An Identity Platform refresh token for the authenticated user.
   * @param refreshToken refreshToken or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithCustomTokenResponse setRefreshToken(java.lang.String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  @Override
  public GoogleCloudIdentitytoolkitV1SignInWithCustomTokenResponse set(String fieldName, Object value) {
    return (GoogleCloudIdentitytoolkitV1SignInWithCustomTokenResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIdentitytoolkitV1SignInWithCustomTokenResponse clone() {
    return (GoogleCloudIdentitytoolkitV1SignInWithCustomTokenResponse) super.clone();
  }

}
