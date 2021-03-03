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

package com.google.api.services.cloudasset.v1p4beta1.model;

/**
 * An asset identify in Google Cloud which contains its name, type and ancestors. An asset can be
 * any resource in the Google Cloud [resource hierarchy](https://cloud.google.com/resource-
 * manager/docs/cloud-platform-resource-hierarchy), a resource outside the Google Cloud resource
 * hierarchy (such as Google Kubernetes Engine clusters and objects), or a policy (e.g. Cloud IAM
 * policy). See [Supported asset types](https://cloud.google.com/asset-inventory/docs/supported-
 * asset-types) for more information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssetV1p7beta1RelatedAsset extends com.google.api.client.json.GenericJson {

  /**
   * The ancestors of an asset in Google Cloud [resource hierarchy](https://cloud.google.com
   * /resource-manager/docs/cloud-platform-resource-hierarchy), represented as a list of relative
   * resource names. An ancestry path starts with the closest ancestor in the hierarchy and ends at
   * root. Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ancestors;

  /**
   * The full name of the asset. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1` See
   * [Resource names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String asset;

  /**
   * The type of the asset. Example: `compute.googleapis.com/Disk` See [Supported asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types) for more
   * information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assetType;

  /**
   * The ancestors of an asset in Google Cloud [resource hierarchy](https://cloud.google.com
   * /resource-manager/docs/cloud-platform-resource-hierarchy), represented as a list of relative
   * resource names. An ancestry path starts with the closest ancestor in the hierarchy and ends at
   * root. Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAncestors() {
    return ancestors;
  }

  /**
   * The ancestors of an asset in Google Cloud [resource hierarchy](https://cloud.google.com
   * /resource-manager/docs/cloud-platform-resource-hierarchy), represented as a list of relative
   * resource names. An ancestry path starts with the closest ancestor in the hierarchy and ends at
   * root. Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * @param ancestors ancestors or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1RelatedAsset setAncestors(java.util.List<java.lang.String> ancestors) {
    this.ancestors = ancestors;
    return this;
  }

  /**
   * The full name of the asset. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1` See
   * [Resource names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more information.
   * @return value or {@code null} for none
   */
  public java.lang.String getAsset() {
    return asset;
  }

  /**
   * The full name of the asset. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1` See
   * [Resource names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more information.
   * @param asset asset or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1RelatedAsset setAsset(java.lang.String asset) {
    this.asset = asset;
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
  public GoogleCloudAssetV1p7beta1RelatedAsset setAssetType(java.lang.String assetType) {
    this.assetType = assetType;
    return this;
  }

  @Override
  public GoogleCloudAssetV1p7beta1RelatedAsset set(String fieldName, Object value) {
    return (GoogleCloudAssetV1p7beta1RelatedAsset) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssetV1p7beta1RelatedAsset clone() {
    return (GoogleCloudAssetV1p7beta1RelatedAsset) super.clone();
  }

}
