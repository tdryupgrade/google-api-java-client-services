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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Represents the settings for Cloud audit logging
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuditLoggingSettings extends com.google.api.client.json.GenericJson {

  /**
   * Indicates whether audit logging is on/off for admin activity read APIs i.e. Get/List
   * DataSources, Get/List SearchApplications etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean logAdminReadActions;

  /**
   * Indicates whether audit logging is on/off for data access read APIs i.e. ListItems, GetItem
   * etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean logDataReadActions;

  /**
   * Indicates whether audit logging is on/off for data access write APIs i.e. IndexItem etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean logDataWriteActions;

  /**
   * The resource name of the GCP Project to store audit logs. Cloud audit logging will be enabled
   * after project_name has been updated through CustomerService. Format: projects/{project_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * Indicates whether audit logging is on/off for admin activity read APIs i.e. Get/List
   * DataSources, Get/List SearchApplications etc.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLogAdminReadActions() {
    return logAdminReadActions;
  }

  /**
   * Indicates whether audit logging is on/off for admin activity read APIs i.e. Get/List
   * DataSources, Get/List SearchApplications etc.
   * @param logAdminReadActions logAdminReadActions or {@code null} for none
   */
  public AuditLoggingSettings setLogAdminReadActions(java.lang.Boolean logAdminReadActions) {
    this.logAdminReadActions = logAdminReadActions;
    return this;
  }

  /**
   * Indicates whether audit logging is on/off for data access read APIs i.e. ListItems, GetItem
   * etc.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLogDataReadActions() {
    return logDataReadActions;
  }

  /**
   * Indicates whether audit logging is on/off for data access read APIs i.e. ListItems, GetItem
   * etc.
   * @param logDataReadActions logDataReadActions or {@code null} for none
   */
  public AuditLoggingSettings setLogDataReadActions(java.lang.Boolean logDataReadActions) {
    this.logDataReadActions = logDataReadActions;
    return this;
  }

  /**
   * Indicates whether audit logging is on/off for data access write APIs i.e. IndexItem etc.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLogDataWriteActions() {
    return logDataWriteActions;
  }

  /**
   * Indicates whether audit logging is on/off for data access write APIs i.e. IndexItem etc.
   * @param logDataWriteActions logDataWriteActions or {@code null} for none
   */
  public AuditLoggingSettings setLogDataWriteActions(java.lang.Boolean logDataWriteActions) {
    this.logDataWriteActions = logDataWriteActions;
    return this;
  }

  /**
   * The resource name of the GCP Project to store audit logs. Cloud audit logging will be enabled
   * after project_name has been updated through CustomerService. Format: projects/{project_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * The resource name of the GCP Project to store audit logs. Cloud audit logging will be enabled
   * after project_name has been updated through CustomerService. Format: projects/{project_id}
   * @param project project or {@code null} for none
   */
  public AuditLoggingSettings setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  @Override
  public AuditLoggingSettings set(String fieldName, Object value) {
    return (AuditLoggingSettings) super.set(fieldName, value);
  }

  @Override
  public AuditLoggingSettings clone() {
    return (AuditLoggingSettings) super.clone();
  }

}
