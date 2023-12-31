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

package com.google.api.services.datamigration.v1.model;

/**
 * Request message for 'ApplyConversionWorkspace' request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Database Migration API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApplyConversionWorkspaceRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Specifies whether the conversion workspace is to be committed automatically after the
   * apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoCommit;

  /**
   * Optional. Fully qualified (Uri) name of the destination connection profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String connectionProfile;

  /**
   * Optional. Only validates the apply process, but doesn't change the destination database. Only
   * works for PostgreSQL destination connection profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dryRun;

  /**
   * Filter which entities to apply. Leaving this field empty will apply all of the entities.
   * Supports Google AIP 160 based filtering.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Optional. Specifies whether the conversion workspace is to be committed automatically after the
   * apply.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoCommit() {
    return autoCommit;
  }

  /**
   * Optional. Specifies whether the conversion workspace is to be committed automatically after the
   * apply.
   * @param autoCommit autoCommit or {@code null} for none
   */
  public ApplyConversionWorkspaceRequest setAutoCommit(java.lang.Boolean autoCommit) {
    this.autoCommit = autoCommit;
    return this;
  }

  /**
   * Optional. Fully qualified (Uri) name of the destination connection profile.
   * @return value or {@code null} for none
   */
  public java.lang.String getConnectionProfile() {
    return connectionProfile;
  }

  /**
   * Optional. Fully qualified (Uri) name of the destination connection profile.
   * @param connectionProfile connectionProfile or {@code null} for none
   */
  public ApplyConversionWorkspaceRequest setConnectionProfile(java.lang.String connectionProfile) {
    this.connectionProfile = connectionProfile;
    return this;
  }

  /**
   * Optional. Only validates the apply process, but doesn't change the destination database. Only
   * works for PostgreSQL destination connection profile.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDryRun() {
    return dryRun;
  }

  /**
   * Optional. Only validates the apply process, but doesn't change the destination database. Only
   * works for PostgreSQL destination connection profile.
   * @param dryRun dryRun or {@code null} for none
   */
  public ApplyConversionWorkspaceRequest setDryRun(java.lang.Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Filter which entities to apply. Leaving this field empty will apply all of the entities.
   * Supports Google AIP 160 based filtering.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Filter which entities to apply. Leaving this field empty will apply all of the entities.
   * Supports Google AIP 160 based filtering.
   * @param filter filter or {@code null} for none
   */
  public ApplyConversionWorkspaceRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  @Override
  public ApplyConversionWorkspaceRequest set(String fieldName, Object value) {
    return (ApplyConversionWorkspaceRequest) super.set(fieldName, value);
  }

  @Override
  public ApplyConversionWorkspaceRequest clone() {
    return (ApplyConversionWorkspaceRequest) super.clone();
  }

}
