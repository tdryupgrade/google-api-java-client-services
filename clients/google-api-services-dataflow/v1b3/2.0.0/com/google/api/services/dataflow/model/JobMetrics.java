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

package com.google.api.services.dataflow.model;

/**
 * JobMetrics contains a collection of metrics describing the detailed progress of a Dataflow job.
 * Metrics correspond to user-defined and system-defined metrics in the job. For more information,
 * see [Dataflow job metrics] (https://cloud.google.com/dataflow/docs/guides/using-monitoring-intf).
 * This resource captures only the most recent values of each metric; time-series data can be
 * queried for them (under the same metric names) from Cloud Monitoring.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Timestamp as of which metric values are current.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String metricTime;

  /**
   * All metrics for this job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricUpdate> metrics;

  /**
   * Timestamp as of which metric values are current.
   * @return value or {@code null} for none
   */
  public String getMetricTime() {
    return metricTime;
  }

  /**
   * Timestamp as of which metric values are current.
   * @param metricTime metricTime or {@code null} for none
   */
  public JobMetrics setMetricTime(String metricTime) {
    this.metricTime = metricTime;
    return this;
  }

  /**
   * All metrics for this job.
   * @return value or {@code null} for none
   */
  public java.util.List<MetricUpdate> getMetrics() {
    return metrics;
  }

  /**
   * All metrics for this job.
   * @param metrics metrics or {@code null} for none
   */
  public JobMetrics setMetrics(java.util.List<MetricUpdate> metrics) {
    this.metrics = metrics;
    return this;
  }

  @Override
  public JobMetrics set(String fieldName, Object value) {
    return (JobMetrics) super.set(fieldName, value);
  }

  @Override
  public JobMetrics clone() {
    return (JobMetrics) super.clone();
  }

}
