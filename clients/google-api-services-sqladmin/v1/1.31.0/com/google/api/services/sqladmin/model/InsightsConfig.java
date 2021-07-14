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

package com.google.api.services.sqladmin.model;

/**
 * Insights configuration. This specifies when Cloud SQL Insights feature is enabled and optional
 * configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InsightsConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether Query Insights feature is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean queryInsightsEnabled;

  /**
   * Number of query plans generated by Insights per minute. Default is 5. Changing this will
   * restart the database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer queryPlansPerMinute;

  /**
   * Maximum query length stored in bytes. Default value: 1024 bytes. Range: 256-4500 bytes. Query
   * length more than this field value will be truncated to this value. When unset, query length
   * will be the default value. Changing query length will restart the database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer queryStringLength;

  /**
   * Whether Query Insights will record application tags from query when enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean recordApplicationTags;

  /**
   * Whether Query Insights will record client address when enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean recordClientAddress;

  /**
   * Whether Query Insights feature is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getQueryInsightsEnabled() {
    return queryInsightsEnabled;
  }

  /**
   * Whether Query Insights feature is enabled.
   * @param queryInsightsEnabled queryInsightsEnabled or {@code null} for none
   */
  public InsightsConfig setQueryInsightsEnabled(java.lang.Boolean queryInsightsEnabled) {
    this.queryInsightsEnabled = queryInsightsEnabled;
    return this;
  }

  /**
   * Number of query plans generated by Insights per minute. Default is 5. Changing this will
   * restart the database.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getQueryPlansPerMinute() {
    return queryPlansPerMinute;
  }

  /**
   * Number of query plans generated by Insights per minute. Default is 5. Changing this will
   * restart the database.
   * @param queryPlansPerMinute queryPlansPerMinute or {@code null} for none
   */
  public InsightsConfig setQueryPlansPerMinute(java.lang.Integer queryPlansPerMinute) {
    this.queryPlansPerMinute = queryPlansPerMinute;
    return this;
  }

  /**
   * Maximum query length stored in bytes. Default value: 1024 bytes. Range: 256-4500 bytes. Query
   * length more than this field value will be truncated to this value. When unset, query length
   * will be the default value. Changing query length will restart the database.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getQueryStringLength() {
    return queryStringLength;
  }

  /**
   * Maximum query length stored in bytes. Default value: 1024 bytes. Range: 256-4500 bytes. Query
   * length more than this field value will be truncated to this value. When unset, query length
   * will be the default value. Changing query length will restart the database.
   * @param queryStringLength queryStringLength or {@code null} for none
   */
  public InsightsConfig setQueryStringLength(java.lang.Integer queryStringLength) {
    this.queryStringLength = queryStringLength;
    return this;
  }

  /**
   * Whether Query Insights will record application tags from query when enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRecordApplicationTags() {
    return recordApplicationTags;
  }

  /**
   * Whether Query Insights will record application tags from query when enabled.
   * @param recordApplicationTags recordApplicationTags or {@code null} for none
   */
  public InsightsConfig setRecordApplicationTags(java.lang.Boolean recordApplicationTags) {
    this.recordApplicationTags = recordApplicationTags;
    return this;
  }

  /**
   * Whether Query Insights will record client address when enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRecordClientAddress() {
    return recordClientAddress;
  }

  /**
   * Whether Query Insights will record client address when enabled.
   * @param recordClientAddress recordClientAddress or {@code null} for none
   */
  public InsightsConfig setRecordClientAddress(java.lang.Boolean recordClientAddress) {
    this.recordClientAddress = recordClientAddress;
    return this;
  }

  @Override
  public InsightsConfig set(String fieldName, Object value) {
    return (InsightsConfig) super.set(fieldName, value);
  }

  @Override
  public InsightsConfig clone() {
    return (InsightsConfig) super.clone();
  }

}
