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

package com.google.api.services.resourcesettings.v1.model;

/**
 * Metadata about a setting which is not editable by the end user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Resource Settings API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudResourcesettingsV1SettingMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The data type for this setting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataType;

  /**
   * The value provided by Setting.effective_value if no setting value is explicitly set. Note: not
   * all settings have a default value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudResourcesettingsV1Value defaultValue;

  /**
   * A detailed description of what this setting does.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The human readable name for this setting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * A flag indicating that values of this setting cannot be modified. See documentation for the
   * specific setting for updates and reasons.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean readOnly;

  /**
   * The data type for this setting.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataType() {
    return dataType;
  }

  /**
   * The data type for this setting.
   * @param dataType dataType or {@code null} for none
   */
  public GoogleCloudResourcesettingsV1SettingMetadata setDataType(java.lang.String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * The value provided by Setting.effective_value if no setting value is explicitly set. Note: not
   * all settings have a default value.
   * @return value or {@code null} for none
   */
  public GoogleCloudResourcesettingsV1Value getDefaultValue() {
    return defaultValue;
  }

  /**
   * The value provided by Setting.effective_value if no setting value is explicitly set. Note: not
   * all settings have a default value.
   * @param defaultValue defaultValue or {@code null} for none
   */
  public GoogleCloudResourcesettingsV1SettingMetadata setDefaultValue(GoogleCloudResourcesettingsV1Value defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * A detailed description of what this setting does.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A detailed description of what this setting does.
   * @param description description or {@code null} for none
   */
  public GoogleCloudResourcesettingsV1SettingMetadata setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The human readable name for this setting.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The human readable name for this setting.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudResourcesettingsV1SettingMetadata setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * A flag indicating that values of this setting cannot be modified. See documentation for the
   * specific setting for updates and reasons.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReadOnly() {
    return readOnly;
  }

  /**
   * A flag indicating that values of this setting cannot be modified. See documentation for the
   * specific setting for updates and reasons.
   * @param readOnly readOnly or {@code null} for none
   */
  public GoogleCloudResourcesettingsV1SettingMetadata setReadOnly(java.lang.Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  @Override
  public GoogleCloudResourcesettingsV1SettingMetadata set(String fieldName, Object value) {
    return (GoogleCloudResourcesettingsV1SettingMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudResourcesettingsV1SettingMetadata clone() {
    return (GoogleCloudResourcesettingsV1SettingMetadata) super.clone();
  }

}
