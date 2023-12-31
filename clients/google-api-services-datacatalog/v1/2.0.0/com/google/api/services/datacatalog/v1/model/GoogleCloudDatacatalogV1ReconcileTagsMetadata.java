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

package com.google.api.services.datacatalog.v1.model;

/**
 * Long-running operation metadata message returned by the ReconcileTags.
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
public final class GoogleCloudDatacatalogV1ReconcileTagsMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Maps the name of each tagged column (or empty string for a sole entry) to tagging operation
   * status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, Status> errors;

  /**
   * State of the reconciliation operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Maps the name of each tagged column (or empty string for a sole entry) to tagging operation
   * status.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, Status> getErrors() {
    return errors;
  }

  /**
   * Maps the name of each tagged column (or empty string for a sole entry) to tagging operation
   * status.
   * @param errors errors or {@code null} for none
   */
  public GoogleCloudDatacatalogV1ReconcileTagsMetadata setErrors(java.util.Map<String, Status> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * State of the reconciliation operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of the reconciliation operation.
   * @param state state or {@code null} for none
   */
  public GoogleCloudDatacatalogV1ReconcileTagsMetadata setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1ReconcileTagsMetadata set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1ReconcileTagsMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1ReconcileTagsMetadata clone() {
    return (GoogleCloudDatacatalogV1ReconcileTagsMetadata) super.clone();
  }

}
