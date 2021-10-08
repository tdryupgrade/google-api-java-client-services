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
 * Represents page information communicated to and from the webhook.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1PageInfo extends com.google.api.client.json.GenericJson {

  /**
   * Always present for WebhookRequest. Ignored for WebhookResponse. The unique identifier of the
   * current page. Format: `projects//locations//agents//flows//pages/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currentPage;

  /**
   * Optional for both WebhookRequest and WebhookResponse. Information about the form.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1PageInfoFormInfo formInfo;

  /**
   * Always present for WebhookRequest. Ignored for WebhookResponse. The unique identifier of the
   * current page. Format: `projects//locations//agents//flows//pages/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrentPage() {
    return currentPage;
  }

  /**
   * Always present for WebhookRequest. Ignored for WebhookResponse. The unique identifier of the
   * current page. Format: `projects//locations//agents//flows//pages/`.
   * @param currentPage currentPage or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1PageInfo setCurrentPage(java.lang.String currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Optional for both WebhookRequest and WebhookResponse. Information about the form.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1PageInfoFormInfo getFormInfo() {
    return formInfo;
  }

  /**
   * Optional for both WebhookRequest and WebhookResponse. Information about the form.
   * @param formInfo formInfo or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1PageInfo setFormInfo(GoogleCloudDialogflowCxV3beta1PageInfoFormInfo formInfo) {
    this.formInfo = formInfo;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1PageInfo set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1PageInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1PageInfo clone() {
    return (GoogleCloudDialogflowCxV3beta1PageInfo) super.clone();
  }

}
