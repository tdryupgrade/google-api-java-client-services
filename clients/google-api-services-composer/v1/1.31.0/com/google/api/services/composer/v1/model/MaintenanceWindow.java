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

package com.google.api.services.composer.v1.model;

/**
 * The configuration settings for Cloud Composer maintenance window. The following example: ``` {
 * "startTime":"2019-08-01T01:00:00Z" "endTime":"2019-08-01T07:00:00Z"
 * "recurrence":"FREQ=WEEKLY;BYDAY=TU,WE" } ``` would define a maintenance window between 01 and 07
 * hours UTC during each Tuesday and Wednesday.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MaintenanceWindow extends com.google.api.client.json.GenericJson {

  /**
   * Required. Maintenance window end time. It is used only to calculate the duration of the
   * maintenance window. The value for end-time must be in the future, relative to `start_time`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Required. Maintenance window recurrence. Format is a subset of
   * [RFC-5545](https://tools.ietf.org/html/rfc5545) `RRULE`. The only allowed values for `FREQ`
   * field are `FREQ=DAILY` and `FREQ=WEEKLY;BYDAY=...` Example values: `FREQ=WEEKLY;BYDAY=TU,WE`,
   * `FREQ=DAILY`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recurrence;

  /**
   * Required. Start time of the first recurrence of the maintenance window.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Required. Maintenance window end time. It is used only to calculate the duration of the
   * maintenance window. The value for end-time must be in the future, relative to `start_time`.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Required. Maintenance window end time. It is used only to calculate the duration of the
   * maintenance window. The value for end-time must be in the future, relative to `start_time`.
   * @param endTime endTime or {@code null} for none
   */
  public MaintenanceWindow setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Required. Maintenance window recurrence. Format is a subset of
   * [RFC-5545](https://tools.ietf.org/html/rfc5545) `RRULE`. The only allowed values for `FREQ`
   * field are `FREQ=DAILY` and `FREQ=WEEKLY;BYDAY=...` Example values: `FREQ=WEEKLY;BYDAY=TU,WE`,
   * `FREQ=DAILY`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecurrence() {
    return recurrence;
  }

  /**
   * Required. Maintenance window recurrence. Format is a subset of
   * [RFC-5545](https://tools.ietf.org/html/rfc5545) `RRULE`. The only allowed values for `FREQ`
   * field are `FREQ=DAILY` and `FREQ=WEEKLY;BYDAY=...` Example values: `FREQ=WEEKLY;BYDAY=TU,WE`,
   * `FREQ=DAILY`.
   * @param recurrence recurrence or {@code null} for none
   */
  public MaintenanceWindow setRecurrence(java.lang.String recurrence) {
    this.recurrence = recurrence;
    return this;
  }

  /**
   * Required. Start time of the first recurrence of the maintenance window.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Required. Start time of the first recurrence of the maintenance window.
   * @param startTime startTime or {@code null} for none
   */
  public MaintenanceWindow setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public MaintenanceWindow set(String fieldName, Object value) {
    return (MaintenanceWindow) super.set(fieldName, value);
  }

  @Override
  public MaintenanceWindow clone() {
    return (MaintenanceWindow) super.clone();
  }

}
