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
 * Model definition for ImageButton.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImageButton extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String icon;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iconUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OnClick onClick;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIcon() {
    return icon;
  }

  /**
   * @param icon icon or {@code null} for none
   */
  public ImageButton setIcon(java.lang.String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIconUrl() {
    return iconUrl;
  }

  /**
   * @param iconUrl iconUrl or {@code null} for none
   */
  public ImageButton setIconUrl(java.lang.String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public ImageButton setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public OnClick getOnClick() {
    return onClick;
  }

  /**
   * @param onClick onClick or {@code null} for none
   */
  public ImageButton setOnClick(OnClick onClick) {
    this.onClick = onClick;
    return this;
  }

  @Override
  public ImageButton set(String fieldName, Object value) {
    return (ImageButton) super.set(fieldName, value);
  }

  @Override
  public ImageButton clone() {
    return (ImageButton) super.clone();
  }

}
