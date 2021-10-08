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
 * Configuration for how the filling of a parameter should be handled.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1FormParameterFillBehavior extends com.google.api.client.json.GenericJson {

  /**
   * Required. The fulfillment to provide the initial prompt that the agent can present to the user
   * in order to fill the parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1Fulfillment initialPromptFulfillment;

  /**
   * The handlers for parameter-level events, used to provide reprompt for the parameter or
   * transition to a different page/flow. The supported events are: * `sys.no-match-`, where N can
   * be from 1 to 6 * `sys.no-match-default` * `sys.no-input-`, where N can be from 1 to 6 * `sys
   * .no-input-default` * `sys.invalid-parameter` `initial_prompt_fulfillment` provides the first
   * prompt for the parameter. If the user's response does not fill the parameter, a no-match/no-
   * input event will be triggered, and the fulfillment associated with the `sys.no-match-1`/`sys
   * .no-input-1` handler (if defined) will be called to provide a prompt. The `sys.no-match-2`/`sys
   * .no-input-2` handler (if defined) will respond to the next no-match/no-input event, and so on.
   * A `sys.no-match-default` or `sys.no-input-default` handler will be used to handle all following
   * no-match/no-input events after all numbered no-match/no-input handlers for the parameter are
   * consumed. A `sys.invalid-parameter` handler can be defined to handle the case where the
   * parameter values have been `invalidated` by webhook. For example, if the user's response fill
   * the parameter, however the parameter was invalidated by webhook, the fulfillment associated
   * with the `sys.invalid-parameter` handler (if defined) will be called to provide a prompt. If
   * the event handler for the corresponding event can't be found on the parameter,
   * `initial_prompt_fulfillment` will be re-prompted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3beta1EventHandler> repromptEventHandlers;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowCxV3beta1EventHandler used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowCxV3beta1EventHandler.class);
  }

  /**
   * Required. The fulfillment to provide the initial prompt that the agent can present to the user
   * in order to fill the parameter.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Fulfillment getInitialPromptFulfillment() {
    return initialPromptFulfillment;
  }

  /**
   * Required. The fulfillment to provide the initial prompt that the agent can present to the user
   * in order to fill the parameter.
   * @param initialPromptFulfillment initialPromptFulfillment or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1FormParameterFillBehavior setInitialPromptFulfillment(GoogleCloudDialogflowCxV3beta1Fulfillment initialPromptFulfillment) {
    this.initialPromptFulfillment = initialPromptFulfillment;
    return this;
  }

  /**
   * The handlers for parameter-level events, used to provide reprompt for the parameter or
   * transition to a different page/flow. The supported events are: * `sys.no-match-`, where N can
   * be from 1 to 6 * `sys.no-match-default` * `sys.no-input-`, where N can be from 1 to 6 * `sys
   * .no-input-default` * `sys.invalid-parameter` `initial_prompt_fulfillment` provides the first
   * prompt for the parameter. If the user's response does not fill the parameter, a no-match/no-
   * input event will be triggered, and the fulfillment associated with the `sys.no-match-1`/`sys
   * .no-input-1` handler (if defined) will be called to provide a prompt. The `sys.no-match-2`/`sys
   * .no-input-2` handler (if defined) will respond to the next no-match/no-input event, and so on.
   * A `sys.no-match-default` or `sys.no-input-default` handler will be used to handle all following
   * no-match/no-input events after all numbered no-match/no-input handlers for the parameter are
   * consumed. A `sys.invalid-parameter` handler can be defined to handle the case where the
   * parameter values have been `invalidated` by webhook. For example, if the user's response fill
   * the parameter, however the parameter was invalidated by webhook, the fulfillment associated
   * with the `sys.invalid-parameter` handler (if defined) will be called to provide a prompt. If
   * the event handler for the corresponding event can't be found on the parameter,
   * `initial_prompt_fulfillment` will be re-prompted.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3beta1EventHandler> getRepromptEventHandlers() {
    return repromptEventHandlers;
  }

  /**
   * The handlers for parameter-level events, used to provide reprompt for the parameter or
   * transition to a different page/flow. The supported events are: * `sys.no-match-`, where N can
   * be from 1 to 6 * `sys.no-match-default` * `sys.no-input-`, where N can be from 1 to 6 * `sys
   * .no-input-default` * `sys.invalid-parameter` `initial_prompt_fulfillment` provides the first
   * prompt for the parameter. If the user's response does not fill the parameter, a no-match/no-
   * input event will be triggered, and the fulfillment associated with the `sys.no-match-1`/`sys
   * .no-input-1` handler (if defined) will be called to provide a prompt. The `sys.no-match-2`/`sys
   * .no-input-2` handler (if defined) will respond to the next no-match/no-input event, and so on.
   * A `sys.no-match-default` or `sys.no-input-default` handler will be used to handle all following
   * no-match/no-input events after all numbered no-match/no-input handlers for the parameter are
   * consumed. A `sys.invalid-parameter` handler can be defined to handle the case where the
   * parameter values have been `invalidated` by webhook. For example, if the user's response fill
   * the parameter, however the parameter was invalidated by webhook, the fulfillment associated
   * with the `sys.invalid-parameter` handler (if defined) will be called to provide a prompt. If
   * the event handler for the corresponding event can't be found on the parameter,
   * `initial_prompt_fulfillment` will be re-prompted.
   * @param repromptEventHandlers repromptEventHandlers or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1FormParameterFillBehavior setRepromptEventHandlers(java.util.List<GoogleCloudDialogflowCxV3beta1EventHandler> repromptEventHandlers) {
    this.repromptEventHandlers = repromptEventHandlers;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1FormParameterFillBehavior set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1FormParameterFillBehavior) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1FormParameterFillBehavior clone() {
    return (GoogleCloudDialogflowCxV3beta1FormParameterFillBehavior) super.clone();
  }

}
