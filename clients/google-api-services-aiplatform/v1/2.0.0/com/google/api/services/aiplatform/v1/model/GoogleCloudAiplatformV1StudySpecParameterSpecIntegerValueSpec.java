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
 * Value specification for a parameter in `INTEGER` type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec extends com.google.api.client.json.GenericJson {

  /**
   * A default value for an `INTEGER` parameter that is assumed to be a relatively good starting
   * point. Unset value signals that there is no offered starting point. Currently only supported by
   * the Vertex AI Vizier service. Not supported by HyperparameterTuningJob or TrainingPipeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long defaultValue;

  /**
   * Required. Inclusive maximum value of the parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxValue;

  /**
   * Required. Inclusive minimum value of the parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long minValue;

  /**
   * A default value for an `INTEGER` parameter that is assumed to be a relatively good starting
   * point. Unset value signals that there is no offered starting point. Currently only supported by
   * the Vertex AI Vizier service. Not supported by HyperparameterTuningJob or TrainingPipeline.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDefaultValue() {
    return defaultValue;
  }

  /**
   * A default value for an `INTEGER` parameter that is assumed to be a relatively good starting
   * point. Unset value signals that there is no offered starting point. Currently only supported by
   * the Vertex AI Vizier service. Not supported by HyperparameterTuningJob or TrainingPipeline.
   * @param defaultValue defaultValue or {@code null} for none
   */
  public GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec setDefaultValue(java.lang.Long defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Required. Inclusive maximum value of the parameter.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxValue() {
    return maxValue;
  }

  /**
   * Required. Inclusive maximum value of the parameter.
   * @param maxValue maxValue or {@code null} for none
   */
  public GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec setMaxValue(java.lang.Long maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Required. Inclusive minimum value of the parameter.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinValue() {
    return minValue;
  }

  /**
   * Required. Inclusive minimum value of the parameter.
   * @param minValue minValue or {@code null} for none
   */
  public GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec setMinValue(java.lang.Long minValue) {
    this.minValue = minValue;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec clone() {
    return (GoogleCloudAiplatformV1StudySpecParameterSpecIntegerValueSpec) super.clone();
  }

}
