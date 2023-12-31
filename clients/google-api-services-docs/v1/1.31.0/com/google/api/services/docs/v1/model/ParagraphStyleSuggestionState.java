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
 * A mask that indicates which of the fields on the base ParagraphStyle have been changed in this
 * suggestion. For any field set to true, there is a new suggested value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ParagraphStyleSuggestionState extends com.google.api.client.json.GenericJson {

  /**
   * Indicates if there was a suggested change to alignment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean alignmentSuggested;

  /**
   * Indicates if there was a suggested change to avoid_widow_and_orphan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean avoidWidowAndOrphanSuggested;

  /**
   * Indicates if there was a suggested change to border_between.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean borderBetweenSuggested;

  /**
   * Indicates if there was a suggested change to border_bottom.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean borderBottomSuggested;

  /**
   * Indicates if there was a suggested change to border_left.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean borderLeftSuggested;

  /**
   * Indicates if there was a suggested change to border_right.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean borderRightSuggested;

  /**
   * Indicates if there was a suggested change to border_top.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean borderTopSuggested;

  /**
   * Indicates if there was a suggested change to direction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean directionSuggested;

  /**
   * Indicates if there was a suggested change to heading_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean headingIdSuggested;

  /**
   * Indicates if there was a suggested change to indent_end.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean indentEndSuggested;

  /**
   * Indicates if there was a suggested change to indent_first_line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean indentFirstLineSuggested;

  /**
   * Indicates if there was a suggested change to indent_start.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean indentStartSuggested;

  /**
   * Indicates if there was a suggested change to keep_lines_together.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean keepLinesTogetherSuggested;

  /**
   * Indicates if there was a suggested change to keep_with_next.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean keepWithNextSuggested;

  /**
   * Indicates if there was a suggested change to line_spacing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean lineSpacingSuggested;

  /**
   * Indicates if there was a suggested change to named_style_type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean namedStyleTypeSuggested;

  /**
   * Indicates if there was a suggested change to page_break_before.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean pageBreakBeforeSuggested;

  /**
   * A mask that indicates which of the fields in shading have been changed in this suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShadingSuggestionState shadingSuggestionState;

  /**
   * Indicates if there was a suggested change to space_above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean spaceAboveSuggested;

  /**
   * Indicates if there was a suggested change to space_below.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean spaceBelowSuggested;

  /**
   * Indicates if there was a suggested change to spacing_mode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean spacingModeSuggested;

  /**
   * Indicates if there was a suggested change to alignment.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAlignmentSuggested() {
    return alignmentSuggested;
  }

  /**
   * Indicates if there was a suggested change to alignment.
   * @param alignmentSuggested alignmentSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setAlignmentSuggested(java.lang.Boolean alignmentSuggested) {
    this.alignmentSuggested = alignmentSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to avoid_widow_and_orphan.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAvoidWidowAndOrphanSuggested() {
    return avoidWidowAndOrphanSuggested;
  }

  /**
   * Indicates if there was a suggested change to avoid_widow_and_orphan.
   * @param avoidWidowAndOrphanSuggested avoidWidowAndOrphanSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setAvoidWidowAndOrphanSuggested(java.lang.Boolean avoidWidowAndOrphanSuggested) {
    this.avoidWidowAndOrphanSuggested = avoidWidowAndOrphanSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to border_between.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBorderBetweenSuggested() {
    return borderBetweenSuggested;
  }

  /**
   * Indicates if there was a suggested change to border_between.
   * @param borderBetweenSuggested borderBetweenSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setBorderBetweenSuggested(java.lang.Boolean borderBetweenSuggested) {
    this.borderBetweenSuggested = borderBetweenSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to border_bottom.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBorderBottomSuggested() {
    return borderBottomSuggested;
  }

  /**
   * Indicates if there was a suggested change to border_bottom.
   * @param borderBottomSuggested borderBottomSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setBorderBottomSuggested(java.lang.Boolean borderBottomSuggested) {
    this.borderBottomSuggested = borderBottomSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to border_left.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBorderLeftSuggested() {
    return borderLeftSuggested;
  }

  /**
   * Indicates if there was a suggested change to border_left.
   * @param borderLeftSuggested borderLeftSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setBorderLeftSuggested(java.lang.Boolean borderLeftSuggested) {
    this.borderLeftSuggested = borderLeftSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to border_right.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBorderRightSuggested() {
    return borderRightSuggested;
  }

  /**
   * Indicates if there was a suggested change to border_right.
   * @param borderRightSuggested borderRightSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setBorderRightSuggested(java.lang.Boolean borderRightSuggested) {
    this.borderRightSuggested = borderRightSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to border_top.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBorderTopSuggested() {
    return borderTopSuggested;
  }

  /**
   * Indicates if there was a suggested change to border_top.
   * @param borderTopSuggested borderTopSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setBorderTopSuggested(java.lang.Boolean borderTopSuggested) {
    this.borderTopSuggested = borderTopSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to direction.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDirectionSuggested() {
    return directionSuggested;
  }

  /**
   * Indicates if there was a suggested change to direction.
   * @param directionSuggested directionSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setDirectionSuggested(java.lang.Boolean directionSuggested) {
    this.directionSuggested = directionSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to heading_id.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHeadingIdSuggested() {
    return headingIdSuggested;
  }

  /**
   * Indicates if there was a suggested change to heading_id.
   * @param headingIdSuggested headingIdSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setHeadingIdSuggested(java.lang.Boolean headingIdSuggested) {
    this.headingIdSuggested = headingIdSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to indent_end.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIndentEndSuggested() {
    return indentEndSuggested;
  }

  /**
   * Indicates if there was a suggested change to indent_end.
   * @param indentEndSuggested indentEndSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setIndentEndSuggested(java.lang.Boolean indentEndSuggested) {
    this.indentEndSuggested = indentEndSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to indent_first_line.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIndentFirstLineSuggested() {
    return indentFirstLineSuggested;
  }

  /**
   * Indicates if there was a suggested change to indent_first_line.
   * @param indentFirstLineSuggested indentFirstLineSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setIndentFirstLineSuggested(java.lang.Boolean indentFirstLineSuggested) {
    this.indentFirstLineSuggested = indentFirstLineSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to indent_start.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIndentStartSuggested() {
    return indentStartSuggested;
  }

  /**
   * Indicates if there was a suggested change to indent_start.
   * @param indentStartSuggested indentStartSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setIndentStartSuggested(java.lang.Boolean indentStartSuggested) {
    this.indentStartSuggested = indentStartSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to keep_lines_together.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getKeepLinesTogetherSuggested() {
    return keepLinesTogetherSuggested;
  }

  /**
   * Indicates if there was a suggested change to keep_lines_together.
   * @param keepLinesTogetherSuggested keepLinesTogetherSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setKeepLinesTogetherSuggested(java.lang.Boolean keepLinesTogetherSuggested) {
    this.keepLinesTogetherSuggested = keepLinesTogetherSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to keep_with_next.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getKeepWithNextSuggested() {
    return keepWithNextSuggested;
  }

  /**
   * Indicates if there was a suggested change to keep_with_next.
   * @param keepWithNextSuggested keepWithNextSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setKeepWithNextSuggested(java.lang.Boolean keepWithNextSuggested) {
    this.keepWithNextSuggested = keepWithNextSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to line_spacing.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLineSpacingSuggested() {
    return lineSpacingSuggested;
  }

  /**
   * Indicates if there was a suggested change to line_spacing.
   * @param lineSpacingSuggested lineSpacingSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setLineSpacingSuggested(java.lang.Boolean lineSpacingSuggested) {
    this.lineSpacingSuggested = lineSpacingSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to named_style_type.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNamedStyleTypeSuggested() {
    return namedStyleTypeSuggested;
  }

  /**
   * Indicates if there was a suggested change to named_style_type.
   * @param namedStyleTypeSuggested namedStyleTypeSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setNamedStyleTypeSuggested(java.lang.Boolean namedStyleTypeSuggested) {
    this.namedStyleTypeSuggested = namedStyleTypeSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to page_break_before.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPageBreakBeforeSuggested() {
    return pageBreakBeforeSuggested;
  }

  /**
   * Indicates if there was a suggested change to page_break_before.
   * @param pageBreakBeforeSuggested pageBreakBeforeSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setPageBreakBeforeSuggested(java.lang.Boolean pageBreakBeforeSuggested) {
    this.pageBreakBeforeSuggested = pageBreakBeforeSuggested;
    return this;
  }

  /**
   * A mask that indicates which of the fields in shading have been changed in this suggestion.
   * @return value or {@code null} for none
   */
  public ShadingSuggestionState getShadingSuggestionState() {
    return shadingSuggestionState;
  }

  /**
   * A mask that indicates which of the fields in shading have been changed in this suggestion.
   * @param shadingSuggestionState shadingSuggestionState or {@code null} for none
   */
  public ParagraphStyleSuggestionState setShadingSuggestionState(ShadingSuggestionState shadingSuggestionState) {
    this.shadingSuggestionState = shadingSuggestionState;
    return this;
  }

  /**
   * Indicates if there was a suggested change to space_above.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSpaceAboveSuggested() {
    return spaceAboveSuggested;
  }

  /**
   * Indicates if there was a suggested change to space_above.
   * @param spaceAboveSuggested spaceAboveSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setSpaceAboveSuggested(java.lang.Boolean spaceAboveSuggested) {
    this.spaceAboveSuggested = spaceAboveSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to space_below.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSpaceBelowSuggested() {
    return spaceBelowSuggested;
  }

  /**
   * Indicates if there was a suggested change to space_below.
   * @param spaceBelowSuggested spaceBelowSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setSpaceBelowSuggested(java.lang.Boolean spaceBelowSuggested) {
    this.spaceBelowSuggested = spaceBelowSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to spacing_mode.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSpacingModeSuggested() {
    return spacingModeSuggested;
  }

  /**
   * Indicates if there was a suggested change to spacing_mode.
   * @param spacingModeSuggested spacingModeSuggested or {@code null} for none
   */
  public ParagraphStyleSuggestionState setSpacingModeSuggested(java.lang.Boolean spacingModeSuggested) {
    this.spacingModeSuggested = spacingModeSuggested;
    return this;
  }

  @Override
  public ParagraphStyleSuggestionState set(String fieldName, Object value) {
    return (ParagraphStyleSuggestionState) super.set(fieldName, value);
  }

  @Override
  public ParagraphStyleSuggestionState clone() {
    return (ParagraphStyleSuggestionState) super.clone();
  }

}
