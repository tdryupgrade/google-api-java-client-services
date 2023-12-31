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

package com.google.api.services.recaptchaenterprise.v1.model;

/**
 * Information about a verification endpoint that can be used for 2FA.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the reCAPTCHA Enterprise API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo extends com.google.api.client.json.GenericJson {

  /**
   * Email address for which to trigger a verification request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String emailAddress;

  /**
   * Output only. Timestamp of the last successful verification for the endpoint, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastVerificationTime;

  /**
   * Phone number for which to trigger a verification request. Should be given in E.164 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumber;

  /**
   * Output only. Token to provide to the client to trigger endpoint verification. It must be used
   * within 15 minutes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestToken;

  /**
   * Email address for which to trigger a verification request.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmailAddress() {
    return emailAddress;
  }

  /**
   * Email address for which to trigger a verification request.
   * @param emailAddress emailAddress or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo setEmailAddress(java.lang.String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Output only. Timestamp of the last successful verification for the endpoint, if any.
   * @return value or {@code null} for none
   */
  public String getLastVerificationTime() {
    return lastVerificationTime;
  }

  /**
   * Output only. Timestamp of the last successful verification for the endpoint, if any.
   * @param lastVerificationTime lastVerificationTime or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo setLastVerificationTime(String lastVerificationTime) {
    this.lastVerificationTime = lastVerificationTime;
    return this;
  }

  /**
   * Phone number for which to trigger a verification request. Should be given in E.164 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Phone number for which to trigger a verification request. Should be given in E.164 format.
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Output only. Token to provide to the client to trigger endpoint verification. It must be used
   * within 15 minutes.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestToken() {
    return requestToken;
  }

  /**
   * Output only. Token to provide to the client to trigger endpoint verification. It must be used
   * within 15 minutes.
   * @param requestToken requestToken or {@code null} for none
   */
  public GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo setRequestToken(java.lang.String requestToken) {
    this.requestToken = requestToken;
    return this;
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo set(String fieldName, Object value) {
    return (GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo clone() {
    return (GoogleCloudRecaptchaenterpriseV1EndpointVerificationInfo) super.clone();
  }

}
