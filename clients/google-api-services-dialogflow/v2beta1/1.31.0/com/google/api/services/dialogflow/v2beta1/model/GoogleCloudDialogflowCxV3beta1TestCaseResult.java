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
public final class GoogleCloudDialogflowCxV3beta1TestCaseResult extends com.google.api.client.json.GenericJson {

  /**
   * The conversation turns uttered during the test case replay in chronological order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3beta1ConversationTurn> conversationTurns;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowCxV3beta1ConversationTurn used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowCxV3beta1ConversationTurn.class);
  }

  /**
   * Environment where the test was run. If not set, it indicates the draft environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String environment;

  /**
   * The resource name for the test case result. Format: `projects//locations//agents//testCases/
   * /results/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Whether the test case passed in the agent environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String testResult;

  /**
   * The time that the test was run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String testTime;

  /**
   * The conversation turns uttered during the test case replay in chronological order.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3beta1ConversationTurn> getConversationTurns() {
    return conversationTurns;
  }

  /**
   * The conversation turns uttered during the test case replay in chronological order.
   * @param conversationTurns conversationTurns or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TestCaseResult setConversationTurns(java.util.List<GoogleCloudDialogflowCxV3beta1ConversationTurn> conversationTurns) {
    this.conversationTurns = conversationTurns;
    return this;
  }

  /**
   * Environment where the test was run. If not set, it indicates the draft environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnvironment() {
    return environment;
  }

  /**
   * Environment where the test was run. If not set, it indicates the draft environment.
   * @param environment environment or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TestCaseResult setEnvironment(java.lang.String environment) {
    this.environment = environment;
    return this;
  }

  /**
   * The resource name for the test case result. Format: `projects//locations//agents//testCases/
   * /results/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name for the test case result. Format: `projects//locations//agents//testCases/
   * /results/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TestCaseResult setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Whether the test case passed in the agent environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getTestResult() {
    return testResult;
  }

  /**
   * Whether the test case passed in the agent environment.
   * @param testResult testResult or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TestCaseResult setTestResult(java.lang.String testResult) {
    this.testResult = testResult;
    return this;
  }

  /**
   * The time that the test was run.
   * @return value or {@code null} for none
   */
  public String getTestTime() {
    return testTime;
  }

  /**
   * The time that the test was run.
   * @param testTime testTime or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TestCaseResult setTestTime(String testTime) {
    this.testTime = testTime;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1TestCaseResult set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1TestCaseResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1TestCaseResult clone() {
    return (GoogleCloudDialogflowCxV3beta1TestCaseResult) super.clone();
  }

}
