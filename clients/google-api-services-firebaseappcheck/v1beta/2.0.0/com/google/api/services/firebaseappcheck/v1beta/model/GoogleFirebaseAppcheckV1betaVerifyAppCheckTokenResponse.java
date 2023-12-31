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

package com.google.api.services.firebaseappcheck.v1beta.model;

/**
 * Response message for the VerifyAppCheckToken method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Check API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseAppcheckV1betaVerifyAppCheckTokenResponse extends com.google.api.client.json.GenericJson {

  /**
   * Whether this token was already consumed. If this is the first time this method has seen the
   * given App Check token, this field will be omitted from the response. The given token will then
   * be marked as `already_consumed` (set to `true`) for all future invocations of this method for
   * that token. Note that if the given App Check token is invalid, an HTTP 403 error is returned
   * instead of a response containing this field, regardless whether the token was already consumed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean alreadyConsumed;

  /**
   * Whether this token was already consumed. If this is the first time this method has seen the
   * given App Check token, this field will be omitted from the response. The given token will then
   * be marked as `already_consumed` (set to `true`) for all future invocations of this method for
   * that token. Note that if the given App Check token is invalid, an HTTP 403 error is returned
   * instead of a response containing this field, regardless whether the token was already consumed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAlreadyConsumed() {
    return alreadyConsumed;
  }

  /**
   * Whether this token was already consumed. If this is the first time this method has seen the
   * given App Check token, this field will be omitted from the response. The given token will then
   * be marked as `already_consumed` (set to `true`) for all future invocations of this method for
   * that token. Note that if the given App Check token is invalid, an HTTP 403 error is returned
   * instead of a response containing this field, regardless whether the token was already consumed.
   * @param alreadyConsumed alreadyConsumed or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaVerifyAppCheckTokenResponse setAlreadyConsumed(java.lang.Boolean alreadyConsumed) {
    this.alreadyConsumed = alreadyConsumed;
    return this;
  }

  @Override
  public GoogleFirebaseAppcheckV1betaVerifyAppCheckTokenResponse set(String fieldName, Object value) {
    return (GoogleFirebaseAppcheckV1betaVerifyAppCheckTokenResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppcheckV1betaVerifyAppCheckTokenResponse clone() {
    return (GoogleFirebaseAppcheckV1betaVerifyAppCheckTokenResponse) super.clone();
  }

}
