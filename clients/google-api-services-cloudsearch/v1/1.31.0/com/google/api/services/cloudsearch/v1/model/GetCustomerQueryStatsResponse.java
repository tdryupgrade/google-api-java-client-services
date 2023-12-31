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
 * Model definition for GetCustomerQueryStatsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetCustomerQueryStatsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomerQueryStats> stats;

  static {
    // hack to force ProGuard to consider CustomerQueryStats used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CustomerQueryStats.class);
  }

  /**
   * Total successful query count (status code 200) for the given date range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalQueryCount;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<CustomerQueryStats> getStats() {
    return stats;
  }

  /**
   * @param stats stats or {@code null} for none
   */
  public GetCustomerQueryStatsResponse setStats(java.util.List<CustomerQueryStats> stats) {
    this.stats = stats;
    return this;
  }

  /**
   * Total successful query count (status code 200) for the given date range.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalQueryCount() {
    return totalQueryCount;
  }

  /**
   * Total successful query count (status code 200) for the given date range.
   * @param totalQueryCount totalQueryCount or {@code null} for none
   */
  public GetCustomerQueryStatsResponse setTotalQueryCount(java.lang.Long totalQueryCount) {
    this.totalQueryCount = totalQueryCount;
    return this;
  }

  @Override
  public GetCustomerQueryStatsResponse set(String fieldName, Object value) {
    return (GetCustomerQueryStatsResponse) super.set(fieldName, value);
  }

  @Override
  public GetCustomerQueryStatsResponse clone() {
    return (GetCustomerQueryStatsResponse) super.clone();
  }

}
