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
 * Request of FulfillIntent
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3FulfillIntentRequest extends com.google.api.client.json.GenericJson {

  /**
   * The matched intent/event to fulfill.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3Match match;

  /**
   * Must be same as the corresponding MatchIntent request, otherwise the behavior is undefined.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3MatchIntentRequest matchIntentRequest;

  /**
   * Instructs the speech synthesizer how to generate output audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3OutputAudioConfig outputAudioConfig;

  /**
   * The matched intent/event to fulfill.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Match getMatch() {
    return match;
  }

  /**
   * The matched intent/event to fulfill.
   * @param match match or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3FulfillIntentRequest setMatch(GoogleCloudDialogflowCxV3Match match) {
    this.match = match;
    return this;
  }

  /**
   * Must be same as the corresponding MatchIntent request, otherwise the behavior is undefined.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3MatchIntentRequest getMatchIntentRequest() {
    return matchIntentRequest;
  }

  /**
   * Must be same as the corresponding MatchIntent request, otherwise the behavior is undefined.
   * @param matchIntentRequest matchIntentRequest or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3FulfillIntentRequest setMatchIntentRequest(GoogleCloudDialogflowCxV3MatchIntentRequest matchIntentRequest) {
    this.matchIntentRequest = matchIntentRequest;
    return this;
  }

  /**
   * Instructs the speech synthesizer how to generate output audio.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3OutputAudioConfig getOutputAudioConfig() {
    return outputAudioConfig;
  }

  /**
   * Instructs the speech synthesizer how to generate output audio.
   * @param outputAudioConfig outputAudioConfig or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3FulfillIntentRequest setOutputAudioConfig(GoogleCloudDialogflowCxV3OutputAudioConfig outputAudioConfig) {
    this.outputAudioConfig = outputAudioConfig;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3FulfillIntentRequest set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3FulfillIntentRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3FulfillIntentRequest clone() {
    return (GoogleCloudDialogflowCxV3FulfillIntentRequest) super.clone();
  }

}
