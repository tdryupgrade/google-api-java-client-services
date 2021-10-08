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

package com.google.api.services.dialogflow.v3.model;

/**
 * Metadata returned for the Environments.DeployFlow long running operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3DeployFlowMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Errors of running deployment tests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3TestError> testErrors;

  /**
   * Errors of running deployment tests.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3TestError> getTestErrors() {
    return testErrors;
  }

  /**
   * Errors of running deployment tests.
   * @param testErrors testErrors or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3DeployFlowMetadata setTestErrors(java.util.List<GoogleCloudDialogflowCxV3TestError> testErrors) {
    this.testErrors = testErrors;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3DeployFlowMetadata set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3DeployFlowMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3DeployFlowMetadata clone() {
    return (GoogleCloudDialogflowCxV3DeployFlowMetadata) super.clone();
  }

}
