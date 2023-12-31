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

package com.google.api.services.datastream.v1.model;

/**
 * A validation to perform on a stream.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Datastream API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Validation extends com.google.api.client.json.GenericJson {

  /**
   * A custom code identifying this validation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * A short description of the validation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Messages reflecting the validation results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ValidationMessage> message;

  /**
   * Output only. Validation execution status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * A custom code identifying this validation.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * A custom code identifying this validation.
   * @param code code or {@code null} for none
   */
  public Validation setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * A short description of the validation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A short description of the validation.
   * @param description description or {@code null} for none
   */
  public Validation setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Messages reflecting the validation results.
   * @return value or {@code null} for none
   */
  public java.util.List<ValidationMessage> getMessage() {
    return message;
  }

  /**
   * Messages reflecting the validation results.
   * @param message message or {@code null} for none
   */
  public Validation setMessage(java.util.List<ValidationMessage> message) {
    this.message = message;
    return this;
  }

  /**
   * Output only. Validation execution status.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Validation execution status.
   * @param state state or {@code null} for none
   */
  public Validation setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Validation set(String fieldName, Object value) {
    return (Validation) super.set(fieldName, value);
  }

  @Override
  public Validation clone() {
    return (Validation) super.clone();
  }

}
