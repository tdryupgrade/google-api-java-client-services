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

package com.google.api.services.content.model;

/**
 * The message for FeaturedProduct.
 * [FeaturedProduct](https://support.google.com/merchants/answer/9703736)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CollectionFeaturedProduct extends com.google.api.client.json.GenericJson {

  /**
   * The unique identifier for the product item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String offerId;

  /**
   * Required. X-coordinate of the product callout on the Shoppable Image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float x;

  /**
   * Required. Y-coordinate of the product callout on the Shoppable Image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float y;

  /**
   * The unique identifier for the product item.
   * @return value or {@code null} for none
   */
  public java.lang.String getOfferId() {
    return offerId;
  }

  /**
   * The unique identifier for the product item.
   * @param offerId offerId or {@code null} for none
   */
  public CollectionFeaturedProduct setOfferId(java.lang.String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Required. X-coordinate of the product callout on the Shoppable Image.
   * @return value or {@code null} for none
   */
  public java.lang.Float getX() {
    return x;
  }

  /**
   * Required. X-coordinate of the product callout on the Shoppable Image.
   * @param x x or {@code null} for none
   */
  public CollectionFeaturedProduct setX(java.lang.Float x) {
    this.x = x;
    return this;
  }

  /**
   * Required. Y-coordinate of the product callout on the Shoppable Image.
   * @return value or {@code null} for none
   */
  public java.lang.Float getY() {
    return y;
  }

  /**
   * Required. Y-coordinate of the product callout on the Shoppable Image.
   * @param y y or {@code null} for none
   */
  public CollectionFeaturedProduct setY(java.lang.Float y) {
    this.y = y;
    return this;
  }

  @Override
  public CollectionFeaturedProduct set(String fieldName, Object value) {
    return (CollectionFeaturedProduct) super.set(fieldName, value);
  }

  @Override
  public CollectionFeaturedProduct clone() {
    return (CollectionFeaturedProduct) super.clone();
  }

}
