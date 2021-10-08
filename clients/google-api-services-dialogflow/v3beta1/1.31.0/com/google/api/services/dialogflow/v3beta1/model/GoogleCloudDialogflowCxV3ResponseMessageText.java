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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * The text response message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3ResponseMessageText extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Whether the playback of this message can be interrupted by the end user's speech
   * and the client can then starts the next Dialogflow request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowPlaybackInterruption;

  /**
   * Required. A collection of text responses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> text;

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
  public GoogleCloudDialogflowCxV3ResponseMessageText setAllowPlaybackInterruption(java.lang.Boolean allowPlaybackInterruption) {
    this.allowPlaybackInterruption = allowPlaybackInterruption;
    return this;
  }

  /**
   * Required. A collection of text responses.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getText() {
    return text;
  }

  /**
   * Required. A collection of text responses.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ResponseMessageText setText(java.util.List<java.lang.String> text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3ResponseMessageText set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3ResponseMessageText) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3ResponseMessageText clone() {
    return (GoogleCloudDialogflowCxV3ResponseMessageText) super.clone();
  }

}
