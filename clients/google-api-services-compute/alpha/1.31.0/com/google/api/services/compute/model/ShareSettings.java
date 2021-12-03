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

package com.google.api.services.compute.model;

/**
 * The share setting for reservations and sole tenancy node groups.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ShareSettings extends com.google.api.client.json.GenericJson {

  /**
   * A map of folder id and folder config to specify consumer projects for this shared-reservation.
   * This is only valid when share_type's value is DIRECT_PROJECTS_UNDER_SPECIFIC_FOLDERS. Folder id
   * should be a string of number, and without "folders/" prefix.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ShareSettingsFolderConfig> folderMap;

  /**
   * A map of project id and project config. This is only valid when share_type's value is
   * SPECIFIC_PROJECTS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ShareSettingsProjectConfig> projectMap;

  /**
   * A List of Project names to specify consumer projects for this shared-reservation. This is only
   * valid when share_type's value is SPECIFIC_PROJECTS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> projects;

  /**
   * Type of sharing for this shared-reservation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shareType;

  /**
   * A map of folder id and folder config to specify consumer projects for this shared-reservation.
   * This is only valid when share_type's value is DIRECT_PROJECTS_UNDER_SPECIFIC_FOLDERS. Folder id
   * should be a string of number, and without "folders/" prefix.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ShareSettingsFolderConfig> getFolderMap() {
    return folderMap;
  }

  /**
   * A map of folder id and folder config to specify consumer projects for this shared-reservation.
   * This is only valid when share_type's value is DIRECT_PROJECTS_UNDER_SPECIFIC_FOLDERS. Folder id
   * should be a string of number, and without "folders/" prefix.
   * @param folderMap folderMap or {@code null} for none
   */
  public ShareSettings setFolderMap(java.util.Map<String, ShareSettingsFolderConfig> folderMap) {
    this.folderMap = folderMap;
    return this;
  }

  /**
   * A map of project id and project config. This is only valid when share_type's value is
   * SPECIFIC_PROJECTS.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ShareSettingsProjectConfig> getProjectMap() {
    return projectMap;
  }

  /**
   * A map of project id and project config. This is only valid when share_type's value is
   * SPECIFIC_PROJECTS.
   * @param projectMap projectMap or {@code null} for none
   */
  public ShareSettings setProjectMap(java.util.Map<String, ShareSettingsProjectConfig> projectMap) {
    this.projectMap = projectMap;
    return this;
  }

  /**
   * A List of Project names to specify consumer projects for this shared-reservation. This is only
   * valid when share_type's value is SPECIFIC_PROJECTS.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProjects() {
    return projects;
  }

  /**
   * A List of Project names to specify consumer projects for this shared-reservation. This is only
   * valid when share_type's value is SPECIFIC_PROJECTS.
   * @param projects projects or {@code null} for none
   */
  public ShareSettings setProjects(java.util.List<java.lang.String> projects) {
    this.projects = projects;
    return this;
  }

  /**
   * Type of sharing for this shared-reservation
   * @return value or {@code null} for none
   */
  public java.lang.String getShareType() {
    return shareType;
  }

  /**
   * Type of sharing for this shared-reservation
   * @param shareType shareType or {@code null} for none
   */
  public ShareSettings setShareType(java.lang.String shareType) {
    this.shareType = shareType;
    return this;
  }

  @Override
  public ShareSettings set(String fieldName, Object value) {
    return (ShareSettings) super.set(fieldName, value);
  }

  @Override
  public ShareSettings clone() {
    return (ShareSettings) super.clone();
  }

}
