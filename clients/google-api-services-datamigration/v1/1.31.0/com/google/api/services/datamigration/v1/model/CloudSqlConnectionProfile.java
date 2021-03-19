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
 * Specifies required connection parameters, and, optionally, the parameters required to create a
 * Cloud SQL destination database instance.
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
public final class CloudSqlConnectionProfile extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The Cloud SQL instance ID that this connection profile is associated with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cloudSqlId;

  /**
   * Output only. The Cloud SQL database instance's private IP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateIp;

  /**
   * Output only. The Cloud SQL database instance's public IP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publicIp;

  /**
   * Immutable. Metadata used to create the destination Cloud SQL database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudSqlSettings settings;

  /**
   * Output only. The Cloud SQL instance ID that this connection profile is associated with.
   * @return value or {@code null} for none
   */
  public java.lang.String getCloudSqlId() {
    return cloudSqlId;
  }

  /**
   * Output only. The Cloud SQL instance ID that this connection profile is associated with.
   * @param cloudSqlId cloudSqlId or {@code null} for none
   */
  public CloudSqlConnectionProfile setCloudSqlId(java.lang.String cloudSqlId) {
    this.cloudSqlId = cloudSqlId;
    return this;
  }

  /**
   * Output only. The Cloud SQL database instance's private IP.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateIp() {
    return privateIp;
  }

  /**
   * Output only. The Cloud SQL database instance's private IP.
   * @param privateIp privateIp or {@code null} for none
   */
  public CloudSqlConnectionProfile setPrivateIp(java.lang.String privateIp) {
    this.privateIp = privateIp;
    return this;
  }

  /**
   * Output only. The Cloud SQL database instance's public IP.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublicIp() {
    return publicIp;
  }

  /**
   * Output only. The Cloud SQL database instance's public IP.
   * @param publicIp publicIp or {@code null} for none
   */
  public CloudSqlConnectionProfile setPublicIp(java.lang.String publicIp) {
    this.publicIp = publicIp;
    return this;
  }

  /**
   * Immutable. Metadata used to create the destination Cloud SQL database.
   * @return value or {@code null} for none
   */
  public CloudSqlSettings getSettings() {
    return settings;
  }

  /**
   * Immutable. Metadata used to create the destination Cloud SQL database.
   * @param settings settings or {@code null} for none
   */
  public CloudSqlConnectionProfile setSettings(CloudSqlSettings settings) {
    this.settings = settings;
    return this;
  }

  @Override
  public CloudSqlConnectionProfile set(String fieldName, Object value) {
    return (CloudSqlConnectionProfile) super.set(fieldName, value);
  }

  @Override
  public CloudSqlConnectionProfile clone() {
    return (CloudSqlConnectionProfile) super.clone();
  }

}
