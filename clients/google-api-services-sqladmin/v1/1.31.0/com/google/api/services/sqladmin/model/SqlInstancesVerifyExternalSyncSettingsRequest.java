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

package com.google.api.services.sqladmin.model;

/**
 * Instance verify external sync settings request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SqlInstancesVerifyExternalSyncSettingsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. MySQL-specific settings for start external sync.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MySqlSyncConfig mysqlSyncConfig;

  /**
   * External sync mode
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String syncMode;

  /**
   * Flag to enable verifying connection only
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verifyConnectionOnly;

  /**
   * Optional. Flag to verify settings required by replication setup only
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verifyReplicationOnly;

  /**
   * Optional. MySQL-specific settings for start external sync.
   * @return value or {@code null} for none
   */
  public MySqlSyncConfig getMysqlSyncConfig() {
    return mysqlSyncConfig;
  }

  /**
   * Optional. MySQL-specific settings for start external sync.
   * @param mysqlSyncConfig mysqlSyncConfig or {@code null} for none
   */
  public SqlInstancesVerifyExternalSyncSettingsRequest setMysqlSyncConfig(MySqlSyncConfig mysqlSyncConfig) {
    this.mysqlSyncConfig = mysqlSyncConfig;
    return this;
  }

  /**
   * External sync mode
   * @return value or {@code null} for none
   */
  public java.lang.String getSyncMode() {
    return syncMode;
  }

  /**
   * External sync mode
   * @param syncMode syncMode or {@code null} for none
   */
  public SqlInstancesVerifyExternalSyncSettingsRequest setSyncMode(java.lang.String syncMode) {
    this.syncMode = syncMode;
    return this;
  }

  /**
   * Flag to enable verifying connection only
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerifyConnectionOnly() {
    return verifyConnectionOnly;
  }

  /**
   * Flag to enable verifying connection only
   * @param verifyConnectionOnly verifyConnectionOnly or {@code null} for none
   */
  public SqlInstancesVerifyExternalSyncSettingsRequest setVerifyConnectionOnly(java.lang.Boolean verifyConnectionOnly) {
    this.verifyConnectionOnly = verifyConnectionOnly;
    return this;
  }

  /**
   * Optional. Flag to verify settings required by replication setup only
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerifyReplicationOnly() {
    return verifyReplicationOnly;
  }

  /**
   * Optional. Flag to verify settings required by replication setup only
   * @param verifyReplicationOnly verifyReplicationOnly or {@code null} for none
   */
  public SqlInstancesVerifyExternalSyncSettingsRequest setVerifyReplicationOnly(java.lang.Boolean verifyReplicationOnly) {
    this.verifyReplicationOnly = verifyReplicationOnly;
    return this;
  }

  @Override
  public SqlInstancesVerifyExternalSyncSettingsRequest set(String fieldName, Object value) {
    return (SqlInstancesVerifyExternalSyncSettingsRequest) super.set(fieldName, value);
  }

  @Override
  public SqlInstancesVerifyExternalSyncSettingsRequest clone() {
    return (SqlInstancesVerifyExternalSyncSettingsRequest) super.clone();
  }

}
