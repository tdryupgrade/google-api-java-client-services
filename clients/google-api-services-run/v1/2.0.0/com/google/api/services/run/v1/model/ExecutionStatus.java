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

package com.google.api.services.run.v1.model;

/**
 * ExecutionStatus represents the current state of an Execution.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExecutionStatus extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The number of tasks which reached phase Cancelled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer cancelledCount;

  /**
   * Optional. Represents the time that the execution was completed. It is not guaranteed to be set
   * in happens-before order across separate operations. It is represented in RFC3339 form and is in
   * UTC. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String completionTime;

  /**
   * Optional. Conditions communicate information about ongoing/complete reconciliation processes
   * that bring the "spec" inline with the observed state of the world. Execution-specific
   * conditions include: * `ResourcesAvailable`: `True` when underlying resources have been
   * provisioned. * `Started`: `True` when the execution has started to execute. * `Completed`:
   * `True` when the execution has succeeded. `False` when the execution has failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV1Condition> conditions;

  /**
   * Optional. The number of tasks which reached phase Failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer failedCount;

  /**
   * Optional. URI where logs for this execution can be found in Cloud Console.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logUri;

  /**
   * Optional. The 'generation' of the execution that was last processed by the controller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer observedGeneration;

  /**
   * Optional. The number of tasks which have retried at least once.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer retriedCount;

  /**
   * Optional. The number of actively running tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer runningCount;

  /**
   * Optional. Represents the time that the execution started to run. It is not guaranteed to be set
   * in happens-before order across separate operations. It is represented in RFC3339 form and is in
   * UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Optional. The number of tasks which reached phase Succeeded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer succeededCount;

  /**
   * Optional. The number of tasks which reached phase Cancelled.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCancelledCount() {
    return cancelledCount;
  }

  /**
   * Optional. The number of tasks which reached phase Cancelled.
   * @param cancelledCount cancelledCount or {@code null} for none
   */
  public ExecutionStatus setCancelledCount(java.lang.Integer cancelledCount) {
    this.cancelledCount = cancelledCount;
    return this;
  }

  /**
   * Optional. Represents the time that the execution was completed. It is not guaranteed to be set
   * in happens-before order across separate operations. It is represented in RFC3339 form and is in
   * UTC. +optional
   * @return value or {@code null} for none
   */
  public String getCompletionTime() {
    return completionTime;
  }

  /**
   * Optional. Represents the time that the execution was completed. It is not guaranteed to be set
   * in happens-before order across separate operations. It is represented in RFC3339 form and is in
   * UTC. +optional
   * @param completionTime completionTime or {@code null} for none
   */
  public ExecutionStatus setCompletionTime(String completionTime) {
    this.completionTime = completionTime;
    return this;
  }

  /**
   * Optional. Conditions communicate information about ongoing/complete reconciliation processes
   * that bring the "spec" inline with the observed state of the world. Execution-specific
   * conditions include: * `ResourcesAvailable`: `True` when underlying resources have been
   * provisioned. * `Started`: `True` when the execution has started to execute. * `Completed`:
   * `True` when the execution has succeeded. `False` when the execution has failed.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV1Condition> getConditions() {
    return conditions;
  }

  /**
   * Optional. Conditions communicate information about ongoing/complete reconciliation processes
   * that bring the "spec" inline with the observed state of the world. Execution-specific
   * conditions include: * `ResourcesAvailable`: `True` when underlying resources have been
   * provisioned. * `Started`: `True` when the execution has started to execute. * `Completed`:
   * `True` when the execution has succeeded. `False` when the execution has failed.
   * @param conditions conditions or {@code null} for none
   */
  public ExecutionStatus setConditions(java.util.List<GoogleCloudRunV1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Optional. The number of tasks which reached phase Failed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFailedCount() {
    return failedCount;
  }

  /**
   * Optional. The number of tasks which reached phase Failed.
   * @param failedCount failedCount or {@code null} for none
   */
  public ExecutionStatus setFailedCount(java.lang.Integer failedCount) {
    this.failedCount = failedCount;
    return this;
  }

  /**
   * Optional. URI where logs for this execution can be found in Cloud Console.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogUri() {
    return logUri;
  }

  /**
   * Optional. URI where logs for this execution can be found in Cloud Console.
   * @param logUri logUri or {@code null} for none
   */
  public ExecutionStatus setLogUri(java.lang.String logUri) {
    this.logUri = logUri;
    return this;
  }

  /**
   * Optional. The 'generation' of the execution that was last processed by the controller.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getObservedGeneration() {
    return observedGeneration;
  }

  /**
   * Optional. The 'generation' of the execution that was last processed by the controller.
   * @param observedGeneration observedGeneration or {@code null} for none
   */
  public ExecutionStatus setObservedGeneration(java.lang.Integer observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * Optional. The number of tasks which have retried at least once.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRetriedCount() {
    return retriedCount;
  }

  /**
   * Optional. The number of tasks which have retried at least once.
   * @param retriedCount retriedCount or {@code null} for none
   */
  public ExecutionStatus setRetriedCount(java.lang.Integer retriedCount) {
    this.retriedCount = retriedCount;
    return this;
  }

  /**
   * Optional. The number of actively running tasks.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRunningCount() {
    return runningCount;
  }

  /**
   * Optional. The number of actively running tasks.
   * @param runningCount runningCount or {@code null} for none
   */
  public ExecutionStatus setRunningCount(java.lang.Integer runningCount) {
    this.runningCount = runningCount;
    return this;
  }

  /**
   * Optional. Represents the time that the execution started to run. It is not guaranteed to be set
   * in happens-before order across separate operations. It is represented in RFC3339 form and is in
   * UTC.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Optional. Represents the time that the execution started to run. It is not guaranteed to be set
   * in happens-before order across separate operations. It is represented in RFC3339 form and is in
   * UTC.
   * @param startTime startTime or {@code null} for none
   */
  public ExecutionStatus setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Optional. The number of tasks which reached phase Succeeded.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSucceededCount() {
    return succeededCount;
  }

  /**
   * Optional. The number of tasks which reached phase Succeeded.
   * @param succeededCount succeededCount or {@code null} for none
   */
  public ExecutionStatus setSucceededCount(java.lang.Integer succeededCount) {
    this.succeededCount = succeededCount;
    return this;
  }

  @Override
  public ExecutionStatus set(String fieldName, Object value) {
    return (ExecutionStatus) super.set(fieldName, value);
  }

  @Override
  public ExecutionStatus clone() {
    return (ExecutionStatus) super.clone();
  }

}
