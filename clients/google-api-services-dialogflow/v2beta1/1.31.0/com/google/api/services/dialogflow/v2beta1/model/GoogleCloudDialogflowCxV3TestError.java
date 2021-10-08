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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * Error info for running a test.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3TestError extends com.google.api.client.json.GenericJson {

  /**
   * The status associated with the test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus status;

  /**
   * The test case resource name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String testCase;

  /**
   * The timestamp when the test was completed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String testTime;

  /**
   * The status associated with the test.
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getStatus() {
    return status;
  }

  /**
   * The status associated with the test.
   * @param status status or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestError setStatus(GoogleRpcStatus status) {
    this.status = status;
    return this;
  }

  /**
   * The test case resource name.
   * @return value or {@code null} for none
   */
  public java.lang.String getTestCase() {
    return testCase;
  }

  /**
   * The test case resource name.
   * @param testCase testCase or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestError setTestCase(java.lang.String testCase) {
    this.testCase = testCase;
    return this;
  }

  /**
   * The timestamp when the test was completed.
   * @return value or {@code null} for none
   */
  public String getTestTime() {
    return testTime;
  }

  /**
   * The timestamp when the test was completed.
   * @param testTime testTime or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestError setTestTime(String testTime) {
    this.testTime = testTime;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3TestError set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3TestError) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3TestError clone() {
    return (GoogleCloudDialogflowCxV3TestError) super.clone();
  }

}
