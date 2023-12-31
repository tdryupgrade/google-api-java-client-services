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

package com.google.api.services.streetviewpublish.v1.model;

/**
 * IMU data from the device sensors.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Street View Publish API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Imu extends com.google.api.client.json.GenericJson {

  /**
   * The accelerometer measurements in meters/sec^2 with increasing timestamps from devices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Measurement3d> accelMpsps;

  /**
   * The gyroscope measurements in radians/sec with increasing timestamps from devices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Measurement3d> gyroRps;

  /**
   * The magnetometer measurements of the magnetic field in microtesla (uT) with increasing
   * timestamps from devices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Measurement3d> magUt;

  /**
   * The accelerometer measurements in meters/sec^2 with increasing timestamps from devices.
   * @return value or {@code null} for none
   */
  public java.util.List<Measurement3d> getAccelMpsps() {
    return accelMpsps;
  }

  /**
   * The accelerometer measurements in meters/sec^2 with increasing timestamps from devices.
   * @param accelMpsps accelMpsps or {@code null} for none
   */
  public Imu setAccelMpsps(java.util.List<Measurement3d> accelMpsps) {
    this.accelMpsps = accelMpsps;
    return this;
  }

  /**
   * The gyroscope measurements in radians/sec with increasing timestamps from devices.
   * @return value or {@code null} for none
   */
  public java.util.List<Measurement3d> getGyroRps() {
    return gyroRps;
  }

  /**
   * The gyroscope measurements in radians/sec with increasing timestamps from devices.
   * @param gyroRps gyroRps or {@code null} for none
   */
  public Imu setGyroRps(java.util.List<Measurement3d> gyroRps) {
    this.gyroRps = gyroRps;
    return this;
  }

  /**
   * The magnetometer measurements of the magnetic field in microtesla (uT) with increasing
   * timestamps from devices.
   * @return value or {@code null} for none
   */
  public java.util.List<Measurement3d> getMagUt() {
    return magUt;
  }

  /**
   * The magnetometer measurements of the magnetic field in microtesla (uT) with increasing
   * timestamps from devices.
   * @param magUt magUt or {@code null} for none
   */
  public Imu setMagUt(java.util.List<Measurement3d> magUt) {
    this.magUt = magUt;
    return this;
  }

  @Override
  public Imu set(String fieldName, Object value) {
    return (Imu) super.set(fieldName, value);
  }

  @Override
  public Imu clone() {
    return (Imu) super.clone();
  }

}
