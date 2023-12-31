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

package com.google.api.services.firebaseappdistribution.v1.model;

/**
 * The request message for `BatchRemoveTesters`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Distribution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseAppdistroV1BatchRemoveTestersRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The email addresses of the tester resources to removed. A maximum of 999 and a
   * minimum of 1 testers can be deleted in a batch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> emails;

  /**
   * Required. The email addresses of the tester resources to removed. A maximum of 999 and a
   * minimum of 1 testers can be deleted in a batch.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEmails() {
    return emails;
  }

  /**
   * Required. The email addresses of the tester resources to removed. A maximum of 999 and a
   * minimum of 1 testers can be deleted in a batch.
   * @param emails emails or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1BatchRemoveTestersRequest setEmails(java.util.List<java.lang.String> emails) {
    this.emails = emails;
    return this;
  }

  @Override
  public GoogleFirebaseAppdistroV1BatchRemoveTestersRequest set(String fieldName, Object value) {
    return (GoogleFirebaseAppdistroV1BatchRemoveTestersRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppdistroV1BatchRemoveTestersRequest clone() {
    return (GoogleFirebaseAppdistroV1BatchRemoveTestersRequest) super.clone();
  }

}
