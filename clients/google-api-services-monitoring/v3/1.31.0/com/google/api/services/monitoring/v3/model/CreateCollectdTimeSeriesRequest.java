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

package com.google.api.services.monitoring.v3.model;

/**
 * The CreateCollectdTimeSeries request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateCollectdTimeSeriesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The collectd payloads representing the time series data. You must not include more than a
   * single point for each time series, so no two payloads can have the same values for all of the
   * fields plugin, plugin_instance, type, and type_instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CollectdPayload> collectdPayloads;

  static {
    // hack to force ProGuard to consider CollectdPayload used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CollectdPayload.class);
  }

  /**
   * The version of collectd that collected the data. Example: "5.3.0-192.el6".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String collectdVersion;

  /**
   * The monitored resource associated with the time series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MonitoredResource resource;

  /**
   * The collectd payloads representing the time series data. You must not include more than a
   * single point for each time series, so no two payloads can have the same values for all of the
   * fields plugin, plugin_instance, type, and type_instance.
   * @return value or {@code null} for none
   */
  public java.util.List<CollectdPayload> getCollectdPayloads() {
    return collectdPayloads;
  }

  /**
   * The collectd payloads representing the time series data. You must not include more than a
   * single point for each time series, so no two payloads can have the same values for all of the
   * fields plugin, plugin_instance, type, and type_instance.
   * @param collectdPayloads collectdPayloads or {@code null} for none
   */
  public CreateCollectdTimeSeriesRequest setCollectdPayloads(java.util.List<CollectdPayload> collectdPayloads) {
    this.collectdPayloads = collectdPayloads;
    return this;
  }

  /**
   * The version of collectd that collected the data. Example: "5.3.0-192.el6".
   * @return value or {@code null} for none
   */
  public java.lang.String getCollectdVersion() {
    return collectdVersion;
  }

  /**
   * The version of collectd that collected the data. Example: "5.3.0-192.el6".
   * @param collectdVersion collectdVersion or {@code null} for none
   */
  public CreateCollectdTimeSeriesRequest setCollectdVersion(java.lang.String collectdVersion) {
    this.collectdVersion = collectdVersion;
    return this;
  }

  /**
   * The monitored resource associated with the time series.
   * @return value or {@code null} for none
   */
  public MonitoredResource getResource() {
    return resource;
  }

  /**
   * The monitored resource associated with the time series.
   * @param resource resource or {@code null} for none
   */
  public CreateCollectdTimeSeriesRequest setResource(MonitoredResource resource) {
    this.resource = resource;
    return this;
  }

  @Override
  public CreateCollectdTimeSeriesRequest set(String fieldName, Object value) {
    return (CreateCollectdTimeSeriesRequest) super.set(fieldName, value);
  }

  @Override
  public CreateCollectdTimeSeriesRequest clone() {
    return (CreateCollectdTimeSeriesRequest) super.clone();
  }

}
