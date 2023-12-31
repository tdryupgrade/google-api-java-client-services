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

package com.google.api.services.pubsublite.v1.model;

/**
 * Metadata about a topic resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Pub/Sub Lite API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Topic extends com.google.api.client.json.GenericJson {

  /**
   * The name of the topic. Structured like:
   * projects/{project_number}/locations/{location}/topics/{topic_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The settings for this topic's partitions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PartitionConfig partitionConfig;

  /**
   * The settings for this topic's Reservation usage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReservationConfig reservationConfig;

  /**
   * The settings for this topic's message retention.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RetentionConfig retentionConfig;

  /**
   * The name of the topic. Structured like:
   * projects/{project_number}/locations/{location}/topics/{topic_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the topic. Structured like:
   * projects/{project_number}/locations/{location}/topics/{topic_id}
   * @param name name or {@code null} for none
   */
  public Topic setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The settings for this topic's partitions.
   * @return value or {@code null} for none
   */
  public PartitionConfig getPartitionConfig() {
    return partitionConfig;
  }

  /**
   * The settings for this topic's partitions.
   * @param partitionConfig partitionConfig or {@code null} for none
   */
  public Topic setPartitionConfig(PartitionConfig partitionConfig) {
    this.partitionConfig = partitionConfig;
    return this;
  }

  /**
   * The settings for this topic's Reservation usage.
   * @return value or {@code null} for none
   */
  public ReservationConfig getReservationConfig() {
    return reservationConfig;
  }

  /**
   * The settings for this topic's Reservation usage.
   * @param reservationConfig reservationConfig or {@code null} for none
   */
  public Topic setReservationConfig(ReservationConfig reservationConfig) {
    this.reservationConfig = reservationConfig;
    return this;
  }

  /**
   * The settings for this topic's message retention.
   * @return value or {@code null} for none
   */
  public RetentionConfig getRetentionConfig() {
    return retentionConfig;
  }

  /**
   * The settings for this topic's message retention.
   * @param retentionConfig retentionConfig or {@code null} for none
   */
  public Topic setRetentionConfig(RetentionConfig retentionConfig) {
    this.retentionConfig = retentionConfig;
    return this;
  }

  @Override
  public Topic set(String fieldName, Object value) {
    return (Topic) super.set(fieldName, value);
  }

  @Override
  public Topic clone() {
    return (Topic) super.clone();
  }

}
