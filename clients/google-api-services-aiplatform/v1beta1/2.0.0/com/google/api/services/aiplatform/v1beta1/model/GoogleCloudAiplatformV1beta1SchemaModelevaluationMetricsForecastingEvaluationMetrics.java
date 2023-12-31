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
 * Metrics for forecasting evaluation results.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Mean Absolute Error (MAE).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float meanAbsoluteError;

  /**
   * Mean absolute percentage error. Infinity when there are zeros in the ground truth.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float meanAbsolutePercentageError;

  /**
   * The quantile metrics entries for each quantile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetricsQuantileMetricsEntry> quantileMetrics;

  /**
   * Coefficient of determination as Pearson correlation coefficient. Undefined when ground truth or
   * predictions are constant or near constant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float rSquared;

  /**
   * Root Mean Squared Error (RMSE).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float rootMeanSquaredError;

  /**
   * Root mean squared log error. Undefined when there are negative ground truth values or
   * predictions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float rootMeanSquaredLogError;

  /**
   * Root Mean Square Percentage Error. Square root of MSPE. Undefined/imaginary when MSPE is
   * negative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float rootMeanSquaredPercentageError;

  /**
   * Weighted Absolute Percentage Error. Does not use weights, this is just what the metric is
   * called. Undefined if actual values sum to zero. Will be very large if actual values sum to a
   * very small number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float weightedAbsolutePercentageError;

  /**
   * Mean Absolute Error (MAE).
   * @return value or {@code null} for none
   */
  public java.lang.Float getMeanAbsoluteError() {
    return meanAbsoluteError;
  }

  /**
   * Mean Absolute Error (MAE).
   * @param meanAbsoluteError meanAbsoluteError or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetrics setMeanAbsoluteError(java.lang.Float meanAbsoluteError) {
    this.meanAbsoluteError = meanAbsoluteError;
    return this;
  }

  /**
   * Mean absolute percentage error. Infinity when there are zeros in the ground truth.
   * @return value or {@code null} for none
   */
  public java.lang.Float getMeanAbsolutePercentageError() {
    return meanAbsolutePercentageError;
  }

  /**
   * Mean absolute percentage error. Infinity when there are zeros in the ground truth.
   * @param meanAbsolutePercentageError meanAbsolutePercentageError or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetrics setMeanAbsolutePercentageError(java.lang.Float meanAbsolutePercentageError) {
    this.meanAbsolutePercentageError = meanAbsolutePercentageError;
    return this;
  }

  /**
   * The quantile metrics entries for each quantile.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetricsQuantileMetricsEntry> getQuantileMetrics() {
    return quantileMetrics;
  }

  /**
   * The quantile metrics entries for each quantile.
   * @param quantileMetrics quantileMetrics or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetrics setQuantileMetrics(java.util.List<GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetricsQuantileMetricsEntry> quantileMetrics) {
    this.quantileMetrics = quantileMetrics;
    return this;
  }

  /**
   * Coefficient of determination as Pearson correlation coefficient. Undefined when ground truth or
   * predictions are constant or near constant.
   * @return value or {@code null} for none
   */
  public java.lang.Float getRSquared() {
    return rSquared;
  }

  /**
   * Coefficient of determination as Pearson correlation coefficient. Undefined when ground truth or
   * predictions are constant or near constant.
   * @param rSquared rSquared or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetrics setRSquared(java.lang.Float rSquared) {
    this.rSquared = rSquared;
    return this;
  }

  /**
   * Root Mean Squared Error (RMSE).
   * @return value or {@code null} for none
   */
  public java.lang.Float getRootMeanSquaredError() {
    return rootMeanSquaredError;
  }

  /**
   * Root Mean Squared Error (RMSE).
   * @param rootMeanSquaredError rootMeanSquaredError or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetrics setRootMeanSquaredError(java.lang.Float rootMeanSquaredError) {
    this.rootMeanSquaredError = rootMeanSquaredError;
    return this;
  }

  /**
   * Root mean squared log error. Undefined when there are negative ground truth values or
   * predictions.
   * @return value or {@code null} for none
   */
  public java.lang.Float getRootMeanSquaredLogError() {
    return rootMeanSquaredLogError;
  }

  /**
   * Root mean squared log error. Undefined when there are negative ground truth values or
   * predictions.
   * @param rootMeanSquaredLogError rootMeanSquaredLogError or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetrics setRootMeanSquaredLogError(java.lang.Float rootMeanSquaredLogError) {
    this.rootMeanSquaredLogError = rootMeanSquaredLogError;
    return this;
  }

  /**
   * Root Mean Square Percentage Error. Square root of MSPE. Undefined/imaginary when MSPE is
   * negative.
   * @return value or {@code null} for none
   */
  public java.lang.Float getRootMeanSquaredPercentageError() {
    return rootMeanSquaredPercentageError;
  }

  /**
   * Root Mean Square Percentage Error. Square root of MSPE. Undefined/imaginary when MSPE is
   * negative.
   * @param rootMeanSquaredPercentageError rootMeanSquaredPercentageError or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetrics setRootMeanSquaredPercentageError(java.lang.Float rootMeanSquaredPercentageError) {
    this.rootMeanSquaredPercentageError = rootMeanSquaredPercentageError;
    return this;
  }

  /**
   * Weighted Absolute Percentage Error. Does not use weights, this is just what the metric is
   * called. Undefined if actual values sum to zero. Will be very large if actual values sum to a
   * very small number.
   * @return value or {@code null} for none
   */
  public java.lang.Float getWeightedAbsolutePercentageError() {
    return weightedAbsolutePercentageError;
  }

  /**
   * Weighted Absolute Percentage Error. Does not use weights, this is just what the metric is
   * called. Undefined if actual values sum to zero. Will be very large if actual values sum to a
   * very small number.
   * @param weightedAbsolutePercentageError weightedAbsolutePercentageError or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetrics setWeightedAbsolutePercentageError(java.lang.Float weightedAbsolutePercentageError) {
    this.weightedAbsolutePercentageError = weightedAbsolutePercentageError;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetrics set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetrics) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetrics clone() {
    return (GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsForecastingEvaluationMetrics) super.clone();
  }

}
