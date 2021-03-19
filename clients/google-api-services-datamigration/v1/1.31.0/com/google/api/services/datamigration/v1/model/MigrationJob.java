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
 * Represents a Database Migration Service migration job object.
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
public final class MigrationJob extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The timestamp when the migration job resource was created. A timestamp in RFC3339
   * UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. The resource name (URI) of the destination connection profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destination;

  /**
   * The database engine type and provider of the destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DatabaseType destinationDatabase;

  /**
   * The migration job display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The path to the dump file in Google Cloud Storage, in the format:
   * (gs://[BUCKET_NAME]/[OBJECT_NAME]).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dumpPath;

  /**
   * Output only. The duration of the migration job (in seconds). A duration in seconds with up to
   * nine fractional digits, terminated by 's'. Example: "3.5s".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * Output only. If the migration job is completed, the time when it was completed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Output only. The error details in case of state FAILED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * The resource labels for migration job to use to annotate any related underlying resources such
   * as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name":
   * "wrench", "mass": "1.3kg", "count": "3" }`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The name (URI) of this migration job resource, in the form of:
   * projects/{project}/locations/{location}/instances/{instance}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The current migration job phase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phase;

  /**
   * The details needed to communicate to the source over Reverse SSH tunnel connectivity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReverseSshConnectivity reverseSshConnectivity;

  /**
   * Required. The resource name (URI) of the source connection profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * The database engine type and provider of the source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DatabaseType sourceDatabase;

  /**
   * The current migration job state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * static ip connectivity data (default, no additional details needed).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StaticIpConnectivity staticIpConnectivity;

  /**
   * Required. The migration job type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. The timestamp when the migration job resource was last updated. A timestamp in
   * RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The details of the VPC network that the source database is located in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VpcPeeringConnectivity vpcPeeringConnectivity;

  /**
   * Output only. The timestamp when the migration job resource was created. A timestamp in RFC3339
   * UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when the migration job resource was created. A timestamp in RFC3339
   * UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
   * @param createTime createTime or {@code null} for none
   */
  public MigrationJob setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. The resource name (URI) of the destination connection profile.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestination() {
    return destination;
  }

  /**
   * Required. The resource name (URI) of the destination connection profile.
   * @param destination destination or {@code null} for none
   */
  public MigrationJob setDestination(java.lang.String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * The database engine type and provider of the destination.
   * @return value or {@code null} for none
   */
  public DatabaseType getDestinationDatabase() {
    return destinationDatabase;
  }

  /**
   * The database engine type and provider of the destination.
   * @param destinationDatabase destinationDatabase or {@code null} for none
   */
  public MigrationJob setDestinationDatabase(DatabaseType destinationDatabase) {
    this.destinationDatabase = destinationDatabase;
    return this;
  }

  /**
   * The migration job display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The migration job display name.
   * @param displayName displayName or {@code null} for none
   */
  public MigrationJob setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The path to the dump file in Google Cloud Storage, in the format:
   * (gs://[BUCKET_NAME]/[OBJECT_NAME]).
   * @return value or {@code null} for none
   */
  public java.lang.String getDumpPath() {
    return dumpPath;
  }

  /**
   * The path to the dump file in Google Cloud Storage, in the format:
   * (gs://[BUCKET_NAME]/[OBJECT_NAME]).
   * @param dumpPath dumpPath or {@code null} for none
   */
  public MigrationJob setDumpPath(java.lang.String dumpPath) {
    this.dumpPath = dumpPath;
    return this;
  }

  /**
   * Output only. The duration of the migration job (in seconds). A duration in seconds with up to
   * nine fractional digits, terminated by 's'. Example: "3.5s".
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Output only. The duration of the migration job (in seconds). A duration in seconds with up to
   * nine fractional digits, terminated by 's'. Example: "3.5s".
   * @param duration duration or {@code null} for none
   */
  public MigrationJob setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Output only. If the migration job is completed, the time when it was completed.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. If the migration job is completed, the time when it was completed.
   * @param endTime endTime or {@code null} for none
   */
  public MigrationJob setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Output only. The error details in case of state FAILED.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * Output only. The error details in case of state FAILED.
   * @param error error or {@code null} for none
   */
  public MigrationJob setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * The resource labels for migration job to use to annotate any related underlying resources such
   * as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name":
   * "wrench", "mass": "1.3kg", "count": "3" }`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The resource labels for migration job to use to annotate any related underlying resources such
   * as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name":
   * "wrench", "mass": "1.3kg", "count": "3" }`.
   * @param labels labels or {@code null} for none
   */
  public MigrationJob setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The name (URI) of this migration job resource, in the form of:
   * projects/{project}/locations/{location}/instances/{instance}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name (URI) of this migration job resource, in the form of:
   * projects/{project}/locations/{location}/instances/{instance}.
   * @param name name or {@code null} for none
   */
  public MigrationJob setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The current migration job phase.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhase() {
    return phase;
  }

  /**
   * Output only. The current migration job phase.
   * @param phase phase or {@code null} for none
   */
  public MigrationJob setPhase(java.lang.String phase) {
    this.phase = phase;
    return this;
  }

  /**
   * The details needed to communicate to the source over Reverse SSH tunnel connectivity.
   * @return value or {@code null} for none
   */
  public ReverseSshConnectivity getReverseSshConnectivity() {
    return reverseSshConnectivity;
  }

  /**
   * The details needed to communicate to the source over Reverse SSH tunnel connectivity.
   * @param reverseSshConnectivity reverseSshConnectivity or {@code null} for none
   */
  public MigrationJob setReverseSshConnectivity(ReverseSshConnectivity reverseSshConnectivity) {
    this.reverseSshConnectivity = reverseSshConnectivity;
    return this;
  }

  /**
   * Required. The resource name (URI) of the source connection profile.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Required. The resource name (URI) of the source connection profile.
   * @param source source or {@code null} for none
   */
  public MigrationJob setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  /**
   * The database engine type and provider of the source.
   * @return value or {@code null} for none
   */
  public DatabaseType getSourceDatabase() {
    return sourceDatabase;
  }

  /**
   * The database engine type and provider of the source.
   * @param sourceDatabase sourceDatabase or {@code null} for none
   */
  public MigrationJob setSourceDatabase(DatabaseType sourceDatabase) {
    this.sourceDatabase = sourceDatabase;
    return this;
  }

  /**
   * The current migration job state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current migration job state.
   * @param state state or {@code null} for none
   */
  public MigrationJob setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * static ip connectivity data (default, no additional details needed).
   * @return value or {@code null} for none
   */
  public StaticIpConnectivity getStaticIpConnectivity() {
    return staticIpConnectivity;
  }

  /**
   * static ip connectivity data (default, no additional details needed).
   * @param staticIpConnectivity staticIpConnectivity or {@code null} for none
   */
  public MigrationJob setStaticIpConnectivity(StaticIpConnectivity staticIpConnectivity) {
    this.staticIpConnectivity = staticIpConnectivity;
    return this;
  }

  /**
   * Required. The migration job type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The migration job type.
   * @param type type or {@code null} for none
   */
  public MigrationJob setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Output only. The timestamp when the migration job resource was last updated. A timestamp in
   * RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the migration job resource was last updated. A timestamp in
   * RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
   * @param updateTime updateTime or {@code null} for none
   */
  public MigrationJob setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * The details of the VPC network that the source database is located in.
   * @return value or {@code null} for none
   */
  public VpcPeeringConnectivity getVpcPeeringConnectivity() {
    return vpcPeeringConnectivity;
  }

  /**
   * The details of the VPC network that the source database is located in.
   * @param vpcPeeringConnectivity vpcPeeringConnectivity or {@code null} for none
   */
  public MigrationJob setVpcPeeringConnectivity(VpcPeeringConnectivity vpcPeeringConnectivity) {
    this.vpcPeeringConnectivity = vpcPeeringConnectivity;
    return this;
  }

  @Override
  public MigrationJob set(String fieldName, Object value) {
    return (MigrationJob) super.set(fieldName, value);
  }

  @Override
  public MigrationJob clone() {
    return (MigrationJob) super.clone();
  }

}
