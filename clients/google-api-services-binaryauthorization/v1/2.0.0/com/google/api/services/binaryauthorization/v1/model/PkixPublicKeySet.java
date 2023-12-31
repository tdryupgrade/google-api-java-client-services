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

package com.google.api.services.binaryauthorization.v1.model;

/**
 * A bundle of PKIX public keys, used to authenticate attestation signatures. Generally, a signature
 * is considered to be authenticated by a `PkixPublicKeySet` if any of the public keys verify it
 * (i.e. it is an "OR" of the keys).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Binary Authorization API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PkixPublicKeySet extends com.google.api.client.json.GenericJson {

  /**
   * Required. `pkix_public_keys` must have at least one entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PkixPublicKey> pkixPublicKeys;

  static {
    // hack to force ProGuard to consider PkixPublicKey used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PkixPublicKey.class);
  }

  /**
   * Required. `pkix_public_keys` must have at least one entry.
   * @return value or {@code null} for none
   */
  public java.util.List<PkixPublicKey> getPkixPublicKeys() {
    return pkixPublicKeys;
  }

  /**
   * Required. `pkix_public_keys` must have at least one entry.
   * @param pkixPublicKeys pkixPublicKeys or {@code null} for none
   */
  public PkixPublicKeySet setPkixPublicKeys(java.util.List<PkixPublicKey> pkixPublicKeys) {
    this.pkixPublicKeys = pkixPublicKeys;
    return this;
  }

  @Override
  public PkixPublicKeySet set(String fieldName, Object value) {
    return (PkixPublicKeySet) super.set(fieldName, value);
  }

  @Override
  public PkixPublicKeySet clone() {
    return (PkixPublicKeySet) super.clone();
  }

}
