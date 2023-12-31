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
 * Additional information required for PAYMENT_SERVICE_PROVIDER link type.
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
public final class PaymentServiceProviderLinkInfo extends com.google.api.client.json.GenericJson {

  /**
   * The business country of the merchant account as identified by the third party service provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalAccountBusinessCountry;

  /**
   * The id used by the third party service provider to identify the merchant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalAccountId;

  /**
   * The business country of the merchant account as identified by the third party service provider.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalAccountBusinessCountry() {
    return externalAccountBusinessCountry;
  }

  /**
   * The business country of the merchant account as identified by the third party service provider.
   * @param externalAccountBusinessCountry externalAccountBusinessCountry or {@code null} for none
   */
  public PaymentServiceProviderLinkInfo setExternalAccountBusinessCountry(java.lang.String externalAccountBusinessCountry) {
    this.externalAccountBusinessCountry = externalAccountBusinessCountry;
    return this;
  }

  /**
   * The id used by the third party service provider to identify the merchant.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalAccountId() {
    return externalAccountId;
  }

  /**
   * The id used by the third party service provider to identify the merchant.
   * @param externalAccountId externalAccountId or {@code null} for none
   */
  public PaymentServiceProviderLinkInfo setExternalAccountId(java.lang.String externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

  @Override
  public PaymentServiceProviderLinkInfo set(String fieldName, Object value) {
    return (PaymentServiceProviderLinkInfo) super.set(fieldName, value);
  }

  @Override
  public PaymentServiceProviderLinkInfo clone() {
    return (PaymentServiceProviderLinkInfo) super.clone();
  }

}
