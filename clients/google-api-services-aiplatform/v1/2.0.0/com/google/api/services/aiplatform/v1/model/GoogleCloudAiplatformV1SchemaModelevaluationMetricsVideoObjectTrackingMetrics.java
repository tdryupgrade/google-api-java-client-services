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
 * Model evaluation metrics for video object tracking problems. Evaluates prediction quality of both
 * labeled bounding boxes and labeled tracks (i.e. series of bounding boxes sharing same label and
 * instance ID).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics extends com.google.api.client.json.GenericJson {

  /**
   * The single metric for bounding boxes evaluation: the `meanAveragePrecision` averaged over all
   * `boundingBoxMetrics`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float boundingBoxMeanAveragePrecision;

  /**
   * The bounding boxes match metrics for each intersection-over-union threshold
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 and each label confidence threshold
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 pair.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsBoundingBoxMetrics> boundingBoxMetrics;

  static {
    // hack to force ProGuard to consider GoogleCloudAiplatformV1SchemaModelevaluationMetricsBoundingBoxMetrics used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudAiplatformV1SchemaModelevaluationMetricsBoundingBoxMetrics.class);
  }

  /**
   * UNIMPLEMENTED. The total number of bounding boxes (i.e. summed over all frames) the ground
   * truth used to create this evaluation had.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer evaluatedBoundingBoxCount;

  /**
   * UNIMPLEMENTED. The number of video frames used to create this evaluation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer evaluatedFrameCount;

  /**
   * UNIMPLEMENTED. The total number of tracks (i.e. as seen across all frames) the ground truth
   * used to create this evaluation had.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer evaluatedTrackCount;

  /**
   * UNIMPLEMENTED. The single metric for tracks accuracy evaluation: the `meanAveragePrecision`
   * averaged over all `trackMetrics`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float trackMeanAveragePrecision;

  /**
   * UNIMPLEMENTED. The single metric for tracks bounding box iou evaluation: the
   * `meanBoundingBoxIou` averaged over all `trackMetrics`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float trackMeanBoundingBoxIou;

  /**
   * UNIMPLEMENTED. The single metric for tracking consistency evaluation: the `meanMismatchRate`
   * averaged over all `trackMetrics`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float trackMeanMismatchRate;

  /**
   * UNIMPLEMENTED. The tracks match metrics for each intersection-over-union threshold
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 and each label confidence threshold
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 pair.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics> trackMetrics;

  static {
    // hack to force ProGuard to consider GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics.class);
  }

  /**
   * The single metric for bounding boxes evaluation: the `meanAveragePrecision` averaged over all
   * `boundingBoxMetrics`.
   * @return value or {@code null} for none
   */
  public java.lang.Float getBoundingBoxMeanAveragePrecision() {
    return boundingBoxMeanAveragePrecision;
  }

  /**
   * The single metric for bounding boxes evaluation: the `meanAveragePrecision` averaged over all
   * `boundingBoxMetrics`.
   * @param boundingBoxMeanAveragePrecision boundingBoxMeanAveragePrecision or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics setBoundingBoxMeanAveragePrecision(java.lang.Float boundingBoxMeanAveragePrecision) {
    this.boundingBoxMeanAveragePrecision = boundingBoxMeanAveragePrecision;
    return this;
  }

  /**
   * The bounding boxes match metrics for each intersection-over-union threshold
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 and each label confidence threshold
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 pair.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsBoundingBoxMetrics> getBoundingBoxMetrics() {
    return boundingBoxMetrics;
  }

  /**
   * The bounding boxes match metrics for each intersection-over-union threshold
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 and each label confidence threshold
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 pair.
   * @param boundingBoxMetrics boundingBoxMetrics or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics setBoundingBoxMetrics(java.util.List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsBoundingBoxMetrics> boundingBoxMetrics) {
    this.boundingBoxMetrics = boundingBoxMetrics;
    return this;
  }

  /**
   * UNIMPLEMENTED. The total number of bounding boxes (i.e. summed over all frames) the ground
   * truth used to create this evaluation had.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEvaluatedBoundingBoxCount() {
    return evaluatedBoundingBoxCount;
  }

  /**
   * UNIMPLEMENTED. The total number of bounding boxes (i.e. summed over all frames) the ground
   * truth used to create this evaluation had.
   * @param evaluatedBoundingBoxCount evaluatedBoundingBoxCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics setEvaluatedBoundingBoxCount(java.lang.Integer evaluatedBoundingBoxCount) {
    this.evaluatedBoundingBoxCount = evaluatedBoundingBoxCount;
    return this;
  }

  /**
   * UNIMPLEMENTED. The number of video frames used to create this evaluation.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEvaluatedFrameCount() {
    return evaluatedFrameCount;
  }

  /**
   * UNIMPLEMENTED. The number of video frames used to create this evaluation.
   * @param evaluatedFrameCount evaluatedFrameCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics setEvaluatedFrameCount(java.lang.Integer evaluatedFrameCount) {
    this.evaluatedFrameCount = evaluatedFrameCount;
    return this;
  }

  /**
   * UNIMPLEMENTED. The total number of tracks (i.e. as seen across all frames) the ground truth
   * used to create this evaluation had.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEvaluatedTrackCount() {
    return evaluatedTrackCount;
  }

  /**
   * UNIMPLEMENTED. The total number of tracks (i.e. as seen across all frames) the ground truth
   * used to create this evaluation had.
   * @param evaluatedTrackCount evaluatedTrackCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics setEvaluatedTrackCount(java.lang.Integer evaluatedTrackCount) {
    this.evaluatedTrackCount = evaluatedTrackCount;
    return this;
  }

  /**
   * UNIMPLEMENTED. The single metric for tracks accuracy evaluation: the `meanAveragePrecision`
   * averaged over all `trackMetrics`.
   * @return value or {@code null} for none
   */
  public java.lang.Float getTrackMeanAveragePrecision() {
    return trackMeanAveragePrecision;
  }

  /**
   * UNIMPLEMENTED. The single metric for tracks accuracy evaluation: the `meanAveragePrecision`
   * averaged over all `trackMetrics`.
   * @param trackMeanAveragePrecision trackMeanAveragePrecision or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics setTrackMeanAveragePrecision(java.lang.Float trackMeanAveragePrecision) {
    this.trackMeanAveragePrecision = trackMeanAveragePrecision;
    return this;
  }

  /**
   * UNIMPLEMENTED. The single metric for tracks bounding box iou evaluation: the
   * `meanBoundingBoxIou` averaged over all `trackMetrics`.
   * @return value or {@code null} for none
   */
  public java.lang.Float getTrackMeanBoundingBoxIou() {
    return trackMeanBoundingBoxIou;
  }

  /**
   * UNIMPLEMENTED. The single metric for tracks bounding box iou evaluation: the
   * `meanBoundingBoxIou` averaged over all `trackMetrics`.
   * @param trackMeanBoundingBoxIou trackMeanBoundingBoxIou or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics setTrackMeanBoundingBoxIou(java.lang.Float trackMeanBoundingBoxIou) {
    this.trackMeanBoundingBoxIou = trackMeanBoundingBoxIou;
    return this;
  }

  /**
   * UNIMPLEMENTED. The single metric for tracking consistency evaluation: the `meanMismatchRate`
   * averaged over all `trackMetrics`.
   * @return value or {@code null} for none
   */
  public java.lang.Float getTrackMeanMismatchRate() {
    return trackMeanMismatchRate;
  }

  /**
   * UNIMPLEMENTED. The single metric for tracking consistency evaluation: the `meanMismatchRate`
   * averaged over all `trackMetrics`.
   * @param trackMeanMismatchRate trackMeanMismatchRate or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics setTrackMeanMismatchRate(java.lang.Float trackMeanMismatchRate) {
    this.trackMeanMismatchRate = trackMeanMismatchRate;
    return this;
  }

  /**
   * UNIMPLEMENTED. The tracks match metrics for each intersection-over-union threshold
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 and each label confidence threshold
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 pair.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics> getTrackMetrics() {
    return trackMetrics;
  }

  /**
   * UNIMPLEMENTED. The tracks match metrics for each intersection-over-union threshold
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 and each label confidence threshold
   * 0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 pair.
   * @param trackMetrics trackMetrics or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics setTrackMetrics(java.util.List<GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetrics> trackMetrics) {
    this.trackMetrics = trackMetrics;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics clone() {
    return (GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoObjectTrackingMetrics) super.clone();
  }

}
