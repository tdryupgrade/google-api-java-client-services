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

package com.google.api.services.identitytoolkit.v2.model;

/**
 * Information of custom domain DNS verification. By default, default_domain will be used. A custom
 * domain can be configured using VerifyCustomDomain.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity Toolkit API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIdentitytoolkitAdminV2DnsInfo extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The applied verified custom domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customDomain;

  /**
   * Output only. The current verification state of the custom domain. The custom domain will only
   * be used once the domain verification is successful.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customDomainState;

  /**
   * Output only. The timestamp of initial request for the current domain verification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String domainVerificationRequestTime;

  /**
   * Output only. The custom domain that's to be verified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pendingCustomDomain;

  /**
   * Whether to use custom domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useCustomDomain;

  /**
   * Output only. The applied verified custom domain.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomDomain() {
    return customDomain;
  }

  /**
   * Output only. The applied verified custom domain.
   * @param customDomain customDomain or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitAdminV2DnsInfo setCustomDomain(java.lang.String customDomain) {
    this.customDomain = customDomain;
    return this;
  }

  /**
   * Output only. The current verification state of the custom domain. The custom domain will only
   * be used once the domain verification is successful.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomDomainState() {
    return customDomainState;
  }

  /**
   * Output only. The current verification state of the custom domain. The custom domain will only
   * be used once the domain verification is successful.
   * @param customDomainState customDomainState or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitAdminV2DnsInfo setCustomDomainState(java.lang.String customDomainState) {
    this.customDomainState = customDomainState;
    return this;
  }

  /**
   * Output only. The timestamp of initial request for the current domain verification.
   * @return value or {@code null} for none
   */
  public String getDomainVerificationRequestTime() {
    return domainVerificationRequestTime;
  }

  /**
   * Output only. The timestamp of initial request for the current domain verification.
   * @param domainVerificationRequestTime domainVerificationRequestTime or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitAdminV2DnsInfo setDomainVerificationRequestTime(String domainVerificationRequestTime) {
    this.domainVerificationRequestTime = domainVerificationRequestTime;
    return this;
  }

  /**
   * Output only. The custom domain that's to be verified.
   * @return value or {@code null} for none
   */
  public java.lang.String getPendingCustomDomain() {
    return pendingCustomDomain;
  }

  /**
   * Output only. The custom domain that's to be verified.
   * @param pendingCustomDomain pendingCustomDomain or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitAdminV2DnsInfo setPendingCustomDomain(java.lang.String pendingCustomDomain) {
    this.pendingCustomDomain = pendingCustomDomain;
    return this;
  }

  /**
   * Whether to use custom domain.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseCustomDomain() {
    return useCustomDomain;
  }

  /**
   * Whether to use custom domain.
   * @param useCustomDomain useCustomDomain or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitAdminV2DnsInfo setUseCustomDomain(java.lang.Boolean useCustomDomain) {
    this.useCustomDomain = useCustomDomain;
    return this;
  }

  @Override
  public GoogleCloudIdentitytoolkitAdminV2DnsInfo set(String fieldName, Object value) {
    return (GoogleCloudIdentitytoolkitAdminV2DnsInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIdentitytoolkitAdminV2DnsInfo clone() {
    return (GoogleCloudIdentitytoolkitAdminV2DnsInfo) super.clone();
  }

}
