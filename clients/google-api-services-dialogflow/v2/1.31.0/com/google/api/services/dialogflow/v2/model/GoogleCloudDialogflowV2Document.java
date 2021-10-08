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
 * A knowledge document to be used by a KnowledgeBase. For more information, see the [knowledge base
 * guide](https://cloud.google.com/dialogflow/docs/how/knowledge-bases). Note: The
 * `projects.agent.knowledgeBases.documents` resource is deprecated; only use
 * `projects.knowledgeBases.documents`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2Document extends com.google.api.client.json.GenericJson {

  /**
   * The URI where the file content is located. For documents stored in Google Cloud Storage, these
   * URIs must have the form `gs:`. NOTE: External URLs must correspond to public webpages, i.e.,
   * they must be indexed by Google Search. In particular, URLs for showing documents in Google
   * Cloud Storage (i.e. the URL in your browser) are not supported. Instead use the `gs://` format
   * URI described above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentUri;

  /**
   * Required. The display name of the document. The name must be 1024 bytes or less; otherwise, the
   * creation request fails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. If true, we try to automatically reload the document every day (at a time picked by
   * the system). If false or unspecified, we don't try to automatically reload the document.
   * Currently you can only enable automatic reload for documents sourced from a public url, see
   * `source` field for the source types. Reload status can be tracked in `latest_reload_status`. If
   * a reload fails, we will keep the document unchanged. If a reload fails with internal errors,
   * the system will try to reload the document on the next day. If a reload fails with non-
   * retriable errors (e.g. PERMISION_DENIED), the system will not try to reload the document
   * anymore. You need to manually reload the document successfully by calling `ReloadDocument` and
   * clear the errors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableAutoReload;

  /**
   * Required. The knowledge type of document content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> knowledgeTypes;

  /**
   * Output only. The time and status of the latest reload. This reload may have been triggered
   * automatically or manually and may not have succeeded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2DocumentReloadStatus latestReloadStatus;

  /**
   * Optional. Metadata for the document. The metadata supports arbitrary key-value pairs. Suggested
   * use cases include storing a document's title, an external URL distinct from the document's
   * content_uri, etc. The max size of a `key` or a `value` of the metadata is 1024 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * Required. The MIME type of this document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * Optional. The document resource name. The name must be empty when creating a document. Format:
   * `projects//locations//knowledgeBases//documents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ
   * knowledge types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rawContent;

  /**
   * The URI where the file content is located. For documents stored in Google Cloud Storage, these
   * URIs must have the form `gs:`. NOTE: External URLs must correspond to public webpages, i.e.,
   * they must be indexed by Google Search. In particular, URLs for showing documents in Google
   * Cloud Storage (i.e. the URL in your browser) are not supported. Instead use the `gs://` format
   * URI described above.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentUri() {
    return contentUri;
  }

  /**
   * The URI where the file content is located. For documents stored in Google Cloud Storage, these
   * URIs must have the form `gs:`. NOTE: External URLs must correspond to public webpages, i.e.,
   * they must be indexed by Google Search. In particular, URLs for showing documents in Google
   * Cloud Storage (i.e. the URL in your browser) are not supported. Instead use the `gs://` format
   * URI described above.
   * @param contentUri contentUri or {@code null} for none
   */
  public GoogleCloudDialogflowV2Document setContentUri(java.lang.String contentUri) {
    this.contentUri = contentUri;
    return this;
  }

  /**
   * Required. The display name of the document. The name must be 1024 bytes or less; otherwise, the
   * creation request fails.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the document. The name must be 1024 bytes or less; otherwise, the
   * creation request fails.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowV2Document setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. If true, we try to automatically reload the document every day (at a time picked by
   * the system). If false or unspecified, we don't try to automatically reload the document.
   * Currently you can only enable automatic reload for documents sourced from a public url, see
   * `source` field for the source types. Reload status can be tracked in `latest_reload_status`. If
   * a reload fails, we will keep the document unchanged. If a reload fails with internal errors,
   * the system will try to reload the document on the next day. If a reload fails with non-
   * retriable errors (e.g. PERMISION_DENIED), the system will not try to reload the document
   * anymore. You need to manually reload the document successfully by calling `ReloadDocument` and
   * clear the errors.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableAutoReload() {
    return enableAutoReload;
  }

  /**
   * Optional. If true, we try to automatically reload the document every day (at a time picked by
   * the system). If false or unspecified, we don't try to automatically reload the document.
   * Currently you can only enable automatic reload for documents sourced from a public url, see
   * `source` field for the source types. Reload status can be tracked in `latest_reload_status`. If
   * a reload fails, we will keep the document unchanged. If a reload fails with internal errors,
   * the system will try to reload the document on the next day. If a reload fails with non-
   * retriable errors (e.g. PERMISION_DENIED), the system will not try to reload the document
   * anymore. You need to manually reload the document successfully by calling `ReloadDocument` and
   * clear the errors.
   * @param enableAutoReload enableAutoReload or {@code null} for none
   */
  public GoogleCloudDialogflowV2Document setEnableAutoReload(java.lang.Boolean enableAutoReload) {
    this.enableAutoReload = enableAutoReload;
    return this;
  }

  /**
   * Required. The knowledge type of document content.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getKnowledgeTypes() {
    return knowledgeTypes;
  }

  /**
   * Required. The knowledge type of document content.
   * @param knowledgeTypes knowledgeTypes or {@code null} for none
   */
  public GoogleCloudDialogflowV2Document setKnowledgeTypes(java.util.List<java.lang.String> knowledgeTypes) {
    this.knowledgeTypes = knowledgeTypes;
    return this;
  }

  /**
   * Output only. The time and status of the latest reload. This reload may have been triggered
   * automatically or manually and may not have succeeded.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2DocumentReloadStatus getLatestReloadStatus() {
    return latestReloadStatus;
  }

  /**
   * Output only. The time and status of the latest reload. This reload may have been triggered
   * automatically or manually and may not have succeeded.
   * @param latestReloadStatus latestReloadStatus or {@code null} for none
   */
  public GoogleCloudDialogflowV2Document setLatestReloadStatus(GoogleCloudDialogflowV2DocumentReloadStatus latestReloadStatus) {
    this.latestReloadStatus = latestReloadStatus;
    return this;
  }

  /**
   * Optional. Metadata for the document. The metadata supports arbitrary key-value pairs. Suggested
   * use cases include storing a document's title, an external URL distinct from the document's
   * content_uri, etc. The max size of a `key` or a `value` of the metadata is 1024 bytes.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * Optional. Metadata for the document. The metadata supports arbitrary key-value pairs. Suggested
   * use cases include storing a document's title, an external URL distinct from the document's
   * content_uri, etc. The max size of a `key` or a `value` of the metadata is 1024 bytes.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudDialogflowV2Document setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Required. The MIME type of this document.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * Required. The MIME type of this document.
   * @param mimeType mimeType or {@code null} for none
   */
  public GoogleCloudDialogflowV2Document setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Optional. The document resource name. The name must be empty when creating a document. Format:
   * `projects//locations//knowledgeBases//documents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. The document resource name. The name must be empty when creating a document. Format:
   * `projects//locations//knowledgeBases//documents/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2Document setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ
   * knowledge types.
   * @see #decodeRawContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getRawContent() {
    return rawContent;
  }

  /**
   * The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ
   * knowledge types.
   * @see #getRawContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeRawContent() {
    return com.google.api.client.util.Base64.decodeBase64(rawContent);
  }

  /**
   * The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ
   * knowledge types.
   * @see #encodeRawContent()
   * @param rawContent rawContent or {@code null} for none
   */
  public GoogleCloudDialogflowV2Document setRawContent(java.lang.String rawContent) {
    this.rawContent = rawContent;
    return this;
  }

  /**
   * The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ
   * knowledge types.
   * @see #setRawContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDialogflowV2Document encodeRawContent(byte[] rawContent) {
    this.rawContent = com.google.api.client.util.Base64.encodeBase64URLSafeString(rawContent);
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2Document set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2Document) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2Document clone() {
    return (GoogleCloudDialogflowV2Document) super.clone();
  }

}
