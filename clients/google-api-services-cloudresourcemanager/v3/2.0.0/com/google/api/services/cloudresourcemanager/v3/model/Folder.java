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

package com.google.api.services.cloudresourcemanager.v3.model;

/**
 * A folder in an organization's resource hierarchy, used to organize that organization's resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Folder extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp when the folder was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Timestamp when the folder was requested to be deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * The folder's display name. A folder's display name must be unique amongst its siblings. For
   * example, no two folders with the same parent can share the same display name. The display name
   * must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and
   * underscores and can be no longer than 30 characters. This is captured by the regular
   * expression: `[\p{L}\p{N}]([\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. A checksum computed by the server based on the current value of the folder
   * resource. This may be sent on update and delete requests to ensure the client has an up-to-date
   * value before proceeding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. The resource name of the folder. Its format is `folders/{folder_id}`, for example:
   * "folders/1234".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The folder's parent's resource name. Updates to the folder's parent must be performed
   * using MoveFolder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Output only. The lifecycle state of the folder. Updates to the state must be performed using
   * DeleteFolder and UndeleteFolder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Timestamp when the folder was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Timestamp when the folder was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when the folder was created.
   * @param createTime createTime or {@code null} for none
   */
  public Folder setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Timestamp when the folder was requested to be deleted.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. Timestamp when the folder was requested to be deleted.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public Folder setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * The folder's display name. A folder's display name must be unique amongst its siblings. For
   * example, no two folders with the same parent can share the same display name. The display name
   * must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and
   * underscores and can be no longer than 30 characters. This is captured by the regular
   * expression: `[\p{L}\p{N}]([\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The folder's display name. A folder's display name must be unique amongst its siblings. For
   * example, no two folders with the same parent can share the same display name. The display name
   * must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and
   * underscores and can be no longer than 30 characters. This is captured by the regular
   * expression: `[\p{L}\p{N}]([\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?`.
   * @param displayName displayName or {@code null} for none
   */
  public Folder setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. A checksum computed by the server based on the current value of the folder
   * resource. This may be sent on update and delete requests to ensure the client has an up-to-date
   * value before proceeding.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. A checksum computed by the server based on the current value of the folder
   * resource. This may be sent on update and delete requests to ensure the client has an up-to-date
   * value before proceeding.
   * @param etag etag or {@code null} for none
   */
  public Folder setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. The resource name of the folder. Its format is `folders/{folder_id}`, for example:
   * "folders/1234".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the folder. Its format is `folders/{folder_id}`, for example:
   * "folders/1234".
   * @param name name or {@code null} for none
   */
  public Folder setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The folder's parent's resource name. Updates to the folder's parent must be performed
   * using MoveFolder.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Required. The folder's parent's resource name. Updates to the folder's parent must be performed
   * using MoveFolder.
   * @param parent parent or {@code null} for none
   */
  public Folder setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Output only. The lifecycle state of the folder. Updates to the state must be performed using
   * DeleteFolder and UndeleteFolder.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The lifecycle state of the folder. Updates to the state must be performed using
   * DeleteFolder and UndeleteFolder.
   * @param state state or {@code null} for none
   */
  public Folder setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Timestamp when the folder was last modified.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when the folder was last modified.
   * @param updateTime updateTime or {@code null} for none
   */
  public Folder setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Folder set(String fieldName, Object value) {
    return (Folder) super.set(fieldName, value);
  }

  @Override
  public Folder clone() {
    return (Folder) super.clone();
  }

}
