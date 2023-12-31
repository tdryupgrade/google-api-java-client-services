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
 * Config for migrating Model in automl.googleapis.com to Vertex AI's Model.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1MigrateResourceRequestMigrateAutomlModelConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Full resource name of automl Model. Format:
   * `projects/{project}/locations/{location}/models/{model}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * Optional. Display name of the model in Vertex AI. System will pick a display name if
   * unspecified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelDisplayName;

  /**
   * Required. Full resource name of automl Model. Format:
   * `projects/{project}/locations/{location}/models/{model}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * Required. Full resource name of automl Model. Format:
   * `projects/{project}/locations/{location}/models/{model}`.
   * @param model model or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1MigrateResourceRequestMigrateAutomlModelConfig setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  /**
   * Optional. Display name of the model in Vertex AI. System will pick a display name if
   * unspecified.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelDisplayName() {
    return modelDisplayName;
  }

  /**
   * Optional. Display name of the model in Vertex AI. System will pick a display name if
   * unspecified.
   * @param modelDisplayName modelDisplayName or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1MigrateResourceRequestMigrateAutomlModelConfig setModelDisplayName(java.lang.String modelDisplayName) {
    this.modelDisplayName = modelDisplayName;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1MigrateResourceRequestMigrateAutomlModelConfig set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1MigrateResourceRequestMigrateAutomlModelConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1MigrateResourceRequestMigrateAutomlModelConfig clone() {
    return (GoogleCloudAiplatformV1beta1MigrateResourceRequestMigrateAutomlModelConfig) super.clone();
  }

}
