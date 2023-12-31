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
 * The suggestion chip message that allows the user to jump out to the app or website associated
 * with this agent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of the app or site this chip is linking to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationName;

  /**
   * Required. The URI of the app or site to open when the user taps the suggestion chip.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Required. The name of the app or site this chip is linking to.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationName() {
    return destinationName;
  }

  /**
   * Required. The name of the app or site this chip is linking to.
   * @param destinationName destinationName or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion setDestinationName(java.lang.String destinationName) {
    this.destinationName = destinationName;
    return this;
  }

  /**
   * Required. The URI of the app or site to open when the user taps the suggestion chip.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Required. The URI of the app or site to open when the user taps the suggestion chip.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion clone() {
    return (GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion) super.clone();
  }

}
