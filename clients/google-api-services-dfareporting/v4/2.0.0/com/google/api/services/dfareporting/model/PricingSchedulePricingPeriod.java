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

package com.google.api.services.dfareporting.model;

/**
 * Pricing Period
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PricingSchedulePricingPeriod extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime endDate;

  /**
   * Comments for this pricing period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pricingComment;

  /**
   * Rate or cost of this pricing period in nanos (i.e., multiplied by 1000000000). Acceptable
   * values are 0 to 1000000000000000000, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long rateOrCostNanos;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime startDate;

  /**
   * Units of this pricing period. Acceptable values are 0 to 10000000000, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long units;

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getEndDate() {
    return endDate;
  }

  /**
   * @param endDate endDate or {@code null} for none
   */
  public PricingSchedulePricingPeriod setEndDate(com.google.api.client.util.DateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Comments for this pricing period.
   * @return value or {@code null} for none
   */
  public java.lang.String getPricingComment() {
    return pricingComment;
  }

  /**
   * Comments for this pricing period.
   * @param pricingComment pricingComment or {@code null} for none
   */
  public PricingSchedulePricingPeriod setPricingComment(java.lang.String pricingComment) {
    this.pricingComment = pricingComment;
    return this;
  }

  /**
   * Rate or cost of this pricing period in nanos (i.e., multiplied by 1000000000). Acceptable
   * values are 0 to 1000000000000000000, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRateOrCostNanos() {
    return rateOrCostNanos;
  }

  /**
   * Rate or cost of this pricing period in nanos (i.e., multiplied by 1000000000). Acceptable
   * values are 0 to 1000000000000000000, inclusive.
   * @param rateOrCostNanos rateOrCostNanos or {@code null} for none
   */
  public PricingSchedulePricingPeriod setRateOrCostNanos(java.lang.Long rateOrCostNanos) {
    this.rateOrCostNanos = rateOrCostNanos;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getStartDate() {
    return startDate;
  }

  /**
   * @param startDate startDate or {@code null} for none
   */
  public PricingSchedulePricingPeriod setStartDate(com.google.api.client.util.DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Units of this pricing period. Acceptable values are 0 to 10000000000, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUnits() {
    return units;
  }

  /**
   * Units of this pricing period. Acceptable values are 0 to 10000000000, inclusive.
   * @param units units or {@code null} for none
   */
  public PricingSchedulePricingPeriod setUnits(java.lang.Long units) {
    this.units = units;
    return this;
  }

  @Override
  public PricingSchedulePricingPeriod set(String fieldName, Object value) {
    return (PricingSchedulePricingPeriod) super.set(fieldName, value);
  }

  @Override
  public PricingSchedulePricingPeriod clone() {
    return (PricingSchedulePricingPeriod) super.clone();
  }

}
