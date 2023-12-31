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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * A metric value, with an expected value and a variance; represents a count that may be either
 * exact or estimated (for example, when sampled).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetricValue extends com.google.api.client.json.GenericJson {

  /**
   * The expected value of the metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long value;

  /**
   * The variance (for example, square of the standard deviation) of the metric value. If value is
   * exact, variance is 0. Can be used to calculate margin of error as a percentage of value, using
   * the following formula, where Z is the standard constant that depends on the preferred size of
   * the confidence interval (for example, for 90% confidence interval, use Z = 1.645):
   * marginOfError = 100 * Z * sqrt(variance) / value
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long variance;

  /**
   * The expected value of the metric.
   * @return value or {@code null} for none
   */
  public java.lang.Long getValue() {
    return value;
  }

  /**
   * The expected value of the metric.
   * @param value value or {@code null} for none
   */
  public MetricValue setValue(java.lang.Long value) {
    this.value = value;
    return this;
  }

  /**
   * The variance (for example, square of the standard deviation) of the metric value. If value is
   * exact, variance is 0. Can be used to calculate margin of error as a percentage of value, using
   * the following formula, where Z is the standard constant that depends on the preferred size of
   * the confidence interval (for example, for 90% confidence interval, use Z = 1.645):
   * marginOfError = 100 * Z * sqrt(variance) / value
   * @return value or {@code null} for none
   */
  public java.lang.Long getVariance() {
    return variance;
  }

  /**
   * The variance (for example, square of the standard deviation) of the metric value. If value is
   * exact, variance is 0. Can be used to calculate margin of error as a percentage of value, using
   * the following formula, where Z is the standard constant that depends on the preferred size of
   * the confidence interval (for example, for 90% confidence interval, use Z = 1.645):
   * marginOfError = 100 * Z * sqrt(variance) / value
   * @param variance variance or {@code null} for none
   */
  public MetricValue setVariance(java.lang.Long variance) {
    this.variance = variance;
    return this;
  }

  @Override
  public MetricValue set(String fieldName, Object value) {
    return (MetricValue) super.set(fieldName, value);
  }

  @Override
  public MetricValue clone() {
    return (MetricValue) super.clone();
  }

}
