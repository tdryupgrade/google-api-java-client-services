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
 * Statistics for IngestConversations operation.
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
public final class GoogleCloudContactcenterinsightsV1alpha1IngestConversationsMetadataIngestConversationsStats extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The number of objects skipped because another conversation with the same
   * transcript uri had already been ingested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer duplicatesSkippedCount;

  /**
   * Output only. The number of objects which were unable to be ingested due to errors. The errors
   * are populated in the partial_errors field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer failedIngestCount;

  /**
   * Output only. The number of objects processed during the ingest operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer processedObjectCount;

  /**
   * Output only. The number of new conversations added during this ingest operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer successfulIngestCount;

  /**
   * Output only. The number of objects skipped because another conversation with the same
   * transcript uri had already been ingested.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDuplicatesSkippedCount() {
    return duplicatesSkippedCount;
  }

  /**
   * Output only. The number of objects skipped because another conversation with the same
   * transcript uri had already been ingested.
   * @param duplicatesSkippedCount duplicatesSkippedCount or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1IngestConversationsMetadataIngestConversationsStats setDuplicatesSkippedCount(java.lang.Integer duplicatesSkippedCount) {
    this.duplicatesSkippedCount = duplicatesSkippedCount;
    return this;
  }

  /**
   * Output only. The number of objects which were unable to be ingested due to errors. The errors
   * are populated in the partial_errors field.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFailedIngestCount() {
    return failedIngestCount;
  }

  /**
   * Output only. The number of objects which were unable to be ingested due to errors. The errors
   * are populated in the partial_errors field.
   * @param failedIngestCount failedIngestCount or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1IngestConversationsMetadataIngestConversationsStats setFailedIngestCount(java.lang.Integer failedIngestCount) {
    this.failedIngestCount = failedIngestCount;
    return this;
  }

  /**
   * Output only. The number of objects processed during the ingest operation.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProcessedObjectCount() {
    return processedObjectCount;
  }

  /**
   * Output only. The number of objects processed during the ingest operation.
   * @param processedObjectCount processedObjectCount or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1IngestConversationsMetadataIngestConversationsStats setProcessedObjectCount(java.lang.Integer processedObjectCount) {
    this.processedObjectCount = processedObjectCount;
    return this;
  }

  /**
   * Output only. The number of new conversations added during this ingest operation.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSuccessfulIngestCount() {
    return successfulIngestCount;
  }

  /**
   * Output only. The number of new conversations added during this ingest operation.
   * @param successfulIngestCount successfulIngestCount or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1IngestConversationsMetadataIngestConversationsStats setSuccessfulIngestCount(java.lang.Integer successfulIngestCount) {
    this.successfulIngestCount = successfulIngestCount;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1alpha1IngestConversationsMetadataIngestConversationsStats set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1alpha1IngestConversationsMetadataIngestConversationsStats) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1alpha1IngestConversationsMetadataIngestConversationsStats clone() {
    return (GoogleCloudContactcenterinsightsV1alpha1IngestConversationsMetadataIngestConversationsStats) super.clone();
  }

}
