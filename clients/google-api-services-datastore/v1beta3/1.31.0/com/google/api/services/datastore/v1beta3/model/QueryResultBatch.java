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
 * A batch of results produced by a query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryResultBatch extends com.google.api.client.json.GenericJson {

  /**
   * A cursor that points to the position after the last result in the batch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endCursor;

  /**
   * The result type for every entity in `entity_results`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityResultType;

  /**
   * The results for this batch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EntityResult> entityResults;

  static {
    // hack to force ProGuard to consider EntityResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EntityResult.class);
  }

  /**
   * The state of the query after the current batch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String moreResults;

  /**
   * Read timestamp this batch was returned from. This applies to the range of results from the
   * query's `start_cursor` (or the beginning of the query if no cursor was given) to this batch's
   * `end_cursor` (not the query's `end_cursor`). In a single transaction, subsequent query result
   * batches for the same query can have a greater timestamp. Each batch's read timestamp is valid
   * for all preceding batches. This value will not be set for eventually consistent queries in
   * Cloud Datastore.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String readTime;

  /**
   * A cursor that points to the position after the last skipped result. Will be set when
   * `skipped_results` != 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String skippedCursor;

  /**
   * The number of results skipped, typically because of an offset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer skippedResults;

  /**
   * The version number of the snapshot this batch was returned from. This applies to the range of
   * results from the query's `start_cursor` (or the beginning of the query if no cursor was given)
   * to this batch's `end_cursor` (not the query's `end_cursor`). In a single transaction,
   * subsequent query result batches for the same query can have a greater snapshot version number.
   * Each batch's snapshot version is valid for all preceding batches. The value will be zero for
   * eventually consistent queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long snapshotVersion;

  /**
   * A cursor that points to the position after the last result in the batch.
   * @see #decodeEndCursor()
   * @return value or {@code null} for none
   */
  public java.lang.String getEndCursor() {
    return endCursor;
  }

  /**
   * A cursor that points to the position after the last result in the batch.
   * @see #getEndCursor()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeEndCursor() {
    return com.google.api.client.util.Base64.decodeBase64(endCursor);
  }

  /**
   * A cursor that points to the position after the last result in the batch.
   * @see #encodeEndCursor()
   * @param endCursor endCursor or {@code null} for none
   */
  public QueryResultBatch setEndCursor(java.lang.String endCursor) {
    this.endCursor = endCursor;
    return this;
  }

  /**
   * A cursor that points to the position after the last result in the batch.
   * @see #setEndCursor()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public QueryResultBatch encodeEndCursor(byte[] endCursor) {
    this.endCursor = com.google.api.client.util.Base64.encodeBase64URLSafeString(endCursor);
    return this;
  }

  /**
   * The result type for every entity in `entity_results`.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityResultType() {
    return entityResultType;
  }

  /**
   * The result type for every entity in `entity_results`.
   * @param entityResultType entityResultType or {@code null} for none
   */
  public QueryResultBatch setEntityResultType(java.lang.String entityResultType) {
    this.entityResultType = entityResultType;
    return this;
  }

  /**
   * The results for this batch.
   * @return value or {@code null} for none
   */
  public java.util.List<EntityResult> getEntityResults() {
    return entityResults;
  }

  /**
   * The results for this batch.
   * @param entityResults entityResults or {@code null} for none
   */
  public QueryResultBatch setEntityResults(java.util.List<EntityResult> entityResults) {
    this.entityResults = entityResults;
    return this;
  }

  /**
   * The state of the query after the current batch.
   * @return value or {@code null} for none
   */
  public java.lang.String getMoreResults() {
    return moreResults;
  }

  /**
   * The state of the query after the current batch.
   * @param moreResults moreResults or {@code null} for none
   */
  public QueryResultBatch setMoreResults(java.lang.String moreResults) {
    this.moreResults = moreResults;
    return this;
  }

  /**
   * Read timestamp this batch was returned from. This applies to the range of results from the
   * query's `start_cursor` (or the beginning of the query if no cursor was given) to this batch's
   * `end_cursor` (not the query's `end_cursor`). In a single transaction, subsequent query result
   * batches for the same query can have a greater timestamp. Each batch's read timestamp is valid
   * for all preceding batches. This value will not be set for eventually consistent queries in
   * Cloud Datastore.
   * @return value or {@code null} for none
   */
  public String getReadTime() {
    return readTime;
  }

  /**
   * Read timestamp this batch was returned from. This applies to the range of results from the
   * query's `start_cursor` (or the beginning of the query if no cursor was given) to this batch's
   * `end_cursor` (not the query's `end_cursor`). In a single transaction, subsequent query result
   * batches for the same query can have a greater timestamp. Each batch's read timestamp is valid
   * for all preceding batches. This value will not be set for eventually consistent queries in
   * Cloud Datastore.
   * @param readTime readTime or {@code null} for none
   */
  public QueryResultBatch setReadTime(String readTime) {
    this.readTime = readTime;
    return this;
  }

  /**
   * A cursor that points to the position after the last skipped result. Will be set when
   * `skipped_results` != 0.
   * @see #decodeSkippedCursor()
   * @return value or {@code null} for none
   */
  public java.lang.String getSkippedCursor() {
    return skippedCursor;
  }

  /**
   * A cursor that points to the position after the last skipped result. Will be set when
   * `skipped_results` != 0.
   * @see #getSkippedCursor()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeSkippedCursor() {
    return com.google.api.client.util.Base64.decodeBase64(skippedCursor);
  }

  /**
   * A cursor that points to the position after the last skipped result. Will be set when
   * `skipped_results` != 0.
   * @see #encodeSkippedCursor()
   * @param skippedCursor skippedCursor or {@code null} for none
   */
  public QueryResultBatch setSkippedCursor(java.lang.String skippedCursor) {
    this.skippedCursor = skippedCursor;
    return this;
  }

  /**
   * A cursor that points to the position after the last skipped result. Will be set when
   * `skipped_results` != 0.
   * @see #setSkippedCursor()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public QueryResultBatch encodeSkippedCursor(byte[] skippedCursor) {
    this.skippedCursor = com.google.api.client.util.Base64.encodeBase64URLSafeString(skippedCursor);
    return this;
  }

  /**
   * The number of results skipped, typically because of an offset.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSkippedResults() {
    return skippedResults;
  }

  /**
   * The number of results skipped, typically because of an offset.
   * @param skippedResults skippedResults or {@code null} for none
   */
  public QueryResultBatch setSkippedResults(java.lang.Integer skippedResults) {
    this.skippedResults = skippedResults;
    return this;
  }

  /**
   * The version number of the snapshot this batch was returned from. This applies to the range of
   * results from the query's `start_cursor` (or the beginning of the query if no cursor was given)
   * to this batch's `end_cursor` (not the query's `end_cursor`). In a single transaction,
   * subsequent query result batches for the same query can have a greater snapshot version number.
   * Each batch's snapshot version is valid for all preceding batches. The value will be zero for
   * eventually consistent queries.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSnapshotVersion() {
    return snapshotVersion;
  }

  /**
   * The version number of the snapshot this batch was returned from. This applies to the range of
   * results from the query's `start_cursor` (or the beginning of the query if no cursor was given)
   * to this batch's `end_cursor` (not the query's `end_cursor`). In a single transaction,
   * subsequent query result batches for the same query can have a greater snapshot version number.
   * Each batch's snapshot version is valid for all preceding batches. The value will be zero for
   * eventually consistent queries.
   * @param snapshotVersion snapshotVersion or {@code null} for none
   */
  public QueryResultBatch setSnapshotVersion(java.lang.Long snapshotVersion) {
    this.snapshotVersion = snapshotVersion;
    return this;
  }

  @Override
  public QueryResultBatch set(String fieldName, Object value) {
    return (QueryResultBatch) super.set(fieldName, value);
  }

  @Override
  public QueryResultBatch clone() {
    return (QueryResultBatch) super.clone();
  }

}
