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
 * Request message for MetadataService.PurgeContexts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1PurgeContextsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. A required filter matching the Contexts to be purged. E.g., `update_time <=
   * 2020-11-19T11:30:00-04:00`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Optional. Flag to indicate to actually perform the purge. If `force` is set to false, the
   * method will return a sample of Context names that would be deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean force;

  /**
   * Required. A required filter matching the Contexts to be purged. E.g., `update_time <=
   * 2020-11-19T11:30:00-04:00`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Required. A required filter matching the Contexts to be purged. E.g., `update_time <=
   * 2020-11-19T11:30:00-04:00`.
   * @param filter filter or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1PurgeContextsRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Optional. Flag to indicate to actually perform the purge. If `force` is set to false, the
   * method will return a sample of Context names that would be deleted.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getForce() {
    return force;
  }

  /**
   * Optional. Flag to indicate to actually perform the purge. If `force` is set to false, the
   * method will return a sample of Context names that would be deleted.
   * @param force force or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1PurgeContextsRequest setForce(java.lang.Boolean force) {
    this.force = force;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1PurgeContextsRequest set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1PurgeContextsRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1PurgeContextsRequest clone() {
    return (GoogleCloudAiplatformV1beta1PurgeContextsRequest) super.clone();
  }

}
