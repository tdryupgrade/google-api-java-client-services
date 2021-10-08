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
 * Represents the parameters of the conversational query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2QueryParameters extends com.google.api.client.json.GenericJson {

  /**
   * The collection of contexts to be activated before this query is executed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2Context> contexts;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2Context used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2Context.class);
  }

  /**
   * The geo location of this conversational query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeLatLng geoLocation;

  /**
   * This field can be used to pass custom data to your webhook. Arbitrary JSON objects are
   * supported. If supplied, the value is used to populate the
   * `WebhookRequest.original_detect_intent_request.payload` field sent to your webhook.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> payload;

  /**
   * Specifies whether to delete all contexts in the current session before the new ones are
   * activated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean resetContexts;

  /**
   * Configures the type of sentiment analysis to perform. If not provided, sentiment analysis is
   * not performed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2SentimentAnalysisRequestConfig sentimentAnalysisRequestConfig;

  /**
   * Additional session entity types to replace or extend developer entity types with. The entity
   * synonyms apply to all languages and persist for the session of this query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2SessionEntityType> sessionEntityTypes;

  /**
   * The time zone of this conversational query from the [time zone database](https://www.iana.org
   * /time-zones), e.g., America/New_York, Europe/Paris. If not provided, the time zone specified in
   * agent settings is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * This field can be used to pass HTTP headers for a webhook call. These headers will be sent to
   * webhook along with the headers that have been configured through the Dialogflow web console.
   * The headers defined within this field will overwrite the headers configured through the
   * Dialogflow console if there is a conflict. Header names are case-insensitive. Google's
   * specified headers are not allowed. Including: "Host", "Content-Length", "Connection", "From",
   * "User-Agent", "Accept-Encoding", "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> webhookHeaders;

  /**
   * The collection of contexts to be activated before this query is executed.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2Context> getContexts() {
    return contexts;
  }

  /**
   * The collection of contexts to be activated before this query is executed.
   * @param contexts contexts or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setContexts(java.util.List<GoogleCloudDialogflowV2Context> contexts) {
    this.contexts = contexts;
    return this;
  }

  /**
   * The geo location of this conversational query.
   * @return value or {@code null} for none
   */
  public GoogleTypeLatLng getGeoLocation() {
    return geoLocation;
  }

  /**
   * The geo location of this conversational query.
   * @param geoLocation geoLocation or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setGeoLocation(GoogleTypeLatLng geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

  /**
   * This field can be used to pass custom data to your webhook. Arbitrary JSON objects are
   * supported. If supplied, the value is used to populate the
   * `WebhookRequest.original_detect_intent_request.payload` field sent to your webhook.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getPayload() {
    return payload;
  }

  /**
   * This field can be used to pass custom data to your webhook. Arbitrary JSON objects are
   * supported. If supplied, the value is used to populate the
   * `WebhookRequest.original_detect_intent_request.payload` field sent to your webhook.
   * @param payload payload or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setPayload(java.util.Map<String, java.lang.Object> payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Specifies whether to delete all contexts in the current session before the new ones are
   * activated.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getResetContexts() {
    return resetContexts;
  }

  /**
   * Specifies whether to delete all contexts in the current session before the new ones are
   * activated.
   * @param resetContexts resetContexts or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setResetContexts(java.lang.Boolean resetContexts) {
    this.resetContexts = resetContexts;
    return this;
  }

  /**
   * Configures the type of sentiment analysis to perform. If not provided, sentiment analysis is
   * not performed.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2SentimentAnalysisRequestConfig getSentimentAnalysisRequestConfig() {
    return sentimentAnalysisRequestConfig;
  }

  /**
   * Configures the type of sentiment analysis to perform. If not provided, sentiment analysis is
   * not performed.
   * @param sentimentAnalysisRequestConfig sentimentAnalysisRequestConfig or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setSentimentAnalysisRequestConfig(GoogleCloudDialogflowV2SentimentAnalysisRequestConfig sentimentAnalysisRequestConfig) {
    this.sentimentAnalysisRequestConfig = sentimentAnalysisRequestConfig;
    return this;
  }

  /**
   * Additional session entity types to replace or extend developer entity types with. The entity
   * synonyms apply to all languages and persist for the session of this query.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2SessionEntityType> getSessionEntityTypes() {
    return sessionEntityTypes;
  }

  /**
   * Additional session entity types to replace or extend developer entity types with. The entity
   * synonyms apply to all languages and persist for the session of this query.
   * @param sessionEntityTypes sessionEntityTypes or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setSessionEntityTypes(java.util.List<GoogleCloudDialogflowV2SessionEntityType> sessionEntityTypes) {
    this.sessionEntityTypes = sessionEntityTypes;
    return this;
  }

  /**
   * The time zone of this conversational query from the [time zone database](https://www.iana.org
   * /time-zones), e.g., America/New_York, Europe/Paris. If not provided, the time zone specified in
   * agent settings is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * The time zone of this conversational query from the [time zone database](https://www.iana.org
   * /time-zones), e.g., America/New_York, Europe/Paris. If not provided, the time zone specified in
   * agent settings is used.
   * @param timeZone timeZone or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * This field can be used to pass HTTP headers for a webhook call. These headers will be sent to
   * webhook along with the headers that have been configured through the Dialogflow web console.
   * The headers defined within this field will overwrite the headers configured through the
   * Dialogflow console if there is a conflict. Header names are case-insensitive. Google's
   * specified headers are not allowed. Including: "Host", "Content-Length", "Connection", "From",
   * "User-Agent", "Accept-Encoding", "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getWebhookHeaders() {
    return webhookHeaders;
  }

  /**
   * This field can be used to pass HTTP headers for a webhook call. These headers will be sent to
   * webhook along with the headers that have been configured through the Dialogflow web console.
   * The headers defined within this field will overwrite the headers configured through the
   * Dialogflow console if there is a conflict. Header names are case-insensitive. Google's
   * specified headers are not allowed. Including: "Host", "Content-Length", "Connection", "From",
   * "User-Agent", "Accept-Encoding", "If-Modified-Since", "If-None-Match", "X-Forwarded-For", etc.
   * @param webhookHeaders webhookHeaders or {@code null} for none
   */
  public GoogleCloudDialogflowV2QueryParameters setWebhookHeaders(java.util.Map<String, java.lang.String> webhookHeaders) {
    this.webhookHeaders = webhookHeaders;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2QueryParameters set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2QueryParameters) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2QueryParameters clone() {
    return (GoogleCloudDialogflowV2QueryParameters) super.clone();
  }

}
