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
 * Represents answer from "frequently asked questions".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2FaqAnswer extends com.google.api.client.json.GenericJson {

  /**
   * The piece of text from the `source` knowledge base document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String answer;

  /**
   * The name of answer record, in the format of "projects//locations//answerRecords/"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String answerRecord;

  /**
   * The system's confidence score that this Knowledge answer is a good match for this
   * conversational query, range from 0.0 (completely uncertain) to 1.0 (completely certain).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * A map that contains metadata about the answer and the document from which it originates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * The corresponding FAQ question.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String question;

  /**
   * Indicates which Knowledge Document this answer was extracted from. Format:
   * `projects//locations//agent/knowledgeBases//documents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * The piece of text from the `source` knowledge base document.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnswer() {
    return answer;
  }

  /**
   * The piece of text from the `source` knowledge base document.
   * @param answer answer or {@code null} for none
   */
  public GoogleCloudDialogflowV2FaqAnswer setAnswer(java.lang.String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * The name of answer record, in the format of "projects//locations//answerRecords/"
   * @return value or {@code null} for none
   */
  public java.lang.String getAnswerRecord() {
    return answerRecord;
  }

  /**
   * The name of answer record, in the format of "projects//locations//answerRecords/"
   * @param answerRecord answerRecord or {@code null} for none
   */
  public GoogleCloudDialogflowV2FaqAnswer setAnswerRecord(java.lang.String answerRecord) {
    this.answerRecord = answerRecord;
    return this;
  }

  /**
   * The system's confidence score that this Knowledge answer is a good match for this
   * conversational query, range from 0.0 (completely uncertain) to 1.0 (completely certain).
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * The system's confidence score that this Knowledge answer is a good match for this
   * conversational query, range from 0.0 (completely uncertain) to 1.0 (completely certain).
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudDialogflowV2FaqAnswer setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * A map that contains metadata about the answer and the document from which it originates.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * A map that contains metadata about the answer and the document from which it originates.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudDialogflowV2FaqAnswer setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The corresponding FAQ question.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuestion() {
    return question;
  }

  /**
   * The corresponding FAQ question.
   * @param question question or {@code null} for none
   */
  public GoogleCloudDialogflowV2FaqAnswer setQuestion(java.lang.String question) {
    this.question = question;
    return this;
  }

  /**
   * Indicates which Knowledge Document this answer was extracted from. Format:
   * `projects//locations//agent/knowledgeBases//documents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Indicates which Knowledge Document this answer was extracted from. Format:
   * `projects//locations//agent/knowledgeBases//documents/`.
   * @param source source or {@code null} for none
   */
  public GoogleCloudDialogflowV2FaqAnswer setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2FaqAnswer set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2FaqAnswer) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2FaqAnswer clone() {
    return (GoogleCloudDialogflowV2FaqAnswer) super.clone();
  }

}
