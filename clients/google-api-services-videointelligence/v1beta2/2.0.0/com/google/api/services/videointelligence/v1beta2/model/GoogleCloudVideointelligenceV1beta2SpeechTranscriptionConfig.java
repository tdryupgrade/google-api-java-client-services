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

package com.google.api.services.videointelligence.v1beta2.model;

/**
 * Config for SPEECH_TRANSCRIPTION.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. For file formats, such as MXF or MKV, supporting multiple audio tracks, specify up to
   * two tracks. Default: track 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> audioTracks;

  /**
   * Optional. If set, specifies the estimated number of speakers in the conversation. If not set,
   * defaults to '2'. Ignored unless enable_speaker_diarization is set to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer diarizationSpeakerCount;

  /**
   * Optional. If 'true', adds punctuation to recognition result hypotheses. This feature is only
   * available in select languages. Setting this for requests in other languages has no effect at
   * all. The default 'false' value does not add punctuation to result hypotheses. NOTE: "This is
   * currently offered as an experimental service, complimentary to all users. In the future this
   * may be exclusively available as a premium feature."
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableAutomaticPunctuation;

  /**
   * Optional. If 'true', enables speaker detection for each recognized word in the top alternative
   * of the recognition result using a speaker_tag provided in the WordInfo. Note: When this is
   * true, we send all the words from the beginning of the audio for the top alternative in every
   * consecutive response. This is done in order to improve our speaker tags as our models learn to
   * identify the speakers in the conversation over time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableSpeakerDiarization;

  /**
   * Optional. If `true`, the top result includes a list of words and the confidence for those
   * words. If `false`, no word-level confidence information is returned. The default is `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableWordConfidence;

  /**
   * Optional. If set to `true`, the server will attempt to filter out profanities, replacing all
   * but the initial character in each filtered word with asterisks, e.g. "f***". If set to `false`
   * or omitted, profanities won't be filtered out.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean filterProfanity;

  /**
   * Required. *Required* The language of the supplied audio as a [BCP-47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US". See [Language
   * Support](https://cloud.google.com/speech/docs/languages) for a list of the currently supported
   * language codes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Optional. Maximum number of recognition hypotheses to be returned. Specifically, the maximum
   * number of `SpeechRecognitionAlternative` messages within each `SpeechTranscription`. The server
   * may return fewer than `max_alternatives`. Valid values are `0`-`30`. A value of `0` or `1` will
   * return a maximum of one. If omitted, will return a maximum of one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxAlternatives;

  /**
   * Optional. A means to provide context to assist the speech recognition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1beta2SpeechContext> speechContexts;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1beta2SpeechContext used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1beta2SpeechContext.class);
  }

  /**
   * Optional. For file formats, such as MXF or MKV, supporting multiple audio tracks, specify up to
   * two tracks. Default: track 0.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getAudioTracks() {
    return audioTracks;
  }

  /**
   * Optional. For file formats, such as MXF or MKV, supporting multiple audio tracks, specify up to
   * two tracks. Default: track 0.
   * @param audioTracks audioTracks or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig setAudioTracks(java.util.List<java.lang.Integer> audioTracks) {
    this.audioTracks = audioTracks;
    return this;
  }

  /**
   * Optional. If set, specifies the estimated number of speakers in the conversation. If not set,
   * defaults to '2'. Ignored unless enable_speaker_diarization is set to true.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDiarizationSpeakerCount() {
    return diarizationSpeakerCount;
  }

  /**
   * Optional. If set, specifies the estimated number of speakers in the conversation. If not set,
   * defaults to '2'. Ignored unless enable_speaker_diarization is set to true.
   * @param diarizationSpeakerCount diarizationSpeakerCount or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig setDiarizationSpeakerCount(java.lang.Integer diarizationSpeakerCount) {
    this.diarizationSpeakerCount = diarizationSpeakerCount;
    return this;
  }

  /**
   * Optional. If 'true', adds punctuation to recognition result hypotheses. This feature is only
   * available in select languages. Setting this for requests in other languages has no effect at
   * all. The default 'false' value does not add punctuation to result hypotheses. NOTE: "This is
   * currently offered as an experimental service, complimentary to all users. In the future this
   * may be exclusively available as a premium feature."
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableAutomaticPunctuation() {
    return enableAutomaticPunctuation;
  }

  /**
   * Optional. If 'true', adds punctuation to recognition result hypotheses. This feature is only
   * available in select languages. Setting this for requests in other languages has no effect at
   * all. The default 'false' value does not add punctuation to result hypotheses. NOTE: "This is
   * currently offered as an experimental service, complimentary to all users. In the future this
   * may be exclusively available as a premium feature."
   * @param enableAutomaticPunctuation enableAutomaticPunctuation or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig setEnableAutomaticPunctuation(java.lang.Boolean enableAutomaticPunctuation) {
    this.enableAutomaticPunctuation = enableAutomaticPunctuation;
    return this;
  }

  /**
   * Optional. If 'true', enables speaker detection for each recognized word in the top alternative
   * of the recognition result using a speaker_tag provided in the WordInfo. Note: When this is
   * true, we send all the words from the beginning of the audio for the top alternative in every
   * consecutive response. This is done in order to improve our speaker tags as our models learn to
   * identify the speakers in the conversation over time.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableSpeakerDiarization() {
    return enableSpeakerDiarization;
  }

  /**
   * Optional. If 'true', enables speaker detection for each recognized word in the top alternative
   * of the recognition result using a speaker_tag provided in the WordInfo. Note: When this is
   * true, we send all the words from the beginning of the audio for the top alternative in every
   * consecutive response. This is done in order to improve our speaker tags as our models learn to
   * identify the speakers in the conversation over time.
   * @param enableSpeakerDiarization enableSpeakerDiarization or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig setEnableSpeakerDiarization(java.lang.Boolean enableSpeakerDiarization) {
    this.enableSpeakerDiarization = enableSpeakerDiarization;
    return this;
  }

  /**
   * Optional. If `true`, the top result includes a list of words and the confidence for those
   * words. If `false`, no word-level confidence information is returned. The default is `false`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableWordConfidence() {
    return enableWordConfidence;
  }

  /**
   * Optional. If `true`, the top result includes a list of words and the confidence for those
   * words. If `false`, no word-level confidence information is returned. The default is `false`.
   * @param enableWordConfidence enableWordConfidence or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig setEnableWordConfidence(java.lang.Boolean enableWordConfidence) {
    this.enableWordConfidence = enableWordConfidence;
    return this;
  }

  /**
   * Optional. If set to `true`, the server will attempt to filter out profanities, replacing all
   * but the initial character in each filtered word with asterisks, e.g. "f***". If set to `false`
   * or omitted, profanities won't be filtered out.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFilterProfanity() {
    return filterProfanity;
  }

  /**
   * Optional. If set to `true`, the server will attempt to filter out profanities, replacing all
   * but the initial character in each filtered word with asterisks, e.g. "f***". If set to `false`
   * or omitted, profanities won't be filtered out.
   * @param filterProfanity filterProfanity or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig setFilterProfanity(java.lang.Boolean filterProfanity) {
    this.filterProfanity = filterProfanity;
    return this;
  }

  /**
   * Required. *Required* The language of the supplied audio as a [BCP-47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US". See [Language
   * Support](https://cloud.google.com/speech/docs/languages) for a list of the currently supported
   * language codes.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Required. *Required* The language of the supplied audio as a [BCP-47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US". See [Language
   * Support](https://cloud.google.com/speech/docs/languages) for a list of the currently supported
   * language codes.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Optional. Maximum number of recognition hypotheses to be returned. Specifically, the maximum
   * number of `SpeechRecognitionAlternative` messages within each `SpeechTranscription`. The server
   * may return fewer than `max_alternatives`. Valid values are `0`-`30`. A value of `0` or `1` will
   * return a maximum of one. If omitted, will return a maximum of one.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxAlternatives() {
    return maxAlternatives;
  }

  /**
   * Optional. Maximum number of recognition hypotheses to be returned. Specifically, the maximum
   * number of `SpeechRecognitionAlternative` messages within each `SpeechTranscription`. The server
   * may return fewer than `max_alternatives`. Valid values are `0`-`30`. A value of `0` or `1` will
   * return a maximum of one. If omitted, will return a maximum of one.
   * @param maxAlternatives maxAlternatives or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig setMaxAlternatives(java.lang.Integer maxAlternatives) {
    this.maxAlternatives = maxAlternatives;
    return this;
  }

  /**
   * Optional. A means to provide context to assist the speech recognition.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1beta2SpeechContext> getSpeechContexts() {
    return speechContexts;
  }

  /**
   * Optional. A means to provide context to assist the speech recognition.
   * @param speechContexts speechContexts or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig setSpeechContexts(java.util.List<GoogleCloudVideointelligenceV1beta2SpeechContext> speechContexts) {
    this.speechContexts = speechContexts;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig clone() {
    return (GoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig) super.clone();
  }

}
