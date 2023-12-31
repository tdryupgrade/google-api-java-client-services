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

package com.google.api.services.gkehub.v1.model;

/**
 * OCI repo configuration for a single cluster
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementOciConfig extends com.google.api.client.json.GenericJson {

  /**
   * The GCP Service Account Email used for auth when secret_type is gcpServiceAccount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcpServiceAccountEmail;

  /**
   * The absolute path of the directory that contains the local resources. Default: the root
   * directory of the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policyDir;

  /**
   * Type of secret configured for access to the Git repo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secretType;

  /**
   * The OCI image repository URL for the package to sync from. e.g. `LOCATION-
   * docker.pkg.dev/PROJECT_ID/REPOSITORY_NAME/PACKAGE_NAME`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String syncRepo;

  /**
   * Period in seconds between consecutive syncs. Default: 15.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long syncWaitSecs;

  /**
   * The GCP Service Account Email used for auth when secret_type is gcpServiceAccount.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcpServiceAccountEmail() {
    return gcpServiceAccountEmail;
  }

  /**
   * The GCP Service Account Email used for auth when secret_type is gcpServiceAccount.
   * @param gcpServiceAccountEmail gcpServiceAccountEmail or {@code null} for none
   */
  public ConfigManagementOciConfig setGcpServiceAccountEmail(java.lang.String gcpServiceAccountEmail) {
    this.gcpServiceAccountEmail = gcpServiceAccountEmail;
    return this;
  }

  /**
   * The absolute path of the directory that contains the local resources. Default: the root
   * directory of the image.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicyDir() {
    return policyDir;
  }

  /**
   * The absolute path of the directory that contains the local resources. Default: the root
   * directory of the image.
   * @param policyDir policyDir or {@code null} for none
   */
  public ConfigManagementOciConfig setPolicyDir(java.lang.String policyDir) {
    this.policyDir = policyDir;
    return this;
  }

  /**
   * Type of secret configured for access to the Git repo.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecretType() {
    return secretType;
  }

  /**
   * Type of secret configured for access to the Git repo.
   * @param secretType secretType or {@code null} for none
   */
  public ConfigManagementOciConfig setSecretType(java.lang.String secretType) {
    this.secretType = secretType;
    return this;
  }

  /**
   * The OCI image repository URL for the package to sync from. e.g. `LOCATION-
   * docker.pkg.dev/PROJECT_ID/REPOSITORY_NAME/PACKAGE_NAME`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSyncRepo() {
    return syncRepo;
  }

  /**
   * The OCI image repository URL for the package to sync from. e.g. `LOCATION-
   * docker.pkg.dev/PROJECT_ID/REPOSITORY_NAME/PACKAGE_NAME`.
   * @param syncRepo syncRepo or {@code null} for none
   */
  public ConfigManagementOciConfig setSyncRepo(java.lang.String syncRepo) {
    this.syncRepo = syncRepo;
    return this;
  }

  /**
   * Period in seconds between consecutive syncs. Default: 15.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSyncWaitSecs() {
    return syncWaitSecs;
  }

  /**
   * Period in seconds between consecutive syncs. Default: 15.
   * @param syncWaitSecs syncWaitSecs or {@code null} for none
   */
  public ConfigManagementOciConfig setSyncWaitSecs(java.lang.Long syncWaitSecs) {
    this.syncWaitSecs = syncWaitSecs;
    return this;
  }

  @Override
  public ConfigManagementOciConfig set(String fieldName, Object value) {
    return (ConfigManagementOciConfig) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementOciConfig clone() {
    return (ConfigManagementOciConfig) super.clone();
  }

}
