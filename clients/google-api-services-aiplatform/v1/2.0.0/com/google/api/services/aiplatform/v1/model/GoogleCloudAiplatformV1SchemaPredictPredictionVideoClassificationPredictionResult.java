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

package com.google.api.services.aiplatform.v1.model;

/**
 * Prediction output format for Video Classification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult extends com.google.api.client.json.GenericJson {

  /**
   * The Model's confidence in correction of this prediction, higher value means higher confidence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * The display name of the AnnotationSpec that had been identified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The resource ID of the AnnotationSpec that had been identified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The end, exclusive, of the video's time segment in which the AnnotationSpec has been
   * identified. Expressed as a number of seconds as measured from the start of the video, with
   * fractions up to a microsecond precision, and with "s" appended at the end. Note that for
   * 'segment-classification' prediction type, this equals the original 'timeSegmentEnd' from the
   * input instance, for other types it is the end of a shot or a 1 second interval respectively.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeSegmentEnd;

  /**
   * The beginning, inclusive, of the video's time segment in which the AnnotationSpec has been
   * identified. Expressed as a number of seconds as measured from the start of the video, with
   * fractions up to a microsecond precision, and with "s" appended at the end. Note that for
   * 'segment-classification' prediction type, this equals the original 'timeSegmentStart' from the
   * input instance, for other types it is the start of a shot or a 1 second interval respectively.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeSegmentStart;

  /**
   * The type of the prediction. The requested types can be configured via parameters. This will be
   * one of - segment-classification - shot-classification - one-sec-interval-classification
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The Model's confidence in correction of this prediction, higher value means higher confidence.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * The Model's confidence in correction of this prediction, higher value means higher confidence.
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * The display name of the AnnotationSpec that had been identified.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the AnnotationSpec that had been identified.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The resource ID of the AnnotationSpec that had been identified.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The resource ID of the AnnotationSpec that had been identified.
   * @param id id or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The end, exclusive, of the video's time segment in which the AnnotationSpec has been
   * identified. Expressed as a number of seconds as measured from the start of the video, with
   * fractions up to a microsecond precision, and with "s" appended at the end. Note that for
   * 'segment-classification' prediction type, this equals the original 'timeSegmentEnd' from the
   * input instance, for other types it is the end of a shot or a 1 second interval respectively.
   * @return value or {@code null} for none
   */
  public String getTimeSegmentEnd() {
    return timeSegmentEnd;
  }

  /**
   * The end, exclusive, of the video's time segment in which the AnnotationSpec has been
   * identified. Expressed as a number of seconds as measured from the start of the video, with
   * fractions up to a microsecond precision, and with "s" appended at the end. Note that for
   * 'segment-classification' prediction type, this equals the original 'timeSegmentEnd' from the
   * input instance, for other types it is the end of a shot or a 1 second interval respectively.
   * @param timeSegmentEnd timeSegmentEnd or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult setTimeSegmentEnd(String timeSegmentEnd) {
    this.timeSegmentEnd = timeSegmentEnd;
    return this;
  }

  /**
   * The beginning, inclusive, of the video's time segment in which the AnnotationSpec has been
   * identified. Expressed as a number of seconds as measured from the start of the video, with
   * fractions up to a microsecond precision, and with "s" appended at the end. Note that for
   * 'segment-classification' prediction type, this equals the original 'timeSegmentStart' from the
   * input instance, for other types it is the start of a shot or a 1 second interval respectively.
   * @return value or {@code null} for none
   */
  public String getTimeSegmentStart() {
    return timeSegmentStart;
  }

  /**
   * The beginning, inclusive, of the video's time segment in which the AnnotationSpec has been
   * identified. Expressed as a number of seconds as measured from the start of the video, with
   * fractions up to a microsecond precision, and with "s" appended at the end. Note that for
   * 'segment-classification' prediction type, this equals the original 'timeSegmentStart' from the
   * input instance, for other types it is the start of a shot or a 1 second interval respectively.
   * @param timeSegmentStart timeSegmentStart or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult setTimeSegmentStart(String timeSegmentStart) {
    this.timeSegmentStart = timeSegmentStart;
    return this;
  }

  /**
   * The type of the prediction. The requested types can be configured via parameters. This will be
   * one of - segment-classification - shot-classification - one-sec-interval-classification
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the prediction. The requested types can be configured via parameters. This will be
   * one of - segment-classification - shot-classification - one-sec-interval-classification
   * @param type type or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult clone() {
    return (GoogleCloudAiplatformV1SchemaPredictPredictionVideoClassificationPredictionResult) super.clone();
  }

}
