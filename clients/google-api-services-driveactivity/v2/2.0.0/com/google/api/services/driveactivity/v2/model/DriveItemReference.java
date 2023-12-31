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

package com.google.api.services.driveactivity.v2.model;

/**
 * A lightweight reference to a Drive item, such as a file or folder.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Activity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DriveItemReference extends com.google.api.client.json.GenericJson {

  /**
   * The Drive item is a file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveFile driveFile;

  /**
   * The Drive item is a folder. Includes information about the type of folder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveFolder driveFolder;

  /**
   * This field is deprecated; please use the `driveFile` field instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private File file;

  /**
   * This field is deprecated; please use the `driveFolder` field instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Folder folder;

  /**
   * The target Drive item. The format is `items/ITEM_ID`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The title of the Drive item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The Drive item is a file.
   * @return value or {@code null} for none
   */
  public DriveFile getDriveFile() {
    return driveFile;
  }

  /**
   * The Drive item is a file.
   * @param driveFile driveFile or {@code null} for none
   */
  public DriveItemReference setDriveFile(DriveFile driveFile) {
    this.driveFile = driveFile;
    return this;
  }

  /**
   * The Drive item is a folder. Includes information about the type of folder.
   * @return value or {@code null} for none
   */
  public DriveFolder getDriveFolder() {
    return driveFolder;
  }

  /**
   * The Drive item is a folder. Includes information about the type of folder.
   * @param driveFolder driveFolder or {@code null} for none
   */
  public DriveItemReference setDriveFolder(DriveFolder driveFolder) {
    this.driveFolder = driveFolder;
    return this;
  }

  /**
   * This field is deprecated; please use the `driveFile` field instead.
   * @return value or {@code null} for none
   */
  public File getFile() {
    return file;
  }

  /**
   * This field is deprecated; please use the `driveFile` field instead.
   * @param file file or {@code null} for none
   */
  public DriveItemReference setFile(File file) {
    this.file = file;
    return this;
  }

  /**
   * This field is deprecated; please use the `driveFolder` field instead.
   * @return value or {@code null} for none
   */
  public Folder getFolder() {
    return folder;
  }

  /**
   * This field is deprecated; please use the `driveFolder` field instead.
   * @param folder folder or {@code null} for none
   */
  public DriveItemReference setFolder(Folder folder) {
    this.folder = folder;
    return this;
  }

  /**
   * The target Drive item. The format is `items/ITEM_ID`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The target Drive item. The format is `items/ITEM_ID`.
   * @param name name or {@code null} for none
   */
  public DriveItemReference setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The title of the Drive item.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the Drive item.
   * @param title title or {@code null} for none
   */
  public DriveItemReference setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public DriveItemReference set(String fieldName, Object value) {
    return (DriveItemReference) super.set(fieldName, value);
  }

  @Override
  public DriveItemReference clone() {
    return (DriveItemReference) super.clone();
  }

}
