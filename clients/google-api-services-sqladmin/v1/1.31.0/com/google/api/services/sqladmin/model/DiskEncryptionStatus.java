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

package com.google.api.services.sqladmin.model;

/**
 * Disk encryption status for an instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DiskEncryptionStatus extends com.google.api.client.json.GenericJson {

  /**
   * This is always **sql#diskEncryptionStatus**.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * KMS key version used to encrypt the Cloud SQL instance resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyVersionName;

  /**
   * This is always **sql#diskEncryptionStatus**.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always **sql#diskEncryptionStatus**.
   * @param kind kind or {@code null} for none
   */
  public DiskEncryptionStatus setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * KMS key version used to encrypt the Cloud SQL instance resource
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyVersionName() {
    return kmsKeyVersionName;
  }

  /**
   * KMS key version used to encrypt the Cloud SQL instance resource
   * @param kmsKeyVersionName kmsKeyVersionName or {@code null} for none
   */
  public DiskEncryptionStatus setKmsKeyVersionName(java.lang.String kmsKeyVersionName) {
    this.kmsKeyVersionName = kmsKeyVersionName;
    return this;
  }

  @Override
  public DiskEncryptionStatus set(String fieldName, Object value) {
    return (DiskEncryptionStatus) super.set(fieldName, value);
  }

  @Override
  public DiskEncryptionStatus clone() {
    return (DiskEncryptionStatus) super.clone();
  }

}
