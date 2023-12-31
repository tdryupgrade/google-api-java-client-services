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
 * Represents a notification sent to Cloud Pub/Sub subscribers for human agent assistant events in a
 * specific conversation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2HumanAgentAssistantEvent extends com.google.api.client.json.GenericJson {

  /**
   * The conversation this notification refers to. Format: `projects//conversations/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversation;

  /**
   * The participant that the suggestion is compiled for. Format:
   * `projects//conversations//participants/`. It will not be set in legacy workflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String participant;

  /**
   * The suggestion results payload that this notification refers to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2SuggestionResult> suggestionResults;

  /**
   * The conversation this notification refers to. Format: `projects//conversations/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getConversation() {
    return conversation;
  }

  /**
   * The conversation this notification refers to. Format: `projects//conversations/`.
   * @param conversation conversation or {@code null} for none
   */
  public GoogleCloudDialogflowV2HumanAgentAssistantEvent setConversation(java.lang.String conversation) {
    this.conversation = conversation;
    return this;
  }

  /**
   * The participant that the suggestion is compiled for. Format:
   * `projects//conversations//participants/`. It will not be set in legacy workflow.
   * @return value or {@code null} for none
   */
  public java.lang.String getParticipant() {
    return participant;
  }

  /**
   * The participant that the suggestion is compiled for. Format:
   * `projects//conversations//participants/`. It will not be set in legacy workflow.
   * @param participant participant or {@code null} for none
   */
  public GoogleCloudDialogflowV2HumanAgentAssistantEvent setParticipant(java.lang.String participant) {
    this.participant = participant;
    return this;
  }

  /**
   * The suggestion results payload that this notification refers to.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2SuggestionResult> getSuggestionResults() {
    return suggestionResults;
  }

  /**
   * The suggestion results payload that this notification refers to.
   * @param suggestionResults suggestionResults or {@code null} for none
   */
  public GoogleCloudDialogflowV2HumanAgentAssistantEvent setSuggestionResults(java.util.List<GoogleCloudDialogflowV2SuggestionResult> suggestionResults) {
    this.suggestionResults = suggestionResults;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2HumanAgentAssistantEvent set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2HumanAgentAssistantEvent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2HumanAgentAssistantEvent clone() {
    return (GoogleCloudDialogflowV2HumanAgentAssistantEvent) super.clone();
  }

}
