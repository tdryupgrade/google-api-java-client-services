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

package com.google.api.services.dataplex.v1.model;

/**
 * Model definition for GoogleCloudDataplexV1RunTaskResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1RunTaskResponse extends com.google.api.client.json.GenericJson {

  /**
   * Jobs created by RunTask API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDataplexV1Job job;

  /**
   * Jobs created by RunTask API.
   * @return value or {@code null} for none
   */
  public GoogleCloudDataplexV1Job getJob() {
    return job;
  }

  /**
   * Jobs created by RunTask API.
   * @param job job or {@code null} for none
   */
  public GoogleCloudDataplexV1RunTaskResponse setJob(GoogleCloudDataplexV1Job job) {
    this.job = job;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1RunTaskResponse set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1RunTaskResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1RunTaskResponse clone() {
    return (GoogleCloudDataplexV1RunTaskResponse) super.clone();
  }

}
