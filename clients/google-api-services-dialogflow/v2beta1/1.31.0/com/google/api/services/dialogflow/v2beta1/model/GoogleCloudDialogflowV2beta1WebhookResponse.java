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
 * The response message for a webhook call. This response is validated by the Dialogflow server. If
 * validation fails, an error will be returned in the QueryResult.diagnostic_info field. Setting
 * JSON fields to an empty value with the wrong type is a common error. To avoid this error: - Use
 * `""` for empty strings - Use `{}` or `null` for empty objects - Use `[]` or `null` for empty
 * arrays For more information, see the [Protocol Buffers Language
 * Guide](https://developers.google.com/protocol-buffers/docs/proto3#json).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1WebhookResponse extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Indicates that this intent ends an interaction. Some integrations (e.g., Actions on
   * Google or Dialogflow phone gateway) use this information to close interaction with an end user.
   * Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean endInteraction;

  /**
   * Optional. Invokes the supplied events. When this field is set, Dialogflow ignores the
   * `fulfillment_text`, `fulfillment_messages`, and `payload` fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1EventInput followupEventInput;

  /**
   * Optional. The rich response messages intended for the end-user. When provided, Dialogflow uses
   * this field to populate QueryResult.fulfillment_messages sent to the integration or API caller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1IntentMessage> fulfillmentMessages;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2beta1IntentMessage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2beta1IntentMessage.class);
  }

  /**
   * Optional. The text response message intended for the end-user. It is recommended to use
   * `fulfillment_messages.text.text[0]` instead. When provided, Dialogflow uses this field to
   * populate QueryResult.fulfillment_text sent to the integration or API caller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fulfillmentText;

  /**
   * Indicates that a live agent should be brought in to handle the interaction with the user. In
   * most cases, when you set this flag to true, you would also want to set end_interaction to true
   * as well. Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean liveAgentHandoff;

  /**
   * Optional. The collection of output contexts that will overwrite currently active contexts for
   * the session and reset their lifespans. When provided, Dialogflow uses this field to populate
   * QueryResult.output_contexts sent to the integration or API caller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1Context> outputContexts;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2beta1Context used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2beta1Context.class);
  }

  /**
   * Optional. This field can be used to pass custom data from your webhook to the integration or
   * API caller. Arbitrary JSON objects are supported. When provided, Dialogflow uses this field to
   * populate QueryResult.webhook_payload sent to the integration or API caller. This field is also
   * used by the [Google Assistant
   * integration](https://cloud.google.com/dialogflow/docs/integrations/aog) for rich response
   * messages. See the format definition at [Google Assistant Dialogflow webhook
   * format](https://developers.google.com/assistant/actions/build/json/dialogflow-webhook-json)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> payload;

  /**
   * Optional. Additional session entity types to replace or extend developer entity types with. The
   * entity synonyms apply to all languages and persist for the session. Setting this data from a
   * webhook overwrites the session entity types that have been set using `detectIntent`,
   * `streamingDetectIntent` or SessionEntityType management methods.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1SessionEntityType> sessionEntityTypes;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2beta1SessionEntityType used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2beta1SessionEntityType.class);
  }

  /**
   * Optional. A custom field used to identify the webhook source. Arbitrary strings are supported.
   * When provided, Dialogflow uses this field to populate QueryResult.webhook_source sent to the
   * integration or API caller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * Optional. Indicates that this intent ends an interaction. Some integrations (e.g., Actions on
   * Google or Dialogflow phone gateway) use this information to close interaction with an end user.
   * Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEndInteraction() {
    return endInteraction;
  }

  /**
   * Optional. Indicates that this intent ends an interaction. Some integrations (e.g., Actions on
   * Google or Dialogflow phone gateway) use this information to close interaction with an end user.
   * Default is false.
   * @param endInteraction endInteraction or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookResponse setEndInteraction(java.lang.Boolean endInteraction) {
    this.endInteraction = endInteraction;
    return this;
  }

  /**
   * Optional. Invokes the supplied events. When this field is set, Dialogflow ignores the
   * `fulfillment_text`, `fulfillment_messages`, and `payload` fields.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1EventInput getFollowupEventInput() {
    return followupEventInput;
  }

  /**
   * Optional. Invokes the supplied events. When this field is set, Dialogflow ignores the
   * `fulfillment_text`, `fulfillment_messages`, and `payload` fields.
   * @param followupEventInput followupEventInput or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookResponse setFollowupEventInput(GoogleCloudDialogflowV2beta1EventInput followupEventInput) {
    this.followupEventInput = followupEventInput;
    return this;
  }

  /**
   * Optional. The rich response messages intended for the end-user. When provided, Dialogflow uses
   * this field to populate QueryResult.fulfillment_messages sent to the integration or API caller.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1IntentMessage> getFulfillmentMessages() {
    return fulfillmentMessages;
  }

  /**
   * Optional. The rich response messages intended for the end-user. When provided, Dialogflow uses
   * this field to populate QueryResult.fulfillment_messages sent to the integration or API caller.
   * @param fulfillmentMessages fulfillmentMessages or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookResponse setFulfillmentMessages(java.util.List<GoogleCloudDialogflowV2beta1IntentMessage> fulfillmentMessages) {
    this.fulfillmentMessages = fulfillmentMessages;
    return this;
  }

  /**
   * Optional. The text response message intended for the end-user. It is recommended to use
   * `fulfillment_messages.text.text[0]` instead. When provided, Dialogflow uses this field to
   * populate QueryResult.fulfillment_text sent to the integration or API caller.
   * @return value or {@code null} for none
   */
  public java.lang.String getFulfillmentText() {
    return fulfillmentText;
  }

  /**
   * Optional. The text response message intended for the end-user. It is recommended to use
   * `fulfillment_messages.text.text[0]` instead. When provided, Dialogflow uses this field to
   * populate QueryResult.fulfillment_text sent to the integration or API caller.
   * @param fulfillmentText fulfillmentText or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookResponse setFulfillmentText(java.lang.String fulfillmentText) {
    this.fulfillmentText = fulfillmentText;
    return this;
  }

  /**
   * Indicates that a live agent should be brought in to handle the interaction with the user. In
   * most cases, when you set this flag to true, you would also want to set end_interaction to true
   * as well. Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLiveAgentHandoff() {
    return liveAgentHandoff;
  }

  /**
   * Indicates that a live agent should be brought in to handle the interaction with the user. In
   * most cases, when you set this flag to true, you would also want to set end_interaction to true
   * as well. Default is false.
   * @param liveAgentHandoff liveAgentHandoff or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookResponse setLiveAgentHandoff(java.lang.Boolean liveAgentHandoff) {
    this.liveAgentHandoff = liveAgentHandoff;
    return this;
  }

  /**
   * Optional. The collection of output contexts that will overwrite currently active contexts for
   * the session and reset their lifespans. When provided, Dialogflow uses this field to populate
   * QueryResult.output_contexts sent to the integration or API caller.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1Context> getOutputContexts() {
    return outputContexts;
  }

  /**
   * Optional. The collection of output contexts that will overwrite currently active contexts for
   * the session and reset their lifespans. When provided, Dialogflow uses this field to populate
   * QueryResult.output_contexts sent to the integration or API caller.
   * @param outputContexts outputContexts or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookResponse setOutputContexts(java.util.List<GoogleCloudDialogflowV2beta1Context> outputContexts) {
    this.outputContexts = outputContexts;
    return this;
  }

  /**
   * Optional. This field can be used to pass custom data from your webhook to the integration or
   * API caller. Arbitrary JSON objects are supported. When provided, Dialogflow uses this field to
   * populate QueryResult.webhook_payload sent to the integration or API caller. This field is also
   * used by the [Google Assistant
   * integration](https://cloud.google.com/dialogflow/docs/integrations/aog) for rich response
   * messages. See the format definition at [Google Assistant Dialogflow webhook
   * format](https://developers.google.com/assistant/actions/build/json/dialogflow-webhook-json)
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getPayload() {
    return payload;
  }

  /**
   * Optional. This field can be used to pass custom data from your webhook to the integration or
   * API caller. Arbitrary JSON objects are supported. When provided, Dialogflow uses this field to
   * populate QueryResult.webhook_payload sent to the integration or API caller. This field is also
   * used by the [Google Assistant
   * integration](https://cloud.google.com/dialogflow/docs/integrations/aog) for rich response
   * messages. See the format definition at [Google Assistant Dialogflow webhook
   * format](https://developers.google.com/assistant/actions/build/json/dialogflow-webhook-json)
   * @param payload payload or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookResponse setPayload(java.util.Map<String, java.lang.Object> payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Optional. Additional session entity types to replace or extend developer entity types with. The
   * entity synonyms apply to all languages and persist for the session. Setting this data from a
   * webhook overwrites the session entity types that have been set using `detectIntent`,
   * `streamingDetectIntent` or SessionEntityType management methods.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1SessionEntityType> getSessionEntityTypes() {
    return sessionEntityTypes;
  }

  /**
   * Optional. Additional session entity types to replace or extend developer entity types with. The
   * entity synonyms apply to all languages and persist for the session. Setting this data from a
   * webhook overwrites the session entity types that have been set using `detectIntent`,
   * `streamingDetectIntent` or SessionEntityType management methods.
   * @param sessionEntityTypes sessionEntityTypes or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookResponse setSessionEntityTypes(java.util.List<GoogleCloudDialogflowV2beta1SessionEntityType> sessionEntityTypes) {
    this.sessionEntityTypes = sessionEntityTypes;
    return this;
  }

  /**
   * Optional. A custom field used to identify the webhook source. Arbitrary strings are supported.
   * When provided, Dialogflow uses this field to populate QueryResult.webhook_source sent to the
   * integration or API caller.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Optional. A custom field used to identify the webhook source. Arbitrary strings are supported.
   * When provided, Dialogflow uses this field to populate QueryResult.webhook_source sent to the
   * integration or API caller.
   * @param source source or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookResponse setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1WebhookResponse set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1WebhookResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1WebhookResponse clone() {
    return (GoogleCloudDialogflowV2beta1WebhookResponse) super.clone();
  }

}
