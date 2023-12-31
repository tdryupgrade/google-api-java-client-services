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
 * Fields specific for BigQuery routines.
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
public final class GoogleCloudDatacatalogV1BigQueryRoutineSpec extends com.google.api.client.json.GenericJson {

  /**
   * Paths of the imported libraries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> importedLibraries;

  /**
   * Paths of the imported libraries.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getImportedLibraries() {
    return importedLibraries;
  }

  /**
   * Paths of the imported libraries.
   * @param importedLibraries importedLibraries or {@code null} for none
   */
  public GoogleCloudDatacatalogV1BigQueryRoutineSpec setImportedLibraries(java.util.List<java.lang.String> importedLibraries) {
    this.importedLibraries = importedLibraries;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1BigQueryRoutineSpec set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1BigQueryRoutineSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1BigQueryRoutineSpec clone() {
    return (GoogleCloudDatacatalogV1BigQueryRoutineSpec) super.clone();
  }

}
