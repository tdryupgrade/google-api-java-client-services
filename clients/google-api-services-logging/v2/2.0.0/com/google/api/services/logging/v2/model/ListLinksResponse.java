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

package com.google.api.services.logging.v2.model;

/**
 * The response from ListLinks.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListLinksResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of links.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Link> links;

  static {
    // hack to force ProGuard to consider Link used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Link.class);
  }

  /**
   * If there might be more results than those appearing in this response, then nextPageToken is
   * included. To get the next set of results, call the same method again using the value of
   * nextPageToken as pageToken.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of links.
   * @return value or {@code null} for none
   */
  public java.util.List<Link> getLinks() {
    return links;
  }

  /**
   * A list of links.
   * @param links links or {@code null} for none
   */
  public ListLinksResponse setLinks(java.util.List<Link> links) {
    this.links = links;
    return this;
  }

  /**
   * If there might be more results than those appearing in this response, then nextPageToken is
   * included. To get the next set of results, call the same method again using the value of
   * nextPageToken as pageToken.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If there might be more results than those appearing in this response, then nextPageToken is
   * included. To get the next set of results, call the same method again using the value of
   * nextPageToken as pageToken.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListLinksResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListLinksResponse set(String fieldName, Object value) {
    return (ListLinksResponse) super.set(fieldName, value);
  }

  @Override
  public ListLinksResponse clone() {
    return (ListLinksResponse) super.clone();
  }

}
