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

package com.google.api.services.identitytoolkit.v1.model;

/**
 * The parameters for Argon2 hashing algorithm.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity Toolkit API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIdentitytoolkitV1Argon2Parameters extends com.google.api.client.json.GenericJson {

  /**
   * The additional associated data, if provided, is appended to the hash value to provide an
   * additional layer of security. A base64-encoded string if specified via JSON.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String associatedData;

  /**
   * Required. The desired hash length in bytes. Minimum is 4 and maximum is 1024.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer hashLengthBytes;

  /**
   * Required. Must not be HASH_TYPE_UNSPECIFIED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hashType;

  /**
   * Required. The number of iterations to perform. Minimum is 1, maximum is 16.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer iterations;

  /**
   * Required. The memory cost in kibibytes. Maximum is 32768.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memoryCostKib;

  /**
   * Required. The degree of parallelism, also called threads or lanes. Minimum is 1, maximum is 16.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer parallelism;

  /**
   * The version of the Argon2 algorithm. This defaults to VERSION_13 if not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * The additional associated data, if provided, is appended to the hash value to provide an
   * additional layer of security. A base64-encoded string if specified via JSON.
   * @see #decodeAssociatedData()
   * @return value or {@code null} for none
   */
  public java.lang.String getAssociatedData() {
    return associatedData;
  }

  /**
   * The additional associated data, if provided, is appended to the hash value to provide an
   * additional layer of security. A base64-encoded string if specified via JSON.
   * @see #getAssociatedData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeAssociatedData() {
    return com.google.api.client.util.Base64.decodeBase64(associatedData);
  }

  /**
   * The additional associated data, if provided, is appended to the hash value to provide an
   * additional layer of security. A base64-encoded string if specified via JSON.
   * @see #encodeAssociatedData()
   * @param associatedData associatedData or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1Argon2Parameters setAssociatedData(java.lang.String associatedData) {
    this.associatedData = associatedData;
    return this;
  }

  /**
   * The additional associated data, if provided, is appended to the hash value to provide an
   * additional layer of security. A base64-encoded string if specified via JSON.
   * @see #setAssociatedData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudIdentitytoolkitV1Argon2Parameters encodeAssociatedData(byte[] associatedData) {
    this.associatedData = com.google.api.client.util.Base64.encodeBase64URLSafeString(associatedData);
    return this;
  }

  /**
   * Required. The desired hash length in bytes. Minimum is 4 and maximum is 1024.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHashLengthBytes() {
    return hashLengthBytes;
  }

  /**
   * Required. The desired hash length in bytes. Minimum is 4 and maximum is 1024.
   * @param hashLengthBytes hashLengthBytes or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1Argon2Parameters setHashLengthBytes(java.lang.Integer hashLengthBytes) {
    this.hashLengthBytes = hashLengthBytes;
    return this;
  }

  /**
   * Required. Must not be HASH_TYPE_UNSPECIFIED.
   * @return value or {@code null} for none
   */
  public java.lang.String getHashType() {
    return hashType;
  }

  /**
   * Required. Must not be HASH_TYPE_UNSPECIFIED.
   * @param hashType hashType or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1Argon2Parameters setHashType(java.lang.String hashType) {
    this.hashType = hashType;
    return this;
  }

  /**
   * Required. The number of iterations to perform. Minimum is 1, maximum is 16.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIterations() {
    return iterations;
  }

  /**
   * Required. The number of iterations to perform. Minimum is 1, maximum is 16.
   * @param iterations iterations or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1Argon2Parameters setIterations(java.lang.Integer iterations) {
    this.iterations = iterations;
    return this;
  }

  /**
   * Required. The memory cost in kibibytes. Maximum is 32768.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemoryCostKib() {
    return memoryCostKib;
  }

  /**
   * Required. The memory cost in kibibytes. Maximum is 32768.
   * @param memoryCostKib memoryCostKib or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1Argon2Parameters setMemoryCostKib(java.lang.Integer memoryCostKib) {
    this.memoryCostKib = memoryCostKib;
    return this;
  }

  /**
   * Required. The degree of parallelism, also called threads or lanes. Minimum is 1, maximum is 16.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getParallelism() {
    return parallelism;
  }

  /**
   * Required. The degree of parallelism, also called threads or lanes. Minimum is 1, maximum is 16.
   * @param parallelism parallelism or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1Argon2Parameters setParallelism(java.lang.Integer parallelism) {
    this.parallelism = parallelism;
    return this;
  }

  /**
   * The version of the Argon2 algorithm. This defaults to VERSION_13 if not specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The version of the Argon2 algorithm. This defaults to VERSION_13 if not specified.
   * @param version version or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1Argon2Parameters setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public GoogleCloudIdentitytoolkitV1Argon2Parameters set(String fieldName, Object value) {
    return (GoogleCloudIdentitytoolkitV1Argon2Parameters) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIdentitytoolkitV1Argon2Parameters clone() {
    return (GoogleCloudIdentitytoolkitV1Argon2Parameters) super.clone();
  }

}
