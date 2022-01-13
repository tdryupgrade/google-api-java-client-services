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

package com.google.api.services.cloudtasks.v2.model;

/**
 * HTTP request. The task will be pushed to the worker as an HTTP request. If the worker or the
 * redirected worker acknowledges the task by returning a successful HTTP response code ([`200` -
 * `299`]), the task will be removed from the queue. If any other HTTP response code is returned or
 * no response is received, the task will be retried according to the following: * User-specified
 * throttling: retry configuration, rate limits, and the queue's state. * System throttling: To
 * prevent the worker from overloading, Cloud Tasks may temporarily reduce the queue's effective
 * rate. User-specified settings will not be changed. System throttling happens because: * Cloud
 * Tasks backs off on all errors. Normally the backoff specified in rate limits will be used. But if
 * the worker returns `429` (Too Many Requests), `503` (Service Unavailable), or the rate of errors
 * is high, Cloud Tasks will use a higher backoff rate. The retry specified in the `Retry-After`
 * HTTP response header is considered. * To prevent traffic spikes and to smooth sudden increases in
 * traffic, dispatches ramp up slowly when the queue is newly created or idle and if large numbers
 * of tasks suddenly become available to dispatch (due to spikes in create task rates, the queue
 * being unpaused, or many tasks that are scheduled at the same time).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpRequest extends com.google.api.client.json.GenericJson {

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It
   * is an error to set body on a task with an incompatible HttpMethod.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String body;

  /**
   * HTTP request headers. This map contains the header field names and values. Headers can be set
   * when the task is created. These headers represent a subset of the headers that will accompany
   * the task's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list
   * of headers that will be ignored or replaced is: * Host: This will be computed by Cloud Tasks
   * and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. *
   * User-Agent: This will be set to `"Google-Cloud-Tasks"`. * `X-Google-*`: Google use only. *
   * `X-AppEngine-*`: Google use only. `Content-Type` won't be set by Cloud Tasks. You can
   * explicitly set `Content-Type` to a media type when the task is created. For example, `Content-
   * Type` can be set to `"application/octet-stream"` or `"application/json"`. Headers which can
   * have multiple values (according to RFC2616) can be specified using comma-separated values. The
   * size of the headers must be less than 80KB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> headers;

  /**
   * The HTTP method to use for the request. The default is POST.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String httpMethod;

  /**
   * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be
   * generated and attached as an `Authorization` header in the HTTP request. This type of
   * authorization should generally only be used when calling Google APIs hosted on
   * *.googleapis.com.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OAuthToken oauthToken;

  /**
   * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token
   * will be generated and attached as an `Authorization` header in the HTTP request. This type of
   * authorization can be used for many scenarios, including calling Cloud Run, or endpoints where
   * you intend to validate the token yourself.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OidcToken oidcToken;

  /**
   * Required. The full url path that the request will be sent to. This string must begin with
   * either "http://" or "https://". Some examples are: `http://acme.com` and
   * `https://acme.com/sales:8080`. Cloud Tasks will encode some characters for safety and
   * compatibility. The maximum allowed URL length is 2083 characters after encoding. The `Location`
   * header response from a redirect response [`300` - `399`] may be followed. The redirect is not
   * counted as a separate attempt.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It
   * is an error to set body on a task with an incompatible HttpMethod.
   * @see #decodeBody()
   * @return value or {@code null} for none
   */
  public java.lang.String getBody() {
    return body;
  }

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It
   * is an error to set body on a task with an incompatible HttpMethod.
   * @see #getBody()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeBody() {
    return com.google.api.client.util.Base64.decodeBase64(body);
  }

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It
   * is an error to set body on a task with an incompatible HttpMethod.
   * @see #encodeBody()
   * @param body body or {@code null} for none
   */
  public HttpRequest setBody(java.lang.String body) {
    this.body = body;
    return this;
  }

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It
   * is an error to set body on a task with an incompatible HttpMethod.
   * @see #setBody()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public HttpRequest encodeBody(byte[] body) {
    this.body = com.google.api.client.util.Base64.encodeBase64URLSafeString(body);
    return this;
  }

  /**
   * HTTP request headers. This map contains the header field names and values. Headers can be set
   * when the task is created. These headers represent a subset of the headers that will accompany
   * the task's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list
   * of headers that will be ignored or replaced is: * Host: This will be computed by Cloud Tasks
   * and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. *
   * User-Agent: This will be set to `"Google-Cloud-Tasks"`. * `X-Google-*`: Google use only. *
   * `X-AppEngine-*`: Google use only. `Content-Type` won't be set by Cloud Tasks. You can
   * explicitly set `Content-Type` to a media type when the task is created. For example, `Content-
   * Type` can be set to `"application/octet-stream"` or `"application/json"`. Headers which can
   * have multiple values (according to RFC2616) can be specified using comma-separated values. The
   * size of the headers must be less than 80KB.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getHeaders() {
    return headers;
  }

  /**
   * HTTP request headers. This map contains the header field names and values. Headers can be set
   * when the task is created. These headers represent a subset of the headers that will accompany
   * the task's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list
   * of headers that will be ignored or replaced is: * Host: This will be computed by Cloud Tasks
   * and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. *
   * User-Agent: This will be set to `"Google-Cloud-Tasks"`. * `X-Google-*`: Google use only. *
   * `X-AppEngine-*`: Google use only. `Content-Type` won't be set by Cloud Tasks. You can
   * explicitly set `Content-Type` to a media type when the task is created. For example, `Content-
   * Type` can be set to `"application/octet-stream"` or `"application/json"`. Headers which can
   * have multiple values (according to RFC2616) can be specified using comma-separated values. The
   * size of the headers must be less than 80KB.
   * @param headers headers or {@code null} for none
   */
  public HttpRequest setHeaders(java.util.Map<String, java.lang.String> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * The HTTP method to use for the request. The default is POST.
   * @return value or {@code null} for none
   */
  public java.lang.String getHttpMethod() {
    return httpMethod;
  }

  /**
   * The HTTP method to use for the request. The default is POST.
   * @param httpMethod httpMethod or {@code null} for none
   */
  public HttpRequest setHttpMethod(java.lang.String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  /**
   * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be
   * generated and attached as an `Authorization` header in the HTTP request. This type of
   * authorization should generally only be used when calling Google APIs hosted on
   * *.googleapis.com.
   * @return value or {@code null} for none
   */
  public OAuthToken getOauthToken() {
    return oauthToken;
  }

  /**
   * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be
   * generated and attached as an `Authorization` header in the HTTP request. This type of
   * authorization should generally only be used when calling Google APIs hosted on
   * *.googleapis.com.
   * @param oauthToken oauthToken or {@code null} for none
   */
  public HttpRequest setOauthToken(OAuthToken oauthToken) {
    this.oauthToken = oauthToken;
    return this;
  }

  /**
   * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token
   * will be generated and attached as an `Authorization` header in the HTTP request. This type of
   * authorization can be used for many scenarios, including calling Cloud Run, or endpoints where
   * you intend to validate the token yourself.
   * @return value or {@code null} for none
   */
  public OidcToken getOidcToken() {
    return oidcToken;
  }

  /**
   * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token
   * will be generated and attached as an `Authorization` header in the HTTP request. This type of
   * authorization can be used for many scenarios, including calling Cloud Run, or endpoints where
   * you intend to validate the token yourself.
   * @param oidcToken oidcToken or {@code null} for none
   */
  public HttpRequest setOidcToken(OidcToken oidcToken) {
    this.oidcToken = oidcToken;
    return this;
  }

  /**
   * Required. The full url path that the request will be sent to. This string must begin with
   * either "http://" or "https://". Some examples are: `http://acme.com` and
   * `https://acme.com/sales:8080`. Cloud Tasks will encode some characters for safety and
   * compatibility. The maximum allowed URL length is 2083 characters after encoding. The `Location`
   * header response from a redirect response [`300` - `399`] may be followed. The redirect is not
   * counted as a separate attempt.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Required. The full url path that the request will be sent to. This string must begin with
   * either "http://" or "https://". Some examples are: `http://acme.com` and
   * `https://acme.com/sales:8080`. Cloud Tasks will encode some characters for safety and
   * compatibility. The maximum allowed URL length is 2083 characters after encoding. The `Location`
   * header response from a redirect response [`300` - `399`] may be followed. The redirect is not
   * counted as a separate attempt.
   * @param url url or {@code null} for none
   */
  public HttpRequest setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public HttpRequest set(String fieldName, Object value) {
    return (HttpRequest) super.set(fieldName, value);
  }

  @Override
  public HttpRequest clone() {
    return (HttpRequest) super.clone();
  }

}
