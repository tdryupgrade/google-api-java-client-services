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
 * A sort order associated with a specific column or row.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SortSpec extends com.google.api.client.json.GenericJson {

  /**
   * The background fill color to sort by; cells with this fill color are sorted to the top.
   * Mutually exclusive with foreground_color. Deprecated: Use background_color_style.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color backgroundColor;

  /**
   * The background fill color to sort by; cells with this fill color are sorted to the top.
   * Mutually exclusive with foreground_color, and must be an RGB-type color. If background_color is
   * also set, this field takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ColorStyle backgroundColorStyle;

  /**
   * Reference to a data source column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DataSourceColumnReference dataSourceColumnReference;

  /**
   * The dimension the sort should be applied to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer dimensionIndex;

  /**
   * The foreground color to sort by; cells with this foreground color are sorted to the top.
   * Mutually exclusive with background_color. Deprecated: Use foreground_color_style.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color foregroundColor;

  /**
   * The foreground color to sort by; cells with this foreground color are sorted to the top.
   * Mutually exclusive with background_color, and must be an RGB-type color. If foreground_color is
   * also set, this field takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ColorStyle foregroundColorStyle;

  /**
   * The order data should be sorted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sortOrder;

  /**
   * The background fill color to sort by; cells with this fill color are sorted to the top.
   * Mutually exclusive with foreground_color. Deprecated: Use background_color_style.
   * @return value or {@code null} for none
   */
  public Color getBackgroundColor() {
    return backgroundColor;
  }

  /**
   * The background fill color to sort by; cells with this fill color are sorted to the top.
   * Mutually exclusive with foreground_color. Deprecated: Use background_color_style.
   * @param backgroundColor backgroundColor or {@code null} for none
   */
  public SortSpec setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * The background fill color to sort by; cells with this fill color are sorted to the top.
   * Mutually exclusive with foreground_color, and must be an RGB-type color. If background_color is
   * also set, this field takes precedence.
   * @return value or {@code null} for none
   */
  public ColorStyle getBackgroundColorStyle() {
    return backgroundColorStyle;
  }

  /**
   * The background fill color to sort by; cells with this fill color are sorted to the top.
   * Mutually exclusive with foreground_color, and must be an RGB-type color. If background_color is
   * also set, this field takes precedence.
   * @param backgroundColorStyle backgroundColorStyle or {@code null} for none
   */
  public SortSpec setBackgroundColorStyle(ColorStyle backgroundColorStyle) {
    this.backgroundColorStyle = backgroundColorStyle;
    return this;
  }

  /**
   * Reference to a data source column.
   * @return value or {@code null} for none
   */
  public DataSourceColumnReference getDataSourceColumnReference() {
    return dataSourceColumnReference;
  }

  /**
   * Reference to a data source column.
   * @param dataSourceColumnReference dataSourceColumnReference or {@code null} for none
   */
  public SortSpec setDataSourceColumnReference(DataSourceColumnReference dataSourceColumnReference) {
    this.dataSourceColumnReference = dataSourceColumnReference;
    return this;
  }

  /**
   * The dimension the sort should be applied to.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDimensionIndex() {
    return dimensionIndex;
  }

  /**
   * The dimension the sort should be applied to.
   * @param dimensionIndex dimensionIndex or {@code null} for none
   */
  public SortSpec setDimensionIndex(java.lang.Integer dimensionIndex) {
    this.dimensionIndex = dimensionIndex;
    return this;
  }

  /**
   * The foreground color to sort by; cells with this foreground color are sorted to the top.
   * Mutually exclusive with background_color. Deprecated: Use foreground_color_style.
   * @return value or {@code null} for none
   */
  public Color getForegroundColor() {
    return foregroundColor;
  }

  /**
   * The foreground color to sort by; cells with this foreground color are sorted to the top.
   * Mutually exclusive with background_color. Deprecated: Use foreground_color_style.
   * @param foregroundColor foregroundColor or {@code null} for none
   */
  public SortSpec setForegroundColor(Color foregroundColor) {
    this.foregroundColor = foregroundColor;
    return this;
  }

  /**
   * The foreground color to sort by; cells with this foreground color are sorted to the top.
   * Mutually exclusive with background_color, and must be an RGB-type color. If foreground_color is
   * also set, this field takes precedence.
   * @return value or {@code null} for none
   */
  public ColorStyle getForegroundColorStyle() {
    return foregroundColorStyle;
  }

  /**
   * The foreground color to sort by; cells with this foreground color are sorted to the top.
   * Mutually exclusive with background_color, and must be an RGB-type color. If foreground_color is
   * also set, this field takes precedence.
   * @param foregroundColorStyle foregroundColorStyle or {@code null} for none
   */
  public SortSpec setForegroundColorStyle(ColorStyle foregroundColorStyle) {
    this.foregroundColorStyle = foregroundColorStyle;
    return this;
  }

  /**
   * The order data should be sorted.
   * @return value or {@code null} for none
   */
  public java.lang.String getSortOrder() {
    return sortOrder;
  }

  /**
   * The order data should be sorted.
   * @param sortOrder sortOrder or {@code null} for none
   */
  public SortSpec setSortOrder(java.lang.String sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  @Override
  public SortSpec set(String fieldName, Object value) {
    return (SortSpec) super.set(fieldName, value);
  }

  @Override
  public SortSpec clone() {
    return (SortSpec) super.clone();
  }

}
