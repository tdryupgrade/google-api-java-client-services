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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * ModelDeploymentMonitoringObjectiveConfig contains the pair of deployed_model_id to
 * ModelMonitoringObjectiveConfig.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ModelDeploymentMonitoringObjectiveConfig extends com.google.api.client.json.GenericJson {

  /**
   * The DeployedModel ID of the objective config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deployedModelId;

  /**
   * The objective config of for the modelmonitoring job of this deployed model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfig objectiveConfig;

  /**
   * The DeployedModel ID of the objective config.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeployedModelId() {
    return deployedModelId;
  }

  /**
   * The DeployedModel ID of the objective config.
   * @param deployedModelId deployedModelId or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelDeploymentMonitoringObjectiveConfig setDeployedModelId(java.lang.String deployedModelId) {
    this.deployedModelId = deployedModelId;
    return this;
  }

  /**
   * The objective config of for the modelmonitoring job of this deployed model.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfig getObjectiveConfig() {
    return objectiveConfig;
  }

  /**
   * The objective config of for the modelmonitoring job of this deployed model.
   * @param objectiveConfig objectiveConfig or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelDeploymentMonitoringObjectiveConfig setObjectiveConfig(GoogleCloudAiplatformV1beta1ModelMonitoringObjectiveConfig objectiveConfig) {
    this.objectiveConfig = objectiveConfig;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ModelDeploymentMonitoringObjectiveConfig set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ModelDeploymentMonitoringObjectiveConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ModelDeploymentMonitoringObjectiveConfig clone() {
    return (GoogleCloudAiplatformV1beta1ModelDeploymentMonitoringObjectiveConfig) super.clone();
  }

}
