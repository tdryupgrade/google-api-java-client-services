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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Settings related to NLU.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1NluSettings extends com.google.api.client.json.GenericJson {

  /**
   * To filter out false positive results and still get variety in matched natural language inputs
   * for your agent, you can tune the machine learning classification threshold. If the returned
   * score value is less than the threshold value, then a no-match event will be triggered. The
   * score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0,
   * the default of 0.3 is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float classificationThreshold;

  /**
   * Indicates NLU model training mode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelTrainingMode;

  /**
   * Indicates the type of NLU model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelType;

  /**
   * To filter out false positive results and still get variety in matched natural language inputs
   * for your agent, you can tune the machine learning classification threshold. If the returned
   * score value is less than the threshold value, then a no-match event will be triggered. The
   * score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0,
   * the default of 0.3 is used.
   * @return value or {@code null} for none
   */
  public java.lang.Float getClassificationThreshold() {
    return classificationThreshold;
  }

  /**
   * To filter out false positive results and still get variety in matched natural language inputs
   * for your agent, you can tune the machine learning classification threshold. If the returned
   * score value is less than the threshold value, then a no-match event will be triggered. The
   * score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0,
   * the default of 0.3 is used.
   * @param classificationThreshold classificationThreshold or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1NluSettings setClassificationThreshold(java.lang.Float classificationThreshold) {
    this.classificationThreshold = classificationThreshold;
    return this;
  }

  /**
   * Indicates NLU model training mode.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelTrainingMode() {
    return modelTrainingMode;
  }

  /**
   * Indicates NLU model training mode.
   * @param modelTrainingMode modelTrainingMode or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1NluSettings setModelTrainingMode(java.lang.String modelTrainingMode) {
    this.modelTrainingMode = modelTrainingMode;
    return this;
  }

  /**
   * Indicates the type of NLU model.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelType() {
    return modelType;
  }

  /**
   * Indicates the type of NLU model.
   * @param modelType modelType or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1NluSettings setModelType(java.lang.String modelType) {
    this.modelType = modelType;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1NluSettings set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1NluSettings) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1NluSettings clone() {
    return (GoogleCloudDialogflowCxV3beta1NluSettings) super.clone();
  }

}
