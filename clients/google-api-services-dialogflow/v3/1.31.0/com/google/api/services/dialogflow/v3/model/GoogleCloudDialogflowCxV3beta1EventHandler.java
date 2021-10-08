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
 * An event handler specifies an event that can be handled during a session. When the specified
 * event happens, the following actions are taken in order: * If there is a `trigger_fulfillment`
 * associated with the event, it will be called. * If there is a `target_page` associated with the
 * event, the session will transition into the specified page. * If there is a `target_flow`
 * associated with the event, the session will transition into the specified flow.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1EventHandler extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of the event to handle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String event;

  /**
   * Output only. The unique identifier of this event handler.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The target flow to transition to. Format: `projects//locations//agents//flows/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetFlow;

  /**
   * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetPage;

  /**
   * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment
   * enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a
   * handler handling webhooks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1Fulfillment triggerFulfillment;

  /**
   * Required. The name of the event to handle.
   * @return value or {@code null} for none
   */
  public java.lang.String getEvent() {
    return event;
  }

  /**
   * Required. The name of the event to handle.
   * @param event event or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1EventHandler setEvent(java.lang.String event) {
    this.event = event;
    return this;
  }

  /**
   * Output only. The unique identifier of this event handler.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The unique identifier of this event handler.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1EventHandler setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The target flow to transition to. Format: `projects//locations//agents//flows/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetFlow() {
    return targetFlow;
  }

  /**
   * The target flow to transition to. Format: `projects//locations//agents//flows/`.
   * @param targetFlow targetFlow or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1EventHandler setTargetFlow(java.lang.String targetFlow) {
    this.targetFlow = targetFlow;
    return this;
  }

  /**
   * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetPage() {
    return targetPage;
  }

  /**
   * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
   * @param targetPage targetPage or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1EventHandler setTargetPage(java.lang.String targetPage) {
    this.targetPage = targetPage;
    return this;
  }

  /**
   * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment
   * enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a
   * handler handling webhooks.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Fulfillment getTriggerFulfillment() {
    return triggerFulfillment;
  }

  /**
   * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment
   * enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a
   * handler handling webhooks.
   * @param triggerFulfillment triggerFulfillment or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1EventHandler setTriggerFulfillment(GoogleCloudDialogflowCxV3beta1Fulfillment triggerFulfillment) {
    this.triggerFulfillment = triggerFulfillment;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1EventHandler set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1EventHandler) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1EventHandler clone() {
    return (GoogleCloudDialogflowCxV3beta1EventHandler) super.clone();
  }

}
