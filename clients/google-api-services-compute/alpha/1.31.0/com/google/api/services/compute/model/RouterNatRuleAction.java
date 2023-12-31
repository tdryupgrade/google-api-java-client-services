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
 * Model definition for RouterNatRuleAction.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouterNatRuleAction extends com.google.api.client.json.GenericJson {

  /**
   * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid
   * static external IP addresses assigned to the project. This field is used for public NAT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sourceNatActiveIps;

  /**
   * A list of URLs of the subnetworks used as source ranges for this NAT Rule. These subnetworks
   * must have purpose set to PRIVATE_NAT. This field is used for private NAT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sourceNatActiveRanges;

  /**
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs
   * that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule
   * only. This field is used for public NAT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sourceNatDrainIps;

  /**
   * A list of URLs of subnetworks representing source ranges to be drained. This is only supported
   * on patch/update, and these subnetworks must have previously been used as active ranges in this
   * NAT Rule. This field is used for private NAT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sourceNatDrainRanges;

  /**
   * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid
   * static external IP addresses assigned to the project. This field is used for public NAT.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSourceNatActiveIps() {
    return sourceNatActiveIps;
  }

  /**
   * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid
   * static external IP addresses assigned to the project. This field is used for public NAT.
   * @param sourceNatActiveIps sourceNatActiveIps or {@code null} for none
   */
  public RouterNatRuleAction setSourceNatActiveIps(java.util.List<java.lang.String> sourceNatActiveIps) {
    this.sourceNatActiveIps = sourceNatActiveIps;
    return this;
  }

  /**
   * A list of URLs of the subnetworks used as source ranges for this NAT Rule. These subnetworks
   * must have purpose set to PRIVATE_NAT. This field is used for private NAT.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSourceNatActiveRanges() {
    return sourceNatActiveRanges;
  }

  /**
   * A list of URLs of the subnetworks used as source ranges for this NAT Rule. These subnetworks
   * must have purpose set to PRIVATE_NAT. This field is used for private NAT.
   * @param sourceNatActiveRanges sourceNatActiveRanges or {@code null} for none
   */
  public RouterNatRuleAction setSourceNatActiveRanges(java.util.List<java.lang.String> sourceNatActiveRanges) {
    this.sourceNatActiveRanges = sourceNatActiveRanges;
    return this;
  }

  /**
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs
   * that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule
   * only. This field is used for public NAT.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSourceNatDrainIps() {
    return sourceNatDrainIps;
  }

  /**
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs
   * that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule
   * only. This field is used for public NAT.
   * @param sourceNatDrainIps sourceNatDrainIps or {@code null} for none
   */
  public RouterNatRuleAction setSourceNatDrainIps(java.util.List<java.lang.String> sourceNatDrainIps) {
    this.sourceNatDrainIps = sourceNatDrainIps;
    return this;
  }

  /**
   * A list of URLs of subnetworks representing source ranges to be drained. This is only supported
   * on patch/update, and these subnetworks must have previously been used as active ranges in this
   * NAT Rule. This field is used for private NAT.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSourceNatDrainRanges() {
    return sourceNatDrainRanges;
  }

  /**
   * A list of URLs of subnetworks representing source ranges to be drained. This is only supported
   * on patch/update, and these subnetworks must have previously been used as active ranges in this
   * NAT Rule. This field is used for private NAT.
   * @param sourceNatDrainRanges sourceNatDrainRanges or {@code null} for none
   */
  public RouterNatRuleAction setSourceNatDrainRanges(java.util.List<java.lang.String> sourceNatDrainRanges) {
    this.sourceNatDrainRanges = sourceNatDrainRanges;
    return this;
  }

  @Override
  public RouterNatRuleAction set(String fieldName, Object value) {
    return (RouterNatRuleAction) super.set(fieldName, value);
  }

  @Override
  public RouterNatRuleAction clone() {
    return (RouterNatRuleAction) super.clone();
  }

}
