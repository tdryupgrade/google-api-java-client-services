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

package com.google.api.services.datacatalog.v1beta1.model;

/**
 * Specification that applies to a data source connection. Valid only for entries with the
 * `DATA_SOURCE_CONNECTION` type. Only one of internal specs can be set at the time, and cannot be
 * changed later.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1DataSourceConnectionSpec extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Fields specific to BigQuery connections.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1BigQueryConnectionSpec bigqueryConnectionSpec;

  /**
   * Output only. Fields specific to BigQuery connections.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1BigQueryConnectionSpec getBigqueryConnectionSpec() {
    return bigqueryConnectionSpec;
  }

  /**
   * Output only. Fields specific to BigQuery connections.
   * @param bigqueryConnectionSpec bigqueryConnectionSpec or {@code null} for none
   */
  public GoogleCloudDatacatalogV1DataSourceConnectionSpec setBigqueryConnectionSpec(GoogleCloudDatacatalogV1BigQueryConnectionSpec bigqueryConnectionSpec) {
    this.bigqueryConnectionSpec = bigqueryConnectionSpec;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1DataSourceConnectionSpec set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1DataSourceConnectionSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1DataSourceConnectionSpec clone() {
    return (GoogleCloudDatacatalogV1DataSourceConnectionSpec) super.clone();
  }

}
