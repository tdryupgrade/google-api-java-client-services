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

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * A `FileNode` represents a single file and associated metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildBazelRemoteExecutionV2FileNode extends com.google.api.client.json.GenericJson {

  /**
   * The digest of the file's content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelRemoteExecutionV2Digest digest;

  /**
   * True if file is executable, false otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isExecutable;

  /**
   * The name of the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelRemoteExecutionV2NodeProperties nodeProperties;

  /**
   * The digest of the file's content.
   * @return value or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2Digest getDigest() {
    return digest;
  }

  /**
   * The digest of the file's content.
   * @param digest digest or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2FileNode setDigest(BuildBazelRemoteExecutionV2Digest digest) {
    this.digest = digest;
    return this;
  }

  /**
   * True if file is executable, false otherwise.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsExecutable() {
    return isExecutable;
  }

  /**
   * True if file is executable, false otherwise.
   * @param isExecutable isExecutable or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2FileNode setIsExecutable(java.lang.Boolean isExecutable) {
    this.isExecutable = isExecutable;
    return this;
  }

  /**
   * The name of the file.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the file.
   * @param name name or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2FileNode setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2NodeProperties getNodeProperties() {
    return nodeProperties;
  }

  /**
   * @param nodeProperties nodeProperties or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2FileNode setNodeProperties(BuildBazelRemoteExecutionV2NodeProperties nodeProperties) {
    this.nodeProperties = nodeProperties;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2FileNode set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2FileNode) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2FileNode clone() {
    return (BuildBazelRemoteExecutionV2FileNode) super.clone();
  }

}
