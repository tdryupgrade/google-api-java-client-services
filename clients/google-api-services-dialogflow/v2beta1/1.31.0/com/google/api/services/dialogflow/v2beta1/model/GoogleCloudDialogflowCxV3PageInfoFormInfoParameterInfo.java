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
 * Represents parameter information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo extends com.google.api.client.json.GenericJson {

  /**
   * Always present for WebhookRequest. Required for WebhookResponse. The human-readable name of the
   * parameter, unique within the form. This field cannot be modified by the webhook.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional for WebhookRequest. Ignored for WebhookResponse. Indicates if the parameter value was
   * just collected on the last conversation turn.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean justCollected;

  /**
   * Optional for both WebhookRequest and WebhookResponse. Indicates whether the parameter is
   * required. Optional parameters will not trigger prompts; however, they are filled if the user
   * specifies them. Required parameters must be filled before form filling concludes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean required;

  /**
   * Always present for WebhookRequest. Required for WebhookResponse. The state of the parameter.
   * This field can be set to INVALID by the webhook to invalidate the parameter; other values set
   * by the webhook will be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Optional for both WebhookRequest and WebhookResponse. The value of the parameter. This field
   * can be set by the webhook to change the parameter value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object value;

  /**
   * Always present for WebhookRequest. Required for WebhookResponse. The human-readable name of the
   * parameter, unique within the form. This field cannot be modified by the webhook.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Always present for WebhookRequest. Required for WebhookResponse. The human-readable name of the
   * parameter, unique within the form. This field cannot be modified by the webhook.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional for WebhookRequest. Ignored for WebhookResponse. Indicates if the parameter value was
   * just collected on the last conversation turn.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getJustCollected() {
    return justCollected;
  }

  /**
   * Optional for WebhookRequest. Ignored for WebhookResponse. Indicates if the parameter value was
   * just collected on the last conversation turn.
   * @param justCollected justCollected or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo setJustCollected(java.lang.Boolean justCollected) {
    this.justCollected = justCollected;
    return this;
  }

  /**
   * Optional for both WebhookRequest and WebhookResponse. Indicates whether the parameter is
   * required. Optional parameters will not trigger prompts; however, they are filled if the user
   * specifies them. Required parameters must be filled before form filling concludes.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequired() {
    return required;
  }

  /**
   * Optional for both WebhookRequest and WebhookResponse. Indicates whether the parameter is
   * required. Optional parameters will not trigger prompts; however, they are filled if the user
   * specifies them. Required parameters must be filled before form filling concludes.
   * @param required required or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo setRequired(java.lang.Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Always present for WebhookRequest. Required for WebhookResponse. The state of the parameter.
   * This field can be set to INVALID by the webhook to invalidate the parameter; other values set
   * by the webhook will be ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Always present for WebhookRequest. Required for WebhookResponse. The state of the parameter.
   * This field can be set to INVALID by the webhook to invalidate the parameter; other values set
   * by the webhook will be ignored.
   * @param state state or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Optional for both WebhookRequest and WebhookResponse. The value of the parameter. This field
   * can be set by the webhook to change the parameter value.
   * @return value or {@code null} for none
   */
  public java.lang.Object getValue() {
    return value;
  }

  /**
   * Optional for both WebhookRequest and WebhookResponse. The value of the parameter. This field
   * can be set by the webhook to change the parameter value.
   * @param value value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo setValue(java.lang.Object value) {
    this.value = value;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo clone() {
    return (GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo) super.clone();
  }

}
