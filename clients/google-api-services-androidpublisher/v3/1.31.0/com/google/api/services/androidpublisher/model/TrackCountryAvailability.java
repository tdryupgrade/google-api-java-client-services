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
 * Resource for per-track country availability information.
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
public final class TrackCountryAvailability extends com.google.api.client.json.GenericJson {

  /**
   * A list of one or more countries where artifacts in this track are available. This list includes
   * all countries that are targeted by the track, even if only specific carriers are targeted in
   * that country.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TrackTargetedCountry> countries;

  /**
   * Whether artifacts in this track are available to "rest of the world" countries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean restOfWorld;

  /**
   * Whether this track's availability is synced with the default production track. See
   * https://support.google.com/googleplay/android-developer/answer/7550024 for more information on
   * syncing country availability with production. Note that if this is true, the returned
   * "countries" and "rest_of_world" fields will reflect the values for the default production
   * track.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean syncWithProduction;

  /**
   * A list of one or more countries where artifacts in this track are available. This list includes
   * all countries that are targeted by the track, even if only specific carriers are targeted in
   * that country.
   * @return value or {@code null} for none
   */
  public java.util.List<TrackTargetedCountry> getCountries() {
    return countries;
  }

  /**
   * A list of one or more countries where artifacts in this track are available. This list includes
   * all countries that are targeted by the track, even if only specific carriers are targeted in
   * that country.
   * @param countries countries or {@code null} for none
   */
  public TrackCountryAvailability setCountries(java.util.List<TrackTargetedCountry> countries) {
    this.countries = countries;
    return this;
  }

  /**
   * Whether artifacts in this track are available to "rest of the world" countries.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRestOfWorld() {
    return restOfWorld;
  }

  /**
   * Whether artifacts in this track are available to "rest of the world" countries.
   * @param restOfWorld restOfWorld or {@code null} for none
   */
  public TrackCountryAvailability setRestOfWorld(java.lang.Boolean restOfWorld) {
    this.restOfWorld = restOfWorld;
    return this;
  }

  /**
   * Whether this track's availability is synced with the default production track. See
   * https://support.google.com/googleplay/android-developer/answer/7550024 for more information on
   * syncing country availability with production. Note that if this is true, the returned
   * "countries" and "rest_of_world" fields will reflect the values for the default production
   * track.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSyncWithProduction() {
    return syncWithProduction;
  }

  /**
   * Whether this track's availability is synced with the default production track. See
   * https://support.google.com/googleplay/android-developer/answer/7550024 for more information on
   * syncing country availability with production. Note that if this is true, the returned
   * "countries" and "rest_of_world" fields will reflect the values for the default production
   * track.
   * @param syncWithProduction syncWithProduction or {@code null} for none
   */
  public TrackCountryAvailability setSyncWithProduction(java.lang.Boolean syncWithProduction) {
    this.syncWithProduction = syncWithProduction;
    return this;
  }

  @Override
  public TrackCountryAvailability set(String fieldName, Object value) {
    return (TrackCountryAvailability) super.set(fieldName, value);
  }

  @Override
  public TrackCountryAvailability clone() {
    return (TrackCountryAvailability) super.clone();
  }

}
