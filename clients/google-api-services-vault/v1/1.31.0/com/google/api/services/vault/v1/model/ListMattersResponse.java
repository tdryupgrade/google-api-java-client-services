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

package com.google.api.services.vault.v1.model;

/**
 * Provides the list of matters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListMattersResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of matters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Matter> matters;

  /**
   * Page token to retrieve the next page of results in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of matters.
   * @return value or {@code null} for none
   */
  public java.util.List<Matter> getMatters() {
    return matters;
  }

  /**
   * List of matters.
   * @param matters matters or {@code null} for none
   */
  public ListMattersResponse setMatters(java.util.List<Matter> matters) {
    this.matters = matters;
    return this;
  }

  /**
   * Page token to retrieve the next page of results in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Page token to retrieve the next page of results in the list.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListMattersResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListMattersResponse set(String fieldName, Object value) {
    return (ListMattersResponse) super.set(fieldName, value);
  }

  @Override
  public ListMattersResponse clone() {
    return (ListMattersResponse) super.clone();
  }

}
