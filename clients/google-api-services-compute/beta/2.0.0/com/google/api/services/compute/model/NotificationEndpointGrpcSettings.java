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

package com.google.api.services.compute.model;

/**
 * Represents a gRPC setting that describes one gRPC notification endpoint and the retry duration
 * attempting to send notification to this endpoint.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NotificationEndpointGrpcSettings extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If specified, this field is used to set the authority header by the sender of
   * notifications. See https://tools.ietf.org/html/rfc7540#section-8.1.2.3
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authority;

  /**
   * Endpoint to which gRPC notifications are sent. This must be a valid gRPCLB DNS name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endpoint;

  /**
   * Optional. If specified, this field is used to populate the "name" field in gRPC requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String payloadName;

  /**
   * Optional. This field is used to configure how often to send a full update of all non-healthy
   * backends. If unspecified, full updates are not sent. If specified, must be in the range between
   * 600 seconds to 3600 seconds. Nanos are disallowed. Can only be set for regional notification
   * endpoints.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Duration resendInterval;

  /**
   * How much time (in seconds) is spent attempting notification retries until a successful response
   * is received. Default is 30s. Limit is 20m (1200s). Must be a positive number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long retryDurationSec;

  /**
   * Optional. If specified, this field is used to set the authority header by the sender of
   * notifications. See https://tools.ietf.org/html/rfc7540#section-8.1.2.3
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthority() {
    return authority;
  }

  /**
   * Optional. If specified, this field is used to set the authority header by the sender of
   * notifications. See https://tools.ietf.org/html/rfc7540#section-8.1.2.3
   * @param authority authority or {@code null} for none
   */
  public NotificationEndpointGrpcSettings setAuthority(java.lang.String authority) {
    this.authority = authority;
    return this;
  }

  /**
   * Endpoint to which gRPC notifications are sent. This must be a valid gRPCLB DNS name.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndpoint() {
    return endpoint;
  }

  /**
   * Endpoint to which gRPC notifications are sent. This must be a valid gRPCLB DNS name.
   * @param endpoint endpoint or {@code null} for none
   */
  public NotificationEndpointGrpcSettings setEndpoint(java.lang.String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Optional. If specified, this field is used to populate the "name" field in gRPC requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getPayloadName() {
    return payloadName;
  }

  /**
   * Optional. If specified, this field is used to populate the "name" field in gRPC requests.
   * @param payloadName payloadName or {@code null} for none
   */
  public NotificationEndpointGrpcSettings setPayloadName(java.lang.String payloadName) {
    this.payloadName = payloadName;
    return this;
  }

  /**
   * Optional. This field is used to configure how often to send a full update of all non-healthy
   * backends. If unspecified, full updates are not sent. If specified, must be in the range between
   * 600 seconds to 3600 seconds. Nanos are disallowed. Can only be set for regional notification
   * endpoints.
   * @return value or {@code null} for none
   */
  public Duration getResendInterval() {
    return resendInterval;
  }

  /**
   * Optional. This field is used to configure how often to send a full update of all non-healthy
   * backends. If unspecified, full updates are not sent. If specified, must be in the range between
   * 600 seconds to 3600 seconds. Nanos are disallowed. Can only be set for regional notification
   * endpoints.
   * @param resendInterval resendInterval or {@code null} for none
   */
  public NotificationEndpointGrpcSettings setResendInterval(Duration resendInterval) {
    this.resendInterval = resendInterval;
    return this;
  }

  /**
   * How much time (in seconds) is spent attempting notification retries until a successful response
   * is received. Default is 30s. Limit is 20m (1200s). Must be a positive number.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRetryDurationSec() {
    return retryDurationSec;
  }

  /**
   * How much time (in seconds) is spent attempting notification retries until a successful response
   * is received. Default is 30s. Limit is 20m (1200s). Must be a positive number.
   * @param retryDurationSec retryDurationSec or {@code null} for none
   */
  public NotificationEndpointGrpcSettings setRetryDurationSec(java.lang.Long retryDurationSec) {
    this.retryDurationSec = retryDurationSec;
    return this;
  }

  @Override
  public NotificationEndpointGrpcSettings set(String fieldName, Object value) {
    return (NotificationEndpointGrpcSettings) super.set(fieldName, value);
  }

  @Override
  public NotificationEndpointGrpcSettings clone() {
    return (NotificationEndpointGrpcSettings) super.clone();
  }

}
