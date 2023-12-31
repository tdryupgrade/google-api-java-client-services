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

package com.google.api.services.cloudsearch.v1.model;

/**
 * This is the internal version of the API proto at
 * google3/google/chat/v1/gsuite_message_integration.proto
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsDynamiteSharedTasksAnnotationData extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedTasksAnnotationDataAssigneeChange assigneeChange;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedTasksAnnotationDataCompletionChange completionChange;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedTasksAnnotationDataCreation creation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedTasksAnnotationDataDeletionChange deletionChange;

  /**
   * ID of task. Will be used to create deep links to Tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String taskId;

  /**
   * Task properties after the update has been applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedTasksAnnotationDataTaskProperties taskProperties;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedTasksAnnotationDataUserDefinedMessage userDefinedMessage;

  /**
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedTasksAnnotationDataAssigneeChange getAssigneeChange() {
    return assigneeChange;
  }

  /**
   * @param assigneeChange assigneeChange or {@code null} for none
   */
  public AppsDynamiteSharedTasksAnnotationData setAssigneeChange(AppsDynamiteSharedTasksAnnotationDataAssigneeChange assigneeChange) {
    this.assigneeChange = assigneeChange;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedTasksAnnotationDataCompletionChange getCompletionChange() {
    return completionChange;
  }

  /**
   * @param completionChange completionChange or {@code null} for none
   */
  public AppsDynamiteSharedTasksAnnotationData setCompletionChange(AppsDynamiteSharedTasksAnnotationDataCompletionChange completionChange) {
    this.completionChange = completionChange;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedTasksAnnotationDataCreation getCreation() {
    return creation;
  }

  /**
   * @param creation creation or {@code null} for none
   */
  public AppsDynamiteSharedTasksAnnotationData setCreation(AppsDynamiteSharedTasksAnnotationDataCreation creation) {
    this.creation = creation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedTasksAnnotationDataDeletionChange getDeletionChange() {
    return deletionChange;
  }

  /**
   * @param deletionChange deletionChange or {@code null} for none
   */
  public AppsDynamiteSharedTasksAnnotationData setDeletionChange(AppsDynamiteSharedTasksAnnotationDataDeletionChange deletionChange) {
    this.deletionChange = deletionChange;
    return this;
  }

  /**
   * ID of task. Will be used to create deep links to Tasks.
   * @return value or {@code null} for none
   */
  public java.lang.String getTaskId() {
    return taskId;
  }

  /**
   * ID of task. Will be used to create deep links to Tasks.
   * @param taskId taskId or {@code null} for none
   */
  public AppsDynamiteSharedTasksAnnotationData setTaskId(java.lang.String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Task properties after the update has been applied.
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedTasksAnnotationDataTaskProperties getTaskProperties() {
    return taskProperties;
  }

  /**
   * Task properties after the update has been applied.
   * @param taskProperties taskProperties or {@code null} for none
   */
  public AppsDynamiteSharedTasksAnnotationData setTaskProperties(AppsDynamiteSharedTasksAnnotationDataTaskProperties taskProperties) {
    this.taskProperties = taskProperties;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedTasksAnnotationDataUserDefinedMessage getUserDefinedMessage() {
    return userDefinedMessage;
  }

  /**
   * @param userDefinedMessage userDefinedMessage or {@code null} for none
   */
  public AppsDynamiteSharedTasksAnnotationData setUserDefinedMessage(AppsDynamiteSharedTasksAnnotationDataUserDefinedMessage userDefinedMessage) {
    this.userDefinedMessage = userDefinedMessage;
    return this;
  }

  @Override
  public AppsDynamiteSharedTasksAnnotationData set(String fieldName, Object value) {
    return (AppsDynamiteSharedTasksAnnotationData) super.set(fieldName, value);
  }

  @Override
  public AppsDynamiteSharedTasksAnnotationData clone() {
    return (AppsDynamiteSharedTasksAnnotationData) super.clone();
  }

}
