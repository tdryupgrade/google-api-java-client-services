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
 * A transition coverage in a transition route group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition extends com.google.api.client.json.GenericJson {

  /**
   * Whether or not the transition route is covered by at least one of the agent's test cases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean covered;

  /**
   * Intent route or condition route.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1TransitionRoute transitionRoute;

  /**
   * Whether or not the transition route is covered by at least one of the agent's test cases.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCovered() {
    return covered;
  }

  /**
   * Whether or not the transition route is covered by at least one of the agent's test cases.
   * @param covered covered or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition setCovered(java.lang.Boolean covered) {
    this.covered = covered;
    return this;
  }

  /**
   * Intent route or condition route.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionRoute getTransitionRoute() {
    return transitionRoute;
  }

  /**
   * Intent route or condition route.
   * @param transitionRoute transitionRoute or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition setTransitionRoute(GoogleCloudDialogflowCxV3beta1TransitionRoute transitionRoute) {
    this.transitionRoute = transitionRoute;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition clone() {
    return (GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition) super.clone();
  }

}
