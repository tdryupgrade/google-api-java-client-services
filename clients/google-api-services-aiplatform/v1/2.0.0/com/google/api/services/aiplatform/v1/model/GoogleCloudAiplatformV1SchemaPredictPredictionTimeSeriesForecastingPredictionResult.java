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
 * Prediction output format for Time Series Forecasting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1SchemaPredictPredictionTimeSeriesForecastingPredictionResult extends com.google.api.client.json.GenericJson {

  /**
   * Quantile predictions, in 1-1 correspondence with quantile_values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Float> quantilePredictions;

  /**
   * Quantile values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Float> quantileValues;

  /**
   * Only use these if TFt is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SchemaPredictPredictionTftFeatureImportance tftFeatureImportance;

  /**
   * The regression value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float value;

  /**
   * Quantile predictions, in 1-1 correspondence with quantile_values.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Float> getQuantilePredictions() {
    return quantilePredictions;
  }

  /**
   * Quantile predictions, in 1-1 correspondence with quantile_values.
   * @param quantilePredictions quantilePredictions or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictPredictionTimeSeriesForecastingPredictionResult setQuantilePredictions(java.util.List<java.lang.Float> quantilePredictions) {
    this.quantilePredictions = quantilePredictions;
    return this;
  }

  /**
   * Quantile values.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Float> getQuantileValues() {
    return quantileValues;
  }

  /**
   * Quantile values.
   * @param quantileValues quantileValues or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictPredictionTimeSeriesForecastingPredictionResult setQuantileValues(java.util.List<java.lang.Float> quantileValues) {
    this.quantileValues = quantileValues;
    return this;
  }

  /**
   * Only use these if TFt is enabled.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictPredictionTftFeatureImportance getTftFeatureImportance() {
    return tftFeatureImportance;
  }

  /**
   * Only use these if TFt is enabled.
   * @param tftFeatureImportance tftFeatureImportance or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictPredictionTimeSeriesForecastingPredictionResult setTftFeatureImportance(GoogleCloudAiplatformV1SchemaPredictPredictionTftFeatureImportance tftFeatureImportance) {
    this.tftFeatureImportance = tftFeatureImportance;
    return this;
  }

  /**
   * The regression value.
   * @return value or {@code null} for none
   */
  public java.lang.Float getValue() {
    return value;
  }

  /**
   * The regression value.
   * @param value value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictPredictionTimeSeriesForecastingPredictionResult setValue(java.lang.Float value) {
    this.value = value;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1SchemaPredictPredictionTimeSeriesForecastingPredictionResult set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1SchemaPredictPredictionTimeSeriesForecastingPredictionResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1SchemaPredictPredictionTimeSeriesForecastingPredictionResult clone() {
    return (GoogleCloudAiplatformV1SchemaPredictPredictionTimeSeriesForecastingPredictionResult) super.clone();
  }

}
