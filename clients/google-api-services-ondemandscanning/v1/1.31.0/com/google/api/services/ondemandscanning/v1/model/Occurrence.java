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

package com.google.api.services.ondemandscanning.v1.model;

/**
 * An instance of an analysis type that has been found on a resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the On-Demand Scanning API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Occurrence extends com.google.api.client.json.GenericJson {

  /**
   * Describes an attestation of an artifact.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AttestationOccurrence attestation;

  /**
   * Describes a verifiable build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildOccurrence build;

  /**
   * Output only. The time this occurrence was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Describes the deployment of an artifact on a runtime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeploymentOccurrence deployment;

  /**
   * Describes when a resource was discovered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DiscoveryOccurrence discovery;

  /**
   * Describes how this resource derives from the basis in the associated note.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageOccurrence image;

  /**
   * Output only. This explicitly denotes which of the occurrence details are specified. This field
   * can be used as a filter in list requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Output only. The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Immutable. The analysis note associated with this occurrence, in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String noteName;

  /**
   * Describes the installation of a package on the linked resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("package")
  private PackageOccurrence package__;

  /**
   * A description of actions that can be taken to remedy the note.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String remediation;

  /**
   * Required. Immutable. A URI that represents the resource for which the occurrence applies. For
   * example, `https://gcr.io/project/image@sha256:123abc` for a Docker image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceUri;

  /**
   * Output only. The time this occurrence was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Describes an available package upgrade on the linked resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UpgradeOccurrence upgrade;

  /**
   * Describes a security vulnerability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VulnerabilityOccurrence vulnerability;

  /**
   * Describes an attestation of an artifact.
   * @return value or {@code null} for none
   */
  public AttestationOccurrence getAttestation() {
    return attestation;
  }

  /**
   * Describes an attestation of an artifact.
   * @param attestation attestation or {@code null} for none
   */
  public Occurrence setAttestation(AttestationOccurrence attestation) {
    this.attestation = attestation;
    return this;
  }

  /**
   * Describes a verifiable build.
   * @return value or {@code null} for none
   */
  public BuildOccurrence getBuild() {
    return build;
  }

  /**
   * Describes a verifiable build.
   * @param build build or {@code null} for none
   */
  public Occurrence setBuild(BuildOccurrence build) {
    this.build = build;
    return this;
  }

  /**
   * Output only. The time this occurrence was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time this occurrence was created.
   * @param createTime createTime or {@code null} for none
   */
  public Occurrence setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Describes the deployment of an artifact on a runtime.
   * @return value or {@code null} for none
   */
  public DeploymentOccurrence getDeployment() {
    return deployment;
  }

  /**
   * Describes the deployment of an artifact on a runtime.
   * @param deployment deployment or {@code null} for none
   */
  public Occurrence setDeployment(DeploymentOccurrence deployment) {
    this.deployment = deployment;
    return this;
  }

  /**
   * Describes when a resource was discovered.
   * @return value or {@code null} for none
   */
  public DiscoveryOccurrence getDiscovery() {
    return discovery;
  }

  /**
   * Describes when a resource was discovered.
   * @param discovery discovery or {@code null} for none
   */
  public Occurrence setDiscovery(DiscoveryOccurrence discovery) {
    this.discovery = discovery;
    return this;
  }

  /**
   * Describes how this resource derives from the basis in the associated note.
   * @return value or {@code null} for none
   */
  public ImageOccurrence getImage() {
    return image;
  }

  /**
   * Describes how this resource derives from the basis in the associated note.
   * @param image image or {@code null} for none
   */
  public Occurrence setImage(ImageOccurrence image) {
    this.image = image;
    return this;
  }

  /**
   * Output only. This explicitly denotes which of the occurrence details are specified. This field
   * can be used as a filter in list requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Output only. This explicitly denotes which of the occurrence details are specified. This field
   * can be used as a filter in list requests.
   * @param kind kind or {@code null} for none
   */
  public Occurrence setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Output only. The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of the occurrence in the form of
   * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
   * @param name name or {@code null} for none
   */
  public Occurrence setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Immutable. The analysis note associated with this occurrence, in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getNoteName() {
    return noteName;
  }

  /**
   * Required. Immutable. The analysis note associated with this occurrence, in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
   * @param noteName noteName or {@code null} for none
   */
  public Occurrence setNoteName(java.lang.String noteName) {
    this.noteName = noteName;
    return this;
  }

  /**
   * Describes the installation of a package on the linked resource.
   * @return value or {@code null} for none
   */
  public PackageOccurrence getPackage() {
    return package__;
  }

  /**
   * Describes the installation of a package on the linked resource.
   * @param package__ package__ or {@code null} for none
   */
  public Occurrence setPackage(PackageOccurrence package__) {
    this.package__ = package__;
    return this;
  }

  /**
   * A description of actions that can be taken to remedy the note.
   * @return value or {@code null} for none
   */
  public java.lang.String getRemediation() {
    return remediation;
  }

  /**
   * A description of actions that can be taken to remedy the note.
   * @param remediation remediation or {@code null} for none
   */
  public Occurrence setRemediation(java.lang.String remediation) {
    this.remediation = remediation;
    return this;
  }

  /**
   * Required. Immutable. A URI that represents the resource for which the occurrence applies. For
   * example, `https://gcr.io/project/image@sha256:123abc` for a Docker image.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceUri() {
    return resourceUri;
  }

  /**
   * Required. Immutable. A URI that represents the resource for which the occurrence applies. For
   * example, `https://gcr.io/project/image@sha256:123abc` for a Docker image.
   * @param resourceUri resourceUri or {@code null} for none
   */
  public Occurrence setResourceUri(java.lang.String resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

  /**
   * Output only. The time this occurrence was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time this occurrence was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Occurrence setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Describes an available package upgrade on the linked resource.
   * @return value or {@code null} for none
   */
  public UpgradeOccurrence getUpgrade() {
    return upgrade;
  }

  /**
   * Describes an available package upgrade on the linked resource.
   * @param upgrade upgrade or {@code null} for none
   */
  public Occurrence setUpgrade(UpgradeOccurrence upgrade) {
    this.upgrade = upgrade;
    return this;
  }

  /**
   * Describes a security vulnerability.
   * @return value or {@code null} for none
   */
  public VulnerabilityOccurrence getVulnerability() {
    return vulnerability;
  }

  /**
   * Describes a security vulnerability.
   * @param vulnerability vulnerability or {@code null} for none
   */
  public Occurrence setVulnerability(VulnerabilityOccurrence vulnerability) {
    this.vulnerability = vulnerability;
    return this;
  }

  @Override
  public Occurrence set(String fieldName, Object value) {
    return (Occurrence) super.set(fieldName, value);
  }

  @Override
  public Occurrence clone() {
    return (Occurrence) super.clone();
  }

}
