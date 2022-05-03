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

package com.google.api.services.firebaseappcheck.v1.model;

/**
 * Response message for the BatchGetDeviceCheckConfigs method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Check API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse extends com.google.api.client.json.GenericJson {

  /**
   * DeviceCheckConfigs retrieved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleFirebaseAppcheckV1DeviceCheckConfig> configs;

  /**
   * DeviceCheckConfigs retrieved.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleFirebaseAppcheckV1DeviceCheckConfig> getConfigs() {
    return configs;
  }

  /**
   * DeviceCheckConfigs retrieved.
   * @param configs configs or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse setConfigs(java.util.List<GoogleFirebaseAppcheckV1DeviceCheckConfig> configs) {
    this.configs = configs;
    return this;
  }

  @Override
  public GoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse set(String fieldName, Object value) {
    return (GoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse clone() {
    return (GoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse) super.clone();
  }

}
