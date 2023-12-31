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

package com.google.api.services.cloudbuild.v2.model;

/**
 * Conditions defines a readiness condition for a Knative resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsCloudbuildV2Condition extends com.google.api.client.json.GenericJson {

  /**
   * LastTransitionTime is the last time the condition transitioned from one status to another.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastTransitionTime;

  /**
   * A human readable message indicating details about the transition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * The reason for the condition's last transition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Severity with which to treat failures of this type of condition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * Status of the condition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Type of condition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * LastTransitionTime is the last time the condition transitioned from one status to another.
   * @return value or {@code null} for none
   */
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }

  /**
   * LastTransitionTime is the last time the condition transitioned from one status to another.
   * @param lastTransitionTime lastTransitionTime or {@code null} for none
   */
  public GoogleDevtoolsCloudbuildV2Condition setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * A human readable message indicating details about the transition.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * A human readable message indicating details about the transition.
   * @param message message or {@code null} for none
   */
  public GoogleDevtoolsCloudbuildV2Condition setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * The reason for the condition's last transition.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * The reason for the condition's last transition.
   * @param reason reason or {@code null} for none
   */
  public GoogleDevtoolsCloudbuildV2Condition setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Severity with which to treat failures of this type of condition.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * Severity with which to treat failures of this type of condition.
   * @param severity severity or {@code null} for none
   */
  public GoogleDevtoolsCloudbuildV2Condition setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Status of the condition.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the condition.
   * @param status status or {@code null} for none
   */
  public GoogleDevtoolsCloudbuildV2Condition setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of condition.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of condition.
   * @param type type or {@code null} for none
   */
  public GoogleDevtoolsCloudbuildV2Condition setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleDevtoolsCloudbuildV2Condition set(String fieldName, Object value) {
    return (GoogleDevtoolsCloudbuildV2Condition) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsCloudbuildV2Condition clone() {
    return (GoogleDevtoolsCloudbuildV2Condition) super.clone();
  }

}
