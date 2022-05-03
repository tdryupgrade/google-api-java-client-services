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

package com.google.api.services.firebaseappcheck.v1.model;

/**
 * Request message for the ExchangeRecaptchaEnterpriseToken method.
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
public final class GoogleFirebaseAppcheckV1ExchangeRecaptchaEnterpriseTokenRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The reCAPTCHA token as returned by the [reCAPTCHA Enterprise JavaScript
   * API](https://cloud.google.com/recaptcha-enterprise/docs/instrument-web-pages).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recaptchaEnterpriseToken;

  /**
   * Required. The reCAPTCHA token as returned by the [reCAPTCHA Enterprise JavaScript
   * API](https://cloud.google.com/recaptcha-enterprise/docs/instrument-web-pages).
   * @return value or {@code null} for none
   */
  public java.lang.String getRecaptchaEnterpriseToken() {
    return recaptchaEnterpriseToken;
  }

  /**
   * Required. The reCAPTCHA token as returned by the [reCAPTCHA Enterprise JavaScript
   * API](https://cloud.google.com/recaptcha-enterprise/docs/instrument-web-pages).
   * @param recaptchaEnterpriseToken recaptchaEnterpriseToken or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1ExchangeRecaptchaEnterpriseTokenRequest setRecaptchaEnterpriseToken(java.lang.String recaptchaEnterpriseToken) {
    this.recaptchaEnterpriseToken = recaptchaEnterpriseToken;
    return this;
  }

  @Override
  public GoogleFirebaseAppcheckV1ExchangeRecaptchaEnterpriseTokenRequest set(String fieldName, Object value) {
    return (GoogleFirebaseAppcheckV1ExchangeRecaptchaEnterpriseTokenRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppcheckV1ExchangeRecaptchaEnterpriseTokenRequest clone() {
    return (GoogleFirebaseAppcheckV1ExchangeRecaptchaEnterpriseTokenRequest) super.clone();
  }

}
