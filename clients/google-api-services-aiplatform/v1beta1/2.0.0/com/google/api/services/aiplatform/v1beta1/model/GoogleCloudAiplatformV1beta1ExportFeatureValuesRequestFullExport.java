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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Describes exporting all historical Feature values of all entities of the EntityType between
 * [start_time, end_time].
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ExportFeatureValuesRequestFullExport extends com.google.api.client.json.GenericJson {

  /**
   * Exports Feature values as of this timestamp. If not set, retrieve values as of now. Timestamp,
   * if present, must not have higher than millisecond precision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Excludes Feature values with feature generation timestamp before this timestamp. If not set,
   * retrieve oldest values kept in Feature Store. Timestamp, if present, must not have higher than
   * millisecond precision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Exports Feature values as of this timestamp. If not set, retrieve values as of now. Timestamp,
   * if present, must not have higher than millisecond precision.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Exports Feature values as of this timestamp. If not set, retrieve values as of now. Timestamp,
   * if present, must not have higher than millisecond precision.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExportFeatureValuesRequestFullExport setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Excludes Feature values with feature generation timestamp before this timestamp. If not set,
   * retrieve oldest values kept in Feature Store. Timestamp, if present, must not have higher than
   * millisecond precision.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Excludes Feature values with feature generation timestamp before this timestamp. If not set,
   * retrieve oldest values kept in Feature Store. Timestamp, if present, must not have higher than
   * millisecond precision.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExportFeatureValuesRequestFullExport setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ExportFeatureValuesRequestFullExport set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ExportFeatureValuesRequestFullExport) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ExportFeatureValuesRequestFullExport clone() {
    return (GoogleCloudAiplatformV1beta1ExportFeatureValuesRequestFullExport) super.clone();
  }

}
