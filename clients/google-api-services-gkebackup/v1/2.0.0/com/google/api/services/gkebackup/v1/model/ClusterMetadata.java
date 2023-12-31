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

package com.google.api.services.gkebackup.v1.model;

/**
 * Information about the GKE cluster from which this Backup was created.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup for GKE API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClusterMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Anthos version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String anthosVersion;

  /**
   * Output only. A list of the Backup for GKE CRD versions found in the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> backupCrdVersions;

  /**
   * Output only. The source cluster from which this Backup was created. Valid formats: -
   * `projects/locations/clusters` - `projects/zones/clusters` This is inherited from the parent
   * BackupPlan's cluster field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cluster;

  /**
   * Output only. GKE version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gkeVersion;

  /**
   * Output only. The Kubernetes server version of the source cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String k8sVersion;

  /**
   * Output only. Anthos version
   * @return value or {@code null} for none
   */
  public java.lang.String getAnthosVersion() {
    return anthosVersion;
  }

  /**
   * Output only. Anthos version
   * @param anthosVersion anthosVersion or {@code null} for none
   */
  public ClusterMetadata setAnthosVersion(java.lang.String anthosVersion) {
    this.anthosVersion = anthosVersion;
    return this;
  }

  /**
   * Output only. A list of the Backup for GKE CRD versions found in the cluster.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getBackupCrdVersions() {
    return backupCrdVersions;
  }

  /**
   * Output only. A list of the Backup for GKE CRD versions found in the cluster.
   * @param backupCrdVersions backupCrdVersions or {@code null} for none
   */
  public ClusterMetadata setBackupCrdVersions(java.util.Map<String, java.lang.String> backupCrdVersions) {
    this.backupCrdVersions = backupCrdVersions;
    return this;
  }

  /**
   * Output only. The source cluster from which this Backup was created. Valid formats: -
   * `projects/locations/clusters` - `projects/zones/clusters` This is inherited from the parent
   * BackupPlan's cluster field.
   * @return value or {@code null} for none
   */
  public java.lang.String getCluster() {
    return cluster;
  }

  /**
   * Output only. The source cluster from which this Backup was created. Valid formats: -
   * `projects/locations/clusters` - `projects/zones/clusters` This is inherited from the parent
   * BackupPlan's cluster field.
   * @param cluster cluster or {@code null} for none
   */
  public ClusterMetadata setCluster(java.lang.String cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * Output only. GKE version
   * @return value or {@code null} for none
   */
  public java.lang.String getGkeVersion() {
    return gkeVersion;
  }

  /**
   * Output only. GKE version
   * @param gkeVersion gkeVersion or {@code null} for none
   */
  public ClusterMetadata setGkeVersion(java.lang.String gkeVersion) {
    this.gkeVersion = gkeVersion;
    return this;
  }

  /**
   * Output only. The Kubernetes server version of the source cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getK8sVersion() {
    return k8sVersion;
  }

  /**
   * Output only. The Kubernetes server version of the source cluster.
   * @param k8sVersion k8sVersion or {@code null} for none
   */
  public ClusterMetadata setK8sVersion(java.lang.String k8sVersion) {
    this.k8sVersion = k8sVersion;
    return this;
  }

  @Override
  public ClusterMetadata set(String fieldName, Object value) {
    return (ClusterMetadata) super.set(fieldName, value);
  }

  @Override
  public ClusterMetadata clone() {
    return (ClusterMetadata) super.clone();
  }

}
