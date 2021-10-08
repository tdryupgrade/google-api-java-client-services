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
 * The image response message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1IntentMessageImage extends com.google.api.client.json.GenericJson {

  /**
   * A text description of the image to be used for accessibility, e.g., screen readers. Required if
   * image_uri is set for CarouselSelect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessibilityText;

  /**
   * Optional. The public URI to an image file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUri;

  /**
   * A text description of the image to be used for accessibility, e.g., screen readers. Required if
   * image_uri is set for CarouselSelect.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessibilityText() {
    return accessibilityText;
  }

  /**
   * A text description of the image to be used for accessibility, e.g., screen readers. Required if
   * image_uri is set for CarouselSelect.
   * @param accessibilityText accessibilityText or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageImage setAccessibilityText(java.lang.String accessibilityText) {
    this.accessibilityText = accessibilityText;
    return this;
  }

  /**
   * Optional. The public URI to an image file.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUri() {
    return imageUri;
  }

  /**
   * Optional. The public URI to an image file.
   * @param imageUri imageUri or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageImage setImageUri(java.lang.String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageImage set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1IntentMessageImage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageImage clone() {
    return (GoogleCloudDialogflowV2beta1IntentMessageImage) super.clone();
  }

}
