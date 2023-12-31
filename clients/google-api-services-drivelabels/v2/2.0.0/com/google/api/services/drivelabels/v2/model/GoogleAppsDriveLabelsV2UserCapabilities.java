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

package com.google.api.services.drivelabels.v2.model;

/**
 * The capabilities of a user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Labels API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsDriveLabelsV2UserCapabilities extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Whether the user is allowed access to the label manager.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean canAccessLabelManager;

  /**
   * Output only. Whether the user is an administrator for the shared labels feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean canAdministrateLabels;

  /**
   * Output only. Whether the user is allowed to create new admin labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean canCreateAdminLabels;

  /**
   * Output only. Whether the user is allowed to create new shared labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean canCreateSharedLabels;

  /**
   * Output only. Resource name for the user capabilities.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Whether the user is allowed access to the label manager.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCanAccessLabelManager() {
    return canAccessLabelManager;
  }

  /**
   * Output only. Whether the user is allowed access to the label manager.
   * @param canAccessLabelManager canAccessLabelManager or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2UserCapabilities setCanAccessLabelManager(java.lang.Boolean canAccessLabelManager) {
    this.canAccessLabelManager = canAccessLabelManager;
    return this;
  }

  /**
   * Output only. Whether the user is an administrator for the shared labels feature.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCanAdministrateLabels() {
    return canAdministrateLabels;
  }

  /**
   * Output only. Whether the user is an administrator for the shared labels feature.
   * @param canAdministrateLabels canAdministrateLabels or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2UserCapabilities setCanAdministrateLabels(java.lang.Boolean canAdministrateLabels) {
    this.canAdministrateLabels = canAdministrateLabels;
    return this;
  }

  /**
   * Output only. Whether the user is allowed to create new admin labels.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCanCreateAdminLabels() {
    return canCreateAdminLabels;
  }

  /**
   * Output only. Whether the user is allowed to create new admin labels.
   * @param canCreateAdminLabels canCreateAdminLabels or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2UserCapabilities setCanCreateAdminLabels(java.lang.Boolean canCreateAdminLabels) {
    this.canCreateAdminLabels = canCreateAdminLabels;
    return this;
  }

  /**
   * Output only. Whether the user is allowed to create new shared labels.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCanCreateSharedLabels() {
    return canCreateSharedLabels;
  }

  /**
   * Output only. Whether the user is allowed to create new shared labels.
   * @param canCreateSharedLabels canCreateSharedLabels or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2UserCapabilities setCanCreateSharedLabels(java.lang.Boolean canCreateSharedLabels) {
    this.canCreateSharedLabels = canCreateSharedLabels;
    return this;
  }

  /**
   * Output only. Resource name for the user capabilities.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name for the user capabilities.
   * @param name name or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2UserCapabilities setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleAppsDriveLabelsV2UserCapabilities set(String fieldName, Object value) {
    return (GoogleAppsDriveLabelsV2UserCapabilities) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsDriveLabelsV2UserCapabilities clone() {
    return (GoogleAppsDriveLabelsV2UserCapabilities) super.clone();
  }

}
