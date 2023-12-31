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

package com.google.api.services.aiplatform.v1.model;

/**
 * The runtime detail of PipelineJob.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1PipelineJobDetail extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The context of the pipeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1Context pipelineContext;

  /**
   * Output only. The context of the current pipeline run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1Context pipelineRunContext;

  /**
   * Output only. The runtime details of the tasks under the pipeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1PipelineTaskDetail> taskDetails;

  /**
   * Output only. The context of the pipeline.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1Context getPipelineContext() {
    return pipelineContext;
  }

  /**
   * Output only. The context of the pipeline.
   * @param pipelineContext pipelineContext or {@code null} for none
   */
  public GoogleCloudAiplatformV1PipelineJobDetail setPipelineContext(GoogleCloudAiplatformV1Context pipelineContext) {
    this.pipelineContext = pipelineContext;
    return this;
  }

  /**
   * Output only. The context of the current pipeline run.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1Context getPipelineRunContext() {
    return pipelineRunContext;
  }

  /**
   * Output only. The context of the current pipeline run.
   * @param pipelineRunContext pipelineRunContext or {@code null} for none
   */
  public GoogleCloudAiplatformV1PipelineJobDetail setPipelineRunContext(GoogleCloudAiplatformV1Context pipelineRunContext) {
    this.pipelineRunContext = pipelineRunContext;
    return this;
  }

  /**
   * Output only. The runtime details of the tasks under the pipeline.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1PipelineTaskDetail> getTaskDetails() {
    return taskDetails;
  }

  /**
   * Output only. The runtime details of the tasks under the pipeline.
   * @param taskDetails taskDetails or {@code null} for none
   */
  public GoogleCloudAiplatformV1PipelineJobDetail setTaskDetails(java.util.List<GoogleCloudAiplatformV1PipelineTaskDetail> taskDetails) {
    this.taskDetails = taskDetails;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1PipelineJobDetail set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1PipelineJobDetail) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1PipelineJobDetail clone() {
    return (GoogleCloudAiplatformV1PipelineJobDetail) super.clone();
  }

}
