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

package com.google.api.services.cloudkms.v1.model;

/**
 * Response message for KeyManagementService.RawEncrypt.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RawEncryptResponse extends com.google.api.client.json.GenericJson {

  /**
   * The encrypted data. In the case of AES-GCM, the authentication tag is the tag_length bytes at
   * the end of this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ciphertext;

  /**
   * Integrity verification field. A CRC32C checksum of the returned RawEncryptResponse.ciphertext.
   * An integrity check of ciphertext can be performed by computing the CRC32C checksum of
   * ciphertext and comparing your results to this field. Discard the response in case of non-
   * matching checksum values, and perform a limited number of retries. A persistent mismatch may
   * indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as
   * int64 for reasons of compatibility across different languages. However, it is a non-negative
   * integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages
   * that support this type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long ciphertextCrc32c;

  /**
   * The initialization vector (IV) generated by the service during encryption. This value must be
   * stored and provided in RawDecryptRequest.initialization_vector at decryption time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String initializationVector;

  /**
   * Integrity verification field. A CRC32C checksum of the returned
   * RawEncryptResponse.initialization_vector. An integrity check of initialization_vector can be
   * performed by computing the CRC32C checksum of initialization_vector and comparing your results
   * to this field. Discard the response in case of non-matching checksum values, and perform a
   * limited number of retries. A persistent mismatch may indicate an issue in your computation of
   * the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across
   * different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and
   * can be safely downconverted to uint32 in languages that support this type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long initializationVectorCrc32c;

  /**
   * The resource name of the CryptoKeyVersion used in encryption. Check this field to verify that
   * the intended resource was used for encryption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The ProtectionLevel of the CryptoKeyVersion used in encryption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protectionLevel;

  /**
   * The length of the authentication tag that is appended to the end of the ciphertext.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer tagLength;

  /**
   * Integrity verification field. A flag indicating whether
   * RawEncryptRequest.additional_authenticated_data_crc32c was received by KeyManagementService and
   * used for the integrity verification of additional_authenticated_data. A false value of this
   * field indicates either that // RawEncryptRequest.additional_authenticated_data_crc32c was left
   * unset or that it was not delivered to KeyManagementService. If you've set
   * RawEncryptRequest.additional_authenticated_data_crc32c but this field is still false, discard
   * the response and perform a limited number of retries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verifiedAdditionalAuthenticatedDataCrc32c;

  /**
   * Integrity verification field. A flag indicating whether
   * RawEncryptRequest.initialization_vector_crc32c was received by KeyManagementService and used
   * for the integrity verification of initialization_vector. A false value of this field indicates
   * either that RawEncryptRequest.initialization_vector_crc32c was left unset or that it was not
   * delivered to KeyManagementService. If you've set RawEncryptRequest.initialization_vector_crc32c
   * but this field is still false, discard the response and perform a limited number of retries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verifiedInitializationVectorCrc32c;

  /**
   * Integrity verification field. A flag indicating whether RawEncryptRequest.plaintext_crc32c was
   * received by KeyManagementService and used for the integrity verification of the plaintext. A
   * false value of this field indicates either that RawEncryptRequest.plaintext_crc32c was left
   * unset or that it was not delivered to KeyManagementService. If you've set
   * RawEncryptRequest.plaintext_crc32c but this field is still false, discard the response and
   * perform a limited number of retries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verifiedPlaintextCrc32c;

  /**
   * The encrypted data. In the case of AES-GCM, the authentication tag is the tag_length bytes at
   * the end of this field.
   * @see #decodeCiphertext()
   * @return value or {@code null} for none
   */
  public java.lang.String getCiphertext() {
    return ciphertext;
  }

  /**
   * The encrypted data. In the case of AES-GCM, the authentication tag is the tag_length bytes at
   * the end of this field.
   * @see #getCiphertext()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeCiphertext() {
    return com.google.api.client.util.Base64.decodeBase64(ciphertext);
  }

  /**
   * The encrypted data. In the case of AES-GCM, the authentication tag is the tag_length bytes at
   * the end of this field.
   * @see #encodeCiphertext()
   * @param ciphertext ciphertext or {@code null} for none
   */
  public RawEncryptResponse setCiphertext(java.lang.String ciphertext) {
    this.ciphertext = ciphertext;
    return this;
  }

  /**
   * The encrypted data. In the case of AES-GCM, the authentication tag is the tag_length bytes at
   * the end of this field.
   * @see #setCiphertext()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public RawEncryptResponse encodeCiphertext(byte[] ciphertext) {
    this.ciphertext = com.google.api.client.util.Base64.encodeBase64URLSafeString(ciphertext);
    return this;
  }

  /**
   * Integrity verification field. A CRC32C checksum of the returned RawEncryptResponse.ciphertext.
   * An integrity check of ciphertext can be performed by computing the CRC32C checksum of
   * ciphertext and comparing your results to this field. Discard the response in case of non-
   * matching checksum values, and perform a limited number of retries. A persistent mismatch may
   * indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as
   * int64 for reasons of compatibility across different languages. However, it is a non-negative
   * integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages
   * that support this type.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCiphertextCrc32c() {
    return ciphertextCrc32c;
  }

  /**
   * Integrity verification field. A CRC32C checksum of the returned RawEncryptResponse.ciphertext.
   * An integrity check of ciphertext can be performed by computing the CRC32C checksum of
   * ciphertext and comparing your results to this field. Discard the response in case of non-
   * matching checksum values, and perform a limited number of retries. A persistent mismatch may
   * indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as
   * int64 for reasons of compatibility across different languages. However, it is a non-negative
   * integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages
   * that support this type.
   * @param ciphertextCrc32c ciphertextCrc32c or {@code null} for none
   */
  public RawEncryptResponse setCiphertextCrc32c(java.lang.Long ciphertextCrc32c) {
    this.ciphertextCrc32c = ciphertextCrc32c;
    return this;
  }

  /**
   * The initialization vector (IV) generated by the service during encryption. This value must be
   * stored and provided in RawDecryptRequest.initialization_vector at decryption time.
   * @see #decodeInitializationVector()
   * @return value or {@code null} for none
   */
  public java.lang.String getInitializationVector() {
    return initializationVector;
  }

  /**
   * The initialization vector (IV) generated by the service during encryption. This value must be
   * stored and provided in RawDecryptRequest.initialization_vector at decryption time.
   * @see #getInitializationVector()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeInitializationVector() {
    return com.google.api.client.util.Base64.decodeBase64(initializationVector);
  }

  /**
   * The initialization vector (IV) generated by the service during encryption. This value must be
   * stored and provided in RawDecryptRequest.initialization_vector at decryption time.
   * @see #encodeInitializationVector()
   * @param initializationVector initializationVector or {@code null} for none
   */
  public RawEncryptResponse setInitializationVector(java.lang.String initializationVector) {
    this.initializationVector = initializationVector;
    return this;
  }

  /**
   * The initialization vector (IV) generated by the service during encryption. This value must be
   * stored and provided in RawDecryptRequest.initialization_vector at decryption time.
   * @see #setInitializationVector()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public RawEncryptResponse encodeInitializationVector(byte[] initializationVector) {
    this.initializationVector = com.google.api.client.util.Base64.encodeBase64URLSafeString(initializationVector);
    return this;
  }

  /**
   * Integrity verification field. A CRC32C checksum of the returned
   * RawEncryptResponse.initialization_vector. An integrity check of initialization_vector can be
   * performed by computing the CRC32C checksum of initialization_vector and comparing your results
   * to this field. Discard the response in case of non-matching checksum values, and perform a
   * limited number of retries. A persistent mismatch may indicate an issue in your computation of
   * the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across
   * different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and
   * can be safely downconverted to uint32 in languages that support this type.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInitializationVectorCrc32c() {
    return initializationVectorCrc32c;
  }

  /**
   * Integrity verification field. A CRC32C checksum of the returned
   * RawEncryptResponse.initialization_vector. An integrity check of initialization_vector can be
   * performed by computing the CRC32C checksum of initialization_vector and comparing your results
   * to this field. Discard the response in case of non-matching checksum values, and perform a
   * limited number of retries. A persistent mismatch may indicate an issue in your computation of
   * the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across
   * different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and
   * can be safely downconverted to uint32 in languages that support this type.
   * @param initializationVectorCrc32c initializationVectorCrc32c or {@code null} for none
   */
  public RawEncryptResponse setInitializationVectorCrc32c(java.lang.Long initializationVectorCrc32c) {
    this.initializationVectorCrc32c = initializationVectorCrc32c;
    return this;
  }

  /**
   * The resource name of the CryptoKeyVersion used in encryption. Check this field to verify that
   * the intended resource was used for encryption.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the CryptoKeyVersion used in encryption. Check this field to verify that
   * the intended resource was used for encryption.
   * @param name name or {@code null} for none
   */
  public RawEncryptResponse setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The ProtectionLevel of the CryptoKeyVersion used in encryption.
   * @return value or {@code null} for none
   */
  public java.lang.String getProtectionLevel() {
    return protectionLevel;
  }

  /**
   * The ProtectionLevel of the CryptoKeyVersion used in encryption.
   * @param protectionLevel protectionLevel or {@code null} for none
   */
  public RawEncryptResponse setProtectionLevel(java.lang.String protectionLevel) {
    this.protectionLevel = protectionLevel;
    return this;
  }

  /**
   * The length of the authentication tag that is appended to the end of the ciphertext.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTagLength() {
    return tagLength;
  }

  /**
   * The length of the authentication tag that is appended to the end of the ciphertext.
   * @param tagLength tagLength or {@code null} for none
   */
  public RawEncryptResponse setTagLength(java.lang.Integer tagLength) {
    this.tagLength = tagLength;
    return this;
  }

  /**
   * Integrity verification field. A flag indicating whether
   * RawEncryptRequest.additional_authenticated_data_crc32c was received by KeyManagementService and
   * used for the integrity verification of additional_authenticated_data. A false value of this
   * field indicates either that // RawEncryptRequest.additional_authenticated_data_crc32c was left
   * unset or that it was not delivered to KeyManagementService. If you've set
   * RawEncryptRequest.additional_authenticated_data_crc32c but this field is still false, discard
   * the response and perform a limited number of retries.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerifiedAdditionalAuthenticatedDataCrc32c() {
    return verifiedAdditionalAuthenticatedDataCrc32c;
  }

  /**
   * Integrity verification field. A flag indicating whether
   * RawEncryptRequest.additional_authenticated_data_crc32c was received by KeyManagementService and
   * used for the integrity verification of additional_authenticated_data. A false value of this
   * field indicates either that // RawEncryptRequest.additional_authenticated_data_crc32c was left
   * unset or that it was not delivered to KeyManagementService. If you've set
   * RawEncryptRequest.additional_authenticated_data_crc32c but this field is still false, discard
   * the response and perform a limited number of retries.
   * @param verifiedAdditionalAuthenticatedDataCrc32c verifiedAdditionalAuthenticatedDataCrc32c or {@code null} for none
   */
  public RawEncryptResponse setVerifiedAdditionalAuthenticatedDataCrc32c(java.lang.Boolean verifiedAdditionalAuthenticatedDataCrc32c) {
    this.verifiedAdditionalAuthenticatedDataCrc32c = verifiedAdditionalAuthenticatedDataCrc32c;
    return this;
  }

  /**
   * Integrity verification field. A flag indicating whether
   * RawEncryptRequest.initialization_vector_crc32c was received by KeyManagementService and used
   * for the integrity verification of initialization_vector. A false value of this field indicates
   * either that RawEncryptRequest.initialization_vector_crc32c was left unset or that it was not
   * delivered to KeyManagementService. If you've set RawEncryptRequest.initialization_vector_crc32c
   * but this field is still false, discard the response and perform a limited number of retries.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerifiedInitializationVectorCrc32c() {
    return verifiedInitializationVectorCrc32c;
  }

  /**
   * Integrity verification field. A flag indicating whether
   * RawEncryptRequest.initialization_vector_crc32c was received by KeyManagementService and used
   * for the integrity verification of initialization_vector. A false value of this field indicates
   * either that RawEncryptRequest.initialization_vector_crc32c was left unset or that it was not
   * delivered to KeyManagementService. If you've set RawEncryptRequest.initialization_vector_crc32c
   * but this field is still false, discard the response and perform a limited number of retries.
   * @param verifiedInitializationVectorCrc32c verifiedInitializationVectorCrc32c or {@code null} for none
   */
  public RawEncryptResponse setVerifiedInitializationVectorCrc32c(java.lang.Boolean verifiedInitializationVectorCrc32c) {
    this.verifiedInitializationVectorCrc32c = verifiedInitializationVectorCrc32c;
    return this;
  }

  /**
   * Integrity verification field. A flag indicating whether RawEncryptRequest.plaintext_crc32c was
   * received by KeyManagementService and used for the integrity verification of the plaintext. A
   * false value of this field indicates either that RawEncryptRequest.plaintext_crc32c was left
   * unset or that it was not delivered to KeyManagementService. If you've set
   * RawEncryptRequest.plaintext_crc32c but this field is still false, discard the response and
   * perform a limited number of retries.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerifiedPlaintextCrc32c() {
    return verifiedPlaintextCrc32c;
  }

  /**
   * Integrity verification field. A flag indicating whether RawEncryptRequest.plaintext_crc32c was
   * received by KeyManagementService and used for the integrity verification of the plaintext. A
   * false value of this field indicates either that RawEncryptRequest.plaintext_crc32c was left
   * unset or that it was not delivered to KeyManagementService. If you've set
   * RawEncryptRequest.plaintext_crc32c but this field is still false, discard the response and
   * perform a limited number of retries.
   * @param verifiedPlaintextCrc32c verifiedPlaintextCrc32c or {@code null} for none
   */
  public RawEncryptResponse setVerifiedPlaintextCrc32c(java.lang.Boolean verifiedPlaintextCrc32c) {
    this.verifiedPlaintextCrc32c = verifiedPlaintextCrc32c;
    return this;
  }

  @Override
  public RawEncryptResponse set(String fieldName, Object value) {
    return (RawEncryptResponse) super.set(fieldName, value);
  }

  @Override
  public RawEncryptResponse clone() {
    return (RawEncryptResponse) super.clone();
  }

}
