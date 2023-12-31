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

package com.google.api.services.networkservices.v1.model;

/**
 * Specifies how to select a route rule based on HTTP request headers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpRouteHeaderMatch extends com.google.api.client.json.GenericJson {

  /**
   * The value of the header should match exactly the content of exact_match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String exactMatch;

  /**
   * The name of the HTTP header to match against.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String header;

  /**
   * If specified, the match result will be inverted before checking. Default value is set to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean invertMatch;

  /**
   * The value of the header must start with the contents of prefix_match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String prefixMatch;

  /**
   * A header with header_name must exist. The match takes place whether or not the header has a
   * value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean presentMatch;

  /**
   * If specified, the rule will match if the request header value is within the range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRouteHeaderMatchIntegerRange rangeMatch;

  /**
   * The value of the header must match the regular expression specified in regex_match. For regular
   * expression grammar, please see: https://github.com/google/re2/wiki/Syntax
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regexMatch;

  /**
   * The value of the header must end with the contents of suffix_match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suffixMatch;

  /**
   * The value of the header should match exactly the content of exact_match.
   * @return value or {@code null} for none
   */
  public java.lang.String getExactMatch() {
    return exactMatch;
  }

  /**
   * The value of the header should match exactly the content of exact_match.
   * @param exactMatch exactMatch or {@code null} for none
   */
  public HttpRouteHeaderMatch setExactMatch(java.lang.String exactMatch) {
    this.exactMatch = exactMatch;
    return this;
  }

  /**
   * The name of the HTTP header to match against.
   * @return value or {@code null} for none
   */
  public java.lang.String getHeader() {
    return header;
  }

  /**
   * The name of the HTTP header to match against.
   * @param header header or {@code null} for none
   */
  public HttpRouteHeaderMatch setHeader(java.lang.String header) {
    this.header = header;
    return this;
  }

  /**
   * If specified, the match result will be inverted before checking. Default value is set to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInvertMatch() {
    return invertMatch;
  }

  /**
   * If specified, the match result will be inverted before checking. Default value is set to false.
   * @param invertMatch invertMatch or {@code null} for none
   */
  public HttpRouteHeaderMatch setInvertMatch(java.lang.Boolean invertMatch) {
    this.invertMatch = invertMatch;
    return this;
  }

  /**
   * The value of the header must start with the contents of prefix_match.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrefixMatch() {
    return prefixMatch;
  }

  /**
   * The value of the header must start with the contents of prefix_match.
   * @param prefixMatch prefixMatch or {@code null} for none
   */
  public HttpRouteHeaderMatch setPrefixMatch(java.lang.String prefixMatch) {
    this.prefixMatch = prefixMatch;
    return this;
  }

  /**
   * A header with header_name must exist. The match takes place whether or not the header has a
   * value.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPresentMatch() {
    return presentMatch;
  }

  /**
   * A header with header_name must exist. The match takes place whether or not the header has a
   * value.
   * @param presentMatch presentMatch or {@code null} for none
   */
  public HttpRouteHeaderMatch setPresentMatch(java.lang.Boolean presentMatch) {
    this.presentMatch = presentMatch;
    return this;
  }

  /**
   * If specified, the rule will match if the request header value is within the range.
   * @return value or {@code null} for none
   */
  public HttpRouteHeaderMatchIntegerRange getRangeMatch() {
    return rangeMatch;
  }

  /**
   * If specified, the rule will match if the request header value is within the range.
   * @param rangeMatch rangeMatch or {@code null} for none
   */
  public HttpRouteHeaderMatch setRangeMatch(HttpRouteHeaderMatchIntegerRange rangeMatch) {
    this.rangeMatch = rangeMatch;
    return this;
  }

  /**
   * The value of the header must match the regular expression specified in regex_match. For regular
   * expression grammar, please see: https://github.com/google/re2/wiki/Syntax
   * @return value or {@code null} for none
   */
  public java.lang.String getRegexMatch() {
    return regexMatch;
  }

  /**
   * The value of the header must match the regular expression specified in regex_match. For regular
   * expression grammar, please see: https://github.com/google/re2/wiki/Syntax
   * @param regexMatch regexMatch or {@code null} for none
   */
  public HttpRouteHeaderMatch setRegexMatch(java.lang.String regexMatch) {
    this.regexMatch = regexMatch;
    return this;
  }

  /**
   * The value of the header must end with the contents of suffix_match.
   * @return value or {@code null} for none
   */
  public java.lang.String getSuffixMatch() {
    return suffixMatch;
  }

  /**
   * The value of the header must end with the contents of suffix_match.
   * @param suffixMatch suffixMatch or {@code null} for none
   */
  public HttpRouteHeaderMatch setSuffixMatch(java.lang.String suffixMatch) {
    this.suffixMatch = suffixMatch;
    return this;
  }

  @Override
  public HttpRouteHeaderMatch set(String fieldName, Object value) {
    return (HttpRouteHeaderMatch) super.set(fieldName, value);
  }

  @Override
  public HttpRouteHeaderMatch clone() {
    return (HttpRouteHeaderMatch) super.clone();
  }

}
