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
 * The response message for Participants.SuggestSmartReplies.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Number of messages prior to and including latest_message to compile the suggestion. It may be
   * smaller than the SuggestSmartRepliesRequest.context_size field in the request if there aren't
   * that many messages in the conversation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer contextSize;

  /**
   * The name of the latest conversation message used to compile suggestion for. Format:
   * `projects//locations//conversations//messages/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latestMessage;

  /**
   * Output only. Multiple reply options provided by smart reply service. The order is based on the
   * rank of the model prediction. The maximum number of the returned replies is set in
   * SmartReplyConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1SmartReplyAnswer> smartReplyAnswers;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2beta1SmartReplyAnswer used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2beta1SmartReplyAnswer.class);
  }

  /**
   * Number of messages prior to and including latest_message to compile the suggestion. It may be
   * smaller than the SuggestSmartRepliesRequest.context_size field in the request if there aren't
   * that many messages in the conversation.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getContextSize() {
    return contextSize;
  }

  /**
   * Number of messages prior to and including latest_message to compile the suggestion. It may be
   * smaller than the SuggestSmartRepliesRequest.context_size field in the request if there aren't
   * that many messages in the conversation.
   * @param contextSize contextSize or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse setContextSize(java.lang.Integer contextSize) {
    this.contextSize = contextSize;
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
  public GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse setLatestMessage(java.lang.String latestMessage) {
    this.latestMessage = latestMessage;
    return this;
  }

  /**
   * Output only. Multiple reply options provided by smart reply service. The order is based on the
   * rank of the model prediction. The maximum number of the returned replies is set in
   * SmartReplyConfig.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1SmartReplyAnswer> getSmartReplyAnswers() {
    return smartReplyAnswers;
  }

  /**
   * Output only. Multiple reply options provided by smart reply service. The order is based on the
   * rank of the model prediction. The maximum number of the returned replies is set in
   * SmartReplyConfig.
   * @param smartReplyAnswers smartReplyAnswers or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse setSmartReplyAnswers(java.util.List<GoogleCloudDialogflowV2beta1SmartReplyAnswer> smartReplyAnswers) {
    this.smartReplyAnswers = smartReplyAnswers;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse clone() {
    return (GoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse) super.clone();
  }

}
