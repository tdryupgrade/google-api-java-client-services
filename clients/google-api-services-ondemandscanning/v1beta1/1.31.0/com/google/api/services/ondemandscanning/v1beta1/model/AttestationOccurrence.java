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

package com.google.api.services.ondemandscanning.v1beta1.model;

/**
 * Occurrence that represents a single "attestation". The authenticity of an attestation can be
 * verified using the attached signature. If the verifier trusts the public key of the signer, then
 * verifying the signature is sufficient to establish trust. In this circumstance, the authority to
 * which this attestation is attached is primarily useful for lookup (how to find this attestation
 * if you already know the authority and artifact to be verified) and intent (for which authority
 * this attestation was intended to sign.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the On-Demand Scanning API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AttestationOccurrence extends com.google.api.client.json.GenericJson {

  /**
   * One or more JWTs encoding a self-contained attestation. Each JWT encodes the payload that it
   * verifies within the JWT itself. Verifier implementation SHOULD ignore the `serialized_payload`
   * field when verifying these JWTs. If only JWTs are present on this AttestationOccurrence, then
   * the `serialized_payload` SHOULD be left empty. Each JWT SHOULD encode a claim specific to the
   * `resource_uri` of this Occurrence, but this is not validated by Grafeas metadata API
   * implementations. The JWT itself is opaque to Grafeas.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Jwt> jwts;

  /**
   * Required. The serialized payload that is verified by one or more `signatures`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serializedPayload;

  /**
   * One or more signatures over `serialized_payload`. Verifier implementations should consider this
   * attestation message verified if at least one `signature` verifies `serialized_payload`. See
   * `Signature` in common.proto for more details on signature structure and verification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Signature> signatures;

  /**
   * One or more JWTs encoding a self-contained attestation. Each JWT encodes the payload that it
   * verifies within the JWT itself. Verifier implementation SHOULD ignore the `serialized_payload`
   * field when verifying these JWTs. If only JWTs are present on this AttestationOccurrence, then
   * the `serialized_payload` SHOULD be left empty. Each JWT SHOULD encode a claim specific to the
   * `resource_uri` of this Occurrence, but this is not validated by Grafeas metadata API
   * implementations. The JWT itself is opaque to Grafeas.
   * @return value or {@code null} for none
   */
  public java.util.List<Jwt> getJwts() {
    return jwts;
  }

  /**
   * One or more JWTs encoding a self-contained attestation. Each JWT encodes the payload that it
   * verifies within the JWT itself. Verifier implementation SHOULD ignore the `serialized_payload`
   * field when verifying these JWTs. If only JWTs are present on this AttestationOccurrence, then
   * the `serialized_payload` SHOULD be left empty. Each JWT SHOULD encode a claim specific to the
   * `resource_uri` of this Occurrence, but this is not validated by Grafeas metadata API
   * implementations. The JWT itself is opaque to Grafeas.
   * @param jwts jwts or {@code null} for none
   */
  public AttestationOccurrence setJwts(java.util.List<Jwt> jwts) {
    this.jwts = jwts;
    return this;
  }

  /**
   * Required. The serialized payload that is verified by one or more `signatures`.
   * @see #decodeSerializedPayload()
   * @return value or {@code null} for none
   */
  public java.lang.String getSerializedPayload() {
    return serializedPayload;
  }

  /**
   * Required. The serialized payload that is verified by one or more `signatures`.
   * @see #getSerializedPayload()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeSerializedPayload() {
    return com.google.api.client.util.Base64.decodeBase64(serializedPayload);
  }

  /**
   * Required. The serialized payload that is verified by one or more `signatures`.
   * @see #encodeSerializedPayload()
   * @param serializedPayload serializedPayload or {@code null} for none
   */
  public AttestationOccurrence setSerializedPayload(java.lang.String serializedPayload) {
    this.serializedPayload = serializedPayload;
    return this;
  }

  /**
   * Required. The serialized payload that is verified by one or more `signatures`.
   * @see #setSerializedPayload()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public AttestationOccurrence encodeSerializedPayload(byte[] serializedPayload) {
    this.serializedPayload = com.google.api.client.util.Base64.encodeBase64URLSafeString(serializedPayload);
    return this;
  }

  /**
   * One or more signatures over `serialized_payload`. Verifier implementations should consider this
   * attestation message verified if at least one `signature` verifies `serialized_payload`. See
   * `Signature` in common.proto for more details on signature structure and verification.
   * @return value or {@code null} for none
   */
  public java.util.List<Signature> getSignatures() {
    return signatures;
  }

  /**
   * One or more signatures over `serialized_payload`. Verifier implementations should consider this
   * attestation message verified if at least one `signature` verifies `serialized_payload`. See
   * `Signature` in common.proto for more details on signature structure and verification.
   * @param signatures signatures or {@code null} for none
   */
  public AttestationOccurrence setSignatures(java.util.List<Signature> signatures) {
    this.signatures = signatures;
    return this;
  }

  @Override
  public AttestationOccurrence set(String fieldName, Object value) {
    return (AttestationOccurrence) super.set(fieldName, value);
  }

  @Override
  public AttestationOccurrence clone() {
    return (AttestationOccurrence) super.clone();
  }

}
