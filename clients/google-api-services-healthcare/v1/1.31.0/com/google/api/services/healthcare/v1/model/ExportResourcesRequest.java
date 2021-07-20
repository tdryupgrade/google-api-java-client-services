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

package com.google.api.services.healthcare.v1.model;

/**
 * Request to export resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExportResourcesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The BigQuery output destination. The Cloud Healthcare Service Agent requires two IAM roles on
   * the BigQuery location: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`. The output is
   * one BigQuery table per resource type. Unlike when setting `BigQueryDestination` for
   * `StreamConfig`, `ExportResources` does not create BigQuery views.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudHealthcareV1FhirBigQueryDestination bigqueryDestination;

  /**
   * The Cloud Storage output destination. The Healthcare Service Agent account requires the
   * `roles/storage.objectAdmin` role on the Cloud Storage location. The exported outputs are
   * organized by FHIR resource types. The server creates one object per resource type. Each object
   * contains newline delimited JSON, and each line is a FHIR resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudHealthcareV1FhirGcsDestination gcsDestination;

  /**
   * The BigQuery output destination. The Cloud Healthcare Service Agent requires two IAM roles on
   * the BigQuery location: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`. The output is
   * one BigQuery table per resource type. Unlike when setting `BigQueryDestination` for
   * `StreamConfig`, `ExportResources` does not create BigQuery views.
   * @return value or {@code null} for none
   */
  public GoogleCloudHealthcareV1FhirBigQueryDestination getBigqueryDestination() {
    return bigqueryDestination;
  }

  /**
   * The BigQuery output destination. The Cloud Healthcare Service Agent requires two IAM roles on
   * the BigQuery location: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`. The output is
   * one BigQuery table per resource type. Unlike when setting `BigQueryDestination` for
   * `StreamConfig`, `ExportResources` does not create BigQuery views.
   * @param bigqueryDestination bigqueryDestination or {@code null} for none
   */
  public ExportResourcesRequest setBigqueryDestination(GoogleCloudHealthcareV1FhirBigQueryDestination bigqueryDestination) {
    this.bigqueryDestination = bigqueryDestination;
    return this;
  }

  /**
   * The Cloud Storage output destination. The Healthcare Service Agent account requires the
   * `roles/storage.objectAdmin` role on the Cloud Storage location. The exported outputs are
   * organized by FHIR resource types. The server creates one object per resource type. Each object
   * contains newline delimited JSON, and each line is a FHIR resource.
   * @return value or {@code null} for none
   */
  public GoogleCloudHealthcareV1FhirGcsDestination getGcsDestination() {
    return gcsDestination;
  }

  /**
   * The Cloud Storage output destination. The Healthcare Service Agent account requires the
   * `roles/storage.objectAdmin` role on the Cloud Storage location. The exported outputs are
   * organized by FHIR resource types. The server creates one object per resource type. Each object
   * contains newline delimited JSON, and each line is a FHIR resource.
   * @param gcsDestination gcsDestination or {@code null} for none
   */
  public ExportResourcesRequest setGcsDestination(GoogleCloudHealthcareV1FhirGcsDestination gcsDestination) {
    this.gcsDestination = gcsDestination;
    return this;
  }

  @Override
  public ExportResourcesRequest set(String fieldName, Object value) {
    return (ExportResourcesRequest) super.set(fieldName, value);
  }

  @Override
  public ExportResourcesRequest clone() {
    return (ExportResourcesRequest) super.clone();
  }

}
