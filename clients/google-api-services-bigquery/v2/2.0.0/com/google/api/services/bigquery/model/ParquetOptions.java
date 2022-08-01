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

package com.google.api.services.bigquery.model;

/**
 * Model definition for ParquetOptions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ParquetOptions extends com.google.api.client.json.GenericJson {

  /**
   * [Optional] Indicates whether to use schema inference specifically for Parquet LIST logical
   * type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableListInference;

  /**
   * [Optional] Indicates whether to infer Parquet ENUM logical type as STRING instead of BYTES by
   * default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enumAsString;

  /**
   * [Optional] Indicates whether to use schema inference specifically for Parquet LIST logical
   * type.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableListInference() {
    return enableListInference;
  }

  /**
   * [Optional] Indicates whether to use schema inference specifically for Parquet LIST logical
   * type.
   * @param enableListInference enableListInference or {@code null} for none
   */
  public ParquetOptions setEnableListInference(java.lang.Boolean enableListInference) {
    this.enableListInference = enableListInference;
    return this;
  }

  /**
   * [Optional] Indicates whether to infer Parquet ENUM logical type as STRING instead of BYTES by
   * default.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnumAsString() {
    return enumAsString;
  }

  /**
   * [Optional] Indicates whether to infer Parquet ENUM logical type as STRING instead of BYTES by
   * default.
   * @param enumAsString enumAsString or {@code null} for none
   */
  public ParquetOptions setEnumAsString(java.lang.Boolean enumAsString) {
    this.enumAsString = enumAsString;
    return this;
  }

  @Override
  public ParquetOptions set(String fieldName, Object value) {
    return (ParquetOptions) super.set(fieldName, value);
  }

  @Override
  public ParquetOptions clone() {
    return (ParquetOptions) super.clone();
  }

}
