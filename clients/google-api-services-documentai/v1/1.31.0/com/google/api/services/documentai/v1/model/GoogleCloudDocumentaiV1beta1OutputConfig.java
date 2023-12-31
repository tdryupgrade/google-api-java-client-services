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
 * The desired output location and metadata.
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
public final class GoogleCloudDocumentaiV1beta1OutputConfig extends com.google.api.client.json.GenericJson {

  /**
   * The Google Cloud Storage location to write the output to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta1GcsDestination gcsDestination;

  /**
   * The max number of pages to include into each output Document shard JSON on Google Cloud
   * Storage. The valid range is [1, 100]. If not specified, the default value is 20. For example,
   * for one pdf file with 100 pages, 100 parsed pages will be produced. If `pages_per_shard` = 20,
   * then 5 Document shard JSON files each containing 20 parsed pages will be written under the
   * prefix OutputConfig.gcs_destination.uri and suffix pages-x-to-y.json where x and y are
   * 1-indexed page numbers. Example GCS outputs with 157 pages and pages_per_shard = 50:
   * pages-001-to-050.json pages-051-to-100.json pages-101-to-150.json pages-151-to-157.json
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pagesPerShard;

  /**
   * The Google Cloud Storage location to write the output to.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1GcsDestination getGcsDestination() {
    return gcsDestination;
  }

  /**
   * The Google Cloud Storage location to write the output to.
   * @param gcsDestination gcsDestination or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1OutputConfig setGcsDestination(GoogleCloudDocumentaiV1beta1GcsDestination gcsDestination) {
    this.gcsDestination = gcsDestination;
    return this;
  }

  /**
   * The max number of pages to include into each output Document shard JSON on Google Cloud
   * Storage. The valid range is [1, 100]. If not specified, the default value is 20. For example,
   * for one pdf file with 100 pages, 100 parsed pages will be produced. If `pages_per_shard` = 20,
   * then 5 Document shard JSON files each containing 20 parsed pages will be written under the
   * prefix OutputConfig.gcs_destination.uri and suffix pages-x-to-y.json where x and y are
   * 1-indexed page numbers. Example GCS outputs with 157 pages and pages_per_shard = 50:
   * pages-001-to-050.json pages-051-to-100.json pages-101-to-150.json pages-151-to-157.json
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPagesPerShard() {
    return pagesPerShard;
  }

  /**
   * The max number of pages to include into each output Document shard JSON on Google Cloud
   * Storage. The valid range is [1, 100]. If not specified, the default value is 20. For example,
   * for one pdf file with 100 pages, 100 parsed pages will be produced. If `pages_per_shard` = 20,
   * then 5 Document shard JSON files each containing 20 parsed pages will be written under the
   * prefix OutputConfig.gcs_destination.uri and suffix pages-x-to-y.json where x and y are
   * 1-indexed page numbers. Example GCS outputs with 157 pages and pages_per_shard = 50:
   * pages-001-to-050.json pages-051-to-100.json pages-101-to-150.json pages-151-to-157.json
   * @param pagesPerShard pagesPerShard or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1OutputConfig setPagesPerShard(java.lang.Integer pagesPerShard) {
    this.pagesPerShard = pagesPerShard;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta1OutputConfig set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta1OutputConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta1OutputConfig clone() {
    return (GoogleCloudDocumentaiV1beta1OutputConfig) super.clone();
  }

}
