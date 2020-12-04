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

package com.google.api.services.games.model;

/**
 * Identifies a snapshot cover image resource. The image is provided by the game.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SnapshotCoverImageResource extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Hash-like weak identifier of the uploaded image bytes, consistent per player per
   * application per hash version. Within the context of a single player/application, it's
   * guaranteed that two identical images coming from two different uploads will have the same
   * content hash for the same hash algorithm version. It's extremely likely, though not guaranteed,
   * that if two content hashes are equal, the images are identical. More than one content hash can
   * be returned if more than one hash versions are supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContentHash> contentHash;

  static {
    // hack to force ProGuard to consider ContentHash used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContentHash.class);
  }

  /**
   * Output only. A URL the client can use to download the image. May vary across requests, and only
   * guaranteed to be valid for a short time after it is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String downloadUrl;

  /**
   * The height of the image in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * The MIME type of the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * The ID of the image resource. It's guaranteed that if two IDs are equal then the contents are
   * equal as well. It's not guaranteed that two identical blobs coming from separate uploads have
   * the same ID. The resource ID can only be used within the application, user and resource type it
   * was originally returned for. For example, it's not possible to use SnapshotDataResource's
   * resource ID as the resource_id of a SnapshotCoverImageResource, even if the blob is a valid
   * image file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceId;

  /**
   * The width of the image in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * Output only. Hash-like weak identifier of the uploaded image bytes, consistent per player per
   * application per hash version. Within the context of a single player/application, it's
   * guaranteed that two identical images coming from two different uploads will have the same
   * content hash for the same hash algorithm version. It's extremely likely, though not guaranteed,
   * that if two content hashes are equal, the images are identical. More than one content hash can
   * be returned if more than one hash versions are supported.
   * @return value or {@code null} for none
   */
  public java.util.List<ContentHash> getContentHash() {
    return contentHash;
  }

  /**
   * Output only. Hash-like weak identifier of the uploaded image bytes, consistent per player per
   * application per hash version. Within the context of a single player/application, it's
   * guaranteed that two identical images coming from two different uploads will have the same
   * content hash for the same hash algorithm version. It's extremely likely, though not guaranteed,
   * that if two content hashes are equal, the images are identical. More than one content hash can
   * be returned if more than one hash versions are supported.
   * @param contentHash contentHash or {@code null} for none
   */
  public SnapshotCoverImageResource setContentHash(java.util.List<ContentHash> contentHash) {
    this.contentHash = contentHash;
    return this;
  }

  /**
   * Output only. A URL the client can use to download the image. May vary across requests, and only
   * guaranteed to be valid for a short time after it is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getDownloadUrl() {
    return downloadUrl;
  }

  /**
   * Output only. A URL the client can use to download the image. May vary across requests, and only
   * guaranteed to be valid for a short time after it is returned.
   * @param downloadUrl downloadUrl or {@code null} for none
   */
  public SnapshotCoverImageResource setDownloadUrl(java.lang.String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * The height of the image in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * The height of the image in pixels.
   * @param height height or {@code null} for none
   */
  public SnapshotCoverImageResource setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * The MIME type of the image.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * The MIME type of the image.
   * @param mimeType mimeType or {@code null} for none
   */
  public SnapshotCoverImageResource setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The ID of the image resource. It's guaranteed that if two IDs are equal then the contents are
   * equal as well. It's not guaranteed that two identical blobs coming from separate uploads have
   * the same ID. The resource ID can only be used within the application, user and resource type it
   * was originally returned for. For example, it's not possible to use SnapshotDataResource's
   * resource ID as the resource_id of a SnapshotCoverImageResource, even if the blob is a valid
   * image file.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceId() {
    return resourceId;
  }

  /**
   * The ID of the image resource. It's guaranteed that if two IDs are equal then the contents are
   * equal as well. It's not guaranteed that two identical blobs coming from separate uploads have
   * the same ID. The resource ID can only be used within the application, user and resource type it
   * was originally returned for. For example, it's not possible to use SnapshotDataResource's
   * resource ID as the resource_id of a SnapshotCoverImageResource, even if the blob is a valid
   * image file.
   * @param resourceId resourceId or {@code null} for none
   */
  public SnapshotCoverImageResource setResourceId(java.lang.String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The width of the image in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * The width of the image in pixels.
   * @param width width or {@code null} for none
   */
  public SnapshotCoverImageResource setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public SnapshotCoverImageResource set(String fieldName, Object value) {
    return (SnapshotCoverImageResource) super.set(fieldName, value);
  }

  @Override
  public SnapshotCoverImageResource clone() {
    return (SnapshotCoverImageResource) super.clone();
  }

}
