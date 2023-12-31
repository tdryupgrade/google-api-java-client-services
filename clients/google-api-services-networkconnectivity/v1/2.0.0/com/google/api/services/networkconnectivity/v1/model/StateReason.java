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

package com.google.api.services.networkconnectivity.v1.model;

/**
 * The reason a spoke is inactive.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Connectivity API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StateReason extends com.google.api.client.json.GenericJson {

  /**
   * The code associated with this reason.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Human-readable details about this reason.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * Additional information provided by the user in the RejectSpoke call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userDetails;

  /**
   * The code associated with this reason.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * The code associated with this reason.
   * @param code code or {@code null} for none
   */
  public StateReason setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * Human-readable details about this reason.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Human-readable details about this reason.
   * @param message message or {@code null} for none
   */
  public StateReason setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * Additional information provided by the user in the RejectSpoke call.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserDetails() {
    return userDetails;
  }

  /**
   * Additional information provided by the user in the RejectSpoke call.
   * @param userDetails userDetails or {@code null} for none
   */
  public StateReason setUserDetails(java.lang.String userDetails) {
    this.userDetails = userDetails;
    return this;
  }

  @Override
  public StateReason set(String fieldName, Object value) {
    return (StateReason) super.set(fieldName, value);
  }

  @Override
  public StateReason clone() {
    return (StateReason) super.clone();
  }

}
