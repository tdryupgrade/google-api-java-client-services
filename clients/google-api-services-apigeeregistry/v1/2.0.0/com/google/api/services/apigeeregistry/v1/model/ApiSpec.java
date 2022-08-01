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

package com.google.api.services.apigeeregistry.v1.model;

/**
 * An ApiSpec describes a version of an API in a structured way. ApiSpecs provide formal
 * descriptions that consumers can use to use a version. ApiSpec resources are intended to be fully-
 * resolved descriptions of an ApiVersion. When specs consist of multiple files, these should be
 * bundled together (e.g. in a zip archive) and stored as a unit. Multiple specs can exist to
 * provide representations in different API description formats. Synchronization of these
 * representations would be provided by tooling and background services.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee Registry API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApiSpec extends com.google.api.client.json.GenericJson {

  /**
   * Annotations attach non-identifying metadata to resources. Annotation keys and values are less
   * restricted than those of labels, but should be generally used for small values of broad
   * interest. Larger, topic- specific metadata should be stored in Artifacts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Input only. The contents of the spec. Provided by API callers when specs are created or
   * updated. To access the contents of a spec, use GetApiSpecContents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contents;

  /**
   * Output only. Creation timestamp; when the spec resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * A detailed description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * A possibly-hierarchical name used to refer to the spec from other specs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filename;

  /**
   * Output only. A SHA-256 hash of the spec's contents. If the spec is gzipped, this is the hash of
   * the uncompressed spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hash;

  /**
   * Labels attach identifying metadata to resources. Identifying metadata can be used to filter
   * list operations. Label keys and values can be no longer than 64 characters (Unicode
   * codepoints), can only contain lowercase letters, numeric characters, underscores and dashes.
   * International characters are allowed. No more than 64 user labels can be associated with one
   * resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and
   * examples of labels. System reserved label keys are prefixed with
   * "apigeeregistry.googleapis.com/" and cannot be changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * A style (format) descriptor for this spec that is specified as a Media Type
   * (https://en.wikipedia.org/wiki/Media_type). Possible values include
   * "application/vnd.apigee.proto", "application/vnd.apigee.openapi", and
   * "application/vnd.apigee.graphql", with possible suffixes representing compression types. These
   * hypothetical names are defined in the vendor tree defined in RFC6838
   * (https://tools.ietf.org/html/rfc6838) and are not final. Content types can specify compression.
   * Currently only GZip compression is supported (indicated with "+gzip").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * Resource name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Revision creation timestamp; when the represented revision was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String revisionCreateTime;

  /**
   * Output only. Immutable. The revision ID of the spec. A new revision is committed whenever the
   * spec contents are changed. The format is an 8-character hexadecimal string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * Output only. Last update timestamp: when the represented revision was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String revisionUpdateTime;

  /**
   * Output only. The size of the spec file in bytes. If the spec is gzipped, this is the size of
   * the uncompressed spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sizeBytes;

  /**
   * The original source URI of the spec (if one exists). This is an external location that can be
   * used for reference purposes but which may not be authoritative since this external resource may
   * change after the spec is retrieved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceUri;

  /**
   * Annotations attach non-identifying metadata to resources. Annotation keys and values are less
   * restricted than those of labels, but should be generally used for small values of broad
   * interest. Larger, topic- specific metadata should be stored in Artifacts.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Annotations attach non-identifying metadata to resources. Annotation keys and values are less
   * restricted than those of labels, but should be generally used for small values of broad
   * interest. Larger, topic- specific metadata should be stored in Artifacts.
   * @param annotations annotations or {@code null} for none
   */
  public ApiSpec setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Input only. The contents of the spec. Provided by API callers when specs are created or
   * updated. To access the contents of a spec, use GetApiSpecContents.
   * @see #decodeContents()
   * @return value or {@code null} for none
   */
  public java.lang.String getContents() {
    return contents;
  }

  /**
   * Input only. The contents of the spec. Provided by API callers when specs are created or
   * updated. To access the contents of a spec, use GetApiSpecContents.
   * @see #getContents()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContents() {
    return com.google.api.client.util.Base64.decodeBase64(contents);
  }

  /**
   * Input only. The contents of the spec. Provided by API callers when specs are created or
   * updated. To access the contents of a spec, use GetApiSpecContents.
   * @see #encodeContents()
   * @param contents contents or {@code null} for none
   */
  public ApiSpec setContents(java.lang.String contents) {
    this.contents = contents;
    return this;
  }

  /**
   * Input only. The contents of the spec. Provided by API callers when specs are created or
   * updated. To access the contents of a spec, use GetApiSpecContents.
   * @see #setContents()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ApiSpec encodeContents(byte[] contents) {
    this.contents = com.google.api.client.util.Base64.encodeBase64URLSafeString(contents);
    return this;
  }

  /**
   * Output only. Creation timestamp; when the spec resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Creation timestamp; when the spec resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public ApiSpec setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * A detailed description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A detailed description.
   * @param description description or {@code null} for none
   */
  public ApiSpec setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * A possibly-hierarchical name used to refer to the spec from other specs.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilename() {
    return filename;
  }

  /**
   * A possibly-hierarchical name used to refer to the spec from other specs.
   * @param filename filename or {@code null} for none
   */
  public ApiSpec setFilename(java.lang.String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Output only. A SHA-256 hash of the spec's contents. If the spec is gzipped, this is the hash of
   * the uncompressed spec.
   * @return value or {@code null} for none
   */
  public java.lang.String getHash() {
    return hash;
  }

  /**
   * Output only. A SHA-256 hash of the spec's contents. If the spec is gzipped, this is the hash of
   * the uncompressed spec.
   * @param hash hash or {@code null} for none
   */
  public ApiSpec setHash(java.lang.String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Labels attach identifying metadata to resources. Identifying metadata can be used to filter
   * list operations. Label keys and values can be no longer than 64 characters (Unicode
   * codepoints), can only contain lowercase letters, numeric characters, underscores and dashes.
   * International characters are allowed. No more than 64 user labels can be associated with one
   * resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and
   * examples of labels. System reserved label keys are prefixed with
   * "apigeeregistry.googleapis.com/" and cannot be changed.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels attach identifying metadata to resources. Identifying metadata can be used to filter
   * list operations. Label keys and values can be no longer than 64 characters (Unicode
   * codepoints), can only contain lowercase letters, numeric characters, underscores and dashes.
   * International characters are allowed. No more than 64 user labels can be associated with one
   * resource (System labels are excluded). See https://goo.gl/xmQnxf for more information and
   * examples of labels. System reserved label keys are prefixed with
   * "apigeeregistry.googleapis.com/" and cannot be changed.
   * @param labels labels or {@code null} for none
   */
  public ApiSpec setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * A style (format) descriptor for this spec that is specified as a Media Type
   * (https://en.wikipedia.org/wiki/Media_type). Possible values include
   * "application/vnd.apigee.proto", "application/vnd.apigee.openapi", and
   * "application/vnd.apigee.graphql", with possible suffixes representing compression types. These
   * hypothetical names are defined in the vendor tree defined in RFC6838
   * (https://tools.ietf.org/html/rfc6838) and are not final. Content types can specify compression.
   * Currently only GZip compression is supported (indicated with "+gzip").
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * A style (format) descriptor for this spec that is specified as a Media Type
   * (https://en.wikipedia.org/wiki/Media_type). Possible values include
   * "application/vnd.apigee.proto", "application/vnd.apigee.openapi", and
   * "application/vnd.apigee.graphql", with possible suffixes representing compression types. These
   * hypothetical names are defined in the vendor tree defined in RFC6838
   * (https://tools.ietf.org/html/rfc6838) and are not final. Content types can specify compression.
   * Currently only GZip compression is supported (indicated with "+gzip").
   * @param mimeType mimeType or {@code null} for none
   */
  public ApiSpec setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Resource name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name.
   * @param name name or {@code null} for none
   */
  public ApiSpec setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Revision creation timestamp; when the represented revision was created.
   * @return value or {@code null} for none
   */
  public String getRevisionCreateTime() {
    return revisionCreateTime;
  }

  /**
   * Output only. Revision creation timestamp; when the represented revision was created.
   * @param revisionCreateTime revisionCreateTime or {@code null} for none
   */
  public ApiSpec setRevisionCreateTime(String revisionCreateTime) {
    this.revisionCreateTime = revisionCreateTime;
    return this;
  }

  /**
   * Output only. Immutable. The revision ID of the spec. A new revision is committed whenever the
   * spec contents are changed. The format is an 8-character hexadecimal string.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * Output only. Immutable. The revision ID of the spec. A new revision is committed whenever the
   * spec contents are changed. The format is an 8-character hexadecimal string.
   * @param revisionId revisionId or {@code null} for none
   */
  public ApiSpec setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * Output only. Last update timestamp: when the represented revision was last modified.
   * @return value or {@code null} for none
   */
  public String getRevisionUpdateTime() {
    return revisionUpdateTime;
  }

  /**
   * Output only. Last update timestamp: when the represented revision was last modified.
   * @param revisionUpdateTime revisionUpdateTime or {@code null} for none
   */
  public ApiSpec setRevisionUpdateTime(String revisionUpdateTime) {
    this.revisionUpdateTime = revisionUpdateTime;
    return this;
  }

  /**
   * Output only. The size of the spec file in bytes. If the spec is gzipped, this is the size of
   * the uncompressed spec.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSizeBytes() {
    return sizeBytes;
  }

  /**
   * Output only. The size of the spec file in bytes. If the spec is gzipped, this is the size of
   * the uncompressed spec.
   * @param sizeBytes sizeBytes or {@code null} for none
   */
  public ApiSpec setSizeBytes(java.lang.Integer sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * The original source URI of the spec (if one exists). This is an external location that can be
   * used for reference purposes but which may not be authoritative since this external resource may
   * change after the spec is retrieved.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceUri() {
    return sourceUri;
  }

  /**
   * The original source URI of the spec (if one exists). This is an external location that can be
   * used for reference purposes but which may not be authoritative since this external resource may
   * change after the spec is retrieved.
   * @param sourceUri sourceUri or {@code null} for none
   */
  public ApiSpec setSourceUri(java.lang.String sourceUri) {
    this.sourceUri = sourceUri;
    return this;
  }

  @Override
  public ApiSpec set(String fieldName, Object value) {
    return (ApiSpec) super.set(fieldName, value);
  }

  @Override
  public ApiSpec clone() {
    return (ApiSpec) super.clone();
  }

}
