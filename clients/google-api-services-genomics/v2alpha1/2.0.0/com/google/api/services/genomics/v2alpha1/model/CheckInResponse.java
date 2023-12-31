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

package com.google.api.services.genomics.v2alpha1.model;

/**
 * The response to the CheckIn method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CheckInResponse extends com.google.api.client.json.GenericJson {

  /**
   * The deadline by which the worker must request an extension. The backend will allow for network
   * transmission time and other delays, but the worker must attempt to transmit the extension
   * request no later than the deadline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deadline;

  /**
   * Feature configuration for the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> features;

  /**
   * The metadata that describes the operation assigned to the worker.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> metadata;

  /**
   * The deadline by which the worker must request an extension. The backend will allow for network
   * transmission time and other delays, but the worker must attempt to transmit the extension
   * request no later than the deadline.
   * @return value or {@code null} for none
   */
  public String getDeadline() {
    return deadline;
  }

  /**
   * The deadline by which the worker must request an extension. The backend will allow for network
   * transmission time and other delays, but the worker must attempt to transmit the extension
   * request no later than the deadline.
   * @param deadline deadline or {@code null} for none
   */
  public CheckInResponse setDeadline(String deadline) {
    this.deadline = deadline;
    return this;
  }

  /**
   * Feature configuration for the operation.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getFeatures() {
    return features;
  }

  /**
   * Feature configuration for the operation.
   * @param features features or {@code null} for none
   */
  public CheckInResponse setFeatures(java.util.Map<String, java.lang.Object> features) {
    this.features = features;
    return this;
  }

  /**
   * The metadata that describes the operation assigned to the worker.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getMetadata() {
    return metadata;
  }

  /**
   * The metadata that describes the operation assigned to the worker.
   * @param metadata metadata or {@code null} for none
   */
  public CheckInResponse setMetadata(java.util.Map<String, java.lang.Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  @Override
  public CheckInResponse set(String fieldName, Object value) {
    return (CheckInResponse) super.set(fieldName, value);
  }

  @Override
  public CheckInResponse clone() {
    return (CheckInResponse) super.clone();
  }

}
