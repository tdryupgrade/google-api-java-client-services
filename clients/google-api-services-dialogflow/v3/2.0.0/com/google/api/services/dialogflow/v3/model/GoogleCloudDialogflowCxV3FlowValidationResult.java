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

package com.google.api.services.dialogflow.v3.model;

/**
 * The response message for Flows.GetFlowValidationResult.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3FlowValidationResult extends com.google.api.client.json.GenericJson {

  /**
   * The unique identifier of the flow validation result. Format:
   * `projects//locations//agents//flows//validationResult`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Last time the flow was validated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Contains all validation messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3ValidationMessage> validationMessages;

  /**
   * The unique identifier of the flow validation result. Format:
   * `projects//locations//agents//flows//validationResult`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The unique identifier of the flow validation result. Format:
   * `projects//locations//agents//flows//validationResult`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3FlowValidationResult setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Last time the flow was validated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Last time the flow was validated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3FlowValidationResult setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Contains all validation messages.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3ValidationMessage> getValidationMessages() {
    return validationMessages;
  }

  /**
   * Contains all validation messages.
   * @param validationMessages validationMessages or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3FlowValidationResult setValidationMessages(java.util.List<GoogleCloudDialogflowCxV3ValidationMessage> validationMessages) {
    this.validationMessages = validationMessages;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3FlowValidationResult set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3FlowValidationResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3FlowValidationResult clone() {
    return (GoogleCloudDialogflowCxV3FlowValidationResult) super.clone();
  }

}
