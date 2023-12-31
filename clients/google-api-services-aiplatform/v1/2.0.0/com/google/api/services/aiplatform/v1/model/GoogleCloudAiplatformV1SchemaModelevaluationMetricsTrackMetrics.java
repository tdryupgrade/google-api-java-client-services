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
 * UNIMPLEMENTED. Track matching model metrics for a single track match threshold and multiple label
 * match confidence thresholds.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Metrics for each label-match `confidenceThreshold` from 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99.
   * Precision-recall curve is derived from them.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics> confidenceMetrics;

  /**
   * The intersection-over-union threshold value between bounding boxes across frames used to
   * compute this metric entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float iouThreshold;

  /**
   * The mean bounding box iou over all confidence thresholds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float meanBoundingBoxIou;

  /**
   * The mean mismatch rate over all confidence thresholds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float meanMismatchRate;

  /**
   * The mean average precision over all confidence thresholds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float meanTrackingAveragePrecision;

  /**
   * Metrics for each label-match `confidenceThreshold` from 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99.
   * Precision-recall curve is derived from them.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics> getConfidenceMetrics() {
    return confidenceMetrics;
  }

  /**
   * Metrics for each label-match `confidenceThreshold` from 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99.
   * Precision-recall curve is derived from them.
   * @param confidenceMetrics confidenceMetrics or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics setConfidenceMetrics(java.util.List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics> confidenceMetrics) {
    this.confidenceMetrics = confidenceMetrics;
    return this;
  }

  /**
   * The intersection-over-union threshold value between bounding boxes across frames used to
   * compute this metric entry.
   * @return value or {@code null} for none
   */
  public java.lang.Float getIouThreshold() {
    return iouThreshold;
  }

  /**
   * The intersection-over-union threshold value between bounding boxes across frames used to
   * compute this metric entry.
   * @param iouThreshold iouThreshold or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics setIouThreshold(java.lang.Float iouThreshold) {
    this.iouThreshold = iouThreshold;
    return this;
  }

  /**
   * The mean bounding box iou over all confidence thresholds.
   * @return value or {@code null} for none
   */
  public java.lang.Float getMeanBoundingBoxIou() {
    return meanBoundingBoxIou;
  }

  /**
   * The mean bounding box iou over all confidence thresholds.
   * @param meanBoundingBoxIou meanBoundingBoxIou or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics setMeanBoundingBoxIou(java.lang.Float meanBoundingBoxIou) {
    this.meanBoundingBoxIou = meanBoundingBoxIou;
    return this;
  }

  /**
   * The mean mismatch rate over all confidence thresholds.
   * @return value or {@code null} for none
   */
  public java.lang.Float getMeanMismatchRate() {
    return meanMismatchRate;
  }

  /**
   * The mean mismatch rate over all confidence thresholds.
   * @param meanMismatchRate meanMismatchRate or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics setMeanMismatchRate(java.lang.Float meanMismatchRate) {
    this.meanMismatchRate = meanMismatchRate;
    return this;
  }

  /**
   * The mean average precision over all confidence thresholds.
   * @return value or {@code null} for none
   */
  public java.lang.Float getMeanTrackingAveragePrecision() {
    return meanTrackingAveragePrecision;
  }

  /**
   * The mean average precision over all confidence thresholds.
   * @param meanTrackingAveragePrecision meanTrackingAveragePrecision or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics setMeanTrackingAveragePrecision(java.lang.Float meanTrackingAveragePrecision) {
    this.meanTrackingAveragePrecision = meanTrackingAveragePrecision;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics clone() {
    return (GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics) super.clone();
  }

}
