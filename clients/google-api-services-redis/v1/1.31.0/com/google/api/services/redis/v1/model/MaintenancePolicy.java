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

package com.google.api.services.redis.v1.model;

/**
 * Maintenance policy for an instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Memorystore for Redis API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MaintenancePolicy extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time when the policy was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT
   * if the length is greater than 512.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. The time when the policy was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1.
   * For the current version, the maximum number of weekly_window is expected to be one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WeeklyMaintenanceWindow> weeklyMaintenanceWindow;

  /**
   * Output only. The time when the policy was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the policy was created.
   * @param createTime createTime or {@code null} for none
   */
  public MaintenancePolicy setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT
   * if the length is greater than 512.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT
   * if the length is greater than 512.
   * @param description description or {@code null} for none
   */
  public MaintenancePolicy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. The time when the policy was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the policy was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public MaintenancePolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1.
   * For the current version, the maximum number of weekly_window is expected to be one.
   * @return value or {@code null} for none
   */
  public java.util.List<WeeklyMaintenanceWindow> getWeeklyMaintenanceWindow() {
    return weeklyMaintenanceWindow;
  }

  /**
   * Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1.
   * For the current version, the maximum number of weekly_window is expected to be one.
   * @param weeklyMaintenanceWindow weeklyMaintenanceWindow or {@code null} for none
   */
  public MaintenancePolicy setWeeklyMaintenanceWindow(java.util.List<WeeklyMaintenanceWindow> weeklyMaintenanceWindow) {
    this.weeklyMaintenanceWindow = weeklyMaintenanceWindow;
    return this;
  }

  @Override
  public MaintenancePolicy set(String fieldName, Object value) {
    return (MaintenancePolicy) super.set(fieldName, value);
  }

  @Override
  public MaintenancePolicy clone() {
    return (MaintenancePolicy) super.clone();
  }

}
