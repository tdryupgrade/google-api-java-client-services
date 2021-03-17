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

package com.google.api.services.gkehub.v1alpha2.model;

/**
 * Authority encodes how Google will recognize identities from this Membership. See the workload
 * identity documentation for more details: https://cloud.google.com/kubernetes-engine/docs/how-to
 * /workload-identity
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Authority extends com.google.api.client.json.GenericJson {

  /**
   * Output only. An identity provider that reflects the `issuer` in the workload identity pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String identityProvider;

  /**
   * Optional. A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://` and be a valid
   * URL with length <2000 characters. If set, then Google will allow valid OIDC tokens from this
   * issuer to authenticate within the workload_identity_pool. OIDC discovery will be performed on
   * this URI to validate tokens from the issuer, unless `oidc_jwks` is set. Clearing `issuer`
   * disables Workload Identity. `issuer` cannot be directly modified; it must be cleared (and
   * Workload Identity disabled) before using a new issuer (and re-enabling Workload Identity).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String issuer;

  /**
   * Optional. OIDC verification keys for this Membership in JWKS format (RFC 7517). When this field
   * is set, OIDC discovery will NOT be performed on `issuer`, and instead OIDC tokens will be
   * validated using this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oidcJwks;

  /**
   * Output only. The name of the workload identity pool in which `issuer` will be recognized. There
   * is a single Workload Identity Pool per Hub that is shared between all Memberships that belong
   * to that Hub. For a Hub hosted in {PROJECT_ID}, the workload pool format is
   * `{PROJECT_ID}.hub.id.goog`, although this is subject to change in newer versions of this API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workloadIdentityPool;

  /**
   * Output only. An identity provider that reflects the `issuer` in the workload identity pool.
   * @return value or {@code null} for none
   */
  public java.lang.String getIdentityProvider() {
    return identityProvider;
  }

  /**
   * Output only. An identity provider that reflects the `issuer` in the workload identity pool.
   * @param identityProvider identityProvider or {@code null} for none
   */
  public Authority setIdentityProvider(java.lang.String identityProvider) {
    this.identityProvider = identityProvider;
    return this;
  }

  /**
   * Optional. A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://` and be a valid
   * URL with length <2000 characters. If set, then Google will allow valid OIDC tokens from this
   * issuer to authenticate within the workload_identity_pool. OIDC discovery will be performed on
   * this URI to validate tokens from the issuer, unless `oidc_jwks` is set. Clearing `issuer`
   * disables Workload Identity. `issuer` cannot be directly modified; it must be cleared (and
   * Workload Identity disabled) before using a new issuer (and re-enabling Workload Identity).
   * @return value or {@code null} for none
   */
  public java.lang.String getIssuer() {
    return issuer;
  }

  /**
   * Optional. A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://` and be a valid
   * URL with length <2000 characters. If set, then Google will allow valid OIDC tokens from this
   * issuer to authenticate within the workload_identity_pool. OIDC discovery will be performed on
   * this URI to validate tokens from the issuer, unless `oidc_jwks` is set. Clearing `issuer`
   * disables Workload Identity. `issuer` cannot be directly modified; it must be cleared (and
   * Workload Identity disabled) before using a new issuer (and re-enabling Workload Identity).
   * @param issuer issuer or {@code null} for none
   */
  public Authority setIssuer(java.lang.String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Optional. OIDC verification keys for this Membership in JWKS format (RFC 7517). When this field
   * is set, OIDC discovery will NOT be performed on `issuer`, and instead OIDC tokens will be
   * validated using this field.
   * @see #decodeOidcJwks()
   * @return value or {@code null} for none
   */
  public java.lang.String getOidcJwks() {
    return oidcJwks;
  }

  /**
   * Optional. OIDC verification keys for this Membership in JWKS format (RFC 7517). When this field
   * is set, OIDC discovery will NOT be performed on `issuer`, and instead OIDC tokens will be
   * validated using this field.
   * @see #getOidcJwks()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeOidcJwks() {
    return com.google.api.client.util.Base64.decodeBase64(oidcJwks);
  }

  /**
   * Optional. OIDC verification keys for this Membership in JWKS format (RFC 7517). When this field
   * is set, OIDC discovery will NOT be performed on `issuer`, and instead OIDC tokens will be
   * validated using this field.
   * @see #encodeOidcJwks()
   * @param oidcJwks oidcJwks or {@code null} for none
   */
  public Authority setOidcJwks(java.lang.String oidcJwks) {
    this.oidcJwks = oidcJwks;
    return this;
  }

  /**
   * Optional. OIDC verification keys for this Membership in JWKS format (RFC 7517). When this field
   * is set, OIDC discovery will NOT be performed on `issuer`, and instead OIDC tokens will be
   * validated using this field.
   * @see #setOidcJwks()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Authority encodeOidcJwks(byte[] oidcJwks) {
    this.oidcJwks = com.google.api.client.util.Base64.encodeBase64URLSafeString(oidcJwks);
    return this;
  }

  /**
   * Output only. The name of the workload identity pool in which `issuer` will be recognized. There
   * is a single Workload Identity Pool per Hub that is shared between all Memberships that belong
   * to that Hub. For a Hub hosted in {PROJECT_ID}, the workload pool format is
   * `{PROJECT_ID}.hub.id.goog`, although this is subject to change in newer versions of this API.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkloadIdentityPool() {
    return workloadIdentityPool;
  }

  /**
   * Output only. The name of the workload identity pool in which `issuer` will be recognized. There
   * is a single Workload Identity Pool per Hub that is shared between all Memberships that belong
   * to that Hub. For a Hub hosted in {PROJECT_ID}, the workload pool format is
   * `{PROJECT_ID}.hub.id.goog`, although this is subject to change in newer versions of this API.
   * @param workloadIdentityPool workloadIdentityPool or {@code null} for none
   */
  public Authority setWorkloadIdentityPool(java.lang.String workloadIdentityPool) {
    this.workloadIdentityPool = workloadIdentityPool;
    return this;
  }

  @Override
  public Authority set(String fieldName, Object value) {
    return (Authority) super.set(fieldName, value);
  }

  @Override
  public Authority clone() {
    return (Authority) super.clone();
  }

}
