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
 * Model definition for BulkInsertOperationStatus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BulkInsertOperationStatus extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Count of VMs successfully created so far.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer createdVmCount;

  /**
   * [Output Only] Count of VMs that got deleted during rollback.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer deletedVmCount;

  /**
   * [Output Only] Count of VMs that started creating but encountered an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer failedToCreateVmCount;

  /**
   * [Output Only] Creation status of BulkInsert operation - information if the flow is rolling
   * forward or rolling back.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] Count of VMs originally planned to be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetVmCount;

  /**
   * [Output Only] Count of VMs successfully created so far.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCreatedVmCount() {
    return createdVmCount;
  }

  /**
   * [Output Only] Count of VMs successfully created so far.
   * @param createdVmCount createdVmCount or {@code null} for none
   */
  public BulkInsertOperationStatus setCreatedVmCount(java.lang.Integer createdVmCount) {
    this.createdVmCount = createdVmCount;
    return this;
  }

  /**
   * [Output Only] Count of VMs that got deleted during rollback.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDeletedVmCount() {
    return deletedVmCount;
  }

  /**
   * [Output Only] Count of VMs that got deleted during rollback.
   * @param deletedVmCount deletedVmCount or {@code null} for none
   */
  public BulkInsertOperationStatus setDeletedVmCount(java.lang.Integer deletedVmCount) {
    this.deletedVmCount = deletedVmCount;
    return this;
  }

  /**
   * [Output Only] Count of VMs that started creating but encountered an error.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFailedToCreateVmCount() {
    return failedToCreateVmCount;
  }

  /**
   * [Output Only] Count of VMs that started creating but encountered an error.
   * @param failedToCreateVmCount failedToCreateVmCount or {@code null} for none
   */
  public BulkInsertOperationStatus setFailedToCreateVmCount(java.lang.Integer failedToCreateVmCount) {
    this.failedToCreateVmCount = failedToCreateVmCount;
    return this;
  }

  /**
   * [Output Only] Creation status of BulkInsert operation - information if the flow is rolling
   * forward or rolling back.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] Creation status of BulkInsert operation - information if the flow is rolling
   * forward or rolling back.
   * @param status status or {@code null} for none
   */
  public BulkInsertOperationStatus setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] Count of VMs originally planned to be created.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetVmCount() {
    return targetVmCount;
  }

  /**
   * [Output Only] Count of VMs originally planned to be created.
   * @param targetVmCount targetVmCount or {@code null} for none
   */
  public BulkInsertOperationStatus setTargetVmCount(java.lang.Integer targetVmCount) {
    this.targetVmCount = targetVmCount;
    return this;
  }

  @Override
  public BulkInsertOperationStatus set(String fieldName, Object value) {
    return (BulkInsertOperationStatus) super.set(fieldName, value);
  }

  @Override
  public BulkInsertOperationStatus clone() {
    return (BulkInsertOperationStatus) super.clone();
  }

}
