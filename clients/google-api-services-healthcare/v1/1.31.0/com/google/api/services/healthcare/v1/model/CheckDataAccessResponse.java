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

package com.google.api.services.healthcare.v1.model;

/**
 * Checks if a particular data_id of a User data mapping in the given consent store is consented for
 * a given use.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CheckDataAccessResponse extends com.google.api.client.json.GenericJson {

  /**
   * The resource names of all evaluated Consents mapped to their evaluation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ConsentEvaluation> consentDetails;

  /**
   * Whether the requested resource is consented for the given use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean consented;

  /**
   * The resource names of all evaluated Consents mapped to their evaluation.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ConsentEvaluation> getConsentDetails() {
    return consentDetails;
  }

  /**
   * The resource names of all evaluated Consents mapped to their evaluation.
   * @param consentDetails consentDetails or {@code null} for none
   */
  public CheckDataAccessResponse setConsentDetails(java.util.Map<String, ConsentEvaluation> consentDetails) {
    this.consentDetails = consentDetails;
    return this;
  }

  /**
   * Whether the requested resource is consented for the given use.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getConsented() {
    return consented;
  }

  /**
   * Whether the requested resource is consented for the given use.
   * @param consented consented or {@code null} for none
   */
  public CheckDataAccessResponse setConsented(java.lang.Boolean consented) {
    this.consented = consented;
    return this;
  }

  @Override
  public CheckDataAccessResponse set(String fieldName, Object value) {
    return (CheckDataAccessResponse) super.set(fieldName, value);
  }

  @Override
  public CheckDataAccessResponse clone() {
    return (CheckDataAccessResponse) super.clone();
  }

}
