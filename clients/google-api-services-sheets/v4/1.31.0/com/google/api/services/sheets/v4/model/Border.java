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

package com.google.api.services.sheets.v4.model;

/**
 * A border along a cell.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Border extends com.google.api.client.json.GenericJson {

  /**
   * The color of the border. Deprecated: Use color_style.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color color;

  /**
   * The color of the border. If color is also set, this field takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ColorStyle colorStyle;

  /**
   * The style of the border.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String style;

  /**
   * The width of the border, in pixels. Deprecated; the width is determined by the "style" field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * The color of the border. Deprecated: Use color_style.
   * @return value or {@code null} for none
   */
  public Color getColor() {
    return color;
  }

  /**
   * The color of the border. Deprecated: Use color_style.
   * @param color color or {@code null} for none
   */
  public Border setColor(Color color) {
    this.color = color;
    return this;
  }

  /**
   * The color of the border. If color is also set, this field takes precedence.
   * @return value or {@code null} for none
   */
  public ColorStyle getColorStyle() {
    return colorStyle;
  }

  /**
   * The color of the border. If color is also set, this field takes precedence.
   * @param colorStyle colorStyle or {@code null} for none
   */
  public Border setColorStyle(ColorStyle colorStyle) {
    this.colorStyle = colorStyle;
    return this;
  }

  /**
   * The style of the border.
   * @return value or {@code null} for none
   */
  public java.lang.String getStyle() {
    return style;
  }

  /**
   * The style of the border.
   * @param style style or {@code null} for none
   */
  public Border setStyle(java.lang.String style) {
    this.style = style;
    return this;
  }

  /**
   * The width of the border, in pixels. Deprecated; the width is determined by the "style" field.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * The width of the border, in pixels. Deprecated; the width is determined by the "style" field.
   * @param width width or {@code null} for none
   */
  public Border setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public Border set(String fieldName, Object value) {
    return (Border) super.set(fieldName, value);
  }

  @Override
  public Border clone() {
    return (Border) super.clone();
  }

}
