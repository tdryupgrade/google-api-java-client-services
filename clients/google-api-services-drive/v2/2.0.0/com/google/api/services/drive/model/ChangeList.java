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

package com.google.api.services.drive.model;

/**
 * A list of changes for a user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChangeList extends com.google.api.client.json.GenericJson {

  /**
   * The ETag of the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The list of changes. If nextPageToken is populated, then this list may be incomplete and an
   * additional page of results should be fetched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Change> items;

  static {
    // hack to force ProGuard to consider Change used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Change.class);
  }

  /**
   * This is always `drive#changeList`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The current largest change ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long largestChangeId;

  /**
   * The starting page token for future changes. This will be present only if the end of the current
   * changes list has been reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newStartPageToken;

  /**
   * A link to the next page of changes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextLink;

  /**
   * The page token for the next page of changes. This will be absent if the end of the changes list
   * has been reached. If the token is rejected for any reason, it should be discarded, and
   * pagination should be restarted from the first page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A link back to this list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The ETag of the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The ETag of the list.
   * @param etag etag or {@code null} for none
   */
  public ChangeList setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The list of changes. If nextPageToken is populated, then this list may be incomplete and an
   * additional page of results should be fetched.
   * @return value or {@code null} for none
   */
  public java.util.List<Change> getItems() {
    return items;
  }

  /**
   * The list of changes. If nextPageToken is populated, then this list may be incomplete and an
   * additional page of results should be fetched.
   * @param items items or {@code null} for none
   */
  public ChangeList setItems(java.util.List<Change> items) {
    this.items = items;
    return this;
  }

  /**
   * This is always `drive#changeList`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always `drive#changeList`.
   * @param kind kind or {@code null} for none
   */
  public ChangeList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The current largest change ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLargestChangeId() {
    return largestChangeId;
  }

  /**
   * The current largest change ID.
   * @param largestChangeId largestChangeId or {@code null} for none
   */
  public ChangeList setLargestChangeId(java.lang.Long largestChangeId) {
    this.largestChangeId = largestChangeId;
    return this;
  }

  /**
   * The starting page token for future changes. This will be present only if the end of the current
   * changes list has been reached.
   * @return value or {@code null} for none
   */
  public java.lang.String getNewStartPageToken() {
    return newStartPageToken;
  }

  /**
   * The starting page token for future changes. This will be present only if the end of the current
   * changes list has been reached.
   * @param newStartPageToken newStartPageToken or {@code null} for none
   */
  public ChangeList setNewStartPageToken(java.lang.String newStartPageToken) {
    this.newStartPageToken = newStartPageToken;
    return this;
  }

  /**
   * A link to the next page of changes.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextLink() {
    return nextLink;
  }

  /**
   * A link to the next page of changes.
   * @param nextLink nextLink or {@code null} for none
   */
  public ChangeList setNextLink(java.lang.String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

  /**
   * The page token for the next page of changes. This will be absent if the end of the changes list
   * has been reached. If the token is rejected for any reason, it should be discarded, and
   * pagination should be restarted from the first page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The page token for the next page of changes. This will be absent if the end of the changes list
   * has been reached. If the token is rejected for any reason, it should be discarded, and
   * pagination should be restarted from the first page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ChangeList setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A link back to this list.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * A link back to this list.
   * @param selfLink selfLink or {@code null} for none
   */
  public ChangeList setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public ChangeList set(String fieldName, Object value) {
    return (ChangeList) super.set(fieldName, value);
  }

  @Override
  public ChangeList clone() {
    return (ChangeList) super.clone();
  }

}
