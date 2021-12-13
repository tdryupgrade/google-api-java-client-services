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

package com.google.api.services.container.v1beta1.model;

/**
 * SecurityBulletinEvent is a notification sent to customers when a security bulletin has been
 * posted that they are vulnerable to.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityBulletinEvent extends com.google.api.client.json.GenericJson {

  /**
   * The GKE minor versions affected by this vulnerability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> affectedSupportedMinors;

  /**
   * A brief description of the bulletin. See the bulletin pointed to by the bulletin_uri field for
   * an expanded description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String briefDescription;

  /**
   * The ID of the bulletin corresponding to the vulnerability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bulletinId;

  /**
   * The URI link to the bulletin on the website for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bulletinUri;

  /**
   * The CVEs associated with this bulletin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> cveIds;

  /**
   * If this field is specified, it means there are manual steps that the user must take to make
   * their clusters safe.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean manualStepsRequired;

  /**
   * The GKE versions where this vulnerability is patched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> patchedVersions;

  /**
   * The resource type (node/control plane) that has the vulnerability. Multiple notifications (1
   * notification per resource type) will be sent for a vulnerability that affects > 1 resource
   * type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceTypeAffected;

  /**
   * The severity of this bulletin as it relates to GKE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * This represents a version selected from the patched_versions field that the cluster receiving
   * this notification should most likely want to upgrade to based on its current version. Note that
   * if this notification is being received by a given cluster, it means that this version is
   * currently available as an upgrade target in that cluster's location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suggestedUpgradeTarget;

  /**
   * The GKE minor versions affected by this vulnerability.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAffectedSupportedMinors() {
    return affectedSupportedMinors;
  }

  /**
   * The GKE minor versions affected by this vulnerability.
   * @param affectedSupportedMinors affectedSupportedMinors or {@code null} for none
   */
  public SecurityBulletinEvent setAffectedSupportedMinors(java.util.List<java.lang.String> affectedSupportedMinors) {
    this.affectedSupportedMinors = affectedSupportedMinors;
    return this;
  }

  /**
   * A brief description of the bulletin. See the bulletin pointed to by the bulletin_uri field for
   * an expanded description.
   * @return value or {@code null} for none
   */
  public java.lang.String getBriefDescription() {
    return briefDescription;
  }

  /**
   * A brief description of the bulletin. See the bulletin pointed to by the bulletin_uri field for
   * an expanded description.
   * @param briefDescription briefDescription or {@code null} for none
   */
  public SecurityBulletinEvent setBriefDescription(java.lang.String briefDescription) {
    this.briefDescription = briefDescription;
    return this;
  }

  /**
   * The ID of the bulletin corresponding to the vulnerability.
   * @return value or {@code null} for none
   */
  public java.lang.String getBulletinId() {
    return bulletinId;
  }

  /**
   * The ID of the bulletin corresponding to the vulnerability.
   * @param bulletinId bulletinId or {@code null} for none
   */
  public SecurityBulletinEvent setBulletinId(java.lang.String bulletinId) {
    this.bulletinId = bulletinId;
    return this;
  }

  /**
   * The URI link to the bulletin on the website for more information.
   * @return value or {@code null} for none
   */
  public java.lang.String getBulletinUri() {
    return bulletinUri;
  }

  /**
   * The URI link to the bulletin on the website for more information.
   * @param bulletinUri bulletinUri or {@code null} for none
   */
  public SecurityBulletinEvent setBulletinUri(java.lang.String bulletinUri) {
    this.bulletinUri = bulletinUri;
    return this;
  }

  /**
   * The CVEs associated with this bulletin.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCveIds() {
    return cveIds;
  }

  /**
   * The CVEs associated with this bulletin.
   * @param cveIds cveIds or {@code null} for none
   */
  public SecurityBulletinEvent setCveIds(java.util.List<java.lang.String> cveIds) {
    this.cveIds = cveIds;
    return this;
  }

  /**
   * If this field is specified, it means there are manual steps that the user must take to make
   * their clusters safe.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getManualStepsRequired() {
    return manualStepsRequired;
  }

  /**
   * If this field is specified, it means there are manual steps that the user must take to make
   * their clusters safe.
   * @param manualStepsRequired manualStepsRequired or {@code null} for none
   */
  public SecurityBulletinEvent setManualStepsRequired(java.lang.Boolean manualStepsRequired) {
    this.manualStepsRequired = manualStepsRequired;
    return this;
  }

  /**
   * The GKE versions where this vulnerability is patched.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPatchedVersions() {
    return patchedVersions;
  }

  /**
   * The GKE versions where this vulnerability is patched.
   * @param patchedVersions patchedVersions or {@code null} for none
   */
  public SecurityBulletinEvent setPatchedVersions(java.util.List<java.lang.String> patchedVersions) {
    this.patchedVersions = patchedVersions;
    return this;
  }

  /**
   * The resource type (node/control plane) that has the vulnerability. Multiple notifications (1
   * notification per resource type) will be sent for a vulnerability that affects > 1 resource
   * type.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceTypeAffected() {
    return resourceTypeAffected;
  }

  /**
   * The resource type (node/control plane) that has the vulnerability. Multiple notifications (1
   * notification per resource type) will be sent for a vulnerability that affects > 1 resource
   * type.
   * @param resourceTypeAffected resourceTypeAffected or {@code null} for none
   */
  public SecurityBulletinEvent setResourceTypeAffected(java.lang.String resourceTypeAffected) {
    this.resourceTypeAffected = resourceTypeAffected;
    return this;
  }

  /**
   * The severity of this bulletin as it relates to GKE.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * The severity of this bulletin as it relates to GKE.
   * @param severity severity or {@code null} for none
   */
  public SecurityBulletinEvent setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * This represents a version selected from the patched_versions field that the cluster receiving
   * this notification should most likely want to upgrade to based on its current version. Note that
   * if this notification is being received by a given cluster, it means that this version is
   * currently available as an upgrade target in that cluster's location.
   * @return value or {@code null} for none
   */
  public java.lang.String getSuggestedUpgradeTarget() {
    return suggestedUpgradeTarget;
  }

  /**
   * This represents a version selected from the patched_versions field that the cluster receiving
   * this notification should most likely want to upgrade to based on its current version. Note that
   * if this notification is being received by a given cluster, it means that this version is
   * currently available as an upgrade target in that cluster's location.
   * @param suggestedUpgradeTarget suggestedUpgradeTarget or {@code null} for none
   */
  public SecurityBulletinEvent setSuggestedUpgradeTarget(java.lang.String suggestedUpgradeTarget) {
    this.suggestedUpgradeTarget = suggestedUpgradeTarget;
    return this;
  }

  @Override
  public SecurityBulletinEvent set(String fieldName, Object value) {
    return (SecurityBulletinEvent) super.set(fieldName, value);
  }

  @Override
  public SecurityBulletinEvent clone() {
    return (SecurityBulletinEvent) super.clone();
  }

}
