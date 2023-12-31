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

package com.google.api.services.testing.model;

/**
 * A description of how to set up an iOS device prior to running the test.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IosTestSetup extends com.google.api.client.json.GenericJson {

  /**
   * iOS apps to install in addition to those being directly tested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FileReference> additionalIpas;

  static {
    // hack to force ProGuard to consider FileReference used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FileReference.class);
  }

  /**
   * The network traffic profile used for running the test. Available network profiles can be
   * queried by using the NETWORK_CONFIGURATION environment type when calling
   * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkProfile;

  /**
   * List of directories on the device to upload to Cloud Storage at the end of the test.
   * Directories should either be in a shared directory (such as /private/var/mobile/Media) or
   * within an accessible directory inside the app's filesystem (such as /Documents) by specifying
   * the bundle ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<IosDeviceFile> pullDirectories;

  static {
    // hack to force ProGuard to consider IosDeviceFile used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(IosDeviceFile.class);
  }

  /**
   * List of files to push to the device before starting the test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<IosDeviceFile> pushFiles;

  static {
    // hack to force ProGuard to consider IosDeviceFile used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(IosDeviceFile.class);
  }

  /**
   * iOS apps to install in addition to those being directly tested.
   * @return value or {@code null} for none
   */
  public java.util.List<FileReference> getAdditionalIpas() {
    return additionalIpas;
  }

  /**
   * iOS apps to install in addition to those being directly tested.
   * @param additionalIpas additionalIpas or {@code null} for none
   */
  public IosTestSetup setAdditionalIpas(java.util.List<FileReference> additionalIpas) {
    this.additionalIpas = additionalIpas;
    return this;
  }

  /**
   * The network traffic profile used for running the test. Available network profiles can be
   * queried by using the NETWORK_CONFIGURATION environment type when calling
   * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkProfile() {
    return networkProfile;
  }

  /**
   * The network traffic profile used for running the test. Available network profiles can be
   * queried by using the NETWORK_CONFIGURATION environment type when calling
   * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
   * @param networkProfile networkProfile or {@code null} for none
   */
  public IosTestSetup setNetworkProfile(java.lang.String networkProfile) {
    this.networkProfile = networkProfile;
    return this;
  }

  /**
   * List of directories on the device to upload to Cloud Storage at the end of the test.
   * Directories should either be in a shared directory (such as /private/var/mobile/Media) or
   * within an accessible directory inside the app's filesystem (such as /Documents) by specifying
   * the bundle ID.
   * @return value or {@code null} for none
   */
  public java.util.List<IosDeviceFile> getPullDirectories() {
    return pullDirectories;
  }

  /**
   * List of directories on the device to upload to Cloud Storage at the end of the test.
   * Directories should either be in a shared directory (such as /private/var/mobile/Media) or
   * within an accessible directory inside the app's filesystem (such as /Documents) by specifying
   * the bundle ID.
   * @param pullDirectories pullDirectories or {@code null} for none
   */
  public IosTestSetup setPullDirectories(java.util.List<IosDeviceFile> pullDirectories) {
    this.pullDirectories = pullDirectories;
    return this;
  }

  /**
   * List of files to push to the device before starting the test.
   * @return value or {@code null} for none
   */
  public java.util.List<IosDeviceFile> getPushFiles() {
    return pushFiles;
  }

  /**
   * List of files to push to the device before starting the test.
   * @param pushFiles pushFiles or {@code null} for none
   */
  public IosTestSetup setPushFiles(java.util.List<IosDeviceFile> pushFiles) {
    this.pushFiles = pushFiles;
    return this;
  }

  @Override
  public IosTestSetup set(String fieldName, Object value) {
    return (IosTestSetup) super.set(fieldName, value);
  }

  @Override
  public IosTestSetup clone() {
    return (IosTestSetup) super.clone();
  }

}
