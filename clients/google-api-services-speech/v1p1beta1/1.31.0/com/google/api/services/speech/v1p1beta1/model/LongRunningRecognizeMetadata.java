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

package com.google.api.services.speech.v1p1beta1.model;

/**
 * Describes the progress of a long-running `LongRunningRecognize` call. It is included in the
 * `metadata` field of the `Operation` returned by the `GetOperation` call of the
 * `google::longrunning::Operations` service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech-to-Text API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LongRunningRecognizeMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Time of the most recent processing update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastUpdateTime;

  /**
   * Output only. A copy of the TranscriptOutputConfig if it was set in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TranscriptOutputConfig outputConfig;

  /**
   * Approximate percentage of audio processed thus far. Guaranteed to be 100 when the audio is
   * fully processed and the results are available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer progressPercent;

  /**
   * Time when the request was received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Output only. The URI of the audio file being transcribed. Empty if the audio was sent as byte
   * content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Time of the most recent processing update.
   * @return value or {@code null} for none
   */
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  /**
   * Time of the most recent processing update.
   * @param lastUpdateTime lastUpdateTime or {@code null} for none
   */
  public LongRunningRecognizeMetadata setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * Output only. A copy of the TranscriptOutputConfig if it was set in the request.
   * @return value or {@code null} for none
   */
  public TranscriptOutputConfig getOutputConfig() {
    return outputConfig;
  }

  /**
   * Output only. A copy of the TranscriptOutputConfig if it was set in the request.
   * @param outputConfig outputConfig or {@code null} for none
   */
  public LongRunningRecognizeMetadata setOutputConfig(TranscriptOutputConfig outputConfig) {
    this.outputConfig = outputConfig;
    return this;
  }

  /**
   * Approximate percentage of audio processed thus far. Guaranteed to be 100 when the audio is
   * fully processed and the results are available.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProgressPercent() {
    return progressPercent;
  }

  /**
   * Approximate percentage of audio processed thus far. Guaranteed to be 100 when the audio is
   * fully processed and the results are available.
   * @param progressPercent progressPercent or {@code null} for none
   */
  public LongRunningRecognizeMetadata setProgressPercent(java.lang.Integer progressPercent) {
    this.progressPercent = progressPercent;
    return this;
  }

  /**
   * Time when the request was received.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Time when the request was received.
   * @param startTime startTime or {@code null} for none
   */
  public LongRunningRecognizeMetadata setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Output only. The URI of the audio file being transcribed. Empty if the audio was sent as byte
   * content.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Output only. The URI of the audio file being transcribed. Empty if the audio was sent as byte
   * content.
   * @param uri uri or {@code null} for none
   */
  public LongRunningRecognizeMetadata setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public LongRunningRecognizeMetadata set(String fieldName, Object value) {
    return (LongRunningRecognizeMetadata) super.set(fieldName, value);
  }

  @Override
  public LongRunningRecognizeMetadata clone() {
    return (LongRunningRecognizeMetadata) super.clone();
  }

}
