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
 * The specification for allowing client-side cross-origin requests. For more information about the
 * W3C recommendation for cross-origin resource sharing (CORS), see Fetch API Living Standard.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CorsPolicy extends com.google.api.client.json.GenericJson {

  /**
   * In response to a preflight request, setting this to true indicates that the actual request can
   * include user credentials. This field translates to the Access-Control-Allow-Credentials header.
   * Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowCredentials;

  /**
   * Specifies the content for the Access-Control-Allow-Headers header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowHeaders;

  /**
   * Specifies the content for the Access-Control-Allow-Methods header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowMethods;

  /**
   * Specifies a regular expression that matches allowed origins. For more information about the
   * regular expression syntax, see Syntax. An origin is allowed if it matches either an item in
   * allowOrigins or an item in allowOriginRegexes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowOriginRegexes;

  /**
   * Specifies the list of origins that is allowed to do CORS requests. An origin is allowed if it
   * matches either an item in allowOrigins or an item in allowOriginRegexes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowOrigins;

  /**
   * If true, the setting specifies the CORS policy is disabled. The default value of false, which
   * indicates that the CORS policy is in effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disabled;

  /**
   * Specifies the content for the Access-Control-Expose-Headers header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> exposeHeaders;

  /**
   * Specifies how long results of a preflight request can be cached in seconds. This field
   * translates to the Access-Control-Max-Age header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxAge;

  /**
   * In response to a preflight request, setting this to true indicates that the actual request can
   * include user credentials. This field translates to the Access-Control-Allow-Credentials header.
   * Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowCredentials() {
    return allowCredentials;
  }

  /**
   * In response to a preflight request, setting this to true indicates that the actual request can
   * include user credentials. This field translates to the Access-Control-Allow-Credentials header.
   * Default is false.
   * @param allowCredentials allowCredentials or {@code null} for none
   */
  public CorsPolicy setAllowCredentials(java.lang.Boolean allowCredentials) {
    this.allowCredentials = allowCredentials;
    return this;
  }

  /**
   * Specifies the content for the Access-Control-Allow-Headers header.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowHeaders() {
    return allowHeaders;
  }

  /**
   * Specifies the content for the Access-Control-Allow-Headers header.
   * @param allowHeaders allowHeaders or {@code null} for none
   */
  public CorsPolicy setAllowHeaders(java.util.List<java.lang.String> allowHeaders) {
    this.allowHeaders = allowHeaders;
    return this;
  }

  /**
   * Specifies the content for the Access-Control-Allow-Methods header.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowMethods() {
    return allowMethods;
  }

  /**
   * Specifies the content for the Access-Control-Allow-Methods header.
   * @param allowMethods allowMethods or {@code null} for none
   */
  public CorsPolicy setAllowMethods(java.util.List<java.lang.String> allowMethods) {
    this.allowMethods = allowMethods;
    return this;
  }

  /**
   * Specifies a regular expression that matches allowed origins. For more information about the
   * regular expression syntax, see Syntax. An origin is allowed if it matches either an item in
   * allowOrigins or an item in allowOriginRegexes.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowOriginRegexes() {
    return allowOriginRegexes;
  }

  /**
   * Specifies a regular expression that matches allowed origins. For more information about the
   * regular expression syntax, see Syntax. An origin is allowed if it matches either an item in
   * allowOrigins or an item in allowOriginRegexes.
   * @param allowOriginRegexes allowOriginRegexes or {@code null} for none
   */
  public CorsPolicy setAllowOriginRegexes(java.util.List<java.lang.String> allowOriginRegexes) {
    this.allowOriginRegexes = allowOriginRegexes;
    return this;
  }

  /**
   * Specifies the list of origins that is allowed to do CORS requests. An origin is allowed if it
   * matches either an item in allowOrigins or an item in allowOriginRegexes.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowOrigins() {
    return allowOrigins;
  }

  /**
   * Specifies the list of origins that is allowed to do CORS requests. An origin is allowed if it
   * matches either an item in allowOrigins or an item in allowOriginRegexes.
   * @param allowOrigins allowOrigins or {@code null} for none
   */
  public CorsPolicy setAllowOrigins(java.util.List<java.lang.String> allowOrigins) {
    this.allowOrigins = allowOrigins;
    return this;
  }

  /**
   * If true, the setting specifies the CORS policy is disabled. The default value of false, which
   * indicates that the CORS policy is in effect.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisabled() {
    return disabled;
  }

  /**
   * If true, the setting specifies the CORS policy is disabled. The default value of false, which
   * indicates that the CORS policy is in effect.
   * @param disabled disabled or {@code null} for none
   */
  public CorsPolicy setDisabled(java.lang.Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Specifies the content for the Access-Control-Expose-Headers header.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExposeHeaders() {
    return exposeHeaders;
  }

  /**
   * Specifies the content for the Access-Control-Expose-Headers header.
   * @param exposeHeaders exposeHeaders or {@code null} for none
   */
  public CorsPolicy setExposeHeaders(java.util.List<java.lang.String> exposeHeaders) {
    this.exposeHeaders = exposeHeaders;
    return this;
  }

  /**
   * Specifies how long results of a preflight request can be cached in seconds. This field
   * translates to the Access-Control-Max-Age header.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxAge() {
    return maxAge;
  }

  /**
   * Specifies how long results of a preflight request can be cached in seconds. This field
   * translates to the Access-Control-Max-Age header.
   * @param maxAge maxAge or {@code null} for none
   */
  public CorsPolicy setMaxAge(java.lang.Integer maxAge) {
    this.maxAge = maxAge;
    return this;
  }

  @Override
  public CorsPolicy set(String fieldName, Object value) {
    return (CorsPolicy) super.set(fieldName, value);
  }

  @Override
  public CorsPolicy clone() {
    return (CorsPolicy) super.clone();
  }

}
