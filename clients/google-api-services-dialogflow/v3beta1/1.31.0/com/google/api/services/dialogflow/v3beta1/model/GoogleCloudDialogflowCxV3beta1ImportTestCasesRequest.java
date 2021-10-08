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
 * The request message for TestCases.ImportTestCases.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1ImportTestCasesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Uncompressed raw byte content for test cases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to import test cases
   * from. The format of this URI must be `gs:`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsUri;

  /**
   * Uncompressed raw byte content for test cases.
   * @see #decodeContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Uncompressed raw byte content for test cases.
   * @see #getContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContent() {
    return com.google.api.client.util.Base64.decodeBase64(content);
  }

  /**
   * Uncompressed raw byte content for test cases.
   * @see #encodeContent()
   * @param content content or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ImportTestCasesRequest setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * Uncompressed raw byte content for test cases.
   * @see #setContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDialogflowCxV3beta1ImportTestCasesRequest encodeContent(byte[] content) {
    this.content = com.google.api.client.util.Base64.encodeBase64URLSafeString(content);
    return this;
  }

  /**
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to import test cases
   * from. The format of this URI must be `gs:`.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsUri() {
    return gcsUri;
  }

  /**
   * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to import test cases
   * from. The format of this URI must be `gs:`.
   * @param gcsUri gcsUri or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ImportTestCasesRequest setGcsUri(java.lang.String gcsUri) {
    this.gcsUri = gcsUri;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ImportTestCasesRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1ImportTestCasesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ImportTestCasesRequest clone() {
    return (GoogleCloudDialogflowCxV3beta1ImportTestCasesRequest) super.clone();
  }

}
