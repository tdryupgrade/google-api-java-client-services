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

package com.google.api.services.privateca.v1beta1.model;

/**
 * Describing buckets with constant width.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleApiServicecontrolV1LinearBuckets extends com.google.api.client.json.GenericJson {

  /**
   * The number of finite buckets. With the underflow and overflow buckets, the total number of
   * buckets is `num_finite_buckets` + 2. See comments on `bucket_options` for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numFiniteBuckets;

  /**
   * The i'th linear bucket covers the interval [offset + (i-1) * width, offset + i * width) where i
   * ranges from 1 to num_finite_buckets, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double offset;

  /**
   * The i'th linear bucket covers the interval [offset + (i-1) * width, offset + i * width) where i
   * ranges from 1 to num_finite_buckets, inclusive. Must be strictly positive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double width;

  /**
   * The number of finite buckets. With the underflow and overflow buckets, the total number of
   * buckets is `num_finite_buckets` + 2. See comments on `bucket_options` for details.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumFiniteBuckets() {
    return numFiniteBuckets;
  }

  /**
   * The number of finite buckets. With the underflow and overflow buckets, the total number of
   * buckets is `num_finite_buckets` + 2. See comments on `bucket_options` for details.
   * @param numFiniteBuckets numFiniteBuckets or {@code null} for none
   */
  public GoogleApiServicecontrolV1LinearBuckets setNumFiniteBuckets(java.lang.Integer numFiniteBuckets) {
    this.numFiniteBuckets = numFiniteBuckets;
    return this;
  }

  /**
   * The i'th linear bucket covers the interval [offset + (i-1) * width, offset + i * width) where i
   * ranges from 1 to num_finite_buckets, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Double getOffset() {
    return offset;
  }

  /**
   * The i'th linear bucket covers the interval [offset + (i-1) * width, offset + i * width) where i
   * ranges from 1 to num_finite_buckets, inclusive.
   * @param offset offset or {@code null} for none
   */
  public GoogleApiServicecontrolV1LinearBuckets setOffset(java.lang.Double offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The i'th linear bucket covers the interval [offset + (i-1) * width, offset + i * width) where i
   * ranges from 1 to num_finite_buckets, inclusive. Must be strictly positive.
   * @return value or {@code null} for none
   */
  public java.lang.Double getWidth() {
    return width;
  }

  /**
   * The i'th linear bucket covers the interval [offset + (i-1) * width, offset + i * width) where i
   * ranges from 1 to num_finite_buckets, inclusive. Must be strictly positive.
   * @param width width or {@code null} for none
   */
  public GoogleApiServicecontrolV1LinearBuckets setWidth(java.lang.Double width) {
    this.width = width;
    return this;
  }

  @Override
  public GoogleApiServicecontrolV1LinearBuckets set(String fieldName, Object value) {
    return (GoogleApiServicecontrolV1LinearBuckets) super.set(fieldName, value);
  }

  @Override
  public GoogleApiServicecontrolV1LinearBuckets clone() {
    return (GoogleApiServicecontrolV1LinearBuckets) super.clone();
  }

}
