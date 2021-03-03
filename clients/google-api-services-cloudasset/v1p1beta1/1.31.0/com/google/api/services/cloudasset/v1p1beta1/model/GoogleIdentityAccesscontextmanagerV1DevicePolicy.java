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

package com.google.api.services.cloudasset.v1p1beta1.model;

/**
 * `DevicePolicy` specifies device specific restrictions necessary to acquire a given access level.
 * A `DevicePolicy` specifies requirements for requests from devices to be granted access levels, it
 * does not do any enforcement on the device. `DevicePolicy` acts as an AND over all specified
 * fields, and each repeated field is an OR over its elements. Any unset fields are ignored. For
 * example, if the proto is { os_type : DESKTOP_WINDOWS, os_type : DESKTOP_LINUX, encryption_status:
 * ENCRYPTED}, then the DevicePolicy will be true for requests originating from encrypted Linux
 * desktops and encrypted Windows desktops.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleIdentityAccesscontextmanagerV1DevicePolicy extends com.google.api.client.json.GenericJson {

  /**
   * Allowed device management levels, an empty list allows all management levels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedDeviceManagementLevels;

  /**
   * Allowed encryptions statuses, an empty list allows all statuses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedEncryptionStatuses;

  /**
   * Allowed OS versions, an empty list allows all types and all versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleIdentityAccesscontextmanagerV1OsConstraint> osConstraints;

  /**
   * Whether the device needs to be approved by the customer admin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requireAdminApproval;

  /**
   * Whether the device needs to be corp owned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requireCorpOwned;

  /**
   * Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requireScreenlock;

  /**
   * Allowed device management levels, an empty list allows all management levels.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedDeviceManagementLevels() {
    return allowedDeviceManagementLevels;
  }

  /**
   * Allowed device management levels, an empty list allows all management levels.
   * @param allowedDeviceManagementLevels allowedDeviceManagementLevels or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1DevicePolicy setAllowedDeviceManagementLevels(java.util.List<java.lang.String> allowedDeviceManagementLevels) {
    this.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
    return this;
  }

  /**
   * Allowed encryptions statuses, an empty list allows all statuses.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedEncryptionStatuses() {
    return allowedEncryptionStatuses;
  }

  /**
   * Allowed encryptions statuses, an empty list allows all statuses.
   * @param allowedEncryptionStatuses allowedEncryptionStatuses or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1DevicePolicy setAllowedEncryptionStatuses(java.util.List<java.lang.String> allowedEncryptionStatuses) {
    this.allowedEncryptionStatuses = allowedEncryptionStatuses;
    return this;
  }

  /**
   * Allowed OS versions, an empty list allows all types and all versions.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleIdentityAccesscontextmanagerV1OsConstraint> getOsConstraints() {
    return osConstraints;
  }

  /**
   * Allowed OS versions, an empty list allows all types and all versions.
   * @param osConstraints osConstraints or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1DevicePolicy setOsConstraints(java.util.List<GoogleIdentityAccesscontextmanagerV1OsConstraint> osConstraints) {
    this.osConstraints = osConstraints;
    return this;
  }

  /**
   * Whether the device needs to be approved by the customer admin.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequireAdminApproval() {
    return requireAdminApproval;
  }

  /**
   * Whether the device needs to be approved by the customer admin.
   * @param requireAdminApproval requireAdminApproval or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1DevicePolicy setRequireAdminApproval(java.lang.Boolean requireAdminApproval) {
    this.requireAdminApproval = requireAdminApproval;
    return this;
  }

  /**
   * Whether the device needs to be corp owned.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequireCorpOwned() {
    return requireCorpOwned;
  }

  /**
   * Whether the device needs to be corp owned.
   * @param requireCorpOwned requireCorpOwned or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1DevicePolicy setRequireCorpOwned(java.lang.Boolean requireCorpOwned) {
    this.requireCorpOwned = requireCorpOwned;
    return this;
  }

  /**
   * Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequireScreenlock() {
    return requireScreenlock;
  }

  /**
   * Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
   * @param requireScreenlock requireScreenlock or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1DevicePolicy setRequireScreenlock(java.lang.Boolean requireScreenlock) {
    this.requireScreenlock = requireScreenlock;
    return this;
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1DevicePolicy set(String fieldName, Object value) {
    return (GoogleIdentityAccesscontextmanagerV1DevicePolicy) super.set(fieldName, value);
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1DevicePolicy clone() {
    return (GoogleIdentityAccesscontextmanagerV1DevicePolicy) super.clone();
  }

}
