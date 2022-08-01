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

package com.google.api.services.ondemandscanning.v1beta1.model;

/**
 * A SourceContext referring to a Gerrit project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the On-Demand Scanning API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GerritSourceContext extends com.google.api.client.json.GenericJson {

  /**
   * An alias, which may be a branch or tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AliasContext aliasContext;

  /**
   * The full project name within the host. Projects may be nested, so "project/subproject" is a
   * valid project name. The "repo name" is the hostURI/project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gerritProject;

  /**
   * The URI of a running Gerrit instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hostUri;

  /**
   * A revision (commit) ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * An alias, which may be a branch or tag.
   * @return value or {@code null} for none
   */
  public AliasContext getAliasContext() {
    return aliasContext;
  }

  /**
   * An alias, which may be a branch or tag.
   * @param aliasContext aliasContext or {@code null} for none
   */
  public GerritSourceContext setAliasContext(AliasContext aliasContext) {
    this.aliasContext = aliasContext;
    return this;
  }

  /**
   * The full project name within the host. Projects may be nested, so "project/subproject" is a
   * valid project name. The "repo name" is the hostURI/project.
   * @return value or {@code null} for none
   */
  public java.lang.String getGerritProject() {
    return gerritProject;
  }

  /**
   * The full project name within the host. Projects may be nested, so "project/subproject" is a
   * valid project name. The "repo name" is the hostURI/project.
   * @param gerritProject gerritProject or {@code null} for none
   */
  public GerritSourceContext setGerritProject(java.lang.String gerritProject) {
    this.gerritProject = gerritProject;
    return this;
  }

  /**
   * The URI of a running Gerrit instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getHostUri() {
    return hostUri;
  }

  /**
   * The URI of a running Gerrit instance.
   * @param hostUri hostUri or {@code null} for none
   */
  public GerritSourceContext setHostUri(java.lang.String hostUri) {
    this.hostUri = hostUri;
    return this;
  }

  /**
   * A revision (commit) ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * A revision (commit) ID.
   * @param revisionId revisionId or {@code null} for none
   */
  public GerritSourceContext setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  @Override
  public GerritSourceContext set(String fieldName, Object value) {
    return (GerritSourceContext) super.set(fieldName, value);
  }

  @Override
  public GerritSourceContext clone() {
    return (GerritSourceContext) super.clone();
  }

}
