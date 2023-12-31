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

package com.google.api.services.cloudfunctions.v2beta.model;

/**
 * Provenance of the source. Ways to find the original source, or verify that some source was used
 * for this build.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Functions API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SourceProvenance extends com.google.api.client.json.GenericJson {

  /**
   * A copy of the build's `source.git_uri`, if exists, with any commits resolved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gitUri;

  /**
   * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RepoSource resolvedRepoSource;

  /**
   * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StorageSource resolvedStorageSource;

  /**
   * A copy of the build's `source.git_uri`, if exists, with any commits resolved.
   * @return value or {@code null} for none
   */
  public java.lang.String getGitUri() {
    return gitUri;
  }

  /**
   * A copy of the build's `source.git_uri`, if exists, with any commits resolved.
   * @param gitUri gitUri or {@code null} for none
   */
  public SourceProvenance setGitUri(java.lang.String gitUri) {
    this.gitUri = gitUri;
    return this;
  }

  /**
   * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
   * @return value or {@code null} for none
   */
  public RepoSource getResolvedRepoSource() {
    return resolvedRepoSource;
  }

  /**
   * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
   * @param resolvedRepoSource resolvedRepoSource or {@code null} for none
   */
  public SourceProvenance setResolvedRepoSource(RepoSource resolvedRepoSource) {
    this.resolvedRepoSource = resolvedRepoSource;
    return this;
  }

  /**
   * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
   * @return value or {@code null} for none
   */
  public StorageSource getResolvedStorageSource() {
    return resolvedStorageSource;
  }

  /**
   * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
   * @param resolvedStorageSource resolvedStorageSource or {@code null} for none
   */
  public SourceProvenance setResolvedStorageSource(StorageSource resolvedStorageSource) {
    this.resolvedStorageSource = resolvedStorageSource;
    return this;
  }

  @Override
  public SourceProvenance set(String fieldName, Object value) {
    return (SourceProvenance) super.set(fieldName, value);
  }

  @Override
  public SourceProvenance clone() {
    return (SourceProvenance) super.clone();
  }

}
