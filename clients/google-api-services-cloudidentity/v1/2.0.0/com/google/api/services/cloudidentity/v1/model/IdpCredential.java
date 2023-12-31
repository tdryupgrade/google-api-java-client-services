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

package com.google.api.services.cloudidentity.v1.model;

/**
 * Credential for verifying signatures produced by the Identity Provider.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IdpCredential extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Information of a DSA public key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DsaPublicKeyInfo dsaKeyInfo;

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the
   * credential.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Information of a RSA public key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RsaPublicKeyInfo rsaKeyInfo;

  /**
   * Output only. Time when the `IdpCredential` was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Information of a DSA public key.
   * @return value or {@code null} for none
   */
  public DsaPublicKeyInfo getDsaKeyInfo() {
    return dsaKeyInfo;
  }

  /**
   * Output only. Information of a DSA public key.
   * @param dsaKeyInfo dsaKeyInfo or {@code null} for none
   */
  public IdpCredential setDsaKeyInfo(DsaPublicKeyInfo dsaKeyInfo) {
    this.dsaKeyInfo = dsaKeyInfo;
    return this;
  }

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the
   * credential.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the
   * credential.
   * @param name name or {@code null} for none
   */
  public IdpCredential setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Information of a RSA public key.
   * @return value or {@code null} for none
   */
  public RsaPublicKeyInfo getRsaKeyInfo() {
    return rsaKeyInfo;
  }

  /**
   * Output only. Information of a RSA public key.
   * @param rsaKeyInfo rsaKeyInfo or {@code null} for none
   */
  public IdpCredential setRsaKeyInfo(RsaPublicKeyInfo rsaKeyInfo) {
    this.rsaKeyInfo = rsaKeyInfo;
    return this;
  }

  /**
   * Output only. Time when the `IdpCredential` was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time when the `IdpCredential` was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public IdpCredential setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public IdpCredential set(String fieldName, Object value) {
    return (IdpCredential) super.set(fieldName, value);
  }

  @Override
  public IdpCredential clone() {
    return (IdpCredential) super.clone();
  }

}
