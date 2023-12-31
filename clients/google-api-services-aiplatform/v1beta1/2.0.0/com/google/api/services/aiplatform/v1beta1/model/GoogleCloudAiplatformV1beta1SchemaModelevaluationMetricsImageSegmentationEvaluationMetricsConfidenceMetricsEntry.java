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
 * Model definition for GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEva
 * luationMetricsConfidenceMetricsEntry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry extends com.google.api.client.json.GenericJson {

  /**
   * Metrics are computed with an assumption that the model never returns predictions with score
   * lower than this value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidenceThreshold;

  /**
   * Confusion matrix for the given confidence threshold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsConfusionMatrix confusionMatrix;

  /**
   * DSC or the F1 score, The harmonic mean of recall and precision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float diceScoreCoefficient;

  /**
   * The intersection-over-union score. The measure of overlap of the annotation's category mask
   * with ground truth category mask on the DataItem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float iouScore;

  /**
   * Precision for the given confidence threshold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float precision;

  /**
   * Recall (True Positive Rate) for the given confidence threshold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float recall;

  /**
   * Metrics are computed with an assumption that the model never returns predictions with score
   * lower than this value.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidenceThreshold() {
    return confidenceThreshold;
  }

  /**
   * Metrics are computed with an assumption that the model never returns predictions with score
   * lower than this value.
   * @param confidenceThreshold confidenceThreshold or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry setConfidenceThreshold(java.lang.Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }

  /**
   * Confusion matrix for the given confidence threshold.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsConfusionMatrix getConfusionMatrix() {
    return confusionMatrix;
  }

  /**
   * Confusion matrix for the given confidence threshold.
   * @param confusionMatrix confusionMatrix or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry setConfusionMatrix(GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsConfusionMatrix confusionMatrix) {
    this.confusionMatrix = confusionMatrix;
    return this;
  }

  /**
   * DSC or the F1 score, The harmonic mean of recall and precision.
   * @return value or {@code null} for none
   */
  public java.lang.Float getDiceScoreCoefficient() {
    return diceScoreCoefficient;
  }

  /**
   * DSC or the F1 score, The harmonic mean of recall and precision.
   * @param diceScoreCoefficient diceScoreCoefficient or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry setDiceScoreCoefficient(java.lang.Float diceScoreCoefficient) {
    this.diceScoreCoefficient = diceScoreCoefficient;
    return this;
  }

  /**
   * The intersection-over-union score. The measure of overlap of the annotation's category mask
   * with ground truth category mask on the DataItem.
   * @return value or {@code null} for none
   */
  public java.lang.Float getIouScore() {
    return iouScore;
  }

  /**
   * The intersection-over-union score. The measure of overlap of the annotation's category mask
   * with ground truth category mask on the DataItem.
   * @param iouScore iouScore or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry setIouScore(java.lang.Float iouScore) {
    this.iouScore = iouScore;
    return this;
  }

  /**
   * Precision for the given confidence threshold.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPrecision() {
    return precision;
  }

  /**
   * Precision for the given confidence threshold.
   * @param precision precision or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry setPrecision(java.lang.Float precision) {
    this.precision = precision;
    return this;
  }

  /**
   * Recall (True Positive Rate) for the given confidence threshold.
   * @return value or {@code null} for none
   */
  public java.lang.Float getRecall() {
    return recall;
  }

  /**
   * Recall (True Positive Rate) for the given confidence threshold.
   * @param recall recall or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry setRecall(java.lang.Float recall) {
    this.recall = recall;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry clone() {
    return (GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry) super.clone();
  }

}
