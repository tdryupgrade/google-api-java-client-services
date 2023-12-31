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
 * Model definition for Grid.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Grid extends com.google.api.client.json.GenericJson {

  /**
   * The border style to apply to each grid item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BorderStyle borderStyle;

  /**
   * The items to display in the grid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GridItem> items;

  /**
   * The number of columns to display in the grid. Note that a default value will be used if this
   * field is not specified, and that default value will be different depending on where the grid is
   * shown (dialog vs companion).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numColumns;

  /**
   * This callback will be reused by each individual GridItem, but with the item's identifier and
   * index in the items list added to the callback's parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OnClick onClick;

  /**
   * The text to display in the grid header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The border style to apply to each grid item.
   * @return value or {@code null} for none
   */
  public BorderStyle getBorderStyle() {
    return borderStyle;
  }

  /**
   * The border style to apply to each grid item.
   * @param borderStyle borderStyle or {@code null} for none
   */
  public Grid setBorderStyle(BorderStyle borderStyle) {
    this.borderStyle = borderStyle;
    return this;
  }

  /**
   * The items to display in the grid.
   * @return value or {@code null} for none
   */
  public java.util.List<GridItem> getItems() {
    return items;
  }

  /**
   * The items to display in the grid.
   * @param items items or {@code null} for none
   */
  public Grid setItems(java.util.List<GridItem> items) {
    this.items = items;
    return this;
  }

  /**
   * The number of columns to display in the grid. Note that a default value will be used if this
   * field is not specified, and that default value will be different depending on where the grid is
   * shown (dialog vs companion).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumColumns() {
    return numColumns;
  }

  /**
   * The number of columns to display in the grid. Note that a default value will be used if this
   * field is not specified, and that default value will be different depending on where the grid is
   * shown (dialog vs companion).
   * @param numColumns numColumns or {@code null} for none
   */
  public Grid setNumColumns(java.lang.Integer numColumns) {
    this.numColumns = numColumns;
    return this;
  }

  /**
   * This callback will be reused by each individual GridItem, but with the item's identifier and
   * index in the items list added to the callback's parameters.
   * @return value or {@code null} for none
   */
  public OnClick getOnClick() {
    return onClick;
  }

  /**
   * This callback will be reused by each individual GridItem, but with the item's identifier and
   * index in the items list added to the callback's parameters.
   * @param onClick onClick or {@code null} for none
   */
  public Grid setOnClick(OnClick onClick) {
    this.onClick = onClick;
    return this;
  }

  /**
   * The text to display in the grid header.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The text to display in the grid header.
   * @param title title or {@code null} for none
   */
  public Grid setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public Grid set(String fieldName, Object value) {
    return (Grid) super.set(fieldName, value);
  }

  @Override
  public Grid clone() {
    return (Grid) super.clone();
  }

}
