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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Model definition for SearchApplicationUserStats.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchApplicationUserStats extends com.google.api.client.json.GenericJson {

  /**
   * The date for which session stats were calculated. Stats calculated on the next day close to
   * midnight are returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date date;

  /**
   * The count of unique active users in the past one day
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long oneDayActiveUsersCount;

  /**
   * The count of unique active users in the past seven days
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sevenDaysActiveUsersCount;

  /**
   * The count of unique active users in the past thirty days
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long thirtyDaysActiveUsersCount;

  /**
   * The date for which session stats were calculated. Stats calculated on the next day close to
   * midnight are returned.
   * @return value or {@code null} for none
   */
  public Date getDate() {
    return date;
  }

  /**
   * The date for which session stats were calculated. Stats calculated on the next day close to
   * midnight are returned.
   * @param date date or {@code null} for none
   */
  public SearchApplicationUserStats setDate(Date date) {
    this.date = date;
    return this;
  }

  /**
   * The count of unique active users in the past one day
   * @return value or {@code null} for none
   */
  public java.lang.Long getOneDayActiveUsersCount() {
    return oneDayActiveUsersCount;
  }

  /**
   * The count of unique active users in the past one day
   * @param oneDayActiveUsersCount oneDayActiveUsersCount or {@code null} for none
   */
  public SearchApplicationUserStats setOneDayActiveUsersCount(java.lang.Long oneDayActiveUsersCount) {
    this.oneDayActiveUsersCount = oneDayActiveUsersCount;
    return this;
  }

  /**
   * The count of unique active users in the past seven days
   * @return value or {@code null} for none
   */
  public java.lang.Long getSevenDaysActiveUsersCount() {
    return sevenDaysActiveUsersCount;
  }

  /**
   * The count of unique active users in the past seven days
   * @param sevenDaysActiveUsersCount sevenDaysActiveUsersCount or {@code null} for none
   */
  public SearchApplicationUserStats setSevenDaysActiveUsersCount(java.lang.Long sevenDaysActiveUsersCount) {
    this.sevenDaysActiveUsersCount = sevenDaysActiveUsersCount;
    return this;
  }

  /**
   * The count of unique active users in the past thirty days
   * @return value or {@code null} for none
   */
  public java.lang.Long getThirtyDaysActiveUsersCount() {
    return thirtyDaysActiveUsersCount;
  }

  /**
   * The count of unique active users in the past thirty days
   * @param thirtyDaysActiveUsersCount thirtyDaysActiveUsersCount or {@code null} for none
   */
  public SearchApplicationUserStats setThirtyDaysActiveUsersCount(java.lang.Long thirtyDaysActiveUsersCount) {
    this.thirtyDaysActiveUsersCount = thirtyDaysActiveUsersCount;
    return this;
  }

  @Override
  public SearchApplicationUserStats set(String fieldName, Object value) {
    return (SearchApplicationUserStats) super.set(fieldName, value);
  }

  @Override
  public SearchApplicationUserStats clone() {
    return (SearchApplicationUserStats) super.clone();
  }

}
