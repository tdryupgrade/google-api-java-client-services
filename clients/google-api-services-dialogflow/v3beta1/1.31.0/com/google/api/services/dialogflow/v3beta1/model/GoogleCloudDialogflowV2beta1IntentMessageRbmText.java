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
 * Rich Business Messaging (RBM) text response with suggestions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmText extends com.google.api.client.json.GenericJson {

  /**
   * Optional. One or more suggestions to show to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion> rbmSuggestion;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion.class);
  }

  /**
   * Required. Text sent and displayed to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Optional. One or more suggestions to show to the user.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion> getRbmSuggestion() {
    return rbmSuggestion;
  }

  /**
   * Optional. One or more suggestions to show to the user.
   * @param rbmSuggestion rbmSuggestion or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageRbmText setRbmSuggestion(java.util.List<GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion> rbmSuggestion) {
    this.rbmSuggestion = rbmSuggestion;
    return this;
  }

  /**
   * Required. Text sent and displayed to the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Required. Text sent and displayed to the user.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageRbmText setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageRbmText set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1IntentMessageRbmText) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageRbmText clone() {
    return (GoogleCloudDialogflowV2beta1IntentMessageRbmText) super.clone();
  }

}
