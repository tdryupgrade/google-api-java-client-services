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

package com.google.api.services.cloudasset.v1.model;

/**
 * Response of listing saved queries.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListSavedQueriesResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of savedQueries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SavedQuery> savedQueries;

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListSavedQueriesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A list of savedQueries.
   * @return value or {@code null} for none
   */
  public java.util.List<SavedQuery> getSavedQueries() {
    return savedQueries;
  }

  /**
   * A list of savedQueries.
   * @param savedQueries savedQueries or {@code null} for none
   */
  public ListSavedQueriesResponse setSavedQueries(java.util.List<SavedQuery> savedQueries) {
    this.savedQueries = savedQueries;
    return this;
  }

  @Override
  public ListSavedQueriesResponse set(String fieldName, Object value) {
    return (ListSavedQueriesResponse) super.set(fieldName, value);
  }

  @Override
  public ListSavedQueriesResponse clone() {
    return (ListSavedQueriesResponse) super.clone();
  }

}
