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

package com.google.api.services.forms.v1.model;

/**
 * Info for a single file submitted to a file upload question.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Forms API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FileUploadAnswer extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The ID of the Google Drive file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileId;

  /**
   * Output only. The file name, as stored in Google Drive on upload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileName;

  /**
   * Output only. The MIME type of the file, as stored in Google Drive on upload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * Output only. The ID of the Google Drive file.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileId() {
    return fileId;
  }

  /**
   * Output only. The ID of the Google Drive file.
   * @param fileId fileId or {@code null} for none
   */
  public FileUploadAnswer setFileId(java.lang.String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * Output only. The file name, as stored in Google Drive on upload.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileName() {
    return fileName;
  }

  /**
   * Output only. The file name, as stored in Google Drive on upload.
   * @param fileName fileName or {@code null} for none
   */
  public FileUploadAnswer setFileName(java.lang.String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Output only. The MIME type of the file, as stored in Google Drive on upload.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * Output only. The MIME type of the file, as stored in Google Drive on upload.
   * @param mimeType mimeType or {@code null} for none
   */
  public FileUploadAnswer setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  @Override
  public FileUploadAnswer set(String fieldName, Object value) {
    return (FileUploadAnswer) super.set(fieldName, value);
  }

  @Override
  public FileUploadAnswer clone() {
    return (FileUploadAnswer) super.clone();
  }

}
