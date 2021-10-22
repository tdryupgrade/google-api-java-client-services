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

package com.google.api.services.analyticsdata.v1beta.model;

/**
 * Explains a metric.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Data API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetricMetadata extends com.google.api.client.json.GenericJson {

  /**
   * A metric name. Useable in [Metric](#Metric)'s `name`. For example, `eventCount`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiName;

  /**
   * If reasons are specified, your access is blocked to this metric for this property. API requests
   * from you to this property for this metric will succeed; however, the report will contain only
   * zeros for this metric. API requests with metric filters on blocked metrics will fail. If
   * reasons are empty, you have access to this metric. To learn more, see [Access and data-
   * restriction management](https://support.google.com/analytics/answer/10851388).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> blockedReasons;

  /**
   * The display name of the category that this metrics belongs to. Similar dimensions and metrics
   * are categorized together.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * True if the metric is a custom metric for this property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean customDefinition;

  /**
   * Still usable but deprecated names for this metric. If populated, this metric is available by
   * either `apiName` or one of `deprecatedApiNames` for a period of time. After the deprecation
   * period, the metric will be available only by `apiName`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> deprecatedApiNames;

  /**
   * Description of how this metric is used and calculated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The mathematical expression for this derived metric. Can be used in [Metric](#Metric)'s
   * `expression` field for equivalent reports. Most metrics are not expressions, and for non-
   * expressions, this field is empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expression;

  /**
   * The type of this metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * This metric's name within the Google Analytics user interface. For example, `Event count`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uiName;

  /**
   * A metric name. Useable in [Metric](#Metric)'s `name`. For example, `eventCount`.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiName() {
    return apiName;
  }

  /**
   * A metric name. Useable in [Metric](#Metric)'s `name`. For example, `eventCount`.
   * @param apiName apiName or {@code null} for none
   */
  public MetricMetadata setApiName(java.lang.String apiName) {
    this.apiName = apiName;
    return this;
  }

  /**
   * If reasons are specified, your access is blocked to this metric for this property. API requests
   * from you to this property for this metric will succeed; however, the report will contain only
   * zeros for this metric. API requests with metric filters on blocked metrics will fail. If
   * reasons are empty, you have access to this metric. To learn more, see [Access and data-
   * restriction management](https://support.google.com/analytics/answer/10851388).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBlockedReasons() {
    return blockedReasons;
  }

  /**
   * If reasons are specified, your access is blocked to this metric for this property. API requests
   * from you to this property for this metric will succeed; however, the report will contain only
   * zeros for this metric. API requests with metric filters on blocked metrics will fail. If
   * reasons are empty, you have access to this metric. To learn more, see [Access and data-
   * restriction management](https://support.google.com/analytics/answer/10851388).
   * @param blockedReasons blockedReasons or {@code null} for none
   */
  public MetricMetadata setBlockedReasons(java.util.List<java.lang.String> blockedReasons) {
    this.blockedReasons = blockedReasons;
    return this;
  }

  /**
   * The display name of the category that this metrics belongs to. Similar dimensions and metrics
   * are categorized together.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * The display name of the category that this metrics belongs to. Similar dimensions and metrics
   * are categorized together.
   * @param category category or {@code null} for none
   */
  public MetricMetadata setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * True if the metric is a custom metric for this property.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCustomDefinition() {
    return customDefinition;
  }

  /**
   * True if the metric is a custom metric for this property.
   * @param customDefinition customDefinition or {@code null} for none
   */
  public MetricMetadata setCustomDefinition(java.lang.Boolean customDefinition) {
    this.customDefinition = customDefinition;
    return this;
  }

  /**
   * Still usable but deprecated names for this metric. If populated, this metric is available by
   * either `apiName` or one of `deprecatedApiNames` for a period of time. After the deprecation
   * period, the metric will be available only by `apiName`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDeprecatedApiNames() {
    return deprecatedApiNames;
  }

  /**
   * Still usable but deprecated names for this metric. If populated, this metric is available by
   * either `apiName` or one of `deprecatedApiNames` for a period of time. After the deprecation
   * period, the metric will be available only by `apiName`.
   * @param deprecatedApiNames deprecatedApiNames or {@code null} for none
   */
  public MetricMetadata setDeprecatedApiNames(java.util.List<java.lang.String> deprecatedApiNames) {
    this.deprecatedApiNames = deprecatedApiNames;
    return this;
  }

  /**
   * Description of how this metric is used and calculated.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of how this metric is used and calculated.
   * @param description description or {@code null} for none
   */
  public MetricMetadata setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The mathematical expression for this derived metric. Can be used in [Metric](#Metric)'s
   * `expression` field for equivalent reports. Most metrics are not expressions, and for non-
   * expressions, this field is empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getExpression() {
    return expression;
  }

  /**
   * The mathematical expression for this derived metric. Can be used in [Metric](#Metric)'s
   * `expression` field for equivalent reports. Most metrics are not expressions, and for non-
   * expressions, this field is empty.
   * @param expression expression or {@code null} for none
   */
  public MetricMetadata setExpression(java.lang.String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * The type of this metric.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of this metric.
   * @param type type or {@code null} for none
   */
  public MetricMetadata setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * This metric's name within the Google Analytics user interface. For example, `Event count`.
   * @return value or {@code null} for none
   */
  public java.lang.String getUiName() {
    return uiName;
  }

  /**
   * This metric's name within the Google Analytics user interface. For example, `Event count`.
   * @param uiName uiName or {@code null} for none
   */
  public MetricMetadata setUiName(java.lang.String uiName) {
    this.uiName = uiName;
    return this;
  }

  @Override
  public MetricMetadata set(String fieldName, Object value) {
    return (MetricMetadata) super.set(fieldName, value);
  }

  @Override
  public MetricMetadata clone() {
    return (MetricMetadata) super.clone();
  }

}
