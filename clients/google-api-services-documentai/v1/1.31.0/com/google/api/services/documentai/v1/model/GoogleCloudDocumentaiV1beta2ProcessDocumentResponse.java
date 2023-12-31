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

package com.google.api.services.documentai.v1.model;

/**
 * Response to a single document processing request.
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
public final class GoogleCloudDocumentaiV1beta2ProcessDocumentResponse extends com.google.api.client.json.GenericJson {

  /**
   * Information about the input file. This is the same as the corresponding input config in the
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2InputConfig inputConfig;

  /**
   * The output location of the parsed responses. The responses are written to this location as
   * JSON-serialized `Document` objects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2OutputConfig outputConfig;

  /**
   * Information about the input file. This is the same as the corresponding input config in the
   * request.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2InputConfig getInputConfig() {
    return inputConfig;
  }

  /**
   * Information about the input file. This is the same as the corresponding input config in the
   * request.
   * @param inputConfig inputConfig or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2ProcessDocumentResponse setInputConfig(GoogleCloudDocumentaiV1beta2InputConfig inputConfig) {
    this.inputConfig = inputConfig;
    return this;
  }

  /**
   * The output location of the parsed responses. The responses are written to this location as
   * JSON-serialized `Document` objects.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2OutputConfig getOutputConfig() {
    return outputConfig;
  }

  /**
   * The output location of the parsed responses. The responses are written to this location as
   * JSON-serialized `Document` objects.
   * @param outputConfig outputConfig or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2ProcessDocumentResponse setOutputConfig(GoogleCloudDocumentaiV1beta2OutputConfig outputConfig) {
    this.outputConfig = outputConfig;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2ProcessDocumentResponse set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2ProcessDocumentResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2ProcessDocumentResponse clone() {
    return (GoogleCloudDocumentaiV1beta2ProcessDocumentResponse) super.clone();
  }

}
