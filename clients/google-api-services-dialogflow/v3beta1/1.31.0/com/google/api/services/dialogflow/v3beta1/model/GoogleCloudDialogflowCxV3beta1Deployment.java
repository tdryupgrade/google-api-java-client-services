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
 * Represents an deployment in an environment. A deployment happens when a flow version configured
 * to be active in the environment. You can configure running pre-deployment steps, e.g. running
 * validation test cases, experiment auto-rollout, etc.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1Deployment extends com.google.api.client.json.GenericJson {

  /**
   * End time of this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The name of the flow version for this deployment. Format:
   * projects//locations//agents//flows//versions/.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String flowVersion;

  /**
   * The name of the deployment. Format: projects//locations//agents//environments//deployments/.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Result of the deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1DeploymentResult result;

  /**
   * Start time of this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * The current state of the deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * End time of this deployment.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * End time of this deployment.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Deployment setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The name of the flow version for this deployment. Format:
   * projects//locations//agents//flows//versions/.
   * @return value or {@code null} for none
   */
  public java.lang.String getFlowVersion() {
    return flowVersion;
  }

  /**
   * The name of the flow version for this deployment. Format:
   * projects//locations//agents//flows//versions/.
   * @param flowVersion flowVersion or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Deployment setFlowVersion(java.lang.String flowVersion) {
    this.flowVersion = flowVersion;
    return this;
  }

  /**
   * The name of the deployment. Format: projects//locations//agents//environments//deployments/.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the deployment. Format: projects//locations//agents//environments//deployments/.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Deployment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Result of the deployment.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1DeploymentResult getResult() {
    return result;
  }

  /**
   * Result of the deployment.
   * @param result result or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Deployment setResult(GoogleCloudDialogflowCxV3beta1DeploymentResult result) {
    this.result = result;
    return this;
  }

  /**
   * Start time of this deployment.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Start time of this deployment.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Deployment setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The current state of the deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current state of the deployment.
   * @param state state or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Deployment setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1Deployment set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1Deployment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1Deployment clone() {
    return (GoogleCloudDialogflowCxV3beta1Deployment) super.clone();
  }

}
