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
 * The response message for MatchService.FindNeighbors.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1FindNeighborsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The nearest neighbors of the query datapoints.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1FindNeighborsResponseNearestNeighbors> nearestNeighbors;

  /**
   * The nearest neighbors of the query datapoints.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1FindNeighborsResponseNearestNeighbors> getNearestNeighbors() {
    return nearestNeighbors;
  }

  /**
   * The nearest neighbors of the query datapoints.
   * @param nearestNeighbors nearestNeighbors or {@code null} for none
   */
  public GoogleCloudAiplatformV1FindNeighborsResponse setNearestNeighbors(java.util.List<GoogleCloudAiplatformV1FindNeighborsResponseNearestNeighbors> nearestNeighbors) {
    this.nearestNeighbors = nearestNeighbors;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1FindNeighborsResponse set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1FindNeighborsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1FindNeighborsResponse clone() {
    return (GoogleCloudAiplatformV1FindNeighborsResponse) super.clone();
  }

}
