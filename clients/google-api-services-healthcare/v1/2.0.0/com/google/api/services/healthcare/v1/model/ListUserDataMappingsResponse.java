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

package com.google.api.services.healthcare.v1.model;

/**
 * Model definition for ListUserDataMappingsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListUserDataMappingsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The returned User data mappings. The maximum number of User data mappings returned is
   * determined by the value of page_size in the ListUserDataMappingsRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UserDataMapping> userDataMappings;

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListUserDataMappingsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The returned User data mappings. The maximum number of User data mappings returned is
   * determined by the value of page_size in the ListUserDataMappingsRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<UserDataMapping> getUserDataMappings() {
    return userDataMappings;
  }

  /**
   * The returned User data mappings. The maximum number of User data mappings returned is
   * determined by the value of page_size in the ListUserDataMappingsRequest.
   * @param userDataMappings userDataMappings or {@code null} for none
   */
  public ListUserDataMappingsResponse setUserDataMappings(java.util.List<UserDataMapping> userDataMappings) {
    this.userDataMappings = userDataMappings;
    return this;
  }

  @Override
  public ListUserDataMappingsResponse set(String fieldName, Object value) {
    return (ListUserDataMappingsResponse) super.set(fieldName, value);
  }

  @Override
  public ListUserDataMappingsResponse clone() {
    return (ListUserDataMappingsResponse) super.clone();
  }

}
