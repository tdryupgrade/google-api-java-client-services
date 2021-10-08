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
 * One interaction between a human and virtual agent. The human provides some input and the virtual
 * agent provides a response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3ConversationTurn extends com.google.api.client.json.GenericJson {

  /**
   * The user input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3ConversationTurnUserInput userInput;

  /**
   * The virtual agent output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput virtualAgentOutput;

  /**
   * The user input.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurnUserInput getUserInput() {
    return userInput;
  }

  /**
   * The user input.
   * @param userInput userInput or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurn setUserInput(GoogleCloudDialogflowCxV3ConversationTurnUserInput userInput) {
    this.userInput = userInput;
    return this;
  }

  /**
   * The virtual agent output.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput getVirtualAgentOutput() {
    return virtualAgentOutput;
  }

  /**
   * The virtual agent output.
   * @param virtualAgentOutput virtualAgentOutput or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ConversationTurn setVirtualAgentOutput(GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput virtualAgentOutput) {
    this.virtualAgentOutput = virtualAgentOutput;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3ConversationTurn set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3ConversationTurn) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3ConversationTurn clone() {
    return (GoogleCloudDialogflowCxV3ConversationTurn) super.clone();
  }

}
