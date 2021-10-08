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
 * Represents a single followup intent in the chain.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo extends com.google.api.client.json.GenericJson {

  /**
   * The unique identifier of the followup intent. Format: `projects//agent/intents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String followupIntentName;

  /**
   * The unique identifier of the followup intent's parent. Format: `projects//agent/intents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentFollowupIntentName;

  /**
   * The unique identifier of the followup intent. Format: `projects//agent/intents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFollowupIntentName() {
    return followupIntentName;
  }

  /**
   * The unique identifier of the followup intent. Format: `projects//agent/intents/`.
   * @param followupIntentName followupIntentName or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo setFollowupIntentName(java.lang.String followupIntentName) {
    this.followupIntentName = followupIntentName;
    return this;
  }

  /**
   * The unique identifier of the followup intent's parent. Format: `projects//agent/intents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentFollowupIntentName() {
    return parentFollowupIntentName;
  }

  /**
   * The unique identifier of the followup intent's parent. Format: `projects//agent/intents/`.
   * @param parentFollowupIntentName parentFollowupIntentName or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo setParentFollowupIntentName(java.lang.String parentFollowupIntentName) {
    this.parentFollowupIntentName = parentFollowupIntentName;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo clone() {
    return (GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo) super.clone();
  }

}
