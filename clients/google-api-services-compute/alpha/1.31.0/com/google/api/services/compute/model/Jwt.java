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

package com.google.api.services.compute.model;

/**
 * [Deprecated] JWT configuration for origin authentication. JWT configuration for origin
 * authentication.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Jwt extends com.google.api.client.json.GenericJson {

  /**
   * A JWT containing any of these audiences will be accepted. The service name will be accepted if
   * audiences is empty. Examples: bookstore_android.apps.googleusercontent.com,
   * bookstore_web.apps.googleusercontent.com
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> audiences;

  /**
   * Identifies the issuer that issued the JWT, which is usually a URL or an email address.
   * Examples: https://securetoken.google.com, 1234567-compute@developer.gserviceaccount.com
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String issuer;

  /**
   * The provider's public key set to validate the signature of the JWT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jwksPublicKeys;

  /**
   * jwt_headers and jwt_params define where to extract the JWT from an HTTP request. If no explicit
   * location is specified, the following default locations are tried in order: 1. The Authorization
   * header using the Bearer schema. See `here `_. Example: Authorization: Bearer . 2.
   * `access_token` query parameter. See `this `_ Multiple JWTs can be verified for a request. Each
   * JWT has to be extracted from the locations its issuer specified or from the default locations.
   * This field is set if JWT is sent in a request header. This field specifies the header name. For
   * example, if `header=x-goog-iap-jwt-assertion`, the header format will be x-goog-iap-jwt-
   * assertion: .
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<JwtHeader> jwtHeaders;

  /**
   * This field is set if JWT is sent in a query parameter. This field specifies the query parameter
   * name. For example, if jwt_params[0] is jwt_token, the JWT format in the query parameter is
   * /path?jwt_token=.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> jwtParams;

  /**
   * A JWT containing any of these audiences will be accepted. The service name will be accepted if
   * audiences is empty. Examples: bookstore_android.apps.googleusercontent.com,
   * bookstore_web.apps.googleusercontent.com
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAudiences() {
    return audiences;
  }

  /**
   * A JWT containing any of these audiences will be accepted. The service name will be accepted if
   * audiences is empty. Examples: bookstore_android.apps.googleusercontent.com,
   * bookstore_web.apps.googleusercontent.com
   * @param audiences audiences or {@code null} for none
   */
  public Jwt setAudiences(java.util.List<java.lang.String> audiences) {
    this.audiences = audiences;
    return this;
  }

  /**
   * Identifies the issuer that issued the JWT, which is usually a URL or an email address.
   * Examples: https://securetoken.google.com, 1234567-compute@developer.gserviceaccount.com
   * @return value or {@code null} for none
   */
  public java.lang.String getIssuer() {
    return issuer;
  }

  /**
   * Identifies the issuer that issued the JWT, which is usually a URL or an email address.
   * Examples: https://securetoken.google.com, 1234567-compute@developer.gserviceaccount.com
   * @param issuer issuer or {@code null} for none
   */
  public Jwt setIssuer(java.lang.String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * The provider's public key set to validate the signature of the JWT.
   * @return value or {@code null} for none
   */
  public java.lang.String getJwksPublicKeys() {
    return jwksPublicKeys;
  }

  /**
   * The provider's public key set to validate the signature of the JWT.
   * @param jwksPublicKeys jwksPublicKeys or {@code null} for none
   */
  public Jwt setJwksPublicKeys(java.lang.String jwksPublicKeys) {
    this.jwksPublicKeys = jwksPublicKeys;
    return this;
  }

  /**
   * jwt_headers and jwt_params define where to extract the JWT from an HTTP request. If no explicit
   * location is specified, the following default locations are tried in order: 1. The Authorization
   * header using the Bearer schema. See `here `_. Example: Authorization: Bearer . 2.
   * `access_token` query parameter. See `this `_ Multiple JWTs can be verified for a request. Each
   * JWT has to be extracted from the locations its issuer specified or from the default locations.
   * This field is set if JWT is sent in a request header. This field specifies the header name. For
   * example, if `header=x-goog-iap-jwt-assertion`, the header format will be x-goog-iap-jwt-
   * assertion: .
   * @return value or {@code null} for none
   */
  public java.util.List<JwtHeader> getJwtHeaders() {
    return jwtHeaders;
  }

  /**
   * jwt_headers and jwt_params define where to extract the JWT from an HTTP request. If no explicit
   * location is specified, the following default locations are tried in order: 1. The Authorization
   * header using the Bearer schema. See `here `_. Example: Authorization: Bearer . 2.
   * `access_token` query parameter. See `this `_ Multiple JWTs can be verified for a request. Each
   * JWT has to be extracted from the locations its issuer specified or from the default locations.
   * This field is set if JWT is sent in a request header. This field specifies the header name. For
   * example, if `header=x-goog-iap-jwt-assertion`, the header format will be x-goog-iap-jwt-
   * assertion: .
   * @param jwtHeaders jwtHeaders or {@code null} for none
   */
  public Jwt setJwtHeaders(java.util.List<JwtHeader> jwtHeaders) {
    this.jwtHeaders = jwtHeaders;
    return this;
  }

  /**
   * This field is set if JWT is sent in a query parameter. This field specifies the query parameter
   * name. For example, if jwt_params[0] is jwt_token, the JWT format in the query parameter is
   * /path?jwt_token=.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getJwtParams() {
    return jwtParams;
  }

  /**
   * This field is set if JWT is sent in a query parameter. This field specifies the query parameter
   * name. For example, if jwt_params[0] is jwt_token, the JWT format in the query parameter is
   * /path?jwt_token=.
   * @param jwtParams jwtParams or {@code null} for none
   */
  public Jwt setJwtParams(java.util.List<java.lang.String> jwtParams) {
    this.jwtParams = jwtParams;
    return this;
  }

  @Override
  public Jwt set(String fieldName, Object value) {
    return (Jwt) super.set(fieldName, value);
  }

  @Override
  public Jwt clone() {
    return (Jwt) super.clone();
  }

}
