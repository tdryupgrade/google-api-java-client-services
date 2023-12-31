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
 * Runtime operation information for IndexEndpointService.MutateDeployedIndex.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1MutateDeployedIndexOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The unique index id specified by user
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deployedIndexId;

  /**
   * The operation generic information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1GenericOperationMetadata genericMetadata;

  /**
   * The unique index id specified by user
   * @return value or {@code null} for none
   */
  public java.lang.String getDeployedIndexId() {
    return deployedIndexId;
  }

  /**
   * The unique index id specified by user
   * @param deployedIndexId deployedIndexId or {@code null} for none
   */
  public GoogleCloudAiplatformV1MutateDeployedIndexOperationMetadata setDeployedIndexId(java.lang.String deployedIndexId) {
    this.deployedIndexId = deployedIndexId;
    return this;
  }

  /**
   * The operation generic information.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1GenericOperationMetadata getGenericMetadata() {
    return genericMetadata;
  }

  /**
   * The operation generic information.
   * @param genericMetadata genericMetadata or {@code null} for none
   */
  public GoogleCloudAiplatformV1MutateDeployedIndexOperationMetadata setGenericMetadata(GoogleCloudAiplatformV1GenericOperationMetadata genericMetadata) {
    this.genericMetadata = genericMetadata;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1MutateDeployedIndexOperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1MutateDeployedIndexOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1MutateDeployedIndexOperationMetadata clone() {
    return (GoogleCloudAiplatformV1MutateDeployedIndexOperationMetadata) super.clone();
  }

}
