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
 * Model definition for MonetaryAmount.
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
public final class MonetaryAmount extends com.google.api.client.json.GenericJson {

  /**
   * The pre-tax or post-tax price depends on the location of the order. - For countries (for
   * example, "US". where price attribute excludes tax, this field corresponds to the pre-tax value.
   * - For coutries (for example, "France") where price attribute includes tax, this field
   * corresponds to the post-tax value .
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price priceAmount;

  /**
   * Tax value, present only for countries where price attribute excludes tax (for example, "US". No
   * tax is referenced as 0 value with the corresponding `currency`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price taxAmount;

  /**
   * The pre-tax or post-tax price depends on the location of the order. - For countries (for
   * example, "US". where price attribute excludes tax, this field corresponds to the pre-tax value.
   * - For coutries (for example, "France") where price attribute includes tax, this field
   * corresponds to the post-tax value .
   * @return value or {@code null} for none
   */
  public Price getPriceAmount() {
    return priceAmount;
  }

  /**
   * The pre-tax or post-tax price depends on the location of the order. - For countries (for
   * example, "US". where price attribute excludes tax, this field corresponds to the pre-tax value.
   * - For coutries (for example, "France") where price attribute includes tax, this field
   * corresponds to the post-tax value .
   * @param priceAmount priceAmount or {@code null} for none
   */
  public MonetaryAmount setPriceAmount(Price priceAmount) {
    this.priceAmount = priceAmount;
    return this;
  }

  /**
   * Tax value, present only for countries where price attribute excludes tax (for example, "US". No
   * tax is referenced as 0 value with the corresponding `currency`.
   * @return value or {@code null} for none
   */
  public Price getTaxAmount() {
    return taxAmount;
  }

  /**
   * Tax value, present only for countries where price attribute excludes tax (for example, "US". No
   * tax is referenced as 0 value with the corresponding `currency`.
   * @param taxAmount taxAmount or {@code null} for none
   */
  public MonetaryAmount setTaxAmount(Price taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  @Override
  public MonetaryAmount set(String fieldName, Object value) {
    return (MonetaryAmount) super.set(fieldName, value);
  }

  @Override
  public MonetaryAmount clone() {
    return (MonetaryAmount) super.clone();
  }

}
