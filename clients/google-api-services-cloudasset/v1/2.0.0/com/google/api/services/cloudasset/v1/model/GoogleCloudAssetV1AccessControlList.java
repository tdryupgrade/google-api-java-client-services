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

package com.google.api.services.cloudasset.v1.model;

/**
 * An access control list, derived from the above IAM policy binding, which contains a set of
 * resources and accesses. May include one item from each set to compose an access control entry.
 * NOTICE that there could be multiple access control lists for one IAM policy binding. The access
 * control lists are created based on resource and access combinations. For example, assume we have
 * the following cases in one IAM policy binding: - Permission P1 and P2 apply to resource R1 and
 * R2; - Permission P3 applies to resource R2 and R3; This will result in the following access
 * control lists: - AccessControlList 1: [R1, R2], [P1, P2] - AccessControlList 2: [R2, R3], [P3]
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssetV1AccessControlList extends com.google.api.client.json.GenericJson {

  /**
   * The accesses that match one of the following conditions: - The access_selector, if it is
   * specified in request; - Otherwise, access specifiers reachable from the policy binding's role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAssetV1Access> accesses;

  static {
    // hack to force ProGuard to consider GoogleCloudAssetV1Access used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudAssetV1Access.class);
  }

  /**
   * Condition evaluation for this AccessControlList, if there is a condition defined in the above
   * IAM policy binding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConditionEvaluation conditionEvaluation;

  /**
   * Resource edges of the graph starting from the policy attached resource to any descendant
   * resources. The Edge.source_node contains the full resource name of a parent resource and
   * Edge.target_node contains the full resource name of a child resource. This field is present
   * only if the output_resource_edges option is enabled in request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAssetV1Edge> resourceEdges;

  /**
   * The resources that match one of the following conditions: - The resource_selector, if it is
   * specified in request; - Otherwise, resources reachable from the policy attached resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAssetV1Resource> resources;

  /**
   * The accesses that match one of the following conditions: - The access_selector, if it is
   * specified in request; - Otherwise, access specifiers reachable from the policy binding's role.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAssetV1Access> getAccesses() {
    return accesses;
  }

  /**
   * The accesses that match one of the following conditions: - The access_selector, if it is
   * specified in request; - Otherwise, access specifiers reachable from the policy binding's role.
   * @param accesses accesses or {@code null} for none
   */
  public GoogleCloudAssetV1AccessControlList setAccesses(java.util.List<GoogleCloudAssetV1Access> accesses) {
    this.accesses = accesses;
    return this;
  }

  /**
   * Condition evaluation for this AccessControlList, if there is a condition defined in the above
   * IAM policy binding.
   * @return value or {@code null} for none
   */
  public ConditionEvaluation getConditionEvaluation() {
    return conditionEvaluation;
  }

  /**
   * Condition evaluation for this AccessControlList, if there is a condition defined in the above
   * IAM policy binding.
   * @param conditionEvaluation conditionEvaluation or {@code null} for none
   */
  public GoogleCloudAssetV1AccessControlList setConditionEvaluation(ConditionEvaluation conditionEvaluation) {
    this.conditionEvaluation = conditionEvaluation;
    return this;
  }

  /**
   * Resource edges of the graph starting from the policy attached resource to any descendant
   * resources. The Edge.source_node contains the full resource name of a parent resource and
   * Edge.target_node contains the full resource name of a child resource. This field is present
   * only if the output_resource_edges option is enabled in request.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAssetV1Edge> getResourceEdges() {
    return resourceEdges;
  }

  /**
   * Resource edges of the graph starting from the policy attached resource to any descendant
   * resources. The Edge.source_node contains the full resource name of a parent resource and
   * Edge.target_node contains the full resource name of a child resource. This field is present
   * only if the output_resource_edges option is enabled in request.
   * @param resourceEdges resourceEdges or {@code null} for none
   */
  public GoogleCloudAssetV1AccessControlList setResourceEdges(java.util.List<GoogleCloudAssetV1Edge> resourceEdges) {
    this.resourceEdges = resourceEdges;
    return this;
  }

  /**
   * The resources that match one of the following conditions: - The resource_selector, if it is
   * specified in request; - Otherwise, resources reachable from the policy attached resource.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAssetV1Resource> getResources() {
    return resources;
  }

  /**
   * The resources that match one of the following conditions: - The resource_selector, if it is
   * specified in request; - Otherwise, resources reachable from the policy attached resource.
   * @param resources resources or {@code null} for none
   */
  public GoogleCloudAssetV1AccessControlList setResources(java.util.List<GoogleCloudAssetV1Resource> resources) {
    this.resources = resources;
    return this;
  }

  @Override
  public GoogleCloudAssetV1AccessControlList set(String fieldName, Object value) {
    return (GoogleCloudAssetV1AccessControlList) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssetV1AccessControlList clone() {
    return (GoogleCloudAssetV1AccessControlList) super.clone();
  }

}
