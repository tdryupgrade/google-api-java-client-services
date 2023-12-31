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

package com.google.api.services.spanner.v1.model;

/**
 * The response for ListDatabaseRoles.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListDatabaseRolesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Database roles that matched the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DatabaseRole> databaseRoles;

  static {
    // hack to force ProGuard to consider DatabaseRole used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DatabaseRole.class);
  }

  /**
   * `next_page_token` can be sent in a subsequent ListDatabaseRoles call to fetch more of the
   * matching roles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Database roles that matched the request.
   * @return value or {@code null} for none
   */
  public java.util.List<DatabaseRole> getDatabaseRoles() {
    return databaseRoles;
  }

  /**
   * Database roles that matched the request.
   * @param databaseRoles databaseRoles or {@code null} for none
   */
  public ListDatabaseRolesResponse setDatabaseRoles(java.util.List<DatabaseRole> databaseRoles) {
    this.databaseRoles = databaseRoles;
    return this;
  }

  /**
   * `next_page_token` can be sent in a subsequent ListDatabaseRoles call to fetch more of the
   * matching roles.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * `next_page_token` can be sent in a subsequent ListDatabaseRoles call to fetch more of the
   * matching roles.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListDatabaseRolesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListDatabaseRolesResponse set(String fieldName, Object value) {
    return (ListDatabaseRolesResponse) super.set(fieldName, value);
  }

  @Override
  public ListDatabaseRolesResponse clone() {
    return (ListDatabaseRolesResponse) super.clone();
  }

}
