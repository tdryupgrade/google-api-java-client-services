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

package com.google.api.services.composer.v1beta1.model;

/**
 * Response for FetchDatabasePropertiesRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FetchDatabasePropertiesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The availability status of the failover replica. A false status indicates that the failover
   * replica is out of sync. The primary instance can only fail over to the failover replica when
   * the status is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isFailoverReplicaAvailable;

  /**
   * The Compute Engine zone that the instance is currently serving from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primaryGceZone;

  /**
   * The Compute Engine zone that the failover instance is currently serving from for a regional
   * Cloud SQL instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secondaryGceZone;

  /**
   * The availability status of the failover replica. A false status indicates that the failover
   * replica is out of sync. The primary instance can only fail over to the failover replica when
   * the status is true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsFailoverReplicaAvailable() {
    return isFailoverReplicaAvailable;
  }

  /**
   * The availability status of the failover replica. A false status indicates that the failover
   * replica is out of sync. The primary instance can only fail over to the failover replica when
   * the status is true.
   * @param isFailoverReplicaAvailable isFailoverReplicaAvailable or {@code null} for none
   */
  public FetchDatabasePropertiesResponse setIsFailoverReplicaAvailable(java.lang.Boolean isFailoverReplicaAvailable) {
    this.isFailoverReplicaAvailable = isFailoverReplicaAvailable;
    return this;
  }

  /**
   * The Compute Engine zone that the instance is currently serving from.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimaryGceZone() {
    return primaryGceZone;
  }

  /**
   * The Compute Engine zone that the instance is currently serving from.
   * @param primaryGceZone primaryGceZone or {@code null} for none
   */
  public FetchDatabasePropertiesResponse setPrimaryGceZone(java.lang.String primaryGceZone) {
    this.primaryGceZone = primaryGceZone;
    return this;
  }

  /**
   * The Compute Engine zone that the failover instance is currently serving from for a regional
   * Cloud SQL instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecondaryGceZone() {
    return secondaryGceZone;
  }

  /**
   * The Compute Engine zone that the failover instance is currently serving from for a regional
   * Cloud SQL instance.
   * @param secondaryGceZone secondaryGceZone or {@code null} for none
   */
  public FetchDatabasePropertiesResponse setSecondaryGceZone(java.lang.String secondaryGceZone) {
    this.secondaryGceZone = secondaryGceZone;
    return this;
  }

  @Override
  public FetchDatabasePropertiesResponse set(String fieldName, Object value) {
    return (FetchDatabasePropertiesResponse) super.set(fieldName, value);
  }

  @Override
  public FetchDatabasePropertiesResponse clone() {
    return (FetchDatabasePropertiesResponse) super.clone();
  }

}
