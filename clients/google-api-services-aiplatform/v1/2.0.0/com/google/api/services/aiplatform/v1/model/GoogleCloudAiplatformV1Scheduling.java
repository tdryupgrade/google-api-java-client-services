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
 * All parameters related to queuing and scheduling of custom jobs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1Scheduling extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Indicates if the job should retry for internal errors after the job starts running.
   * If true, overrides `Scheduling.restart_job_on_worker_restart` to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableRetries;

  /**
   * Restarts the entire CustomJob if a worker gets restarted. This feature can be used by
   * distributed training jobs that are not resilient to workers leaving and joining a job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean restartJobOnWorkerRestart;

  /**
   * The maximum job running time. The default is 7 days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeout;

  /**
   * Optional. Indicates if the job should retry for internal errors after the job starts running.
   * If true, overrides `Scheduling.restart_job_on_worker_restart` to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableRetries() {
    return disableRetries;
  }

  /**
   * Optional. Indicates if the job should retry for internal errors after the job starts running.
   * If true, overrides `Scheduling.restart_job_on_worker_restart` to false.
   * @param disableRetries disableRetries or {@code null} for none
   */
  public GoogleCloudAiplatformV1Scheduling setDisableRetries(java.lang.Boolean disableRetries) {
    this.disableRetries = disableRetries;
    return this;
  }

  /**
   * Restarts the entire CustomJob if a worker gets restarted. This feature can be used by
   * distributed training jobs that are not resilient to workers leaving and joining a job.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRestartJobOnWorkerRestart() {
    return restartJobOnWorkerRestart;
  }

  /**
   * Restarts the entire CustomJob if a worker gets restarted. This feature can be used by
   * distributed training jobs that are not resilient to workers leaving and joining a job.
   * @param restartJobOnWorkerRestart restartJobOnWorkerRestart or {@code null} for none
   */
  public GoogleCloudAiplatformV1Scheduling setRestartJobOnWorkerRestart(java.lang.Boolean restartJobOnWorkerRestart) {
    this.restartJobOnWorkerRestart = restartJobOnWorkerRestart;
    return this;
  }

  /**
   * The maximum job running time. The default is 7 days.
   * @return value or {@code null} for none
   */
  public String getTimeout() {
    return timeout;
  }

  /**
   * The maximum job running time. The default is 7 days.
   * @param timeout timeout or {@code null} for none
   */
  public GoogleCloudAiplatformV1Scheduling setTimeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1Scheduling set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1Scheduling) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1Scheduling clone() {
    return (GoogleCloudAiplatformV1Scheduling) super.clone();
  }

}
