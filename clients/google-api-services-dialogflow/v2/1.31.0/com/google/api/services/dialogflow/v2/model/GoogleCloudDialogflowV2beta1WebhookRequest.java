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
 * The request message for a webhook call.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1WebhookRequest extends com.google.api.client.json.GenericJson {

  /**
   * Alternative query results from KnowledgeService.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1QueryResult> alternativeQueryResults;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2beta1QueryResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2beta1QueryResult.class);
  }

  /**
   * Optional. The contents of the original request that was passed to `[Streaming]DetectIntent`
   * call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1OriginalDetectIntentRequest originalDetectIntentRequest;

  /**
   * The result of the conversational query or event processing. Contains the same value as
   * `[Streaming]DetectIntentResponse.query_result`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1QueryResult queryResult;

  /**
   * The unique identifier of the response. Contains the same value as
   * `[Streaming]DetectIntentResponse.response_id`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseId;

  /**
   * The unique identifier of detectIntent request session. Can be used to identify end-user inside
   * webhook implementation. Supported formats: - `projects//agent/sessions/, -
   * `projects//locations//agent/sessions/`, - `projects//agent/environments//users//sessions/`, -
   * `projects//locations//agent/environments//users//sessions/`,
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String session;

  /**
   * Alternative query results from KnowledgeService.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1QueryResult> getAlternativeQueryResults() {
    return alternativeQueryResults;
  }

  /**
   * Alternative query results from KnowledgeService.
   * @param alternativeQueryResults alternativeQueryResults or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookRequest setAlternativeQueryResults(java.util.List<GoogleCloudDialogflowV2beta1QueryResult> alternativeQueryResults) {
    this.alternativeQueryResults = alternativeQueryResults;
    return this;
  }

  /**
   * Optional. The contents of the original request that was passed to `[Streaming]DetectIntent`
   * call.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
    return originalDetectIntentRequest;
  }

  /**
   * Optional. The contents of the original request that was passed to `[Streaming]DetectIntent`
   * call.
   * @param originalDetectIntentRequest originalDetectIntentRequest or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookRequest setOriginalDetectIntentRequest(GoogleCloudDialogflowV2beta1OriginalDetectIntentRequest originalDetectIntentRequest) {
    this.originalDetectIntentRequest = originalDetectIntentRequest;
    return this;
  }

  /**
   * The result of the conversational query or event processing. Contains the same value as
   * `[Streaming]DetectIntentResponse.query_result`.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1QueryResult getQueryResult() {
    return queryResult;
  }

  /**
   * The result of the conversational query or event processing. Contains the same value as
   * `[Streaming]DetectIntentResponse.query_result`.
   * @param queryResult queryResult or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookRequest setQueryResult(GoogleCloudDialogflowV2beta1QueryResult queryResult) {
    this.queryResult = queryResult;
    return this;
  }

  /**
   * The unique identifier of the response. Contains the same value as
   * `[Streaming]DetectIntentResponse.response_id`.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseId() {
    return responseId;
  }

  /**
   * The unique identifier of the response. Contains the same value as
   * `[Streaming]DetectIntentResponse.response_id`.
   * @param responseId responseId or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookRequest setResponseId(java.lang.String responseId) {
    this.responseId = responseId;
    return this;
  }

  /**
   * The unique identifier of detectIntent request session. Can be used to identify end-user inside
   * webhook implementation. Supported formats: - `projects//agent/sessions/, -
   * `projects//locations//agent/sessions/`, - `projects//agent/environments//users//sessions/`, -
   * `projects//locations//agent/environments//users//sessions/`,
   * @return value or {@code null} for none
   */
  public java.lang.String getSession() {
    return session;
  }

  /**
   * The unique identifier of detectIntent request session. Can be used to identify end-user inside
   * webhook implementation. Supported formats: - `projects//agent/sessions/, -
   * `projects//locations//agent/sessions/`, - `projects//agent/environments//users//sessions/`, -
   * `projects//locations//agent/environments//users//sessions/`,
   * @param session session or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1WebhookRequest setSession(java.lang.String session) {
    this.session = session;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1WebhookRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1WebhookRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1WebhookRequest clone() {
    return (GoogleCloudDialogflowV2beta1WebhookRequest) super.clone();
  }

}
