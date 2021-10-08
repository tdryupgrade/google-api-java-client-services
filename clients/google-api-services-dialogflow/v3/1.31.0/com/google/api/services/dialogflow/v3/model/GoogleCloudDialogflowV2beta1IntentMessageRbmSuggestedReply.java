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
 * Rich Business Messaging (RBM) suggested reply that the user can click instead of typing in their
 * own response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply extends com.google.api.client.json.GenericJson {

  /**
   * Opaque payload that the Dialogflow receives in a user event when the user taps the suggested
   * reply. This data will be also forwarded to webhook to allow performing custom business logic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postbackData;

  /**
   * Suggested reply text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Opaque payload that the Dialogflow receives in a user event when the user taps the suggested
   * reply. This data will be also forwarded to webhook to allow performing custom business logic.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostbackData() {
    return postbackData;
  }

  /**
   * Opaque payload that the Dialogflow receives in a user event when the user taps the suggested
   * reply. This data will be also forwarded to webhook to allow performing custom business logic.
   * @param postbackData postbackData or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply setPostbackData(java.lang.String postbackData) {
    this.postbackData = postbackData;
    return this;
  }

  /**
   * Suggested reply text.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Suggested reply text.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply clone() {
    return (GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply) super.clone();
  }

}
