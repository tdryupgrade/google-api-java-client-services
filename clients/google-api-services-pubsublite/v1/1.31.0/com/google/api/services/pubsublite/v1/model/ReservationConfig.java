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
 * The settings for this topic's Reservation usage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Pub/Sub Lite API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReservationConfig extends com.google.api.client.json.GenericJson {

  /**
   * The Reservation to use for this topic's throughput capacity. Structured like:
   * projects/{project_number}/locations/{location}/reservations/{reservation_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String throughputReservation;

  /**
   * The Reservation to use for this topic's throughput capacity. Structured like:
   * projects/{project_number}/locations/{location}/reservations/{reservation_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getThroughputReservation() {
    return throughputReservation;
  }

  /**
   * The Reservation to use for this topic's throughput capacity. Structured like:
   * projects/{project_number}/locations/{location}/reservations/{reservation_id}
   * @param throughputReservation throughputReservation or {@code null} for none
   */
  public ReservationConfig setThroughputReservation(java.lang.String throughputReservation) {
    this.throughputReservation = throughputReservation;
    return this;
  }

  @Override
  public ReservationConfig set(String fieldName, Object value) {
    return (ReservationConfig) super.set(fieldName, value);
  }

  @Override
  public ReservationConfig clone() {
    return (ReservationConfig) super.clone();
  }

}
