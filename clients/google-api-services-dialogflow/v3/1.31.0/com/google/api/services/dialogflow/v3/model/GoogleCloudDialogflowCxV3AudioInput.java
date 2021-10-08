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

package com.google.api.services.dialogflow.v3.model;

/**
 * Represents the natural speech audio to be processed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3AudioInput extends com.google.api.client.json.GenericJson {

  /**
   * The natural language speech audio to be processed. A single request can contain up to 1 minute
   * of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-
   * streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio
   * detect intent, `config` must be provided in the first request and `audio` must be provided in
   * all following requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audio;

  /**
   * Required. Instructs the speech recognizer how to process the speech audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3InputAudioConfig config;

  /**
   * The natural language speech audio to be processed. A single request can contain up to 1 minute
   * of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-
   * streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio
   * detect intent, `config` must be provided in the first request and `audio` must be provided in
   * all following requests.
   * @see #decodeAudio()
   * @return value or {@code null} for none
   */
  public java.lang.String getAudio() {
    return audio;
  }

  /**
   * The natural language speech audio to be processed. A single request can contain up to 1 minute
   * of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-
   * streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio
   * detect intent, `config` must be provided in the first request and `audio` must be provided in
   * all following requests.
   * @see #getAudio()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeAudio() {
    return com.google.api.client.util.Base64.decodeBase64(audio);
  }

  /**
   * The natural language speech audio to be processed. A single request can contain up to 1 minute
   * of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-
   * streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio
   * detect intent, `config` must be provided in the first request and `audio` must be provided in
   * all following requests.
   * @see #encodeAudio()
   * @param audio audio or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AudioInput setAudio(java.lang.String audio) {
    this.audio = audio;
    return this;
  }

  /**
   * The natural language speech audio to be processed. A single request can contain up to 1 minute
   * of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-
   * streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio
   * detect intent, `config` must be provided in the first request and `audio` must be provided in
   * all following requests.
   * @see #setAudio()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDialogflowCxV3AudioInput encodeAudio(byte[] audio) {
    this.audio = com.google.api.client.util.Base64.encodeBase64URLSafeString(audio);
    return this;
  }

  /**
   * Required. Instructs the speech recognizer how to process the speech audio.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3InputAudioConfig getConfig() {
    return config;
  }

  /**
   * Required. Instructs the speech recognizer how to process the speech audio.
   * @param config config or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AudioInput setConfig(GoogleCloudDialogflowCxV3InputAudioConfig config) {
    this.config = config;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3AudioInput set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3AudioInput) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3AudioInput clone() {
    return (GoogleCloudDialogflowCxV3AudioInput) super.clone();
  }

}
