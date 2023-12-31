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

package com.google.api.services.integrations.v1alpha.model;

/**
 * The task that is next in line to be executed, if the condition specified evaluated to true.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnterpriseCrmEventbusProtoNextTask extends com.google.api.client.json.GenericJson {

  /**
   * Combined condition for this task to become an eligible next task. Each of these
   * combined_conditions are joined with logical OR. DEPRECATED: use `condition`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseCrmEventbusProtoCombinedCondition> combinedConditions;

  static {
    // hack to force ProGuard to consider EnterpriseCrmEventbusProtoCombinedCondition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EnterpriseCrmEventbusProtoCombinedCondition.class);
  }

  /**
   * Standard filter expression for this task to become an eligible next task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String condition;

  /**
   * User-provided description intended to give more business context about the next task edge or
   * condition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * User-provided label that is attached to this edge in the UI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String label;

  /**
   * ID of the next task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String taskConfigId;

  /**
   * Task number of the next task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String taskNumber;

  /**
   * Combined condition for this task to become an eligible next task. Each of these
   * combined_conditions are joined with logical OR. DEPRECATED: use `condition`
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseCrmEventbusProtoCombinedCondition> getCombinedConditions() {
    return combinedConditions;
  }

  /**
   * Combined condition for this task to become an eligible next task. Each of these
   * combined_conditions are joined with logical OR. DEPRECATED: use `condition`
   * @param combinedConditions combinedConditions or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoNextTask setCombinedConditions(java.util.List<EnterpriseCrmEventbusProtoCombinedCondition> combinedConditions) {
    this.combinedConditions = combinedConditions;
    return this;
  }

  /**
   * Standard filter expression for this task to become an eligible next task.
   * @return value or {@code null} for none
   */
  public java.lang.String getCondition() {
    return condition;
  }

  /**
   * Standard filter expression for this task to become an eligible next task.
   * @param condition condition or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoNextTask setCondition(java.lang.String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * User-provided description intended to give more business context about the next task edge or
   * condition.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * User-provided description intended to give more business context about the next task edge or
   * condition.
   * @param description description or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoNextTask setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * User-provided label that is attached to this edge in the UI.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabel() {
    return label;
  }

  /**
   * User-provided label that is attached to this edge in the UI.
   * @param label label or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoNextTask setLabel(java.lang.String label) {
    this.label = label;
    return this;
  }

  /**
   * ID of the next task.
   * @return value or {@code null} for none
   */
  public java.lang.String getTaskConfigId() {
    return taskConfigId;
  }

  /**
   * ID of the next task.
   * @param taskConfigId taskConfigId or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoNextTask setTaskConfigId(java.lang.String taskConfigId) {
    this.taskConfigId = taskConfigId;
    return this;
  }

  /**
   * Task number of the next task.
   * @return value or {@code null} for none
   */
  public java.lang.String getTaskNumber() {
    return taskNumber;
  }

  /**
   * Task number of the next task.
   * @param taskNumber taskNumber or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoNextTask setTaskNumber(java.lang.String taskNumber) {
    this.taskNumber = taskNumber;
    return this;
  }

  @Override
  public EnterpriseCrmEventbusProtoNextTask set(String fieldName, Object value) {
    return (EnterpriseCrmEventbusProtoNextTask) super.set(fieldName, value);
  }

  @Override
  public EnterpriseCrmEventbusProtoNextTask clone() {
    return (EnterpriseCrmEventbusProtoNextTask) super.clone();
  }

}
