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
 * Model definition for InstancesSetSecurityPolicyRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstancesSetSecurityPolicyRequest extends com.google.api.client.json.GenericJson {

  /**
   * The network interfaces that the security policy will be applied to. Network interfaces use the
   * nicN naming format. You can only set a security policy for network interfaces with an access
   * config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> networkInterfaces;

  /**
   * A full or partial URL to a security policy to add to this instance. If this field is set to an
   * empty string it will remove the associated security policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String securityPolicy;

  /**
   * The network interfaces that the security policy will be applied to. Network interfaces use the
   * nicN naming format. You can only set a security policy for network interfaces with an access
   * config.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNetworkInterfaces() {
    return networkInterfaces;
  }

  /**
   * The network interfaces that the security policy will be applied to. Network interfaces use the
   * nicN naming format. You can only set a security policy for network interfaces with an access
   * config.
   * @param networkInterfaces networkInterfaces or {@code null} for none
   */
  public InstancesSetSecurityPolicyRequest setNetworkInterfaces(java.util.List<java.lang.String> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
    return this;
  }

  /**
   * A full or partial URL to a security policy to add to this instance. If this field is set to an
   * empty string it will remove the associated security policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecurityPolicy() {
    return securityPolicy;
  }

  /**
   * A full or partial URL to a security policy to add to this instance. If this field is set to an
   * empty string it will remove the associated security policy.
   * @param securityPolicy securityPolicy or {@code null} for none
   */
  public InstancesSetSecurityPolicyRequest setSecurityPolicy(java.lang.String securityPolicy) {
    this.securityPolicy = securityPolicy;
    return this;
  }

  @Override
  public InstancesSetSecurityPolicyRequest set(String fieldName, Object value) {
    return (InstancesSetSecurityPolicyRequest) super.set(fieldName, value);
  }

  @Override
  public InstancesSetSecurityPolicyRequest clone() {
    return (InstancesSetSecurityPolicyRequest) super.clone();
  }

}
