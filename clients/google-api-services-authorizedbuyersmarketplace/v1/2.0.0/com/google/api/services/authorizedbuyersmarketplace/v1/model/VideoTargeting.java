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

package com.google.api.services.authorizedbuyersmarketplace.v1.model;

/**
 * Represents targeting information about video.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Authorized Buyers Marketplace API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoTargeting extends com.google.api.client.json.GenericJson {

  /**
   * A list of video positions to be excluded. When this field is populated, the
   * targeted_position_types field must be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> excludedPositionTypes;

  /**
   * A list of video positions to be included. When this field is populated, the
   * excluded_position_types field must be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetedPositionTypes;

  /**
   * A list of video positions to be excluded. When this field is populated, the
   * targeted_position_types field must be empty.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExcludedPositionTypes() {
    return excludedPositionTypes;
  }

  /**
   * A list of video positions to be excluded. When this field is populated, the
   * targeted_position_types field must be empty.
   * @param excludedPositionTypes excludedPositionTypes or {@code null} for none
   */
  public VideoTargeting setExcludedPositionTypes(java.util.List<java.lang.String> excludedPositionTypes) {
    this.excludedPositionTypes = excludedPositionTypes;
    return this;
  }

  /**
   * A list of video positions to be included. When this field is populated, the
   * excluded_position_types field must be empty.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetedPositionTypes() {
    return targetedPositionTypes;
  }

  /**
   * A list of video positions to be included. When this field is populated, the
   * excluded_position_types field must be empty.
   * @param targetedPositionTypes targetedPositionTypes or {@code null} for none
   */
  public VideoTargeting setTargetedPositionTypes(java.util.List<java.lang.String> targetedPositionTypes) {
    this.targetedPositionTypes = targetedPositionTypes;
    return this;
  }

  @Override
  public VideoTargeting set(String fieldName, Object value) {
    return (VideoTargeting) super.set(fieldName, value);
  }

  @Override
  public VideoTargeting clone() {
    return (VideoTargeting) super.clone();
  }

}
