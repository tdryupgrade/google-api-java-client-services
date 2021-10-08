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
 * The configuration for continuous tests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether to run test cases in TestCasesConfig.test_cases periodically. Default false. If set to
   * ture, run once a day.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableContinuousRun;

  /**
   * Whether to run test cases in TestCasesConfig.test_cases before deploying a flow version to the
   * environment. Default false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enablePredeploymentRun;

  /**
   * A list of test case names to run. They should be under the same agent. Format of each test case
   * name: `projects//locations/ /agents//testCases/`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> testCases;

  /**
   * Whether to run test cases in TestCasesConfig.test_cases periodically. Default false. If set to
   * ture, run once a day.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableContinuousRun() {
    return enableContinuousRun;
  }

  /**
   * Whether to run test cases in TestCasesConfig.test_cases periodically. Default false. If set to
   * ture, run once a day.
   * @param enableContinuousRun enableContinuousRun or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfig setEnableContinuousRun(java.lang.Boolean enableContinuousRun) {
    this.enableContinuousRun = enableContinuousRun;
    return this;
  }

  /**
   * Whether to run test cases in TestCasesConfig.test_cases before deploying a flow version to the
   * environment. Default false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnablePredeploymentRun() {
    return enablePredeploymentRun;
  }

  /**
   * Whether to run test cases in TestCasesConfig.test_cases before deploying a flow version to the
   * environment. Default false.
   * @param enablePredeploymentRun enablePredeploymentRun or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfig setEnablePredeploymentRun(java.lang.Boolean enablePredeploymentRun) {
    this.enablePredeploymentRun = enablePredeploymentRun;
    return this;
  }

  /**
   * A list of test case names to run. They should be under the same agent. Format of each test case
   * name: `projects//locations/ /agents//testCases/`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTestCases() {
    return testCases;
  }

  /**
   * A list of test case names to run. They should be under the same agent. Format of each test case
   * name: `projects//locations/ /agents//testCases/`
   * @param testCases testCases or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfig setTestCases(java.util.List<java.lang.String> testCases) {
    this.testCases = testCases;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfig set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfig clone() {
    return (GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfig) super.clone();
  }

}
