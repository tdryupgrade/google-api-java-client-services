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
 * A phrase in the text that is a known entity type, such as a person, an organization, or location.
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
public final class GoogleCloudDocumentaiV1beta2DocumentEntity extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Confidence of detected Schema entity. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Optional. Canonical id. This will be a unique value in the entity list for this document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Optional. Deprecated. Use `id` field instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mentionId;

  /**
   * Optional. Text value in the document e.g. `1600 Amphitheatre Pkwy`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mentionText;

  /**
   * Optional. Normalized entity value. Absent if the extracted value could not be converted or the
   * type (e.g. address) is not supported for certain parsers. This field is also only populated for
   * certain supported document types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2DocumentEntityNormalizedValue normalizedValue;

  /**
   * Optional. Represents the provenance of this entity wrt. the location on the page where it was
   * found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2DocumentPageAnchor pageAnchor;

  /**
   * Optional. Entities can be nested to form a hierarchical data structure representing the content
   * in the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta2DocumentEntity> properties;

  /**
   * Optional. The history of this annotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2DocumentProvenance provenance;

  /**
   * Optional. Whether the entity will be redacted for de-identification purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean redacted;

  /**
   * Optional. Provenance of the entity. Text anchor indexing into the Document.text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2DocumentTextAnchor textAnchor;

  /**
   * Entity type from a schema e.g. `Address`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Optional. Confidence of detected Schema entity. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Optional. Confidence of detected Schema entity. Range [0, 1].
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntity setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Optional. Canonical id. This will be a unique value in the entity list for this document.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Optional. Canonical id. This will be a unique value in the entity list for this document.
   * @param id id or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntity setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Optional. Deprecated. Use `id` field instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getMentionId() {
    return mentionId;
  }

  /**
   * Optional. Deprecated. Use `id` field instead.
   * @param mentionId mentionId or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntity setMentionId(java.lang.String mentionId) {
    this.mentionId = mentionId;
    return this;
  }

  /**
   * Optional. Text value in the document e.g. `1600 Amphitheatre Pkwy`.
   * @return value or {@code null} for none
   */
  public java.lang.String getMentionText() {
    return mentionText;
  }

  /**
   * Optional. Text value in the document e.g. `1600 Amphitheatre Pkwy`.
   * @param mentionText mentionText or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntity setMentionText(java.lang.String mentionText) {
    this.mentionText = mentionText;
    return this;
  }

  /**
   * Optional. Normalized entity value. Absent if the extracted value could not be converted or the
   * type (e.g. address) is not supported for certain parsers. This field is also only populated for
   * certain supported document types.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntityNormalizedValue getNormalizedValue() {
    return normalizedValue;
  }

  /**
   * Optional. Normalized entity value. Absent if the extracted value could not be converted or the
   * type (e.g. address) is not supported for certain parsers. This field is also only populated for
   * certain supported document types.
   * @param normalizedValue normalizedValue or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntity setNormalizedValue(GoogleCloudDocumentaiV1beta2DocumentEntityNormalizedValue normalizedValue) {
    this.normalizedValue = normalizedValue;
    return this;
  }

  /**
   * Optional. Represents the provenance of this entity wrt. the location on the page where it was
   * found.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentPageAnchor getPageAnchor() {
    return pageAnchor;
  }

  /**
   * Optional. Represents the provenance of this entity wrt. the location on the page where it was
   * found.
   * @param pageAnchor pageAnchor or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntity setPageAnchor(GoogleCloudDocumentaiV1beta2DocumentPageAnchor pageAnchor) {
    this.pageAnchor = pageAnchor;
    return this;
  }

  /**
   * Optional. Entities can be nested to form a hierarchical data structure representing the content
   * in the document.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta2DocumentEntity> getProperties() {
    return properties;
  }

  /**
   * Optional. Entities can be nested to form a hierarchical data structure representing the content
   * in the document.
   * @param properties properties or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntity setProperties(java.util.List<GoogleCloudDocumentaiV1beta2DocumentEntity> properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Optional. The history of this annotation.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentProvenance getProvenance() {
    return provenance;
  }

  /**
   * Optional. The history of this annotation.
   * @param provenance provenance or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntity setProvenance(GoogleCloudDocumentaiV1beta2DocumentProvenance provenance) {
    this.provenance = provenance;
    return this;
  }

  /**
   * Optional. Whether the entity will be redacted for de-identification purposes.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRedacted() {
    return redacted;
  }

  /**
   * Optional. Whether the entity will be redacted for de-identification purposes.
   * @param redacted redacted or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntity setRedacted(java.lang.Boolean redacted) {
    this.redacted = redacted;
    return this;
  }

  /**
   * Optional. Provenance of the entity. Text anchor indexing into the Document.text.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentTextAnchor getTextAnchor() {
    return textAnchor;
  }

  /**
   * Optional. Provenance of the entity. Text anchor indexing into the Document.text.
   * @param textAnchor textAnchor or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntity setTextAnchor(GoogleCloudDocumentaiV1beta2DocumentTextAnchor textAnchor) {
    this.textAnchor = textAnchor;
    return this;
  }

  /**
   * Entity type from a schema e.g. `Address`.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Entity type from a schema e.g. `Address`.
   * @param type type or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentEntity setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentEntity set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2DocumentEntity) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentEntity clone() {
    return (GoogleCloudDocumentaiV1beta2DocumentEntity) super.clone();
  }

}
