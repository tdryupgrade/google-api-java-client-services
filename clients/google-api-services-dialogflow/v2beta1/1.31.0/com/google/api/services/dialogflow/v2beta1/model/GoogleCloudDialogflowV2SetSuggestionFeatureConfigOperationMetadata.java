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
 * Metadata for a ConversationProfile.SetSuggestionFeatureConfig operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2SetSuggestionFeatureConfigOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the conversation profile. Format:
   * `projects//locations//conversationProfiles/`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversationProfile;

  /**
   * Timestamp whe the request was created. The time is measured on server side.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. The participant role to add or update the suggestion feature config. Only HUMAN_AGENT
   * or END_USER can be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String participantRole;

  /**
   * Required. The type of the suggestion feature to add or update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suggestionFeatureType;

  /**
   * The resource name of the conversation profile. Format:
   * `projects//locations//conversationProfiles/`
   * @return value or {@code null} for none
   */
  public java.lang.String getConversationProfile() {
    return conversationProfile;
  }

  /**
   * The resource name of the conversation profile. Format:
   * `projects//locations//conversationProfiles/`
   * @param conversationProfile conversationProfile or {@code null} for none
   */
  public GoogleCloudDialogflowV2SetSuggestionFeatureConfigOperationMetadata setConversationProfile(java.lang.String conversationProfile) {
    this.conversationProfile = conversationProfile;
    return this;
  }

  /**
   * Timestamp whe the request was created. The time is measured on server side.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Timestamp whe the request was created. The time is measured on server side.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDialogflowV2SetSuggestionFeatureConfigOperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. The participant role to add or update the suggestion feature config. Only HUMAN_AGENT
   * or END_USER can be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getParticipantRole() {
    return participantRole;
  }

  /**
   * Required. The participant role to add or update the suggestion feature config. Only HUMAN_AGENT
   * or END_USER can be used.
   * @param participantRole participantRole or {@code null} for none
   */
  public GoogleCloudDialogflowV2SetSuggestionFeatureConfigOperationMetadata setParticipantRole(java.lang.String participantRole) {
    this.participantRole = participantRole;
    return this;
  }

  /**
   * Required. The type of the suggestion feature to add or update.
   * @return value or {@code null} for none
   */
  public java.lang.String getSuggestionFeatureType() {
    return suggestionFeatureType;
  }

  /**
   * Required. The type of the suggestion feature to add or update.
   * @param suggestionFeatureType suggestionFeatureType or {@code null} for none
   */
  public GoogleCloudDialogflowV2SetSuggestionFeatureConfigOperationMetadata setSuggestionFeatureType(java.lang.String suggestionFeatureType) {
    this.suggestionFeatureType = suggestionFeatureType;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2SetSuggestionFeatureConfigOperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2SetSuggestionFeatureConfigOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2SetSuggestionFeatureConfigOperationMetadata clone() {
    return (GoogleCloudDialogflowV2SetSuggestionFeatureConfigOperationMetadata) super.clone();
  }

}
