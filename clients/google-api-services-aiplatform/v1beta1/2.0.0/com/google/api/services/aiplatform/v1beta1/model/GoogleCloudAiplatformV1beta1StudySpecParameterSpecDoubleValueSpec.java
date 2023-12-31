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
 * Value specification for a parameter in `DOUBLE` type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1StudySpecParameterSpecDoubleValueSpec extends com.google.api.client.json.GenericJson {

  /**
   * A default value for a `DOUBLE` parameter that is assumed to be a relatively good starting
   * point. Unset value signals that there is no offered starting point. Currently only supported by
   * the Vertex AI Vizier service. Not supported by HyperparameterTuningJob or TrainingPipeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double defaultValue;

  /**
   * Required. Inclusive maximum value of the parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maxValue;

  /**
   * Required. Inclusive minimum value of the parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minValue;

  /**
   * A default value for a `DOUBLE` parameter that is assumed to be a relatively good starting
   * point. Unset value signals that there is no offered starting point. Currently only supported by
   * the Vertex AI Vizier service. Not supported by HyperparameterTuningJob or TrainingPipeline.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDefaultValue() {
    return defaultValue;
  }

  /**
   * A default value for a `DOUBLE` parameter that is assumed to be a relatively good starting
   * point. Unset value signals that there is no offered starting point. Currently only supported by
   * the Vertex AI Vizier service. Not supported by HyperparameterTuningJob or TrainingPipeline.
   * @param defaultValue defaultValue or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1StudySpecParameterSpecDoubleValueSpec setDefaultValue(java.lang.Double defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Required. Inclusive maximum value of the parameter.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaxValue() {
    return maxValue;
  }

  /**
   * Required. Inclusive maximum value of the parameter.
   * @param maxValue maxValue or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1StudySpecParameterSpecDoubleValueSpec setMaxValue(java.lang.Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Required. Inclusive minimum value of the parameter.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinValue() {
    return minValue;
  }

  /**
   * Required. Inclusive minimum value of the parameter.
   * @param minValue minValue or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1StudySpecParameterSpecDoubleValueSpec setMinValue(java.lang.Double minValue) {
    this.minValue = minValue;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1StudySpecParameterSpecDoubleValueSpec set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1StudySpecParameterSpecDoubleValueSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1StudySpecParameterSpecDoubleValueSpec clone() {
    return (GoogleCloudAiplatformV1beta1StudySpecParameterSpecDoubleValueSpec) super.clone();
  }

}
