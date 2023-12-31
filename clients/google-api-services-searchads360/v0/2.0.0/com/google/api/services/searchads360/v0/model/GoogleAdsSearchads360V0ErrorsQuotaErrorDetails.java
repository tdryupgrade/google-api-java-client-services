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

package com.google.api.services.searchads360.v0.model;

/**
 * Additional quota error details when there is QuotaError.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Ads 360 Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAdsSearchads360V0ErrorsQuotaErrorDetails extends com.google.api.client.json.GenericJson {

  /**
   * The high level description of the quota bucket. Examples are "Get requests for standard access"
   * or "Requests per account".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rateName;

  /**
   * The rate scope of the quota limit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rateScope;

  /**
   * Backoff period that customers should wait before sending next request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String retryDelay;

  /**
   * The high level description of the quota bucket. Examples are "Get requests for standard access"
   * or "Requests per account".
   * @return value or {@code null} for none
   */
  public java.lang.String getRateName() {
    return rateName;
  }

  /**
   * The high level description of the quota bucket. Examples are "Get requests for standard access"
   * or "Requests per account".
   * @param rateName rateName or {@code null} for none
   */
  public GoogleAdsSearchads360V0ErrorsQuotaErrorDetails setRateName(java.lang.String rateName) {
    this.rateName = rateName;
    return this;
  }

  /**
   * The rate scope of the quota limit.
   * @return value or {@code null} for none
   */
  public java.lang.String getRateScope() {
    return rateScope;
  }

  /**
   * The rate scope of the quota limit.
   * @param rateScope rateScope or {@code null} for none
   */
  public GoogleAdsSearchads360V0ErrorsQuotaErrorDetails setRateScope(java.lang.String rateScope) {
    this.rateScope = rateScope;
    return this;
  }

  /**
   * Backoff period that customers should wait before sending next request.
   * @return value or {@code null} for none
   */
  public String getRetryDelay() {
    return retryDelay;
  }

  /**
   * Backoff period that customers should wait before sending next request.
   * @param retryDelay retryDelay or {@code null} for none
   */
  public GoogleAdsSearchads360V0ErrorsQuotaErrorDetails setRetryDelay(String retryDelay) {
    this.retryDelay = retryDelay;
    return this;
  }

  @Override
  public GoogleAdsSearchads360V0ErrorsQuotaErrorDetails set(String fieldName, Object value) {
    return (GoogleAdsSearchads360V0ErrorsQuotaErrorDetails) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsSearchads360V0ErrorsQuotaErrorDetails clone() {
    return (GoogleAdsSearchads360V0ErrorsQuotaErrorDetails) super.clone();
  }

}
