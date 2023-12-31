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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * The metadata of Datasets that contain Video DataItems.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1SchemaVideoDatasetMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Points to a YAML file stored on Google Cloud Storage describing payload of the Video DataItems
   * that belong to this Dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataItemSchemaUri;

  /**
   * Google Cloud Storage Bucket name that contains the blob data of this Dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsBucket;

  /**
   * Points to a YAML file stored on Google Cloud Storage describing payload of the Video DataItems
   * that belong to this Dataset.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataItemSchemaUri() {
    return dataItemSchemaUri;
  }

  /**
   * Points to a YAML file stored on Google Cloud Storage describing payload of the Video DataItems
   * that belong to this Dataset.
   * @param dataItemSchemaUri dataItemSchemaUri or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaVideoDatasetMetadata setDataItemSchemaUri(java.lang.String dataItemSchemaUri) {
    this.dataItemSchemaUri = dataItemSchemaUri;
    return this;
  }

  /**
   * Google Cloud Storage Bucket name that contains the blob data of this Dataset.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsBucket() {
    return gcsBucket;
  }

  /**
   * Google Cloud Storage Bucket name that contains the blob data of this Dataset.
   * @param gcsBucket gcsBucket or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaVideoDatasetMetadata setGcsBucket(java.lang.String gcsBucket) {
    this.gcsBucket = gcsBucket;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1SchemaVideoDatasetMetadata set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1SchemaVideoDatasetMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1SchemaVideoDatasetMetadata clone() {
    return (GoogleCloudAiplatformV1beta1SchemaVideoDatasetMetadata) super.clone();
  }

}
