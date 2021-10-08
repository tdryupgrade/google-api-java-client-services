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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * Standalone Rich Business Messaging (RBM) rich card. Rich cards allow you to respond to users with
 * more vivid content, e.g. with media and suggestions. You can group multiple rich cards into one
 * using RbmCarouselCard but carousel cards will give you less control over the card layout.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard extends com.google.api.client.json.GenericJson {

  /**
   * Required. Card content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent cardContent;

  /**
   * Required. Orientation of the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cardOrientation;

  /**
   * Required if orientation is horizontal. Image preview alignment for standalone cards with
   * horizontal layout.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnailImageAlignment;

  /**
   * Required. Card content.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent getCardContent() {
    return cardContent;
  }

  /**
   * Required. Card content.
   * @param cardContent cardContent or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard setCardContent(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent cardContent) {
    this.cardContent = cardContent;
    return this;
  }

  /**
   * Required. Orientation of the card.
   * @return value or {@code null} for none
   */
  public java.lang.String getCardOrientation() {
    return cardOrientation;
  }

  /**
   * Required. Orientation of the card.
   * @param cardOrientation cardOrientation or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard setCardOrientation(java.lang.String cardOrientation) {
    this.cardOrientation = cardOrientation;
    return this;
  }

  /**
   * Required if orientation is horizontal. Image preview alignment for standalone cards with
   * horizontal layout.
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnailImageAlignment() {
    return thumbnailImageAlignment;
  }

  /**
   * Required if orientation is horizontal. Image preview alignment for standalone cards with
   * horizontal layout.
   * @param thumbnailImageAlignment thumbnailImageAlignment or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard setThumbnailImageAlignment(java.lang.String thumbnailImageAlignment) {
    this.thumbnailImageAlignment = thumbnailImageAlignment;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard clone() {
    return (GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard) super.clone();
  }

}
