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

package com.google.api.services.pubsublite.v1.model;

/**
 * Metadata for long running operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Pub/Sub Lite API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The time the operation was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The time the operation finished running. Not set if the operation has not completed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Resource path for the target of the operation. For example, targets of seeks are subscription
   * resources, structured like:
   * projects/{project_number}/locations/{location}/subscriptions/{subscription_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * Name of the verb executed by the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verb;

  /**
   * The time the operation was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time the operation was created.
   * @param createTime createTime or {@code null} for none
   */
  public OperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The time the operation finished running. Not set if the operation has not completed.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The time the operation finished running. Not set if the operation has not completed.
   * @param endTime endTime or {@code null} for none
   */
  public OperationMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Resource path for the target of the operation. For example, targets of seeks are subscription
   * resources, structured like:
   * projects/{project_number}/locations/{location}/subscriptions/{subscription_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * Resource path for the target of the operation. For example, targets of seeks are subscription
   * resources, structured like:
   * projects/{project_number}/locations/{location}/subscriptions/{subscription_id}
   * @param target target or {@code null} for none
   */
  public OperationMetadata setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  /**
   * Name of the verb executed by the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerb() {
    return verb;
  }

  /**
   * Name of the verb executed by the operation.
   * @param verb verb or {@code null} for none
   */
  public OperationMetadata setVerb(java.lang.String verb) {
    this.verb = verb;
    return this;
  }

  @Override
  public OperationMetadata set(String fieldName, Object value) {
    return (OperationMetadata) super.set(fieldName, value);
  }

  @Override
  public OperationMetadata clone() {
    return (OperationMetadata) super.clone();
  }

}
