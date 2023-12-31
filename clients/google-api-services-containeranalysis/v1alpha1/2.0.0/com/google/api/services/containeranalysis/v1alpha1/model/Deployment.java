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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * The period during which some deployable was active in a runtime.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Deployment extends com.google.api.client.json.GenericJson {

  /**
   * Address of the runtime element hosting this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * Configuration used to create this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String config;

  /**
   * Beginning of the lifetime of this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deployTime;

  /**
   * Platform hosting this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String platform;

  /**
   * Resource URI for the artifact being deployed taken from the deployable field with the same
   * name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourceUri;

  /**
   * End of the lifetime of this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String undeployTime;

  /**
   * Identity of the user that triggered this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userEmail;

  /**
   * Address of the runtime element hosting this deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * Address of the runtime element hosting this deployment.
   * @param address address or {@code null} for none
   */
  public Deployment setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * Configuration used to create this deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getConfig() {
    return config;
  }

  /**
   * Configuration used to create this deployment.
   * @param config config or {@code null} for none
   */
  public Deployment setConfig(java.lang.String config) {
    this.config = config;
    return this;
  }

  /**
   * Beginning of the lifetime of this deployment.
   * @return value or {@code null} for none
   */
  public String getDeployTime() {
    return deployTime;
  }

  /**
   * Beginning of the lifetime of this deployment.
   * @param deployTime deployTime or {@code null} for none
   */
  public Deployment setDeployTime(String deployTime) {
    this.deployTime = deployTime;
    return this;
  }

  /**
   * Platform hosting this deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlatform() {
    return platform;
  }

  /**
   * Platform hosting this deployment.
   * @param platform platform or {@code null} for none
   */
  public Deployment setPlatform(java.lang.String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Resource URI for the artifact being deployed taken from the deployable field with the same
   * name.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourceUri() {
    return resourceUri;
  }

  /**
   * Resource URI for the artifact being deployed taken from the deployable field with the same
   * name.
   * @param resourceUri resourceUri or {@code null} for none
   */
  public Deployment setResourceUri(java.util.List<java.lang.String> resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

  /**
   * End of the lifetime of this deployment.
   * @return value or {@code null} for none
   */
  public String getUndeployTime() {
    return undeployTime;
  }

  /**
   * End of the lifetime of this deployment.
   * @param undeployTime undeployTime or {@code null} for none
   */
  public Deployment setUndeployTime(String undeployTime) {
    this.undeployTime = undeployTime;
    return this;
  }

  /**
   * Identity of the user that triggered this deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserEmail() {
    return userEmail;
  }

  /**
   * Identity of the user that triggered this deployment.
   * @param userEmail userEmail or {@code null} for none
   */
  public Deployment setUserEmail(java.lang.String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  @Override
  public Deployment set(String fieldName, Object value) {
    return (Deployment) super.set(fieldName, value);
  }

  @Override
  public Deployment clone() {
    return (Deployment) super.clone();
  }

}
