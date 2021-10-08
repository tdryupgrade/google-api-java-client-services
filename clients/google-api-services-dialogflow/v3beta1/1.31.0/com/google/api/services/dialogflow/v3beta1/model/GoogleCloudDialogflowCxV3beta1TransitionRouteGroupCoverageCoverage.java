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
 * Coverage result message for one transition route group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverage extends com.google.api.client.json.GenericJson {

  /**
   * The percent of transition routes in the transition route group that are covered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float coverageScore;

  /**
   * Transition route group metadata. Only name and displayName will be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1TransitionRouteGroup routeGroup;

  /**
   * The list of transition routes and coverage in the transition route group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition> transitions;

  /**
   * The percent of transition routes in the transition route group that are covered.
   * @return value or {@code null} for none
   */
  public java.lang.Float getCoverageScore() {
    return coverageScore;
  }

  /**
   * The percent of transition routes in the transition route group that are covered.
   * @param coverageScore coverageScore or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverage setCoverageScore(java.lang.Float coverageScore) {
    this.coverageScore = coverageScore;
    return this;
  }

  /**
   * Transition route group metadata. Only name and displayName will be set.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroup getRouteGroup() {
    return routeGroup;
  }

  /**
   * Transition route group metadata. Only name and displayName will be set.
   * @param routeGroup routeGroup or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverage setRouteGroup(GoogleCloudDialogflowCxV3beta1TransitionRouteGroup routeGroup) {
    this.routeGroup = routeGroup;
    return this;
  }

  /**
   * The list of transition routes and coverage in the transition route group.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition> getTransitions() {
    return transitions;
  }

  /**
   * The list of transition routes and coverage in the transition route group.
   * @param transitions transitions or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverage setTransitions(java.util.List<GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverageTransition> transitions) {
    this.transitions = transitions;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverage set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverage clone() {
    return (GoogleCloudDialogflowCxV3beta1TransitionRouteGroupCoverageCoverage) super.clone();
  }

}
