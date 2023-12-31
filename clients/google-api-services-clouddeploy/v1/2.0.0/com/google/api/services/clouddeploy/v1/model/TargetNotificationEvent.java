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

package com.google.api.services.clouddeploy.v1.model;

/**
 * Payload proto for "clouddeploy.googleapis.com/target_notification" Platform Log event that
 * describes the failure to send target status change Pub/Sub notification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deploy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetNotificationEvent extends com.google.api.client.json.GenericJson {

  /**
   * Debug message for when a notification fails to send.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * The name of the `Target`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * Type of this notification, e.g. for a Pub/Sub failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Debug message for when a notification fails to send.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Debug message for when a notification fails to send.
   * @param message message or {@code null} for none
   */
  public TargetNotificationEvent setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * The name of the `Target`.
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * The name of the `Target`.
   * @param target target or {@code null} for none
   */
  public TargetNotificationEvent setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  /**
   * Type of this notification, e.g. for a Pub/Sub failure.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of this notification, e.g. for a Pub/Sub failure.
   * @param type type or {@code null} for none
   */
  public TargetNotificationEvent setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public TargetNotificationEvent set(String fieldName, Object value) {
    return (TargetNotificationEvent) super.set(fieldName, value);
  }

  @Override
  public TargetNotificationEvent clone() {
    return (TargetNotificationEvent) super.clone();
  }

}
