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
 * Represents a test case.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3TestCase extends com.google.api.client.json.GenericJson {

  /**
   * Output only. When the test was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String creationTime;

  /**
   * Required. The human-readable name of the test case, unique within the agent. Limit of 200
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The latest test result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3TestCaseResult lastTestResult;

  /**
   * The unique identifier of the test case. TestCases.CreateTestCase will populate the name
   * automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Additional freeform notes about the test case. Limit of 400 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notes;

  /**
   * Tags are short descriptions that users may apply to test cases for organizational and filtering
   * purposes. Each tag should start with "#" and has a limit of 30 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * The conversation turns uttered when the test case was created, in chronological order. These
   * include the canonical set of agent utterances that should occur when the agent is working
   * properly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3ConversationTurn> testCaseConversationTurns;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowCxV3ConversationTurn used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowCxV3ConversationTurn.class);
  }

  /**
   * Config for the test case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3TestConfig testConfig;

  /**
   * Output only. When the test was created.
   * @return value or {@code null} for none
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * Output only. When the test was created.
   * @param creationTime creationTime or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestCase setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Required. The human-readable name of the test case, unique within the agent. Limit of 200
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The human-readable name of the test case, unique within the agent. Limit of 200
   * characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestCase setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The latest test result.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestCaseResult getLastTestResult() {
    return lastTestResult;
  }

  /**
   * The latest test result.
   * @param lastTestResult lastTestResult or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestCase setLastTestResult(GoogleCloudDialogflowCxV3TestCaseResult lastTestResult) {
    this.lastTestResult = lastTestResult;
    return this;
  }

  /**
   * The unique identifier of the test case. TestCases.CreateTestCase will populate the name
   * automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The unique identifier of the test case. TestCases.CreateTestCase will populate the name
   * automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestCase setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Additional freeform notes about the test case. Limit of 400 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getNotes() {
    return notes;
  }

  /**
   * Additional freeform notes about the test case. Limit of 400 characters.
   * @param notes notes or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestCase setNotes(java.lang.String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Tags are short descriptions that users may apply to test cases for organizational and filtering
   * purposes. Each tag should start with "#" and has a limit of 30 characters.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Tags are short descriptions that users may apply to test cases for organizational and filtering
   * purposes. Each tag should start with "#" and has a limit of 30 characters.
   * @param tags tags or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestCase setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * The conversation turns uttered when the test case was created, in chronological order. These
   * include the canonical set of agent utterances that should occur when the agent is working
   * properly.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3ConversationTurn> getTestCaseConversationTurns() {
    return testCaseConversationTurns;
  }

  /**
   * The conversation turns uttered when the test case was created, in chronological order. These
   * include the canonical set of agent utterances that should occur when the agent is working
   * properly.
   * @param testCaseConversationTurns testCaseConversationTurns or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestCase setTestCaseConversationTurns(java.util.List<GoogleCloudDialogflowCxV3ConversationTurn> testCaseConversationTurns) {
    this.testCaseConversationTurns = testCaseConversationTurns;
    return this;
  }

  /**
   * Config for the test case.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestConfig getTestConfig() {
    return testConfig;
  }

  /**
   * Config for the test case.
   * @param testConfig testConfig or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestCase setTestConfig(GoogleCloudDialogflowCxV3TestConfig testConfig) {
    this.testConfig = testConfig;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3TestCase set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3TestCase) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3TestCase clone() {
    return (GoogleCloudDialogflowCxV3TestCase) super.clone();
  }

}
