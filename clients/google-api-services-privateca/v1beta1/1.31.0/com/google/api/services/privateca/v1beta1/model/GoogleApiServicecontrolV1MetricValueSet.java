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

package com.google.api.services.privateca.v1beta1.model;

/**
 * Represents a set of metric values in the same metric. Each metric value in the set should have a
 * unique combination of start time, end time, and label values.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleApiServicecontrolV1MetricValueSet extends com.google.api.client.json.GenericJson {

  /**
   * The metric name defined in the service configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metricName;

  /**
   * The values in this metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleApiServicecontrolV1MetricValue> metricValues;

  static {
    // hack to force ProGuard to consider GoogleApiServicecontrolV1MetricValue used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleApiServicecontrolV1MetricValue.class);
  }

  /**
   * The metric name defined in the service configuration.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetricName() {
    return metricName;
  }

  /**
   * The metric name defined in the service configuration.
   * @param metricName metricName or {@code null} for none
   */
  public GoogleApiServicecontrolV1MetricValueSet setMetricName(java.lang.String metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * The values in this metric.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleApiServicecontrolV1MetricValue> getMetricValues() {
    return metricValues;
  }

  /**
   * The values in this metric.
   * @param metricValues metricValues or {@code null} for none
   */
  public GoogleApiServicecontrolV1MetricValueSet setMetricValues(java.util.List<GoogleApiServicecontrolV1MetricValue> metricValues) {
    this.metricValues = metricValues;
    return this;
  }

  @Override
  public GoogleApiServicecontrolV1MetricValueSet set(String fieldName, Object value) {
    return (GoogleApiServicecontrolV1MetricValueSet) super.set(fieldName, value);
  }

  @Override
  public GoogleApiServicecontrolV1MetricValueSet clone() {
    return (GoogleApiServicecontrolV1MetricValueSet) super.clone();
  }

}
