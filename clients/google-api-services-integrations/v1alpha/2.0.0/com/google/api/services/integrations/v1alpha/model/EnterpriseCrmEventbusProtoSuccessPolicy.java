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

package com.google.api.services.integrations.v1alpha.model;

/**
 * Policy that dictates the behavior for the task after it completes successfully.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnterpriseCrmEventbusProtoSuccessPolicy extends com.google.api.client.json.GenericJson {

  /**
   * State to which the execution snapshot status will be set if the task succeeds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String finalState;

  /**
   * State to which the execution snapshot status will be set if the task succeeds.
   * @return value or {@code null} for none
   */
  public java.lang.String getFinalState() {
    return finalState;
  }

  /**
   * State to which the execution snapshot status will be set if the task succeeds.
   * @param finalState finalState or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoSuccessPolicy setFinalState(java.lang.String finalState) {
    this.finalState = finalState;
    return this;
  }

  @Override
  public EnterpriseCrmEventbusProtoSuccessPolicy set(String fieldName, Object value) {
    return (EnterpriseCrmEventbusProtoSuccessPolicy) super.set(fieldName, value);
  }

  @Override
  public EnterpriseCrmEventbusProtoSuccessPolicy clone() {
    return (EnterpriseCrmEventbusProtoSuccessPolicy) super.clone();
  }

}
