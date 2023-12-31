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
 * QueuedResource represents a request for future capacity. The capacity is delivered in the form of
 * other GCE resources, either Instances or Reservations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueuedResource extends com.google.api.client.json.GenericJson {

  /**
   * Specification of VM instances to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BulkInsertInstanceResource bulkInsertInstanceResource;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#queuedResource for QueuedResources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Queuing parameters for the requested capacity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QueuingPolicy queuingPolicy;

  /**
   * [Output only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * [Output only] High-level status of the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * [Output only] Result of queuing and provisioning based on deferred capacity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QueuedResourceStatus status;

  /**
   * [Output Only] URL of the zone where the resource resides. Only applicable for zonal resources.
   * You must specify this field as part of the HTTP request URL. It is not settable as a field in
   * the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Specification of VM instances to create.
   * @return value or {@code null} for none
   */
  public BulkInsertInstanceResource getBulkInsertInstanceResource() {
    return bulkInsertInstanceResource;
  }

  /**
   * Specification of VM instances to create.
   * @param bulkInsertInstanceResource bulkInsertInstanceResource or {@code null} for none
   */
  public QueuedResource setBulkInsertInstanceResource(BulkInsertInstanceResource bulkInsertInstanceResource) {
    this.bulkInsertInstanceResource = bulkInsertInstanceResource;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public QueuedResource setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public QueuedResource setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public QueuedResource setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#queuedResource for QueuedResources.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#queuedResource for QueuedResources.
   * @param kind kind or {@code null} for none
   */
  public QueuedResource setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public QueuedResource setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Queuing parameters for the requested capacity.
   * @return value or {@code null} for none
   */
  public QueuingPolicy getQueuingPolicy() {
    return queuingPolicy;
  }

  /**
   * Queuing parameters for the requested capacity.
   * @param queuingPolicy queuingPolicy or {@code null} for none
   */
  public QueuedResource setQueuingPolicy(QueuingPolicy queuingPolicy) {
    this.queuingPolicy = queuingPolicy;
    return this;
  }

  /**
   * [Output only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public QueuedResource setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public QueuedResource setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * [Output only] High-level status of the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * [Output only] High-level status of the request.
   * @param state state or {@code null} for none
   */
  public QueuedResource setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * [Output only] Result of queuing and provisioning based on deferred capacity.
   * @return value or {@code null} for none
   */
  public QueuedResourceStatus getStatus() {
    return status;
  }

  /**
   * [Output only] Result of queuing and provisioning based on deferred capacity.
   * @param status status or {@code null} for none
   */
  public QueuedResource setStatus(QueuedResourceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] URL of the zone where the resource resides. Only applicable for zonal resources.
   * You must specify this field as part of the HTTP request URL. It is not settable as a field in
   * the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] URL of the zone where the resource resides. Only applicable for zonal resources.
   * You must specify this field as part of the HTTP request URL. It is not settable as a field in
   * the request body.
   * @param zone zone or {@code null} for none
   */
  public QueuedResource setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public QueuedResource set(String fieldName, Object value) {
    return (QueuedResource) super.set(fieldName, value);
  }

  @Override
  public QueuedResource clone() {
    return (QueuedResource) super.clone();
  }

}
