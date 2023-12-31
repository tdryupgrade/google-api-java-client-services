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
 * Configuration for signing in users using passkeys.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity Toolkit API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIdentitytoolkitAdminV2PasskeyConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. The website or app origins associated with the customer's sites or apps. Only
   * challenges signed from these origins will be allowed to sign in with passkeys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> expectedOrigins;

  /**
   * Required. The name of the PasskeyConfig resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The relying party ID for the purpose of passkeys verifications. This cannot be
   * changed once created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rpId;

  /**
   * Required. The website or app origins associated with the customer's sites or apps. Only
   * challenges signed from these origins will be allowed to sign in with passkeys.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExpectedOrigins() {
    return expectedOrigins;
  }

  /**
   * Required. The website or app origins associated with the customer's sites or apps. Only
   * challenges signed from these origins will be allowed to sign in with passkeys.
   * @param expectedOrigins expectedOrigins or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitAdminV2PasskeyConfig setExpectedOrigins(java.util.List<java.lang.String> expectedOrigins) {
    this.expectedOrigins = expectedOrigins;
    return this;
  }

  /**
   * Required. The name of the PasskeyConfig resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The name of the PasskeyConfig resource.
   * @param name name or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitAdminV2PasskeyConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The relying party ID for the purpose of passkeys verifications. This cannot be
   * changed once created.
   * @return value or {@code null} for none
   */
  public java.lang.String getRpId() {
    return rpId;
  }

  /**
   * Required. The relying party ID for the purpose of passkeys verifications. This cannot be
   * changed once created.
   * @param rpId rpId or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitAdminV2PasskeyConfig setRpId(java.lang.String rpId) {
    this.rpId = rpId;
    return this;
  }

  @Override
  public GoogleCloudIdentitytoolkitAdminV2PasskeyConfig set(String fieldName, Object value) {
    return (GoogleCloudIdentitytoolkitAdminV2PasskeyConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIdentitytoolkitAdminV2PasskeyConfig clone() {
    return (GoogleCloudIdentitytoolkitAdminV2PasskeyConfig) super.clone();
  }

}
