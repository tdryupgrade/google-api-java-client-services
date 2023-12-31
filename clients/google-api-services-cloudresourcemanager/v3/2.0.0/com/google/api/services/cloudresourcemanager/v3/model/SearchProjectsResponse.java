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

package com.google.api.services.cloudresourcemanager.v3.model;

/**
 * A page of the response received from the SearchProjects method. A paginated response where more
 * pages are available has `next_page_token` set. This token can be used in a subsequent request to
 * retrieve the next request page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchProjectsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Pagination token. If the result set is too large to fit in a single response, this token is
   * returned. It encodes the position of the current result cursor. Feeding this value into a new
   * list request with the `page_token` parameter gives the next page of the results. When
   * `next_page_token` is not filled in, there is no next page and the list returned is the last
   * page in the result set. Pagination tokens have a limited lifetime.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of Projects that matched the list filter query. This list can be paginated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Project> projects;

  static {
    // hack to force ProGuard to consider Project used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Project.class);
  }

  /**
   * Pagination token. If the result set is too large to fit in a single response, this token is
   * returned. It encodes the position of the current result cursor. Feeding this value into a new
   * list request with the `page_token` parameter gives the next page of the results. When
   * `next_page_token` is not filled in, there is no next page and the list returned is the last
   * page in the result set. Pagination tokens have a limited lifetime.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Pagination token. If the result set is too large to fit in a single response, this token is
   * returned. It encodes the position of the current result cursor. Feeding this value into a new
   * list request with the `page_token` parameter gives the next page of the results. When
   * `next_page_token` is not filled in, there is no next page and the list returned is the last
   * page in the result set. Pagination tokens have a limited lifetime.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SearchProjectsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of Projects that matched the list filter query. This list can be paginated.
   * @return value or {@code null} for none
   */
  public java.util.List<Project> getProjects() {
    return projects;
  }

  /**
   * The list of Projects that matched the list filter query. This list can be paginated.
   * @param projects projects or {@code null} for none
   */
  public SearchProjectsResponse setProjects(java.util.List<Project> projects) {
    this.projects = projects;
    return this;
  }

  @Override
  public SearchProjectsResponse set(String fieldName, Object value) {
    return (SearchProjectsResponse) super.set(fieldName, value);
  }

  @Override
  public SearchProjectsResponse clone() {
    return (SearchProjectsResponse) super.clone();
  }

}
