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
 * The response message for Agents.ExportAgent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3ExportAgentResponse extends com.google.api.client.json.GenericJson {

  /**
   * Uncompressed raw byte content for agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentContent;

  /**
   * The URI to a file containing the exported agent. This field is populated only if `agent_uri` is
   * specified in ExportAgentRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentUri;

  /**
   * Uncompressed raw byte content for agent.
   * @see #decodeAgentContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentContent() {
    return agentContent;
  }

  /**
   * Uncompressed raw byte content for agent.
   * @see #getAgentContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeAgentContent() {
    return com.google.api.client.util.Base64.decodeBase64(agentContent);
  }

  /**
   * Uncompressed raw byte content for agent.
   * @see #encodeAgentContent()
   * @param agentContent agentContent or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ExportAgentResponse setAgentContent(java.lang.String agentContent) {
    this.agentContent = agentContent;
    return this;
  }

  /**
   * Uncompressed raw byte content for agent.
   * @see #setAgentContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDialogflowCxV3ExportAgentResponse encodeAgentContent(byte[] agentContent) {
    this.agentContent = com.google.api.client.util.Base64.encodeBase64URLSafeString(agentContent);
    return this;
  }

  /**
   * The URI to a file containing the exported agent. This field is populated only if `agent_uri` is
   * specified in ExportAgentRequest.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentUri() {
    return agentUri;
  }

  /**
   * The URI to a file containing the exported agent. This field is populated only if `agent_uri` is
   * specified in ExportAgentRequest.
   * @param agentUri agentUri or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3ExportAgentResponse setAgentUri(java.lang.String agentUri) {
    this.agentUri = agentUri;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3ExportAgentResponse set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3ExportAgentResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3ExportAgentResponse clone() {
    return (GoogleCloudDialogflowCxV3ExportAgentResponse) super.clone();
  }

}
