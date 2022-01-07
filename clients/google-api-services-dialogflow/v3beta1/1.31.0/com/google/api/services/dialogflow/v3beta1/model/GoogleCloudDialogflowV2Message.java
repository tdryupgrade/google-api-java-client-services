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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Represents a message posted into a conversation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2Message extends com.google.api.client.json.GenericJson {

  /**
   * Required. The message content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * Output only. The time when the message was created in Contact Center AI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. The message language. This should be a [BCP-47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Output only. The annotation for the message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2MessageAnnotation messageAnnotation;

  /**
   * Optional. The unique identifier of the message. Format:
   * `projects//locations//conversations//messages/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The participant that sends this message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String participant;

  /**
   * Output only. The role of the participant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String participantRole;

  /**
   * Optional. The time when the message was sent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String sendTime;

  /**
   * Output only. The sentiment analysis result for the message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2SentimentAnalysisResult sentimentAnalysis;

  /**
   * Required. The message content.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Required. The message content.
   * @param content content or {@code null} for none
   */
  public GoogleCloudDialogflowV2Message setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * Output only. The time when the message was created in Contact Center AI.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the message was created in Contact Center AI.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDialogflowV2Message setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. The message language. This should be a [BCP-47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Optional. The message language. This should be a [BCP-47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDialogflowV2Message setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Output only. The annotation for the message.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2MessageAnnotation getMessageAnnotation() {
    return messageAnnotation;
  }

  /**
   * Output only. The annotation for the message.
   * @param messageAnnotation messageAnnotation or {@code null} for none
   */
  public GoogleCloudDialogflowV2Message setMessageAnnotation(GoogleCloudDialogflowV2MessageAnnotation messageAnnotation) {
    this.messageAnnotation = messageAnnotation;
    return this;
  }

  /**
   * Optional. The unique identifier of the message. Format:
   * `projects//locations//conversations//messages/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. The unique identifier of the message. Format:
   * `projects//locations//conversations//messages/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2Message setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The participant that sends this message.
   * @return value or {@code null} for none
   */
  public java.lang.String getParticipant() {
    return participant;
  }

  /**
   * Output only. The participant that sends this message.
   * @param participant participant or {@code null} for none
   */
  public GoogleCloudDialogflowV2Message setParticipant(java.lang.String participant) {
    this.participant = participant;
    return this;
  }

  /**
   * Output only. The role of the participant.
   * @return value or {@code null} for none
   */
  public java.lang.String getParticipantRole() {
    return participantRole;
  }

  /**
   * Output only. The role of the participant.
   * @param participantRole participantRole or {@code null} for none
   */
  public GoogleCloudDialogflowV2Message setParticipantRole(java.lang.String participantRole) {
    this.participantRole = participantRole;
    return this;
  }

  /**
   * Optional. The time when the message was sent.
   * @return value or {@code null} for none
   */
  public String getSendTime() {
    return sendTime;
  }

  /**
   * Optional. The time when the message was sent.
   * @param sendTime sendTime or {@code null} for none
   */
  public GoogleCloudDialogflowV2Message setSendTime(String sendTime) {
    this.sendTime = sendTime;
    return this;
  }

  /**
   * Output only. The sentiment analysis result for the message.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2SentimentAnalysisResult getSentimentAnalysis() {
    return sentimentAnalysis;
  }

  /**
   * Output only. The sentiment analysis result for the message.
   * @param sentimentAnalysis sentimentAnalysis or {@code null} for none
   */
  public GoogleCloudDialogflowV2Message setSentimentAnalysis(GoogleCloudDialogflowV2SentimentAnalysisResult sentimentAnalysis) {
    this.sentimentAnalysis = sentimentAnalysis;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2Message set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2Message) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2Message clone() {
    return (GoogleCloudDialogflowV2Message) super.clone();
  }

}
