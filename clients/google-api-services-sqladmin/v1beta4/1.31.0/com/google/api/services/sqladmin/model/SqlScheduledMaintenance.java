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
 * Any scheduled maintenancce for this instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SqlScheduledMaintenance extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean canDefer;

  /**
   * If the scheduled maintenance can be rescheduled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean canReschedule;

  /**
   * Maintenance cannot be rescheduled to start beyond this deadline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduleDeadlineTime;

  /**
   * The start time of any upcoming scheduled maintenance for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCanDefer() {
    return canDefer;
  }

  /**
   * @param canDefer canDefer or {@code null} for none
   */
  public SqlScheduledMaintenance setCanDefer(java.lang.Boolean canDefer) {
    this.canDefer = canDefer;
    return this;
  }

  /**
   * If the scheduled maintenance can be rescheduled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCanReschedule() {
    return canReschedule;
  }

  /**
   * If the scheduled maintenance can be rescheduled.
   * @param canReschedule canReschedule or {@code null} for none
   */
  public SqlScheduledMaintenance setCanReschedule(java.lang.Boolean canReschedule) {
    this.canReschedule = canReschedule;
    return this;
  }

  /**
   * Maintenance cannot be rescheduled to start beyond this deadline.
   * @return value or {@code null} for none
   */
  public String getScheduleDeadlineTime() {
    return scheduleDeadlineTime;
  }

  /**
   * Maintenance cannot be rescheduled to start beyond this deadline.
   * @param scheduleDeadlineTime scheduleDeadlineTime or {@code null} for none
   */
  public SqlScheduledMaintenance setScheduleDeadlineTime(String scheduleDeadlineTime) {
    this.scheduleDeadlineTime = scheduleDeadlineTime;
    return this;
  }

  /**
   * The start time of any upcoming scheduled maintenance for this instance.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The start time of any upcoming scheduled maintenance for this instance.
   * @param startTime startTime or {@code null} for none
   */
  public SqlScheduledMaintenance setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public SqlScheduledMaintenance set(String fieldName, Object value) {
    return (SqlScheduledMaintenance) super.set(fieldName, value);
  }

  @Override
  public SqlScheduledMaintenance clone() {
    return (SqlScheduledMaintenance) super.clone();
  }

}
