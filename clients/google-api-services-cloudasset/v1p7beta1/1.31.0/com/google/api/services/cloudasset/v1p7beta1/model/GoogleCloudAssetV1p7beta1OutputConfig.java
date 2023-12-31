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

package com.google.api.services.cloudasset.v1p7beta1.model;

/**
 * Output configuration for export assets destination.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssetV1p7beta1OutputConfig extends com.google.api.client.json.GenericJson {

  /**
   * Destination on BigQuery. The output table stores the fields in asset proto as columns in
   * BigQuery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssetV1p7beta1BigQueryDestination bigqueryDestination;

  /**
   * Destination on Cloud Storage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssetV1p7beta1GcsDestination gcsDestination;

  /**
   * Destination on BigQuery. The output table stores the fields in asset proto as columns in
   * BigQuery.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1BigQueryDestination getBigqueryDestination() {
    return bigqueryDestination;
  }

  /**
   * Destination on BigQuery. The output table stores the fields in asset proto as columns in
   * BigQuery.
   * @param bigqueryDestination bigqueryDestination or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1OutputConfig setBigqueryDestination(GoogleCloudAssetV1p7beta1BigQueryDestination bigqueryDestination) {
    this.bigqueryDestination = bigqueryDestination;
    return this;
  }

  /**
   * Destination on Cloud Storage.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1GcsDestination getGcsDestination() {
    return gcsDestination;
  }

  /**
   * Destination on Cloud Storage.
   * @param gcsDestination gcsDestination or {@code null} for none
   */
  public GoogleCloudAssetV1p7beta1OutputConfig setGcsDestination(GoogleCloudAssetV1p7beta1GcsDestination gcsDestination) {
    this.gcsDestination = gcsDestination;
    return this;
  }

  @Override
  public GoogleCloudAssetV1p7beta1OutputConfig set(String fieldName, Object value) {
    return (GoogleCloudAssetV1p7beta1OutputConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssetV1p7beta1OutputConfig clone() {
    return (GoogleCloudAssetV1p7beta1OutputConfig) super.clone();
  }

}
