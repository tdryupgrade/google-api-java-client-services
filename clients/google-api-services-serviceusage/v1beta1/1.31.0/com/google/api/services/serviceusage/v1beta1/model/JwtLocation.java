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

package com.google.api.services.serviceusage.v1beta1.model;

/**
 * Specifies a location to extract JWT from an API request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JwtLocation extends com.google.api.client.json.GenericJson {

  /**
   * Specifies cookie name to extract JWT token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cookie;

  /**
   * Specifies HTTP header name to extract JWT token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String header;

  /**
   * Specifies URL query parameter name to extract JWT token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * The value prefix. The value format is "value_prefix{token}" Only applies to "in" header type.
   * Must be empty for "in" query type. If not empty, the header value has to match (case sensitive)
   * this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after
   * the prefix is removed. For example, for "Authorization: Bearer {JWT}", value_prefix="Bearer "
   * with a space at the end.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valuePrefix;

  /**
   * Specifies cookie name to extract JWT token.
   * @return value or {@code null} for none
   */
  public java.lang.String getCookie() {
    return cookie;
  }

  /**
   * Specifies cookie name to extract JWT token.
   * @param cookie cookie or {@code null} for none
   */
  public JwtLocation setCookie(java.lang.String cookie) {
    this.cookie = cookie;
    return this;
  }

  /**
   * Specifies HTTP header name to extract JWT token.
   * @return value or {@code null} for none
   */
  public java.lang.String getHeader() {
    return header;
  }

  /**
   * Specifies HTTP header name to extract JWT token.
   * @param header header or {@code null} for none
   */
  public JwtLocation setHeader(java.lang.String header) {
    this.header = header;
    return this;
  }

  /**
   * Specifies URL query parameter name to extract JWT token.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Specifies URL query parameter name to extract JWT token.
   * @param query query or {@code null} for none
   */
  public JwtLocation setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * The value prefix. The value format is "value_prefix{token}" Only applies to "in" header type.
   * Must be empty for "in" query type. If not empty, the header value has to match (case sensitive)
   * this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after
   * the prefix is removed. For example, for "Authorization: Bearer {JWT}", value_prefix="Bearer "
   * with a space at the end.
   * @return value or {@code null} for none
   */
  public java.lang.String getValuePrefix() {
    return valuePrefix;
  }

  /**
   * The value prefix. The value format is "value_prefix{token}" Only applies to "in" header type.
   * Must be empty for "in" query type. If not empty, the header value has to match (case sensitive)
   * this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after
   * the prefix is removed. For example, for "Authorization: Bearer {JWT}", value_prefix="Bearer "
   * with a space at the end.
   * @param valuePrefix valuePrefix or {@code null} for none
   */
  public JwtLocation setValuePrefix(java.lang.String valuePrefix) {
    this.valuePrefix = valuePrefix;
    return this;
  }

  @Override
  public JwtLocation set(String fieldName, Object value) {
    return (JwtLocation) super.set(fieldName, value);
  }

  @Override
  public JwtLocation clone() {
    return (JwtLocation) super.clone();
  }

}
