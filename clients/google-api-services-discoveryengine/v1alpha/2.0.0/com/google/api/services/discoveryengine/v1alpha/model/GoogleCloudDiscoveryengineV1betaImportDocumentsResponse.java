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

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * Response of the ImportDocumentsRequest. If the long running operation is done, then this message
 * is returned by the google.longrunning.Operations.response field if the operation was successful.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1betaImportDocumentsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Echoes the destination for the complete errors in the request if set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1betaImportErrorConfig errorConfig;

  /**
   * A sample of errors encountered while processing the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleRpcStatus> errorSamples;

  /**
   * Echoes the destination for the complete errors in the request if set.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaImportErrorConfig getErrorConfig() {
    return errorConfig;
  }

  /**
   * Echoes the destination for the complete errors in the request if set.
   * @param errorConfig errorConfig or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaImportDocumentsResponse setErrorConfig(GoogleCloudDiscoveryengineV1betaImportErrorConfig errorConfig) {
    this.errorConfig = errorConfig;
    return this;
  }

  /**
   * A sample of errors encountered while processing the request.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleRpcStatus> getErrorSamples() {
    return errorSamples;
  }

  /**
   * A sample of errors encountered while processing the request.
   * @param errorSamples errorSamples or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1betaImportDocumentsResponse setErrorSamples(java.util.List<GoogleRpcStatus> errorSamples) {
    this.errorSamples = errorSamples;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaImportDocumentsResponse set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1betaImportDocumentsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1betaImportDocumentsResponse clone() {
    return (GoogleCloudDiscoveryengineV1betaImportDocumentsResponse) super.clone();
  }

}