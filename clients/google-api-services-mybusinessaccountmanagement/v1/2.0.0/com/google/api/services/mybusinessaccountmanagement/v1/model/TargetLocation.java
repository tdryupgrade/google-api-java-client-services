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

package com.google.api.services.mybusinessaccountmanagement.v1.model;

/**
 * Represents a target location for a pending invitation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the My Business Account Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetLocation extends com.google.api.client.json.GenericJson {

  /**
   * The address of the location to which the user is invited.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * The name of the location to which the user is invited.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationName;

  /**
   * The address of the location to which the user is invited.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * The address of the location to which the user is invited.
   * @param address address or {@code null} for none
   */
  public TargetLocation setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * The name of the location to which the user is invited.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationName() {
    return locationName;
  }

  /**
   * The name of the location to which the user is invited.
   * @param locationName locationName or {@code null} for none
   */
  public TargetLocation setLocationName(java.lang.String locationName) {
    this.locationName = locationName;
    return this;
  }

  @Override
  public TargetLocation set(String fieldName, Object value) {
    return (TargetLocation) super.set(fieldName, value);
  }

  @Override
  public TargetLocation clone() {
    return (TargetLocation) super.clone();
  }

}
