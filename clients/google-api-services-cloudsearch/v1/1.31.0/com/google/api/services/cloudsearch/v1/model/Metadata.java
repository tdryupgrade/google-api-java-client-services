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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Metadata of a matched search result.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Metadata extends com.google.api.client.json.GenericJson {

  /**
   * The creation time for this document or object in the search result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Options that specify how to display a structured data search result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResultDisplayMetadata displayOptions;

  /**
   * Indexed fields in structured data, returned as a generic named property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NamedProperty> fields;

  /**
   * Mime type of the search result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * Object type of the search result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectType;

  /**
   * Owner (usually creator) of the document or object of the search result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Person owner;

  /**
   * The named source for the result, such as Gmail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Source source;

  /**
   * The thumbnail URL of the result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnailUrl;

  /**
   * The last modified date for the object in the search result. If not set in the item, the value
   * returned here is empty. When `updateTime` is used for calculating freshness and is not set,
   * this value defaults to 2 years from the current time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The creation time for this document or object in the search result.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The creation time for this document or object in the search result.
   * @param createTime createTime or {@code null} for none
   */
  public Metadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Options that specify how to display a structured data search result.
   * @return value or {@code null} for none
   */
  public ResultDisplayMetadata getDisplayOptions() {
    return displayOptions;
  }

  /**
   * Options that specify how to display a structured data search result.
   * @param displayOptions displayOptions or {@code null} for none
   */
  public Metadata setDisplayOptions(ResultDisplayMetadata displayOptions) {
    this.displayOptions = displayOptions;
    return this;
  }

  /**
   * Indexed fields in structured data, returned as a generic named property.
   * @return value or {@code null} for none
   */
  public java.util.List<NamedProperty> getFields() {
    return fields;
  }

  /**
   * Indexed fields in structured data, returned as a generic named property.
   * @param fields fields or {@code null} for none
   */
  public Metadata setFields(java.util.List<NamedProperty> fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Mime type of the search result.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * Mime type of the search result.
   * @param mimeType mimeType or {@code null} for none
   */
  public Metadata setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Object type of the search result.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectType() {
    return objectType;
  }

  /**
   * Object type of the search result.
   * @param objectType objectType or {@code null} for none
   */
  public Metadata setObjectType(java.lang.String objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * Owner (usually creator) of the document or object of the search result.
   * @return value or {@code null} for none
   */
  public Person getOwner() {
    return owner;
  }

  /**
   * Owner (usually creator) of the document or object of the search result.
   * @param owner owner or {@code null} for none
   */
  public Metadata setOwner(Person owner) {
    this.owner = owner;
    return this;
  }

  /**
   * The named source for the result, such as Gmail.
   * @return value or {@code null} for none
   */
  public Source getSource() {
    return source;
  }

  /**
   * The named source for the result, such as Gmail.
   * @param source source or {@code null} for none
   */
  public Metadata setSource(Source source) {
    this.source = source;
    return this;
  }

  /**
   * The thumbnail URL of the result.
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnailUrl() {
    return thumbnailUrl;
  }

  /**
   * The thumbnail URL of the result.
   * @param thumbnailUrl thumbnailUrl or {@code null} for none
   */
  public Metadata setThumbnailUrl(java.lang.String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

  /**
   * The last modified date for the object in the search result. If not set in the item, the value
   * returned here is empty. When `updateTime` is used for calculating freshness and is not set,
   * this value defaults to 2 years from the current time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The last modified date for the object in the search result. If not set in the item, the value
   * returned here is empty. When `updateTime` is used for calculating freshness and is not set,
   * this value defaults to 2 years from the current time.
   * @param updateTime updateTime or {@code null} for none
   */
  public Metadata setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Metadata set(String fieldName, Object value) {
    return (Metadata) super.set(fieldName, value);
  }

  @Override
  public Metadata clone() {
    return (Metadata) super.clone();
  }

}
