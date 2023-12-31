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
 * The number of spokes in the hub that are inactive for this reason.
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
public final class SpokeStateReasonCount extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The total number of spokes that are inactive for a particular reason and
   * associated with a given hub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long count;

  /**
   * Output only. The reason that a spoke is inactive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateReasonCode;

  /**
   * Output only. The total number of spokes that are inactive for a particular reason and
   * associated with a given hub.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * Output only. The total number of spokes that are inactive for a particular reason and
   * associated with a given hub.
   * @param count count or {@code null} for none
   */
  public SpokeStateReasonCount setCount(java.lang.Long count) {
    this.count = count;
    return this;
  }

  /**
   * Output only. The reason that a spoke is inactive.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateReasonCode() {
    return stateReasonCode;
  }

  /**
   * Output only. The reason that a spoke is inactive.
   * @param stateReasonCode stateReasonCode or {@code null} for none
   */
  public SpokeStateReasonCount setStateReasonCode(java.lang.String stateReasonCode) {
    this.stateReasonCode = stateReasonCode;
    return this;
  }

  @Override
  public SpokeStateReasonCount set(String fieldName, Object value) {
    return (SpokeStateReasonCount) super.set(fieldName, value);
  }

  @Override
  public SpokeStateReasonCount clone() {
    return (SpokeStateReasonCount) super.clone();
  }

}
