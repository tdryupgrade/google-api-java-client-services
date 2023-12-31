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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Geo information used for rendering a map that shows the user's work location.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MapInfo extends com.google.api.client.json.GenericJson {

  /**
   * Latitude in degrees
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double lat;

  /**
   * URL to a view of a map centered on the user's work location in Campus Maps (for google.com) or
   * Google Maps (external).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SafeUrlProto locationUrl;

  /**
   * Longitude in degrees
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("long")
  private java.lang.Double long__;

  /**
   * MapTiles for the area around a user's work location
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MapTile> mapTile;

  /**
   * The zoom level of the map. A constant zoom value of 18 is used for now to match the zoom of the
   * map shown on a Moma Teams Profile page
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer zoom;

  /**
   * Latitude in degrees
   * @return value or {@code null} for none
   */
  public java.lang.Double getLat() {
    return lat;
  }

  /**
   * Latitude in degrees
   * @param lat lat or {@code null} for none
   */
  public MapInfo setLat(java.lang.Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * URL to a view of a map centered on the user's work location in Campus Maps (for google.com) or
   * Google Maps (external).
   * @return value or {@code null} for none
   */
  public SafeUrlProto getLocationUrl() {
    return locationUrl;
  }

  /**
   * URL to a view of a map centered on the user's work location in Campus Maps (for google.com) or
   * Google Maps (external).
   * @param locationUrl locationUrl or {@code null} for none
   */
  public MapInfo setLocationUrl(SafeUrlProto locationUrl) {
    this.locationUrl = locationUrl;
    return this;
  }

  /**
   * Longitude in degrees
   * @return value or {@code null} for none
   */
  public java.lang.Double getLong() {
    return long__;
  }

  /**
   * Longitude in degrees
   * @param long__ long__ or {@code null} for none
   */
  public MapInfo setLong(java.lang.Double long__) {
    this.long__ = long__;
    return this;
  }

  /**
   * MapTiles for the area around a user's work location
   * @return value or {@code null} for none
   */
  public java.util.List<MapTile> getMapTile() {
    return mapTile;
  }

  /**
   * MapTiles for the area around a user's work location
   * @param mapTile mapTile or {@code null} for none
   */
  public MapInfo setMapTile(java.util.List<MapTile> mapTile) {
    this.mapTile = mapTile;
    return this;
  }

  /**
   * The zoom level of the map. A constant zoom value of 18 is used for now to match the zoom of the
   * map shown on a Moma Teams Profile page
   * @return value or {@code null} for none
   */
  public java.lang.Integer getZoom() {
    return zoom;
  }

  /**
   * The zoom level of the map. A constant zoom value of 18 is used for now to match the zoom of the
   * map shown on a Moma Teams Profile page
   * @param zoom zoom or {@code null} for none
   */
  public MapInfo setZoom(java.lang.Integer zoom) {
    this.zoom = zoom;
    return this;
  }

  @Override
  public MapInfo set(String fieldName, Object value) {
    return (MapInfo) super.set(fieldName, value);
  }

  @Override
  public MapInfo clone() {
    return (MapInfo) super.clone();
  }

}
