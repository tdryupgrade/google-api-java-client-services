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
 * Stats for the requested dimensions: QPS, duration, and error/warning rate
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
public final class EnterpriseCrmEventbusStats extends com.google.api.client.json.GenericJson {

  /**
   * Dimensions that these stats have been aggregated on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmEventbusStatsDimensions dimensions;

  /**
   * Average duration in seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double durationInSeconds;

  /**
   * Average error rate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double errorRate;

  /**
   * Queries per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double qps;

  /**
   * Average warning rate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double warningRate;

  /**
   * Dimensions that these stats have been aggregated on.
   * @return value or {@code null} for none
   */
  public EnterpriseCrmEventbusStatsDimensions getDimensions() {
    return dimensions;
  }

  /**
   * Dimensions that these stats have been aggregated on.
   * @param dimensions dimensions or {@code null} for none
   */
  public EnterpriseCrmEventbusStats setDimensions(EnterpriseCrmEventbusStatsDimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * Average duration in seconds.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDurationInSeconds() {
    return durationInSeconds;
  }

  /**
   * Average duration in seconds.
   * @param durationInSeconds durationInSeconds or {@code null} for none
   */
  public EnterpriseCrmEventbusStats setDurationInSeconds(java.lang.Double durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
    return this;
  }

  /**
   * Average error rate.
   * @return value or {@code null} for none
   */
  public java.lang.Double getErrorRate() {
    return errorRate;
  }

  /**
   * Average error rate.
   * @param errorRate errorRate or {@code null} for none
   */
  public EnterpriseCrmEventbusStats setErrorRate(java.lang.Double errorRate) {
    this.errorRate = errorRate;
    return this;
  }

  /**
   * Queries per second.
   * @return value or {@code null} for none
   */
  public java.lang.Double getQps() {
    return qps;
  }

  /**
   * Queries per second.
   * @param qps qps or {@code null} for none
   */
  public EnterpriseCrmEventbusStats setQps(java.lang.Double qps) {
    this.qps = qps;
    return this;
  }

  /**
   * Average warning rate.
   * @return value or {@code null} for none
   */
  public java.lang.Double getWarningRate() {
    return warningRate;
  }

  /**
   * Average warning rate.
   * @param warningRate warningRate or {@code null} for none
   */
  public EnterpriseCrmEventbusStats setWarningRate(java.lang.Double warningRate) {
    this.warningRate = warningRate;
    return this;
  }

  @Override
  public EnterpriseCrmEventbusStats set(String fieldName, Object value) {
    return (EnterpriseCrmEventbusStats) super.set(fieldName, value);
  }

  @Override
  public EnterpriseCrmEventbusStats clone() {
    return (EnterpriseCrmEventbusStats) super.clone();
  }

}
