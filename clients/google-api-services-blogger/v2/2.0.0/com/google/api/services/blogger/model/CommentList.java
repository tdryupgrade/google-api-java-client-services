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

package com.google.api.services.blogger.model;

/**
 * Model definition for CommentList.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Blogger API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CommentList extends com.google.api.client.json.GenericJson {

  /**
   * Etag of the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The List of Comments for a Post.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Comment> items;

  static {
    // hack to force ProGuard to consider Comment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Comment.class);
  }

  /**
   * The kind of this entry. Always blogger#commentList.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Pagination token to fetch the next page, if one exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Pagination token to fetch the previous page, if one exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String prevPageToken;

  /**
   * Etag of the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of the response.
   * @param etag etag or {@code null} for none
   */
  public CommentList setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The List of Comments for a Post.
   * @return value or {@code null} for none
   */
  public java.util.List<Comment> getItems() {
    return items;
  }

  /**
   * The List of Comments for a Post.
   * @param items items or {@code null} for none
   */
  public CommentList setItems(java.util.List<Comment> items) {
    this.items = items;
    return this;
  }

  /**
   * The kind of this entry. Always blogger#commentList.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of this entry. Always blogger#commentList.
   * @param kind kind or {@code null} for none
   */
  public CommentList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Pagination token to fetch the next page, if one exists.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Pagination token to fetch the next page, if one exists.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public CommentList setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Pagination token to fetch the previous page, if one exists.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrevPageToken() {
    return prevPageToken;
  }

  /**
   * Pagination token to fetch the previous page, if one exists.
   * @param prevPageToken prevPageToken or {@code null} for none
   */
  public CommentList setPrevPageToken(java.lang.String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  @Override
  public CommentList set(String fieldName, Object value) {
    return (CommentList) super.set(fieldName, value);
  }

  @Override
  public CommentList clone() {
    return (CommentList) super.clone();
  }

}
