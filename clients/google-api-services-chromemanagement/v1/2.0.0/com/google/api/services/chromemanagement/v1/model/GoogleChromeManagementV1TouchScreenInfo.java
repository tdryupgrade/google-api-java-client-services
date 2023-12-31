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
 * Information on the device touch screen.
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
public final class GoogleChromeManagementV1TouchScreenInfo extends com.google.api.client.json.GenericJson {

  /**
   * Output only. List of the internal touch screen devices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1TouchScreenDevice> devices;

  static {
    // hack to force ProGuard to consider GoogleChromeManagementV1TouchScreenDevice used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleChromeManagementV1TouchScreenDevice.class);
  }

  /**
   * Output only. Touchpad library name used by the input stack.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String touchpadLibrary;

  /**
   * Output only. List of the internal touch screen devices.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1TouchScreenDevice> getDevices() {
    return devices;
  }

  /**
   * Output only. List of the internal touch screen devices.
   * @param devices devices or {@code null} for none
   */
  public GoogleChromeManagementV1TouchScreenInfo setDevices(java.util.List<GoogleChromeManagementV1TouchScreenDevice> devices) {
    this.devices = devices;
    return this;
  }

  /**
   * Output only. Touchpad library name used by the input stack.
   * @return value or {@code null} for none
   */
  public java.lang.String getTouchpadLibrary() {
    return touchpadLibrary;
  }

  /**
   * Output only. Touchpad library name used by the input stack.
   * @param touchpadLibrary touchpadLibrary or {@code null} for none
   */
  public GoogleChromeManagementV1TouchScreenInfo setTouchpadLibrary(java.lang.String touchpadLibrary) {
    this.touchpadLibrary = touchpadLibrary;
    return this;
  }

  @Override
  public GoogleChromeManagementV1TouchScreenInfo set(String fieldName, Object value) {
    return (GoogleChromeManagementV1TouchScreenInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1TouchScreenInfo clone() {
    return (GoogleChromeManagementV1TouchScreenInfo) super.clone();
  }

}
