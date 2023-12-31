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
 * A transition in a page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3TransitionCoverageTransition extends com.google.api.client.json.GenericJson {

  /**
   * Whether the transition is covered by at least one of the agent's test cases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean covered;

  /**
   * Event handler.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3EventHandler eventHandler;

  /**
   * The index of a transition in the transition list. Starting from 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer index;

  /**
   * The start node of a transition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3TransitionCoverageTransitionNode source;

  /**
   * The end node of a transition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3TransitionCoverageTransitionNode target;

  /**
   * Intent route or condition route.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3TransitionRoute transitionRoute;

  /**
   * Whether the transition is covered by at least one of the agent's test cases.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCovered() {
    return covered;
  }

  /**
   * Whether the transition is covered by at least one of the agent's test cases.
   * @param covered covered or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TransitionCoverageTransition setCovered(java.lang.Boolean covered) {
    this.covered = covered;
    return this;
  }

  /**
   * Event handler.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3EventHandler getEventHandler() {
    return eventHandler;
  }

  /**
   * Event handler.
   * @param eventHandler eventHandler or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TransitionCoverageTransition setEventHandler(GoogleCloudDialogflowCxV3EventHandler eventHandler) {
    this.eventHandler = eventHandler;
    return this;
  }

  /**
   * The index of a transition in the transition list. Starting from 0.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * The index of a transition in the transition list. Starting from 0.
   * @param index index or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TransitionCoverageTransition setIndex(java.lang.Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The start node of a transition.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TransitionCoverageTransitionNode getSource() {
    return source;
  }

  /**
   * The start node of a transition.
   * @param source source or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TransitionCoverageTransition setSource(GoogleCloudDialogflowCxV3TransitionCoverageTransitionNode source) {
    this.source = source;
    return this;
  }

  /**
   * The end node of a transition.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TransitionCoverageTransitionNode getTarget() {
    return target;
  }

  /**
   * The end node of a transition.
   * @param target target or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TransitionCoverageTransition setTarget(GoogleCloudDialogflowCxV3TransitionCoverageTransitionNode target) {
    this.target = target;
    return this;
  }

  /**
   * Intent route or condition route.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TransitionRoute getTransitionRoute() {
    return transitionRoute;
  }

  /**
   * Intent route or condition route.
   * @param transitionRoute transitionRoute or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TransitionCoverageTransition setTransitionRoute(GoogleCloudDialogflowCxV3TransitionRoute transitionRoute) {
    this.transitionRoute = transitionRoute;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3TransitionCoverageTransition set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3TransitionCoverageTransition) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3TransitionCoverageTransition clone() {
    return (GoogleCloudDialogflowCxV3TransitionCoverageTransition) super.clone();
  }

}
