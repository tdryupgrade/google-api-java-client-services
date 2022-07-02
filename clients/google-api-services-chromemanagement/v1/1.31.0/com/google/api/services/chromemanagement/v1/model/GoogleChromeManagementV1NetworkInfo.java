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
 * Network devices info.
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
public final class GoogleChromeManagementV1NetworkInfo extends com.google.api.client.json.GenericJson {

  /**
   * Output only. List of network devices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1NetworkDevice> networkDevices;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1NetworkDevice used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1NetworkDevice.class);
  }

  /**
   * Output only. List of network devices.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1NetworkDevice> getNetworkDevices() {
    return networkDevices;
  }

  /**
   * Output only. List of network devices.
   * @param networkDevices networkDevices or {@code null} for none
   */
  public GoogleChromeManagementV1NetworkInfo setNetworkDevices(java.util.List<GoogleChromeManagementV1NetworkDevice> networkDevices) {
    this.networkDevices = networkDevices;
    return this;
  }

  @Override
  public GoogleChromeManagementV1NetworkInfo set(String fieldName, Object value) {
    return (GoogleChromeManagementV1NetworkInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1NetworkInfo clone() {
    return (GoogleChromeManagementV1NetworkInfo) super.clone();
  }

}
