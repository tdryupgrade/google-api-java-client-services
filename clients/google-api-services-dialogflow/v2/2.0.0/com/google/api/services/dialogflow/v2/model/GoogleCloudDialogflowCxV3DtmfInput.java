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

package com.google.api.services.dialogflow.v2.model;

/**
 * Represents the input for dtmf event.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3DtmfInput extends com.google.api.client.json.GenericJson {

  /**
   * The dtmf digits.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String digits;

  /**
   * The finish digit (if any).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String finishDigit;

  /**
   * The dtmf digits.
   * @return value or {@code null} for none
   */
  public java.lang.String getDigits() {
    return digits;
  }

  /**
   * The dtmf digits.
   * @param digits digits or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3DtmfInput setDigits(java.lang.String digits) {
    this.digits = digits;
    return this;
  }

  /**
   * The finish digit (if any).
   * @return value or {@code null} for none
   */
  public java.lang.String getFinishDigit() {
    return finishDigit;
  }

  /**
   * The finish digit (if any).
   * @param finishDigit finishDigit or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3DtmfInput setFinishDigit(java.lang.String finishDigit) {
    this.finishDigit = finishDigit;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3DtmfInput set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3DtmfInput) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3DtmfInput clone() {
    return (GoogleCloudDialogflowCxV3DtmfInput) super.clone();
  }

}
