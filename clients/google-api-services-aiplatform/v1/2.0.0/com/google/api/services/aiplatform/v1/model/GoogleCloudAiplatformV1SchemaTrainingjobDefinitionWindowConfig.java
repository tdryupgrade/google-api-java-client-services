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
 * Config that contains the strategy used to generate sliding windows in time series training. A
 * window is a series of rows that comprise the context up to the time of prediction, and the
 * horizon following. The corresponding row for each window marks the start of the forecast horizon.
 * Each window is used as an input example for training/evaluation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1SchemaTrainingjobDefinitionWindowConfig extends com.google.api.client.json.GenericJson {

  /**
   * Name of the column that should be used to generate sliding windows. The column should contain
   * either booleans or string booleans; if the value of the row is True, generate a sliding window
   * with the horizon starting at that row. The column will not be used as a feature in training.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String column;

  /**
   * Maximum number of windows that should be generated across all time series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxCount;

  /**
   * Stride length used to generate input examples. Within one time series, every {$STRIDE_LENGTH}
   * rows will be used to generate a sliding window.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long strideLength;

  /**
   * Name of the column that should be used to generate sliding windows. The column should contain
   * either booleans or string booleans; if the value of the row is True, generate a sliding window
   * with the horizon starting at that row. The column will not be used as a feature in training.
   * @return value or {@code null} for none
   */
  public java.lang.String getColumn() {
    return column;
  }

  /**
   * Name of the column that should be used to generate sliding windows. The column should contain
   * either booleans or string booleans; if the value of the row is True, generate a sliding window
   * with the horizon starting at that row. The column will not be used as a feature in training.
   * @param column column or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionWindowConfig setColumn(java.lang.String column) {
    this.column = column;
    return this;
  }

  /**
   * Maximum number of windows that should be generated across all time series.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxCount() {
    return maxCount;
  }

  /**
   * Maximum number of windows that should be generated across all time series.
   * @param maxCount maxCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionWindowConfig setMaxCount(java.lang.Long maxCount) {
    this.maxCount = maxCount;
    return this;
  }

  /**
   * Stride length used to generate input examples. Within one time series, every {$STRIDE_LENGTH}
   * rows will be used to generate a sliding window.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStrideLength() {
    return strideLength;
  }

  /**
   * Stride length used to generate input examples. Within one time series, every {$STRIDE_LENGTH}
   * rows will be used to generate a sliding window.
   * @param strideLength strideLength or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionWindowConfig setStrideLength(java.lang.Long strideLength) {
    this.strideLength = strideLength;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionWindowConfig set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1SchemaTrainingjobDefinitionWindowConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1SchemaTrainingjobDefinitionWindowConfig clone() {
    return (GoogleCloudAiplatformV1SchemaTrainingjobDefinitionWindowConfig) super.clone();
  }

}
