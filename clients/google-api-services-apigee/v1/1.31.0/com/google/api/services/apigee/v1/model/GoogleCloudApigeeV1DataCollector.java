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

package com.google.api.services.apigee.v1.model;

/**
 * Data collector configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1DataCollector extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time at which the data collector was created in milliseconds since the epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long createdAt;

  /**
   * A description of the data collector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. The time at which the Data Collector was last updated in milliseconds since the
   * epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastModifiedAt;

  /**
   * ID of the data collector. Must begin with `dc_`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Immutable. The type of data this data collector will collect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. The time at which the data collector was created in milliseconds since the epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Output only. The time at which the data collector was created in milliseconds since the epoch.
   * @param createdAt createdAt or {@code null} for none
   */
  public GoogleCloudApigeeV1DataCollector setCreatedAt(java.lang.Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * A description of the data collector.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A description of the data collector.
   * @param description description or {@code null} for none
   */
  public GoogleCloudApigeeV1DataCollector setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. The time at which the Data Collector was last updated in milliseconds since the
   * epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastModifiedAt() {
    return lastModifiedAt;
  }

  /**
   * Output only. The time at which the Data Collector was last updated in milliseconds since the
   * epoch.
   * @param lastModifiedAt lastModifiedAt or {@code null} for none
   */
  public GoogleCloudApigeeV1DataCollector setLastModifiedAt(java.lang.Long lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

  /**
   * ID of the data collector. Must begin with `dc_`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * ID of the data collector. Must begin with `dc_`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1DataCollector setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. The type of data this data collector will collect.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Immutable. The type of data this data collector will collect.
   * @param type type or {@code null} for none
   */
  public GoogleCloudApigeeV1DataCollector setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1DataCollector set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1DataCollector) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1DataCollector clone() {
    return (GoogleCloudApigeeV1DataCollector) super.clone();
  }

}
