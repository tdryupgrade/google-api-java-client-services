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

package com.google.api.services.clouddebugger.v2.model;

/**
 * Represents a contextual status message. The message can indicate an error or informational
 * status, and refer to specific parts of the containing object. For example, the
 * `Breakpoint.status` field can indicate an error referring to the `BREAKPOINT_SOURCE_LOCATION`
 * with the message `Location not found`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Debugger API (Deprecated). For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StatusMessage extends com.google.api.client.json.GenericJson {

  /**
   * Status message text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FormatMessage description;

  /**
   * Distinguishes errors from informational messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isError;

  /**
   * Reference to which the message applies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String refersTo;

  /**
   * Status message text.
   * @return value or {@code null} for none
   */
  public FormatMessage getDescription() {
    return description;
  }

  /**
   * Status message text.
   * @param description description or {@code null} for none
   */
  public StatusMessage setDescription(FormatMessage description) {
    this.description = description;
    return this;
  }

  /**
   * Distinguishes errors from informational messages.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsError() {
    return isError;
  }

  /**
   * Distinguishes errors from informational messages.
   * @param isError isError or {@code null} for none
   */
  public StatusMessage setIsError(java.lang.Boolean isError) {
    this.isError = isError;
    return this;
  }

  /**
   * Reference to which the message applies.
   * @return value or {@code null} for none
   */
  public java.lang.String getRefersTo() {
    return refersTo;
  }

  /**
   * Reference to which the message applies.
   * @param refersTo refersTo or {@code null} for none
   */
  public StatusMessage setRefersTo(java.lang.String refersTo) {
    this.refersTo = refersTo;
    return this;
  }

  @Override
  public StatusMessage set(String fieldName, Object value) {
    return (StatusMessage) super.set(fieldName, value);
  }

  @Override
  public StatusMessage clone() {
    return (StatusMessage) super.clone();
  }

}
