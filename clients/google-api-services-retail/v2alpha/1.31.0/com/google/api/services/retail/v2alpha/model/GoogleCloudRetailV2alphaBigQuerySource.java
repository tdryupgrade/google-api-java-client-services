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

package com.google.api.services.retail.v2alpha.model;

/**
 * BigQuery source import data from.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaBigQuerySource extends com.google.api.client.json.GenericJson {

  /**
   * The schema to use when parsing the data from the source. Supported values for product imports:
   * * `product` (default): One JSON Product per line. Each product must have a valid Product.id. *
   * `product_merchant_center`: See [Importing catalog data from Merchant
   * Center](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog#mc). Supported
   * values for user events imports: * `user_event` (default): One JSON UserEvent per line. *
   * `user_event_ga360`: The schema is available here:
   * https://support.google.com/analytics/answer/3437719. * `user_event_ga4`: This feature is in
   * private preview. Please contact the support team for importing Google Analytics 4 events. The
   * schema is available here: https://support.google.com/analytics/answer/7029846.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataSchema;

  /**
   * Required. The BigQuery data set to copy the data from with a length limit of 1,024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datasetId;

  /**
   * Intermediate Cloud Storage directory used for the import with a length limit of 2,000
   * characters. Can be specified if one wants to have the BigQuery export to a specific Cloud
   * Storage directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsStagingDir;

  /**
   * BigQuery time partitioned table's _PARTITIONDATE in YYYY-MM-DD format. Only supported when
   * ImportProductsRequest.reconciliation_mode is set to `FULL`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeDate partitionDate;

  /**
   * The project ID (can be project # or ID) that the BigQuery source is in with a length limit of
   * 128 characters. If not specified, inherits the project ID from the parent request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Required. The BigQuery table to copy the data from with a length limit of 1,024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tableId;

  /**
   * The schema to use when parsing the data from the source. Supported values for product imports:
   * * `product` (default): One JSON Product per line. Each product must have a valid Product.id. *
   * `product_merchant_center`: See [Importing catalog data from Merchant
   * Center](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog#mc). Supported
   * values for user events imports: * `user_event` (default): One JSON UserEvent per line. *
   * `user_event_ga360`: The schema is available here:
   * https://support.google.com/analytics/answer/3437719. * `user_event_ga4`: This feature is in
   * private preview. Please contact the support team for importing Google Analytics 4 events. The
   * schema is available here: https://support.google.com/analytics/answer/7029846.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataSchema() {
    return dataSchema;
  }

  /**
   * The schema to use when parsing the data from the source. Supported values for product imports:
   * * `product` (default): One JSON Product per line. Each product must have a valid Product.id. *
   * `product_merchant_center`: See [Importing catalog data from Merchant
   * Center](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog#mc). Supported
   * values for user events imports: * `user_event` (default): One JSON UserEvent per line. *
   * `user_event_ga360`: The schema is available here:
   * https://support.google.com/analytics/answer/3437719. * `user_event_ga4`: This feature is in
   * private preview. Please contact the support team for importing Google Analytics 4 events. The
   * schema is available here: https://support.google.com/analytics/answer/7029846.
   * @param dataSchema dataSchema or {@code null} for none
   */
  public GoogleCloudRetailV2alphaBigQuerySource setDataSchema(java.lang.String dataSchema) {
    this.dataSchema = dataSchema;
    return this;
  }

  /**
   * Required. The BigQuery data set to copy the data from with a length limit of 1,024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatasetId() {
    return datasetId;
  }

  /**
   * Required. The BigQuery data set to copy the data from with a length limit of 1,024 characters.
   * @param datasetId datasetId or {@code null} for none
   */
  public GoogleCloudRetailV2alphaBigQuerySource setDatasetId(java.lang.String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * Intermediate Cloud Storage directory used for the import with a length limit of 2,000
   * characters. Can be specified if one wants to have the BigQuery export to a specific Cloud
   * Storage directory.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsStagingDir() {
    return gcsStagingDir;
  }

  /**
   * Intermediate Cloud Storage directory used for the import with a length limit of 2,000
   * characters. Can be specified if one wants to have the BigQuery export to a specific Cloud
   * Storage directory.
   * @param gcsStagingDir gcsStagingDir or {@code null} for none
   */
  public GoogleCloudRetailV2alphaBigQuerySource setGcsStagingDir(java.lang.String gcsStagingDir) {
    this.gcsStagingDir = gcsStagingDir;
    return this;
  }

  /**
   * BigQuery time partitioned table's _PARTITIONDATE in YYYY-MM-DD format. Only supported when
   * ImportProductsRequest.reconciliation_mode is set to `FULL`.
   * @return value or {@code null} for none
   */
  public GoogleTypeDate getPartitionDate() {
    return partitionDate;
  }

  /**
   * BigQuery time partitioned table's _PARTITIONDATE in YYYY-MM-DD format. Only supported when
   * ImportProductsRequest.reconciliation_mode is set to `FULL`.
   * @param partitionDate partitionDate or {@code null} for none
   */
  public GoogleCloudRetailV2alphaBigQuerySource setPartitionDate(GoogleTypeDate partitionDate) {
    this.partitionDate = partitionDate;
    return this;
  }

  /**
   * The project ID (can be project # or ID) that the BigQuery source is in with a length limit of
   * 128 characters. If not specified, inherits the project ID from the parent request.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * The project ID (can be project # or ID) that the BigQuery source is in with a length limit of
   * 128 characters. If not specified, inherits the project ID from the parent request.
   * @param projectId projectId or {@code null} for none
   */
  public GoogleCloudRetailV2alphaBigQuerySource setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Required. The BigQuery table to copy the data from with a length limit of 1,024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getTableId() {
    return tableId;
  }

  /**
   * Required. The BigQuery table to copy the data from with a length limit of 1,024 characters.
   * @param tableId tableId or {@code null} for none
   */
  public GoogleCloudRetailV2alphaBigQuerySource setTableId(java.lang.String tableId) {
    this.tableId = tableId;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaBigQuerySource set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaBigQuerySource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaBigQuerySource clone() {
    return (GoogleCloudRetailV2alphaBigQuerySource) super.clone();
  }

}
