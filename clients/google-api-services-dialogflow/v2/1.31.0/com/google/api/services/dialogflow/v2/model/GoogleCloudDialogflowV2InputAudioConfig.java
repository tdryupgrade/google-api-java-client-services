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

package com.google.api.services.dialogflow.v2.model;

/**
 * Instructs the speech recognizer how to process the audio content.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2InputAudioConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Audio encoding of the audio content to process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audioEncoding;

  /**
   * Only used in Participants.AnalyzeContent and Participants.StreamingAnalyzeContent. If `false`
   * and recognition doesn't return any result, trigger `NO_SPEECH_RECOGNIZED` event to Dialogflow
   * agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableNoSpeechRecognizedEvent;

  /**
   * If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with information
   * about the recognized speech words, e.g. start and end time offsets. If false or unspecified,
   * Speech doesn't return any word-level information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableWordInfo;

  /**
   * Required. The language of the supplied audio. Dialogflow does not do translations. See
   * [Language Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of
   * the currently supported language codes. Note that queries in the same session do not
   * necessarily need to specify the same language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Which Speech model to select for the given request. Select the model best suited to your domain
   * to get best results. If a model is not explicitly specified, then we auto-select a model based
   * on the parameters in the InputAudioConfig. If enhanced speech model is enabled for the agent
   * and an enhanced version of the specified model for the language does not exist, then the speech
   * is recognized using the standard version of the specified model. Refer to [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for more
   * details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * Which variant of the Speech model to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelVariant;

  /**
   * A list of strings containing words and phrases that the speech recognizer should recognize with
   * higher likelihood. See [the Cloud Speech documentation](https://cloud.google.com/speech-to-
   * text/docs/basics#phrase-hints) for more details. This field is deprecated. Please use
   * [speech_contexts]() instead. If you specify both [phrase_hints]() and [speech_contexts](),
   * Dialogflow will treat the [phrase_hints]() as a single additional [SpeechContext]().
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> phraseHints;

  /**
   * Required. Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech
   * API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sampleRateHertz;

  /**
   * If `false` (default), recognition does not cease until the client closes the stream. If `true`,
   * the recognizer will detect a single spoken utterance in input audio. Recognition ceases when it
   * detects the audio's voice has stopped or paused. In this case, once a detected intent is
   * received, the client should close the stream and start a new request with a new stream as
   * needed. Note: This setting is relevant only for streaming methods. Note: When specified,
   * InputAudioConfig.single_utterance takes precedence over
   * StreamingDetectIntentRequest.single_utterance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean singleUtterance;

  /**
   * Context information to assist speech recognition. See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more
   * details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2SpeechContext> speechContexts;

  /**
   * Required. Audio encoding of the audio content to process.
   * @return value or {@code null} for none
   */
  public java.lang.String getAudioEncoding() {
    return audioEncoding;
  }

  /**
   * Required. Audio encoding of the audio content to process.
   * @param audioEncoding audioEncoding or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setAudioEncoding(java.lang.String audioEncoding) {
    this.audioEncoding = audioEncoding;
    return this;
  }

  /**
   * Only used in Participants.AnalyzeContent and Participants.StreamingAnalyzeContent. If `false`
   * and recognition doesn't return any result, trigger `NO_SPEECH_RECOGNIZED` event to Dialogflow
   * agent.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableNoSpeechRecognizedEvent() {
    return disableNoSpeechRecognizedEvent;
  }

  /**
   * Only used in Participants.AnalyzeContent and Participants.StreamingAnalyzeContent. If `false`
   * and recognition doesn't return any result, trigger `NO_SPEECH_RECOGNIZED` event to Dialogflow
   * agent.
   * @param disableNoSpeechRecognizedEvent disableNoSpeechRecognizedEvent or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setDisableNoSpeechRecognizedEvent(java.lang.Boolean disableNoSpeechRecognizedEvent) {
    this.disableNoSpeechRecognizedEvent = disableNoSpeechRecognizedEvent;
    return this;
  }

  /**
   * If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with information
   * about the recognized speech words, e.g. start and end time offsets. If false or unspecified,
   * Speech doesn't return any word-level information.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableWordInfo() {
    return enableWordInfo;
  }

  /**
   * If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with information
   * about the recognized speech words, e.g. start and end time offsets. If false or unspecified,
   * Speech doesn't return any word-level information.
   * @param enableWordInfo enableWordInfo or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setEnableWordInfo(java.lang.Boolean enableWordInfo) {
    this.enableWordInfo = enableWordInfo;
    return this;
  }

  /**
   * Required. The language of the supplied audio. Dialogflow does not do translations. See
   * [Language Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of
   * the currently supported language codes. Note that queries in the same session do not
   * necessarily need to specify the same language.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Required. The language of the supplied audio. Dialogflow does not do translations. See
   * [Language Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of
   * the currently supported language codes. Note that queries in the same session do not
   * necessarily need to specify the same language.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Which Speech model to select for the given request. Select the model best suited to your domain
   * to get best results. If a model is not explicitly specified, then we auto-select a model based
   * on the parameters in the InputAudioConfig. If enhanced speech model is enabled for the agent
   * and an enhanced version of the specified model for the language does not exist, then the speech
   * is recognized using the standard version of the specified model. Refer to [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for more
   * details.
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * Which Speech model to select for the given request. Select the model best suited to your domain
   * to get best results. If a model is not explicitly specified, then we auto-select a model based
   * on the parameters in the InputAudioConfig. If enhanced speech model is enabled for the agent
   * and an enhanced version of the specified model for the language does not exist, then the speech
   * is recognized using the standard version of the specified model. Refer to [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for more
   * details.
   * @param model model or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  /**
   * Which variant of the Speech model to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelVariant() {
    return modelVariant;
  }

  /**
   * Which variant of the Speech model to use.
   * @param modelVariant modelVariant or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setModelVariant(java.lang.String modelVariant) {
    this.modelVariant = modelVariant;
    return this;
  }

  /**
   * A list of strings containing words and phrases that the speech recognizer should recognize with
   * higher likelihood. See [the Cloud Speech documentation](https://cloud.google.com/speech-to-
   * text/docs/basics#phrase-hints) for more details. This field is deprecated. Please use
   * [speech_contexts]() instead. If you specify both [phrase_hints]() and [speech_contexts](),
   * Dialogflow will treat the [phrase_hints]() as a single additional [SpeechContext]().
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPhraseHints() {
    return phraseHints;
  }

  /**
   * A list of strings containing words and phrases that the speech recognizer should recognize with
   * higher likelihood. See [the Cloud Speech documentation](https://cloud.google.com/speech-to-
   * text/docs/basics#phrase-hints) for more details. This field is deprecated. Please use
   * [speech_contexts]() instead. If you specify both [phrase_hints]() and [speech_contexts](),
   * Dialogflow will treat the [phrase_hints]() as a single additional [SpeechContext]().
   * @param phraseHints phraseHints or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setPhraseHints(java.util.List<java.lang.String> phraseHints) {
    this.phraseHints = phraseHints;
    return this;
  }

  /**
   * Required. Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech
   * API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSampleRateHertz() {
    return sampleRateHertz;
  }

  /**
   * Required. Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech
   * API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
   * @param sampleRateHertz sampleRateHertz or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setSampleRateHertz(java.lang.Integer sampleRateHertz) {
    this.sampleRateHertz = sampleRateHertz;
    return this;
  }

  /**
   * If `false` (default), recognition does not cease until the client closes the stream. If `true`,
   * the recognizer will detect a single spoken utterance in input audio. Recognition ceases when it
   * detects the audio's voice has stopped or paused. In this case, once a detected intent is
   * received, the client should close the stream and start a new request with a new stream as
   * needed. Note: This setting is relevant only for streaming methods. Note: When specified,
   * InputAudioConfig.single_utterance takes precedence over
   * StreamingDetectIntentRequest.single_utterance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSingleUtterance() {
    return singleUtterance;
  }

  /**
   * If `false` (default), recognition does not cease until the client closes the stream. If `true`,
   * the recognizer will detect a single spoken utterance in input audio. Recognition ceases when it
   * detects the audio's voice has stopped or paused. In this case, once a detected intent is
   * received, the client should close the stream and start a new request with a new stream as
   * needed. Note: This setting is relevant only for streaming methods. Note: When specified,
   * InputAudioConfig.single_utterance takes precedence over
   * StreamingDetectIntentRequest.single_utterance.
   * @param singleUtterance singleUtterance or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setSingleUtterance(java.lang.Boolean singleUtterance) {
    this.singleUtterance = singleUtterance;
    return this;
  }

  /**
   * Context information to assist speech recognition. See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more
   * details.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2SpeechContext> getSpeechContexts() {
    return speechContexts;
  }

  /**
   * Context information to assist speech recognition. See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more
   * details.
   * @param speechContexts speechContexts or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setSpeechContexts(java.util.List<GoogleCloudDialogflowV2SpeechContext> speechContexts) {
    this.speechContexts = speechContexts;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2InputAudioConfig set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2InputAudioConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2InputAudioConfig clone() {
    return (GoogleCloudDialogflowV2InputAudioConfig) super.clone();
  }

}
