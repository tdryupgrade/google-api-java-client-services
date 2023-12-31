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
 * The response message for TestCases.CalculateCoverage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1CalculateCoverageResponse extends com.google.api.client.json.GenericJson {

  /**
   * The agent to calculate coverage for. Format: `projects//locations//agents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agent;

  /**
   * Intent coverage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1IntentCoverage intentCoverage;

  /**
   * Transition route group coverage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverage routeGroupCoverage;

  /**
   * Transition (excluding transition route groups) coverage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1TransitionCoverage transitionCoverage;

  /**
   * The agent to calculate coverage for. Format: `projects//locations//agents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgent() {
    return agent;
  }

  /**
   * The agent to calculate coverage for. Format: `projects//locations//agents/`.
   * @param agent agent or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1CalculateCoverageResponse setAgent(java.lang.String agent) {
    this.agent = agent;
    return this;
  }

  /**
   * Intent coverage.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1IntentCoverage getIntentCoverage() {
    return intentCoverage;
  }

  /**
   * Intent coverage.
   * @param intentCoverage intentCoverage or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1CalculateCoverageResponse setIntentCoverage(GoogleCloudDialogflowCxV3beta1IntentCoverage intentCoverage) {
    this.intentCoverage = intentCoverage;
    return this;
  }

  /**
   * Transition route group coverage.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverage getRouteGroupCoverage() {
    return routeGroupCoverage;
  }

  /**
   * Transition route group coverage.
   * @param routeGroupCoverage routeGroupCoverage or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1CalculateCoverageResponse setRouteGroupCoverage(GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverage routeGroupCoverage) {
    this.routeGroupCoverage = routeGroupCoverage;
    return this;
  }

  /**
   * Transition (excluding transition route groups) coverage.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionCoverage getTransitionCoverage() {
    return transitionCoverage;
  }

  /**
   * Transition (excluding transition route groups) coverage.
   * @param transitionCoverage transitionCoverage or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1CalculateCoverageResponse setTransitionCoverage(GoogleCloudDialogflowCxV3beta1TransitionCoverage transitionCoverage) {
    this.transitionCoverage = transitionCoverage;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1CalculateCoverageResponse set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1CalculateCoverageResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1CalculateCoverageResponse clone() {
    return (GoogleCloudDialogflowCxV3beta1CalculateCoverageResponse) super.clone();
  }

}
