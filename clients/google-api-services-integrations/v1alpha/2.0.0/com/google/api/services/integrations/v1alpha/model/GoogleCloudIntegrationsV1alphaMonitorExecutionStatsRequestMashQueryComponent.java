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

package com.google.api.services.integrations.v1alpha.model;

/**
 * The components for constructing MashQuery.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestMashQueryComponent extends com.google.api.client.json.GenericJson {

  /**
   * Required. The metric for monarch.BorgTask.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String borgTaskMetric;

  /**
   * Optional. optional, filters on fetched data, "metric:client_id" not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dataFilters;

  /**
   * Optional. optional, filters for Fetch Raw, "metric:client_id" not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> fetchFilters;

  /**
   * Optional. optional, GroupBy variables.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestGroupBy groupBy;

  /**
   * Optional. optional, Point Operation on single query or joined query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pointOperation;

  /**
   * Required. Window time delta.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeDelta;

  /**
   * Required. The metric for monarch.BorgTask.
   * @return value or {@code null} for none
   */
  public java.lang.String getBorgTaskMetric() {
    return borgTaskMetric;
  }

  /**
   * Required. The metric for monarch.BorgTask.
   * @param borgTaskMetric borgTaskMetric or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestMashQueryComponent setBorgTaskMetric(java.lang.String borgTaskMetric) {
    this.borgTaskMetric = borgTaskMetric;
    return this;
  }

  /**
   * Optional. optional, filters on fetched data, "metric:client_id" not supported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDataFilters() {
    return dataFilters;
  }

  /**
   * Optional. optional, filters on fetched data, "metric:client_id" not supported.
   * @param dataFilters dataFilters or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestMashQueryComponent setDataFilters(java.util.List<java.lang.String> dataFilters) {
    this.dataFilters = dataFilters;
    return this;
  }

  /**
   * Optional. optional, filters for Fetch Raw, "metric:client_id" not supported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFetchFilters() {
    return fetchFilters;
  }

  /**
   * Optional. optional, filters for Fetch Raw, "metric:client_id" not supported.
   * @param fetchFilters fetchFilters or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestMashQueryComponent setFetchFilters(java.util.List<java.lang.String> fetchFilters) {
    this.fetchFilters = fetchFilters;
    return this;
  }

  /**
   * Optional. optional, GroupBy variables.
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestGroupBy getGroupBy() {
    return groupBy;
  }

  /**
   * Optional. optional, GroupBy variables.
   * @param groupBy groupBy or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestMashQueryComponent setGroupBy(GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestGroupBy groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  /**
   * Optional. optional, Point Operation on single query or joined query.
   * @return value or {@code null} for none
   */
  public java.lang.String getPointOperation() {
    return pointOperation;
  }

  /**
   * Optional. optional, Point Operation on single query or joined query.
   * @param pointOperation pointOperation or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestMashQueryComponent setPointOperation(java.lang.String pointOperation) {
    this.pointOperation = pointOperation;
    return this;
  }

  /**
   * Required. Window time delta.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeDelta() {
    return timeDelta;
  }

  /**
   * Required. Window time delta.
   * @param timeDelta timeDelta or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestMashQueryComponent setTimeDelta(java.lang.String timeDelta) {
    this.timeDelta = timeDelta;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestMashQueryComponent set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestMashQueryComponent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestMashQueryComponent clone() {
    return (GoogleCloudIntegrationsV1alphaMonitorExecutionStatsRequestMashQueryComponent) super.clone();
  }

}
