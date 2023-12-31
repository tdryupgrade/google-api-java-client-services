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
 * The line items of the order.
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
public final class OrderTrackingSignalLineItemDetails extends com.google.api.client.json.GenericJson {

  /**
   * Brand of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String brand;

  /**
   * The Global Trade Item Number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gtin;

  /**
   * Required. The ID for this line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lineItemId;

  /**
   * The manufacturer part number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mpn;

  /**
   * Plain text description of this product (deprecated: Please use product_title instead).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productDescription;

  /**
   * Required. The Content API REST ID of the product, in the form
   * channel:contentLanguage:targetCountry:offerId.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * Plain text title of this product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productTitle;

  /**
   * The quantity of the line item in the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long quantity;

  /**
   * Merchant SKU for this item (deprecated).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sku;

  /**
   * Universal product code for this item (deprecated: Please use GTIN instead).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String upc;

  /**
   * Brand of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getBrand() {
    return brand;
  }

  /**
   * Brand of the product.
   * @param brand brand or {@code null} for none
   */
  public OrderTrackingSignalLineItemDetails setBrand(java.lang.String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * The Global Trade Item Number.
   * @return value or {@code null} for none
   */
  public java.lang.String getGtin() {
    return gtin;
  }

  /**
   * The Global Trade Item Number.
   * @param gtin gtin or {@code null} for none
   */
  public OrderTrackingSignalLineItemDetails setGtin(java.lang.String gtin) {
    this.gtin = gtin;
    return this;
  }

  /**
   * Required. The ID for this line item.
   * @return value or {@code null} for none
   */
  public java.lang.String getLineItemId() {
    return lineItemId;
  }

  /**
   * Required. The ID for this line item.
   * @param lineItemId lineItemId or {@code null} for none
   */
  public OrderTrackingSignalLineItemDetails setLineItemId(java.lang.String lineItemId) {
    this.lineItemId = lineItemId;
    return this;
  }

  /**
   * The manufacturer part number.
   * @return value or {@code null} for none
   */
  public java.lang.String getMpn() {
    return mpn;
  }

  /**
   * The manufacturer part number.
   * @param mpn mpn or {@code null} for none
   */
  public OrderTrackingSignalLineItemDetails setMpn(java.lang.String mpn) {
    this.mpn = mpn;
    return this;
  }

  /**
   * Plain text description of this product (deprecated: Please use product_title instead).
   * @return value or {@code null} for none
   */
  public java.lang.String getProductDescription() {
    return productDescription;
  }

  /**
   * Plain text description of this product (deprecated: Please use product_title instead).
   * @param productDescription productDescription or {@code null} for none
   */
  public OrderTrackingSignalLineItemDetails setProductDescription(java.lang.String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * Required. The Content API REST ID of the product, in the form
   * channel:contentLanguage:targetCountry:offerId.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * Required. The Content API REST ID of the product, in the form
   * channel:contentLanguage:targetCountry:offerId.
   * @param productId productId or {@code null} for none
   */
  public OrderTrackingSignalLineItemDetails setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Plain text title of this product.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductTitle() {
    return productTitle;
  }

  /**
   * Plain text title of this product.
   * @param productTitle productTitle or {@code null} for none
   */
  public OrderTrackingSignalLineItemDetails setProductTitle(java.lang.String productTitle) {
    this.productTitle = productTitle;
    return this;
  }

  /**
   * The quantity of the line item in the order.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantity() {
    return quantity;
  }

  /**
   * The quantity of the line item in the order.
   * @param quantity quantity or {@code null} for none
   */
  public OrderTrackingSignalLineItemDetails setQuantity(java.lang.Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Merchant SKU for this item (deprecated).
   * @return value or {@code null} for none
   */
  public java.lang.String getSku() {
    return sku;
  }

  /**
   * Merchant SKU for this item (deprecated).
   * @param sku sku or {@code null} for none
   */
  public OrderTrackingSignalLineItemDetails setSku(java.lang.String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Universal product code for this item (deprecated: Please use GTIN instead).
   * @return value or {@code null} for none
   */
  public java.lang.String getUpc() {
    return upc;
  }

  /**
   * Universal product code for this item (deprecated: Please use GTIN instead).
   * @param upc upc or {@code null} for none
   */
  public OrderTrackingSignalLineItemDetails setUpc(java.lang.String upc) {
    this.upc = upc;
    return this;
  }

  @Override
  public OrderTrackingSignalLineItemDetails set(String fieldName, Object value) {
    return (OrderTrackingSignalLineItemDetails) super.set(fieldName, value);
  }

  @Override
  public OrderTrackingSignalLineItemDetails clone() {
    return (OrderTrackingSignalLineItemDetails) super.clone();
  }

}
