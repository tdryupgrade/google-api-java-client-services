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

package com.google.api.services.aiplatform.v1.model;

/**
 * Message to select time range and feature. Values of the selected feature generated within an
 * inclusive time range will be deleted. Using this option permanently deletes the feature values
 * from the specified feature IDs within the specified time range. This might include data from the
 * online storage. If you want to retain any deleted historical data in the online storage, you must
 * re-ingest it.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature extends com.google.api.client.json.GenericJson {

  /**
   * Required. Selectors choosing which feature values to be deleted from the EntityType.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1FeatureSelector featureSelector;

  /**
   * If set, data will not be deleted from online storage. When time range is older than the data in
   * online storage, setting this to be true will make the deletion have no impact on online
   * serving.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean skipOnlineStorageDelete;

  /**
   * Required. Select feature generated within a half-inclusive time range. The time range is lower
   * inclusive and upper exclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeInterval timeRange;

  /**
   * Required. Selectors choosing which feature values to be deleted from the EntityType.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1FeatureSelector getFeatureSelector() {
    return featureSelector;
  }

  /**
   * Required. Selectors choosing which feature values to be deleted from the EntityType.
   * @param featureSelector featureSelector or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature setFeatureSelector(GoogleCloudAiplatformV1FeatureSelector featureSelector) {
    this.featureSelector = featureSelector;
    return this;
  }

  /**
   * If set, data will not be deleted from online storage. When time range is older than the data in
   * online storage, setting this to be true will make the deletion have no impact on online
   * serving.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSkipOnlineStorageDelete() {
    return skipOnlineStorageDelete;
  }

  /**
   * If set, data will not be deleted from online storage. When time range is older than the data in
   * online storage, setting this to be true will make the deletion have no impact on online
   * serving.
   * @param skipOnlineStorageDelete skipOnlineStorageDelete or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature setSkipOnlineStorageDelete(java.lang.Boolean skipOnlineStorageDelete) {
    this.skipOnlineStorageDelete = skipOnlineStorageDelete;
    return this;
  }

  /**
   * Required. Select feature generated within a half-inclusive time range. The time range is lower
   * inclusive and upper exclusive.
   * @return value or {@code null} for none
   */
  public GoogleTypeInterval getTimeRange() {
    return timeRange;
  }

  /**
   * Required. Select feature generated within a half-inclusive time range. The time range is lower
   * inclusive and upper exclusive.
   * @param timeRange timeRange or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature setTimeRange(GoogleTypeInterval timeRange) {
    this.timeRange = timeRange;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature clone() {
    return (GoogleCloudAiplatformV1DeleteFeatureValuesRequestSelectTimeRangeAndFeature) super.clone();
  }

}
