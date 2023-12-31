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

package com.google.api.services.firestore.v1beta1.model;

/**
 * A sequence of bits, encoded in a byte array. Each byte in the `bitmap` byte array stores 8 bits
 * of the sequence. The only exception is the last byte, which may store 8 _or fewer_ bits. The
 * `padding` defines the number of bits of the last byte to be ignored as "padding". The values of
 * these "padding" bits are unspecified and must be ignored. To retrieve the first bit, bit 0,
 * calculate: `(bitmap[0] & 0x01) != 0`. To retrieve the second bit, bit 1, calculate: `(bitmap[0] &
 * 0x02) != 0`. To retrieve the third bit, bit 2, calculate: `(bitmap[0] & 0x04) != 0`. To retrieve
 * the fourth bit, bit 3, calculate: `(bitmap[0] & 0x08) != 0`. To retrieve bit n, calculate:
 * `(bitmap[n / 8] & (0x01 << (n % 8))) != 0`. The "size" of a `BitSequence` (the number of bits it
 * contains) is calculated by this formula: `(bitmap.length * 8) - padding`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BitSequence extends com.google.api.client.json.GenericJson {

  /**
   * The bytes that encode the bit sequence. May have a length of zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bitmap;

  /**
   * The number of bits of the last byte in `bitmap` to ignore as "padding". If the length of
   * `bitmap` is zero, then this value must be `0`. Otherwise, this value must be between 0 and 7,
   * inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer padding;

  /**
   * The bytes that encode the bit sequence. May have a length of zero.
   * @see #decodeBitmap()
   * @return value or {@code null} for none
   */
  public java.lang.String getBitmap() {
    return bitmap;
  }

  /**
   * The bytes that encode the bit sequence. May have a length of zero.
   * @see #getBitmap()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeBitmap() {
    return com.google.api.client.util.Base64.decodeBase64(bitmap);
  }

  /**
   * The bytes that encode the bit sequence. May have a length of zero.
   * @see #encodeBitmap()
   * @param bitmap bitmap or {@code null} for none
   */
  public BitSequence setBitmap(java.lang.String bitmap) {
    this.bitmap = bitmap;
    return this;
  }

  /**
   * The bytes that encode the bit sequence. May have a length of zero.
   * @see #setBitmap()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public BitSequence encodeBitmap(byte[] bitmap) {
    this.bitmap = com.google.api.client.util.Base64.encodeBase64URLSafeString(bitmap);
    return this;
  }

  /**
   * The number of bits of the last byte in `bitmap` to ignore as "padding". If the length of
   * `bitmap` is zero, then this value must be `0`. Otherwise, this value must be between 0 and 7,
   * inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPadding() {
    return padding;
  }

  /**
   * The number of bits of the last byte in `bitmap` to ignore as "padding". If the length of
   * `bitmap` is zero, then this value must be `0`. Otherwise, this value must be between 0 and 7,
   * inclusive.
   * @param padding padding or {@code null} for none
   */
  public BitSequence setPadding(java.lang.Integer padding) {
    this.padding = padding;
    return this;
  }

  @Override
  public BitSequence set(String fieldName, Object value) {
    return (BitSequence) super.set(fieldName, value);
  }

  @Override
  public BitSequence clone() {
    return (BitSequence) super.clone();
  }

}
