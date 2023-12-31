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

package com.google.api.services.docs.v1.model;

/**
 * Represents the styling that can be applied to text. Inherited text styles are represented as
 * unset fields in this message. A text style's parent depends on where the text style is defined: *
 * The TextStyle of text in a Paragraph inherits from the paragraph's corresponding named style
 * type. * The TextStyle on a named style inherits from the normal text named style. * The TextStyle
 * of the normal text named style inherits from the default text style in the Docs editor. * The
 * TextStyle on a Paragraph element that's contained in a table may inherit its text style from the
 * table style. If the text style does not inherit from a parent, unsetting fields will revert the
 * style to a value matching the defaults in the Docs editor.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TextStyle extends com.google.api.client.json.GenericJson {

  /**
   * The background color of the text. If set, the color is either an RGB color or transparent,
   * depending on the `color` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OptionalColor backgroundColor;

  /**
   * The text's vertical offset from its normal position. Text with `SUPERSCRIPT` or `SUBSCRIPT`
   * baseline offsets is automatically rendered in a smaller font size, computed based on the
   * `font_size` field. Changes in this field don't affect the `font_size`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String baselineOffset;

  /**
   * Whether or not the text is rendered as bold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean bold;

  /**
   * The size of the text's font.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension fontSize;

  /**
   * The foreground color of the text. If set, the color is either an RGB color or transparent,
   * depending on the `color` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OptionalColor foregroundColor;

  /**
   * Whether or not the text is italicized.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean italic;

  /**
   * The hyperlink destination of the text. If unset, there's no link. Links are not inherited from
   * parent text. Changing the link in an update request causes some other changes to the text style
   * of the range: * When setting a link, the text foreground color will be updated to the default
   * link color and the text will be underlined. If these fields are modified in the same request,
   * those values will be used instead of the link defaults. * Setting a link on a text range that
   * overlaps with an existing link will also update the existing link to point to the new URL. *
   * Links are not settable on newline characters. As a result, setting a link on a text range that
   * crosses a paragraph boundary, such as `"ABC\n123"`, will separate the newline character(s) into
   * their own text runs. The link will be applied separately to the runs before and after the
   * newline. * Removing a link will update the text style of the range to match the style of the
   * preceding text (or the default text styles if the preceding text is another link) unless
   * different styles are being set in the same request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Link link;

  /**
   * Whether or not the text is in small capital letters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean smallCaps;

  /**
   * Whether or not the text is struck through.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean strikethrough;

  /**
   * Whether or not the text is underlined.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean underline;

  /**
   * The font family and rendered weight of the text. If an update request specifies values for both
   * `weighted_font_family` and `bold`, the `weighted_font_family` is applied first, then `bold`. If
   * `weighted_font_family#weight` is not set, it defaults to `400`. If `weighted_font_family` is
   * set, then `weighted_font_family#font_family` must also be set with a non-empty value.
   * Otherwise, a 400 bad request error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WeightedFontFamily weightedFontFamily;

  /**
   * The background color of the text. If set, the color is either an RGB color or transparent,
   * depending on the `color` field.
   * @return value or {@code null} for none
   */
  public OptionalColor getBackgroundColor() {
    return backgroundColor;
  }

  /**
   * The background color of the text. If set, the color is either an RGB color or transparent,
   * depending on the `color` field.
   * @param backgroundColor backgroundColor or {@code null} for none
   */
  public TextStyle setBackgroundColor(OptionalColor backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * The text's vertical offset from its normal position. Text with `SUPERSCRIPT` or `SUBSCRIPT`
   * baseline offsets is automatically rendered in a smaller font size, computed based on the
   * `font_size` field. Changes in this field don't affect the `font_size`.
   * @return value or {@code null} for none
   */
  public java.lang.String getBaselineOffset() {
    return baselineOffset;
  }

  /**
   * The text's vertical offset from its normal position. Text with `SUPERSCRIPT` or `SUBSCRIPT`
   * baseline offsets is automatically rendered in a smaller font size, computed based on the
   * `font_size` field. Changes in this field don't affect the `font_size`.
   * @param baselineOffset baselineOffset or {@code null} for none
   */
  public TextStyle setBaselineOffset(java.lang.String baselineOffset) {
    this.baselineOffset = baselineOffset;
    return this;
  }

  /**
   * Whether or not the text is rendered as bold.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBold() {
    return bold;
  }

  /**
   * Whether or not the text is rendered as bold.
   * @param bold bold or {@code null} for none
   */
  public TextStyle setBold(java.lang.Boolean bold) {
    this.bold = bold;
    return this;
  }

  /**
   * The size of the text's font.
   * @return value or {@code null} for none
   */
  public Dimension getFontSize() {
    return fontSize;
  }

  /**
   * The size of the text's font.
   * @param fontSize fontSize or {@code null} for none
   */
  public TextStyle setFontSize(Dimension fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * The foreground color of the text. If set, the color is either an RGB color or transparent,
   * depending on the `color` field.
   * @return value or {@code null} for none
   */
  public OptionalColor getForegroundColor() {
    return foregroundColor;
  }

  /**
   * The foreground color of the text. If set, the color is either an RGB color or transparent,
   * depending on the `color` field.
   * @param foregroundColor foregroundColor or {@code null} for none
   */
  public TextStyle setForegroundColor(OptionalColor foregroundColor) {
    this.foregroundColor = foregroundColor;
    return this;
  }

  /**
   * Whether or not the text is italicized.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getItalic() {
    return italic;
  }

  /**
   * Whether or not the text is italicized.
   * @param italic italic or {@code null} for none
   */
  public TextStyle setItalic(java.lang.Boolean italic) {
    this.italic = italic;
    return this;
  }

  /**
   * The hyperlink destination of the text. If unset, there's no link. Links are not inherited from
   * parent text. Changing the link in an update request causes some other changes to the text style
   * of the range: * When setting a link, the text foreground color will be updated to the default
   * link color and the text will be underlined. If these fields are modified in the same request,
   * those values will be used instead of the link defaults. * Setting a link on a text range that
   * overlaps with an existing link will also update the existing link to point to the new URL. *
   * Links are not settable on newline characters. As a result, setting a link on a text range that
   * crosses a paragraph boundary, such as `"ABC\n123"`, will separate the newline character(s) into
   * their own text runs. The link will be applied separately to the runs before and after the
   * newline. * Removing a link will update the text style of the range to match the style of the
   * preceding text (or the default text styles if the preceding text is another link) unless
   * different styles are being set in the same request.
   * @return value or {@code null} for none
   */
  public Link getLink() {
    return link;
  }

  /**
   * The hyperlink destination of the text. If unset, there's no link. Links are not inherited from
   * parent text. Changing the link in an update request causes some other changes to the text style
   * of the range: * When setting a link, the text foreground color will be updated to the default
   * link color and the text will be underlined. If these fields are modified in the same request,
   * those values will be used instead of the link defaults. * Setting a link on a text range that
   * overlaps with an existing link will also update the existing link to point to the new URL. *
   * Links are not settable on newline characters. As a result, setting a link on a text range that
   * crosses a paragraph boundary, such as `"ABC\n123"`, will separate the newline character(s) into
   * their own text runs. The link will be applied separately to the runs before and after the
   * newline. * Removing a link will update the text style of the range to match the style of the
   * preceding text (or the default text styles if the preceding text is another link) unless
   * different styles are being set in the same request.
   * @param link link or {@code null} for none
   */
  public TextStyle setLink(Link link) {
    this.link = link;
    return this;
  }

  /**
   * Whether or not the text is in small capital letters.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSmallCaps() {
    return smallCaps;
  }

  /**
   * Whether or not the text is in small capital letters.
   * @param smallCaps smallCaps or {@code null} for none
   */
  public TextStyle setSmallCaps(java.lang.Boolean smallCaps) {
    this.smallCaps = smallCaps;
    return this;
  }

  /**
   * Whether or not the text is struck through.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStrikethrough() {
    return strikethrough;
  }

  /**
   * Whether or not the text is struck through.
   * @param strikethrough strikethrough or {@code null} for none
   */
  public TextStyle setStrikethrough(java.lang.Boolean strikethrough) {
    this.strikethrough = strikethrough;
    return this;
  }

  /**
   * Whether or not the text is underlined.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUnderline() {
    return underline;
  }

  /**
   * Whether or not the text is underlined.
   * @param underline underline or {@code null} for none
   */
  public TextStyle setUnderline(java.lang.Boolean underline) {
    this.underline = underline;
    return this;
  }

  /**
   * The font family and rendered weight of the text. If an update request specifies values for both
   * `weighted_font_family` and `bold`, the `weighted_font_family` is applied first, then `bold`. If
   * `weighted_font_family#weight` is not set, it defaults to `400`. If `weighted_font_family` is
   * set, then `weighted_font_family#font_family` must also be set with a non-empty value.
   * Otherwise, a 400 bad request error is returned.
   * @return value or {@code null} for none
   */
  public WeightedFontFamily getWeightedFontFamily() {
    return weightedFontFamily;
  }

  /**
   * The font family and rendered weight of the text. If an update request specifies values for both
   * `weighted_font_family` and `bold`, the `weighted_font_family` is applied first, then `bold`. If
   * `weighted_font_family#weight` is not set, it defaults to `400`. If `weighted_font_family` is
   * set, then `weighted_font_family#font_family` must also be set with a non-empty value.
   * Otherwise, a 400 bad request error is returned.
   * @param weightedFontFamily weightedFontFamily or {@code null} for none
   */
  public TextStyle setWeightedFontFamily(WeightedFontFamily weightedFontFamily) {
    this.weightedFontFamily = weightedFontFamily;
    return this;
  }

  @Override
  public TextStyle set(String fieldName, Object value) {
    return (TextStyle) super.set(fieldName, value);
  }

  @Override
  public TextStyle clone() {
    return (TextStyle) super.clone();
  }

}
