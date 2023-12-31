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
 * Response message for JobService.ListDataLabelingJobs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ListDataLabelingJobsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of DataLabelingJobs that matches the specified filter in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1beta1DataLabelingJob> dataLabelingJobs;

  static {
    // hack to force ProGuard to consider GoogleCloudAiplatformV1beta1DataLabelingJob used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudAiplatformV1beta1DataLabelingJob.class);
  }

  /**
   * The standard List next-page token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of DataLabelingJobs that matches the specified filter in the request.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1beta1DataLabelingJob> getDataLabelingJobs() {
    return dataLabelingJobs;
  }

  /**
   * A list of DataLabelingJobs that matches the specified filter in the request.
   * @param dataLabelingJobs dataLabelingJobs or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ListDataLabelingJobsResponse setDataLabelingJobs(java.util.List<GoogleCloudAiplatformV1beta1DataLabelingJob> dataLabelingJobs) {
    this.dataLabelingJobs = dataLabelingJobs;
    return this;
  }

  /**
   * The standard List next-page token.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The standard List next-page token.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ListDataLabelingJobsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ListDataLabelingJobsResponse set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ListDataLabelingJobsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ListDataLabelingJobsResponse clone() {
    return (GoogleCloudAiplatformV1beta1ListDataLabelingJobsResponse) super.clone();
  }

}
