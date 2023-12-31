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
 * Properties of a sheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SheetProperties extends com.google.api.client.json.GenericJson {

  /**
   * Output only. If present, the field contains DATA_SOURCE sheet specific properties.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DataSourceSheetProperties dataSourceSheetProperties;

  /**
   * Additional properties of the sheet if this sheet is a grid. (If the sheet is an object sheet,
   * containing a chart or image, then this field will be absent.) When writing it is an error to
   * set any grid properties on non-grid sheets. If this sheet is a DATA_SOURCE sheet, this field is
   * output only but contains the properties that reflect how a data source sheet is rendered in the
   * UI, e.g. row_count.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridProperties gridProperties;

  /**
   * True if the sheet is hidden in the UI, false if it's visible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hidden;

  /**
   * The index of the sheet within the spreadsheet. When adding or updating sheet properties, if
   * this field is excluded then the sheet is added or moved to the end of the sheet list. When
   * updating sheet indices or inserting sheets, movement is considered in "before the move"
   * indexes. For example, if there were three sheets (S1, S2, S3) in order to move S1 ahead of S2
   * the index would have to be set to 2. A sheet index update request is ignored if the requested
   * index is identical to the sheets current index or if the requested new index is equal to the
   * current sheet index + 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer index;

  /**
   * True if the sheet is an RTL sheet instead of an LTR sheet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean rightToLeft;

  /**
   * The ID of the sheet. Must be non-negative. This field cannot be changed once set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sheetId;

  /**
   * The type of sheet. Defaults to GRID. This field cannot be changed once set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sheetType;

  /**
   * The color of the tab in the UI. Deprecated: Use tab_color_style.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color tabColor;

  /**
   * The color of the tab in the UI. If tab_color is also set, this field takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ColorStyle tabColorStyle;

  /**
   * The name of the sheet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Output only. If present, the field contains DATA_SOURCE sheet specific properties.
   * @return value or {@code null} for none
   */
  public DataSourceSheetProperties getDataSourceSheetProperties() {
    return dataSourceSheetProperties;
  }

  /**
   * Output only. If present, the field contains DATA_SOURCE sheet specific properties.
   * @param dataSourceSheetProperties dataSourceSheetProperties or {@code null} for none
   */
  public SheetProperties setDataSourceSheetProperties(DataSourceSheetProperties dataSourceSheetProperties) {
    this.dataSourceSheetProperties = dataSourceSheetProperties;
    return this;
  }

  /**
   * Additional properties of the sheet if this sheet is a grid. (If the sheet is an object sheet,
   * containing a chart or image, then this field will be absent.) When writing it is an error to
   * set any grid properties on non-grid sheets. If this sheet is a DATA_SOURCE sheet, this field is
   * output only but contains the properties that reflect how a data source sheet is rendered in the
   * UI, e.g. row_count.
   * @return value or {@code null} for none
   */
  public GridProperties getGridProperties() {
    return gridProperties;
  }

  /**
   * Additional properties of the sheet if this sheet is a grid. (If the sheet is an object sheet,
   * containing a chart or image, then this field will be absent.) When writing it is an error to
   * set any grid properties on non-grid sheets. If this sheet is a DATA_SOURCE sheet, this field is
   * output only but contains the properties that reflect how a data source sheet is rendered in the
   * UI, e.g. row_count.
   * @param gridProperties gridProperties or {@code null} for none
   */
  public SheetProperties setGridProperties(GridProperties gridProperties) {
    this.gridProperties = gridProperties;
    return this;
  }

  /**
   * True if the sheet is hidden in the UI, false if it's visible.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHidden() {
    return hidden;
  }

  /**
   * True if the sheet is hidden in the UI, false if it's visible.
   * @param hidden hidden or {@code null} for none
   */
  public SheetProperties setHidden(java.lang.Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * The index of the sheet within the spreadsheet. When adding or updating sheet properties, if
   * this field is excluded then the sheet is added or moved to the end of the sheet list. When
   * updating sheet indices or inserting sheets, movement is considered in "before the move"
   * indexes. For example, if there were three sheets (S1, S2, S3) in order to move S1 ahead of S2
   * the index would have to be set to 2. A sheet index update request is ignored if the requested
   * index is identical to the sheets current index or if the requested new index is equal to the
   * current sheet index + 1.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * The index of the sheet within the spreadsheet. When adding or updating sheet properties, if
   * this field is excluded then the sheet is added or moved to the end of the sheet list. When
   * updating sheet indices or inserting sheets, movement is considered in "before the move"
   * indexes. For example, if there were three sheets (S1, S2, S3) in order to move S1 ahead of S2
   * the index would have to be set to 2. A sheet index update request is ignored if the requested
   * index is identical to the sheets current index or if the requested new index is equal to the
   * current sheet index + 1.
   * @param index index or {@code null} for none
   */
  public SheetProperties setIndex(java.lang.Integer index) {
    this.index = index;
    return this;
  }

  /**
   * True if the sheet is an RTL sheet instead of an LTR sheet.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRightToLeft() {
    return rightToLeft;
  }

  /**
   * True if the sheet is an RTL sheet instead of an LTR sheet.
   * @param rightToLeft rightToLeft or {@code null} for none
   */
  public SheetProperties setRightToLeft(java.lang.Boolean rightToLeft) {
    this.rightToLeft = rightToLeft;
    return this;
  }

  /**
   * The ID of the sheet. Must be non-negative. This field cannot be changed once set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSheetId() {
    return sheetId;
  }

  /**
   * The ID of the sheet. Must be non-negative. This field cannot be changed once set.
   * @param sheetId sheetId or {@code null} for none
   */
  public SheetProperties setSheetId(java.lang.Integer sheetId) {
    this.sheetId = sheetId;
    return this;
  }

  /**
   * The type of sheet. Defaults to GRID. This field cannot be changed once set.
   * @return value or {@code null} for none
   */
  public java.lang.String getSheetType() {
    return sheetType;
  }

  /**
   * The type of sheet. Defaults to GRID. This field cannot be changed once set.
   * @param sheetType sheetType or {@code null} for none
   */
  public SheetProperties setSheetType(java.lang.String sheetType) {
    this.sheetType = sheetType;
    return this;
  }

  /**
   * The color of the tab in the UI. Deprecated: Use tab_color_style.
   * @return value or {@code null} for none
   */
  public Color getTabColor() {
    return tabColor;
  }

  /**
   * The color of the tab in the UI. Deprecated: Use tab_color_style.
   * @param tabColor tabColor or {@code null} for none
   */
  public SheetProperties setTabColor(Color tabColor) {
    this.tabColor = tabColor;
    return this;
  }

  /**
   * The color of the tab in the UI. If tab_color is also set, this field takes precedence.
   * @return value or {@code null} for none
   */
  public ColorStyle getTabColorStyle() {
    return tabColorStyle;
  }

  /**
   * The color of the tab in the UI. If tab_color is also set, this field takes precedence.
   * @param tabColorStyle tabColorStyle or {@code null} for none
   */
  public SheetProperties setTabColorStyle(ColorStyle tabColorStyle) {
    this.tabColorStyle = tabColorStyle;
    return this;
  }

  /**
   * The name of the sheet.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The name of the sheet.
   * @param title title or {@code null} for none
   */
  public SheetProperties setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public SheetProperties set(String fieldName, Object value) {
    return (SheetProperties) super.set(fieldName, value);
  }

  @Override
  public SheetProperties clone() {
    return (SheetProperties) super.clone();
  }

}
