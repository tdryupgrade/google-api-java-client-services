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

package com.google.api.services.vmmigration.v1alpha1.model;

/**
 * AzureSourceDetails message describes a specific source details for the Azure source type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VM Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AzureSourceDetails extends com.google.api.client.json.GenericJson {

  /**
   * Immutable. The Azure location (region) that the source VMs will be migrated from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String azureLocation;

  /**
   * Azure Credentials using tenant ID, client ID and secret.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClientSecretCredentials clientSecretCreds;

  /**
   * Output only. Provides details on the state of the Source in case of an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * User specified tags to add to every M2VM generated resource in Azure. These tags will be set in
   * addition to the default tags that are set as part of the migration process. The tags must not
   * begin with the reserved prefix `m4ce` or `m2vm`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> migrationResourcesUserTags;

  /**
   * Output only. The ID of the Azure resource group that contains all resources related to the
   * migration process of this source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceGroupId;

  /**
   * Output only. State of the source as determined by the health check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Immutable. Azure subscription ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subscriptionId;

  /**
   * Immutable. The Azure location (region) that the source VMs will be migrated from.
   * @return value or {@code null} for none
   */
  public java.lang.String getAzureLocation() {
    return azureLocation;
  }

  /**
   * Immutable. The Azure location (region) that the source VMs will be migrated from.
   * @param azureLocation azureLocation or {@code null} for none
   */
  public AzureSourceDetails setAzureLocation(java.lang.String azureLocation) {
    this.azureLocation = azureLocation;
    return this;
  }

  /**
   * Azure Credentials using tenant ID, client ID and secret.
   * @return value or {@code null} for none
   */
  public ClientSecretCredentials getClientSecretCreds() {
    return clientSecretCreds;
  }

  /**
   * Azure Credentials using tenant ID, client ID and secret.
   * @param clientSecretCreds clientSecretCreds or {@code null} for none
   */
  public AzureSourceDetails setClientSecretCreds(ClientSecretCredentials clientSecretCreds) {
    this.clientSecretCreds = clientSecretCreds;
    return this;
  }

  /**
   * Output only. Provides details on the state of the Source in case of an error.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * Output only. Provides details on the state of the Source in case of an error.
   * @param error error or {@code null} for none
   */
  public AzureSourceDetails setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * User specified tags to add to every M2VM generated resource in Azure. These tags will be set in
   * addition to the default tags that are set as part of the migration process. The tags must not
   * begin with the reserved prefix `m4ce` or `m2vm`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMigrationResourcesUserTags() {
    return migrationResourcesUserTags;
  }

  /**
   * User specified tags to add to every M2VM generated resource in Azure. These tags will be set in
   * addition to the default tags that are set as part of the migration process. The tags must not
   * begin with the reserved prefix `m4ce` or `m2vm`.
   * @param migrationResourcesUserTags migrationResourcesUserTags or {@code null} for none
   */
  public AzureSourceDetails setMigrationResourcesUserTags(java.util.Map<String, java.lang.String> migrationResourcesUserTags) {
    this.migrationResourcesUserTags = migrationResourcesUserTags;
    return this;
  }

  /**
   * Output only. The ID of the Azure resource group that contains all resources related to the
   * migration process of this source.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Output only. The ID of the Azure resource group that contains all resources related to the
   * migration process of this source.
   * @param resourceGroupId resourceGroupId or {@code null} for none
   */
  public AzureSourceDetails setResourceGroupId(java.lang.String resourceGroupId) {
    this.resourceGroupId = resourceGroupId;
    return this;
  }

  /**
   * Output only. State of the source as determined by the health check.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the source as determined by the health check.
   * @param state state or {@code null} for none
   */
  public AzureSourceDetails setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Immutable. Azure subscription ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * Immutable. Azure subscription ID.
   * @param subscriptionId subscriptionId or {@code null} for none
   */
  public AzureSourceDetails setSubscriptionId(java.lang.String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  @Override
  public AzureSourceDetails set(String fieldName, Object value) {
    return (AzureSourceDetails) super.set(fieldName, value);
  }

  @Override
  public AzureSourceDetails clone() {
    return (AzureSourceDetails) super.clone();
  }

}
