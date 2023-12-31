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
 * Heartbeat status report of a device. * Available for Kiosks * This field provides
 * online/offline/unknown status of a device and will only be included if the status has changed
 * (e.g. Online -> Offline) * Data for this field is controlled via policy:
 * [HeartbeatEnabled](https://chromeenterprise.google/policies/#HeartbeatEnabled) [More Info](https:
 * //support.google.com/chrome/a/answer/6179663#:~:text=On%20the%20Chrome,device%20status%20alerts)
 * * Heartbeat Frequency: 2 mins * Note: If a device goes offline, it can take up to 12 minutes for
 * the online status of the device to be updated * Cache: If the device is offline, the collected
 * data is stored locally, and will be reported when the device is next online: N/A * Reported for
 * affiliated users only: N/A * Granular permission needed: TELEMETRY_API_DEVICE_ACTIVITY_REPORT
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
public final class GoogleChromeManagementV1HeartbeatStatusReport extends com.google.api.client.json.GenericJson {

  /**
   * Timestamp of when status changed was detected
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String reportTime;

  /**
   * State the device changed to
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Timestamp of when status changed was detected
   * @return value or {@code null} for none
   */
  public String getReportTime() {
    return reportTime;
  }

  /**
   * Timestamp of when status changed was detected
   * @param reportTime reportTime or {@code null} for none
   */
  public GoogleChromeManagementV1HeartbeatStatusReport setReportTime(String reportTime) {
    this.reportTime = reportTime;
    return this;
  }

  /**
   * State the device changed to
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State the device changed to
   * @param state state or {@code null} for none
   */
  public GoogleChromeManagementV1HeartbeatStatusReport setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleChromeManagementV1HeartbeatStatusReport set(String fieldName, Object value) {
    return (GoogleChromeManagementV1HeartbeatStatusReport) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1HeartbeatStatusReport clone() {
    return (GoogleChromeManagementV1HeartbeatStatusReport) super.clone();
  }

}
