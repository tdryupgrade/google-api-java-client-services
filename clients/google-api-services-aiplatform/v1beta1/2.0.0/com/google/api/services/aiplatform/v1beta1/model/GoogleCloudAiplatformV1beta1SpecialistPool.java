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
 * SpecialistPool represents customers' own workforce to work on their data labeling jobs. It
 * includes a group of specialist managers and workers. Managers are responsible for managing the
 * workers in this pool as well as customers' data labeling jobs associated with this pool.
 * Customers create specialist pool as well as start data labeling jobs on Cloud, managers and
 * workers handle the jobs using CrowdCompute console.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1SpecialistPool extends com.google.api.client.json.GenericJson {

  /**
   * Required. The user-defined name of the SpecialistPool. The name can be up to 128 characters
   * long and can consist of any UTF-8 characters. This field should be unique on project-level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Required. The resource name of the SpecialistPool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The resource name of the pending data labeling jobs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> pendingDataLabelingJobs;

  /**
   * The email addresses of the managers in the SpecialistPool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> specialistManagerEmails;

  /**
   * Output only. The number of managers in this SpecialistPool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer specialistManagersCount;

  /**
   * The email addresses of workers in the SpecialistPool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> specialistWorkerEmails;

  /**
   * Required. The user-defined name of the SpecialistPool. The name can be up to 128 characters
   * long and can consist of any UTF-8 characters. This field should be unique on project-level.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The user-defined name of the SpecialistPool. The name can be up to 128 characters
   * long and can consist of any UTF-8 characters. This field should be unique on project-level.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SpecialistPool setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. The resource name of the SpecialistPool.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The resource name of the SpecialistPool.
   * @param name name or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SpecialistPool setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The resource name of the pending data labeling jobs.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPendingDataLabelingJobs() {
    return pendingDataLabelingJobs;
  }

  /**
   * Output only. The resource name of the pending data labeling jobs.
   * @param pendingDataLabelingJobs pendingDataLabelingJobs or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SpecialistPool setPendingDataLabelingJobs(java.util.List<java.lang.String> pendingDataLabelingJobs) {
    this.pendingDataLabelingJobs = pendingDataLabelingJobs;
    return this;
  }

  /**
   * The email addresses of the managers in the SpecialistPool.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSpecialistManagerEmails() {
    return specialistManagerEmails;
  }

  /**
   * The email addresses of the managers in the SpecialistPool.
   * @param specialistManagerEmails specialistManagerEmails or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SpecialistPool setSpecialistManagerEmails(java.util.List<java.lang.String> specialistManagerEmails) {
    this.specialistManagerEmails = specialistManagerEmails;
    return this;
  }

  /**
   * Output only. The number of managers in this SpecialistPool.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSpecialistManagersCount() {
    return specialistManagersCount;
  }

  /**
   * Output only. The number of managers in this SpecialistPool.
   * @param specialistManagersCount specialistManagersCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SpecialistPool setSpecialistManagersCount(java.lang.Integer specialistManagersCount) {
    this.specialistManagersCount = specialistManagersCount;
    return this;
  }

  /**
   * The email addresses of workers in the SpecialistPool.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSpecialistWorkerEmails() {
    return specialistWorkerEmails;
  }

  /**
   * The email addresses of workers in the SpecialistPool.
   * @param specialistWorkerEmails specialistWorkerEmails or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SpecialistPool setSpecialistWorkerEmails(java.util.List<java.lang.String> specialistWorkerEmails) {
    this.specialistWorkerEmails = specialistWorkerEmails;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1SpecialistPool set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1SpecialistPool) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1SpecialistPool clone() {
    return (GoogleCloudAiplatformV1beta1SpecialistPool) super.clone();
  }

}
