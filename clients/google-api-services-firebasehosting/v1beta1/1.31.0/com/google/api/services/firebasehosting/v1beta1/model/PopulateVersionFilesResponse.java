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

package com.google.api.services.firebasehosting.v1beta1.model;

/**
 * Model definition for PopulateVersionFilesResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PopulateVersionFilesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The content hashes of the specified files that need to be uploaded to the specified URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> uploadRequiredHashes;

  /**
   * The URL to which the files should be uploaded, in the format: "https://upload-
   * firebasehosting.googleapis.com/upload/sites/SITE_ID /versions/VERSION_ID/files" Perform a
   * multipart `POST` of the Gzipped file contents to the URL using a forward slash and the hash of
   * the file appended to the end.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uploadUrl;

  /**
   * The content hashes of the specified files that need to be uploaded to the specified URL.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUploadRequiredHashes() {
    return uploadRequiredHashes;
  }

  /**
   * The content hashes of the specified files that need to be uploaded to the specified URL.
   * @param uploadRequiredHashes uploadRequiredHashes or {@code null} for none
   */
  public PopulateVersionFilesResponse setUploadRequiredHashes(java.util.List<java.lang.String> uploadRequiredHashes) {
    this.uploadRequiredHashes = uploadRequiredHashes;
    return this;
  }

  /**
   * The URL to which the files should be uploaded, in the format: "https://upload-
   * firebasehosting.googleapis.com/upload/sites/SITE_ID /versions/VERSION_ID/files" Perform a
   * multipart `POST` of the Gzipped file contents to the URL using a forward slash and the hash of
   * the file appended to the end.
   * @return value or {@code null} for none
   */
  public java.lang.String getUploadUrl() {
    return uploadUrl;
  }

  /**
   * The URL to which the files should be uploaded, in the format: "https://upload-
   * firebasehosting.googleapis.com/upload/sites/SITE_ID /versions/VERSION_ID/files" Perform a
   * multipart `POST` of the Gzipped file contents to the URL using a forward slash and the hash of
   * the file appended to the end.
   * @param uploadUrl uploadUrl or {@code null} for none
   */
  public PopulateVersionFilesResponse setUploadUrl(java.lang.String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

  @Override
  public PopulateVersionFilesResponse set(String fieldName, Object value) {
    return (PopulateVersionFilesResponse) super.set(fieldName, value);
  }

  @Override
  public PopulateVersionFilesResponse clone() {
    return (PopulateVersionFilesResponse) super.clone();
  }

}
