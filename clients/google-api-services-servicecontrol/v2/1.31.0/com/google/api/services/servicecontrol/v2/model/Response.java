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

package com.google.api.services.servicecontrol.v2.model;

/**
 * This message defines attributes for a typical network response. It generally models semantics of
 * an HTTP response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Response extends com.google.api.client.json.GenericJson {

  /**
   * The amount of time it takes the backend service to fully respond to a request. Measured from
   * when the destination service starts to send the request to the backend until when the
   * destination service receives the complete response from the backend.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String backendLatency;

  /**
   * The HTTP response status code, such as `200` and `404`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long code;

  /**
   * The HTTP response headers. If multiple headers share the same key, they must be merged
   * according to HTTP spec. All header keys must be lowercased, because HTTP header keys are case-
   * insensitive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> headers;

  /**
   * The HTTP response size in bytes. If unknown, it must be -1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long size;

  /**
   * The timestamp when the `destination` service sends the last byte of the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String time;

  /**
   * The amount of time it takes the backend service to fully respond to a request. Measured from
   * when the destination service starts to send the request to the backend until when the
   * destination service receives the complete response from the backend.
   * @return value or {@code null} for none
   */
  public String getBackendLatency() {
    return backendLatency;
  }

  /**
   * The amount of time it takes the backend service to fully respond to a request. Measured from
   * when the destination service starts to send the request to the backend until when the
   * destination service receives the complete response from the backend.
   * @param backendLatency backendLatency or {@code null} for none
   */
  public Response setBackendLatency(String backendLatency) {
    this.backendLatency = backendLatency;
    return this;
  }

  /**
   * The HTTP response status code, such as `200` and `404`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCode() {
    return code;
  }

  /**
   * The HTTP response status code, such as `200` and `404`.
   * @param code code or {@code null} for none
   */
  public Response setCode(java.lang.Long code) {
    this.code = code;
    return this;
  }

  /**
   * The HTTP response headers. If multiple headers share the same key, they must be merged
   * according to HTTP spec. All header keys must be lowercased, because HTTP header keys are case-
   * insensitive.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getHeaders() {
    return headers;
  }

  /**
   * The HTTP response headers. If multiple headers share the same key, they must be merged
   * according to HTTP spec. All header keys must be lowercased, because HTTP header keys are case-
   * insensitive.
   * @param headers headers or {@code null} for none
   */
  public Response setHeaders(java.util.Map<String, java.lang.String> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * The HTTP response size in bytes. If unknown, it must be -1.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSize() {
    return size;
  }

  /**
   * The HTTP response size in bytes. If unknown, it must be -1.
   * @param size size or {@code null} for none
   */
  public Response setSize(java.lang.Long size) {
    this.size = size;
    return this;
  }

  /**
   * The timestamp when the `destination` service sends the last byte of the response.
   * @return value or {@code null} for none
   */
  public String getTime() {
    return time;
  }

  /**
   * The timestamp when the `destination` service sends the last byte of the response.
   * @param time time or {@code null} for none
   */
  public Response setTime(String time) {
    this.time = time;
    return this;
  }

  @Override
  public Response set(String fieldName, Object value) {
    return (Response) super.set(fieldName, value);
  }

  @Override
  public Response clone() {
    return (Response) super.clone();
  }

}
