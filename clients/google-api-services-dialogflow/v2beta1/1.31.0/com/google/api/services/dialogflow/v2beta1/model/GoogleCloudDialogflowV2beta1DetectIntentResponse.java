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
 * The message returned from the DetectIntent method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1DetectIntentResponse extends com.google.api.client.json.GenericJson {

  /**
   * If Knowledge Connectors are enabled, there could be more than one result returned for a given
   * query or event, and this field will contain all results except for the top one, which is
   * captured in query_result. The alternative results are ordered by decreasing
   * `QueryResult.intent_detection_confidence`. If Knowledge Connectors are disabled, this field
   * will be empty until multiple responses for regular intents are supported, at which point those
   * additional results will be surfaced here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1QueryResult> alternativeQueryResults;

  /**
   * The audio data bytes encoded as specified in the request. Note: The output audio is generated
   * based on the values of default platform text responses found in the
   * `query_result.fulfillment_messages` field. If multiple default text responses exist, they will
   * be concatenated when generating audio. If no default platform text responses exist, the
   * generated audio content will be empty. In some scenarios, multiple output audio fields may be
   * present in the response structure. In these cases, only the top-most-level audio output has
   * content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputAudio;

  /**
   * The config used by the speech synthesizer to generate the output audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1OutputAudioConfig outputAudioConfig;

  /**
   * The selected results of the conversational query or event processing. See
   * `alternative_query_results` for additional potential results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1QueryResult queryResult;

  /**
   * The unique identifier of the response. It can be used to locate a response in the training
   * example set or for reporting issues.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseId;

  /**
   * Specifies the status of the webhook request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus webhookStatus;

  /**
   * If Knowledge Connectors are enabled, there could be more than one result returned for a given
   * query or event, and this field will contain all results except for the top one, which is
   * captured in query_result. The alternative results are ordered by decreasing
   * `QueryResult.intent_detection_confidence`. If Knowledge Connectors are disabled, this field
   * will be empty until multiple responses for regular intents are supported, at which point those
   * additional results will be surfaced here.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1QueryResult> getAlternativeQueryResults() {
    return alternativeQueryResults;
  }

  /**
   * If Knowledge Connectors are enabled, there could be more than one result returned for a given
   * query or event, and this field will contain all results except for the top one, which is
   * captured in query_result. The alternative results are ordered by decreasing
   * `QueryResult.intent_detection_confidence`. If Knowledge Connectors are disabled, this field
   * will be empty until multiple responses for regular intents are supported, at which point those
   * additional results will be surfaced here.
   * @param alternativeQueryResults alternativeQueryResults or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1DetectIntentResponse setAlternativeQueryResults(java.util.List<GoogleCloudDialogflowV2beta1QueryResult> alternativeQueryResults) {
    this.alternativeQueryResults = alternativeQueryResults;
    return this;
  }

  /**
   * The audio data bytes encoded as specified in the request. Note: The output audio is generated
   * based on the values of default platform text responses found in the
   * `query_result.fulfillment_messages` field. If multiple default text responses exist, they will
   * be concatenated when generating audio. If no default platform text responses exist, the
   * generated audio content will be empty. In some scenarios, multiple output audio fields may be
   * present in the response structure. In these cases, only the top-most-level audio output has
   * content.
   * @see #decodeOutputAudio()
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputAudio() {
    return outputAudio;
  }

  /**
   * The audio data bytes encoded as specified in the request. Note: The output audio is generated
   * based on the values of default platform text responses found in the
   * `query_result.fulfillment_messages` field. If multiple default text responses exist, they will
   * be concatenated when generating audio. If no default platform text responses exist, the
   * generated audio content will be empty. In some scenarios, multiple output audio fields may be
   * present in the response structure. In these cases, only the top-most-level audio output has
   * content.
   * @see #getOutputAudio()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeOutputAudio() {
    return com.google.api.client.util.Base64.decodeBase64(outputAudio);
  }

  /**
   * The audio data bytes encoded as specified in the request. Note: The output audio is generated
   * based on the values of default platform text responses found in the
   * `query_result.fulfillment_messages` field. If multiple default text responses exist, they will
   * be concatenated when generating audio. If no default platform text responses exist, the
   * generated audio content will be empty. In some scenarios, multiple output audio fields may be
   * present in the response structure. In these cases, only the top-most-level audio output has
   * content.
   * @see #encodeOutputAudio()
   * @param outputAudio outputAudio or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1DetectIntentResponse setOutputAudio(java.lang.String outputAudio) {
    this.outputAudio = outputAudio;
    return this;
  }

  /**
   * The audio data bytes encoded as specified in the request. Note: The output audio is generated
   * based on the values of default platform text responses found in the
   * `query_result.fulfillment_messages` field. If multiple default text responses exist, they will
   * be concatenated when generating audio. If no default platform text responses exist, the
   * generated audio content will be empty. In some scenarios, multiple output audio fields may be
   * present in the response structure. In these cases, only the top-most-level audio output has
   * content.
   * @see #setOutputAudio()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDialogflowV2beta1DetectIntentResponse encodeOutputAudio(byte[] outputAudio) {
    this.outputAudio = com.google.api.client.util.Base64.encodeBase64URLSafeString(outputAudio);
    return this;
  }

  /**
   * The config used by the speech synthesizer to generate the output audio.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1OutputAudioConfig getOutputAudioConfig() {
    return outputAudioConfig;
  }

  /**
   * The config used by the speech synthesizer to generate the output audio.
   * @param outputAudioConfig outputAudioConfig or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1DetectIntentResponse setOutputAudioConfig(GoogleCloudDialogflowV2beta1OutputAudioConfig outputAudioConfig) {
    this.outputAudioConfig = outputAudioConfig;
    return this;
  }

  /**
   * The selected results of the conversational query or event processing. See
   * `alternative_query_results` for additional potential results.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult getQueryResult() {
    return queryResult;
  }

  /**
   * The selected results of the conversational query or event processing. See
   * `alternative_query_results` for additional potential results.
   * @param queryResult queryResult or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1DetectIntentResponse setQueryResult(GoogleCloudDialogflowV2beta1QueryResult queryResult) {
    this.queryResult = queryResult;
    return this;
  }

  /**
   * The unique identifier of the response. It can be used to locate a response in the training
   * example set or for reporting issues.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseId() {
    return responseId;
  }

  /**
   * The unique identifier of the response. It can be used to locate a response in the training
   * example set or for reporting issues.
   * @param responseId responseId or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1DetectIntentResponse setResponseId(java.lang.String responseId) {
    this.responseId = responseId;
    return this;
  }

  /**
   * Specifies the status of the webhook request.
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getWebhookStatus() {
    return webhookStatus;
  }

  /**
   * Specifies the status of the webhook request.
   * @param webhookStatus webhookStatus or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1DetectIntentResponse setWebhookStatus(GoogleRpcStatus webhookStatus) {
    this.webhookStatus = webhookStatus;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1DetectIntentResponse set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1DetectIntentResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1DetectIntentResponse clone() {
    return (GoogleCloudDialogflowV2beta1DetectIntentResponse) super.clone();
  }

}
