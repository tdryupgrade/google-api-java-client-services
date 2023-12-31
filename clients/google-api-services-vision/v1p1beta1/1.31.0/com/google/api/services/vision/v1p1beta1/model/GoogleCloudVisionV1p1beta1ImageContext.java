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

package com.google.api.services.vision.v1p1beta1.model;

/**
 * Image context and/or feature-specific parameters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p1beta1ImageContext extends com.google.api.client.json.GenericJson {

  /**
   * Parameters for crop hints annotation request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1CropHintsParams cropHintsParams;

  /**
   * List of languages to use for TEXT_DETECTION. In most cases, an empty value yields the best
   * results since it enables automatic language detection. For languages based on the Latin
   * alphabet, setting `language_hints` is not needed. In rare cases, when the language of the text
   * in the image is known, setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Text detection returns an error if one or more of
   * the specified languages is not one of the [supported
   * languages](https://cloud.google.com/vision/docs/languages).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> languageHints;

  /**
   * Not used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1LatLongRect latLongRect;

  /**
   * Parameters for product search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1ProductSearchParams productSearchParams;

  /**
   * Parameters for text detection and document text detection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1TextDetectionParams textDetectionParams;

  /**
   * Parameters for web detection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1WebDetectionParams webDetectionParams;

  /**
   * Parameters for crop hints annotation request.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1CropHintsParams getCropHintsParams() {
    return cropHintsParams;
  }

  /**
   * Parameters for crop hints annotation request.
   * @param cropHintsParams cropHintsParams or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ImageContext setCropHintsParams(GoogleCloudVisionV1p1beta1CropHintsParams cropHintsParams) {
    this.cropHintsParams = cropHintsParams;
    return this;
  }

  /**
   * List of languages to use for TEXT_DETECTION. In most cases, an empty value yields the best
   * results since it enables automatic language detection. For languages based on the Latin
   * alphabet, setting `language_hints` is not needed. In rare cases, when the language of the text
   * in the image is known, setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Text detection returns an error if one or more of
   * the specified languages is not one of the [supported
   * languages](https://cloud.google.com/vision/docs/languages).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLanguageHints() {
    return languageHints;
  }

  /**
   * List of languages to use for TEXT_DETECTION. In most cases, an empty value yields the best
   * results since it enables automatic language detection. For languages based on the Latin
   * alphabet, setting `language_hints` is not needed. In rare cases, when the language of the text
   * in the image is known, setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Text detection returns an error if one or more of
   * the specified languages is not one of the [supported
   * languages](https://cloud.google.com/vision/docs/languages).
   * @param languageHints languageHints or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ImageContext setLanguageHints(java.util.List<java.lang.String> languageHints) {
    this.languageHints = languageHints;
    return this;
  }

  /**
   * Not used.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1LatLongRect getLatLongRect() {
    return latLongRect;
  }

  /**
   * Not used.
   * @param latLongRect latLongRect or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ImageContext setLatLongRect(GoogleCloudVisionV1p1beta1LatLongRect latLongRect) {
    this.latLongRect = latLongRect;
    return this;
  }

  /**
   * Parameters for product search.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ProductSearchParams getProductSearchParams() {
    return productSearchParams;
  }

  /**
   * Parameters for product search.
   * @param productSearchParams productSearchParams or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ImageContext setProductSearchParams(GoogleCloudVisionV1p1beta1ProductSearchParams productSearchParams) {
    this.productSearchParams = productSearchParams;
    return this;
  }

  /**
   * Parameters for text detection and document text detection.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1TextDetectionParams getTextDetectionParams() {
    return textDetectionParams;
  }

  /**
   * Parameters for text detection and document text detection.
   * @param textDetectionParams textDetectionParams or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ImageContext setTextDetectionParams(GoogleCloudVisionV1p1beta1TextDetectionParams textDetectionParams) {
    this.textDetectionParams = textDetectionParams;
    return this;
  }

  /**
   * Parameters for web detection.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1WebDetectionParams getWebDetectionParams() {
    return webDetectionParams;
  }

  /**
   * Parameters for web detection.
   * @param webDetectionParams webDetectionParams or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ImageContext setWebDetectionParams(GoogleCloudVisionV1p1beta1WebDetectionParams webDetectionParams) {
    this.webDetectionParams = webDetectionParams;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p1beta1ImageContext set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p1beta1ImageContext) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p1beta1ImageContext clone() {
    return (GoogleCloudVisionV1p1beta1ImageContext) super.clone();
  }

}
