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

package com.google.api.services.dialogflow.v2.model;

/**
 * Table card for Actions on Google.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2IntentMessageTableCard extends com.google.api.client.json.GenericJson {

  /**
   * Optional. List of buttons for the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2IntentMessageBasicCardButton> buttons;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2IntentMessageBasicCardButton used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2IntentMessageBasicCardButton.class);
  }

  /**
   * Optional. Display properties for the columns in this table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2IntentMessageColumnProperties> columnProperties;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2IntentMessageColumnProperties used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2IntentMessageColumnProperties.class);
  }

  /**
   * Optional. Image which should be displayed on the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2IntentMessageImage image;

  /**
   * Optional. Rows in this table of data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2IntentMessageTableCardRow> rows;

  /**
   * Optional. Subtitle to the title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subtitle;

  /**
   * Required. Title of the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Optional. List of buttons for the card.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2IntentMessageBasicCardButton> getButtons() {
    return buttons;
  }

  /**
   * Optional. List of buttons for the card.
   * @param buttons buttons or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageTableCard setButtons(java.util.List<GoogleCloudDialogflowV2IntentMessageBasicCardButton> buttons) {
    this.buttons = buttons;
    return this;
  }

  /**
   * Optional. Display properties for the columns in this table.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2IntentMessageColumnProperties> getColumnProperties() {
    return columnProperties;
  }

  /**
   * Optional. Display properties for the columns in this table.
   * @param columnProperties columnProperties or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageTableCard setColumnProperties(java.util.List<GoogleCloudDialogflowV2IntentMessageColumnProperties> columnProperties) {
    this.columnProperties = columnProperties;
    return this;
  }

  /**
   * Optional. Image which should be displayed on the card.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageImage getImage() {
    return image;
  }

  /**
   * Optional. Image which should be displayed on the card.
   * @param image image or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageTableCard setImage(GoogleCloudDialogflowV2IntentMessageImage image) {
    this.image = image;
    return this;
  }

  /**
   * Optional. Rows in this table of data.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2IntentMessageTableCardRow> getRows() {
    return rows;
  }

  /**
   * Optional. Rows in this table of data.
   * @param rows rows or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageTableCard setRows(java.util.List<GoogleCloudDialogflowV2IntentMessageTableCardRow> rows) {
    this.rows = rows;
    return this;
  }

  /**
   * Optional. Subtitle to the title.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubtitle() {
    return subtitle;
  }

  /**
   * Optional. Subtitle to the title.
   * @param subtitle subtitle or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageTableCard setSubtitle(java.lang.String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * Required. Title of the card.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Required. Title of the card.
   * @param title title or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageTableCard setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageTableCard set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2IntentMessageTableCard) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageTableCard clone() {
    return (GoogleCloudDialogflowV2IntentMessageTableCard) super.clone();
  }

}
