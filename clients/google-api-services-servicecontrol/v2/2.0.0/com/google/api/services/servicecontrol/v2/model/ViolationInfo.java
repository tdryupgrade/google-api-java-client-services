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

package com.google.api.services.servicecontrol.v2.model;

/**
 * Provides information about the Policy violation info for this request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ViolationInfo extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Value that is being checked for the policy. This could be in encrypted form (if pii
   * sensitive). This field will only be emitted in LIST_POLICY types
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String checkedValue;

  /**
   * Optional. Constraint name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String constraint;

  /**
   * Optional. Error message that policy is indicating.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorMessage;

  /**
   * Optional. Indicates the type of the policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policyType;

  /**
   * Optional. Value that is being checked for the policy. This could be in encrypted form (if pii
   * sensitive). This field will only be emitted in LIST_POLICY types
   * @return value or {@code null} for none
   */
  public java.lang.String getCheckedValue() {
    return checkedValue;
  }

  /**
   * Optional. Value that is being checked for the policy. This could be in encrypted form (if pii
   * sensitive). This field will only be emitted in LIST_POLICY types
   * @param checkedValue checkedValue or {@code null} for none
   */
  public ViolationInfo setCheckedValue(java.lang.String checkedValue) {
    this.checkedValue = checkedValue;
    return this;
  }

  /**
   * Optional. Constraint name
   * @return value or {@code null} for none
   */
  public java.lang.String getConstraint() {
    return constraint;
  }

  /**
   * Optional. Constraint name
   * @param constraint constraint or {@code null} for none
   */
  public ViolationInfo setConstraint(java.lang.String constraint) {
    this.constraint = constraint;
    return this;
  }

  /**
   * Optional. Error message that policy is indicating.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Optional. Error message that policy is indicating.
   * @param errorMessage errorMessage or {@code null} for none
   */
  public ViolationInfo setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Optional. Indicates the type of the policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicyType() {
    return policyType;
  }

  /**
   * Optional. Indicates the type of the policy.
   * @param policyType policyType or {@code null} for none
   */
  public ViolationInfo setPolicyType(java.lang.String policyType) {
    this.policyType = policyType;
    return this;
  }

  @Override
  public ViolationInfo set(String fieldName, Object value) {
    return (ViolationInfo) super.set(fieldName, value);
  }

  @Override
  public ViolationInfo clone() {
    return (ViolationInfo) super.clone();
  }

}
