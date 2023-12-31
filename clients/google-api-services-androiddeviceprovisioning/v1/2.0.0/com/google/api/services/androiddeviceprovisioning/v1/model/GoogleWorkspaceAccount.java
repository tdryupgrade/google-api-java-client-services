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

package com.google.api.services.androiddeviceprovisioning.v1.model;

/**
 * A Google Workspace customer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Device Provisioning Partner API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleWorkspaceAccount extends com.google.api.client.json.GenericJson {

  /**
   * Required. The customer ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerId;

  /**
   * Output only. The pre-provisioning tokens previously used to claim devices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> preProvisioningTokens;

  /**
   * Required. The customer ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerId() {
    return customerId;
  }

  /**
   * Required. The customer ID.
   * @param customerId customerId or {@code null} for none
   */
  public GoogleWorkspaceAccount setCustomerId(java.lang.String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Output only. The pre-provisioning tokens previously used to claim devices.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPreProvisioningTokens() {
    return preProvisioningTokens;
  }

  /**
   * Output only. The pre-provisioning tokens previously used to claim devices.
   * @param preProvisioningTokens preProvisioningTokens or {@code null} for none
   */
  public GoogleWorkspaceAccount setPreProvisioningTokens(java.util.List<java.lang.String> preProvisioningTokens) {
    this.preProvisioningTokens = preProvisioningTokens;
    return this;
  }

  @Override
  public GoogleWorkspaceAccount set(String fieldName, Object value) {
    return (GoogleWorkspaceAccount) super.set(fieldName, value);
  }

  @Override
  public GoogleWorkspaceAccount clone() {
    return (GoogleWorkspaceAccount) super.clone();
  }

}
