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

package com.google.api.services.dialogflow.v2.model;

/**
 * Metadata related to the Export Data Operations (e.g. ExportDocument).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2ExportOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Cloud Storage file path of the exported data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2GcsDestination exportedGcsDestination;

  /**
   * Cloud Storage file path of the exported data.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2GcsDestination getExportedGcsDestination() {
    return exportedGcsDestination;
  }

  /**
   * Cloud Storage file path of the exported data.
   * @param exportedGcsDestination exportedGcsDestination or {@code null} for none
   */
  public GoogleCloudDialogflowV2ExportOperationMetadata setExportedGcsDestination(GoogleCloudDialogflowV2GcsDestination exportedGcsDestination) {
    this.exportedGcsDestination = exportedGcsDestination;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2ExportOperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2ExportOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2ExportOperationMetadata clone() {
    return (GoogleCloudDialogflowV2ExportOperationMetadata) super.clone();
  }

}
