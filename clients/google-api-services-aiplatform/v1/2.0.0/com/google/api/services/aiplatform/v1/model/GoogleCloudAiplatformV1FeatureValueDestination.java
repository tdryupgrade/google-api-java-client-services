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

package com.google.api.services.aiplatform.v1.model;

/**
 * A destination location for Feature values and format.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1FeatureValueDestination extends com.google.api.client.json.GenericJson {

  /**
   * Output in BigQuery format. BigQueryDestination.output_uri in
   * FeatureValueDestination.bigquery_destination must refer to a table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1BigQueryDestination bigqueryDestination;

  /**
   * Output in CSV format. Array Feature value types are not allowed in CSV format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1CsvDestination csvDestination;

  /**
   * Output in TFRecord format. Below are the mapping from Feature value type in Featurestore to
   * Feature value type in TFRecord: Value type in Featurestore | Value type in TFRecord DOUBLE,
   * DOUBLE_ARRAY | FLOAT_LIST INT64, INT64_ARRAY | INT64_LIST STRING, STRING_ARRAY, BYTES |
   * BYTES_LIST true -> byte_string("true"), false -> byte_string("false") BOOL, BOOL_ARRAY (true,
   * false) | BYTES_LIST
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1TFRecordDestination tfrecordDestination;

  /**
   * Output in BigQuery format. BigQueryDestination.output_uri in
   * FeatureValueDestination.bigquery_destination must refer to a table.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1BigQueryDestination getBigqueryDestination() {
    return bigqueryDestination;
  }

  /**
   * Output in BigQuery format. BigQueryDestination.output_uri in
   * FeatureValueDestination.bigquery_destination must refer to a table.
   * @param bigqueryDestination bigqueryDestination or {@code null} for none
   */
  public GoogleCloudAiplatformV1FeatureValueDestination setBigqueryDestination(GoogleCloudAiplatformV1BigQueryDestination bigqueryDestination) {
    this.bigqueryDestination = bigqueryDestination;
    return this;
  }

  /**
   * Output in CSV format. Array Feature value types are not allowed in CSV format.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1CsvDestination getCsvDestination() {
    return csvDestination;
  }

  /**
   * Output in CSV format. Array Feature value types are not allowed in CSV format.
   * @param csvDestination csvDestination or {@code null} for none
   */
  public GoogleCloudAiplatformV1FeatureValueDestination setCsvDestination(GoogleCloudAiplatformV1CsvDestination csvDestination) {
    this.csvDestination = csvDestination;
    return this;
  }

  /**
   * Output in TFRecord format. Below are the mapping from Feature value type in Featurestore to
   * Feature value type in TFRecord: Value type in Featurestore | Value type in TFRecord DOUBLE,
   * DOUBLE_ARRAY | FLOAT_LIST INT64, INT64_ARRAY | INT64_LIST STRING, STRING_ARRAY, BYTES |
   * BYTES_LIST true -> byte_string("true"), false -> byte_string("false") BOOL, BOOL_ARRAY (true,
   * false) | BYTES_LIST
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1TFRecordDestination getTfrecordDestination() {
    return tfrecordDestination;
  }

  /**
   * Output in TFRecord format. Below are the mapping from Feature value type in Featurestore to
   * Feature value type in TFRecord: Value type in Featurestore | Value type in TFRecord DOUBLE,
   * DOUBLE_ARRAY | FLOAT_LIST INT64, INT64_ARRAY | INT64_LIST STRING, STRING_ARRAY, BYTES |
   * BYTES_LIST true -> byte_string("true"), false -> byte_string("false") BOOL, BOOL_ARRAY (true,
   * false) | BYTES_LIST
   * @param tfrecordDestination tfrecordDestination or {@code null} for none
   */
  public GoogleCloudAiplatformV1FeatureValueDestination setTfrecordDestination(GoogleCloudAiplatformV1TFRecordDestination tfrecordDestination) {
    this.tfrecordDestination = tfrecordDestination;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1FeatureValueDestination set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1FeatureValueDestination) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1FeatureValueDestination clone() {
    return (GoogleCloudAiplatformV1FeatureValueDestination) super.clone();
  }

}
