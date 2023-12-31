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
 * Request message for PredictionService.RawPredict.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1RawPredictRequest extends com.google.api.client.json.GenericJson {

  /**
   * The prediction input. Supports HTTP headers and arbitrary data payload. A DeployedModel may
   * have an upper limit on the number of instances it supports per request. When this limit it is
   * exceeded for an AutoML model, the RawPredict method returns an error. When this limit is
   * exceeded for a custom-trained model, the behavior varies depending on the model. You can
   * specify the schema for each instance in the predict_schemata.instance_schema_uri field when you
   * create a Model. This schema applies when you deploy the `Model` as a `DeployedModel` to an
   * Endpoint and use the `RawPredict` method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleApiHttpBody httpBody;

  /**
   * The prediction input. Supports HTTP headers and arbitrary data payload. A DeployedModel may
   * have an upper limit on the number of instances it supports per request. When this limit it is
   * exceeded for an AutoML model, the RawPredict method returns an error. When this limit is
   * exceeded for a custom-trained model, the behavior varies depending on the model. You can
   * specify the schema for each instance in the predict_schemata.instance_schema_uri field when you
   * create a Model. This schema applies when you deploy the `Model` as a `DeployedModel` to an
   * Endpoint and use the `RawPredict` method.
   * @return value or {@code null} for none
   */
  public GoogleApiHttpBody getHttpBody() {
    return httpBody;
  }

  /**
   * The prediction input. Supports HTTP headers and arbitrary data payload. A DeployedModel may
   * have an upper limit on the number of instances it supports per request. When this limit it is
   * exceeded for an AutoML model, the RawPredict method returns an error. When this limit is
   * exceeded for a custom-trained model, the behavior varies depending on the model. You can
   * specify the schema for each instance in the predict_schemata.instance_schema_uri field when you
   * create a Model. This schema applies when you deploy the `Model` as a `DeployedModel` to an
   * Endpoint and use the `RawPredict` method.
   * @param httpBody httpBody or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1RawPredictRequest setHttpBody(GoogleApiHttpBody httpBody) {
    this.httpBody = httpBody;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1RawPredictRequest set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1RawPredictRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1RawPredictRequest clone() {
    return (GoogleCloudAiplatformV1beta1RawPredictRequest) super.clone();
  }

}
