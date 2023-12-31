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

package com.google.api.services.apigee.v1.model;

/**
 * Model definition for GoogleCloudApigeeV1PodStatus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1PodStatus extends com.google.api.client.json.GenericJson {

  /**
   * Version of the application running in the pod.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appVersion;

  /**
   * Status of the deployment. Valid values include: - `deployed`: Successful. - `error` : Failed. -
   * `pending` : Pod has not yet reported on the deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deploymentStatus;

  /**
   * Time the deployment status was reported in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long deploymentStatusTime;

  /**
   * Time the proxy was deployed in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long deploymentTime;

  /**
   * Name of the pod which is reporting the status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String podName;

  /**
   * Overall status of the pod (not this specific deployment). Valid values include: - `active`: Up
   * to date. - `stale` : Recently out of date. Pods that have not reported status in a long time
   * are excluded from the output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String podStatus;

  /**
   * Time the pod status was reported in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long podStatusTime;

  /**
   * Code associated with the deployment status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusCode;

  /**
   * Human-readable message associated with the status code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusCodeDetails;

  /**
   * Version of the application running in the pod.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppVersion() {
    return appVersion;
  }

  /**
   * Version of the application running in the pod.
   * @param appVersion appVersion or {@code null} for none
   */
  public GoogleCloudApigeeV1PodStatus setAppVersion(java.lang.String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  /**
   * Status of the deployment. Valid values include: - `deployed`: Successful. - `error` : Failed. -
   * `pending` : Pod has not yet reported on the deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeploymentStatus() {
    return deploymentStatus;
  }

  /**
   * Status of the deployment. Valid values include: - `deployed`: Successful. - `error` : Failed. -
   * `pending` : Pod has not yet reported on the deployment.
   * @param deploymentStatus deploymentStatus or {@code null} for none
   */
  public GoogleCloudApigeeV1PodStatus setDeploymentStatus(java.lang.String deploymentStatus) {
    this.deploymentStatus = deploymentStatus;
    return this;
  }

  /**
   * Time the deployment status was reported in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDeploymentStatusTime() {
    return deploymentStatusTime;
  }

  /**
   * Time the deployment status was reported in milliseconds since epoch.
   * @param deploymentStatusTime deploymentStatusTime or {@code null} for none
   */
  public GoogleCloudApigeeV1PodStatus setDeploymentStatusTime(java.lang.Long deploymentStatusTime) {
    this.deploymentStatusTime = deploymentStatusTime;
    return this;
  }

  /**
   * Time the proxy was deployed in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDeploymentTime() {
    return deploymentTime;
  }

  /**
   * Time the proxy was deployed in milliseconds since epoch.
   * @param deploymentTime deploymentTime or {@code null} for none
   */
  public GoogleCloudApigeeV1PodStatus setDeploymentTime(java.lang.Long deploymentTime) {
    this.deploymentTime = deploymentTime;
    return this;
  }

  /**
   * Name of the pod which is reporting the status.
   * @return value or {@code null} for none
   */
  public java.lang.String getPodName() {
    return podName;
  }

  /**
   * Name of the pod which is reporting the status.
   * @param podName podName or {@code null} for none
   */
  public GoogleCloudApigeeV1PodStatus setPodName(java.lang.String podName) {
    this.podName = podName;
    return this;
  }

  /**
   * Overall status of the pod (not this specific deployment). Valid values include: - `active`: Up
   * to date. - `stale` : Recently out of date. Pods that have not reported status in a long time
   * are excluded from the output.
   * @return value or {@code null} for none
   */
  public java.lang.String getPodStatus() {
    return podStatus;
  }

  /**
   * Overall status of the pod (not this specific deployment). Valid values include: - `active`: Up
   * to date. - `stale` : Recently out of date. Pods that have not reported status in a long time
   * are excluded from the output.
   * @param podStatus podStatus or {@code null} for none
   */
  public GoogleCloudApigeeV1PodStatus setPodStatus(java.lang.String podStatus) {
    this.podStatus = podStatus;
    return this;
  }

  /**
   * Time the pod status was reported in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPodStatusTime() {
    return podStatusTime;
  }

  /**
   * Time the pod status was reported in milliseconds since epoch.
   * @param podStatusTime podStatusTime or {@code null} for none
   */
  public GoogleCloudApigeeV1PodStatus setPodStatusTime(java.lang.Long podStatusTime) {
    this.podStatusTime = podStatusTime;
    return this;
  }

  /**
   * Code associated with the deployment status.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusCode() {
    return statusCode;
  }

  /**
   * Code associated with the deployment status.
   * @param statusCode statusCode or {@code null} for none
   */
  public GoogleCloudApigeeV1PodStatus setStatusCode(java.lang.String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Human-readable message associated with the status code.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusCodeDetails() {
    return statusCodeDetails;
  }

  /**
   * Human-readable message associated with the status code.
   * @param statusCodeDetails statusCodeDetails or {@code null} for none
   */
  public GoogleCloudApigeeV1PodStatus setStatusCodeDetails(java.lang.String statusCodeDetails) {
    this.statusCodeDetails = statusCodeDetails;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1PodStatus set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1PodStatus) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1PodStatus clone() {
    return (GoogleCloudApigeeV1PodStatus) super.clone();
  }

}
