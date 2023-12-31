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
 * Configuration for a subscription offer in a single region.
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
public final class RegionalSubscriptionOfferConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether the subscription offer in the specified region is available for new subscribers.
   * Existing subscribers will not have their subscription cancelled if this value is set to false.
   * If not specified, this will default to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean newSubscriberAvailability;

  /**
   * Required. Immutable. Region code this configuration applies to, as defined by ISO 3166-2, e.g.
   * "US".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * Whether the subscription offer in the specified region is available for new subscribers.
   * Existing subscribers will not have their subscription cancelled if this value is set to false.
   * If not specified, this will default to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNewSubscriberAvailability() {
    return newSubscriberAvailability;
  }

  /**
   * Whether the subscription offer in the specified region is available for new subscribers.
   * Existing subscribers will not have their subscription cancelled if this value is set to false.
   * If not specified, this will default to false.
   * @param newSubscriberAvailability newSubscriberAvailability or {@code null} for none
   */
  public RegionalSubscriptionOfferConfig setNewSubscriberAvailability(java.lang.Boolean newSubscriberAvailability) {
    this.newSubscriberAvailability = newSubscriberAvailability;
    return this;
  }

  /**
   * Required. Immutable. Region code this configuration applies to, as defined by ISO 3166-2, e.g.
   * "US".
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * Required. Immutable. Region code this configuration applies to, as defined by ISO 3166-2, e.g.
   * "US".
   * @param regionCode regionCode or {@code null} for none
   */
  public RegionalSubscriptionOfferConfig setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  @Override
  public RegionalSubscriptionOfferConfig set(String fieldName, Object value) {
    return (RegionalSubscriptionOfferConfig) super.set(fieldName, value);
  }

  @Override
  public RegionalSubscriptionOfferConfig clone() {
    return (RegionalSubscriptionOfferConfig) super.clone();
  }

}
