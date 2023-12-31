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

package com.google.api.services.policysimulator.v1beta.model;

/**
 * A summary and comparison of the principal's access under the current (baseline) policies and the
 * proposed (simulated) policies for a single access tuple.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Policy Simulator API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPolicysimulatorV1betaAccessStateDiff extends com.google.api.client.json.GenericJson {

  /**
   * How the principal's access, specified in the AccessState field, changed between the current
   * (baseline) policies and proposed (simulated) policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessChange;

  /**
   * The results of evaluating the access tuple under the current (baseline) policies. If the
   * AccessState couldn't be fully evaluated, this field explains why.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPolicysimulatorV1betaExplainedAccess baseline;

  /**
   * The results of evaluating the access tuple under the proposed (simulated) policies. If the
   * AccessState couldn't be fully evaluated, this field explains why.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPolicysimulatorV1betaExplainedAccess simulated;

  /**
   * How the principal's access, specified in the AccessState field, changed between the current
   * (baseline) policies and proposed (simulated) policies.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessChange() {
    return accessChange;
  }

  /**
   * How the principal's access, specified in the AccessState field, changed between the current
   * (baseline) policies and proposed (simulated) policies.
   * @param accessChange accessChange or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1betaAccessStateDiff setAccessChange(java.lang.String accessChange) {
    this.accessChange = accessChange;
    return this;
  }

  /**
   * The results of evaluating the access tuple under the current (baseline) policies. If the
   * AccessState couldn't be fully evaluated, this field explains why.
   * @return value or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1betaExplainedAccess getBaseline() {
    return baseline;
  }

  /**
   * The results of evaluating the access tuple under the current (baseline) policies. If the
   * AccessState couldn't be fully evaluated, this field explains why.
   * @param baseline baseline or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1betaAccessStateDiff setBaseline(GoogleCloudPolicysimulatorV1betaExplainedAccess baseline) {
    this.baseline = baseline;
    return this;
  }

  /**
   * The results of evaluating the access tuple under the proposed (simulated) policies. If the
   * AccessState couldn't be fully evaluated, this field explains why.
   * @return value or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1betaExplainedAccess getSimulated() {
    return simulated;
  }

  /**
   * The results of evaluating the access tuple under the proposed (simulated) policies. If the
   * AccessState couldn't be fully evaluated, this field explains why.
   * @param simulated simulated or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1betaAccessStateDiff setSimulated(GoogleCloudPolicysimulatorV1betaExplainedAccess simulated) {
    this.simulated = simulated;
    return this;
  }

  @Override
  public GoogleCloudPolicysimulatorV1betaAccessStateDiff set(String fieldName, Object value) {
    return (GoogleCloudPolicysimulatorV1betaAccessStateDiff) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPolicysimulatorV1betaAccessStateDiff clone() {
    return (GoogleCloudPolicysimulatorV1betaAccessStateDiff) super.clone();
  }

}
