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

package com.google.api.services.osconfig.v1beta.model;

/**
 * Represents one week day in a month. An example is "the 4th Sunday".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WeekDayOfMonth extends com.google.api.client.json.GenericJson {

  /**
   * Required. A day of the week.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dayOfWeek;

  /**
   * Optional. Represents the number of days before or after the given week day of month that the
   * patch deployment is scheduled for. For example if `week_ordinal` and `day_of_week` values point
   * to the second day of the month and this `day_offset` value is set to `3`, the patch deployment
   * takes place three days after the second Tuesday of the month. If this value is negative, for
   * example -5, the patches are deployed five days before before the second Tuesday of the month.
   * Allowed values are in range [-30, 30].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer dayOffset;

  /**
   * Required. Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates
   * the last week of the month.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer weekOrdinal;

  /**
   * Required. A day of the week.
   * @return value or {@code null} for none
   */
  public java.lang.String getDayOfWeek() {
    return dayOfWeek;
  }

  /**
   * Required. A day of the week.
   * @param dayOfWeek dayOfWeek or {@code null} for none
   */
  public WeekDayOfMonth setDayOfWeek(java.lang.String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Optional. Represents the number of days before or after the given week day of month that the
   * patch deployment is scheduled for. For example if `week_ordinal` and `day_of_week` values point
   * to the second day of the month and this `day_offset` value is set to `3`, the patch deployment
   * takes place three days after the second Tuesday of the month. If this value is negative, for
   * example -5, the patches are deployed five days before before the second Tuesday of the month.
   * Allowed values are in range [-30, 30].
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDayOffset() {
    return dayOffset;
  }

  /**
   * Optional. Represents the number of days before or after the given week day of month that the
   * patch deployment is scheduled for. For example if `week_ordinal` and `day_of_week` values point
   * to the second day of the month and this `day_offset` value is set to `3`, the patch deployment
   * takes place three days after the second Tuesday of the month. If this value is negative, for
   * example -5, the patches are deployed five days before before the second Tuesday of the month.
   * Allowed values are in range [-30, 30].
   * @param dayOffset dayOffset or {@code null} for none
   */
  public WeekDayOfMonth setDayOffset(java.lang.Integer dayOffset) {
    this.dayOffset = dayOffset;
    return this;
  }

  /**
   * Required. Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates
   * the last week of the month.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWeekOrdinal() {
    return weekOrdinal;
  }

  /**
   * Required. Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates
   * the last week of the month.
   * @param weekOrdinal weekOrdinal or {@code null} for none
   */
  public WeekDayOfMonth setWeekOrdinal(java.lang.Integer weekOrdinal) {
    this.weekOrdinal = weekOrdinal;
    return this;
  }

  @Override
  public WeekDayOfMonth set(String fieldName, Object value) {
    return (WeekDayOfMonth) super.set(fieldName, value);
  }

  @Override
  public WeekDayOfMonth clone() {
    return (WeekDayOfMonth) super.clone();
  }

}
