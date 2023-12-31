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

package com.google.api.services.prod_tt_sasportal.v1alpha1.model;

/**
 * Association between a gcp project and a SAS user id.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API (Testing). For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalDeploymentAssociation extends com.google.api.client.json.GenericJson {

  /**
   * GCP project id of the associated project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcpProjectId;

  /**
   * User id of the deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * GCP project id of the associated project.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcpProjectId() {
    return gcpProjectId;
  }

  /**
   * GCP project id of the associated project.
   * @param gcpProjectId gcpProjectId or {@code null} for none
   */
  public SasPortalDeploymentAssociation setGcpProjectId(java.lang.String gcpProjectId) {
    this.gcpProjectId = gcpProjectId;
    return this;
  }

  /**
   * User id of the deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * User id of the deployment.
   * @param userId userId or {@code null} for none
   */
  public SasPortalDeploymentAssociation setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public SasPortalDeploymentAssociation set(String fieldName, Object value) {
    return (SasPortalDeploymentAssociation) super.set(fieldName, value);
  }

  @Override
  public SasPortalDeploymentAssociation clone() {
    return (SasPortalDeploymentAssociation) super.clone();
  }

}
