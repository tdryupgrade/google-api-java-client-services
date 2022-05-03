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
 * An app's reCAPTCHA Enterprise configuration object. This configuration is used by
 * ExchangeRecaptchaEnterpriseToken to validate reCAPTCHA tokens issued to apps by reCAPTCHA
 * Enterprise. It also controls certain properties of the returned `AppCheckToken`, such as its ttl.
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
public final class GoogleFirebaseAppcheckV1RecaptchaEnterpriseConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. The relative resource name of the reCAPTCHA Enterprise configuration object, in the
   * format: ``` projects/{project_number}/apps/{app_id}/recaptchaEnterpriseConfig ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The score-based site key [created in reCAPTCHA Enterprise](https://cloud.google.com/recaptcha-
   * enterprise/docs/create-key#creating_a_site_key) used to [invoke reCAPTCHA and generate the
   * reCAPTCHA tokens](https://cloud.google.com/recaptcha-enterprise/docs/instrument-web-pages) for
   * your application. Important: This is *not* the `site_secret` (as it is in reCAPTCHA v3), but
   * rather your score-based reCAPTCHA Enterprise site key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String siteKey;

  /**
   * Specifies the duration for which App Check tokens exchanged from reCAPTCHA Enterprise tokens
   * will be valid. If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7
   * days, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String tokenTtl;

  /**
   * Required. The relative resource name of the reCAPTCHA Enterprise configuration object, in the
   * format: ``` projects/{project_number}/apps/{app_id}/recaptchaEnterpriseConfig ```
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The relative resource name of the reCAPTCHA Enterprise configuration object, in the
   * format: ``` projects/{project_number}/apps/{app_id}/recaptchaEnterpriseConfig ```
   * @param name name or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1RecaptchaEnterpriseConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The score-based site key [created in reCAPTCHA Enterprise](https://cloud.google.com/recaptcha-
   * enterprise/docs/create-key#creating_a_site_key) used to [invoke reCAPTCHA and generate the
   * reCAPTCHA tokens](https://cloud.google.com/recaptcha-enterprise/docs/instrument-web-pages) for
   * your application. Important: This is *not* the `site_secret` (as it is in reCAPTCHA v3), but
   * rather your score-based reCAPTCHA Enterprise site key.
   * @return value or {@code null} for none
   */
  public java.lang.String getSiteKey() {
    return siteKey;
  }

  /**
   * The score-based site key [created in reCAPTCHA Enterprise](https://cloud.google.com/recaptcha-
   * enterprise/docs/create-key#creating_a_site_key) used to [invoke reCAPTCHA and generate the
   * reCAPTCHA tokens](https://cloud.google.com/recaptcha-enterprise/docs/instrument-web-pages) for
   * your application. Important: This is *not* the `site_secret` (as it is in reCAPTCHA v3), but
   * rather your score-based reCAPTCHA Enterprise site key.
   * @param siteKey siteKey or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1RecaptchaEnterpriseConfig setSiteKey(java.lang.String siteKey) {
    this.siteKey = siteKey;
    return this;
  }

  /**
   * Specifies the duration for which App Check tokens exchanged from reCAPTCHA Enterprise tokens
   * will be valid. If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7
   * days, inclusive.
   * @return value or {@code null} for none
   */
  public String getTokenTtl() {
    return tokenTtl;
  }

  /**
   * Specifies the duration for which App Check tokens exchanged from reCAPTCHA Enterprise tokens
   * will be valid. If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7
   * days, inclusive.
   * @param tokenTtl tokenTtl or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1RecaptchaEnterpriseConfig setTokenTtl(String tokenTtl) {
    this.tokenTtl = tokenTtl;
    return this;
  }

  @Override
  public GoogleFirebaseAppcheckV1RecaptchaEnterpriseConfig set(String fieldName, Object value) {
    return (GoogleFirebaseAppcheckV1RecaptchaEnterpriseConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppcheckV1RecaptchaEnterpriseConfig clone() {
    return (GoogleFirebaseAppcheckV1RecaptchaEnterpriseConfig) super.clone();
  }

}
