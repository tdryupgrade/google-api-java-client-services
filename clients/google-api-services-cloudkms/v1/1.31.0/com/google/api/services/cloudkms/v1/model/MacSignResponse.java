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
 * Response message for KeyManagementService.MacSign.
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
public final class MacSignResponse extends com.google.api.client.json.GenericJson {

  /**
   * The created signature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mac;

  /**
   * Integrity verification field. A CRC32C checksum of the returned MacSignResponse.mac. An
   * integrity check of MacSignResponse.mac can be performed by computing the CRC32C checksum of
   * MacSignResponse.mac and comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A persistent mismatch
   * may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined
   * as int64 for reasons of compatibility across different languages. However, it is a non-negative
   * integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages
   * that support this type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long macCrc32c;

  /**
   * The resource name of the CryptoKeyVersion used for signing. Check this field to verify that the
   * intended resource was used for signing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The ProtectionLevel of the CryptoKeyVersion used for signing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protectionLevel;

  /**
   * Integrity verification field. A flag indicating whether MacSignRequest.data_crc32c was received
   * by KeyManagementService and used for the integrity verification of the data. A false value of
   * this field indicates either that MacSignRequest.data_crc32c was left unset or that it was not
   * delivered to KeyManagementService. If you've set MacSignRequest.data_crc32c but this field is
   * still false, discard the response and perform a limited number of retries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verifiedDataCrc32c;

  /**
   * The created signature.
   * @see #decodeMac()
   * @return value or {@code null} for none
   */
  public java.lang.String getMac() {
    return mac;
  }

  /**
   * The created signature.
   * @see #getMac()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeMac() {
    return com.google.api.client.util.Base64.decodeBase64(mac);
  }

  /**
   * The created signature.
   * @see #encodeMac()
   * @param mac mac or {@code null} for none
   */
  public MacSignResponse setMac(java.lang.String mac) {
    this.mac = mac;
    return this;
  }

  /**
   * The created signature.
   * @see #setMac()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public MacSignResponse encodeMac(byte[] mac) {
    this.mac = com.google.api.client.util.Base64.encodeBase64URLSafeString(mac);
    return this;
  }

  /**
   * Integrity verification field. A CRC32C checksum of the returned MacSignResponse.mac. An
   * integrity check of MacSignResponse.mac can be performed by computing the CRC32C checksum of
   * MacSignResponse.mac and comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A persistent mismatch
   * may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined
   * as int64 for reasons of compatibility across different languages. However, it is a non-negative
   * integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages
   * that support this type.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMacCrc32c() {
    return macCrc32c;
  }

  /**
   * Integrity verification field. A CRC32C checksum of the returned MacSignResponse.mac. An
   * integrity check of MacSignResponse.mac can be performed by computing the CRC32C checksum of
   * MacSignResponse.mac and comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A persistent mismatch
   * may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined
   * as int64 for reasons of compatibility across different languages. However, it is a non-negative
   * integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages
   * that support this type.
   * @param macCrc32c macCrc32c or {@code null} for none
   */
  public MacSignResponse setMacCrc32c(java.lang.Long macCrc32c) {
    this.macCrc32c = macCrc32c;
    return this;
  }

  /**
   * The resource name of the CryptoKeyVersion used for signing. Check this field to verify that the
   * intended resource was used for signing.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the CryptoKeyVersion used for signing. Check this field to verify that the
   * intended resource was used for signing.
   * @param name name or {@code null} for none
   */
  public MacSignResponse setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The ProtectionLevel of the CryptoKeyVersion used for signing.
   * @return value or {@code null} for none
   */
  public java.lang.String getProtectionLevel() {
    return protectionLevel;
  }

  /**
   * The ProtectionLevel of the CryptoKeyVersion used for signing.
   * @param protectionLevel protectionLevel or {@code null} for none
   */
  public MacSignResponse setProtectionLevel(java.lang.String protectionLevel) {
    this.protectionLevel = protectionLevel;
    return this;
  }

  /**
   * Integrity verification field. A flag indicating whether MacSignRequest.data_crc32c was received
   * by KeyManagementService and used for the integrity verification of the data. A false value of
   * this field indicates either that MacSignRequest.data_crc32c was left unset or that it was not
   * delivered to KeyManagementService. If you've set MacSignRequest.data_crc32c but this field is
   * still false, discard the response and perform a limited number of retries.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerifiedDataCrc32c() {
    return verifiedDataCrc32c;
  }

  /**
   * Integrity verification field. A flag indicating whether MacSignRequest.data_crc32c was received
   * by KeyManagementService and used for the integrity verification of the data. A false value of
   * this field indicates either that MacSignRequest.data_crc32c was left unset or that it was not
   * delivered to KeyManagementService. If you've set MacSignRequest.data_crc32c but this field is
   * still false, discard the response and perform a limited number of retries.
   * @param verifiedDataCrc32c verifiedDataCrc32c or {@code null} for none
   */
  public MacSignResponse setVerifiedDataCrc32c(java.lang.Boolean verifiedDataCrc32c) {
    this.verifiedDataCrc32c = verifiedDataCrc32c;
    return this;
  }

  @Override
  public MacSignResponse set(String fieldName, Object value) {
    return (MacSignResponse) super.set(fieldName, value);
  }

  @Override
  public MacSignResponse clone() {
    return (MacSignResponse) super.clone();
  }

}
