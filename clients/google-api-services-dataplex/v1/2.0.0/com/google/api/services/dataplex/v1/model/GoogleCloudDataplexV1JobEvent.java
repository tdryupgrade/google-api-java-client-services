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
 * The payload associated with Job logs that contains events describing jobs that have run within a
 * Lake.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1JobEvent extends com.google.api.client.json.GenericJson {

  /**
   * The time when the job ended running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Job execution trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionTrigger;

  /**
   * The unique id identifying the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobId;

  /**
   * The log message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * The number of retries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer retries;

  /**
   * The service used to execute the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * The reference to the job within the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceJob;

  /**
   * The time when the job started running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * The job state on completion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The type of the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The time when the job ended running.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The time when the job ended running.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudDataplexV1JobEvent setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Job execution trigger.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionTrigger() {
    return executionTrigger;
  }

  /**
   * Job execution trigger.
   * @param executionTrigger executionTrigger or {@code null} for none
   */
  public GoogleCloudDataplexV1JobEvent setExecutionTrigger(java.lang.String executionTrigger) {
    this.executionTrigger = executionTrigger;
    return this;
  }

  /**
   * The unique id identifying the job.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobId() {
    return jobId;
  }

  /**
   * The unique id identifying the job.
   * @param jobId jobId or {@code null} for none
   */
  public GoogleCloudDataplexV1JobEvent setJobId(java.lang.String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * The log message.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * The log message.
   * @param message message or {@code null} for none
   */
  public GoogleCloudDataplexV1JobEvent setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * The number of retries.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRetries() {
    return retries;
  }

  /**
   * The number of retries.
   * @param retries retries or {@code null} for none
   */
  public GoogleCloudDataplexV1JobEvent setRetries(java.lang.Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * The service used to execute the job.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * The service used to execute the job.
   * @param service service or {@code null} for none
   */
  public GoogleCloudDataplexV1JobEvent setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  /**
   * The reference to the job within the service.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceJob() {
    return serviceJob;
  }

  /**
   * The reference to the job within the service.
   * @param serviceJob serviceJob or {@code null} for none
   */
  public GoogleCloudDataplexV1JobEvent setServiceJob(java.lang.String serviceJob) {
    this.serviceJob = serviceJob;
    return this;
  }

  /**
   * The time when the job started running.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The time when the job started running.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudDataplexV1JobEvent setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The job state on completion.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The job state on completion.
   * @param state state or {@code null} for none
   */
  public GoogleCloudDataplexV1JobEvent setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The type of the job.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the job.
   * @param type type or {@code null} for none
   */
  public GoogleCloudDataplexV1JobEvent setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1JobEvent set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1JobEvent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1JobEvent clone() {
    return (GoogleCloudDataplexV1JobEvent) super.clone();
  }

}
