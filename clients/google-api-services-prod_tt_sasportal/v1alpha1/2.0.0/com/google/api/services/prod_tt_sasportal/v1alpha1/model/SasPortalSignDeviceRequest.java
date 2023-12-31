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

package com.google.api.services.prod_tt_sasportal.v1alpha1.model;

/**
 * Request for SignDevice.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API (Testing). For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalSignDeviceRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The device to sign. The device fields name, fcc_id and serial_number must be set. The
   * user_id field must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SasPortalDevice device;

  /**
   * Required. The device to sign. The device fields name, fcc_id and serial_number must be set. The
   * user_id field must be set.
   * @return value or {@code null} for none
   */
  public SasPortalDevice getDevice() {
    return device;
  }

  /**
   * Required. The device to sign. The device fields name, fcc_id and serial_number must be set. The
   * user_id field must be set.
   * @param device device or {@code null} for none
   */
  public SasPortalSignDeviceRequest setDevice(SasPortalDevice device) {
    this.device = device;
    return this;
  }

  @Override
  public SasPortalSignDeviceRequest set(String fieldName, Object value) {
    return (SasPortalSignDeviceRequest) super.set(fieldName, value);
  }

  @Override
  public SasPortalSignDeviceRequest clone() {
    return (SasPortalSignDeviceRequest) super.clone();
  }

}
