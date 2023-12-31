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

package com.google.api.services.chromemanagement.v1.model;

/**
 * Report for CountPrintJobsByUser, contains printing statistics for a user. Contains the number of
 * printers, the number of devices used to initiate print jobs, and the number of print jobs
 * initiated.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromeManagementV1UserPrintReport extends com.google.api.client.json.GenericJson {

  /**
   * Number of chrome devices that have been used to initiate print jobs by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long deviceCount;

  /**
   * Number of print jobs initiated by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long jobCount;

  /**
   * Number of printers used by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long printerCount;

  /**
   * The primary e-mail address of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userEmail;

  /**
   * The unique Directory API ID of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * Number of chrome devices that have been used to initiate print jobs by the user.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDeviceCount() {
    return deviceCount;
  }

  /**
   * Number of chrome devices that have been used to initiate print jobs by the user.
   * @param deviceCount deviceCount or {@code null} for none
   */
  public GoogleChromeManagementV1UserPrintReport setDeviceCount(java.lang.Long deviceCount) {
    this.deviceCount = deviceCount;
    return this;
  }

  /**
   * Number of print jobs initiated by the user.
   * @return value or {@code null} for none
   */
  public java.lang.Long getJobCount() {
    return jobCount;
  }

  /**
   * Number of print jobs initiated by the user.
   * @param jobCount jobCount or {@code null} for none
   */
  public GoogleChromeManagementV1UserPrintReport setJobCount(java.lang.Long jobCount) {
    this.jobCount = jobCount;
    return this;
  }

  /**
   * Number of printers used by the user.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPrinterCount() {
    return printerCount;
  }

  /**
   * Number of printers used by the user.
   * @param printerCount printerCount or {@code null} for none
   */
  public GoogleChromeManagementV1UserPrintReport setPrinterCount(java.lang.Long printerCount) {
    this.printerCount = printerCount;
    return this;
  }

  /**
   * The primary e-mail address of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserEmail() {
    return userEmail;
  }

  /**
   * The primary e-mail address of the user.
   * @param userEmail userEmail or {@code null} for none
   */
  public GoogleChromeManagementV1UserPrintReport setUserEmail(java.lang.String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * The unique Directory API ID of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * The unique Directory API ID of the user.
   * @param userId userId or {@code null} for none
   */
  public GoogleChromeManagementV1UserPrintReport setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public GoogleChromeManagementV1UserPrintReport set(String fieldName, Object value) {
    return (GoogleChromeManagementV1UserPrintReport) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1UserPrintReport clone() {
    return (GoogleChromeManagementV1UserPrintReport) super.clone();
  }

}
