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
 * Specify CDN TTLs for response error codes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BackendBucketCdnPolicyNegativeCachingPolicy extends com.google.api.client.json.GenericJson {

  /**
   * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 302, 307, 308,
   * 404, 405, 410, 421, 451 and 501 are can be specified as values, and you cannot specify a status
   * code more than once.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer code;

  /**
   * The TTL (in seconds) for which to cache responses with the corresponding status code. The
   * maximum allowed value is 1800s (30 minutes), noting that infrequently accessed objects may be
   * evicted from the cache before the defined TTL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ttl;

  /**
   * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 302, 307, 308,
   * 404, 405, 410, 421, 451 and 501 are can be specified as values, and you cannot specify a status
   * code more than once.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCode() {
    return code;
  }

  /**
   * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 302, 307, 308,
   * 404, 405, 410, 421, 451 and 501 are can be specified as values, and you cannot specify a status
   * code more than once.
   * @param code code or {@code null} for none
   */
  public BackendBucketCdnPolicyNegativeCachingPolicy setCode(java.lang.Integer code) {
    this.code = code;
    return this;
  }

  /**
   * The TTL (in seconds) for which to cache responses with the corresponding status code. The
   * maximum allowed value is 1800s (30 minutes), noting that infrequently accessed objects may be
   * evicted from the cache before the defined TTL.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTtl() {
    return ttl;
  }

  /**
   * The TTL (in seconds) for which to cache responses with the corresponding status code. The
   * maximum allowed value is 1800s (30 minutes), noting that infrequently accessed objects may be
   * evicted from the cache before the defined TTL.
   * @param ttl ttl or {@code null} for none
   */
  public BackendBucketCdnPolicyNegativeCachingPolicy setTtl(java.lang.Integer ttl) {
    this.ttl = ttl;
    return this;
  }

  @Override
  public BackendBucketCdnPolicyNegativeCachingPolicy set(String fieldName, Object value) {
    return (BackendBucketCdnPolicyNegativeCachingPolicy) super.set(fieldName, value);
  }

  @Override
  public BackendBucketCdnPolicyNegativeCachingPolicy clone() {
    return (BackendBucketCdnPolicyNegativeCachingPolicy) super.clone();
  }

}
