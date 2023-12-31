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

package com.google.api.services.firebaseml.v1beta2.model;

/**
 * The response for downloading a model to device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase ML API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DownloadModelResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. A download URI for the model/zip file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String downloadUri;

  /**
   * Output only. The time that the download URI link expires. If the link has expired, the REST
   * call must be repeated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * Output only. The format of the model being downloaded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelFormat;

  /**
   * Output only. The size of the file(s), if this information is available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sizeBytes;

  /**
   * Output only. A download URI for the model/zip file.
   * @return value or {@code null} for none
   */
  public java.lang.String getDownloadUri() {
    return downloadUri;
  }

  /**
   * Output only. A download URI for the model/zip file.
   * @param downloadUri downloadUri or {@code null} for none
   */
  public DownloadModelResponse setDownloadUri(java.lang.String downloadUri) {
    this.downloadUri = downloadUri;
    return this;
  }

  /**
   * Output only. The time that the download URI link expires. If the link has expired, the REST
   * call must be repeated.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. The time that the download URI link expires. If the link has expired, the REST
   * call must be repeated.
   * @param expireTime expireTime or {@code null} for none
   */
  public DownloadModelResponse setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * Output only. The format of the model being downloaded.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelFormat() {
    return modelFormat;
  }

  /**
   * Output only. The format of the model being downloaded.
   * @param modelFormat modelFormat or {@code null} for none
   */
  public DownloadModelResponse setModelFormat(java.lang.String modelFormat) {
    this.modelFormat = modelFormat;
    return this;
  }

  /**
   * Output only. The size of the file(s), if this information is available.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSizeBytes() {
    return sizeBytes;
  }

  /**
   * Output only. The size of the file(s), if this information is available.
   * @param sizeBytes sizeBytes or {@code null} for none
   */
  public DownloadModelResponse setSizeBytes(java.lang.Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  @Override
  public DownloadModelResponse set(String fieldName, Object value) {
    return (DownloadModelResponse) super.set(fieldName, value);
  }

  @Override
  public DownloadModelResponse clone() {
    return (DownloadModelResponse) super.clone();
  }

}
