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

package com.google.api.services.apigee.v1.model;

/**
 * A message type used to describe a single precondition failure.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleRpcPreconditionFailureViolation extends com.google.api.client.json.GenericJson {

  /**
   * A description of how the precondition failed. Developers can use this description to understand
   * how to fix the failure. For example: "Terms of service not accepted".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The subject, relative to the type, that failed. For example, "google.com/cloud" relative to the
   * "TOS" type would indicate which terms of service is being referenced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subject;

  /**
   * The type of PreconditionFailure. We recommend using a service-specific enum type to define the
   * supported precondition violation subjects. For example, "TOS" for "Terms of Service violation".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * A description of how the precondition failed. Developers can use this description to understand
   * how to fix the failure. For example: "Terms of service not accepted".
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A description of how the precondition failed. Developers can use this description to understand
   * how to fix the failure. For example: "Terms of service not accepted".
   * @param description description or {@code null} for none
   */
  public GoogleRpcPreconditionFailureViolation setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The subject, relative to the type, that failed. For example, "google.com/cloud" relative to the
   * "TOS" type would indicate which terms of service is being referenced.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubject() {
    return subject;
  }

  /**
   * The subject, relative to the type, that failed. For example, "google.com/cloud" relative to the
   * "TOS" type would indicate which terms of service is being referenced.
   * @param subject subject or {@code null} for none
   */
  public GoogleRpcPreconditionFailureViolation setSubject(java.lang.String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * The type of PreconditionFailure. We recommend using a service-specific enum type to define the
   * supported precondition violation subjects. For example, "TOS" for "Terms of Service violation".
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of PreconditionFailure. We recommend using a service-specific enum type to define the
   * supported precondition violation subjects. For example, "TOS" for "Terms of Service violation".
   * @param type type or {@code null} for none
   */
  public GoogleRpcPreconditionFailureViolation setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleRpcPreconditionFailureViolation set(String fieldName, Object value) {
    return (GoogleRpcPreconditionFailureViolation) super.set(fieldName, value);
  }

  @Override
  public GoogleRpcPreconditionFailureViolation clone() {
    return (GoogleRpcPreconditionFailureViolation) super.clone();
  }

}
