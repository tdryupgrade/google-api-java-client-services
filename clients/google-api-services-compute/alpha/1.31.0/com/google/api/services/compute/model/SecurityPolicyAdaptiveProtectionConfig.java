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

package com.google.api.services.compute.model;

/**
 * Configuration options for Cloud Armor Adaptive Protection (CAAP).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityPolicyAdaptiveProtectionConfig extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPolicyAdaptiveProtectionConfigAutoDeployConfig autoDeployConfig;

  /**
   * If set to true, enables Cloud Armor Machine Learning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7DdosDefenseConfig;

  /**
   * @return value or {@code null} for none
   */
  public SecurityPolicyAdaptiveProtectionConfigAutoDeployConfig getAutoDeployConfig() {
    return autoDeployConfig;
  }

  /**
   * @param autoDeployConfig autoDeployConfig or {@code null} for none
   */
  public SecurityPolicyAdaptiveProtectionConfig setAutoDeployConfig(SecurityPolicyAdaptiveProtectionConfigAutoDeployConfig autoDeployConfig) {
    this.autoDeployConfig = autoDeployConfig;
    return this;
  }

  /**
   * If set to true, enables Cloud Armor Machine Learning.
   * @return value or {@code null} for none
   */
  public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig getLayer7DdosDefenseConfig() {
    return layer7DdosDefenseConfig;
  }

  /**
   * If set to true, enables Cloud Armor Machine Learning.
   * @param layer7DdosDefenseConfig layer7DdosDefenseConfig or {@code null} for none
   */
  public SecurityPolicyAdaptiveProtectionConfig setLayer7DdosDefenseConfig(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7DdosDefenseConfig) {
    this.layer7DdosDefenseConfig = layer7DdosDefenseConfig;
    return this;
  }

  @Override
  public SecurityPolicyAdaptiveProtectionConfig set(String fieldName, Object value) {
    return (SecurityPolicyAdaptiveProtectionConfig) super.set(fieldName, value);
  }

  @Override
  public SecurityPolicyAdaptiveProtectionConfig clone() {
    return (SecurityPolicyAdaptiveProtectionConfig) super.clone();
  }

}
