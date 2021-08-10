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
 * Represents a sole-tenant Node Group resource. A sole-tenant node is a physical server that is
 * dedicated to hosting VM instances only for your specific project. Use sole-tenant nodes to keep
 * your instances physically separated from instances in other projects, or to group your instances
 * together on the same host hardware. For more information, read Sole-tenant nodes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NodeGroup extends com.google.api.client.json.GenericJson {

  /**
   * Specifies how autoscaling should behave.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodeGroupAutoscalingPolicy autoscalingPolicy;

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
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] The type of the resource. Always compute#nodeGroup for node group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * An opaque location hint used to place the Node close to other resources. This field is for use
   * by internal tools that use the public API. The location hint here on the NodeGroup overrides
   * any location_hint present in the NodeTemplate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationHint;

  /**
   * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one
   * of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For
   * more information, see Maintenance policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String maintenancePolicy;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodeGroupMaintenanceWindow maintenanceWindow;

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * URL of the node template to create the node group from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodeTemplate;

  /**
   * [Output Only] Server-defined URL for the resource.
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
   * Share-settings for the node group
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShareSettings shareSettings;

  /**
   * [Output Only] The total number of nodes in the node group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer size;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] The name of the zone where the node group resides, such as us-central1-a.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Specifies how autoscaling should behave.
   * @return value or {@code null} for none
   */
  public NodeGroupAutoscalingPolicy getAutoscalingPolicy() {
    return autoscalingPolicy;
  }

  /**
   * Specifies how autoscaling should behave.
   * @param autoscalingPolicy autoscalingPolicy or {@code null} for none
   */
  public NodeGroup setAutoscalingPolicy(NodeGroupAutoscalingPolicy autoscalingPolicy) {
    this.autoscalingPolicy = autoscalingPolicy;
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
  public NodeGroup setCreationTimestamp(java.lang.String creationTimestamp) {
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
  public NodeGroup setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**

   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public NodeGroup setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**

   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public NodeGroup encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
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
  public NodeGroup setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] The type of the resource. Always compute#nodeGroup for node group.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] The type of the resource. Always compute#nodeGroup for node group.
   * @param kind kind or {@code null} for none
   */
  public NodeGroup setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * An opaque location hint used to place the Node close to other resources. This field is for use
   * by internal tools that use the public API. The location hint here on the NodeGroup overrides
   * any location_hint present in the NodeTemplate.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationHint() {
    return locationHint;
  }

  /**
   * An opaque location hint used to place the Node close to other resources. This field is for use
   * by internal tools that use the public API. The location hint here on the NodeGroup overrides
   * any location_hint present in the NodeTemplate.
   * @param locationHint locationHint or {@code null} for none
   */
  public NodeGroup setLocationHint(java.lang.String locationHint) {
    this.locationHint = locationHint;
    return this;
  }

  /**
   * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one
   * of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For
   * more information, see Maintenance policies.
   * @return value or {@code null} for none
   */
  public java.lang.String getMaintenancePolicy() {
    return maintenancePolicy;
  }

  /**
   * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one
   * of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For
   * more information, see Maintenance policies.
   * @param maintenancePolicy maintenancePolicy or {@code null} for none
   */
  public NodeGroup setMaintenancePolicy(java.lang.String maintenancePolicy) {
    this.maintenancePolicy = maintenancePolicy;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NodeGroupMaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }

  /**
   * @param maintenanceWindow maintenanceWindow or {@code null} for none
   */
  public NodeGroup setMaintenanceWindow(NodeGroupMaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public NodeGroup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * URL of the node template to create the node group from.
   * @return value or {@code null} for none
   */
  public java.lang.String getNodeTemplate() {
    return nodeTemplate;
  }

  /**
   * URL of the node template to create the node group from.
   * @param nodeTemplate nodeTemplate or {@code null} for none
   */
  public NodeGroup setNodeTemplate(java.lang.String nodeTemplate) {
    this.nodeTemplate = nodeTemplate;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public NodeGroup setSelfLink(java.lang.String selfLink) {
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
  public NodeGroup setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * Share-settings for the node group
   * @return value or {@code null} for none
   */
  public ShareSettings getShareSettings() {
    return shareSettings;
  }

  /**
   * Share-settings for the node group
   * @param shareSettings shareSettings or {@code null} for none
   */
  public NodeGroup setShareSettings(ShareSettings shareSettings) {
    this.shareSettings = shareSettings;
    return this;
  }

  /**
   * [Output Only] The total number of nodes in the node group.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSize() {
    return size;
  }

  /**
   * [Output Only] The total number of nodes in the node group.
   * @param size size or {@code null} for none
   */
  public NodeGroup setSize(java.lang.Integer size) {
    this.size = size;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * @param status status or {@code null} for none
   */
  public NodeGroup setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] The name of the zone where the node group resides, such as us-central1-a.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] The name of the zone where the node group resides, such as us-central1-a.
   * @param zone zone or {@code null} for none
   */
  public NodeGroup setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public NodeGroup set(String fieldName, Object value) {
    return (NodeGroup) super.set(fieldName, value);
  }

  @Override
  public NodeGroup clone() {
    return (NodeGroup) super.clone();
  }

}
