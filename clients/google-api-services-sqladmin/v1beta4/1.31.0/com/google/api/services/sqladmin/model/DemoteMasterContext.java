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
 * Database instance demote primary instance context.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DemoteMasterContext extends com.google.api.client.json.GenericJson {

  /**
   * This is always *sql#demoteMasterContext*.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of the instance which will act as on-premises primary instance in the replication
   * setup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String masterInstanceName;

  /**
   * Configuration specific to read-replicas replicating from the on-premises primary instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DemoteMasterConfiguration replicaConfiguration;

  /**
   * Flag to skip replication setup on the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean skipReplicationSetup;

  /**
   * Verify GTID consistency for demote operation. Default value: *True*. Setting this flag to false
   * enables you to bypass GTID consistency check between on-premises primary instance and Cloud SQL
   * instance during the demotion operation but also exposes you to the risk of future replication
   * failures. Change the value only if you know the reason for the GTID divergence and are
   * confident that doing so will not cause any replication issues.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verifyGtidConsistency;

  /**
   * This is always *sql#demoteMasterContext*.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always *sql#demoteMasterContext*.
   * @param kind kind or {@code null} for none
   */
  public DemoteMasterContext setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the instance which will act as on-premises primary instance in the replication
   * setup.
   * @return value or {@code null} for none
   */
  public java.lang.String getMasterInstanceName() {
    return masterInstanceName;
  }

  /**
   * The name of the instance which will act as on-premises primary instance in the replication
   * setup.
   * @param masterInstanceName masterInstanceName or {@code null} for none
   */
  public DemoteMasterContext setMasterInstanceName(java.lang.String masterInstanceName) {
    this.masterInstanceName = masterInstanceName;
    return this;
  }

  /**
   * Configuration specific to read-replicas replicating from the on-premises primary instance.
   * @return value or {@code null} for none
   */
  public DemoteMasterConfiguration getReplicaConfiguration() {
    return replicaConfiguration;
  }

  /**
   * Configuration specific to read-replicas replicating from the on-premises primary instance.
   * @param replicaConfiguration replicaConfiguration or {@code null} for none
   */
  public DemoteMasterContext setReplicaConfiguration(DemoteMasterConfiguration replicaConfiguration) {
    this.replicaConfiguration = replicaConfiguration;
    return this;
  }

  /**
   * Flag to skip replication setup on the instance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSkipReplicationSetup() {
    return skipReplicationSetup;
  }

  /**
   * Flag to skip replication setup on the instance.
   * @param skipReplicationSetup skipReplicationSetup or {@code null} for none
   */
  public DemoteMasterContext setSkipReplicationSetup(java.lang.Boolean skipReplicationSetup) {
    this.skipReplicationSetup = skipReplicationSetup;
    return this;
  }

  /**
   * Verify GTID consistency for demote operation. Default value: *True*. Setting this flag to false
   * enables you to bypass GTID consistency check between on-premises primary instance and Cloud SQL
   * instance during the demotion operation but also exposes you to the risk of future replication
   * failures. Change the value only if you know the reason for the GTID divergence and are
   * confident that doing so will not cause any replication issues.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerifyGtidConsistency() {
    return verifyGtidConsistency;
  }

  /**
   * Verify GTID consistency for demote operation. Default value: *True*. Setting this flag to false
   * enables you to bypass GTID consistency check between on-premises primary instance and Cloud SQL
   * instance during the demotion operation but also exposes you to the risk of future replication
   * failures. Change the value only if you know the reason for the GTID divergence and are
   * confident that doing so will not cause any replication issues.
   * @param verifyGtidConsistency verifyGtidConsistency or {@code null} for none
   */
  public DemoteMasterContext setVerifyGtidConsistency(java.lang.Boolean verifyGtidConsistency) {
    this.verifyGtidConsistency = verifyGtidConsistency;
    return this;
  }

  @Override
  public DemoteMasterContext set(String fieldName, Object value) {
    return (DemoteMasterContext) super.set(fieldName, value);
  }

  @Override
  public DemoteMasterContext clone() {
    return (DemoteMasterContext) super.clone();
  }

}
