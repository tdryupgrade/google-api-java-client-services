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
 * Represents an audio message that is composed of both segments synthesized from the Dialogflow
 * agent prompts and ones hosted externally at the specified URIs. The external URIs are specified
 * via play_audio. This message is generated by Dialogflow only and not supposed to be defined by
 * the user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio extends com.google.api.client.json.GenericJson {

  /**
   * Segments this audio response is composed of.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment> segments;

  /**
   * Segments this audio response is composed of.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment> getSegments() {
    return segments;
  }

  /**
   * Segments this audio response is composed of.
   * @param segments segments or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio setSegments(java.util.List<GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment> segments) {
    this.segments = segments;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio clone() {
    return (GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudio) super.clone();
  }

}
