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

package com.google.api.services.chromemanagement.v1.model;

/**
 * Memory encryption information of a device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromeManagementV1TotalMemoryEncryptionInfo extends com.google.api.client.json.GenericJson {

  /**
   * Memory encryption algorithm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encryptionAlgorithm;

  /**
   * The state of memory encryption on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encryptionState;

  /**
   * The length of the encryption keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long keyLength;

  /**
   * The maximum number of keys that can be used for encryption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxKeys;

  /**
   * Memory encryption algorithm.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncryptionAlgorithm() {
    return encryptionAlgorithm;
  }

  /**
   * Memory encryption algorithm.
   * @param encryptionAlgorithm encryptionAlgorithm or {@code null} for none
   */
  public GoogleChromeManagementV1TotalMemoryEncryptionInfo setEncryptionAlgorithm(java.lang.String encryptionAlgorithm) {
    this.encryptionAlgorithm = encryptionAlgorithm;
    return this;
  }

  /**
   * The state of memory encryption on the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncryptionState() {
    return encryptionState;
  }

  /**
   * The state of memory encryption on the device.
   * @param encryptionState encryptionState or {@code null} for none
   */
  public GoogleChromeManagementV1TotalMemoryEncryptionInfo setEncryptionState(java.lang.String encryptionState) {
    this.encryptionState = encryptionState;
    return this;
  }

  /**
   * The length of the encryption keys.
   * @return value or {@code null} for none
   */
  public java.lang.Long getKeyLength() {
    return keyLength;
  }

  /**
   * The length of the encryption keys.
   * @param keyLength keyLength or {@code null} for none
   */
  public GoogleChromeManagementV1TotalMemoryEncryptionInfo setKeyLength(java.lang.Long keyLength) {
    this.keyLength = keyLength;
    return this;
  }

  /**
   * The maximum number of keys that can be used for encryption.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxKeys() {
    return maxKeys;
  }

  /**
   * The maximum number of keys that can be used for encryption.
   * @param maxKeys maxKeys or {@code null} for none
   */
  public GoogleChromeManagementV1TotalMemoryEncryptionInfo setMaxKeys(java.lang.Long maxKeys) {
    this.maxKeys = maxKeys;
    return this;
  }

  @Override
  public GoogleChromeManagementV1TotalMemoryEncryptionInfo set(String fieldName, Object value) {
    return (GoogleChromeManagementV1TotalMemoryEncryptionInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1TotalMemoryEncryptionInfo clone() {
    return (GoogleChromeManagementV1TotalMemoryEncryptionInfo) super.clone();
  }

}
