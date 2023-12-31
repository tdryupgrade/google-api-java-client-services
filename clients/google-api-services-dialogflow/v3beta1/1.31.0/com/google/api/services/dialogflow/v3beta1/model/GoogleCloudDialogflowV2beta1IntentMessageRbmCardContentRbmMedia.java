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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Rich Business Messaging (RBM) Media displayed in Cards The following media-types are currently
 * supported: Image Types * image/jpeg * image/jpg' * image/gif * image/png Video Types * video/h263
 * * video/m4v * video/mp4 * video/mpeg * video/mpeg4 * video/webm
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia extends com.google.api.client.json.GenericJson {

  /**
   * Required. Publicly reachable URI of the file. The RBM platform determines the MIME type of the
   * file from the content-type field in the HTTP headers when the platform fetches the file. The
   * content-type field must be present and accurate in the HTTP response from the URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileUri;

  /**
   * Required for cards with vertical orientation. The height of the media within a rich card with a
   * vertical layout. For a standalone card with horizontal layout, height is not customizable, and
   * this field is ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String height;

  /**
   * Optional. Publicly reachable URI of the thumbnail.If you don't provide a thumbnail URI, the RBM
   * platform displays a blank placeholder thumbnail until the user's device downloads the file.
   * Depending on the user's setting, the file may not download automatically and may require the
   * user to tap a download button.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnailUri;

  /**
   * Required. Publicly reachable URI of the file. The RBM platform determines the MIME type of the
   * file from the content-type field in the HTTP headers when the platform fetches the file. The
   * content-type field must be present and accurate in the HTTP response from the URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileUri() {
    return fileUri;
  }

  /**
   * Required. Publicly reachable URI of the file. The RBM platform determines the MIME type of the
   * file from the content-type field in the HTTP headers when the platform fetches the file. The
   * content-type field must be present and accurate in the HTTP response from the URL.
   * @param fileUri fileUri or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia setFileUri(java.lang.String fileUri) {
    this.fileUri = fileUri;
    return this;
  }

  /**
   * Required for cards with vertical orientation. The height of the media within a rich card with a
   * vertical layout. For a standalone card with horizontal layout, height is not customizable, and
   * this field is ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getHeight() {
    return height;
  }

  /**
   * Required for cards with vertical orientation. The height of the media within a rich card with a
   * vertical layout. For a standalone card with horizontal layout, height is not customizable, and
   * this field is ignored.
   * @param height height or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia setHeight(java.lang.String height) {
    this.height = height;
    return this;
  }

  /**
   * Optional. Publicly reachable URI of the thumbnail.If you don't provide a thumbnail URI, the RBM
   * platform displays a blank placeholder thumbnail until the user's device downloads the file.
   * Depending on the user's setting, the file may not download automatically and may require the
   * user to tap a download button.
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnailUri() {
    return thumbnailUri;
  }

  /**
   * Optional. Publicly reachable URI of the thumbnail.If you don't provide a thumbnail URI, the RBM
   * platform displays a blank placeholder thumbnail until the user's device downloads the file.
   * Depending on the user's setting, the file may not download automatically and may require the
   * user to tap a download button.
   * @param thumbnailUri thumbnailUri or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia setThumbnailUri(java.lang.String thumbnailUri) {
    this.thumbnailUri = thumbnailUri;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia clone() {
    return (GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia) super.clone();
  }

}
