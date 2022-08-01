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

package com.google.api.services.osconfig.v1.model;

/**
 * A resource that manages the state of a file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OSPolicyResourceFileResource extends com.google.api.client.json.GenericJson {

  /**
   * A a file with this content. The size of the content is limited to 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * A remote or local source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OSPolicyResourceFile file;

  /**
   * Required. The absolute path of the file within the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Consists of three octal digits which represent, in order, the permissions of the owner, group,
   * and other users for the file (similarly to the numeric mode used in the linux chmod utility).
   * Each digit represents a three bit number with the 4 bit corresponding to the read permissions,
   * the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission.
   * Default behavior is 755. Below are some examples of permissions and their associated values:
   * read, write, and execute: 7 read and execute: 5 read and write: 6 read only: 4
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String permissions;

  /**
   * Required. Desired state of the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * A a file with this content. The size of the content is limited to 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * A a file with this content. The size of the content is limited to 1024 characters.
   * @param content content or {@code null} for none
   */
  public OSPolicyResourceFileResource setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * A remote or local source.
   * @return value or {@code null} for none
   */
  public OSPolicyResourceFile getFile() {
    return file;
  }

  /**
   * A remote or local source.
   * @param file file or {@code null} for none
   */
  public OSPolicyResourceFileResource setFile(OSPolicyResourceFile file) {
    this.file = file;
    return this;
  }

  /**
   * Required. The absolute path of the file within the VM.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * Required. The absolute path of the file within the VM.
   * @param path path or {@code null} for none
   */
  public OSPolicyResourceFileResource setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Consists of three octal digits which represent, in order, the permissions of the owner, group,
   * and other users for the file (similarly to the numeric mode used in the linux chmod utility).
   * Each digit represents a three bit number with the 4 bit corresponding to the read permissions,
   * the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission.
   * Default behavior is 755. Below are some examples of permissions and their associated values:
   * read, write, and execute: 7 read and execute: 5 read and write: 6 read only: 4
   * @return value or {@code null} for none
   */
  public java.lang.String getPermissions() {
    return permissions;
  }

  /**
   * Consists of three octal digits which represent, in order, the permissions of the owner, group,
   * and other users for the file (similarly to the numeric mode used in the linux chmod utility).
   * Each digit represents a three bit number with the 4 bit corresponding to the read permissions,
   * the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission.
   * Default behavior is 755. Below are some examples of permissions and their associated values:
   * read, write, and execute: 7 read and execute: 5 read and write: 6 read only: 4
   * @param permissions permissions or {@code null} for none
   */
  public OSPolicyResourceFileResource setPermissions(java.lang.String permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Required. Desired state of the file.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Required. Desired state of the file.
   * @param state state or {@code null} for none
   */
  public OSPolicyResourceFileResource setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public OSPolicyResourceFileResource set(String fieldName, Object value) {
    return (OSPolicyResourceFileResource) super.set(fieldName, value);
  }

  @Override
  public OSPolicyResourceFileResource clone() {
    return (OSPolicyResourceFileResource) super.clone();
  }

}
