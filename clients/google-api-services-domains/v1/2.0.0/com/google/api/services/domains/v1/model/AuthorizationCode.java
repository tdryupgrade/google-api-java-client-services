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

package com.google.api.services.domains.v1.model;

/**
 * Defines an authorization code.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Domains API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuthorizationCode extends com.google.api.client.json.GenericJson {

  /**
   * The Authorization Code in ASCII. It can be used to transfer the domain to or from another
   * registrar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * The Authorization Code in ASCII. It can be used to transfer the domain to or from another
   * registrar.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * The Authorization Code in ASCII. It can be used to transfer the domain to or from another
   * registrar.
   * @param code code or {@code null} for none
   */
  public AuthorizationCode setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  @Override
  public AuthorizationCode set(String fieldName, Object value) {
    return (AuthorizationCode) super.set(fieldName, value);
  }

  @Override
  public AuthorizationCode clone() {
    return (AuthorizationCode) super.clone();
  }

}
