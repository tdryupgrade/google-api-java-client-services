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
 * Annotation metadata for Babel-only items that signals which type of placeholder message should be
 * displayed in Babel clients.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsDynamiteBabelPlaceholderMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteBabelPlaceholderMetadataDeleteMetadata deleteMetadata;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteBabelPlaceholderMetadataEditMetadata editMetadata;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteBabelPlaceholderMetadataHangoutVideoEventMetadata hangoutVideoMetadata;

  /**
   * @return value or {@code null} for none
   */
  public AppsDynamiteBabelPlaceholderMetadataDeleteMetadata getDeleteMetadata() {
    return deleteMetadata;
  }

  /**
   * @param deleteMetadata deleteMetadata or {@code null} for none
   */
  public AppsDynamiteBabelPlaceholderMetadata setDeleteMetadata(AppsDynamiteBabelPlaceholderMetadataDeleteMetadata deleteMetadata) {
    this.deleteMetadata = deleteMetadata;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AppsDynamiteBabelPlaceholderMetadataEditMetadata getEditMetadata() {
    return editMetadata;
  }

  /**
   * @param editMetadata editMetadata or {@code null} for none
   */
  public AppsDynamiteBabelPlaceholderMetadata setEditMetadata(AppsDynamiteBabelPlaceholderMetadataEditMetadata editMetadata) {
    this.editMetadata = editMetadata;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AppsDynamiteBabelPlaceholderMetadataHangoutVideoEventMetadata getHangoutVideoMetadata() {
    return hangoutVideoMetadata;
  }

  /**
   * @param hangoutVideoMetadata hangoutVideoMetadata or {@code null} for none
   */
  public AppsDynamiteBabelPlaceholderMetadata setHangoutVideoMetadata(AppsDynamiteBabelPlaceholderMetadataHangoutVideoEventMetadata hangoutVideoMetadata) {
    this.hangoutVideoMetadata = hangoutVideoMetadata;
    return this;
  }

  @Override
  public AppsDynamiteBabelPlaceholderMetadata set(String fieldName, Object value) {
    return (AppsDynamiteBabelPlaceholderMetadata) super.set(fieldName, value);
  }

  @Override
  public AppsDynamiteBabelPlaceholderMetadata clone() {
    return (AppsDynamiteBabelPlaceholderMetadata) super.clone();
  }

}
