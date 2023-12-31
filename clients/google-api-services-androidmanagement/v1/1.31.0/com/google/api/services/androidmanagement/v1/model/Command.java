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

package com.google.api.services.androidmanagement.v1.model;

/**
 * A command.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Command extends com.google.api.client.json.GenericJson {

  /**
   * Parameters for the CLEAR_APP_DATA command to clear the data of specified apps from the device.
   * See ClearAppsDataParams. If this is set, then it is suggested that type should not be set. In
   * this case, the server automatically sets it to CLEAR_APP_DATA. It is also acceptable to
   * explicitly set type to CLEAR_APP_DATA.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClearAppsDataParams clearAppsDataParams;

  /**
   * Output only. Status of the CLEAR_APP_DATA command to clear the data of specified apps from the
   * device. See ClearAppsDataStatus.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClearAppsDataStatus clearAppsDataStatus;

  /**
   * The timestamp at which the command was created. The timestamp is automatically generated by the
   * server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The duration for which the command is valid. The command will expire if not executed by the
   * device during this time. The default duration if unspecified is ten minutes. There is no
   * maximum duration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * If the command failed, an error code explaining the failure. This is not set when the command
   * is cancelled by the caller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorCode;

  /**
   * For commands of type RESET_PASSWORD, optionally specifies the new password.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newPassword;

  /**
   * For commands of type RESET_PASSWORD, optionally specifies flags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resetPasswordFlags;

  /**
   * The type of the command.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The resource name of the user that owns the device in the form
   * enterprises/{enterpriseId}/users/{userId}. This is automatically generated by the server based
   * on the device the command is sent to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userName;

  /**
   * Parameters for the CLEAR_APP_DATA command to clear the data of specified apps from the device.
   * See ClearAppsDataParams. If this is set, then it is suggested that type should not be set. In
   * this case, the server automatically sets it to CLEAR_APP_DATA. It is also acceptable to
   * explicitly set type to CLEAR_APP_DATA.
   * @return value or {@code null} for none
   */
  public ClearAppsDataParams getClearAppsDataParams() {
    return clearAppsDataParams;
  }

  /**
   * Parameters for the CLEAR_APP_DATA command to clear the data of specified apps from the device.
   * See ClearAppsDataParams. If this is set, then it is suggested that type should not be set. In
   * this case, the server automatically sets it to CLEAR_APP_DATA. It is also acceptable to
   * explicitly set type to CLEAR_APP_DATA.
   * @param clearAppsDataParams clearAppsDataParams or {@code null} for none
   */
  public Command setClearAppsDataParams(ClearAppsDataParams clearAppsDataParams) {
    this.clearAppsDataParams = clearAppsDataParams;
    return this;
  }

  /**
   * Output only. Status of the CLEAR_APP_DATA command to clear the data of specified apps from the
   * device. See ClearAppsDataStatus.
   * @return value or {@code null} for none
   */
  public ClearAppsDataStatus getClearAppsDataStatus() {
    return clearAppsDataStatus;
  }

  /**
   * Output only. Status of the CLEAR_APP_DATA command to clear the data of specified apps from the
   * device. See ClearAppsDataStatus.
   * @param clearAppsDataStatus clearAppsDataStatus or {@code null} for none
   */
  public Command setClearAppsDataStatus(ClearAppsDataStatus clearAppsDataStatus) {
    this.clearAppsDataStatus = clearAppsDataStatus;
    return this;
  }

  /**
   * The timestamp at which the command was created. The timestamp is automatically generated by the
   * server.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The timestamp at which the command was created. The timestamp is automatically generated by the
   * server.
   * @param createTime createTime or {@code null} for none
   */
  public Command setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The duration for which the command is valid. The command will expire if not executed by the
   * device during this time. The default duration if unspecified is ten minutes. There is no
   * maximum duration.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * The duration for which the command is valid. The command will expire if not executed by the
   * device during this time. The default duration if unspecified is ten minutes. There is no
   * maximum duration.
   * @param duration duration or {@code null} for none
   */
  public Command setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * If the command failed, an error code explaining the failure. This is not set when the command
   * is cancelled by the caller.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorCode() {
    return errorCode;
  }

  /**
   * If the command failed, an error code explaining the failure. This is not set when the command
   * is cancelled by the caller.
   * @param errorCode errorCode or {@code null} for none
   */
  public Command setErrorCode(java.lang.String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * For commands of type RESET_PASSWORD, optionally specifies the new password.
   * @return value or {@code null} for none
   */
  public java.lang.String getNewPassword() {
    return newPassword;
  }

  /**
   * For commands of type RESET_PASSWORD, optionally specifies the new password.
   * @param newPassword newPassword or {@code null} for none
   */
  public Command setNewPassword(java.lang.String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * For commands of type RESET_PASSWORD, optionally specifies flags.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResetPasswordFlags() {
    return resetPasswordFlags;
  }

  /**
   * For commands of type RESET_PASSWORD, optionally specifies flags.
   * @param resetPasswordFlags resetPasswordFlags or {@code null} for none
   */
  public Command setResetPasswordFlags(java.util.List<java.lang.String> resetPasswordFlags) {
    this.resetPasswordFlags = resetPasswordFlags;
    return this;
  }

  /**
   * The type of the command.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the command.
   * @param type type or {@code null} for none
   */
  public Command setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The resource name of the user that owns the device in the form
   * enterprises/{enterpriseId}/users/{userId}. This is automatically generated by the server based
   * on the device the command is sent to.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserName() {
    return userName;
  }

  /**
   * The resource name of the user that owns the device in the form
   * enterprises/{enterpriseId}/users/{userId}. This is automatically generated by the server based
   * on the device the command is sent to.
   * @param userName userName or {@code null} for none
   */
  public Command setUserName(java.lang.String userName) {
    this.userName = userName;
    return this;
  }

  @Override
  public Command set(String fieldName, Object value) {
    return (Command) super.set(fieldName, value);
  }

  @Override
  public Command clone() {
    return (Command) super.clone();
  }

}
