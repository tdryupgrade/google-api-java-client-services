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

package com.google.api.services.sqladmin.model;

/**
 * IP Management configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IpConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * The name of the allocated ip range for the private ip CloudSQL instance. For example: "google-
   * managed-services-default". If set, the instance ip will be created in the allocated range. The
   * range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the
   * name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?.` Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String allocatedIpRange;

  /**
   * The list of external networks that are allowed to connect to the instance using the IP. In
   * 'CIDR' notation, also known as 'slash' notation (for example: *192.168.100.0/24*).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AclEntry> authorizedNetworks;

  static {
    // hack to force ProGuard to consider AclEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AclEntry.class);
  }

  /**
   * Whether the instance is assigned a public IP address or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ipv4Enabled;

  /**
   * The resource link for the VPC network from which the Cloud SQL instance is accessible for
   * private IP. For example, projects/myProject/global/networks/default*. This setting can be
   * updated, but it cannot be removed after it is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateNetwork;

  /**
   * Whether SSL connections over IP are enforced or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requireSsl;

  /**
   * The name of the allocated ip range for the private ip CloudSQL instance. For example: "google-
   * managed-services-default". If set, the instance ip will be created in the allocated range. The
   * range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the
   * name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?.` Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.String getAllocatedIpRange() {
    return allocatedIpRange;
  }

  /**
   * The name of the allocated ip range for the private ip CloudSQL instance. For example: "google-
   * managed-services-default". If set, the instance ip will be created in the allocated range. The
   * range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the
   * name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?.` Reserved for future use.
   * @param allocatedIpRange allocatedIpRange or {@code null} for none
   */
  public IpConfiguration setAllocatedIpRange(java.lang.String allocatedIpRange) {
    this.allocatedIpRange = allocatedIpRange;
    return this;
  }

  /**
   * The list of external networks that are allowed to connect to the instance using the IP. In
   * 'CIDR' notation, also known as 'slash' notation (for example: *192.168.100.0/24*).
   * @return value or {@code null} for none
   */
  public java.util.List<AclEntry> getAuthorizedNetworks() {
    return authorizedNetworks;
  }

  /**
   * The list of external networks that are allowed to connect to the instance using the IP. In
   * 'CIDR' notation, also known as 'slash' notation (for example: *192.168.100.0/24*).
   * @param authorizedNetworks authorizedNetworks or {@code null} for none
   */
  public IpConfiguration setAuthorizedNetworks(java.util.List<AclEntry> authorizedNetworks) {
    this.authorizedNetworks = authorizedNetworks;
    return this;
  }

  /**
   * Whether the instance is assigned a public IP address or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIpv4Enabled() {
    return ipv4Enabled;
  }

  /**
   * Whether the instance is assigned a public IP address or not.
   * @param ipv4Enabled ipv4Enabled or {@code null} for none
   */
  public IpConfiguration setIpv4Enabled(java.lang.Boolean ipv4Enabled) {
    this.ipv4Enabled = ipv4Enabled;
    return this;
  }

  /**
   * The resource link for the VPC network from which the Cloud SQL instance is accessible for
   * private IP. For example, projects/myProject/global/networks/default*. This setting can be
   * updated, but it cannot be removed after it is set.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateNetwork() {
    return privateNetwork;
  }

  /**
   * The resource link for the VPC network from which the Cloud SQL instance is accessible for
   * private IP. For example, projects/myProject/global/networks/default*. This setting can be
   * updated, but it cannot be removed after it is set.
   * @param privateNetwork privateNetwork or {@code null} for none
   */
  public IpConfiguration setPrivateNetwork(java.lang.String privateNetwork) {
    this.privateNetwork = privateNetwork;
    return this;
  }

  /**
   * Whether SSL connections over IP are enforced or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequireSsl() {
    return requireSsl;
  }

  /**
   * Whether SSL connections over IP are enforced or not.
   * @param requireSsl requireSsl or {@code null} for none
   */
  public IpConfiguration setRequireSsl(java.lang.Boolean requireSsl) {
    this.requireSsl = requireSsl;
    return this;
  }

  @Override
  public IpConfiguration set(String fieldName, Object value) {
    return (IpConfiguration) super.set(fieldName, value);
  }

  @Override
  public IpConfiguration clone() {
    return (IpConfiguration) super.clone();
  }

}
