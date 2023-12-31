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
 * The color derived from BadgeConfig and coerced to the nearest supported color.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Labels API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsDriveLabelsV2BadgeColors extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Badge background which pairs with the foreground
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeColor backgroundColor;

  /**
   * Output only. Badge foreground which pairs with the background
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeColor foregroundColor;

  /**
   * Output only. Color that can be used for text without a background
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeColor soloColor;

  /**
   * Output only. Badge background which pairs with the foreground
   * @return value or {@code null} for none
   */
  public GoogleTypeColor getBackgroundColor() {
    return backgroundColor;
  }

  /**
   * Output only. Badge background which pairs with the foreground
   * @param backgroundColor backgroundColor or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2BadgeColors setBackgroundColor(GoogleTypeColor backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Output only. Badge foreground which pairs with the background
   * @return value or {@code null} for none
   */
  public GoogleTypeColor getForegroundColor() {
    return foregroundColor;
  }

  /**
   * Output only. Badge foreground which pairs with the background
   * @param foregroundColor foregroundColor or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2BadgeColors setForegroundColor(GoogleTypeColor foregroundColor) {
    this.foregroundColor = foregroundColor;
    return this;
  }

  /**
   * Output only. Color that can be used for text without a background
   * @return value or {@code null} for none
   */
  public GoogleTypeColor getSoloColor() {
    return soloColor;
  }

  /**
   * Output only. Color that can be used for text without a background
   * @param soloColor soloColor or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2BadgeColors setSoloColor(GoogleTypeColor soloColor) {
    this.soloColor = soloColor;
    return this;
  }

  @Override
  public GoogleAppsDriveLabelsV2BadgeColors set(String fieldName, Object value) {
    return (GoogleAppsDriveLabelsV2BadgeColors) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsDriveLabelsV2BadgeColors clone() {
    return (GoogleAppsDriveLabelsV2BadgeColors) super.clone();
  }

}
