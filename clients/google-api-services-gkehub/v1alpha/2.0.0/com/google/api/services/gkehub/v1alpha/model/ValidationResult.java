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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * ValidationResults are results set by each validator running during ValidateCreateMembership.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ValidationResult extends com.google.api.client.json.GenericJson {

  /**
   * Additional information for the validation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String result;

  /**
   * Whether the validation is passed or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean success;

  /**
   * Validator type to validate membership with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String validator;

  /**
   * Additional information for the validation.
   * @return value or {@code null} for none
   */
  public java.lang.String getResult() {
    return result;
  }

  /**
   * Additional information for the validation.
   * @param result result or {@code null} for none
   */
  public ValidationResult setResult(java.lang.String result) {
    this.result = result;
    return this;
  }

  /**
   * Whether the validation is passed or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSuccess() {
    return success;
  }

  /**
   * Whether the validation is passed or not.
   * @param success success or {@code null} for none
   */
  public ValidationResult setSuccess(java.lang.Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Validator type to validate membership with.
   * @return value or {@code null} for none
   */
  public java.lang.String getValidator() {
    return validator;
  }

  /**
   * Validator type to validate membership with.
   * @param validator validator or {@code null} for none
   */
  public ValidationResult setValidator(java.lang.String validator) {
    this.validator = validator;
    return this;
  }

  @Override
  public ValidationResult set(String fieldName, Object value) {
    return (ValidationResult) super.set(fieldName, value);
  }

  @Override
  public ValidationResult clone() {
    return (ValidationResult) super.clone();
  }

}
