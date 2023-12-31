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

package com.google.api.services.mybusinesslodging.v1.model;

/**
 * Views available from the guest unit itself.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the My Business Lodging API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ViewsFromUnit extends com.google.api.client.json.GenericJson {

  /**
   * Beach view. A guestroom that features a window through which guests can see the beach.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean beachView;

  /**
   * Beach view exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String beachViewException;

  /**
   * City view. A guestroom that features a window through which guests can see the buildings, parks
   * and/or streets of the city.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cityView;

  /**
   * City view exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cityViewException;

  /**
   * Garden view. A guestroom that features a window through which guests can see a garden.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean gardenView;

  /**
   * Garden view exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gardenViewException;

  /**
   * Lake view.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean lakeView;

  /**
   * Lake view exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lakeViewException;

  /**
   * Landmark view. A guestroom that features a window through which guests can see a landmark such
   * as the countryside, a golf course, the forest, a park, a rain forst, a mountain or a slope.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean landmarkView;

  /**
   * Landmark view exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String landmarkViewException;

  /**
   * Ocean view. A guestroom that features a window through which guests can see the ocean.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean oceanView;

  /**
   * Ocean view exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oceanViewException;

  /**
   * Pool view. A guestroom that features a window through which guests can see the hotel's swimming
   * pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean poolView;

  /**
   * Pool view exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String poolViewException;

  /**
   * Valley view. A guestroom that features a window through which guests can see over a valley.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean valleyView;

  /**
   * Valley view exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valleyViewException;

  /**
   * Beach view. A guestroom that features a window through which guests can see the beach.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBeachView() {
    return beachView;
  }

  /**
   * Beach view. A guestroom that features a window through which guests can see the beach.
   * @param beachView beachView or {@code null} for none
   */
  public ViewsFromUnit setBeachView(java.lang.Boolean beachView) {
    this.beachView = beachView;
    return this;
  }

  /**
   * Beach view exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getBeachViewException() {
    return beachViewException;
  }

  /**
   * Beach view exception.
   * @param beachViewException beachViewException or {@code null} for none
   */
  public ViewsFromUnit setBeachViewException(java.lang.String beachViewException) {
    this.beachViewException = beachViewException;
    return this;
  }

  /**
   * City view. A guestroom that features a window through which guests can see the buildings, parks
   * and/or streets of the city.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCityView() {
    return cityView;
  }

  /**
   * City view. A guestroom that features a window through which guests can see the buildings, parks
   * and/or streets of the city.
   * @param cityView cityView or {@code null} for none
   */
  public ViewsFromUnit setCityView(java.lang.Boolean cityView) {
    this.cityView = cityView;
    return this;
  }

  /**
   * City view exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getCityViewException() {
    return cityViewException;
  }

  /**
   * City view exception.
   * @param cityViewException cityViewException or {@code null} for none
   */
  public ViewsFromUnit setCityViewException(java.lang.String cityViewException) {
    this.cityViewException = cityViewException;
    return this;
  }

  /**
   * Garden view. A guestroom that features a window through which guests can see a garden.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGardenView() {
    return gardenView;
  }

  /**
   * Garden view. A guestroom that features a window through which guests can see a garden.
   * @param gardenView gardenView or {@code null} for none
   */
  public ViewsFromUnit setGardenView(java.lang.Boolean gardenView) {
    this.gardenView = gardenView;
    return this;
  }

  /**
   * Garden view exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getGardenViewException() {
    return gardenViewException;
  }

  /**
   * Garden view exception.
   * @param gardenViewException gardenViewException or {@code null} for none
   */
  public ViewsFromUnit setGardenViewException(java.lang.String gardenViewException) {
    this.gardenViewException = gardenViewException;
    return this;
  }

  /**
   * Lake view.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLakeView() {
    return lakeView;
  }

  /**
   * Lake view.
   * @param lakeView lakeView or {@code null} for none
   */
  public ViewsFromUnit setLakeView(java.lang.Boolean lakeView) {
    this.lakeView = lakeView;
    return this;
  }

  /**
   * Lake view exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getLakeViewException() {
    return lakeViewException;
  }

  /**
   * Lake view exception.
   * @param lakeViewException lakeViewException or {@code null} for none
   */
  public ViewsFromUnit setLakeViewException(java.lang.String lakeViewException) {
    this.lakeViewException = lakeViewException;
    return this;
  }

  /**
   * Landmark view. A guestroom that features a window through which guests can see a landmark such
   * as the countryside, a golf course, the forest, a park, a rain forst, a mountain or a slope.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLandmarkView() {
    return landmarkView;
  }

  /**
   * Landmark view. A guestroom that features a window through which guests can see a landmark such
   * as the countryside, a golf course, the forest, a park, a rain forst, a mountain or a slope.
   * @param landmarkView landmarkView or {@code null} for none
   */
  public ViewsFromUnit setLandmarkView(java.lang.Boolean landmarkView) {
    this.landmarkView = landmarkView;
    return this;
  }

  /**
   * Landmark view exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getLandmarkViewException() {
    return landmarkViewException;
  }

  /**
   * Landmark view exception.
   * @param landmarkViewException landmarkViewException or {@code null} for none
   */
  public ViewsFromUnit setLandmarkViewException(java.lang.String landmarkViewException) {
    this.landmarkViewException = landmarkViewException;
    return this;
  }

  /**
   * Ocean view. A guestroom that features a window through which guests can see the ocean.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOceanView() {
    return oceanView;
  }

  /**
   * Ocean view. A guestroom that features a window through which guests can see the ocean.
   * @param oceanView oceanView or {@code null} for none
   */
  public ViewsFromUnit setOceanView(java.lang.Boolean oceanView) {
    this.oceanView = oceanView;
    return this;
  }

  /**
   * Ocean view exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getOceanViewException() {
    return oceanViewException;
  }

  /**
   * Ocean view exception.
   * @param oceanViewException oceanViewException or {@code null} for none
   */
  public ViewsFromUnit setOceanViewException(java.lang.String oceanViewException) {
    this.oceanViewException = oceanViewException;
    return this;
  }

  /**
   * Pool view. A guestroom that features a window through which guests can see the hotel's swimming
   * pool.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPoolView() {
    return poolView;
  }

  /**
   * Pool view. A guestroom that features a window through which guests can see the hotel's swimming
   * pool.
   * @param poolView poolView or {@code null} for none
   */
  public ViewsFromUnit setPoolView(java.lang.Boolean poolView) {
    this.poolView = poolView;
    return this;
  }

  /**
   * Pool view exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getPoolViewException() {
    return poolViewException;
  }

  /**
   * Pool view exception.
   * @param poolViewException poolViewException or {@code null} for none
   */
  public ViewsFromUnit setPoolViewException(java.lang.String poolViewException) {
    this.poolViewException = poolViewException;
    return this;
  }

  /**
   * Valley view. A guestroom that features a window through which guests can see over a valley.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getValleyView() {
    return valleyView;
  }

  /**
   * Valley view. A guestroom that features a window through which guests can see over a valley.
   * @param valleyView valleyView or {@code null} for none
   */
  public ViewsFromUnit setValleyView(java.lang.Boolean valleyView) {
    this.valleyView = valleyView;
    return this;
  }

  /**
   * Valley view exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getValleyViewException() {
    return valleyViewException;
  }

  /**
   * Valley view exception.
   * @param valleyViewException valleyViewException or {@code null} for none
   */
  public ViewsFromUnit setValleyViewException(java.lang.String valleyViewException) {
    this.valleyViewException = valleyViewException;
    return this;
  }

  @Override
  public ViewsFromUnit set(String fieldName, Object value) {
    return (ViewsFromUnit) super.set(fieldName, value);
  }

  @Override
  public ViewsFromUnit clone() {
    return (ViewsFromUnit) super.clone();
  }

}
