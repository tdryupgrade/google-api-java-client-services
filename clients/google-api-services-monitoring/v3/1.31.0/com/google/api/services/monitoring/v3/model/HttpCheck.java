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

package com.google.api.services.monitoring.v3.model;

/**
 * Information involved in an HTTP/HTTPS Uptime check request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpCheck extends com.google.api.client.json.GenericJson {

  /**
   * The authentication information. Optional when creating an HTTP check; defaults to empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BasicAuthentication authInfo;

  /**
   * The request body associated with the HTTP POST request. If content_type is URL_ENCODED, the
   * body passed in must be URL-encoded. Users can provide a Content-Length header via the headers
   * field or the API will do so. If the request_method is GET and body is not empty, the API will
   * return an error. The maximum byte size is 1 megabyte. Note: As with all bytes fields, JSON
   * representations are base64 encoded. e.g.: "foo=bar" in URL-encoded form is "foo%3Dbar" and in
   * base64 encoding is "Zm9vJTI1M0RiYXI=".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String body;

  /**
   * The content type header to use for the check. The following configurations result in errors: 1.
   * Content type is specified in both the headers field and the content_type field. 2. Request
   * method is GET and content_type is not TYPE_UNSPECIFIED 3. Request method is POST and
   * content_type is TYPE_UNSPECIFIED. 4. Request method is POST and a "Content-Type" header is
   * provided via headers field. The content_type field should be used instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentType;

  /**
   * The list of headers to send as part of the Uptime check request. If two headers have the same
   * key and different values, they should be entered as a single header, with the value being a
   * comma-separated list of all the desired values as described at
   * https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with
   * the same key in a Create call will cause the first to be overwritten by the second. The maximum
   * number of headers allowed is 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> headers;

  /**
   * Boolean specifying whether to encrypt the header information. Encryption should be specified
   * for any headers related to authentication that you do not wish to be seen when retrieving the
   * configuration. The server will be responsible for encrypting the headers. On Get/List calls, if
   * mask_headers is set to true then the headers will be obscured with ******.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean maskHeaders;

  /**
   * Optional (defaults to "/"). The path to the page against which to run the check. Will be
   * combined with the host (specified within the monitored_resource) and port to construct the full
   * URL. If the provided path does not begin with "/", a "/" will be prepended automatically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Optional (defaults to 80 when use_ssl is false, and 443 when use_ssl is true). The TCP port on
   * the HTTP server against which to run the check. Will be combined with host (specified within
   * the monitored_resource) and path to construct the full URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then request_method
   * defaults to GET.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestMethod;

  /**
   * If true, use HTTPS instead of HTTP to run the check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useSsl;

  /**
   * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check.
   * Only applies to checks where monitored_resource is set to uptime_url. If use_ssl is false,
   * setting validate_ssl to true has no effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean validateSsl;

  /**
   * The authentication information. Optional when creating an HTTP check; defaults to empty.
   * @return value or {@code null} for none
   */
  public BasicAuthentication getAuthInfo() {
    return authInfo;
  }

  /**
   * The authentication information. Optional when creating an HTTP check; defaults to empty.
   * @param authInfo authInfo or {@code null} for none
   */
  public HttpCheck setAuthInfo(BasicAuthentication authInfo) {
    this.authInfo = authInfo;
    return this;
  }

  /**
   * The request body associated with the HTTP POST request. If content_type is URL_ENCODED, the
   * body passed in must be URL-encoded. Users can provide a Content-Length header via the headers
   * field or the API will do so. If the request_method is GET and body is not empty, the API will
   * return an error. The maximum byte size is 1 megabyte. Note: As with all bytes fields, JSON
   * representations are base64 encoded. e.g.: "foo=bar" in URL-encoded form is "foo%3Dbar" and in
   * base64 encoding is "Zm9vJTI1M0RiYXI=".
   * @see #decodeBody()
   * @return value or {@code null} for none
   */
  public java.lang.String getBody() {
    return body;
  }

  /**
   * The request body associated with the HTTP POST request. If content_type is URL_ENCODED, the
   * body passed in must be URL-encoded. Users can provide a Content-Length header via the headers
   * field or the API will do so. If the request_method is GET and body is not empty, the API will
   * return an error. The maximum byte size is 1 megabyte. Note: As with all bytes fields, JSON
   * representations are base64 encoded. e.g.: "foo=bar" in URL-encoded form is "foo%3Dbar" and in
   * base64 encoding is "Zm9vJTI1M0RiYXI=".
   * @see #getBody()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeBody() {
    return com.google.api.client.util.Base64.decodeBase64(body);
  }

  /**
   * The request body associated with the HTTP POST request. If content_type is URL_ENCODED, the
   * body passed in must be URL-encoded. Users can provide a Content-Length header via the headers
   * field or the API will do so. If the request_method is GET and body is not empty, the API will
   * return an error. The maximum byte size is 1 megabyte. Note: As with all bytes fields, JSON
   * representations are base64 encoded. e.g.: "foo=bar" in URL-encoded form is "foo%3Dbar" and in
   * base64 encoding is "Zm9vJTI1M0RiYXI=".
   * @see #encodeBody()
   * @param body body or {@code null} for none
   */
  public HttpCheck setBody(java.lang.String body) {
    this.body = body;
    return this;
  }

  /**
   * The request body associated with the HTTP POST request. If content_type is URL_ENCODED, the
   * body passed in must be URL-encoded. Users can provide a Content-Length header via the headers
   * field or the API will do so. If the request_method is GET and body is not empty, the API will
   * return an error. The maximum byte size is 1 megabyte. Note: As with all bytes fields, JSON
   * representations are base64 encoded. e.g.: "foo=bar" in URL-encoded form is "foo%3Dbar" and in
   * base64 encoding is "Zm9vJTI1M0RiYXI=".
   * @see #setBody()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public HttpCheck encodeBody(byte[] body) {
    this.body = com.google.api.client.util.Base64.encodeBase64URLSafeString(body);
    return this;
  }

  /**
   * The content type header to use for the check. The following configurations result in errors: 1.
   * Content type is specified in both the headers field and the content_type field. 2. Request
   * method is GET and content_type is not TYPE_UNSPECIFIED 3. Request method is POST and
   * content_type is TYPE_UNSPECIFIED. 4. Request method is POST and a "Content-Type" header is
   * provided via headers field. The content_type field should be used instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentType() {
    return contentType;
  }

  /**
   * The content type header to use for the check. The following configurations result in errors: 1.
   * Content type is specified in both the headers field and the content_type field. 2. Request
   * method is GET and content_type is not TYPE_UNSPECIFIED 3. Request method is POST and
   * content_type is TYPE_UNSPECIFIED. 4. Request method is POST and a "Content-Type" header is
   * provided via headers field. The content_type field should be used instead.
   * @param contentType contentType or {@code null} for none
   */
  public HttpCheck setContentType(java.lang.String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * The list of headers to send as part of the Uptime check request. If two headers have the same
   * key and different values, they should be entered as a single header, with the value being a
   * comma-separated list of all the desired values as described at
   * https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with
   * the same key in a Create call will cause the first to be overwritten by the second. The maximum
   * number of headers allowed is 100.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getHeaders() {
    return headers;
  }

  /**
   * The list of headers to send as part of the Uptime check request. If two headers have the same
   * key and different values, they should be entered as a single header, with the value being a
   * comma-separated list of all the desired values as described at
   * https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with
   * the same key in a Create call will cause the first to be overwritten by the second. The maximum
   * number of headers allowed is 100.
   * @param headers headers or {@code null} for none
   */
  public HttpCheck setHeaders(java.util.Map<String, java.lang.String> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Boolean specifying whether to encrypt the header information. Encryption should be specified
   * for any headers related to authentication that you do not wish to be seen when retrieving the
   * configuration. The server will be responsible for encrypting the headers. On Get/List calls, if
   * mask_headers is set to true then the headers will be obscured with ******.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMaskHeaders() {
    return maskHeaders;
  }

  /**
   * Boolean specifying whether to encrypt the header information. Encryption should be specified
   * for any headers related to authentication that you do not wish to be seen when retrieving the
   * configuration. The server will be responsible for encrypting the headers. On Get/List calls, if
   * mask_headers is set to true then the headers will be obscured with ******.
   * @param maskHeaders maskHeaders or {@code null} for none
   */
  public HttpCheck setMaskHeaders(java.lang.Boolean maskHeaders) {
    this.maskHeaders = maskHeaders;
    return this;
  }

  /**
   * Optional (defaults to "/"). The path to the page against which to run the check. Will be
   * combined with the host (specified within the monitored_resource) and port to construct the full
   * URL. If the provided path does not begin with "/", a "/" will be prepended automatically.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * Optional (defaults to "/"). The path to the page against which to run the check. Will be
   * combined with the host (specified within the monitored_resource) and port to construct the full
   * URL. If the provided path does not begin with "/", a "/" will be prepended automatically.
   * @param path path or {@code null} for none
   */
  public HttpCheck setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Optional (defaults to 80 when use_ssl is false, and 443 when use_ssl is true). The TCP port on
   * the HTTP server against which to run the check. Will be combined with host (specified within
   * the monitored_resource) and path to construct the full URL.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Optional (defaults to 80 when use_ssl is false, and 443 when use_ssl is true). The TCP port on
   * the HTTP server against which to run the check. Will be combined with host (specified within
   * the monitored_resource) and path to construct the full URL.
   * @param port port or {@code null} for none
   */
  public HttpCheck setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then request_method
   * defaults to GET.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestMethod() {
    return requestMethod;
  }

  /**
   * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then request_method
   * defaults to GET.
   * @param requestMethod requestMethod or {@code null} for none
   */
  public HttpCheck setRequestMethod(java.lang.String requestMethod) {
    this.requestMethod = requestMethod;
    return this;
  }

  /**
   * If true, use HTTPS instead of HTTP to run the check.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseSsl() {
    return useSsl;
  }

  /**
   * If true, use HTTPS instead of HTTP to run the check.
   * @param useSsl useSsl or {@code null} for none
   */
  public HttpCheck setUseSsl(java.lang.Boolean useSsl) {
    this.useSsl = useSsl;
    return this;
  }

  /**
   * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check.
   * Only applies to checks where monitored_resource is set to uptime_url. If use_ssl is false,
   * setting validate_ssl to true has no effect.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getValidateSsl() {
    return validateSsl;
  }

  /**
   * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check.
   * Only applies to checks where monitored_resource is set to uptime_url. If use_ssl is false,
   * setting validate_ssl to true has no effect.
   * @param validateSsl validateSsl or {@code null} for none
   */
  public HttpCheck setValidateSsl(java.lang.Boolean validateSsl) {
    this.validateSsl = validateSsl;
    return this;
  }

  @Override
  public HttpCheck set(String fieldName, Object value) {
    return (HttpCheck) super.set(fieldName, value);
  }

  @Override
  public HttpCheck clone() {
    return (HttpCheck) super.clone();
  }

}
