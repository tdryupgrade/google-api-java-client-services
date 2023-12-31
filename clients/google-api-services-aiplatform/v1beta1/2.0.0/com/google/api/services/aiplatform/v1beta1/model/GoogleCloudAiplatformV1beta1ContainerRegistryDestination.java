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
 * The Container Registry location for the container image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ContainerRegistryDestination extends com.google.api.client.json.GenericJson {

  /**
   * Required. Container Registry URI of a container image. Only Google Container Registry and
   * Artifact Registry are supported now. Accepted forms: * Google Container Registry path. For
   * example: `gcr.io/projectId/imageName:tag`. * Artifact Registry path. For example: `us-
   * central1-docker.pkg.dev/projectId/repoName/imageName:tag`. If a tag is not specified, "latest"
   * will be used as the default tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputUri;

  /**
   * Required. Container Registry URI of a container image. Only Google Container Registry and
   * Artifact Registry are supported now. Accepted forms: * Google Container Registry path. For
   * example: `gcr.io/projectId/imageName:tag`. * Artifact Registry path. For example: `us-
   * central1-docker.pkg.dev/projectId/repoName/imageName:tag`. If a tag is not specified, "latest"
   * will be used as the default tag.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputUri() {
    return outputUri;
  }

  /**
   * Required. Container Registry URI of a container image. Only Google Container Registry and
   * Artifact Registry are supported now. Accepted forms: * Google Container Registry path. For
   * example: `gcr.io/projectId/imageName:tag`. * Artifact Registry path. For example: `us-
   * central1-docker.pkg.dev/projectId/repoName/imageName:tag`. If a tag is not specified, "latest"
   * will be used as the default tag.
   * @param outputUri outputUri or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ContainerRegistryDestination setOutputUri(java.lang.String outputUri) {
    this.outputUri = outputUri;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ContainerRegistryDestination set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ContainerRegistryDestination) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ContainerRegistryDestination clone() {
    return (GoogleCloudAiplatformV1beta1ContainerRegistryDestination) super.clone();
  }

}
