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

package com.google.api.services.androidpublisher.model;

/**
 * Information specific to cancellations initiated by users.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserInitiatedCancellation extends com.google.api.client.json.GenericJson {

  /**
   * Information provided by the user when they complete the subscription cancellation flow
   * (cancellation reason survey).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CancelSurveyResult cancelSurveyResult;

  /**
   * The time at which the subscription was canceled by the user. The user might still have access
   * to the subscription after this time. Use line_items.expiry_time to determine if a user still
   * has access.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String cancelTime;

  /**
   * Information provided by the user when they complete the subscription cancellation flow
   * (cancellation reason survey).
   * @return value or {@code null} for none
   */
  public CancelSurveyResult getCancelSurveyResult() {
    return cancelSurveyResult;
  }

  /**
   * Information provided by the user when they complete the subscription cancellation flow
   * (cancellation reason survey).
   * @param cancelSurveyResult cancelSurveyResult or {@code null} for none
   */
  public UserInitiatedCancellation setCancelSurveyResult(CancelSurveyResult cancelSurveyResult) {
    this.cancelSurveyResult = cancelSurveyResult;
    return this;
  }

  /**
   * The time at which the subscription was canceled by the user. The user might still have access
   * to the subscription after this time. Use line_items.expiry_time to determine if a user still
   * has access.
   * @return value or {@code null} for none
   */
  public String getCancelTime() {
    return cancelTime;
  }

  /**
   * The time at which the subscription was canceled by the user. The user might still have access
   * to the subscription after this time. Use line_items.expiry_time to determine if a user still
   * has access.
   * @param cancelTime cancelTime or {@code null} for none
   */
  public UserInitiatedCancellation setCancelTime(String cancelTime) {
    this.cancelTime = cancelTime;
    return this;
  }

  @Override
  public UserInitiatedCancellation set(String fieldName, Object value) {
    return (UserInitiatedCancellation) super.set(fieldName, value);
  }

  @Override
  public UserInitiatedCancellation clone() {
    return (UserInitiatedCancellation) super.clone();
  }

}
