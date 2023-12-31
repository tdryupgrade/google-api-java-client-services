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

package com.google.api.services.androidenterprise.model;

/**
 * Response message for create enrollment token.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateEnrollmentTokenResponse extends com.google.api.client.json.GenericJson {

  /**
   * Enrollment token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enrollmentToken;

  /**
   * Enrollment token.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnrollmentToken() {
    return enrollmentToken;
  }

  /**
   * Enrollment token.
   * @param enrollmentToken enrollmentToken or {@code null} for none
   */
  public CreateEnrollmentTokenResponse setEnrollmentToken(java.lang.String enrollmentToken) {
    this.enrollmentToken = enrollmentToken;
    return this;
  }

  @Override
  public CreateEnrollmentTokenResponse set(String fieldName, Object value) {
    return (CreateEnrollmentTokenResponse) super.set(fieldName, value);
  }

  @Override
  public CreateEnrollmentTokenResponse clone() {
    return (CreateEnrollmentTokenResponse) super.clone();
  }

}
