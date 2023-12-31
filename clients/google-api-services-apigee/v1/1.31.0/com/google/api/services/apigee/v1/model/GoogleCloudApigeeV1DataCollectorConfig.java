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
 * Data collector and its configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1DataCollectorConfig extends com.google.api.client.json.GenericJson {

  /**
   * Name of the data collector in the following format:
   * `organizations/{org}/datacollectors/{datacollector}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Data type accepted by the data collector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Name of the data collector in the following format:
   * `organizations/{org}/datacollectors/{datacollector}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the data collector in the following format:
   * `organizations/{org}/datacollectors/{datacollector}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1DataCollectorConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Data type accepted by the data collector.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Data type accepted by the data collector.
   * @param type type or {@code null} for none
   */
  public GoogleCloudApigeeV1DataCollectorConfig setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1DataCollectorConfig set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1DataCollectorConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1DataCollectorConfig clone() {
    return (GoogleCloudApigeeV1DataCollectorConfig) super.clone();
  }

}
