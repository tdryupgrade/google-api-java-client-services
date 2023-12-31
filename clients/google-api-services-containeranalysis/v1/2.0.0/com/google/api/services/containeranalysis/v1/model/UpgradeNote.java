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

package com.google.api.services.containeranalysis.v1.model;

/**
 * An Upgrade Note represents a potential upgrade of a package to a given version. For each package
 * version combination (i.e. bash 4.0, bash 4.1, bash 4.1.2), there will be an Upgrade Note. For
 * Windows, windows_update field represents the information related to the update.
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
public final class UpgradeNote extends com.google.api.client.json.GenericJson {

  /**
   * Metadata about the upgrade for each specific operating system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UpgradeDistribution> distributions;

  static {
    // hack to force ProGuard to consider UpgradeDistribution used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(UpgradeDistribution.class);
  }

  /**
   * Required for non-Windows OS. The package this Upgrade is for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("package")
  private java.lang.String package__;

  /**
   * Required for non-Windows OS. The version of the package in machine + human readable form.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Version version;

  /**
   * Required for Windows OS. Represents the metadata about the Windows update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WindowsUpdate windowsUpdate;

  /**
   * Metadata about the upgrade for each specific operating system.
   * @return value or {@code null} for none
   */
  public java.util.List<UpgradeDistribution> getDistributions() {
    return distributions;
  }

  /**
   * Metadata about the upgrade for each specific operating system.
   * @param distributions distributions or {@code null} for none
   */
  public UpgradeNote setDistributions(java.util.List<UpgradeDistribution> distributions) {
    this.distributions = distributions;
    return this;
  }

  /**
   * Required for non-Windows OS. The package this Upgrade is for.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackage() {
    return package__;
  }

  /**
   * Required for non-Windows OS. The package this Upgrade is for.
   * @param package__ package__ or {@code null} for none
   */
  public UpgradeNote setPackage(java.lang.String package__) {
    this.package__ = package__;
    return this;
  }

  /**
   * Required for non-Windows OS. The version of the package in machine + human readable form.
   * @return value or {@code null} for none
   */
  public Version getVersion() {
    return version;
  }

  /**
   * Required for non-Windows OS. The version of the package in machine + human readable form.
   * @param version version or {@code null} for none
   */
  public UpgradeNote setVersion(Version version) {
    this.version = version;
    return this;
  }

  /**
   * Required for Windows OS. Represents the metadata about the Windows update.
   * @return value or {@code null} for none
   */
  public WindowsUpdate getWindowsUpdate() {
    return windowsUpdate;
  }

  /**
   * Required for Windows OS. Represents the metadata about the Windows update.
   * @param windowsUpdate windowsUpdate or {@code null} for none
   */
  public UpgradeNote setWindowsUpdate(WindowsUpdate windowsUpdate) {
    this.windowsUpdate = windowsUpdate;
    return this;
  }

  @Override
  public UpgradeNote set(String fieldName, Object value) {
    return (UpgradeNote) super.set(fieldName, value);
  }

  @Override
  public UpgradeNote clone() {
    return (UpgradeNote) super.clone();
  }

}
