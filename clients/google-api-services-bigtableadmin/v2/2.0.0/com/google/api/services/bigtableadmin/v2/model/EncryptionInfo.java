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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Encryption information for a given resource. If this resource is protected with customer managed
 * encryption, the in-use Cloud Key Management Service (Cloud KMS) key version is specified along
 * with its status.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EncryptionInfo extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The status of encrypt/decrypt calls on underlying data for this resource.
   * Regardless of status, the existing data is always encrypted at rest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status encryptionStatus;

  /**
   * Output only. The type of encryption used to protect this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encryptionType;

  /**
   * Output only. The version of the Cloud KMS key specified in the parent cluster that is in use
   * for the data underlying this table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyVersion;

  /**
   * Output only. The status of encrypt/decrypt calls on underlying data for this resource.
   * Regardless of status, the existing data is always encrypted at rest.
   * @return value or {@code null} for none
   */
  public Status getEncryptionStatus() {
    return encryptionStatus;
  }

  /**
   * Output only. The status of encrypt/decrypt calls on underlying data for this resource.
   * Regardless of status, the existing data is always encrypted at rest.
   * @param encryptionStatus encryptionStatus or {@code null} for none
   */
  public EncryptionInfo setEncryptionStatus(Status encryptionStatus) {
    this.encryptionStatus = encryptionStatus;
    return this;
  }

  /**
   * Output only. The type of encryption used to protect this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncryptionType() {
    return encryptionType;
  }

  /**
   * Output only. The type of encryption used to protect this resource.
   * @param encryptionType encryptionType or {@code null} for none
   */
  public EncryptionInfo setEncryptionType(java.lang.String encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

  /**
   * Output only. The version of the Cloud KMS key specified in the parent cluster that is in use
   * for the data underlying this table.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyVersion() {
    return kmsKeyVersion;
  }

  /**
   * Output only. The version of the Cloud KMS key specified in the parent cluster that is in use
   * for the data underlying this table.
   * @param kmsKeyVersion kmsKeyVersion or {@code null} for none
   */
  public EncryptionInfo setKmsKeyVersion(java.lang.String kmsKeyVersion) {
    this.kmsKeyVersion = kmsKeyVersion;
    return this;
  }

  @Override
  public EncryptionInfo set(String fieldName, Object value) {
    return (EncryptionInfo) super.set(fieldName, value);
  }

  @Override
  public EncryptionInfo clone() {
    return (EncryptionInfo) super.clone();
  }

}
