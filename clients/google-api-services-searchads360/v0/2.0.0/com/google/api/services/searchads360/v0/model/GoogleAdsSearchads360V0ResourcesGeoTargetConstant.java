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
 * A geo target constant.
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
public final class GoogleAdsSearchads360V0ResourcesGeoTargetConstant extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The fully qualified English name, consisting of the target's name and that of its
   * parent and country.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String canonicalName;

  /**
   * Output only. The ISO-3166-1 alpha-2 country code that is associated with the target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countryCode;

  /**
   * Output only. The ID of the geo target constant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Output only. Geo target constant English name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The resource name of the parent geo target constant. Geo target constant resource
   * names have the form: `geoTargetConstants/{parent_geo_target_constant_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentGeoTarget;

  /**
   * Output only. The resource name of the geo target constant. Geo target constant resource names
   * have the form: `geoTargetConstants/{geo_target_constant_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceName;

  /**
   * Output only. Geo target constant status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Output only. Geo target constant target type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetType;

  /**
   * Output only. The fully qualified English name, consisting of the target's name and that of its
   * parent and country.
   * @return value or {@code null} for none
   */
  public java.lang.String getCanonicalName() {
    return canonicalName;
  }

  /**
   * Output only. The fully qualified English name, consisting of the target's name and that of its
   * parent and country.
   * @param canonicalName canonicalName or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesGeoTargetConstant setCanonicalName(java.lang.String canonicalName) {
    this.canonicalName = canonicalName;
    return this;
  }

  /**
   * Output only. The ISO-3166-1 alpha-2 country code that is associated with the target.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountryCode() {
    return countryCode;
  }

  /**
   * Output only. The ISO-3166-1 alpha-2 country code that is associated with the target.
   * @param countryCode countryCode or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesGeoTargetConstant setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Output only. The ID of the geo target constant.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Output only. The ID of the geo target constant.
   * @param id id or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesGeoTargetConstant setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Output only. Geo target constant English name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Geo target constant English name.
   * @param name name or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesGeoTargetConstant setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The resource name of the parent geo target constant. Geo target constant resource
   * names have the form: `geoTargetConstants/{parent_geo_target_constant_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getParentGeoTarget() {
    return parentGeoTarget;
  }

  /**
   * Output only. The resource name of the parent geo target constant. Geo target constant resource
   * names have the form: `geoTargetConstants/{parent_geo_target_constant_id}`
   * @param parentGeoTarget parentGeoTarget or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesGeoTargetConstant setParentGeoTarget(java.lang.String parentGeoTarget) {
    this.parentGeoTarget = parentGeoTarget;
    return this;
  }

  /**
   * Output only. The resource name of the geo target constant. Geo target constant resource names
   * have the form: `geoTargetConstants/{geo_target_constant_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceName() {
    return resourceName;
  }

  /**
   * Output only. The resource name of the geo target constant. Geo target constant resource names
   * have the form: `geoTargetConstants/{geo_target_constant_id}`
   * @param resourceName resourceName or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesGeoTargetConstant setResourceName(java.lang.String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Output only. Geo target constant status.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Output only. Geo target constant status.
   * @param status status or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesGeoTargetConstant setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Output only. Geo target constant target type.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetType() {
    return targetType;
  }

  /**
   * Output only. Geo target constant target type.
   * @param targetType targetType or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesGeoTargetConstant setTargetType(java.lang.String targetType) {
    this.targetType = targetType;
    return this;
  }

  @Override
  public GoogleAdsSearchads360V0ResourcesGeoTargetConstant set(String fieldName, Object value) {
    return (GoogleAdsSearchads360V0ResourcesGeoTargetConstant) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsSearchads360V0ResourcesGeoTargetConstant clone() {
    return (GoogleAdsSearchads360V0ResourcesGeoTargetConstant) super.clone();
  }

}
