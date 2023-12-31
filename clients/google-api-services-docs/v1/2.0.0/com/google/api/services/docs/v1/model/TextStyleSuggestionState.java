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
 * A mask that indicates which of the fields on the base TextStyle have been changed in this
 * suggestion. For any field set to true, there's a new suggested value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TextStyleSuggestionState extends com.google.api.client.json.GenericJson {

  /**
   * Indicates if there was a suggested change to background_color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean backgroundColorSuggested;

  /**
   * Indicates if there was a suggested change to baseline_offset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean baselineOffsetSuggested;

  /**
   * Indicates if there was a suggested change to bold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean boldSuggested;

  /**
   * Indicates if there was a suggested change to font_size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean fontSizeSuggested;

  /**
   * Indicates if there was a suggested change to foreground_color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean foregroundColorSuggested;

  /**
   * Indicates if there was a suggested change to italic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean italicSuggested;

  /**
   * Indicates if there was a suggested change to link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean linkSuggested;

  /**
   * Indicates if there was a suggested change to small_caps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean smallCapsSuggested;

  /**
   * Indicates if there was a suggested change to strikethrough.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean strikethroughSuggested;

  /**
   * Indicates if there was a suggested change to underline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean underlineSuggested;

  /**
   * Indicates if there was a suggested change to weighted_font_family.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean weightedFontFamilySuggested;

  /**
   * Indicates if there was a suggested change to background_color.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBackgroundColorSuggested() {
    return backgroundColorSuggested;
  }

  /**
   * Indicates if there was a suggested change to background_color.
   * @param backgroundColorSuggested backgroundColorSuggested or {@code null} for none
   */
  public TextStyleSuggestionState setBackgroundColorSuggested(java.lang.Boolean backgroundColorSuggested) {
    this.backgroundColorSuggested = backgroundColorSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to baseline_offset.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBaselineOffsetSuggested() {
    return baselineOffsetSuggested;
  }

  /**
   * Indicates if there was a suggested change to baseline_offset.
   * @param baselineOffsetSuggested baselineOffsetSuggested or {@code null} for none
   */
  public TextStyleSuggestionState setBaselineOffsetSuggested(java.lang.Boolean baselineOffsetSuggested) {
    this.baselineOffsetSuggested = baselineOffsetSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to bold.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBoldSuggested() {
    return boldSuggested;
  }

  /**
   * Indicates if there was a suggested change to bold.
   * @param boldSuggested boldSuggested or {@code null} for none
   */
  public TextStyleSuggestionState setBoldSuggested(java.lang.Boolean boldSuggested) {
    this.boldSuggested = boldSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to font_size.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFontSizeSuggested() {
    return fontSizeSuggested;
  }

  /**
   * Indicates if there was a suggested change to font_size.
   * @param fontSizeSuggested fontSizeSuggested or {@code null} for none
   */
  public TextStyleSuggestionState setFontSizeSuggested(java.lang.Boolean fontSizeSuggested) {
    this.fontSizeSuggested = fontSizeSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to foreground_color.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getForegroundColorSuggested() {
    return foregroundColorSuggested;
  }

  /**
   * Indicates if there was a suggested change to foreground_color.
   * @param foregroundColorSuggested foregroundColorSuggested or {@code null} for none
   */
  public TextStyleSuggestionState setForegroundColorSuggested(java.lang.Boolean foregroundColorSuggested) {
    this.foregroundColorSuggested = foregroundColorSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to italic.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getItalicSuggested() {
    return italicSuggested;
  }

  /**
   * Indicates if there was a suggested change to italic.
   * @param italicSuggested italicSuggested or {@code null} for none
   */
  public TextStyleSuggestionState setItalicSuggested(java.lang.Boolean italicSuggested) {
    this.italicSuggested = italicSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to link.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLinkSuggested() {
    return linkSuggested;
  }

  /**
   * Indicates if there was a suggested change to link.
   * @param linkSuggested linkSuggested or {@code null} for none
   */
  public TextStyleSuggestionState setLinkSuggested(java.lang.Boolean linkSuggested) {
    this.linkSuggested = linkSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to small_caps.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSmallCapsSuggested() {
    return smallCapsSuggested;
  }

  /**
   * Indicates if there was a suggested change to small_caps.
   * @param smallCapsSuggested smallCapsSuggested or {@code null} for none
   */
  public TextStyleSuggestionState setSmallCapsSuggested(java.lang.Boolean smallCapsSuggested) {
    this.smallCapsSuggested = smallCapsSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to strikethrough.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStrikethroughSuggested() {
    return strikethroughSuggested;
  }

  /**
   * Indicates if there was a suggested change to strikethrough.
   * @param strikethroughSuggested strikethroughSuggested or {@code null} for none
   */
  public TextStyleSuggestionState setStrikethroughSuggested(java.lang.Boolean strikethroughSuggested) {
    this.strikethroughSuggested = strikethroughSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to underline.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUnderlineSuggested() {
    return underlineSuggested;
  }

  /**
   * Indicates if there was a suggested change to underline.
   * @param underlineSuggested underlineSuggested or {@code null} for none
   */
  public TextStyleSuggestionState setUnderlineSuggested(java.lang.Boolean underlineSuggested) {
    this.underlineSuggested = underlineSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to weighted_font_family.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWeightedFontFamilySuggested() {
    return weightedFontFamilySuggested;
  }

  /**
   * Indicates if there was a suggested change to weighted_font_family.
   * @param weightedFontFamilySuggested weightedFontFamilySuggested or {@code null} for none
   */
  public TextStyleSuggestionState setWeightedFontFamilySuggested(java.lang.Boolean weightedFontFamilySuggested) {
    this.weightedFontFamilySuggested = weightedFontFamilySuggested;
    return this;
  }

  @Override
  public TextStyleSuggestionState set(String fieldName, Object value) {
    return (TextStyleSuggestionState) super.set(fieldName, value);
  }

  @Override
  public TextStyleSuggestionState clone() {
    return (TextStyleSuggestionState) super.clone();
  }

}
