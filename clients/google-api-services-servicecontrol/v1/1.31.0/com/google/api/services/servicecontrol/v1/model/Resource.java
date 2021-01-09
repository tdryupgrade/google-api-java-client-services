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

package com.google.api.services.servicecontrol.v1.model;

/**
 * This message defines core attributes for a resource. A resource is an addressable (named) entity
 * provided by the destination service. For example, a file stored on a network storage service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Resource extends com.google.api.client.json.GenericJson {

  /**
   * Annotations is an unstructured key-value map stored with a resource that may be set by external
   * tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved
   * when modifying objects. More info: https://kubernetes.io/docs/user-guide/annotations
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Output only. The timestamp when the resource was created. This may be either the time creation
   * was initiated or when it was completed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The timestamp when the resource was deleted. If the resource is not deleted, this
   * must be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * Mutable. The display name set by clients. Must be <= 63 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. An opaque value that uniquely identifies a version or generation of a resource. It
   * can be used to confirm that the client and server agree on the ordering of a resource being
   * written.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The labels or tags on the resource, such as AWS resource tags and Kubernetes resource labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Immutable. The location of the resource. The location encoding is specific to the service
   * provider, and new encoding may be introduced as the service evolves. For Google Cloud products,
   * the encoding is what is used by Google Cloud APIs, such as `us-east1`, `aws-us-east-1`, and
   * `azure-eastus2`. The semantics of `location` is identical to the
   * `cloud.googleapis.com/location` label used by some Google Cloud APIs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The stable identifier (name) of a resource on the `service`. A resource can be logically
   * identified as "//{resource.service}/{resource.name}". The differences between a resource name
   * and a URI are: * Resource name is a logical identifier, independent of network protocol and API
   * version. For example, `//pubsub.googleapis.com/projects/123/topics/news-feed`. * URI often
   * includes protocol and version information, so it can be used directly by applications. For
   * example, `https://pubsub.googleapis.com/v1/projects/123/topics/news-feed`. See
   * https://cloud.google.com/apis/design/resource_names for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The name of the service that this resource belongs to, such as `pubsub.googleapis.com`. The
   * service may be different from the DNS hostname that actually serves the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * The type of the resource. The syntax is platform-specific because different platforms define
   * their resources differently. For Google APIs, the type format must be "{service}/{kind}".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The unique identifier of the resource. UID is unique in the time and space for this resource
   * within the scope of the service. It is typically generated by the server on successful creation
   * of a resource and must not be changed. UID is used to uniquely identify resources with resource
   * name reuses. This should be a UUID4.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. The timestamp when the resource was last updated. Any change to the resource made
   * by users must refresh this value. Changes to a resource made by the service should refresh this
   * value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Annotations is an unstructured key-value map stored with a resource that may be set by external
   * tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved
   * when modifying objects. More info: https://kubernetes.io/docs/user-guide/annotations
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Annotations is an unstructured key-value map stored with a resource that may be set by external
   * tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved
   * when modifying objects. More info: https://kubernetes.io/docs/user-guide/annotations
   * @param annotations annotations or {@code null} for none
   */
  public Resource setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Output only. The timestamp when the resource was created. This may be either the time creation
   * was initiated or when it was completed.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when the resource was created. This may be either the time creation
   * was initiated or when it was completed.
   * @param createTime createTime or {@code null} for none
   */
  public Resource setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The timestamp when the resource was deleted. If the resource is not deleted, this
   * must be empty.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. The timestamp when the resource was deleted. If the resource is not deleted, this
   * must be empty.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public Resource setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * Mutable. The display name set by clients. Must be <= 63 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Mutable. The display name set by clients. Must be <= 63 characters.
   * @param displayName displayName or {@code null} for none
   */
  public Resource setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. An opaque value that uniquely identifies a version or generation of a resource. It
   * can be used to confirm that the client and server agree on the ordering of a resource being
   * written.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. An opaque value that uniquely identifies a version or generation of a resource. It
   * can be used to confirm that the client and server agree on the ordering of a resource being
   * written.
   * @param etag etag or {@code null} for none
   */
  public Resource setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The labels or tags on the resource, such as AWS resource tags and Kubernetes resource labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels or tags on the resource, such as AWS resource tags and Kubernetes resource labels.
   * @param labels labels or {@code null} for none
   */
  public Resource setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Immutable. The location of the resource. The location encoding is specific to the service
   * provider, and new encoding may be introduced as the service evolves. For Google Cloud products,
   * the encoding is what is used by Google Cloud APIs, such as `us-east1`, `aws-us-east-1`, and
   * `azure-eastus2`. The semantics of `location` is identical to the
   * `cloud.googleapis.com/location` label used by some Google Cloud APIs.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Immutable. The location of the resource. The location encoding is specific to the service
   * provider, and new encoding may be introduced as the service evolves. For Google Cloud products,
   * the encoding is what is used by Google Cloud APIs, such as `us-east1`, `aws-us-east-1`, and
   * `azure-eastus2`. The semantics of `location` is identical to the
   * `cloud.googleapis.com/location` label used by some Google Cloud APIs.
   * @param location location or {@code null} for none
   */
  public Resource setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * The stable identifier (name) of a resource on the `service`. A resource can be logically
   * identified as "//{resource.service}/{resource.name}". The differences between a resource name
   * and a URI are: * Resource name is a logical identifier, independent of network protocol and API
   * version. For example, `//pubsub.googleapis.com/projects/123/topics/news-feed`. * URI often
   * includes protocol and version information, so it can be used directly by applications. For
   * example, `https://pubsub.googleapis.com/v1/projects/123/topics/news-feed`. See
   * https://cloud.google.com/apis/design/resource_names for details.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The stable identifier (name) of a resource on the `service`. A resource can be logically
   * identified as "//{resource.service}/{resource.name}". The differences between a resource name
   * and a URI are: * Resource name is a logical identifier, independent of network protocol and API
   * version. For example, `//pubsub.googleapis.com/projects/123/topics/news-feed`. * URI often
   * includes protocol and version information, so it can be used directly by applications. For
   * example, `https://pubsub.googleapis.com/v1/projects/123/topics/news-feed`. See
   * https://cloud.google.com/apis/design/resource_names for details.
   * @param name name or {@code null} for none
   */
  public Resource setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the service that this resource belongs to, such as `pubsub.googleapis.com`. The
   * service may be different from the DNS hostname that actually serves the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * The name of the service that this resource belongs to, such as `pubsub.googleapis.com`. The
   * service may be different from the DNS hostname that actually serves the request.
   * @param service service or {@code null} for none
   */
  public Resource setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  /**
   * The type of the resource. The syntax is platform-specific because different platforms define
   * their resources differently. For Google APIs, the type format must be "{service}/{kind}".
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the resource. The syntax is platform-specific because different platforms define
   * their resources differently. For Google APIs, the type format must be "{service}/{kind}".
   * @param type type or {@code null} for none
   */
  public Resource setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The unique identifier of the resource. UID is unique in the time and space for this resource
   * within the scope of the service. It is typically generated by the server on successful creation
   * of a resource and must not be changed. UID is used to uniquely identify resources with resource
   * name reuses. This should be a UUID4.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * The unique identifier of the resource. UID is unique in the time and space for this resource
   * within the scope of the service. It is typically generated by the server on successful creation
   * of a resource and must not be changed. UID is used to uniquely identify resources with resource
   * name reuses. This should be a UUID4.
   * @param uid uid or {@code null} for none
   */
  public Resource setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. The timestamp when the resource was last updated. Any change to the resource made
   * by users must refresh this value. Changes to a resource made by the service should refresh this
   * value.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the resource was last updated. Any change to the resource made
   * by users must refresh this value. Changes to a resource made by the service should refresh this
   * value.
   * @param updateTime updateTime or {@code null} for none
   */
  public Resource setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Resource set(String fieldName, Object value) {
    return (Resource) super.set(fieldName, value);
  }

  @Override
  public Resource clone() {
    return (Resource) super.clone();
  }

}
