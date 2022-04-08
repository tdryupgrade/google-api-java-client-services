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

package com.google.api.services.dataplex.v1.model;

/**
 * Details about the partition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1DiscoveryEventPartitionDetails extends com.google.api.client.json.GenericJson {

  /**
   * The name to the containing entity resource. The name is the fully-qualified resource name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entity;

  /**
   * The name to the partition resource. The name is the fully-qualified resource name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String partition;

  /**
   * The locations of the data items (e.g., a Cloud Storage objects) sampled for metadata inference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sampledDataLocations;

  /**
   * The type of the containing entity resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The name to the containing entity resource. The name is the fully-qualified resource name.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntity() {
    return entity;
  }

  /**
   * The name to the containing entity resource. The name is the fully-qualified resource name.
   * @param entity entity or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEventPartitionDetails setEntity(java.lang.String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The name to the partition resource. The name is the fully-qualified resource name.
   * @return value or {@code null} for none
   */
  public java.lang.String getPartition() {
    return partition;
  }

  /**
   * The name to the partition resource. The name is the fully-qualified resource name.
   * @param partition partition or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEventPartitionDetails setPartition(java.lang.String partition) {
    this.partition = partition;
    return this;
  }

  /**
   * The locations of the data items (e.g., a Cloud Storage objects) sampled for metadata inference.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSampledDataLocations() {
    return sampledDataLocations;
  }

  /**
   * The locations of the data items (e.g., a Cloud Storage objects) sampled for metadata inference.
   * @param sampledDataLocations sampledDataLocations or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEventPartitionDetails setSampledDataLocations(java.util.List<java.lang.String> sampledDataLocations) {
    this.sampledDataLocations = sampledDataLocations;
    return this;
  }

  /**
   * The type of the containing entity resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the containing entity resource.
   * @param type type or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEventPartitionDetails setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1DiscoveryEventPartitionDetails set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1DiscoveryEventPartitionDetails) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1DiscoveryEventPartitionDetails clone() {
    return (GoogleCloudDataplexV1DiscoveryEventPartitionDetails) super.clone();
  }

}
