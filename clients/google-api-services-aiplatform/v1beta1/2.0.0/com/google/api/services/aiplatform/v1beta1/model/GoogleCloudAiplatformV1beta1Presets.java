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
 * Preset configuration for example-based explanations
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1Presets extends com.google.api.client.json.GenericJson {

  /**
   * The modality of the uploaded model, which automatically configures the distance measurement and
   * feature normalization for the underlying example index and queries. If your model does not
   * precisely fit one of these types, it is okay to choose the closest type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modality;

  /**
   * Preset option controlling parameters for speed-precision trade-off when querying for examples.
   * If omitted, defaults to `PRECISE`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * The modality of the uploaded model, which automatically configures the distance measurement and
   * feature normalization for the underlying example index and queries. If your model does not
   * precisely fit one of these types, it is okay to choose the closest type.
   * @return value or {@code null} for none
   */
  public java.lang.String getModality() {
    return modality;
  }

  /**
   * The modality of the uploaded model, which automatically configures the distance measurement and
   * feature normalization for the underlying example index and queries. If your model does not
   * precisely fit one of these types, it is okay to choose the closest type.
   * @param modality modality or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1Presets setModality(java.lang.String modality) {
    this.modality = modality;
    return this;
  }

  /**
   * Preset option controlling parameters for speed-precision trade-off when querying for examples.
   * If omitted, defaults to `PRECISE`.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Preset option controlling parameters for speed-precision trade-off when querying for examples.
   * If omitted, defaults to `PRECISE`.
   * @param query query or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1Presets setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1Presets set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1Presets) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1Presets clone() {
    return (GoogleCloudAiplatformV1beta1Presets) super.clone();
  }

}
