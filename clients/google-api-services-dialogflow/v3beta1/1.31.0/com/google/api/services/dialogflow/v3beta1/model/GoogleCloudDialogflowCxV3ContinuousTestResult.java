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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Represents a result from running a test case in an agent environment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3ContinuousTestResult extends com.google.api.client.json.GenericJson {

  /**
   * The resource name for the continuous test result. Format:
   * `projects//locations//agents//environments//continuousTestResults/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The result of this continuous test run, i.e. whether all the tests in this continuous test run
   * pass or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String result;

  /**
   * Time when the continuous testing run starts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String runTime;

  /**
   * A list of individual test case results names in this continuous test run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> testCaseResults;

  /**
   * The resource name for the continuous test result. Format:
   * `projects//locations//agents//environments//continuousTestResults/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name for the continuous test result. Format:
   * `projects//locations//agents//environments//continuousTestResults/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ContinuousTestResult setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The result of this continuous test run, i.e. whether all the tests in this continuous test run
   * pass or not.
   * @return value or {@code null} for none
   */
  public java.lang.String getResult() {
    return result;
  }

  /**
   * The result of this continuous test run, i.e. whether all the tests in this continuous test run
   * pass or not.
   * @param result result or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ContinuousTestResult setResult(java.lang.String result) {
    this.result = result;
    return this;
  }

  /**
   * Time when the continuous testing run starts.
   * @return value or {@code null} for none
   */
  public String getRunTime() {
    return runTime;
  }

  /**
   * Time when the continuous testing run starts.
   * @param runTime runTime or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ContinuousTestResult setRunTime(String runTime) {
    this.runTime = runTime;
    return this;
  }

  /**
   * A list of individual test case results names in this continuous test run.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTestCaseResults() {
    return testCaseResults;
  }

  /**
   * A list of individual test case results names in this continuous test run.
   * @param testCaseResults testCaseResults or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ContinuousTestResult setTestCaseResults(java.util.List<java.lang.String> testCaseResults) {
    this.testCaseResults = testCaseResults;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3ContinuousTestResult set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3ContinuousTestResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3ContinuousTestResult clone() {
    return (GoogleCloudDialogflowCxV3ContinuousTestResult) super.clone();
  }

}
