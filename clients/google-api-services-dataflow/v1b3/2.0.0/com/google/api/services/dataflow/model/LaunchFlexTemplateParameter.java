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

package com.google.api.services.dataflow.model;

/**
 * Launch FlexTemplate Parameter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LaunchFlexTemplateParameter extends com.google.api.client.json.GenericJson {

  /**
   * Spec about the container image to launch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContainerSpec containerSpec;

  /**
   * Cloud Storage path to a file with json serialized ContainerSpec as content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerSpecGcsPath;

  /**
   * The runtime environment for the FlexTemplate job
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FlexTemplateRuntimeEnvironment environment;

  /**
   * Required. The job name to use for the created job. For update job request, job name should be
   * same as the existing running job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobName;

  /**
   * Launch options for this flex template job. This is a common set of options across languages and
   * templates. This should not be used to pass job parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> launchOptions;

  /**
   * The parameters for FlexTemplate. Ex. {"num_workers":"5"}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> parameters;

  /**
   * Use this to pass transform_name_mappings for streaming update jobs.
   * Ex:{"oldTransformName":"newTransformName",...}'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> transformNameMappings;

  /**
   * Set this to true if you are sending a request to update a running streaming job. When set, the
   * job name should be the same as the running job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean update;

  /**
   * Spec about the container image to launch.
   * @return value or {@code null} for none
   */
  public ContainerSpec getContainerSpec() {
    return containerSpec;
  }

  /**
   * Spec about the container image to launch.
   * @param containerSpec containerSpec or {@code null} for none
   */
  public LaunchFlexTemplateParameter setContainerSpec(ContainerSpec containerSpec) {
    this.containerSpec = containerSpec;
    return this;
  }

  /**
   * Cloud Storage path to a file with json serialized ContainerSpec as content.
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerSpecGcsPath() {
    return containerSpecGcsPath;
  }

  /**
   * Cloud Storage path to a file with json serialized ContainerSpec as content.
   * @param containerSpecGcsPath containerSpecGcsPath or {@code null} for none
   */
  public LaunchFlexTemplateParameter setContainerSpecGcsPath(java.lang.String containerSpecGcsPath) {
    this.containerSpecGcsPath = containerSpecGcsPath;
    return this;
  }

  /**
   * The runtime environment for the FlexTemplate job
   * @return value or {@code null} for none
   */
  public FlexTemplateRuntimeEnvironment getEnvironment() {
    return environment;
  }

  /**
   * The runtime environment for the FlexTemplate job
   * @param environment environment or {@code null} for none
   */
  public LaunchFlexTemplateParameter setEnvironment(FlexTemplateRuntimeEnvironment environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Required. The job name to use for the created job. For update job request, job name should be
   * same as the existing running job.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobName() {
    return jobName;
  }

  /**
   * Required. The job name to use for the created job. For update job request, job name should be
   * same as the existing running job.
   * @param jobName jobName or {@code null} for none
   */
  public LaunchFlexTemplateParameter setJobName(java.lang.String jobName) {
    this.jobName = jobName;
    return this;
  }

  /**
   * Launch options for this flex template job. This is a common set of options across languages and
   * templates. This should not be used to pass job parameters.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLaunchOptions() {
    return launchOptions;
  }

  /**
   * Launch options for this flex template job. This is a common set of options across languages and
   * templates. This should not be used to pass job parameters.
   * @param launchOptions launchOptions or {@code null} for none
   */
  public LaunchFlexTemplateParameter setLaunchOptions(java.util.Map<String, java.lang.String> launchOptions) {
    this.launchOptions = launchOptions;
    return this;
  }

  /**
   * The parameters for FlexTemplate. Ex. {"num_workers":"5"}
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getParameters() {
    return parameters;
  }

  /**
   * The parameters for FlexTemplate. Ex. {"num_workers":"5"}
   * @param parameters parameters or {@code null} for none
   */
  public LaunchFlexTemplateParameter setParameters(java.util.Map<String, java.lang.String> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Use this to pass transform_name_mappings for streaming update jobs.
   * Ex:{"oldTransformName":"newTransformName",...}'
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getTransformNameMappings() {
    return transformNameMappings;
  }

  /**
   * Use this to pass transform_name_mappings for streaming update jobs.
   * Ex:{"oldTransformName":"newTransformName",...}'
   * @param transformNameMappings transformNameMappings or {@code null} for none
   */
  public LaunchFlexTemplateParameter setTransformNameMappings(java.util.Map<String, java.lang.String> transformNameMappings) {
    this.transformNameMappings = transformNameMappings;
    return this;
  }

  /**
   * Set this to true if you are sending a request to update a running streaming job. When set, the
   * job name should be the same as the running job.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUpdate() {
    return update;
  }

  /**
   * Set this to true if you are sending a request to update a running streaming job. When set, the
   * job name should be the same as the running job.
   * @param update update or {@code null} for none
   */
  public LaunchFlexTemplateParameter setUpdate(java.lang.Boolean update) {
    this.update = update;
    return this;
  }

  @Override
  public LaunchFlexTemplateParameter set(String fieldName, Object value) {
    return (LaunchFlexTemplateParameter) super.set(fieldName, value);
  }

  @Override
  public LaunchFlexTemplateParameter clone() {
    return (LaunchFlexTemplateParameter) super.clone();
  }

}
