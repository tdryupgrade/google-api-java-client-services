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

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * A `SymlinkNode` represents a symbolic link.
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
public final class BuildBazelRemoteExecutionV2SymlinkNode extends com.google.api.client.json.GenericJson {

  /**
   * The name of the symlink.
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
   * The target path of the symlink. The path separator is a forward slash `/`. The target path can
   * be relative to the parent directory of the symlink or it can be an absolute path starting with
   * `/`. Support for absolute paths can be checked using the Capabilities API. `..` components are
   * allowed anywhere in the target path as logical canonicalization may lead to different behavior
   * in the presence of directory symlinks (e.g. `foo/../bar` may not be the same as `bar`). To
   * reduce potential cache misses, canonicalization is still recommended where this is possible
   * without impacting correctness.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * The name of the symlink.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the symlink.
   * @param name name or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2SymlinkNode setName(java.lang.String name) {
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
  public BuildBazelRemoteExecutionV2SymlinkNode setNodeProperties(BuildBazelRemoteExecutionV2NodeProperties nodeProperties) {
    this.nodeProperties = nodeProperties;
    return this;
  }

  /**
   * The target path of the symlink. The path separator is a forward slash `/`. The target path can
   * be relative to the parent directory of the symlink or it can be an absolute path starting with
   * `/`. Support for absolute paths can be checked using the Capabilities API. `..` components are
   * allowed anywhere in the target path as logical canonicalization may lead to different behavior
   * in the presence of directory symlinks (e.g. `foo/../bar` may not be the same as `bar`). To
   * reduce potential cache misses, canonicalization is still recommended where this is possible
   * without impacting correctness.
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * The target path of the symlink. The path separator is a forward slash `/`. The target path can
   * be relative to the parent directory of the symlink or it can be an absolute path starting with
   * `/`. Support for absolute paths can be checked using the Capabilities API. `..` components are
   * allowed anywhere in the target path as logical canonicalization may lead to different behavior
   * in the presence of directory symlinks (e.g. `foo/../bar` may not be the same as `bar`). To
   * reduce potential cache misses, canonicalization is still recommended where this is possible
   * without impacting correctness.
   * @param target target or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2SymlinkNode setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2SymlinkNode set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2SymlinkNode) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2SymlinkNode clone() {
    return (BuildBazelRemoteExecutionV2SymlinkNode) super.clone();
  }

}
