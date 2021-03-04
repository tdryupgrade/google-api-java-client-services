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

package com.google.api.services.drive.model;

/**
 * An notification channel used to watch for resource changes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Channel extends com.google.api.client.json.GenericJson {

  /**
   * The address where notifications are delivered for this channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * Date and time of notification channel expiration, expressed as a Unix timestamp, in
   * milliseconds. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expiration;

  /**
   * A UUID or similar unique string that identifies this channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies this as a notification channel used to watch for changes to a resource, which is
   * "api#channel".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Additional parameters controlling delivery channel behavior. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> params;

  /**
   * A Boolean value to indicate whether payload is wanted. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean payload;

  /**
   * An opaque ID that identifies the resource being watched on this channel. Stable across
   * different API versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceId;

  /**
   * A version-specific identifier for the watched resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceUri;

  /**
   * An arbitrary string delivered to the target address with each notification delivered over this
   * channel. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String token;

  /**
   * The type of delivery mechanism used for this channel. Valid values are "web_hook" (or
   * "webhook"). Both values refer to a channel where Http requests are used to deliver messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The address where notifications are delivered for this channel.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * The address where notifications are delivered for this channel.
   * @param address address or {@code null} for none
   */
  public Channel setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * Date and time of notification channel expiration, expressed as a Unix timestamp, in
   * milliseconds. Optional.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpiration() {
    return expiration;
  }

  /**
   * Date and time of notification channel expiration, expressed as a Unix timestamp, in
   * milliseconds. Optional.
   * @param expiration expiration or {@code null} for none
   */
  public Channel setExpiration(java.lang.Long expiration) {
    this.expiration = expiration;
    return this;
  }

  /**
   * A UUID or similar unique string that identifies this channel.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * A UUID or similar unique string that identifies this channel.
   * @param id id or {@code null} for none
   */
  public Channel setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies this as a notification channel used to watch for changes to a resource, which is
   * "api#channel".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies this as a notification channel used to watch for changes to a resource, which is
   * "api#channel".
   * @param kind kind or {@code null} for none
   */
  public Channel setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Additional parameters controlling delivery channel behavior. Optional.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getParams() {
    return params;
  }

  /**
   * Additional parameters controlling delivery channel behavior. Optional.
   * @param params params or {@code null} for none
   */
  public Channel setParams(java.util.Map<String, java.lang.String> params) {
    this.params = params;
    return this;
  }

  /**
   * A Boolean value to indicate whether payload is wanted. Optional.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPayload() {
    return payload;
  }

  /**
   * A Boolean value to indicate whether payload is wanted. Optional.
   * @param payload payload or {@code null} for none
   */
  public Channel setPayload(java.lang.Boolean payload) {
    this.payload = payload;
    return this;
  }

  /**
   * An opaque ID that identifies the resource being watched on this channel. Stable across
   * different API versions.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceId() {
    return resourceId;
  }

  /**
   * An opaque ID that identifies the resource being watched on this channel. Stable across
   * different API versions.
   * @param resourceId resourceId or {@code null} for none
   */
  public Channel setResourceId(java.lang.String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * A version-specific identifier for the watched resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceUri() {
    return resourceUri;
  }

  /**
   * A version-specific identifier for the watched resource.
   * @param resourceUri resourceUri or {@code null} for none
   */
  public Channel setResourceUri(java.lang.String resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

  /**
   * An arbitrary string delivered to the target address with each notification delivered over this
   * channel. Optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getToken() {
    return token;
  }

  /**
   * An arbitrary string delivered to the target address with each notification delivered over this
   * channel. Optional.
   * @param token token or {@code null} for none
   */
  public Channel setToken(java.lang.String token) {
    this.token = token;
    return this;
  }

  /**
   * The type of delivery mechanism used for this channel. Valid values are "web_hook" (or
   * "webhook"). Both values refer to a channel where Http requests are used to deliver messages.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of delivery mechanism used for this channel. Valid values are "web_hook" (or
   * "webhook"). Both values refer to a channel where Http requests are used to deliver messages.
   * @param type type or {@code null} for none
   */
  public Channel setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Channel set(String fieldName, Object value) {
    return (Channel) super.set(fieldName, value);
  }

  @Override
  public Channel clone() {
    return (Channel) super.clone();
  }

}
