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

package com.google.api.services.sheets.v4.model;

/**
 * Specifies a BigQuery table definition. Only [native
 * tables](https://cloud.google.com/bigquery/docs/tables-intro) are allowed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BigQueryTableSpec extends com.google.api.client.json.GenericJson {

  /**
   * The BigQuery dataset id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datasetId;

  /**
   * The BigQuery table id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tableId;

  /**
   * The ID of a BigQuery project the table belongs to. If not specified, the project_id is assumed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tableProjectId;

  /**
   * The BigQuery dataset id.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatasetId() {
    return datasetId;
  }

  /**
   * The BigQuery dataset id.
   * @param datasetId datasetId or {@code null} for none
   */
  public BigQueryTableSpec setDatasetId(java.lang.String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * The BigQuery table id.
   * @return value or {@code null} for none
   */
  public java.lang.String getTableId() {
    return tableId;
  }

  /**
   * The BigQuery table id.
   * @param tableId tableId or {@code null} for none
   */
  public BigQueryTableSpec setTableId(java.lang.String tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   * The ID of a BigQuery project the table belongs to. If not specified, the project_id is assumed.
   * @return value or {@code null} for none
   */
  public java.lang.String getTableProjectId() {
    return tableProjectId;
  }

  /**
   * The ID of a BigQuery project the table belongs to. If not specified, the project_id is assumed.
   * @param tableProjectId tableProjectId or {@code null} for none
   */
  public BigQueryTableSpec setTableProjectId(java.lang.String tableProjectId) {
    this.tableProjectId = tableProjectId;
    return this;
  }

  @Override
  public BigQueryTableSpec set(String fieldName, Object value) {
    return (BigQueryTableSpec) super.set(fieldName, value);
  }

  @Override
  public BigQueryTableSpec clone() {
    return (BigQueryTableSpec) super.clone();
  }

}
