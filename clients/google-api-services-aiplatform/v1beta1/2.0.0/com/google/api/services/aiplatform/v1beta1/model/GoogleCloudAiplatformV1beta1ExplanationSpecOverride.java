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
 * The ExplanationSpec entries that can be overridden at online explanation time.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ExplanationSpecOverride extends com.google.api.client.json.GenericJson {

  /**
   * The example-based explanations parameter overrides.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1ExamplesOverride examplesOverride;

  /**
   * The metadata to be overridden. If not specified, no metadata is overridden.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1ExplanationMetadataOverride metadata;

  /**
   * The parameters to be overridden. Note that the attribution method cannot be changed. If not
   * specified, no parameter is overridden.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1ExplanationParameters parameters;

  /**
   * The example-based explanations parameter overrides.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExamplesOverride getExamplesOverride() {
    return examplesOverride;
  }

  /**
   * The example-based explanations parameter overrides.
   * @param examplesOverride examplesOverride or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExplanationSpecOverride setExamplesOverride(GoogleCloudAiplatformV1beta1ExamplesOverride examplesOverride) {
    this.examplesOverride = examplesOverride;
    return this;
  }

  /**
   * The metadata to be overridden. If not specified, no metadata is overridden.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExplanationMetadataOverride getMetadata() {
    return metadata;
  }

  /**
   * The metadata to be overridden. If not specified, no metadata is overridden.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExplanationSpecOverride setMetadata(GoogleCloudAiplatformV1beta1ExplanationMetadataOverride metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The parameters to be overridden. Note that the attribution method cannot be changed. If not
   * specified, no parameter is overridden.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExplanationParameters getParameters() {
    return parameters;
  }

  /**
   * The parameters to be overridden. Note that the attribution method cannot be changed. If not
   * specified, no parameter is overridden.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ExplanationSpecOverride setParameters(GoogleCloudAiplatformV1beta1ExplanationParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ExplanationSpecOverride set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ExplanationSpecOverride) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ExplanationSpecOverride clone() {
    return (GoogleCloudAiplatformV1beta1ExplanationSpecOverride) super.clone();
  }

}
