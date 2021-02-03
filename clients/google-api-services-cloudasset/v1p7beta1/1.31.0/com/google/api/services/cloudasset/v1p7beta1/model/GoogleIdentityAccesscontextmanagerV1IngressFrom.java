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

package com.google.api.services.cloudasset.v1p7beta1.model;

/**
 * Defines the conditions under which an IngressPolicy matches a request. Conditions are based on
 * information about the source of the request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleIdentityAccesscontextmanagerV1IngressFrom extends com.google.api.client.json.GenericJson {

  /**
   * A list of identities that are allowed access through this ingress policy. Should be in the
   * format of email address. The email address should represent individual user or service account
   * only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> identities;

  /**
   * Specifies the type of identities that are allowed access from outside the perimeter. If left
   * unspecified, then members of `identities` field will be allowed access.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String identityType;

  /**
   * Sources that this IngressPolicy authorizes access from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleIdentityAccesscontextmanagerV1IngressSource> sources;

  /**
   * A list of identities that are allowed access through this ingress policy. Should be in the
   * format of email address. The email address should represent individual user or service account
   * only.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIdentities() {
    return identities;
  }

  /**
   * A list of identities that are allowed access through this ingress policy. Should be in the
   * format of email address. The email address should represent individual user or service account
   * only.
   * @param identities identities or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1IngressFrom setIdentities(java.util.List<java.lang.String> identities) {
    this.identities = identities;
    return this;
  }

  /**
   * Specifies the type of identities that are allowed access from outside the perimeter. If left
   * unspecified, then members of `identities` field will be allowed access.
   * @return value or {@code null} for none
   */
  public java.lang.String getIdentityType() {
    return identityType;
  }

  /**
   * Specifies the type of identities that are allowed access from outside the perimeter. If left
   * unspecified, then members of `identities` field will be allowed access.
   * @param identityType identityType or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1IngressFrom setIdentityType(java.lang.String identityType) {
    this.identityType = identityType;
    return this;
  }

  /**
   * Sources that this IngressPolicy authorizes access from.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleIdentityAccesscontextmanagerV1IngressSource> getSources() {
    return sources;
  }

  /**
   * Sources that this IngressPolicy authorizes access from.
   * @param sources sources or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1IngressFrom setSources(java.util.List<GoogleIdentityAccesscontextmanagerV1IngressSource> sources) {
    this.sources = sources;
    return this;
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1IngressFrom set(String fieldName, Object value) {
    return (GoogleIdentityAccesscontextmanagerV1IngressFrom) super.set(fieldName, value);
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1IngressFrom clone() {
    return (GoogleIdentityAccesscontextmanagerV1IngressFrom) super.clone();
  }

}
