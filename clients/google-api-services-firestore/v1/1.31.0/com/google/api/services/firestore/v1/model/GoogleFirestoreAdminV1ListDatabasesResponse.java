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

package com.google.api.services.firestore.v1.model;

/**
 * The list of databases for a project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirestoreAdminV1ListDatabasesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The databases in the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleFirestoreAdminV1Database> databases;

  static {
    // hack to force ProGuard to consider GoogleFirestoreAdminV1Database used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleFirestoreAdminV1Database.class);
  }

  /**
   * The databases in the project.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleFirestoreAdminV1Database> getDatabases() {
    return databases;
  }

  /**
   * The databases in the project.
   * @param databases databases or {@code null} for none
   */
  public GoogleFirestoreAdminV1ListDatabasesResponse setDatabases(java.util.List<GoogleFirestoreAdminV1Database> databases) {
    this.databases = databases;
    return this;
  }

  @Override
  public GoogleFirestoreAdminV1ListDatabasesResponse set(String fieldName, Object value) {
    return (GoogleFirestoreAdminV1ListDatabasesResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleFirestoreAdminV1ListDatabasesResponse clone() {
    return (GoogleFirestoreAdminV1ListDatabasesResponse) super.clone();
  }

}
