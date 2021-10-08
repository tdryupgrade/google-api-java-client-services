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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * The response message for Environments.DeployFlow.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3DeployFlowResponse extends com.google.api.client.json.GenericJson {

  /**
   * The name of the flow version Deployment. Format: `projects//locations//agents//
   * environments//deployments/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deployment;

  /**
   * The updated environment where the flow is deployed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3Environment environment;

  /**
   * The name of the flow version Deployment. Format: `projects//locations//agents//
   * environments//deployments/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeployment() {
    return deployment;
  }

  /**
   * The name of the flow version Deployment. Format: `projects//locations//agents//
   * environments//deployments/`.
   * @param deployment deployment or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3DeployFlowResponse setDeployment(java.lang.String deployment) {
    this.deployment = deployment;
    return this;
  }

  /**
   * The updated environment where the flow is deployed.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Environment getEnvironment() {
    return environment;
  }

  /**
   * The updated environment where the flow is deployed.
   * @param environment environment or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3DeployFlowResponse setEnvironment(GoogleCloudDialogflowCxV3Environment environment) {
    this.environment = environment;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3DeployFlowResponse set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3DeployFlowResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3DeployFlowResponse clone() {
    return (GoogleCloudDialogflowCxV3DeployFlowResponse) super.clone();
  }

}
