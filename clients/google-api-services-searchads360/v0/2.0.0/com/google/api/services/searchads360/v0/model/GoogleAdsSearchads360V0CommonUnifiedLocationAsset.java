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
 * A unified location asset.
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
public final class GoogleAdsSearchads360V0CommonUnifiedLocationAsset extends com.google.api.client.json.GenericJson {

  /**
   * The list of business locations for the customer. This will only be returned if the Location
   * Asset is syncing from the Business Profile account. It is possible to have multiple Business
   * Profile listings under the same account that point to the same Place ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAdsSearchads360V0CommonBusinessProfileLocation> businessProfileLocations;

  static {
    // hack to force ProGuard to consider GoogleAdsSearchads360V0CommonBusinessProfileLocation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAdsSearchads360V0CommonBusinessProfileLocation.class);
  }

  /**
   * The type of location ownership. If the type is BUSINESS_OWNER, it will be served as a location
   * extension. If the type is AFFILIATE, it will be served as an affiliate location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationOwnershipType;

  /**
   * Place IDs uniquely identify a place in the Google Places database and on Google Maps. This
   * field is unique for a given customer ID and asset type. See
   * https://developers.google.com/places/web-service/place-id to learn more about Place ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String placeId;

  /**
   * The list of business locations for the customer. This will only be returned if the Location
   * Asset is syncing from the Business Profile account. It is possible to have multiple Business
   * Profile listings under the same account that point to the same Place ID.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAdsSearchads360V0CommonBusinessProfileLocation> getBusinessProfileLocations() {
    return businessProfileLocations;
  }

  /**
   * The list of business locations for the customer. This will only be returned if the Location
   * Asset is syncing from the Business Profile account. It is possible to have multiple Business
   * Profile listings under the same account that point to the same Place ID.
   * @param businessProfileLocations businessProfileLocations or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonUnifiedLocationAsset setBusinessProfileLocations(java.util.List<GoogleAdsSearchads360V0CommonBusinessProfileLocation> businessProfileLocations) {
    this.businessProfileLocations = businessProfileLocations;
    return this;
  }

  /**
   * The type of location ownership. If the type is BUSINESS_OWNER, it will be served as a location
   * extension. If the type is AFFILIATE, it will be served as an affiliate location.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationOwnershipType() {
    return locationOwnershipType;
  }

  /**
   * The type of location ownership. If the type is BUSINESS_OWNER, it will be served as a location
   * extension. If the type is AFFILIATE, it will be served as an affiliate location.
   * @param locationOwnershipType locationOwnershipType or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonUnifiedLocationAsset setLocationOwnershipType(java.lang.String locationOwnershipType) {
    this.locationOwnershipType = locationOwnershipType;
    return this;
  }

  /**
   * Place IDs uniquely identify a place in the Google Places database and on Google Maps. This
   * field is unique for a given customer ID and asset type. See
   * https://developers.google.com/places/web-service/place-id to learn more about Place ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlaceId() {
    return placeId;
  }

  /**
   * Place IDs uniquely identify a place in the Google Places database and on Google Maps. This
   * field is unique for a given customer ID and asset type. See
   * https://developers.google.com/places/web-service/place-id to learn more about Place ID.
   * @param placeId placeId or {@code null} for none
   */
  public GoogleAdsSearchads360V0CommonUnifiedLocationAsset setPlaceId(java.lang.String placeId) {
    this.placeId = placeId;
    return this;
  }

  @Override
  public GoogleAdsSearchads360V0CommonUnifiedLocationAsset set(String fieldName, Object value) {
    return (GoogleAdsSearchads360V0CommonUnifiedLocationAsset) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsSearchads360V0CommonUnifiedLocationAsset clone() {
    return (GoogleAdsSearchads360V0CommonUnifiedLocationAsset) super.clone();
  }

}
