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

package com.google.api.services.dialogflow.v3.model;

/**
 * The request message for Flows.ExportFlow.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3ExportFlowRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to export the
   * flow to. The format of this URI must be `gs:`. If left unspecified, the serialized flow is
   * returned inline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String flowUri;

  /**
   * Optional. Whether to export flows referenced by the specified flow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeReferencedFlows;

  /**
   * Optional. The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to export the
   * flow to. The format of this URI must be `gs:`. If left unspecified, the serialized flow is
   * returned inline.
   * @return value or {@code null} for none
   */
  public java.lang.String getFlowUri() {
    return flowUri;
  }

  /**
   * Optional. The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to export the
   * flow to. The format of this URI must be `gs:`. If left unspecified, the serialized flow is
   * returned inline.
   * @param flowUri flowUri or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ExportFlowRequest setFlowUri(java.lang.String flowUri) {
    this.flowUri = flowUri;
    return this;
  }

  /**
   * Optional. Whether to export flows referenced by the specified flow.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeReferencedFlows() {
    return includeReferencedFlows;
  }

  /**
   * Optional. Whether to export flows referenced by the specified flow.
   * @param includeReferencedFlows includeReferencedFlows or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ExportFlowRequest setIncludeReferencedFlows(java.lang.Boolean includeReferencedFlows) {
    this.includeReferencedFlows = includeReferencedFlows;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3ExportFlowRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3ExportFlowRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3ExportFlowRequest clone() {
    return (GoogleCloudDialogflowCxV3ExportFlowRequest) super.clone();
  }

}
