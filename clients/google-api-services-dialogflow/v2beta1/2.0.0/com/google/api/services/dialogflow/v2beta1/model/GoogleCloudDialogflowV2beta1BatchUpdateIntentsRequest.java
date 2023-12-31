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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * The request message for Intents.BatchUpdateIntents.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1BatchUpdateIntentsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The collection of intents to update or create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentBatch intentBatchInline;

  /**
   * The URI to a Google Cloud Storage file containing intents to update or create. The file format
   * can either be a serialized proto (of IntentBatch type) or JSON object. Note: The URI must start
   * with "gs://".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String intentBatchUri;

  /**
   * Optional. The resource view to apply to the returned intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String intentView;

  /**
   * Optional. The language used to access language-specific data. If not specified, the agent's
   * default language is used. For more information, see [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Optional. The mask to control which fields get updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * The collection of intents to update or create.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentBatch getIntentBatchInline() {
    return intentBatchInline;
  }

  /**
   * The collection of intents to update or create.
   * @param intentBatchInline intentBatchInline or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1BatchUpdateIntentsRequest setIntentBatchInline(GoogleCloudDialogflowV2beta1IntentBatch intentBatchInline) {
    this.intentBatchInline = intentBatchInline;
    return this;
  }

  /**
   * The URI to a Google Cloud Storage file containing intents to update or create. The file format
   * can either be a serialized proto (of IntentBatch type) or JSON object. Note: The URI must start
   * with "gs://".
   * @return value or {@code null} for none
   */
  public java.lang.String getIntentBatchUri() {
    return intentBatchUri;
  }

  /**
   * The URI to a Google Cloud Storage file containing intents to update or create. The file format
   * can either be a serialized proto (of IntentBatch type) or JSON object. Note: The URI must start
   * with "gs://".
   * @param intentBatchUri intentBatchUri or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1BatchUpdateIntentsRequest setIntentBatchUri(java.lang.String intentBatchUri) {
    this.intentBatchUri = intentBatchUri;
    return this;
  }

  /**
   * Optional. The resource view to apply to the returned intent.
   * @return value or {@code null} for none
   */
  public java.lang.String getIntentView() {
    return intentView;
  }

  /**
   * Optional. The resource view to apply to the returned intent.
   * @param intentView intentView or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1BatchUpdateIntentsRequest setIntentView(java.lang.String intentView) {
    this.intentView = intentView;
    return this;
  }

  /**
   * Optional. The language used to access language-specific data. If not specified, the agent's
   * default language is used. For more information, see [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Optional. The language used to access language-specific data. If not specified, the agent's
   * default language is used. For more information, see [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1BatchUpdateIntentsRequest setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Optional. The mask to control which fields get updated.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * Optional. The mask to control which fields get updated.
   * @param updateMask updateMask or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1BatchUpdateIntentsRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1BatchUpdateIntentsRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1BatchUpdateIntentsRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1BatchUpdateIntentsRequest clone() {
    return (GoogleCloudDialogflowV2beta1BatchUpdateIntentsRequest) super.clone();
  }

}
