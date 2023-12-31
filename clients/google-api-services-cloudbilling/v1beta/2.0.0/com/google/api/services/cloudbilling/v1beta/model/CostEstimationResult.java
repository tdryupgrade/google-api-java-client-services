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

package com.google.api.services.cloudbilling.v1beta.model;

/**
 * The result of a estimating the costs of a `CostScenario`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CostEstimationResult extends com.google.api.client.json.GenericJson {

  /**
   * Required. The ISO 4217 currency code for the cost estimate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * Required. Estimated costs for each idealized month of a `CostScenario`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SegmentCostEstimate> segmentCostEstimates;

  /**
   * Required. Information about SKUs used in the estimate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Sku> skus;

  /**
   * Required. The ISO 4217 currency code for the cost estimate.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Required. The ISO 4217 currency code for the cost estimate.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public CostEstimationResult setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Required. Estimated costs for each idealized month of a `CostScenario`.
   * @return value or {@code null} for none
   */
  public java.util.List<SegmentCostEstimate> getSegmentCostEstimates() {
    return segmentCostEstimates;
  }

  /**
   * Required. Estimated costs for each idealized month of a `CostScenario`.
   * @param segmentCostEstimates segmentCostEstimates or {@code null} for none
   */
  public CostEstimationResult setSegmentCostEstimates(java.util.List<SegmentCostEstimate> segmentCostEstimates) {
    this.segmentCostEstimates = segmentCostEstimates;
    return this;
  }

  /**
   * Required. Information about SKUs used in the estimate.
   * @return value or {@code null} for none
   */
  public java.util.List<Sku> getSkus() {
    return skus;
  }

  /**
   * Required. Information about SKUs used in the estimate.
   * @param skus skus or {@code null} for none
   */
  public CostEstimationResult setSkus(java.util.List<Sku> skus) {
    this.skus = skus;
    return this;
  }

  @Override
  public CostEstimationResult set(String fieldName, Object value) {
    return (CostEstimationResult) super.set(fieldName, value);
  }

  @Override
  public CostEstimationResult clone() {
    return (CostEstimationResult) super.clone();
  }

}
