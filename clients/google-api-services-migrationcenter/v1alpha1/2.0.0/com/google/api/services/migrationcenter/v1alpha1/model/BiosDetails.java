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

package com.google.api.services.migrationcenter.v1alpha1.model;

/**
 * Details about the BIOS.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migration Center API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BiosDetails extends com.google.api.client.json.GenericJson {

  /**
   * BIOS manufacturer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String biosManufacturer;

  /**
   * BIOS name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String biosName;

  /**
   * BIOS release date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String biosReleaseDate;

  /**
   * BIOS version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String biosVersion;

  /**
   * SMBIOS UUID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String smbiosUuid;

  /**
   * BIOS manufacturer.
   * @return value or {@code null} for none
   */
  public java.lang.String getBiosManufacturer() {
    return biosManufacturer;
  }

  /**
   * BIOS manufacturer.
   * @param biosManufacturer biosManufacturer or {@code null} for none
   */
  public BiosDetails setBiosManufacturer(java.lang.String biosManufacturer) {
    this.biosManufacturer = biosManufacturer;
    return this;
  }

  /**
   * BIOS name.
   * @return value or {@code null} for none
   */
  public java.lang.String getBiosName() {
    return biosName;
  }

  /**
   * BIOS name.
   * @param biosName biosName or {@code null} for none
   */
  public BiosDetails setBiosName(java.lang.String biosName) {
    this.biosName = biosName;
    return this;
  }

  /**
   * BIOS release date.
   * @return value or {@code null} for none
   */
  public java.lang.String getBiosReleaseDate() {
    return biosReleaseDate;
  }

  /**
   * BIOS release date.
   * @param biosReleaseDate biosReleaseDate or {@code null} for none
   */
  public BiosDetails setBiosReleaseDate(java.lang.String biosReleaseDate) {
    this.biosReleaseDate = biosReleaseDate;
    return this;
  }

  /**
   * BIOS version.
   * @return value or {@code null} for none
   */
  public java.lang.String getBiosVersion() {
    return biosVersion;
  }

  /**
   * BIOS version.
   * @param biosVersion biosVersion or {@code null} for none
   */
  public BiosDetails setBiosVersion(java.lang.String biosVersion) {
    this.biosVersion = biosVersion;
    return this;
  }

  /**
   * SMBIOS UUID.
   * @return value or {@code null} for none
   */
  public java.lang.String getSmbiosUuid() {
    return smbiosUuid;
  }

  /**
   * SMBIOS UUID.
   * @param smbiosUuid smbiosUuid or {@code null} for none
   */
  public BiosDetails setSmbiosUuid(java.lang.String smbiosUuid) {
    this.smbiosUuid = smbiosUuid;
    return this;
  }

  @Override
  public BiosDetails set(String fieldName, Object value) {
    return (BiosDetails) super.set(fieldName, value);
  }

  @Override
  public BiosDetails clone() {
    return (BiosDetails) super.clone();
  }

}
