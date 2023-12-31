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

package com.google.api.services.memcache.v1.model;

/**
 * Time window specified for weekly operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Memorystore for Memcached API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WeeklyMaintenanceWindow extends com.google.api.client.json.GenericJson {

  /**
   * Required. Allows to define schedule that runs specified day of the week.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String day;

  /**
   * Required. Duration of the time window.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * Required. Start time of the window in UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay startTime;

  /**
   * Required. Allows to define schedule that runs specified day of the week.
   * @return value or {@code null} for none
   */
  public java.lang.String getDay() {
    return day;
  }

  /**
   * Required. Allows to define schedule that runs specified day of the week.
   * @param day day or {@code null} for none
   */
  public WeeklyMaintenanceWindow setDay(java.lang.String day) {
    this.day = day;
    return this;
  }

  /**
   * Required. Duration of the time window.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Required. Duration of the time window.
   * @param duration duration or {@code null} for none
   */
  public WeeklyMaintenanceWindow setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Required. Start time of the window in UTC.
   * @return value or {@code null} for none
   */
  public TimeOfDay getStartTime() {
    return startTime;
  }

  /**
   * Required. Start time of the window in UTC.
   * @param startTime startTime or {@code null} for none
   */
  public WeeklyMaintenanceWindow setStartTime(TimeOfDay startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public WeeklyMaintenanceWindow set(String fieldName, Object value) {
    return (WeeklyMaintenanceWindow) super.set(fieldName, value);
  }

  @Override
  public WeeklyMaintenanceWindow clone() {
    return (WeeklyMaintenanceWindow) super.clone();
  }

}
