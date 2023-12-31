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

package com.google.api.services.fitness.model;

/**
 * Next id: 10
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fitness API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AggregateRequest extends com.google.api.client.json.GenericJson {

  /**
   * The specification of data to be aggregated. At least one aggregateBy spec must be provided. All
   * data that is specified will be aggregated using the same bucketing criteria. There will be one
   * dataset in the response for every aggregateBy spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AggregateBy> aggregateBy;

  static {
    // hack to force ProGuard to consider AggregateBy used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AggregateBy.class);
  }

  /**
   * Specifies that data be aggregated each activity segment recorded for a user. Similar to
   * bucketByActivitySegment, but bucketing is done for each activity segment rather than all
   * segments of the same type. Mutually exclusive of other bucketing specifications.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BucketByActivity bucketByActivitySegment;

  /**
   * Specifies that data be aggregated by the type of activity being performed when the data was
   * recorded. All data that was recorded during a certain activity type (.for the given time range)
   * will be aggregated into the same bucket. Data that was recorded while the user was not active
   * will not be included in the response. Mutually exclusive of other bucketing specifications.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BucketByActivity bucketByActivityType;

  /**
   * Specifies that data be aggregated by user sessions. Data that does not fall within the time
   * range of a session will not be included in the response. Mutually exclusive of other bucketing
   * specifications.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BucketBySession bucketBySession;

  /**
   * Specifies that data be aggregated by a single time interval. Mutually exclusive of other
   * bucketing specifications.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BucketByTime bucketByTime;

  /**
   * The end of a window of time. Data that intersects with this time window will be aggregated. The
   * time is in milliseconds since epoch, inclusive. The maximum allowed difference between
   * start_time_millis // and end_time_millis is 7776000000 (roughly 90 days).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long endTimeMillis;

  /**
   * DO NOT POPULATE THIS FIELD. It is ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> filteredDataQualityStandard;

  /**
   * The start of a window of time. Data that intersects with this time window will be aggregated.
   * The time is in milliseconds since epoch, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startTimeMillis;

  /**
   * The specification of data to be aggregated. At least one aggregateBy spec must be provided. All
   * data that is specified will be aggregated using the same bucketing criteria. There will be one
   * dataset in the response for every aggregateBy spec.
   * @return value or {@code null} for none
   */
  public java.util.List<AggregateBy> getAggregateBy() {
    return aggregateBy;
  }

  /**
   * The specification of data to be aggregated. At least one aggregateBy spec must be provided. All
   * data that is specified will be aggregated using the same bucketing criteria. There will be one
   * dataset in the response for every aggregateBy spec.
   * @param aggregateBy aggregateBy or {@code null} for none
   */
  public AggregateRequest setAggregateBy(java.util.List<AggregateBy> aggregateBy) {
    this.aggregateBy = aggregateBy;
    return this;
  }

  /**
   * Specifies that data be aggregated each activity segment recorded for a user. Similar to
   * bucketByActivitySegment, but bucketing is done for each activity segment rather than all
   * segments of the same type. Mutually exclusive of other bucketing specifications.
   * @return value or {@code null} for none
   */
  public BucketByActivity getBucketByActivitySegment() {
    return bucketByActivitySegment;
  }

  /**
   * Specifies that data be aggregated each activity segment recorded for a user. Similar to
   * bucketByActivitySegment, but bucketing is done for each activity segment rather than all
   * segments of the same type. Mutually exclusive of other bucketing specifications.
   * @param bucketByActivitySegment bucketByActivitySegment or {@code null} for none
   */
  public AggregateRequest setBucketByActivitySegment(BucketByActivity bucketByActivitySegment) {
    this.bucketByActivitySegment = bucketByActivitySegment;
    return this;
  }

  /**
   * Specifies that data be aggregated by the type of activity being performed when the data was
   * recorded. All data that was recorded during a certain activity type (.for the given time range)
   * will be aggregated into the same bucket. Data that was recorded while the user was not active
   * will not be included in the response. Mutually exclusive of other bucketing specifications.
   * @return value or {@code null} for none
   */
  public BucketByActivity getBucketByActivityType() {
    return bucketByActivityType;
  }

  /**
   * Specifies that data be aggregated by the type of activity being performed when the data was
   * recorded. All data that was recorded during a certain activity type (.for the given time range)
   * will be aggregated into the same bucket. Data that was recorded while the user was not active
   * will not be included in the response. Mutually exclusive of other bucketing specifications.
   * @param bucketByActivityType bucketByActivityType or {@code null} for none
   */
  public AggregateRequest setBucketByActivityType(BucketByActivity bucketByActivityType) {
    this.bucketByActivityType = bucketByActivityType;
    return this;
  }

  /**
   * Specifies that data be aggregated by user sessions. Data that does not fall within the time
   * range of a session will not be included in the response. Mutually exclusive of other bucketing
   * specifications.
   * @return value or {@code null} for none
   */
  public BucketBySession getBucketBySession() {
    return bucketBySession;
  }

  /**
   * Specifies that data be aggregated by user sessions. Data that does not fall within the time
   * range of a session will not be included in the response. Mutually exclusive of other bucketing
   * specifications.
   * @param bucketBySession bucketBySession or {@code null} for none
   */
  public AggregateRequest setBucketBySession(BucketBySession bucketBySession) {
    this.bucketBySession = bucketBySession;
    return this;
  }

  /**
   * Specifies that data be aggregated by a single time interval. Mutually exclusive of other
   * bucketing specifications.
   * @return value or {@code null} for none
   */
  public BucketByTime getBucketByTime() {
    return bucketByTime;
  }

  /**
   * Specifies that data be aggregated by a single time interval. Mutually exclusive of other
   * bucketing specifications.
   * @param bucketByTime bucketByTime or {@code null} for none
   */
  public AggregateRequest setBucketByTime(BucketByTime bucketByTime) {
    this.bucketByTime = bucketByTime;
    return this;
  }

  /**
   * The end of a window of time. Data that intersects with this time window will be aggregated. The
   * time is in milliseconds since epoch, inclusive. The maximum allowed difference between
   * start_time_millis // and end_time_millis is 7776000000 (roughly 90 days).
   * @return value or {@code null} for none
   */
  public java.lang.Long getEndTimeMillis() {
    return endTimeMillis;
  }

  /**
   * The end of a window of time. Data that intersects with this time window will be aggregated. The
   * time is in milliseconds since epoch, inclusive. The maximum allowed difference between
   * start_time_millis // and end_time_millis is 7776000000 (roughly 90 days).
   * @param endTimeMillis endTimeMillis or {@code null} for none
   */
  public AggregateRequest setEndTimeMillis(java.lang.Long endTimeMillis) {
    this.endTimeMillis = endTimeMillis;
    return this;
  }

  /**
   * DO NOT POPULATE THIS FIELD. It is ignored.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFilteredDataQualityStandard() {
    return filteredDataQualityStandard;
  }

  /**
   * DO NOT POPULATE THIS FIELD. It is ignored.
   * @param filteredDataQualityStandard filteredDataQualityStandard or {@code null} for none
   */
  public AggregateRequest setFilteredDataQualityStandard(java.util.List<java.lang.String> filteredDataQualityStandard) {
    this.filteredDataQualityStandard = filteredDataQualityStandard;
    return this;
  }

  /**
   * The start of a window of time. Data that intersects with this time window will be aggregated.
   * The time is in milliseconds since epoch, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartTimeMillis() {
    return startTimeMillis;
  }

  /**
   * The start of a window of time. Data that intersects with this time window will be aggregated.
   * The time is in milliseconds since epoch, inclusive.
   * @param startTimeMillis startTimeMillis or {@code null} for none
   */
  public AggregateRequest setStartTimeMillis(java.lang.Long startTimeMillis) {
    this.startTimeMillis = startTimeMillis;
    return this;
  }

  @Override
  public AggregateRequest set(String fieldName, Object value) {
    return (AggregateRequest) super.set(fieldName, value);
  }

  @Override
  public AggregateRequest clone() {
    return (AggregateRequest) super.clone();
  }

}
