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

package com.google.api.services.doubleclickbidmanager.model;

/**
 * Report data range.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Bid Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataRange extends com.google.api.client.json.GenericJson {

  /**
   * The ending date for the data that is shown in the report. Note, `customEndDate` is required if
   * `range` is `CUSTOM_DATES` and ignored otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date customEndDate;

  /**
   * The starting data for the data that is shown in the report. Note, `customStartDate` is required
   * if `range` is `CUSTOM_DATES` and ignored otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date customStartDate;

  /**
   * Report data range used to generate the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String range;

  /**
   * The ending date for the data that is shown in the report. Note, `customEndDate` is required if
   * `range` is `CUSTOM_DATES` and ignored otherwise.
   * @return value or {@code null} for none
   */
  public Date getCustomEndDate() {
    return customEndDate;
  }

  /**
   * The ending date for the data that is shown in the report. Note, `customEndDate` is required if
   * `range` is `CUSTOM_DATES` and ignored otherwise.
   * @param customEndDate customEndDate or {@code null} for none
   */
  public DataRange setCustomEndDate(Date customEndDate) {
    this.customEndDate = customEndDate;
    return this;
  }

  /**
   * The starting data for the data that is shown in the report. Note, `customStartDate` is required
   * if `range` is `CUSTOM_DATES` and ignored otherwise.
   * @return value or {@code null} for none
   */
  public Date getCustomStartDate() {
    return customStartDate;
  }

  /**
   * The starting data for the data that is shown in the report. Note, `customStartDate` is required
   * if `range` is `CUSTOM_DATES` and ignored otherwise.
   * @param customStartDate customStartDate or {@code null} for none
   */
  public DataRange setCustomStartDate(Date customStartDate) {
    this.customStartDate = customStartDate;
    return this;
  }

  /**
   * Report data range used to generate the report.
   * @return value or {@code null} for none
   */
  public java.lang.String getRange() {
    return range;
  }

  /**
   * Report data range used to generate the report.
   * @param range range or {@code null} for none
   */
  public DataRange setRange(java.lang.String range) {
    this.range = range;
    return this;
  }

  @Override
  public DataRange set(String fieldName, Object value) {
    return (DataRange) super.set(fieldName, value);
  }

  @Override
  public DataRange clone() {
    return (DataRange) super.clone();
  }

}
