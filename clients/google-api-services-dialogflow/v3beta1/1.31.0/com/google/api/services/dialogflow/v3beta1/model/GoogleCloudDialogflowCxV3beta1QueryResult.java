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
 * Represents the result of a conversational query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1QueryResult extends com.google.api.client.json.GenericJson {

  /**
   * The current Page. Some, not all fields are filled in this message, including but not limited to
   * `name` and `display_name`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1Page currentPage;

  /**
   * The free-form diagnostic info. For example, this field could contain webhook call latency. The
   * fields of this data can change without notice, so you should not write code that depends on its
   * structure. One of the fields is called "Alternative Matched Intents", which may aid with
   * debugging. The following describes these intent results: - The list is empty if no intent was
   * matched to end-user input. - Only intents that are referenced in the currently active flow are
   * included. - The matched intent is included. - Other intents that could have matched end-user
   * input, but did not match because they are referenced by intent routes that are out of
   * [scope](https://cloud.google.com/dialogflow/cx/docs/concept/handler#scope), are included. -
   * Other intents referenced by intent routes in scope that matched end-user input, but had a lower
   * confidence score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> diagnosticInfo;

  /**
   * If a DTMF was provided as input, this field will contain a copy of the DTMFInput.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1DtmfInput dtmf;

  /**
   * The Intent that matched the conversational query. Some, not all fields are filled in this
   * message, including but not limited to: `name` and `display_name`. This field is deprecated,
   * please use QueryResult.match instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1Intent intent;

  /**
   * The intent detection confidence. Values range from 0.0 (completely uncertain) to 1.0
   * (completely certain). This value is for informational purpose only and is only used to help
   * match the best intent within the classification threshold. This value may change for the same
   * end-user expression at any time due to a model retraining or change in implementation. This
   * field is deprecated, please use QueryResult.match instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float intentDetectionConfidence;

  /**
   * The language that was triggered during intent detection. See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the
   * currently supported language codes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Intent match result, could be an intent or an event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1Match match;

  /**
   * The collected session parameters. Depending on your protocol or client library language, this
   * is a map, associative array, symbol table, dictionary, or JSON object composed of a collection
   * of (MapKey, MapValue) pairs: * MapKey type: string * MapKey value: parameter name * MapValue
   * type: If parameter's entity type is a composite entity then use map, otherwise, depending on
   * the parameter value type, it could be one of string, number, boolean, null, list or map. *
   * MapValue value: If parameter's entity type is a composite entity then use map from composite
   * entity property names to property values, otherwise, use parameter value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> parameters;

  /**
   * The list of rich messages returned to the client. Responses vary from simple text messages to
   * more sophisticated, structured payloads used to drive complex logic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3beta1ResponseMessage> responseMessages;

  /**
   * The sentiment analyss result, which depends on `analyze_query_text_sentiment`, specified in the
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1SentimentAnalysisResult sentimentAnalysisResult;

  /**
   * If natural language text was provided as input, this field will contain a copy of the text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * If natural language speech audio was provided as input, this field will contain the transcript
   * for the audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transcript;

  /**
   * If an event was provided as input, this field will contain the name of the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String triggerEvent;

  /**
   * If an intent was provided as input, this field will contain a copy of the intent identifier.
   * Format: `projects//locations//agents//intents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String triggerIntent;

  /**
   * The list of webhook payload in WebhookResponse.payload, in the order of call sequence. If some
   * webhook call fails or doesn't return any payload, an empty `Struct` would be used instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.util.Map<String, java.lang.Object>> webhookPayloads;

  /**
   * The list of webhook call status in the order of call sequence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleRpcStatus> webhookStatuses;

  /**
   * The current Page. Some, not all fields are filled in this message, including but not limited to
   * `name` and `display_name`.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Page getCurrentPage() {
    return currentPage;
  }

  /**
   * The current Page. Some, not all fields are filled in this message, including but not limited to
   * `name` and `display_name`.
   * @param currentPage currentPage or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setCurrentPage(GoogleCloudDialogflowCxV3beta1Page currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * The free-form diagnostic info. For example, this field could contain webhook call latency. The
   * fields of this data can change without notice, so you should not write code that depends on its
   * structure. One of the fields is called "Alternative Matched Intents", which may aid with
   * debugging. The following describes these intent results: - The list is empty if no intent was
   * matched to end-user input. - Only intents that are referenced in the currently active flow are
   * included. - The matched intent is included. - Other intents that could have matched end-user
   * input, but did not match because they are referenced by intent routes that are out of
   * [scope](https://cloud.google.com/dialogflow/cx/docs/concept/handler#scope), are included. -
   * Other intents referenced by intent routes in scope that matched end-user input, but had a lower
   * confidence score.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getDiagnosticInfo() {
    return diagnosticInfo;
  }

  /**
   * The free-form diagnostic info. For example, this field could contain webhook call latency. The
   * fields of this data can change without notice, so you should not write code that depends on its
   * structure. One of the fields is called "Alternative Matched Intents", which may aid with
   * debugging. The following describes these intent results: - The list is empty if no intent was
   * matched to end-user input. - Only intents that are referenced in the currently active flow are
   * included. - The matched intent is included. - Other intents that could have matched end-user
   * input, but did not match because they are referenced by intent routes that are out of
   * [scope](https://cloud.google.com/dialogflow/cx/docs/concept/handler#scope), are included. -
   * Other intents referenced by intent routes in scope that matched end-user input, but had a lower
   * confidence score.
   * @param diagnosticInfo diagnosticInfo or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setDiagnosticInfo(java.util.Map<String, java.lang.Object> diagnosticInfo) {
    this.diagnosticInfo = diagnosticInfo;
    return this;
  }

  /**
   * If a DTMF was provided as input, this field will contain a copy of the DTMFInput.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1DtmfInput getDtmf() {
    return dtmf;
  }

  /**
   * If a DTMF was provided as input, this field will contain a copy of the DTMFInput.
   * @param dtmf dtmf or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setDtmf(GoogleCloudDialogflowCxV3beta1DtmfInput dtmf) {
    this.dtmf = dtmf;
    return this;
  }

  /**
   * The Intent that matched the conversational query. Some, not all fields are filled in this
   * message, including but not limited to: `name` and `display_name`. This field is deprecated,
   * please use QueryResult.match instead.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Intent getIntent() {
    return intent;
  }

  /**
   * The Intent that matched the conversational query. Some, not all fields are filled in this
   * message, including but not limited to: `name` and `display_name`. This field is deprecated,
   * please use QueryResult.match instead.
   * @param intent intent or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setIntent(GoogleCloudDialogflowCxV3beta1Intent intent) {
    this.intent = intent;
    return this;
  }

  /**
   * The intent detection confidence. Values range from 0.0 (completely uncertain) to 1.0
   * (completely certain). This value is for informational purpose only and is only used to help
   * match the best intent within the classification threshold. This value may change for the same
   * end-user expression at any time due to a model retraining or change in implementation. This
   * field is deprecated, please use QueryResult.match instead.
   * @return value or {@code null} for none
   */
  public java.lang.Float getIntentDetectionConfidence() {
    return intentDetectionConfidence;
  }

  /**
   * The intent detection confidence. Values range from 0.0 (completely uncertain) to 1.0
   * (completely certain). This value is for informational purpose only and is only used to help
   * match the best intent within the classification threshold. This value may change for the same
   * end-user expression at any time due to a model retraining or change in implementation. This
   * field is deprecated, please use QueryResult.match instead.
   * @param intentDetectionConfidence intentDetectionConfidence or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setIntentDetectionConfidence(java.lang.Float intentDetectionConfidence) {
    this.intentDetectionConfidence = intentDetectionConfidence;
    return this;
  }

  /**
   * The language that was triggered during intent detection. See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the
   * currently supported language codes.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * The language that was triggered during intent detection. See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the
   * currently supported language codes.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Intent match result, could be an intent or an event.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Match getMatch() {
    return match;
  }

  /**
   * Intent match result, could be an intent or an event.
   * @param match match or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setMatch(GoogleCloudDialogflowCxV3beta1Match match) {
    this.match = match;
    return this;
  }

  /**
   * The collected session parameters. Depending on your protocol or client library language, this
   * is a map, associative array, symbol table, dictionary, or JSON object composed of a collection
   * of (MapKey, MapValue) pairs: * MapKey type: string * MapKey value: parameter name * MapValue
   * type: If parameter's entity type is a composite entity then use map, otherwise, depending on
   * the parameter value type, it could be one of string, number, boolean, null, list or map. *
   * MapValue value: If parameter's entity type is a composite entity then use map from composite
   * entity property names to property values, otherwise, use parameter value.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getParameters() {
    return parameters;
  }

  /**
   * The collected session parameters. Depending on your protocol or client library language, this
   * is a map, associative array, symbol table, dictionary, or JSON object composed of a collection
   * of (MapKey, MapValue) pairs: * MapKey type: string * MapKey value: parameter name * MapValue
   * type: If parameter's entity type is a composite entity then use map, otherwise, depending on
   * the parameter value type, it could be one of string, number, boolean, null, list or map. *
   * MapValue value: If parameter's entity type is a composite entity then use map from composite
   * entity property names to property values, otherwise, use parameter value.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setParameters(java.util.Map<String, java.lang.Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * The list of rich messages returned to the client. Responses vary from simple text messages to
   * more sophisticated, structured payloads used to drive complex logic.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3beta1ResponseMessage> getResponseMessages() {
    return responseMessages;
  }

  /**
   * The list of rich messages returned to the client. Responses vary from simple text messages to
   * more sophisticated, structured payloads used to drive complex logic.
   * @param responseMessages responseMessages or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setResponseMessages(java.util.List<GoogleCloudDialogflowCxV3beta1ResponseMessage> responseMessages) {
    this.responseMessages = responseMessages;
    return this;
  }

  /**
   * The sentiment analyss result, which depends on `analyze_query_text_sentiment`, specified in the
   * request.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1SentimentAnalysisResult getSentimentAnalysisResult() {
    return sentimentAnalysisResult;
  }

  /**
   * The sentiment analyss result, which depends on `analyze_query_text_sentiment`, specified in the
   * request.
   * @param sentimentAnalysisResult sentimentAnalysisResult or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setSentimentAnalysisResult(GoogleCloudDialogflowCxV3beta1SentimentAnalysisResult sentimentAnalysisResult) {
    this.sentimentAnalysisResult = sentimentAnalysisResult;
    return this;
  }

  /**
   * If natural language text was provided as input, this field will contain a copy of the text.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * If natural language text was provided as input, this field will contain a copy of the text.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * If natural language speech audio was provided as input, this field will contain the transcript
   * for the audio.
   * @return value or {@code null} for none
   */
  public java.lang.String getTranscript() {
    return transcript;
  }

  /**
   * If natural language speech audio was provided as input, this field will contain the transcript
   * for the audio.
   * @param transcript transcript or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setTranscript(java.lang.String transcript) {
    this.transcript = transcript;
    return this;
  }

  /**
   * If an event was provided as input, this field will contain the name of the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getTriggerEvent() {
    return triggerEvent;
  }

  /**
   * If an event was provided as input, this field will contain the name of the event.
   * @param triggerEvent triggerEvent or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setTriggerEvent(java.lang.String triggerEvent) {
    this.triggerEvent = triggerEvent;
    return this;
  }

  /**
   * If an intent was provided as input, this field will contain a copy of the intent identifier.
   * Format: `projects//locations//agents//intents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getTriggerIntent() {
    return triggerIntent;
  }

  /**
   * If an intent was provided as input, this field will contain a copy of the intent identifier.
   * Format: `projects//locations//agents//intents/`.
   * @param triggerIntent triggerIntent or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setTriggerIntent(java.lang.String triggerIntent) {
    this.triggerIntent = triggerIntent;
    return this;
  }

  /**
   * The list of webhook payload in WebhookResponse.payload, in the order of call sequence. If some
   * webhook call fails or doesn't return any payload, an empty `Struct` would be used instead.
   * @return value or {@code null} for none
   */
  public java.util.List<java.util.Map<String, java.lang.Object>> getWebhookPayloads() {
    return webhookPayloads;
  }

  /**
   * The list of webhook payload in WebhookResponse.payload, in the order of call sequence. If some
   * webhook call fails or doesn't return any payload, an empty `Struct` would be used instead.
   * @param webhookPayloads webhookPayloads or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setWebhookPayloads(java.util.List<java.util.Map<String, java.lang.Object>> webhookPayloads) {
    this.webhookPayloads = webhookPayloads;
    return this;
  }

  /**
   * The list of webhook call status in the order of call sequence.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleRpcStatus> getWebhookStatuses() {
    return webhookStatuses;
  }

  /**
   * The list of webhook call status in the order of call sequence.
   * @param webhookStatuses webhookStatuses or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1QueryResult setWebhookStatuses(java.util.List<GoogleRpcStatus> webhookStatuses) {
    this.webhookStatuses = webhookStatuses;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1QueryResult set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1QueryResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1QueryResult clone() {
    return (GoogleCloudDialogflowCxV3beta1QueryResult) super.clone();
  }

}
