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
 * Aggregation of items by status code as of the specified date.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataSourceIndexStats extends com.google.api.client.json.GenericJson {

  /**
   * The date for which index stats were calculated. If the date of request is not the current date
   * then stats calculated on the next day are returned. Stats are calculated close to mid night in
   * this case. If date of request is current date, then real time stats are returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date date;

  /**
   * Number of items aggregrated by status code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ItemCountByStatus> itemCountByStatus;

  /**
   * The date for which index stats were calculated. If the date of request is not the current date
   * then stats calculated on the next day are returned. Stats are calculated close to mid night in
   * this case. If date of request is current date, then real time stats are returned.
   * @return value or {@code null} for none
   */
  public Date getDate() {
    return date;
  }

  /**
   * The date for which index stats were calculated. If the date of request is not the current date
   * then stats calculated on the next day are returned. Stats are calculated close to mid night in
   * this case. If date of request is current date, then real time stats are returned.
   * @param date date or {@code null} for none
   */
  public DataSourceIndexStats setDate(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Number of items aggregrated by status code.
   * @return value or {@code null} for none
   */
  public java.util.List<ItemCountByStatus> getItemCountByStatus() {
    return itemCountByStatus;
  }

  /**
   * Number of items aggregrated by status code.
   * @param itemCountByStatus itemCountByStatus or {@code null} for none
   */
  public DataSourceIndexStats setItemCountByStatus(java.util.List<ItemCountByStatus> itemCountByStatus) {
    this.itemCountByStatus = itemCountByStatus;
    return this;
  }

  @Override
  public DataSourceIndexStats set(String fieldName, Object value) {
    return (DataSourceIndexStats) super.set(fieldName, value);
  }

  @Override
  public DataSourceIndexStats clone() {
    return (DataSourceIndexStats) super.clone();
  }

}
