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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * Agent Assist Smart Compose suggestion data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1SmartComposeSuggestionData extends com.google.api.client.json.GenericJson {

  /**
   * The system's confidence score that this suggestion is a good match for this conversation,
   * ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double confidenceScore;

  /**
   * Map that contains metadata about the Smart Compose suggestion and the document from which it
   * originates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * Name of the query record. Format:
   * projects/{project}/locations/{location}/queryRecords/{query_record}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queryRecord;

  /**
   * The content of the suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suggestion;

  /**
   * The system's confidence score that this suggestion is a good match for this conversation,
   * ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
   * @return value or {@code null} for none
   */
  public java.lang.Double getConfidenceScore() {
    return confidenceScore;
  }

  /**
   * The system's confidence score that this suggestion is a good match for this conversation,
   * ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
   * @param confidenceScore confidenceScore or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1SmartComposeSuggestionData setConfidenceScore(java.lang.Double confidenceScore) {
    this.confidenceScore = confidenceScore;
    return this;
  }

  /**
   * Map that contains metadata about the Smart Compose suggestion and the document from which it
   * originates.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * Map that contains metadata about the Smart Compose suggestion and the document from which it
   * originates.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1SmartComposeSuggestionData setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Name of the query record. Format:
   * projects/{project}/locations/{location}/queryRecords/{query_record}
   * @return value or {@code null} for none
   */
  public java.lang.String getQueryRecord() {
    return queryRecord;
  }

  /**
   * Name of the query record. Format:
   * projects/{project}/locations/{location}/queryRecords/{query_record}
   * @param queryRecord queryRecord or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1SmartComposeSuggestionData setQueryRecord(java.lang.String queryRecord) {
    this.queryRecord = queryRecord;
    return this;
  }

  /**
   * The content of the suggestion.
   * @return value or {@code null} for none
   */
  public java.lang.String getSuggestion() {
    return suggestion;
  }

  /**
   * The content of the suggestion.
   * @param suggestion suggestion or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1SmartComposeSuggestionData setSuggestion(java.lang.String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1SmartComposeSuggestionData set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1SmartComposeSuggestionData) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1SmartComposeSuggestionData clone() {
    return (GoogleCloudContactcenterinsightsV1SmartComposeSuggestionData) super.clone();
  }

}
