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
 * The input from the human user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3ConversationTurnUserInput extends com.google.api.client.json.GenericJson {

  /**
   * Whether sentiment analysis is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableSentimentAnalysis;

  /**
   * Parameters that need to be injected into the conversation during intent detection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> injectedParameters;

  /**
   * Supports text input, event input, dtmf input in the test case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3QueryInput input;

  /**
   * If webhooks should be allowed to trigger in response to the user utterance. Often if parameters
   * are injected, webhooks should not be enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isWebhookEnabled;

  /**
   * Whether sentiment analysis is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableSentimentAnalysis() {
    return enableSentimentAnalysis;
  }

  /**
   * Whether sentiment analysis is enabled.
   * @param enableSentimentAnalysis enableSentimentAnalysis or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurnUserInput setEnableSentimentAnalysis(java.lang.Boolean enableSentimentAnalysis) {
    this.enableSentimentAnalysis = enableSentimentAnalysis;
    return this;
  }

  /**
   * Parameters that need to be injected into the conversation during intent detection.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getInjectedParameters() {
    return injectedParameters;
  }

  /**
   * Parameters that need to be injected into the conversation during intent detection.
   * @param injectedParameters injectedParameters or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurnUserInput setInjectedParameters(java.util.Map<String, java.lang.Object> injectedParameters) {
    this.injectedParameters = injectedParameters;
    return this;
  }

  /**
   * Supports text input, event input, dtmf input in the test case.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3QueryInput getInput() {
    return input;
  }

  /**
   * Supports text input, event input, dtmf input in the test case.
   * @param input input or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurnUserInput setInput(GoogleCloudDialogflowCxV3QueryInput input) {
    this.input = input;
    return this;
  }

  /**
   * If webhooks should be allowed to trigger in response to the user utterance. Often if parameters
   * are injected, webhooks should not be enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsWebhookEnabled() {
    return isWebhookEnabled;
  }

  /**
   * If webhooks should be allowed to trigger in response to the user utterance. Often if parameters
   * are injected, webhooks should not be enabled.
   * @param isWebhookEnabled isWebhookEnabled or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurnUserInput setIsWebhookEnabled(java.lang.Boolean isWebhookEnabled) {
    this.isWebhookEnabled = isWebhookEnabled;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3ConversationTurnUserInput set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3ConversationTurnUserInput) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3ConversationTurnUserInput clone() {
    return (GoogleCloudDialogflowCxV3ConversationTurnUserInput) super.clone();
  }

}
