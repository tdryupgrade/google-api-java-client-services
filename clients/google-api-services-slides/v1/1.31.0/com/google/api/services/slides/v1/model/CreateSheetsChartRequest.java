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

package com.google.api.services.slides.v1.model;

/**
 * Creates an embedded Google Sheets chart. NOTE: Chart creation requires at least one of the
 * spreadsheets.readonly, spreadsheets, drive.readonly, drive.file, or drive OAuth scopes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateSheetsChartRequest extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the specific chart in the Google Sheets spreadsheet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer chartId;

  /**
   * The element properties for the chart. When the aspect ratio of the provided size does not match
   * the chart aspect ratio, the chart is scaled and centered with respect to the size in order to
   * maintain aspect ratio. The provided transform is applied after this operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PageElementProperties elementProperties;

  /**
   * The mode with which the chart is linked to the source spreadsheet. When not specified, the
   * chart will be an image that is not linked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkingMode;

  /**
   * A user-supplied object ID. If specified, the ID must be unique among all pages and page
   * elements in the presentation. The ID should start with a word character [a-zA-Z0-9_] and then
   * followed by any number of the following characters [a-zA-Z0-9_-:]. The length of the ID should
   * not be less than 5 or greater than 50. If empty, a unique identifier will be generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectId;

  /**
   * The ID of the Google Sheets spreadsheet that contains the chart. You might need to add a
   * resource key to the HTTP header for a subset of old files. For more information, see [Access
   * link-shared files using resource keys](https://developers.google.com/drive/api/v3/resource-
   * keys).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spreadsheetId;

  /**
   * The ID of the specific chart in the Google Sheets spreadsheet.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getChartId() {
    return chartId;
  }

  /**
   * The ID of the specific chart in the Google Sheets spreadsheet.
   * @param chartId chartId or {@code null} for none
   */
  public CreateSheetsChartRequest setChartId(java.lang.Integer chartId) {
    this.chartId = chartId;
    return this;
  }

  /**
   * The element properties for the chart. When the aspect ratio of the provided size does not match
   * the chart aspect ratio, the chart is scaled and centered with respect to the size in order to
   * maintain aspect ratio. The provided transform is applied after this operation.
   * @return value or {@code null} for none
   */
  public PageElementProperties getElementProperties() {
    return elementProperties;
  }

  /**
   * The element properties for the chart. When the aspect ratio of the provided size does not match
   * the chart aspect ratio, the chart is scaled and centered with respect to the size in order to
   * maintain aspect ratio. The provided transform is applied after this operation.
   * @param elementProperties elementProperties or {@code null} for none
   */
  public CreateSheetsChartRequest setElementProperties(PageElementProperties elementProperties) {
    this.elementProperties = elementProperties;
    return this;
  }

  /**
   * The mode with which the chart is linked to the source spreadsheet. When not specified, the
   * chart will be an image that is not linked.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkingMode() {
    return linkingMode;
  }

  /**
   * The mode with which the chart is linked to the source spreadsheet. When not specified, the
   * chart will be an image that is not linked.
   * @param linkingMode linkingMode or {@code null} for none
   */
  public CreateSheetsChartRequest setLinkingMode(java.lang.String linkingMode) {
    this.linkingMode = linkingMode;
    return this;
  }

  /**
   * A user-supplied object ID. If specified, the ID must be unique among all pages and page
   * elements in the presentation. The ID should start with a word character [a-zA-Z0-9_] and then
   * followed by any number of the following characters [a-zA-Z0-9_-:]. The length of the ID should
   * not be less than 5 or greater than 50. If empty, a unique identifier will be generated.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectId() {
    return objectId;
  }

  /**
   * A user-supplied object ID. If specified, the ID must be unique among all pages and page
   * elements in the presentation. The ID should start with a word character [a-zA-Z0-9_] and then
   * followed by any number of the following characters [a-zA-Z0-9_-:]. The length of the ID should
   * not be less than 5 or greater than 50. If empty, a unique identifier will be generated.
   * @param objectId objectId or {@code null} for none
   */
  public CreateSheetsChartRequest setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The ID of the Google Sheets spreadsheet that contains the chart. You might need to add a
   * resource key to the HTTP header for a subset of old files. For more information, see [Access
   * link-shared files using resource keys](https://developers.google.com/drive/api/v3/resource-
   * keys).
   * @return value or {@code null} for none
   */
  public java.lang.String getSpreadsheetId() {
    return spreadsheetId;
  }

  /**
   * The ID of the Google Sheets spreadsheet that contains the chart. You might need to add a
   * resource key to the HTTP header for a subset of old files. For more information, see [Access
   * link-shared files using resource keys](https://developers.google.com/drive/api/v3/resource-
   * keys).
   * @param spreadsheetId spreadsheetId or {@code null} for none
   */
  public CreateSheetsChartRequest setSpreadsheetId(java.lang.String spreadsheetId) {
    this.spreadsheetId = spreadsheetId;
    return this;
  }

  @Override
  public CreateSheetsChartRequest set(String fieldName, Object value) {
    return (CreateSheetsChartRequest) super.set(fieldName, value);
  }

  @Override
  public CreateSheetsChartRequest clone() {
    return (CreateSheetsChartRequest) super.clone();
  }

}
