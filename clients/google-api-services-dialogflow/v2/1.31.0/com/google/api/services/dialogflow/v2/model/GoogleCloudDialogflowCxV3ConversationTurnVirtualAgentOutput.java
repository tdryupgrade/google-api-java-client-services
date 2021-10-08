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
 * The output from the virtual agent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput extends com.google.api.client.json.GenericJson {

  /**
   * The Page on which the utterance was spoken. Only name and displayName will be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3Page currentPage;

  /**
   * Required. Input only. The diagnostic info output for the turn. Required to calculate the
   * testing coverage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> diagnosticInfo;

  /**
   * Output only. If this is part of a result conversation turn, the list of differences between the
   * original run and the replay for this output, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3TestRunDifference> differences;

  /**
   * The session parameters available to the bot at this point.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> sessionParameters;

  /**
   * Response error from the agent in the test result. If set, other output is empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus status;

  /**
   * The text responses from the agent for the turn.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3ResponseMessageText> textResponses;

  /**
   * The Intent that triggered the response. Only name and displayName will be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3Intent triggeredIntent;

  /**
   * The Page on which the utterance was spoken. Only name and displayName will be set.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Page getCurrentPage() {
    return currentPage;
  }

  /**
   * The Page on which the utterance was spoken. Only name and displayName will be set.
   * @param currentPage currentPage or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput setCurrentPage(GoogleCloudDialogflowCxV3Page currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Required. Input only. The diagnostic info output for the turn. Required to calculate the
   * testing coverage.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getDiagnosticInfo() {
    return diagnosticInfo;
  }

  /**
   * Required. Input only. The diagnostic info output for the turn. Required to calculate the
   * testing coverage.
   * @param diagnosticInfo diagnosticInfo or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput setDiagnosticInfo(java.util.Map<String, java.lang.Object> diagnosticInfo) {
    this.diagnosticInfo = diagnosticInfo;
    return this;
  }

  /**
   * Output only. If this is part of a result conversation turn, the list of differences between the
   * original run and the replay for this output, if any.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3TestRunDifference> getDifferences() {
    return differences;
  }

  /**
   * Output only. If this is part of a result conversation turn, the list of differences between the
   * original run and the replay for this output, if any.
   * @param differences differences or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput setDifferences(java.util.List<GoogleCloudDialogflowCxV3TestRunDifference> differences) {
    this.differences = differences;
    return this;
  }

  /**
   * The session parameters available to the bot at this point.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getSessionParameters() {
    return sessionParameters;
  }

  /**
   * The session parameters available to the bot at this point.
   * @param sessionParameters sessionParameters or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput setSessionParameters(java.util.Map<String, java.lang.Object> sessionParameters) {
    this.sessionParameters = sessionParameters;
    return this;
  }

  /**
   * Response error from the agent in the test result. If set, other output is empty.
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getStatus() {
    return status;
  }

  /**
   * Response error from the agent in the test result. If set, other output is empty.
   * @param status status or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput setStatus(GoogleRpcStatus status) {
    this.status = status;
    return this;
  }

  /**
   * The text responses from the agent for the turn.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3ResponseMessageText> getTextResponses() {
    return textResponses;
  }

  /**
   * The text responses from the agent for the turn.
   * @param textResponses textResponses or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput setTextResponses(java.util.List<GoogleCloudDialogflowCxV3ResponseMessageText> textResponses) {
    this.textResponses = textResponses;
    return this;
  }

  /**
   * The Intent that triggered the response. Only name and displayName will be set.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Intent getTriggeredIntent() {
    return triggeredIntent;
  }

  /**
   * The Intent that triggered the response. Only name and displayName will be set.
   * @param triggeredIntent triggeredIntent or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput setTriggeredIntent(GoogleCloudDialogflowCxV3Intent triggeredIntent) {
    this.triggeredIntent = triggeredIntent;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput clone() {
    return (GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput) super.clone();
  }

}
