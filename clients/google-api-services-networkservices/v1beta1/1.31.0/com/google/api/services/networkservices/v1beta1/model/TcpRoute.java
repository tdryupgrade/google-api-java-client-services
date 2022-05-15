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

package com.google.api.services.networkservices.v1beta1.model;

/**
 * TcpRoute is the resource defining how TCP traffic should be routed by a Mesh/Gateway resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TcpRoute extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The timestamp when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. A free-text description of the resource. Max length 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Gateways defines a list of gateways this TcpRoute is attached to, as one of the
   * routing rules to route the requests served by the gateway. Each gateway reference should match
   * the pattern: `projects/locations/global/gateways/`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> gateways;

  /**
   * Optional. Set of label tags associated with the TcpRoute resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. Meshes defines a list of meshes this TcpRoute is attached to, as one of the routing
   * rules to route the requests served by the mesh. Each mesh reference should match the pattern:
   * `projects/locations/global/meshes/` The attached Mesh should be of a type SIDECAR
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> meshes;

  /**
   * Required. Name of the TcpRoute resource. It matches pattern
   * `projects/locations/global/tcpRoutes/tcp_route_name>`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Rules that define how traffic is routed and handled. At least one RouteRule must be
   * supplied. If there are multiple rules then the action taken will be the first rule to match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TcpRouteRouteRule> rules;

  /**
   * Output only. Server-defined URL of this resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Output only. The timestamp when the resource was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The timestamp when the resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when the resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public TcpRoute setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. A free-text description of the resource. Max length 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A free-text description of the resource. Max length 1024 characters.
   * @param description description or {@code null} for none
   */
  public TcpRoute setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Gateways defines a list of gateways this TcpRoute is attached to, as one of the
   * routing rules to route the requests served by the gateway. Each gateway reference should match
   * the pattern: `projects/locations/global/gateways/`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getGateways() {
    return gateways;
  }

  /**
   * Optional. Gateways defines a list of gateways this TcpRoute is attached to, as one of the
   * routing rules to route the requests served by the gateway. Each gateway reference should match
   * the pattern: `projects/locations/global/gateways/`
   * @param gateways gateways or {@code null} for none
   */
  public TcpRoute setGateways(java.util.List<java.lang.String> gateways) {
    this.gateways = gateways;
    return this;
  }

  /**
   * Optional. Set of label tags associated with the TcpRoute resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Set of label tags associated with the TcpRoute resource.
   * @param labels labels or {@code null} for none
   */
  public TcpRoute setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. Meshes defines a list of meshes this TcpRoute is attached to, as one of the routing
   * rules to route the requests served by the mesh. Each mesh reference should match the pattern:
   * `projects/locations/global/meshes/` The attached Mesh should be of a type SIDECAR
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMeshes() {
    return meshes;
  }

  /**
   * Optional. Meshes defines a list of meshes this TcpRoute is attached to, as one of the routing
   * rules to route the requests served by the mesh. Each mesh reference should match the pattern:
   * `projects/locations/global/meshes/` The attached Mesh should be of a type SIDECAR
   * @param meshes meshes or {@code null} for none
   */
  public TcpRoute setMeshes(java.util.List<java.lang.String> meshes) {
    this.meshes = meshes;
    return this;
  }

  /**
   * Required. Name of the TcpRoute resource. It matches pattern
   * `projects/locations/global/tcpRoutes/tcp_route_name>`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Name of the TcpRoute resource. It matches pattern
   * `projects/locations/global/tcpRoutes/tcp_route_name>`.
   * @param name name or {@code null} for none
   */
  public TcpRoute setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Rules that define how traffic is routed and handled. At least one RouteRule must be
   * supplied. If there are multiple rules then the action taken will be the first rule to match.
   * @return value or {@code null} for none
   */
  public java.util.List<TcpRouteRouteRule> getRules() {
    return rules;
  }

  /**
   * Required. Rules that define how traffic is routed and handled. At least one RouteRule must be
   * supplied. If there are multiple rules then the action taken will be the first rule to match.
   * @param rules rules or {@code null} for none
   */
  public TcpRoute setRules(java.util.List<TcpRouteRouteRule> rules) {
    this.rules = rules;
    return this;
  }

  /**
   * Output only. Server-defined URL of this resource
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Output only. Server-defined URL of this resource
   * @param selfLink selfLink or {@code null} for none
   */
  public TcpRoute setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Output only. The timestamp when the resource was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the resource was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public TcpRoute setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public TcpRoute set(String fieldName, Object value) {
    return (TcpRoute) super.set(fieldName, value);
  }

  @Override
  public TcpRoute clone() {
    return (TcpRoute) super.clone();
  }

}
