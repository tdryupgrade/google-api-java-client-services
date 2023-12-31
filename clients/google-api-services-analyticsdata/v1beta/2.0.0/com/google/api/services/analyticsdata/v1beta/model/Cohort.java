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
 * Defines a cohort selection criteria. A cohort is a group of users who share a common
 * characteristic. For example, users with the same `firstSessionDate` belong to the same cohort.
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
public final class Cohort extends com.google.api.client.json.GenericJson {

  /**
   * The cohort selects users whose first touch date is between start date and end date defined in
   * the `dateRange`. This `dateRange` does not specify the full date range of event data that is
   * present in a cohort report. In a cohort report, this `dateRange` is extended by the granularity
   * and offset present in the `cohortsRange`; event data for the extended reporting date range is
   * present in a cohort report. In a cohort request, this `dateRange` is required and the
   * `dateRanges` in the `RunReportRequest` or `RunPivotReportRequest` must be unspecified. This
   * `dateRange` should generally be aligned with the cohort's granularity. If `CohortsRange` uses
   * daily granularity, this `dateRange` can be a single day. If `CohortsRange` uses weekly
   * granularity, this `dateRange` can be aligned to a week boundary, starting at Sunday and ending
   * Saturday. If `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to a
   * month, starting at the first and ending on the last day of the month.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DateRange dateRange;

  /**
   * Dimension used by the cohort. Required and only supports `firstSessionDate`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dimension;

  /**
   * Assigns a name to this cohort. The dimension `cohort` is valued to this name in a report
   * response. If set, cannot begin with `cohort_` or `RESERVED_`. If not set, cohorts are named by
   * their zero based index `cohort_0`, `cohort_1`, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The cohort selects users whose first touch date is between start date and end date defined in
   * the `dateRange`. This `dateRange` does not specify the full date range of event data that is
   * present in a cohort report. In a cohort report, this `dateRange` is extended by the granularity
   * and offset present in the `cohortsRange`; event data for the extended reporting date range is
   * present in a cohort report. In a cohort request, this `dateRange` is required and the
   * `dateRanges` in the `RunReportRequest` or `RunPivotReportRequest` must be unspecified. This
   * `dateRange` should generally be aligned with the cohort's granularity. If `CohortsRange` uses
   * daily granularity, this `dateRange` can be a single day. If `CohortsRange` uses weekly
   * granularity, this `dateRange` can be aligned to a week boundary, starting at Sunday and ending
   * Saturday. If `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to a
   * month, starting at the first and ending on the last day of the month.
   * @return value or {@code null} for none
   */
  public DateRange getDateRange() {
    return dateRange;
  }

  /**
   * The cohort selects users whose first touch date is between start date and end date defined in
   * the `dateRange`. This `dateRange` does not specify the full date range of event data that is
   * present in a cohort report. In a cohort report, this `dateRange` is extended by the granularity
   * and offset present in the `cohortsRange`; event data for the extended reporting date range is
   * present in a cohort report. In a cohort request, this `dateRange` is required and the
   * `dateRanges` in the `RunReportRequest` or `RunPivotReportRequest` must be unspecified. This
   * `dateRange` should generally be aligned with the cohort's granularity. If `CohortsRange` uses
   * daily granularity, this `dateRange` can be a single day. If `CohortsRange` uses weekly
   * granularity, this `dateRange` can be aligned to a week boundary, starting at Sunday and ending
   * Saturday. If `CohortsRange` uses monthly granularity, this `dateRange` can be aligned to a
   * month, starting at the first and ending on the last day of the month.
   * @param dateRange dateRange or {@code null} for none
   */
  public Cohort setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Dimension used by the cohort. Required and only supports `firstSessionDate`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDimension() {
    return dimension;
  }

  /**
   * Dimension used by the cohort. Required and only supports `firstSessionDate`.
   * @param dimension dimension or {@code null} for none
   */
  public Cohort setDimension(java.lang.String dimension) {
    this.dimension = dimension;
    return this;
  }

  /**
   * Assigns a name to this cohort. The dimension `cohort` is valued to this name in a report
   * response. If set, cannot begin with `cohort_` or `RESERVED_`. If not set, cohorts are named by
   * their zero based index `cohort_0`, `cohort_1`, etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Assigns a name to this cohort. The dimension `cohort` is valued to this name in a report
   * response. If set, cannot begin with `cohort_` or `RESERVED_`. If not set, cohorts are named by
   * their zero based index `cohort_0`, `cohort_1`, etc.
   * @param name name or {@code null} for none
   */
  public Cohort setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Cohort set(String fieldName, Object value) {
    return (Cohort) super.set(fieldName, value);
  }

  @Override
  public Cohort clone() {
    return (Cohort) super.clone();
  }

}
