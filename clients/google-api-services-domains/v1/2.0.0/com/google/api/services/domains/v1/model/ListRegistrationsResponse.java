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

package com.google.api.services.domains.v1.model;

/**
 * Response for the `ListRegistrations` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Domains API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListRegistrationsResponse extends com.google.api.client.json.GenericJson {

  /**
   * When present, there are more results to retrieve. Set `page_token` to this value on a
   * subsequent call to get the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of `Registration`s.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Registration> registrations;

  /**
   * When present, there are more results to retrieve. Set `page_token` to this value on a
   * subsequent call to get the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * When present, there are more results to retrieve. Set `page_token` to this value on a
   * subsequent call to get the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListRegistrationsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A list of `Registration`s.
   * @return value or {@code null} for none
   */
  public java.util.List<Registration> getRegistrations() {
    return registrations;
  }

  /**
   * A list of `Registration`s.
   * @param registrations registrations or {@code null} for none
   */
  public ListRegistrationsResponse setRegistrations(java.util.List<Registration> registrations) {
    this.registrations = registrations;
    return this;
  }

  @Override
  public ListRegistrationsResponse set(String fieldName, Object value) {
    return (ListRegistrationsResponse) super.set(fieldName, value);
  }

  @Override
  public ListRegistrationsResponse clone() {
    return (ListRegistrationsResponse) super.clone();
  }

}
