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
 * Represents a match condition that incoming traffic is evaluated against. Exactly one field must
 * be specified.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FirewallPolicyRuleMatcher extends com.google.api.client.json.GenericJson {

  /**
   * Address groups which should be matched against the traffic destination. Maximum number of
   * destination address groups is 10.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> destAddressGroups;

  /**
   * Fully Qualified Domain Name (FQDN) which should be matched against traffic destination. Maximum
   * number of destination fqdn allowed is 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> destFqdns;

  /**
   * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> destIpRanges;

  /**
   * Pairs of IP protocols and ports that the rule should match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FirewallPolicyRuleMatcherLayer4Config> layer4Configs;

  /**
   * Address groups which should be matched against the traffic source. Maximum number of source
   * address groups is 10.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> srcAddressGroups;

  /**
   * Fully Qualified Domain Name (FQDN) which should be matched against traffic source. Maximum
   * number of source fqdn allowed is 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> srcFqdns;

  /**
   * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> srcIpRanges;

  /**
   * List of secure tag values, which should be matched at the source of the traffic. For INGRESS
   * rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be
   * ignored. Maximum number of source tag values allowed is 256.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FirewallPolicyRuleSecureTag> srcSecureTags;

  /**
   * Address groups which should be matched against the traffic destination. Maximum number of
   * destination address groups is 10.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDestAddressGroups() {
    return destAddressGroups;
  }

  /**
   * Address groups which should be matched against the traffic destination. Maximum number of
   * destination address groups is 10.
   * @param destAddressGroups destAddressGroups or {@code null} for none
   */
  public FirewallPolicyRuleMatcher setDestAddressGroups(java.util.List<java.lang.String> destAddressGroups) {
    this.destAddressGroups = destAddressGroups;
    return this;
  }

  /**
   * Fully Qualified Domain Name (FQDN) which should be matched against traffic destination. Maximum
   * number of destination fqdn allowed is 1000.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDestFqdns() {
    return destFqdns;
  }

  /**
   * Fully Qualified Domain Name (FQDN) which should be matched against traffic destination. Maximum
   * number of destination fqdn allowed is 1000.
   * @param destFqdns destFqdns or {@code null} for none
   */
  public FirewallPolicyRuleMatcher setDestFqdns(java.util.List<java.lang.String> destFqdns) {
    this.destFqdns = destFqdns;
    return this;
  }

  /**
   * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDestIpRanges() {
    return destIpRanges;
  }

  /**
   * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
   * @param destIpRanges destIpRanges or {@code null} for none
   */
  public FirewallPolicyRuleMatcher setDestIpRanges(java.util.List<java.lang.String> destIpRanges) {
    this.destIpRanges = destIpRanges;
    return this;
  }

  /**
   * Pairs of IP protocols and ports that the rule should match.
   * @return value or {@code null} for none
   */
  public java.util.List<FirewallPolicyRuleMatcherLayer4Config> getLayer4Configs() {
    return layer4Configs;
  }

  /**
   * Pairs of IP protocols and ports that the rule should match.
   * @param layer4Configs layer4Configs or {@code null} for none
   */
  public FirewallPolicyRuleMatcher setLayer4Configs(java.util.List<FirewallPolicyRuleMatcherLayer4Config> layer4Configs) {
    this.layer4Configs = layer4Configs;
    return this;
  }

  /**
   * Address groups which should be matched against the traffic source. Maximum number of source
   * address groups is 10.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSrcAddressGroups() {
    return srcAddressGroups;
  }

  /**
   * Address groups which should be matched against the traffic source. Maximum number of source
   * address groups is 10.
   * @param srcAddressGroups srcAddressGroups or {@code null} for none
   */
  public FirewallPolicyRuleMatcher setSrcAddressGroups(java.util.List<java.lang.String> srcAddressGroups) {
    this.srcAddressGroups = srcAddressGroups;
    return this;
  }

  /**
   * Fully Qualified Domain Name (FQDN) which should be matched against traffic source. Maximum
   * number of source fqdn allowed is 1000.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSrcFqdns() {
    return srcFqdns;
  }

  /**
   * Fully Qualified Domain Name (FQDN) which should be matched against traffic source. Maximum
   * number of source fqdn allowed is 1000.
   * @param srcFqdns srcFqdns or {@code null} for none
   */
  public FirewallPolicyRuleMatcher setSrcFqdns(java.util.List<java.lang.String> srcFqdns) {
    this.srcFqdns = srcFqdns;
    return this;
  }

  /**
   * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSrcIpRanges() {
    return srcIpRanges;
  }

  /**
   * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
   * @param srcIpRanges srcIpRanges or {@code null} for none
   */
  public FirewallPolicyRuleMatcher setSrcIpRanges(java.util.List<java.lang.String> srcIpRanges) {
    this.srcIpRanges = srcIpRanges;
    return this;
  }

  /**
   * List of secure tag values, which should be matched at the source of the traffic. For INGRESS
   * rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be
   * ignored. Maximum number of source tag values allowed is 256.
   * @return value or {@code null} for none
   */
  public java.util.List<FirewallPolicyRuleSecureTag> getSrcSecureTags() {
    return srcSecureTags;
  }

  /**
   * List of secure tag values, which should be matched at the source of the traffic. For INGRESS
   * rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be
   * ignored. Maximum number of source tag values allowed is 256.
   * @param srcSecureTags srcSecureTags or {@code null} for none
   */
  public FirewallPolicyRuleMatcher setSrcSecureTags(java.util.List<FirewallPolicyRuleSecureTag> srcSecureTags) {
    this.srcSecureTags = srcSecureTags;
    return this;
  }

  @Override
  public FirewallPolicyRuleMatcher set(String fieldName, Object value) {
    return (FirewallPolicyRuleMatcher) super.set(fieldName, value);
  }

  @Override
  public FirewallPolicyRuleMatcher clone() {
    return (FirewallPolicyRuleMatcher) super.clone();
  }

}
