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

package com.google.api.services.documentai.v1beta2.model;

/**
 * Parameters to control form extraction behavior.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta2FormExtractionParams extends com.google.api.client.json.GenericJson {

  /**
   * Whether to enable form extraction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta2KeyValuePairHint> keyValuePairHints;

  /**
   * Model version of the form extraction system. Default is "builtin/stable". Specify
   * "builtin/latest" for the latest model. For custom form models, specify: "custom/{model_name}".
   * Model name format is "bucket_name/path/to/modeldir" corresponding to
   * "gs://bucket_name/path/to/modeldir" where annotated examples are stored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelVersion;

  /**
   * Whether to enable form extraction.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whether to enable form extraction.
   * @param enabled enabled or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2FormExtractionParams setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta2KeyValuePairHint> getKeyValuePairHints() {
    return keyValuePairHints;
  }

  /**
   * Reserved for future use.
   * @param keyValuePairHints keyValuePairHints or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2FormExtractionParams setKeyValuePairHints(java.util.List<GoogleCloudDocumentaiV1beta2KeyValuePairHint> keyValuePairHints) {
    this.keyValuePairHints = keyValuePairHints;
    return this;
  }

  /**
   * Model version of the form extraction system. Default is "builtin/stable". Specify
   * "builtin/latest" for the latest model. For custom form models, specify: "custom/{model_name}".
   * Model name format is "bucket_name/path/to/modeldir" corresponding to
   * "gs://bucket_name/path/to/modeldir" where annotated examples are stored.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelVersion() {
    return modelVersion;
  }

  /**
   * Model version of the form extraction system. Default is "builtin/stable". Specify
   * "builtin/latest" for the latest model. For custom form models, specify: "custom/{model_name}".
   * Model name format is "bucket_name/path/to/modeldir" corresponding to
   * "gs://bucket_name/path/to/modeldir" where annotated examples are stored.
   * @param modelVersion modelVersion or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2FormExtractionParams setModelVersion(java.lang.String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2FormExtractionParams set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2FormExtractionParams) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2FormExtractionParams clone() {
    return (GoogleCloudDocumentaiV1beta2FormExtractionParams) super.clone();
  }

}
