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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * Identifies all appearances of this vulnerability in the package for a specific distro/location.
 * For example: glibc in cpe:/o:debian:debian_linux:8 for versions 2.1 - 2.2
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Detail extends com.google.api.client.json.GenericJson {

  /**
   * Required. The CPE URI in [cpe format](https://cpe.mitre.org/specification/) in which the
   * vulnerability manifests. Examples include distro or storage location for vulnerable jar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cpeUri;

  /**
   * A vendor-specific description of this note.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The fix for this specific package version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VulnerabilityLocation fixedLocation;

  /**
   * Whether this detail is obsolete. Occurrences are expected not to point to obsolete details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isObsolete;

  /**
   * The max version of the package in which the vulnerability exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Version maxAffectedVersion;

  /**
   * The min version of the package in which the vulnerability exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Version minAffectedVersion;

  /**
   * Required. The name of the package where the vulnerability was found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("package")
  private java.lang.String package__;

  /**
   * The type of package; whether native or non native(ruby gems, node.js packages etc).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageType;

  /**
   * The severity (eg: distro assigned severity) for this vulnerability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severityName;

  /**
   * The source from which the information in this Detail was obtained.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * The time this information was last changed at the source. This is an upstream timestamp from
   * the underlying information source - e.g. Ubuntu security tracker.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String sourceUpdateTime;

  /**
   * The name of the vendor of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vendor;

  /**
   * Required. The CPE URI in [cpe format](https://cpe.mitre.org/specification/) in which the
   * vulnerability manifests. Examples include distro or storage location for vulnerable jar.
   * @return value or {@code null} for none
   */
  public java.lang.String getCpeUri() {
    return cpeUri;
  }

  /**
   * Required. The CPE URI in [cpe format](https://cpe.mitre.org/specification/) in which the
   * vulnerability manifests. Examples include distro or storage location for vulnerable jar.
   * @param cpeUri cpeUri or {@code null} for none
   */
  public Detail setCpeUri(java.lang.String cpeUri) {
    this.cpeUri = cpeUri;
    return this;
  }

  /**
   * A vendor-specific description of this note.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A vendor-specific description of this note.
   * @param description description or {@code null} for none
   */
  public Detail setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The fix for this specific package version.
   * @return value or {@code null} for none
   */
  public VulnerabilityLocation getFixedLocation() {
    return fixedLocation;
  }

  /**
   * The fix for this specific package version.
   * @param fixedLocation fixedLocation or {@code null} for none
   */
  public Detail setFixedLocation(VulnerabilityLocation fixedLocation) {
    this.fixedLocation = fixedLocation;
    return this;
  }

  /**
   * Whether this detail is obsolete. Occurrences are expected not to point to obsolete details.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsObsolete() {
    return isObsolete;
  }

  /**
   * Whether this detail is obsolete. Occurrences are expected not to point to obsolete details.
   * @param isObsolete isObsolete or {@code null} for none
   */
  public Detail setIsObsolete(java.lang.Boolean isObsolete) {
    this.isObsolete = isObsolete;
    return this;
  }

  /**
   * The max version of the package in which the vulnerability exists.
   * @return value or {@code null} for none
   */
  public Version getMaxAffectedVersion() {
    return maxAffectedVersion;
  }

  /**
   * The max version of the package in which the vulnerability exists.
   * @param maxAffectedVersion maxAffectedVersion or {@code null} for none
   */
  public Detail setMaxAffectedVersion(Version maxAffectedVersion) {
    this.maxAffectedVersion = maxAffectedVersion;
    return this;
  }

  /**
   * The min version of the package in which the vulnerability exists.
   * @return value or {@code null} for none
   */
  public Version getMinAffectedVersion() {
    return minAffectedVersion;
  }

  /**
   * The min version of the package in which the vulnerability exists.
   * @param minAffectedVersion minAffectedVersion or {@code null} for none
   */
  public Detail setMinAffectedVersion(Version minAffectedVersion) {
    this.minAffectedVersion = minAffectedVersion;
    return this;
  }

  /**
   * Required. The name of the package where the vulnerability was found.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackage() {
    return package__;
  }

  /**
   * Required. The name of the package where the vulnerability was found.
   * @param package__ package__ or {@code null} for none
   */
  public Detail setPackage(java.lang.String package__) {
    this.package__ = package__;
    return this;
  }

  /**
   * The type of package; whether native or non native(ruby gems, node.js packages etc).
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageType() {
    return packageType;
  }

  /**
   * The type of package; whether native or non native(ruby gems, node.js packages etc).
   * @param packageType packageType or {@code null} for none
   */
  public Detail setPackageType(java.lang.String packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * The severity (eg: distro assigned severity) for this vulnerability.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverityName() {
    return severityName;
  }

  /**
   * The severity (eg: distro assigned severity) for this vulnerability.
   * @param severityName severityName or {@code null} for none
   */
  public Detail setSeverityName(java.lang.String severityName) {
    this.severityName = severityName;
    return this;
  }

  /**
   * The source from which the information in this Detail was obtained.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * The source from which the information in this Detail was obtained.
   * @param source source or {@code null} for none
   */
  public Detail setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  /**
   * The time this information was last changed at the source. This is an upstream timestamp from
   * the underlying information source - e.g. Ubuntu security tracker.
   * @return value or {@code null} for none
   */
  public String getSourceUpdateTime() {
    return sourceUpdateTime;
  }

  /**
   * The time this information was last changed at the source. This is an upstream timestamp from
   * the underlying information source - e.g. Ubuntu security tracker.
   * @param sourceUpdateTime sourceUpdateTime or {@code null} for none
   */
  public Detail setSourceUpdateTime(String sourceUpdateTime) {
    this.sourceUpdateTime = sourceUpdateTime;
    return this;
  }

  /**
   * The name of the vendor of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getVendor() {
    return vendor;
  }

  /**
   * The name of the vendor of the product.
   * @param vendor vendor or {@code null} for none
   */
  public Detail setVendor(java.lang.String vendor) {
    this.vendor = vendor;
    return this;
  }

  @Override
  public Detail set(String fieldName, Object value) {
    return (Detail) super.set(fieldName, value);
  }

  @Override
  public Detail clone() {
    return (Detail) super.clone();
  }

}
