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

package com.google.api.services.cloudbuild.v1.model;

/**
 * GitLabConnectedRepository represents a GitLab connected repository request response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GitLabConnectedRepository extends com.google.api.client.json.GenericJson {

  /**
   * The name of the `GitLabConfig` that added connected repository. Format:
   * `projects/{project}/locations/{location}/gitLabConfigs/{config}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * The GitLab repositories to connect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GitLabRepositoryId repo;

  /**
   * Output only. The status of the repo connection request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status status;

  /**
   * The name of the `GitLabConfig` that added connected repository. Format:
   * `projects/{project}/locations/{location}/gitLabConfigs/{config}`
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * The name of the `GitLabConfig` that added connected repository. Format:
   * `projects/{project}/locations/{location}/gitLabConfigs/{config}`
   * @param parent parent or {@code null} for none
   */
  public GitLabConnectedRepository setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The GitLab repositories to connect.
   * @return value or {@code null} for none
   */
  public GitLabRepositoryId getRepo() {
    return repo;
  }

  /**
   * The GitLab repositories to connect.
   * @param repo repo or {@code null} for none
   */
  public GitLabConnectedRepository setRepo(GitLabRepositoryId repo) {
    this.repo = repo;
    return this;
  }

  /**
   * Output only. The status of the repo connection request.
   * @return value or {@code null} for none
   */
  public Status getStatus() {
    return status;
  }

  /**
   * Output only. The status of the repo connection request.
   * @param status status or {@code null} for none
   */
  public GitLabConnectedRepository setStatus(Status status) {
    this.status = status;
    return this;
  }

  @Override
  public GitLabConnectedRepository set(String fieldName, Object value) {
    return (GitLabConnectedRepository) super.set(fieldName, value);
  }

  @Override
  public GitLabConnectedRepository clone() {
    return (GitLabConnectedRepository) super.clone();
  }

}
