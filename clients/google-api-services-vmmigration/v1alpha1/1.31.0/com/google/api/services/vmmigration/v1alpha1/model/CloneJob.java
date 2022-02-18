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

package com.google.api.services.vmmigration.v1alpha1.model;

/**
 * CloneJob describes the process of creating a clone of a MigratingVM to the requested target based
 * on the latest successful uploaded snapshots. While the migration cycles of a MigratingVm take
 * place, it is possible to verify the uploaded VM can be started in the cloud, by creating a clone.
 * The clone can be created without any downtime, and it is created using the latest snapshots which
 * are already in the cloud. The cloneJob is only responsible for its work, not its products, which
 * means once it is finished, it will never touch the instance it created. It will only delete it in
 * case of the CloneJob being cancelled or upon failure to clone.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VM Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloneJob extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Details of the target VM in Compute Engine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ComputeEngineTargetDetails computeEngineTargetDetails;

  /**
   * Output only. Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_details
   * instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TargetVMDetails computeEngineVmDetails;

  /**
   * Output only. The time the clone job was created (as an API call, not when it was actually
   * created in the target).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Provides details for the errors that led to the Clone Job's state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * Output only. The name of the clone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. State of the clone job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The time the state was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String stateTime;

  /**
   * Output only. Details of the VM to create as the target of this clone job. Deprecated: Use
   * compute_engine_target_details instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TargetVMDetails targetDetails;

  /**
   * Output only. Details of the target VM in Compute Engine.
   * @return value or {@code null} for none
   */
  public ComputeEngineTargetDetails getComputeEngineTargetDetails() {
    return computeEngineTargetDetails;
  }

  /**
   * Output only. Details of the target VM in Compute Engine.
   * @param computeEngineTargetDetails computeEngineTargetDetails or {@code null} for none
   */
  public CloneJob setComputeEngineTargetDetails(ComputeEngineTargetDetails computeEngineTargetDetails) {
    this.computeEngineTargetDetails = computeEngineTargetDetails;
    return this;
  }

  /**
   * Output only. Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_details
   * instead.
   * @return value or {@code null} for none
   */
  public TargetVMDetails getComputeEngineVmDetails() {
    return computeEngineVmDetails;
  }

  /**
   * Output only. Details of the VM in Compute Engine. Deprecated: Use compute_engine_target_details
   * instead.
   * @param computeEngineVmDetails computeEngineVmDetails or {@code null} for none
   */
  public CloneJob setComputeEngineVmDetails(TargetVMDetails computeEngineVmDetails) {
    this.computeEngineVmDetails = computeEngineVmDetails;
    return this;
  }

  /**
   * Output only. The time the clone job was created (as an API call, not when it was actually
   * created in the target).
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the clone job was created (as an API call, not when it was actually
   * created in the target).
   * @param createTime createTime or {@code null} for none
   */
  public CloneJob setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Provides details for the errors that led to the Clone Job's state.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * Output only. Provides details for the errors that led to the Clone Job's state.
   * @param error error or {@code null} for none
   */
  public CloneJob setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * Output only. The name of the clone.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of the clone.
   * @param name name or {@code null} for none
   */
  public CloneJob setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. State of the clone job.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the clone job.
   * @param state state or {@code null} for none
   */
  public CloneJob setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The time the state was last updated.
   * @return value or {@code null} for none
   */
  public String getStateTime() {
    return stateTime;
  }

  /**
   * Output only. The time the state was last updated.
   * @param stateTime stateTime or {@code null} for none
   */
  public CloneJob setStateTime(String stateTime) {
    this.stateTime = stateTime;
    return this;
  }

  /**
   * Output only. Details of the VM to create as the target of this clone job. Deprecated: Use
   * compute_engine_target_details instead.
   * @return value or {@code null} for none
   */
  public TargetVMDetails getTargetDetails() {
    return targetDetails;
  }

  /**
   * Output only. Details of the VM to create as the target of this clone job. Deprecated: Use
   * compute_engine_target_details instead.
   * @param targetDetails targetDetails or {@code null} for none
   */
  public CloneJob setTargetDetails(TargetVMDetails targetDetails) {
    this.targetDetails = targetDetails;
    return this;
  }

  @Override
  public CloneJob set(String fieldName, Object value) {
    return (CloneJob) super.set(fieldName, value);
  }

  @Override
  public CloneJob clone() {
    return (CloneJob) super.clone();
  }

}
