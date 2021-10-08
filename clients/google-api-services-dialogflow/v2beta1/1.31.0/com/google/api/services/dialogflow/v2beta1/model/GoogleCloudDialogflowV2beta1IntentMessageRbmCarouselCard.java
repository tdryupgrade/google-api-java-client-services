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
 * Carousel Rich Business Messaging (RBM) rich card. Rich cards allow you to respond to users with
 * more vivid content, e.g. with media and suggestions. If you want to show a single card with more
 * control over the layout, please use RbmStandaloneCard instead.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard extends com.google.api.client.json.GenericJson {

  /**
   * Required. The cards in the carousel. A carousel must have at least 2 cards and at most 10.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent> cardContents;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent.class);
  }

  /**
   * Required. The width of the cards in the carousel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cardWidth;

  /**
   * Required. The cards in the carousel. A carousel must have at least 2 cards and at most 10.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent> getCardContents() {
    return cardContents;
  }

  /**
   * Required. The cards in the carousel. A carousel must have at least 2 cards and at most 10.
   * @param cardContents cardContents or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard setCardContents(java.util.List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent> cardContents) {
    this.cardContents = cardContents;
    return this;
  }

  /**
   * Required. The width of the cards in the carousel.
   * @return value or {@code null} for none
   */
  public java.lang.String getCardWidth() {
    return cardWidth;
  }

  /**
   * Required. The width of the cards in the carousel.
   * @param cardWidth cardWidth or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard setCardWidth(java.lang.String cardWidth) {
    this.cardWidth = cardWidth;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard clone() {
    return (GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard) super.clone();
  }

}
