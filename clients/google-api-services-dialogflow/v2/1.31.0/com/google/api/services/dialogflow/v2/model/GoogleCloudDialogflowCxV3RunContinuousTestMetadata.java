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

package com.google.api.services.dialogflow.v2.model;

/**
 * Metadata returned for the Environments.RunContinuousTest long running operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3RunContinuousTestMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The test errors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3TestError> errors;

  /**
   * The test errors.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3TestError> getErrors() {
    return errors;
  }

  /**
   * The test errors.
   * @param errors errors or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3RunContinuousTestMetadata setErrors(java.util.List<GoogleCloudDialogflowCxV3TestError> errors) {
    this.errors = errors;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3RunContinuousTestMetadata set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3RunContinuousTestMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3RunContinuousTestMetadata clone() {
    return (GoogleCloudDialogflowCxV3RunContinuousTestMetadata) super.clone();
  }

}
