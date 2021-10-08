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
 * Represents one segment of audio.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Whether the playback of this segment can be interrupted by the end user's speech
   * and the client should then start the next Dialogflow request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowPlaybackInterruption;

  /**
   * Raw audio synthesized from the Dialogflow agent's response using the output config specified in
   * the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audio;

  /**
   * Client-specific URI that points to an audio clip accessible to the client. Dialogflow does not
   * impose any validation on it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Output only. Whether the playback of this segment can be interrupted by the end user's speech
   * and the client should then start the next Dialogflow request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowPlaybackInterruption() {
    return allowPlaybackInterruption;
  }

  /**
   * Output only. Whether the playback of this segment can be interrupted by the end user's speech
   * and the client should then start the next Dialogflow request.
   * @param allowPlaybackInterruption allowPlaybackInterruption or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment setAllowPlaybackInterruption(java.lang.Boolean allowPlaybackInterruption) {
    this.allowPlaybackInterruption = allowPlaybackInterruption;
    return this;
  }

  /**
   * Raw audio synthesized from the Dialogflow agent's response using the output config specified in
   * the request.
   * @see #decodeAudio()
   * @return value or {@code null} for none
   */
  public java.lang.String getAudio() {
    return audio;
  }

  /**
   * Raw audio synthesized from the Dialogflow agent's response using the output config specified in
   * the request.
   * @see #getAudio()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeAudio() {
    return com.google.api.client.util.Base64.decodeBase64(audio);
  }

  /**
   * Raw audio synthesized from the Dialogflow agent's response using the output config specified in
   * the request.
   * @see #encodeAudio()
   * @param audio audio or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment setAudio(java.lang.String audio) {
    this.audio = audio;
    return this;
  }

  /**
   * Raw audio synthesized from the Dialogflow agent's response using the output config specified in
   * the request.
   * @see #setAudio()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment encodeAudio(byte[] audio) {
    this.audio = com.google.api.client.util.Base64.encodeBase64URLSafeString(audio);
    return this;
  }

  /**
   * Client-specific URI that points to an audio clip accessible to the client. Dialogflow does not
   * impose any validation on it.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Client-specific URI that points to an audio clip accessible to the client. Dialogflow does not
   * impose any validation on it.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment clone() {
    return (GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment) super.clone();
  }

}
