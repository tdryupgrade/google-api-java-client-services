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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * The ingestion pipeline config.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContentwarehouseV1IngestPipelineConfig extends com.google.api.client.json.GenericJson {

  /**
   * The document level acl policy config. This refers to an Identity and Access (IAM) policy, which
   * specifies access controls for all documents ingested by the pipeline. The role and members
   * under the policy needs to be specified. The following roles are supported for document level
   * acl control: * roles/contentwarehouse.documentAdmin * roles/contentwarehouse.documentEditor *
   * roles/contentwarehouse.documentViewer The following members are supported for document level
   * acl control: * user:user-email@example.com * group:group-email@example.com Note that for
   * documents searched with LLM, only single level user or group acl check is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIamV1Policy documentAclPolicy;

  /**
   * The document text extraction enabled flag. If the flag is set to true, DWH will perform text
   * extraction on the raw document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableDocumentTextExtraction;

  /**
   * Optional. The name of the folder to which all ingested documents will be linked during
   * ingestion process. Format is `projects/{project}/locations/{location}/documents/{folder_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String folder;

  /**
   * The document level acl policy config. This refers to an Identity and Access (IAM) policy, which
   * specifies access controls for all documents ingested by the pipeline. The role and members
   * under the policy needs to be specified. The following roles are supported for document level
   * acl control: * roles/contentwarehouse.documentAdmin * roles/contentwarehouse.documentEditor *
   * roles/contentwarehouse.documentViewer The following members are supported for document level
   * acl control: * user:user-email@example.com * group:group-email@example.com Note that for
   * documents searched with LLM, only single level user or group acl check is supported.
   * @return value or {@code null} for none
   */
  public GoogleIamV1Policy getDocumentAclPolicy() {
    return documentAclPolicy;
  }

  /**
   * The document level acl policy config. This refers to an Identity and Access (IAM) policy, which
   * specifies access controls for all documents ingested by the pipeline. The role and members
   * under the policy needs to be specified. The following roles are supported for document level
   * acl control: * roles/contentwarehouse.documentAdmin * roles/contentwarehouse.documentEditor *
   * roles/contentwarehouse.documentViewer The following members are supported for document level
   * acl control: * user:user-email@example.com * group:group-email@example.com Note that for
   * documents searched with LLM, only single level user or group acl check is supported.
   * @param documentAclPolicy documentAclPolicy or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1IngestPipelineConfig setDocumentAclPolicy(GoogleIamV1Policy documentAclPolicy) {
    this.documentAclPolicy = documentAclPolicy;
    return this;
  }

  /**
   * The document text extraction enabled flag. If the flag is set to true, DWH will perform text
   * extraction on the raw document.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableDocumentTextExtraction() {
    return enableDocumentTextExtraction;
  }

  /**
   * The document text extraction enabled flag. If the flag is set to true, DWH will perform text
   * extraction on the raw document.
   * @param enableDocumentTextExtraction enableDocumentTextExtraction or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1IngestPipelineConfig setEnableDocumentTextExtraction(java.lang.Boolean enableDocumentTextExtraction) {
    this.enableDocumentTextExtraction = enableDocumentTextExtraction;
    return this;
  }

  /**
   * Optional. The name of the folder to which all ingested documents will be linked during
   * ingestion process. Format is `projects/{project}/locations/{location}/documents/{folder_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getFolder() {
    return folder;
  }

  /**
   * Optional. The name of the folder to which all ingested documents will be linked during
   * ingestion process. Format is `projects/{project}/locations/{location}/documents/{folder_id}`
   * @param folder folder or {@code null} for none
   */
  public GoogleCloudContentwarehouseV1IngestPipelineConfig setFolder(java.lang.String folder) {
    this.folder = folder;
    return this;
  }

  @Override
  public GoogleCloudContentwarehouseV1IngestPipelineConfig set(String fieldName, Object value) {
    return (GoogleCloudContentwarehouseV1IngestPipelineConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContentwarehouseV1IngestPipelineConfig clone() {
    return (GoogleCloudContentwarehouseV1IngestPipelineConfig) super.clone();
  }

}
