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

package com.google.api.services.datapipelines.v1.model;

/**
 * A request to launch a Dataflow job from a Flex Template.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data pipelines API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatapipelinesV1LaunchFlexTemplateRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Parameter to launch a job from a Flex Template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatapipelinesV1LaunchFlexTemplateParameter launchParameter;

  /**
   * Required. The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-
   * endpoints) to which to direct the request. For example, `us-central1`, `us-west1`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Required. The ID of the Cloud Platform project that the job belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * If true, the request is validated but not actually executed. Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean validateOnly;

  /**
   * Required. Parameter to launch a job from a Flex Template.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatapipelinesV1LaunchFlexTemplateParameter getLaunchParameter() {
    return launchParameter;
  }

  /**
   * Required. Parameter to launch a job from a Flex Template.
   * @param launchParameter launchParameter or {@code null} for none
   */
  public GoogleCloudDatapipelinesV1LaunchFlexTemplateRequest setLaunchParameter(GoogleCloudDatapipelinesV1LaunchFlexTemplateParameter launchParameter) {
    this.launchParameter = launchParameter;
    return this;
  }

  /**
   * Required. The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-
   * endpoints) to which to direct the request. For example, `us-central1`, `us-west1`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Required. The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-
   * endpoints) to which to direct the request. For example, `us-central1`, `us-west1`.
   * @param location location or {@code null} for none
   */
  public GoogleCloudDatapipelinesV1LaunchFlexTemplateRequest setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Required. The ID of the Cloud Platform project that the job belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Required. The ID of the Cloud Platform project that the job belongs to.
   * @param projectId projectId or {@code null} for none
   */
  public GoogleCloudDatapipelinesV1LaunchFlexTemplateRequest setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * If true, the request is validated but not actually executed. Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getValidateOnly() {
    return validateOnly;
  }

  /**
   * If true, the request is validated but not actually executed. Defaults to false.
   * @param validateOnly validateOnly or {@code null} for none
   */
  public GoogleCloudDatapipelinesV1LaunchFlexTemplateRequest setValidateOnly(java.lang.Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  @Override
  public GoogleCloudDatapipelinesV1LaunchFlexTemplateRequest set(String fieldName, Object value) {
    return (GoogleCloudDatapipelinesV1LaunchFlexTemplateRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatapipelinesV1LaunchFlexTemplateRequest clone() {
    return (GoogleCloudDatapipelinesV1LaunchFlexTemplateRequest) super.clone();
  }

}
