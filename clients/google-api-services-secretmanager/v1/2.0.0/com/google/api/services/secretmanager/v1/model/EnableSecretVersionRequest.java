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

package com.google.api.services.secretmanager.v1.model;

/**
 * Request message for SecretManagerService.EnableSecretVersion.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Secret Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnableSecretVersionRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Etag of the SecretVersion. The request succeeds if it matches the etag of the
   * currently stored secret version object. If the etag is omitted, the request succeeds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Optional. Etag of the SecretVersion. The request succeeds if it matches the etag of the
   * currently stored secret version object. If the etag is omitted, the request succeeds.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Optional. Etag of the SecretVersion. The request succeeds if it matches the etag of the
   * currently stored secret version object. If the etag is omitted, the request succeeds.
   * @param etag etag or {@code null} for none
   */
  public EnableSecretVersionRequest setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  @Override
  public EnableSecretVersionRequest set(String fieldName, Object value) {
    return (EnableSecretVersionRequest) super.set(fieldName, value);
  }

  @Override
  public EnableSecretVersionRequest clone() {
    return (EnableSecretVersionRequest) super.clone();
  }

}
