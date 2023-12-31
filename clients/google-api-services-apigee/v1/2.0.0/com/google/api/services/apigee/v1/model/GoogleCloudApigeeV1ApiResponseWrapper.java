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
 * Model definition for GoogleCloudApigeeV1ApiResponseWrapper.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ApiResponseWrapper extends com.google.api.client.json.GenericJson {

  /**
   * ID that can be used to find errors in the log files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorCode;

  /**
   * Description of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * ID that can be used to find request details in the log files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Status of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * ID that can be used to find errors in the log files.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorCode() {
    return errorCode;
  }

  /**
   * ID that can be used to find errors in the log files.
   * @param errorCode errorCode or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiResponseWrapper setErrorCode(java.lang.String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Description of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Description of the operation.
   * @param message message or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiResponseWrapper setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * ID that can be used to find request details in the log files.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * ID that can be used to find request details in the log files.
   * @param requestId requestId or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiResponseWrapper setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Status of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the operation.
   * @param status status or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiResponseWrapper setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ApiResponseWrapper set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ApiResponseWrapper) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ApiResponseWrapper clone() {
    return (GoogleCloudApigeeV1ApiResponseWrapper) super.clone();
  }

}
