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
 * Represents article answer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2ArticleAnswer extends com.google.api.client.json.GenericJson {

  /**
   * The name of answer record, in the format of "projects//locations//answerRecords/"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String answerRecord;

  /**
   * Article match confidence. The system's confidence score that this article is a good match for
   * this conversation, as a value from 0.0 (completely uncertain) to 1.0 (completely certain).
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
   * Article snippets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> snippets;

  /**
   * The article title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The article URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

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
  public GoogleCloudDialogflowV2ArticleAnswer setAnswerRecord(java.lang.String answerRecord) {
    this.answerRecord = answerRecord;
    return this;
  }

  /**
   * Article match confidence. The system's confidence score that this article is a good match for
   * this conversation, as a value from 0.0 (completely uncertain) to 1.0 (completely certain).
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Article match confidence. The system's confidence score that this article is a good match for
   * this conversation, as a value from 0.0 (completely uncertain) to 1.0 (completely certain).
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudDialogflowV2ArticleAnswer setConfidence(java.lang.Float confidence) {
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
  public GoogleCloudDialogflowV2ArticleAnswer setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Article snippets.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSnippets() {
    return snippets;
  }

  /**
   * Article snippets.
   * @param snippets snippets or {@code null} for none
   */
  public GoogleCloudDialogflowV2ArticleAnswer setSnippets(java.util.List<java.lang.String> snippets) {
    this.snippets = snippets;
    return this;
  }

  /**
   * The article title.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The article title.
   * @param title title or {@code null} for none
   */
  public GoogleCloudDialogflowV2ArticleAnswer setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The article URI.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * The article URI.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudDialogflowV2ArticleAnswer setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2ArticleAnswer set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2ArticleAnswer) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2ArticleAnswer clone() {
    return (GoogleCloudDialogflowV2ArticleAnswer) super.clone();
  }

}
