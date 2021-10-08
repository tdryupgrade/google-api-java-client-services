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

package com.google.api.services.dialogflow.v3.model;

/**
 * The basic card message. Useful for displaying information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1IntentMessageBasicCard extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The collection of card buttons.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton> buttons;

  /**
   * Required, unless image is present. The body text of the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedText;

  /**
   * Optional. The image for the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageImage image;

  /**
   * Optional. The subtitle of the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subtitle;

  /**
   * Optional. The title of the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Optional. The collection of card buttons.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton> getButtons() {
    return buttons;
  }

  /**
   * Optional. The collection of card buttons.
   * @param buttons buttons or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageBasicCard setButtons(java.util.List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton> buttons) {
    this.buttons = buttons;
    return this;
  }

  /**
   * Required, unless image is present. The body text of the card.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedText() {
    return formattedText;
  }

  /**
   * Required, unless image is present. The body text of the card.
   * @param formattedText formattedText or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageBasicCard setFormattedText(java.lang.String formattedText) {
    this.formattedText = formattedText;
    return this;
  }

  /**
   * Optional. The image for the card.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageImage getImage() {
    return image;
  }

  /**
   * Optional. The image for the card.
   * @param image image or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageBasicCard setImage(GoogleCloudDialogflowV2beta1IntentMessageImage image) {
    this.image = image;
    return this;
  }

  /**
   * Optional. The subtitle of the card.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubtitle() {
    return subtitle;
  }

  /**
   * Optional. The subtitle of the card.
   * @param subtitle subtitle or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageBasicCard setSubtitle(java.lang.String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * Optional. The title of the card.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Optional. The title of the card.
   * @param title title or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageBasicCard setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageBasicCard set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1IntentMessageBasicCard) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageBasicCard clone() {
    return (GoogleCloudDialogflowV2beta1IntentMessageBasicCard) super.clone();
  }

}
