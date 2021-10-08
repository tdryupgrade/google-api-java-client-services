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
 * The request message for Participants.SuggestArticles.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2SuggestArticlesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Max number of messages prior to and including latest_message to use as context when compiling
   * the suggestion. By default 20 and at most 50.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer contextSize;

  /**
   * The name of the latest conversation message to compile suggestion for. If empty, it will be the
   * latest message of the conversation. Format: `projects//locations//conversations//messages/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latestMessage;

  /**
   * Max number of messages prior to and including latest_message to use as context when compiling
   * the suggestion. By default 20 and at most 50.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getContextSize() {
    return contextSize;
  }

  /**
   * Max number of messages prior to and including latest_message to use as context when compiling
   * the suggestion. By default 20 and at most 50.
   * @param contextSize contextSize or {@code null} for none
   */
  public GoogleCloudDialogflowV2SuggestArticlesRequest setContextSize(java.lang.Integer contextSize) {
    this.contextSize = contextSize;
    return this;
  }

  /**
   * The name of the latest conversation message to compile suggestion for. If empty, it will be the
   * latest message of the conversation. Format: `projects//locations//conversations//messages/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLatestMessage() {
    return latestMessage;
  }

  /**
   * The name of the latest conversation message to compile suggestion for. If empty, it will be the
   * latest message of the conversation. Format: `projects//locations//conversations//messages/`.
   * @param latestMessage latestMessage or {@code null} for none
   */
  public GoogleCloudDialogflowV2SuggestArticlesRequest setLatestMessage(java.lang.String latestMessage) {
    this.latestMessage = latestMessage;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2SuggestArticlesRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2SuggestArticlesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2SuggestArticlesRequest clone() {
    return (GoogleCloudDialogflowV2SuggestArticlesRequest) super.clone();
  }

}
