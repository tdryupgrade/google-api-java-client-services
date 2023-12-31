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
 * Describes a routing conflict that may cause a deployment not to receive traffic at some base
 * path.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1DeploymentChangeReportRoutingConflict extends com.google.api.client.json.GenericJson {

  /**
   * Existing base path/deployment causing the conflict.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1DeploymentChangeReportRoutingDeployment conflictingDeployment;

  /**
   * Human-readable description of this conflict.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Name of the environment group in which this conflict exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String environmentGroup;

  /**
   * Existing base path/deployment causing the conflict.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1DeploymentChangeReportRoutingDeployment getConflictingDeployment() {
    return conflictingDeployment;
  }

  /**
   * Existing base path/deployment causing the conflict.
   * @param conflictingDeployment conflictingDeployment or {@code null} for none
   */
  public GoogleCloudApigeeV1DeploymentChangeReportRoutingConflict setConflictingDeployment(GoogleCloudApigeeV1DeploymentChangeReportRoutingDeployment conflictingDeployment) {
    this.conflictingDeployment = conflictingDeployment;
    return this;
  }

  /**
   * Human-readable description of this conflict.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Human-readable description of this conflict.
   * @param description description or {@code null} for none
   */
  public GoogleCloudApigeeV1DeploymentChangeReportRoutingConflict setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Name of the environment group in which this conflict exists.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnvironmentGroup() {
    return environmentGroup;
  }

  /**
   * Name of the environment group in which this conflict exists.
   * @param environmentGroup environmentGroup or {@code null} for none
   */
  public GoogleCloudApigeeV1DeploymentChangeReportRoutingConflict setEnvironmentGroup(java.lang.String environmentGroup) {
    this.environmentGroup = environmentGroup;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1DeploymentChangeReportRoutingConflict set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1DeploymentChangeReportRoutingConflict) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1DeploymentChangeReportRoutingConflict clone() {
    return (GoogleCloudApigeeV1DeploymentChangeReportRoutingConflict) super.clone();
  }

}
