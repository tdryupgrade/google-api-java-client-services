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

package com.google.api.services.securitycenter.v1beta1.model;

/**
 * User specified settings that are attached to the Security Command Center organization.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrganizationSettings extends com.google.api.client.json.GenericJson {

  /**
   * The configuration used for Asset Discovery runs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssetDiscoveryConfig assetDiscoveryConfig;

  /**
   * A flag that indicates if Asset Discovery should be enabled. If the flag is set to `true`, then
   * discovery of assets will occur. If it is set to `false`, all historical assets will remain, but
   * discovery of future assets will not occur.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableAssetDiscovery;

  /**
   * The relative resource name of the settings. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/{organization_id}/organizationSettings".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The configuration used for Asset Discovery runs.
   * @return value or {@code null} for none
   */
  public AssetDiscoveryConfig getAssetDiscoveryConfig() {
    return assetDiscoveryConfig;
  }

  /**
   * The configuration used for Asset Discovery runs.
   * @param assetDiscoveryConfig assetDiscoveryConfig or {@code null} for none
   */
  public OrganizationSettings setAssetDiscoveryConfig(AssetDiscoveryConfig assetDiscoveryConfig) {
    this.assetDiscoveryConfig = assetDiscoveryConfig;
    return this;
  }

  /**
   * A flag that indicates if Asset Discovery should be enabled. If the flag is set to `true`, then
   * discovery of assets will occur. If it is set to `false`, all historical assets will remain, but
   * discovery of future assets will not occur.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableAssetDiscovery() {
    return enableAssetDiscovery;
  }

  /**
   * A flag that indicates if Asset Discovery should be enabled. If the flag is set to `true`, then
   * discovery of assets will occur. If it is set to `false`, all historical assets will remain, but
   * discovery of future assets will not occur.
   * @param enableAssetDiscovery enableAssetDiscovery or {@code null} for none
   */
  public OrganizationSettings setEnableAssetDiscovery(java.lang.Boolean enableAssetDiscovery) {
    this.enableAssetDiscovery = enableAssetDiscovery;
    return this;
  }

  /**
   * The relative resource name of the settings. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/{organization_id}/organizationSettings".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The relative resource name of the settings. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/{organization_id}/organizationSettings".
   * @param name name or {@code null} for none
   */
  public OrganizationSettings setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public OrganizationSettings set(String fieldName, Object value) {
    return (OrganizationSettings) super.set(fieldName, value);
  }

  @Override
  public OrganizationSettings clone() {
    return (OrganizationSettings) super.clone();
  }

}
