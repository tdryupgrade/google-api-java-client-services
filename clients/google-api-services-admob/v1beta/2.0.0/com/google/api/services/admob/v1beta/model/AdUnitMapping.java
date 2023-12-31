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

package com.google.api.services.admob.v1beta.model;

/**
 * Settings to map an AdMob ad unit to a 3rd party ad unit.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdMob API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdUnitMapping extends com.google.api.client.json.GenericJson {

  /**
   * Settings for the specified ad unit to make an ad request to 3rd party ad network. Key-value
   * pairs with values set by the user for the keys requested by the ad network. Please see
   * https://support.google.com/admob/answer/3245073 for details on how to configure the network
   * settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> adUnitConfigurations;

  /**
   * The ID of mediation ad source adapter used by this ad unit mapping. The adapter determines the
   * information needed in the ad_network_settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long adapterId;

  /**
   * Optional. The display name of this ad unit mapping instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Resource name of this ad unit mapping. Format is:
   * accounts/{publisher_id}/adUnits/{ad_unit_id_fragment}/adUnitMappings/{ad_unit_mapping_id}
   * Example: accounts/pub-1234567890123456/adUnits/0123456789/adUnitMappings/987654321
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The status of this ad unit mapping.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Settings for the specified ad unit to make an ad request to 3rd party ad network. Key-value
   * pairs with values set by the user for the keys requested by the ad network. Please see
   * https://support.google.com/admob/answer/3245073 for details on how to configure the network
   * settings.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAdUnitConfigurations() {
    return adUnitConfigurations;
  }

  /**
   * Settings for the specified ad unit to make an ad request to 3rd party ad network. Key-value
   * pairs with values set by the user for the keys requested by the ad network. Please see
   * https://support.google.com/admob/answer/3245073 for details on how to configure the network
   * settings.
   * @param adUnitConfigurations adUnitConfigurations or {@code null} for none
   */
  public AdUnitMapping setAdUnitConfigurations(java.util.Map<String, java.lang.String> adUnitConfigurations) {
    this.adUnitConfigurations = adUnitConfigurations;
    return this;
  }

  /**
   * The ID of mediation ad source adapter used by this ad unit mapping. The adapter determines the
   * information needed in the ad_network_settings.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdapterId() {
    return adapterId;
  }

  /**
   * The ID of mediation ad source adapter used by this ad unit mapping. The adapter determines the
   * information needed in the ad_network_settings.
   * @param adapterId adapterId or {@code null} for none
   */
  public AdUnitMapping setAdapterId(java.lang.Long adapterId) {
    this.adapterId = adapterId;
    return this;
  }

  /**
   * Optional. The display name of this ad unit mapping instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. The display name of this ad unit mapping instance.
   * @param displayName displayName or {@code null} for none
   */
  public AdUnitMapping setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Resource name of this ad unit mapping. Format is:
   * accounts/{publisher_id}/adUnits/{ad_unit_id_fragment}/adUnitMappings/{ad_unit_mapping_id}
   * Example: accounts/pub-1234567890123456/adUnits/0123456789/adUnitMappings/987654321
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name of this ad unit mapping. Format is:
   * accounts/{publisher_id}/adUnits/{ad_unit_id_fragment}/adUnitMappings/{ad_unit_mapping_id}
   * Example: accounts/pub-1234567890123456/adUnits/0123456789/adUnitMappings/987654321
   * @param name name or {@code null} for none
   */
  public AdUnitMapping setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The status of this ad unit mapping.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The status of this ad unit mapping.
   * @param state state or {@code null} for none
   */
  public AdUnitMapping setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public AdUnitMapping set(String fieldName, Object value) {
    return (AdUnitMapping) super.set(fieldName, value);
  }

  @Override
  public AdUnitMapping clone() {
    return (AdUnitMapping) super.clone();
  }

}
