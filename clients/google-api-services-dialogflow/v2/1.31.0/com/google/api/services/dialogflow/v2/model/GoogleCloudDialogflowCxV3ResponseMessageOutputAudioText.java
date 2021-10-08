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
 * A text or ssml response that is preferentially used for TTS output audio synthesis, as described
 * in the comment on the ResponseMessage message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Whether the playback of this message can be interrupted by the end user's speech
   * and the client can then starts the next Dialogflow request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowPlaybackInterruption;

  /**
   * The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-
   * speech/docs/ssml).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ssml;

  /**
   * The raw text to be synthesized.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Output only. Whether the playback of this message can be interrupted by the end user's speech
   * and the client can then starts the next Dialogflow request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowPlaybackInterruption() {
    return allowPlaybackInterruption;
  }

  /**
   * Output only. Whether the playback of this message can be interrupted by the end user's speech
   * and the client can then starts the next Dialogflow request.
   * @param allowPlaybackInterruption allowPlaybackInterruption or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText setAllowPlaybackInterruption(java.lang.Boolean allowPlaybackInterruption) {
    this.allowPlaybackInterruption = allowPlaybackInterruption;
    return this;
  }

  /**
   * The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-
   * speech/docs/ssml).
   * @return value or {@code null} for none
   */
  public java.lang.String getSsml() {
    return ssml;
  }

  /**
   * The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-
   * speech/docs/ssml).
   * @param ssml ssml or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText setSsml(java.lang.String ssml) {
    this.ssml = ssml;
    return this;
  }

  /**
   * The raw text to be synthesized.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * The raw text to be synthesized.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText clone() {
    return (GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText) super.clone();
  }

}
