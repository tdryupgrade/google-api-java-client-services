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
 * Model definition for KeyValue.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KeyValue extends com.google.api.client.json.GenericJson {

  /**
   * Formatted text supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bottomLabel;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Button button;

  /**
   * Formatted text supported and always required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean contentMultiline;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IconImage endIcon;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String icon;

  /**
   * The alternative text of this icon_url which will be used for accessibility.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iconAltText;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iconUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageStyle;

  /**
   * Only the top/bottom label + content region is clickable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OnClick onClick;

  /**
   * The optional icon to display before the text content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IconImage startIcon;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SwitchWidget switchWidget;

  /**
   * Formatted text supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topLabel;

  /**
   * Formatted text supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getBottomLabel() {
    return bottomLabel;
  }

  /**
   * Formatted text supported.
   * @param bottomLabel bottomLabel or {@code null} for none
   */
  public KeyValue setBottomLabel(java.lang.String bottomLabel) {
    this.bottomLabel = bottomLabel;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Button getButton() {
    return button;
  }

  /**
   * @param button button or {@code null} for none
   */
  public KeyValue setButton(Button button) {
    this.button = button;
    return this;
  }

  /**
   * Formatted text supported and always required.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Formatted text supported and always required.
   * @param content content or {@code null} for none
   */
  public KeyValue setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getContentMultiline() {
    return contentMultiline;
  }

  /**
   * @param contentMultiline contentMultiline or {@code null} for none
   */
  public KeyValue setContentMultiline(java.lang.Boolean contentMultiline) {
    this.contentMultiline = contentMultiline;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public IconImage getEndIcon() {
    return endIcon;
  }

  /**
   * @param endIcon endIcon or {@code null} for none
   */
  public KeyValue setEndIcon(IconImage endIcon) {
    this.endIcon = endIcon;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIcon() {
    return icon;
  }

  /**
   * @param icon icon or {@code null} for none
   */
  public KeyValue setIcon(java.lang.String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * The alternative text of this icon_url which will be used for accessibility.
   * @return value or {@code null} for none
   */
  public java.lang.String getIconAltText() {
    return iconAltText;
  }

  /**
   * The alternative text of this icon_url which will be used for accessibility.
   * @param iconAltText iconAltText or {@code null} for none
   */
  public KeyValue setIconAltText(java.lang.String iconAltText) {
    this.iconAltText = iconAltText;
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
  public KeyValue setIconUrl(java.lang.String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImageStyle() {
    return imageStyle;
  }

  /**
   * @param imageStyle imageStyle or {@code null} for none
   */
  public KeyValue setImageStyle(java.lang.String imageStyle) {
    this.imageStyle = imageStyle;
    return this;
  }

  /**
   * Only the top/bottom label + content region is clickable.
   * @return value or {@code null} for none
   */
  public OnClick getOnClick() {
    return onClick;
  }

  /**
   * Only the top/bottom label + content region is clickable.
   * @param onClick onClick or {@code null} for none
   */
  public KeyValue setOnClick(OnClick onClick) {
    this.onClick = onClick;
    return this;
  }

  /**
   * The optional icon to display before the text content.
   * @return value or {@code null} for none
   */
  public IconImage getStartIcon() {
    return startIcon;
  }

  /**
   * The optional icon to display before the text content.
   * @param startIcon startIcon or {@code null} for none
   */
  public KeyValue setStartIcon(IconImage startIcon) {
    this.startIcon = startIcon;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public SwitchWidget getSwitchWidget() {
    return switchWidget;
  }

  /**
   * @param switchWidget switchWidget or {@code null} for none
   */
  public KeyValue setSwitchWidget(SwitchWidget switchWidget) {
    this.switchWidget = switchWidget;
    return this;
  }

  /**
   * Formatted text supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getTopLabel() {
    return topLabel;
  }

  /**
   * Formatted text supported.
   * @param topLabel topLabel or {@code null} for none
   */
  public KeyValue setTopLabel(java.lang.String topLabel) {
    this.topLabel = topLabel;
    return this;
  }

  @Override
  public KeyValue set(String fieldName, Object value) {
    return (KeyValue) super.set(fieldName, value);
  }

  @Override
  public KeyValue clone() {
    return (KeyValue) super.clone();
  }

}
