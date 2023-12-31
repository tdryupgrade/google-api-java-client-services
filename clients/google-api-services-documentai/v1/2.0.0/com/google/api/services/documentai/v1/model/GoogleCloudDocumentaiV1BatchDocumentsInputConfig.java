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

package com.google.api.services.documentai.v1.model;

/**
 * The common config to specify a set of documents used as input.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1BatchDocumentsInputConfig extends com.google.api.client.json.GenericJson {

  /**
   * The set of documents individually specified on Cloud Storage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1GcsDocuments gcsDocuments;

  /**
   * The set of documents that match the specified Cloud Storage `gcs_prefix`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1GcsPrefix gcsPrefix;

  /**
   * The set of documents individually specified on Cloud Storage.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1GcsDocuments getGcsDocuments() {
    return gcsDocuments;
  }

  /**
   * The set of documents individually specified on Cloud Storage.
   * @param gcsDocuments gcsDocuments or {@code null} for none
   */
  public GoogleCloudDocumentaiV1BatchDocumentsInputConfig setGcsDocuments(GoogleCloudDocumentaiV1GcsDocuments gcsDocuments) {
    this.gcsDocuments = gcsDocuments;
    return this;
  }

  /**
   * The set of documents that match the specified Cloud Storage `gcs_prefix`.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1GcsPrefix getGcsPrefix() {
    return gcsPrefix;
  }

  /**
   * The set of documents that match the specified Cloud Storage `gcs_prefix`.
   * @param gcsPrefix gcsPrefix or {@code null} for none
   */
  public GoogleCloudDocumentaiV1BatchDocumentsInputConfig setGcsPrefix(GoogleCloudDocumentaiV1GcsPrefix gcsPrefix) {
    this.gcsPrefix = gcsPrefix;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1BatchDocumentsInputConfig set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1BatchDocumentsInputConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1BatchDocumentsInputConfig clone() {
    return (GoogleCloudDocumentaiV1BatchDocumentsInputConfig) super.clone();
  }

}
