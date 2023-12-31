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

package com.google.api.services.androidpublisher.model;

/**
 * Pricing information for any new locations Play may launch in.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OtherRegionsSubscriptionOfferPhasePrices extends com.google.api.client.json.GenericJson {

  /**
   * Required. Price in EUR to use for any new locations Play may launch in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money eurPrice;

  /**
   * Required. Price in USD to use for any new locations Play may launch in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money usdPrice;

  /**
   * Required. Price in EUR to use for any new locations Play may launch in.
   * @return value or {@code null} for none
   */
  public Money getEurPrice() {
    return eurPrice;
  }

  /**
   * Required. Price in EUR to use for any new locations Play may launch in.
   * @param eurPrice eurPrice or {@code null} for none
   */
  public OtherRegionsSubscriptionOfferPhasePrices setEurPrice(Money eurPrice) {
    this.eurPrice = eurPrice;
    return this;
  }

  /**
   * Required. Price in USD to use for any new locations Play may launch in.
   * @return value or {@code null} for none
   */
  public Money getUsdPrice() {
    return usdPrice;
  }

  /**
   * Required. Price in USD to use for any new locations Play may launch in.
   * @param usdPrice usdPrice or {@code null} for none
   */
  public OtherRegionsSubscriptionOfferPhasePrices setUsdPrice(Money usdPrice) {
    this.usdPrice = usdPrice;
    return this;
  }

  @Override
  public OtherRegionsSubscriptionOfferPhasePrices set(String fieldName, Object value) {
    return (OtherRegionsSubscriptionOfferPhasePrices) super.set(fieldName, value);
  }

  @Override
  public OtherRegionsSubscriptionOfferPhasePrices clone() {
    return (OtherRegionsSubscriptionOfferPhasePrices) super.clone();
  }

}
