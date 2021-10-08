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
 * The request message for Participants.SuggestFaqAnswers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse extends com.google.api.client.json.GenericJson {

  /**
   * Number of messages prior to and including latest_message to compile the suggestion. It may be
   * smaller than the SuggestFaqAnswersRequest.context_size field in the request if there aren't
   * that many messages in the conversation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer contextSize;

  /**
   * Output only. Answers extracted from FAQ documents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1FaqAnswer> faqAnswers;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2beta1FaqAnswer used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2beta1FaqAnswer.class);
  }

  /**
   * The name of the latest conversation message used to compile suggestion for. Format:
   * `projects//locations//conversations//messages/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latestMessage;

  /**
   * Number of messages prior to and including latest_message to compile the suggestion. It may be
   * smaller than the SuggestFaqAnswersRequest.context_size field in the request if there aren't
   * that many messages in the conversation.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getContextSize() {
    return contextSize;
  }

  /**
   * Number of messages prior to and including latest_message to compile the suggestion. It may be
   * smaller than the SuggestFaqAnswersRequest.context_size field in the request if there aren't
   * that many messages in the conversation.
   * @param contextSize contextSize or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse setContextSize(java.lang.Integer contextSize) {
    this.contextSize = contextSize;
    return this;
  }

  /**
   * Output only. Answers extracted from FAQ documents.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1FaqAnswer> getFaqAnswers() {
    return faqAnswers;
  }

  /**
   * Output only. Answers extracted from FAQ documents.
   * @param faqAnswers faqAnswers or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse setFaqAnswers(java.util.List<GoogleCloudDialogflowV2beta1FaqAnswer> faqAnswers) {
    this.faqAnswers = faqAnswers;
    return this;
  }

  /**
   * The name of the latest conversation message used to compile suggestion for. Format:
   * `projects//locations//conversations//messages/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLatestMessage() {
    return latestMessage;
  }

  /**
   * The name of the latest conversation message used to compile suggestion for. Format:
   * `projects//locations//conversations//messages/`.
   * @param latestMessage latestMessage or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse setLatestMessage(java.lang.String latestMessage) {
    this.latestMessage = latestMessage;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse clone() {
    return (GoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse) super.clone();
  }

}
