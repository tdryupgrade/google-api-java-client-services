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

package com.google.api.services.billingbudgets.v1beta1.model;

/**
 * The budgeted amount for each usage period.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing Budget API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBillingBudgetsV1beta1BudgetAmount extends com.google.api.client.json.GenericJson {

  /**
   * Use the last period's actual spend as the budget for the present period. LastPeriodAmount can
   * only be set when the budget's time period is a Filter.calendar_period. It cannot be set in
   * combination with Filter.custom_period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudBillingBudgetsV1beta1LastPeriodAmount lastPeriodAmount;

  /**
   * A specified amount to use as the budget. `currency_code` is optional. If specified when
   * creating a budget, it must match the currency of the billing account. If specified when
   * updating a budget, it must match the currency_code of the existing budget. The `currency_code`
   * is provided on output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeMoney specifiedAmount;

  /**
   * Use the last period's actual spend as the budget for the present period. LastPeriodAmount can
   * only be set when the budget's time period is a Filter.calendar_period. It cannot be set in
   * combination with Filter.custom_period.
   * @return value or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1LastPeriodAmount getLastPeriodAmount() {
    return lastPeriodAmount;
  }

  /**
   * Use the last period's actual spend as the budget for the present period. LastPeriodAmount can
   * only be set when the budget's time period is a Filter.calendar_period. It cannot be set in
   * combination with Filter.custom_period.
   * @param lastPeriodAmount lastPeriodAmount or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1BudgetAmount setLastPeriodAmount(GoogleCloudBillingBudgetsV1beta1LastPeriodAmount lastPeriodAmount) {
    this.lastPeriodAmount = lastPeriodAmount;
    return this;
  }

  /**
   * A specified amount to use as the budget. `currency_code` is optional. If specified when
   * creating a budget, it must match the currency of the billing account. If specified when
   * updating a budget, it must match the currency_code of the existing budget. The `currency_code`
   * is provided on output.
   * @return value or {@code null} for none
   */
  public GoogleTypeMoney getSpecifiedAmount() {
    return specifiedAmount;
  }

  /**
   * A specified amount to use as the budget. `currency_code` is optional. If specified when
   * creating a budget, it must match the currency of the billing account. If specified when
   * updating a budget, it must match the currency_code of the existing budget. The `currency_code`
   * is provided on output.
   * @param specifiedAmount specifiedAmount or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1BudgetAmount setSpecifiedAmount(GoogleTypeMoney specifiedAmount) {
    this.specifiedAmount = specifiedAmount;
    return this;
  }

  @Override
  public GoogleCloudBillingBudgetsV1beta1BudgetAmount set(String fieldName, Object value) {
    return (GoogleCloudBillingBudgetsV1beta1BudgetAmount) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBillingBudgetsV1beta1BudgetAmount clone() {
    return (GoogleCloudBillingBudgetsV1beta1BudgetAmount) super.clone();
  }

}
