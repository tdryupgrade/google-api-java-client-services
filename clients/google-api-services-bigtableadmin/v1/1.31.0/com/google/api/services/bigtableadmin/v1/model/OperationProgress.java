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

package com.google.api.services.bigtableadmin.v1.model;

/**
 * Encapsulates progress related information for a Cloud Bigtable long running operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OperationProgress extends com.google.api.client.json.GenericJson {

  /**
   * If set, the time at which this operation failed or was completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Percent completion of the operation. Values are between 0 and 100 inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer progressPercent;

  /**
   * Time the request was received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * If set, the time at which this operation failed or was completed successfully.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * If set, the time at which this operation failed or was completed successfully.
   * @param endTime endTime or {@code null} for none
   */
  public OperationProgress setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Percent completion of the operation. Values are between 0 and 100 inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProgressPercent() {
    return progressPercent;
  }

  /**
   * Percent completion of the operation. Values are between 0 and 100 inclusive.
   * @param progressPercent progressPercent or {@code null} for none
   */
  public OperationProgress setProgressPercent(java.lang.Integer progressPercent) {
    this.progressPercent = progressPercent;
    return this;
  }

  /**
   * Time the request was received.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Time the request was received.
   * @param startTime startTime or {@code null} for none
   */
  public OperationProgress setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public OperationProgress set(String fieldName, Object value) {
    return (OperationProgress) super.set(fieldName, value);
  }

  @Override
  public OperationProgress clone() {
    return (OperationProgress) super.clone();
  }

}
