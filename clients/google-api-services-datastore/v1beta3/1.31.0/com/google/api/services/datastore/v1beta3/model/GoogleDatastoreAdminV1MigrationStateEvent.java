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

package com.google.api.services.datastore.v1beta3.model;

/**
 * An event signifying a change in state of a [migration from Cloud Datastore to Cloud Firestore in
 * Datastore mode](https://cloud.google.com/datastore/docs/upgrade-to-firestore).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDatastoreAdminV1MigrationStateEvent extends com.google.api.client.json.GenericJson {

  /**
   * The new state of the migration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The new state of the migration.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The new state of the migration.
   * @param state state or {@code null} for none
   */
  public GoogleDatastoreAdminV1MigrationStateEvent setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleDatastoreAdminV1MigrationStateEvent set(String fieldName, Object value) {
    return (GoogleDatastoreAdminV1MigrationStateEvent) super.set(fieldName, value);
  }

  @Override
  public GoogleDatastoreAdminV1MigrationStateEvent clone() {
    return (GoogleDatastoreAdminV1MigrationStateEvent) super.clone();
  }

}
