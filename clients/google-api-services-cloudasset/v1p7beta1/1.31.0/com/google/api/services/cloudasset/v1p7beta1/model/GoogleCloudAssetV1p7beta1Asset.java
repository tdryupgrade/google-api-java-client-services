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

package com.google.api.services.cloudasset.v1p7beta1.model;

/**
 * An asset in Google Cloud. An asset can be any resource in the Google Cloud [resource
 * hierarchy](https://cloud.google.com/resource-manager/docs/cloud-platform-resource-hierarchy), a
 * resource outside the Google Cloud resource hierarchy (such as Google Kubernetes Engine clusters
 * and objects), or a policy (e.g. Cloud IAM policy). See [Supported asset
 * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types) for more information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssetV1p7beta1Asset extends com.google.api.client.json.GenericJson {

  /**
   * Please also refer to the [access level user guide](https://cloud.google.com/access-context-
   * manager/docs/overview#access-levels).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIdentityAccesscontextmanagerV1AccessLevel accessLevel;

  /**
   * Please also refer to the [access policy user guide](https://cloud.google.com/access-context-
   * manager/docs/overview#access-policies).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIdentityAccesscontextmanagerV1AccessPolicy accessPolicy;

  /**
   * The ancestry path of an asset in Google Cloud [resource hierarchy](https://cloud.google.com
   * /resource-manager/docs/cloud-platform-resource-hierarchy), represented as a list of relative
   * resource names. An ancestry path starts with the closest ancestor in the hierarchy and ends at
   * root. If the asset is a project, folder, or organization, the ancestry path starts from the
   * asset itself. Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ancestors;

  /**
   * The type of the asset. Example: `compute.googleapis.com/Disk` See [Supported asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types) for more
   * information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assetType;

  /**
   * A representation of the Cloud IAM policy set on a Google Cloud resource. There can be a maximum
   * of one Cloud IAM policy set on any given resource. In addition, Cloud IAM policies inherit
   * their granted access scope from any policies set on parent resources in the resource hierarchy.
   * Therefore, the effectively policy is the union of both the policy set on this resource and each
   * policy set on all of the resource's ancestry resource levels in the hierarchy. See [this
   * topic](https://cloud.google.com/iam/help/allow-policies/inheritance) for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Policy iamPolicy;

  /**
   * The full name of the asset. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1` See
   * [Resource names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A representation of an [organization policy](https://cloud.google.com/resource-manager/docs
   * /organization-policy/overview#organization_policy). There can be more than one organization
   * policy with different constraints set on a given resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudOrgpolicyV1Policy> orgPolicy;

  /**
   * The related assets of the asset of one relationship type. One asset only represents one type of
   * relationship.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssetV1p7beta1RelatedAssets relatedAssets;

  /**
   * A representation of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssetV1p7beta1Resource resource;

  /**
   * Please also refer to the [service perimeter user guide](https://cloud.google.com/vpc-service-
   * controls/docs/overview).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIdentityAccesscontextmanagerV1ServicePerimeter servicePerimeter;

  /**
   * The last update timestamp of an asset. update_time is updated when create/update/delete
   * operation is performed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Please also refer to the [access level user guide](https://cloud.google.com/access-context-
   * manager/docs/overview#access-levels).
   * @return value or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1AccessLevel getAccessLevel() {
    return accessLevel;
  }

  /**
   * Please also refer to the [access level user guide](https://cloud.google.com/access-context-
   * manager/docs/overview#access-levels).
   * @param accessLevel accessLevel or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1Asset setAccessLevel(GoogleIdentityAccesscontextmanagerV1AccessLevel accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * Please also refer to the [access policy user guide](https://cloud.google.com/access-context-
   * manager/docs/overview#access-policies).
   * @return value or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1AccessPolicy getAccessPolicy() {
    return accessPolicy;
  }

  /**
   * Please also refer to the [access policy user guide](https://cloud.google.com/access-context-
   * manager/docs/overview#access-policies).
   * @param accessPolicy accessPolicy or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1Asset setAccessPolicy(GoogleIdentityAccesscontextmanagerV1AccessPolicy accessPolicy) {
    this.accessPolicy = accessPolicy;
    return this;
  }

  /**
   * The ancestry path of an asset in Google Cloud [resource hierarchy](https://cloud.google.com
   * /resource-manager/docs/cloud-platform-resource-hierarchy), represented as a list of relative
   * resource names. An ancestry path starts with the closest ancestor in the hierarchy and ends at
   * root. If the asset is a project, folder, or organization, the ancestry path starts from the
   * asset itself. Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAncestors() {
    return ancestors;
  }

  /**
   * The ancestry path of an asset in Google Cloud [resource hierarchy](https://cloud.google.com
   * /resource-manager/docs/cloud-platform-resource-hierarchy), represented as a list of relative
   * resource names. An ancestry path starts with the closest ancestor in the hierarchy and ends at
   * root. If the asset is a project, folder, or organization, the ancestry path starts from the
   * asset itself. Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * @param ancestors ancestors or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1Asset setAncestors(java.util.List<java.lang.String> ancestors) {
    this.ancestors = ancestors;
    return this;
  }

  /**
   * The type of the asset. Example: `compute.googleapis.com/Disk` See [Supported asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types) for more
   * information.
   * @return value or {@code null} for none
   */
  public java.lang.String getAssetType() {
    return assetType;
  }

  /**
   * The type of the asset. Example: `compute.googleapis.com/Disk` See [Supported asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types) for more
   * information.
   * @param assetType assetType or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1Asset setAssetType(java.lang.String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * A representation of the Cloud IAM policy set on a Google Cloud resource. There can be a maximum
   * of one Cloud IAM policy set on any given resource. In addition, Cloud IAM policies inherit
   * their granted access scope from any policies set on parent resources in the resource hierarchy.
   * Therefore, the effectively policy is the union of both the policy set on this resource and each
   * policy set on all of the resource's ancestry resource levels in the hierarchy. See [this
   * topic](https://cloud.google.com/iam/help/allow-policies/inheritance) for more information.
   * @return value or {@code null} for none
   */
  public Policy getIamPolicy() {
    return iamPolicy;
  }

  /**
   * A representation of the Cloud IAM policy set on a Google Cloud resource. There can be a maximum
   * of one Cloud IAM policy set on any given resource. In addition, Cloud IAM policies inherit
   * their granted access scope from any policies set on parent resources in the resource hierarchy.
   * Therefore, the effectively policy is the union of both the policy set on this resource and each
   * policy set on all of the resource's ancestry resource levels in the hierarchy. See [this
   * topic](https://cloud.google.com/iam/help/allow-policies/inheritance) for more information.
   * @param iamPolicy iamPolicy or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1Asset setIamPolicy(Policy iamPolicy) {
    this.iamPolicy = iamPolicy;
    return this;
  }

  /**
   * The full name of the asset. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1` See
   * [Resource names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more information.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The full name of the asset. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1` See
   * [Resource names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more information.
   * @param name name or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1Asset setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A representation of an [organization policy](https://cloud.google.com/resource-manager/docs
   * /organization-policy/overview#organization_policy). There can be more than one organization
   * policy with different constraints set on a given resource.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudOrgpolicyV1Policy> getOrgPolicy() {
    return orgPolicy;
  }

  /**
   * A representation of an [organization policy](https://cloud.google.com/resource-manager/docs
   * /organization-policy/overview#organization_policy). There can be more than one organization
   * policy with different constraints set on a given resource.
   * @param orgPolicy orgPolicy or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1Asset setOrgPolicy(java.util.List<GoogleCloudOrgpolicyV1Policy> orgPolicy) {
    this.orgPolicy = orgPolicy;
    return this;
  }

  /**
   * The related assets of the asset of one relationship type. One asset only represents one type of
   * relationship.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1RelatedAssets getRelatedAssets() {
    return relatedAssets;
  }

  /**
   * The related assets of the asset of one relationship type. One asset only represents one type of
   * relationship.
   * @param relatedAssets relatedAssets or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1Asset setRelatedAssets(GoogleCloudAssetV1p7beta1RelatedAssets relatedAssets) {
    this.relatedAssets = relatedAssets;
    return this;
  }

  /**
   * A representation of the resource.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1Resource getResource() {
    return resource;
  }

  /**
   * A representation of the resource.
   * @param resource resource or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1Asset setResource(GoogleCloudAssetV1p7beta1Resource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Please also refer to the [service perimeter user guide](https://cloud.google.com/vpc-service-
   * controls/docs/overview).
   * @return value or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1ServicePerimeter getServicePerimeter() {
    return servicePerimeter;
  }

  /**
   * Please also refer to the [service perimeter user guide](https://cloud.google.com/vpc-service-
   * controls/docs/overview).
   * @param servicePerimeter servicePerimeter or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1Asset setServicePerimeter(GoogleIdentityAccesscontextmanagerV1ServicePerimeter servicePerimeter) {
    this.servicePerimeter = servicePerimeter;
    return this;
  }

  /**
   * The last update timestamp of an asset. update_time is updated when create/update/delete
   * operation is performed.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The last update timestamp of an asset. update_time is updated when create/update/delete
   * operation is performed.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1Asset setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudAssetV1p7beta1Asset set(String fieldName, Object value) {
    return (GoogleCloudAssetV1p7beta1Asset) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssetV1p7beta1Asset clone() {
    return (GoogleCloudAssetV1p7beta1Asset) super.clone();
  }

}
