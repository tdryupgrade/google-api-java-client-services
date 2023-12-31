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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * A piece of metadata that applies to a window of a call.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1CallAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * The boundary in the conversation where the annotation ends, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1AnnotationBoundary annotationEndBoundary;

  /**
   * The boundary in the conversation where the annotation starts, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1AnnotationBoundary annotationStartBoundary;

  /**
   * The channel of the audio where the annotation occurs. For single-channel audio, this field is
   * not populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer channelTag;

  /**
   * Data specifying an entity mention.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1EntityMentionData entityMentionData;

  /**
   * Data specifying a hold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1HoldData holdData;

  /**
   * Data specifying an intent match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1IntentMatchData intentMatchData;

  /**
   * Data specifying an interruption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1InterruptionData interruptionData;

  /**
   * Data specifying an issue match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1IssueMatchData issueMatchData;

  /**
   * Data specifying a phrase match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1PhraseMatchData phraseMatchData;

  /**
   * Data specifying sentiment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1SentimentData sentimentData;

  /**
   * Data specifying silence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1SilenceData silenceData;

  /**
   * The boundary in the conversation where the annotation ends, inclusive.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnnotationBoundary getAnnotationEndBoundary() {
    return annotationEndBoundary;
  }

  /**
   * The boundary in the conversation where the annotation ends, inclusive.
   * @param annotationEndBoundary annotationEndBoundary or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CallAnnotation setAnnotationEndBoundary(GoogleCloudContactcenterinsightsV1AnnotationBoundary annotationEndBoundary) {
    this.annotationEndBoundary = annotationEndBoundary;
    return this;
  }

  /**
   * The boundary in the conversation where the annotation starts, inclusive.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnnotationBoundary getAnnotationStartBoundary() {
    return annotationStartBoundary;
  }

  /**
   * The boundary in the conversation where the annotation starts, inclusive.
   * @param annotationStartBoundary annotationStartBoundary or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CallAnnotation setAnnotationStartBoundary(GoogleCloudContactcenterinsightsV1AnnotationBoundary annotationStartBoundary) {
    this.annotationStartBoundary = annotationStartBoundary;
    return this;
  }

  /**
   * The channel of the audio where the annotation occurs. For single-channel audio, this field is
   * not populated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getChannelTag() {
    return channelTag;
  }

  /**
   * The channel of the audio where the annotation occurs. For single-channel audio, this field is
   * not populated.
   * @param channelTag channelTag or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CallAnnotation setChannelTag(java.lang.Integer channelTag) {
    this.channelTag = channelTag;
    return this;
  }

  /**
   * Data specifying an entity mention.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1EntityMentionData getEntityMentionData() {
    return entityMentionData;
  }

  /**
   * Data specifying an entity mention.
   * @param entityMentionData entityMentionData or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CallAnnotation setEntityMentionData(GoogleCloudContactcenterinsightsV1EntityMentionData entityMentionData) {
    this.entityMentionData = entityMentionData;
    return this;
  }

  /**
   * Data specifying a hold.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1HoldData getHoldData() {
    return holdData;
  }

  /**
   * Data specifying a hold.
   * @param holdData holdData or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CallAnnotation setHoldData(GoogleCloudContactcenterinsightsV1HoldData holdData) {
    this.holdData = holdData;
    return this;
  }

  /**
   * Data specifying an intent match.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1IntentMatchData getIntentMatchData() {
    return intentMatchData;
  }

  /**
   * Data specifying an intent match.
   * @param intentMatchData intentMatchData or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CallAnnotation setIntentMatchData(GoogleCloudContactcenterinsightsV1IntentMatchData intentMatchData) {
    this.intentMatchData = intentMatchData;
    return this;
  }

  /**
   * Data specifying an interruption.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1InterruptionData getInterruptionData() {
    return interruptionData;
  }

  /**
   * Data specifying an interruption.
   * @param interruptionData interruptionData or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CallAnnotation setInterruptionData(GoogleCloudContactcenterinsightsV1InterruptionData interruptionData) {
    this.interruptionData = interruptionData;
    return this;
  }

  /**
   * Data specifying an issue match.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1IssueMatchData getIssueMatchData() {
    return issueMatchData;
  }

  /**
   * Data specifying an issue match.
   * @param issueMatchData issueMatchData or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CallAnnotation setIssueMatchData(GoogleCloudContactcenterinsightsV1IssueMatchData issueMatchData) {
    this.issueMatchData = issueMatchData;
    return this;
  }

  /**
   * Data specifying a phrase match.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1PhraseMatchData getPhraseMatchData() {
    return phraseMatchData;
  }

  /**
   * Data specifying a phrase match.
   * @param phraseMatchData phraseMatchData or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CallAnnotation setPhraseMatchData(GoogleCloudContactcenterinsightsV1PhraseMatchData phraseMatchData) {
    this.phraseMatchData = phraseMatchData;
    return this;
  }

  /**
   * Data specifying sentiment.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1SentimentData getSentimentData() {
    return sentimentData;
  }

  /**
   * Data specifying sentiment.
   * @param sentimentData sentimentData or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CallAnnotation setSentimentData(GoogleCloudContactcenterinsightsV1SentimentData sentimentData) {
    this.sentimentData = sentimentData;
    return this;
  }

  /**
   * Data specifying silence.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1SilenceData getSilenceData() {
    return silenceData;
  }

  /**
   * Data specifying silence.
   * @param silenceData silenceData or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1CallAnnotation setSilenceData(GoogleCloudContactcenterinsightsV1SilenceData silenceData) {
    this.silenceData = silenceData;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1CallAnnotation set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1CallAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1CallAnnotation clone() {
    return (GoogleCloudContactcenterinsightsV1CallAnnotation) super.clone();
  }

}
