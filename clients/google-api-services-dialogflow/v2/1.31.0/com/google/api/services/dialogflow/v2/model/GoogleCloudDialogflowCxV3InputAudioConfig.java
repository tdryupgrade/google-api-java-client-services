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
 * Instructs the speech recognizer on how to process the audio content.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3InputAudioConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Audio encoding of the audio content to process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audioEncoding;

  /**
   * Optional. If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with
   * information about the recognized speech words, e.g. start and end time offsets. If false or
   * unspecified, Speech doesn't return any word-level information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableWordInfo;

  /**
   * Optional. Which Speech model to select for the given request. Select the model best suited to
   * your domain to get best results. If a model is not explicitly specified, then we auto-select a
   * model based on the parameters in the InputAudioConfig. If enhanced speech model is enabled for
   * the agent and an enhanced version of the specified model for the language does not exist, then
   * the speech is recognized using the standard version of the specified model. Refer to [Cloud
   * Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for
   * more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * Optional. Which variant of the Speech model to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelVariant;

  /**
   * Optional. A list of strings containing words and phrases that the speech recognizer should
   * recognize with higher likelihood. See [the Cloud Speech documentation](https://cloud.google.com
   * /speech-to-text/docs/basics#phrase-hints) for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> phraseHints;

  /**
   * Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sampleRateHertz;

  /**
   * Optional. If `false` (default), recognition does not cease until the client closes the stream.
   * If `true`, the recognizer will detect a single spoken utterance in input audio. Recognition
   * ceases when it detects the audio's voice has stopped or paused. In this case, once a detected
   * intent is received, the client should close the stream and start a new request with a new
   * stream as needed. Note: This setting is relevant only for streaming methods.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean singleUtterance;

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
  public GoogleCloudDialogflowCxV3InputAudioConfig setAudioEncoding(java.lang.String audioEncoding) {
    this.audioEncoding = audioEncoding;
    return this;
  }

  /**
   * Optional. If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with
   * information about the recognized speech words, e.g. start and end time offsets. If false or
   * unspecified, Speech doesn't return any word-level information.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableWordInfo() {
    return enableWordInfo;
  }

  /**
   * Optional. If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with
   * information about the recognized speech words, e.g. start and end time offsets. If false or
   * unspecified, Speech doesn't return any word-level information.
   * @param enableWordInfo enableWordInfo or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3InputAudioConfig setEnableWordInfo(java.lang.Boolean enableWordInfo) {
    this.enableWordInfo = enableWordInfo;
    return this;
  }

  /**
   * Optional. Which Speech model to select for the given request. Select the model best suited to
   * your domain to get best results. If a model is not explicitly specified, then we auto-select a
   * model based on the parameters in the InputAudioConfig. If enhanced speech model is enabled for
   * the agent and an enhanced version of the specified model for the language does not exist, then
   * the speech is recognized using the standard version of the specified model. Refer to [Cloud
   * Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for
   * more details.
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * Optional. Which Speech model to select for the given request. Select the model best suited to
   * your domain to get best results. If a model is not explicitly specified, then we auto-select a
   * model based on the parameters in the InputAudioConfig. If enhanced speech model is enabled for
   * the agent and an enhanced version of the specified model for the language does not exist, then
   * the speech is recognized using the standard version of the specified model. Refer to [Cloud
   * Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for
   * more details.
   * @param model model or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3InputAudioConfig setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  /**
   * Optional. Which variant of the Speech model to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelVariant() {
    return modelVariant;
  }

  /**
   * Optional. Which variant of the Speech model to use.
   * @param modelVariant modelVariant or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3InputAudioConfig setModelVariant(java.lang.String modelVariant) {
    this.modelVariant = modelVariant;
    return this;
  }

  /**
   * Optional. A list of strings containing words and phrases that the speech recognizer should
   * recognize with higher likelihood. See [the Cloud Speech documentation](https://cloud.google.com
   * /speech-to-text/docs/basics#phrase-hints) for more details.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPhraseHints() {
    return phraseHints;
  }

  /**
   * Optional. A list of strings containing words and phrases that the speech recognizer should
   * recognize with higher likelihood. See [the Cloud Speech documentation](https://cloud.google.com
   * /speech-to-text/docs/basics#phrase-hints) for more details.
   * @param phraseHints phraseHints or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3InputAudioConfig setPhraseHints(java.util.List<java.lang.String> phraseHints) {
    this.phraseHints = phraseHints;
    return this;
  }

  /**
   * Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSampleRateHertz() {
    return sampleRateHertz;
  }

  /**
   * Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
   * @param sampleRateHertz sampleRateHertz or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3InputAudioConfig setSampleRateHertz(java.lang.Integer sampleRateHertz) {
    this.sampleRateHertz = sampleRateHertz;
    return this;
  }

  /**
   * Optional. If `false` (default), recognition does not cease until the client closes the stream.
   * If `true`, the recognizer will detect a single spoken utterance in input audio. Recognition
   * ceases when it detects the audio's voice has stopped or paused. In this case, once a detected
   * intent is received, the client should close the stream and start a new request with a new
   * stream as needed. Note: This setting is relevant only for streaming methods.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSingleUtterance() {
    return singleUtterance;
  }

  /**
   * Optional. If `false` (default), recognition does not cease until the client closes the stream.
   * If `true`, the recognizer will detect a single spoken utterance in input audio. Recognition
   * ceases when it detects the audio's voice has stopped or paused. In this case, once a detected
   * intent is received, the client should close the stream and start a new request with a new
   * stream as needed. Note: This setting is relevant only for streaming methods.
   * @param singleUtterance singleUtterance or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3InputAudioConfig setSingleUtterance(java.lang.Boolean singleUtterance) {
    this.singleUtterance = singleUtterance;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3InputAudioConfig set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3InputAudioConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3InputAudioConfig clone() {
    return (GoogleCloudDialogflowCxV3InputAudioConfig) super.clone();
  }

}
