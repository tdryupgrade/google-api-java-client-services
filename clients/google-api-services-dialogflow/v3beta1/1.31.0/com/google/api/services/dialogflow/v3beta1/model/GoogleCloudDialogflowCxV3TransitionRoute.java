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
 * A transition route specifies a intent that can be matched and/or a data condition that can be
 * evaluated during a session. When a specified transition is matched, the following actions are
 * taken in order: * If there is a `trigger_fulfillment` associated with the transition, it will be
 * called. * If there is a `target_page` associated with the transition, the session will transition
 * into the specified page. * If there is a `target_flow` associated with the transition, the
 * session will transition into the specified flow.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3TransitionRoute extends com.google.api.client.json.GenericJson {

  /**
   * The condition to evaluate against form parameters or session parameters. See the [conditions
   * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least one of
   * `intent` or `condition` must be specified. When both `intent` and `condition` are specified,
   * the transition can only happen when both are fulfilled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String condition;

  /**
   * The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates
   * that the transition can only happen when the given intent is matched. At least one of `intent`
   * or `condition` must be specified. When both `intent` and `condition` are specified, the
   * transition can only happen when both are fulfilled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String intent;

  /**
   * Output only. The unique identifier of this transition route.
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
   * The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment`
   * and `target` must be specified. When both are defined, `trigger_fulfillment` is executed first.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3Fulfillment triggerFulfillment;

  /**
   * The condition to evaluate against form parameters or session parameters. See the [conditions
   * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least one of
   * `intent` or `condition` must be specified. When both `intent` and `condition` are specified,
   * the transition can only happen when both are fulfilled.
   * @return value or {@code null} for none
   */
  public java.lang.String getCondition() {
    return condition;
  }

  /**
   * The condition to evaluate against form parameters or session parameters. See the [conditions
   * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least one of
   * `intent` or `condition` must be specified. When both `intent` and `condition` are specified,
   * the transition can only happen when both are fulfilled.
   * @param condition condition or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TransitionRoute setCondition(java.lang.String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates
   * that the transition can only happen when the given intent is matched. At least one of `intent`
   * or `condition` must be specified. When both `intent` and `condition` are specified, the
   * transition can only happen when both are fulfilled.
   * @return value or {@code null} for none
   */
  public java.lang.String getIntent() {
    return intent;
  }

  /**
   * The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates
   * that the transition can only happen when the given intent is matched. At least one of `intent`
   * or `condition` must be specified. When both `intent` and `condition` are specified, the
   * transition can only happen when both are fulfilled.
   * @param intent intent or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TransitionRoute setIntent(java.lang.String intent) {
    this.intent = intent;
    return this;
  }

  /**
   * Output only. The unique identifier of this transition route.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The unique identifier of this transition route.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TransitionRoute setName(java.lang.String name) {
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
  public GoogleCloudDialogflowCxV3TransitionRoute setTargetFlow(java.lang.String targetFlow) {
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
  public GoogleCloudDialogflowCxV3TransitionRoute setTargetPage(java.lang.String targetPage) {
    this.targetPage = targetPage;
    return this;
  }

  /**
   * The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment`
   * and `target` must be specified. When both are defined, `trigger_fulfillment` is executed first.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Fulfillment getTriggerFulfillment() {
    return triggerFulfillment;
  }

  /**
   * The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment`
   * and `target` must be specified. When both are defined, `trigger_fulfillment` is executed first.
   * @param triggerFulfillment triggerFulfillment or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TransitionRoute setTriggerFulfillment(GoogleCloudDialogflowCxV3Fulfillment triggerFulfillment) {
    this.triggerFulfillment = triggerFulfillment;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3TransitionRoute set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3TransitionRoute) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3TransitionRoute clone() {
    return (GoogleCloudDialogflowCxV3TransitionRoute) super.clone();
  }

}
