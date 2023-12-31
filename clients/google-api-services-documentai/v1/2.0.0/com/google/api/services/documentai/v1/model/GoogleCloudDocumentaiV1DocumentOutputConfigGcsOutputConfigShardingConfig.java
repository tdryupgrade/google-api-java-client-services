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
 * The sharding config for the output document.
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
public final class GoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfigShardingConfig extends com.google.api.client.json.GenericJson {

  /**
   * The number of overlapping pages between consecutive shards.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pagesOverlap;

  /**
   * The number of pages per shard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pagesPerShard;

  /**
   * The number of overlapping pages between consecutive shards.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPagesOverlap() {
    return pagesOverlap;
  }

  /**
   * The number of overlapping pages between consecutive shards.
   * @param pagesOverlap pagesOverlap or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfigShardingConfig setPagesOverlap(java.lang.Integer pagesOverlap) {
    this.pagesOverlap = pagesOverlap;
    return this;
  }

  /**
   * The number of pages per shard.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPagesPerShard() {
    return pagesPerShard;
  }

  /**
   * The number of pages per shard.
   * @param pagesPerShard pagesPerShard or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfigShardingConfig setPagesPerShard(java.lang.Integer pagesPerShard) {
    this.pagesPerShard = pagesPerShard;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfigShardingConfig set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfigShardingConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfigShardingConfig clone() {
    return (GoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfigShardingConfig) super.clone();
  }

}
