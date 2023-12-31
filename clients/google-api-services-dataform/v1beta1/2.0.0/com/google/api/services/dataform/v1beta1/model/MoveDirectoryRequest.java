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

package com.google.api.services.dataform.v1beta1.model;

/**
 * `MoveDirectory` request message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataform API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MoveDirectoryRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The new path for the directory including directory name, rooted at workspace root.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newPath;

  /**
   * Required. The directory's full path including directory name, relative to the workspace root.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Required. The new path for the directory including directory name, rooted at workspace root.
   * @return value or {@code null} for none
   */
  public java.lang.String getNewPath() {
    return newPath;
  }

  /**
   * Required. The new path for the directory including directory name, rooted at workspace root.
   * @param newPath newPath or {@code null} for none
   */
  public MoveDirectoryRequest setNewPath(java.lang.String newPath) {
    this.newPath = newPath;
    return this;
  }

  /**
   * Required. The directory's full path including directory name, relative to the workspace root.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * Required. The directory's full path including directory name, relative to the workspace root.
   * @param path path or {@code null} for none
   */
  public MoveDirectoryRequest setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  @Override
  public MoveDirectoryRequest set(String fieldName, Object value) {
    return (MoveDirectoryRequest) super.set(fieldName, value);
  }

  @Override
  public MoveDirectoryRequest clone() {
    return (MoveDirectoryRequest) super.clone();
  }

}
