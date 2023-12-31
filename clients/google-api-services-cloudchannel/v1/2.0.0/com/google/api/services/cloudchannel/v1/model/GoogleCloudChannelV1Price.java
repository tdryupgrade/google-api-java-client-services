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

package com.google.api.services.cloudchannel.v1.model;

/**
 * Represents the price of the Offer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1Price extends com.google.api.client.json.GenericJson {

  /**
   * Base price.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeMoney basePrice;

  /**
   * Discount percentage, represented as decimal. For example, a 20% discount will be represent as
   * 0.2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double discount;

  /**
   * Effective Price after applying the discounts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeMoney effectivePrice;

  /**
   * Link to external price list, such as link to Google Voice rate card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalPriceUri;

  /**
   * Base price.
   * @return value or {@code null} for none
   */
  public GoogleTypeMoney getBasePrice() {
    return basePrice;
  }

  /**
   * Base price.
   * @param basePrice basePrice or {@code null} for none
   */
  public GoogleCloudChannelV1Price setBasePrice(GoogleTypeMoney basePrice) {
    this.basePrice = basePrice;
    return this;
  }

  /**
   * Discount percentage, represented as decimal. For example, a 20% discount will be represent as
   * 0.2.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDiscount() {
    return discount;
  }

  /**
   * Discount percentage, represented as decimal. For example, a 20% discount will be represent as
   * 0.2.
   * @param discount discount or {@code null} for none
   */
  public GoogleCloudChannelV1Price setDiscount(java.lang.Double discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Effective Price after applying the discounts.
   * @return value or {@code null} for none
   */
  public GoogleTypeMoney getEffectivePrice() {
    return effectivePrice;
  }

  /**
   * Effective Price after applying the discounts.
   * @param effectivePrice effectivePrice or {@code null} for none
   */
  public GoogleCloudChannelV1Price setEffectivePrice(GoogleTypeMoney effectivePrice) {
    this.effectivePrice = effectivePrice;
    return this;
  }

  /**
   * Link to external price list, such as link to Google Voice rate card.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalPriceUri() {
    return externalPriceUri;
  }

  /**
   * Link to external price list, such as link to Google Voice rate card.
   * @param externalPriceUri externalPriceUri or {@code null} for none
   */
  public GoogleCloudChannelV1Price setExternalPriceUri(java.lang.String externalPriceUri) {
    this.externalPriceUri = externalPriceUri;
    return this;
  }

  @Override
  public GoogleCloudChannelV1Price set(String fieldName, Object value) {
    return (GoogleCloudChannelV1Price) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1Price clone() {
    return (GoogleCloudChannelV1Price) super.clone();
  }

}
