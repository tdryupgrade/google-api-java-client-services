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

package com.google.api.services.dialogflow.v3.model;

/**
 * Settings of integration with GitHub.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3AgentGitIntegrationSettingsGithubSettings extends com.google.api.client.json.GenericJson {

  /**
   * The access token used to authenticate the access to the GitHub repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessToken;

  /**
   * A list of branches configured to be used from Dialogflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> branches;

  /**
   * The unique repository display name for the GitHub repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The GitHub repository URI related to the agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String repositoryUri;

  /**
   * The branch of the GitHub repository tracked for this agent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trackingBranch;

  /**
   * The access token used to authenticate the access to the GitHub repository.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessToken() {
    return accessToken;
  }

  /**
   * The access token used to authenticate the access to the GitHub repository.
   * @param accessToken accessToken or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AgentGitIntegrationSettingsGithubSettings setAccessToken(java.lang.String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * A list of branches configured to be used from Dialogflow.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBranches() {
    return branches;
  }

  /**
   * A list of branches configured to be used from Dialogflow.
   * @param branches branches or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AgentGitIntegrationSettingsGithubSettings setBranches(java.util.List<java.lang.String> branches) {
    this.branches = branches;
    return this;
  }

  /**
   * The unique repository display name for the GitHub repository.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The unique repository display name for the GitHub repository.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AgentGitIntegrationSettingsGithubSettings setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The GitHub repository URI related to the agent.
   * @return value or {@code null} for none
   */
  public java.lang.String getRepositoryUri() {
    return repositoryUri;
  }

  /**
   * The GitHub repository URI related to the agent.
   * @param repositoryUri repositoryUri or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AgentGitIntegrationSettingsGithubSettings setRepositoryUri(java.lang.String repositoryUri) {
    this.repositoryUri = repositoryUri;
    return this;
  }

  /**
   * The branch of the GitHub repository tracked for this agent.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrackingBranch() {
    return trackingBranch;
  }

  /**
   * The branch of the GitHub repository tracked for this agent.
   * @param trackingBranch trackingBranch or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AgentGitIntegrationSettingsGithubSettings setTrackingBranch(java.lang.String trackingBranch) {
    this.trackingBranch = trackingBranch;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3AgentGitIntegrationSettingsGithubSettings set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3AgentGitIntegrationSettingsGithubSettings) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3AgentGitIntegrationSettingsGithubSettings clone() {
    return (GoogleCloudDialogflowCxV3AgentGitIntegrationSettingsGithubSettings) super.clone();
  }

}
