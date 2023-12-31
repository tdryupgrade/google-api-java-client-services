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

package com.google.api.services.drivelabels.v2.model;

/**
 * Badge status of the label.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Labels API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsDriveLabelsV2BadgeConfig extends com.google.api.client.json.GenericJson {

  /**
   * The color of the badge. When not specified, no badge will be rendered. This color will be
   * coerced into the closest recommended supported color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeColor color;

  /**
   * Override the default global priority of this badge. When set to 0, the default priority
   * heuristic will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long priorityOverride;

  /**
   * The color of the badge. When not specified, no badge will be rendered. This color will be
   * coerced into the closest recommended supported color.
   * @return value or {@code null} for none
   */
  public GoogleTypeColor getColor() {
    return color;
  }

  /**
   * The color of the badge. When not specified, no badge will be rendered. This color will be
   * coerced into the closest recommended supported color.
   * @param color color or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2BadgeConfig setColor(GoogleTypeColor color) {
    this.color = color;
    return this;
  }

  /**
   * Override the default global priority of this badge. When set to 0, the default priority
   * heuristic will be used.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPriorityOverride() {
    return priorityOverride;
  }

  /**
   * Override the default global priority of this badge. When set to 0, the default priority
   * heuristic will be used.
   * @param priorityOverride priorityOverride or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2BadgeConfig setPriorityOverride(java.lang.Long priorityOverride) {
    this.priorityOverride = priorityOverride;
    return this;
  }

  @Override
  public GoogleAppsDriveLabelsV2BadgeConfig set(String fieldName, Object value) {
    return (GoogleAppsDriveLabelsV2BadgeConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsDriveLabelsV2BadgeConfig clone() {
    return (GoogleAppsDriveLabelsV2BadgeConfig) super.clone();
  }

}
