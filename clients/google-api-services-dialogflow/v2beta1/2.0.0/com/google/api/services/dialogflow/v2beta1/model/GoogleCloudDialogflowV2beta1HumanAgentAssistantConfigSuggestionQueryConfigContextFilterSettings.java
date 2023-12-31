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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * Settings that determine how to filter recent conversation context when generating suggestions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings extends com.google.api.client.json.GenericJson {

  /**
   * If set to true, the last message from virtual agent (hand off message) and the message before
   * it (trigger message of hand off) are dropped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dropHandoffMessages;

  /**
   * If set to true, all messages from ivr stage are dropped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dropIvrMessages;

  /**
   * If set to true, all messages from virtual agent are dropped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dropVirtualAgentMessages;

  /**
   * If set to true, the last message from virtual agent (hand off message) and the message before
   * it (trigger message of hand off) are dropped.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDropHandoffMessages() {
    return dropHandoffMessages;
  }

  /**
   * If set to true, the last message from virtual agent (hand off message) and the message before
   * it (trigger message of hand off) are dropped.
   * @param dropHandoffMessages dropHandoffMessages or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings setDropHandoffMessages(java.lang.Boolean dropHandoffMessages) {
    this.dropHandoffMessages = dropHandoffMessages;
    return this;
  }

  /**
   * If set to true, all messages from ivr stage are dropped.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDropIvrMessages() {
    return dropIvrMessages;
  }

  /**
   * If set to true, all messages from ivr stage are dropped.
   * @param dropIvrMessages dropIvrMessages or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings setDropIvrMessages(java.lang.Boolean dropIvrMessages) {
    this.dropIvrMessages = dropIvrMessages;
    return this;
  }

  /**
   * If set to true, all messages from virtual agent are dropped.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDropVirtualAgentMessages() {
    return dropVirtualAgentMessages;
  }

  /**
   * If set to true, all messages from virtual agent are dropped.
   * @param dropVirtualAgentMessages dropVirtualAgentMessages or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings setDropVirtualAgentMessages(java.lang.Boolean dropVirtualAgentMessages) {
    this.dropVirtualAgentMessages = dropVirtualAgentMessages;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings clone() {
    return (GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigContextFilterSettings) super.clone();
  }

}
