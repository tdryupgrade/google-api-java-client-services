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
 * Model definition for Trigger.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Trigger extends com.google.api.client.json.GenericJson {

  /**
   * Each dispatcher should use an enum to for the actions that it supports. If a dispatcher has
   * only one action, this does not need to be set. (It can be expanded later, defining the default
   * behaviour as type 0.) For purposes such as batching, the type of a trigger is (dispatcher,
   * action_type).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long actionType;

  /**
   * Maximum possible delay in micros that can be tolerated so triggers can be batched, which makes
   * processing more efficient compared to firing triggers individually. Note that the actual fire
   * time will be somewhere in the timerange interval [fire_time_us, fire_time_us + batch_time_us).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long batchTimeUs;

  /**
   * Must be set for DISPATCHER_STUBBY_DISPATCHER.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long dispatchId;

  /**
   * Which server should interpret action_type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dispatcher;

  /**
   * Earliest time to fire at in microseconds. The actual time that the trigger will fire will be in
   * the timerange: [fire_time_us, fire_time_us + batch_time_us).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long fireTimeUs;

  /**
   * Must be set for DISPATCHER_JOBSETTED_PRIMARY.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobsettedServerSpec jobsettedServerSpec;

  /**
   * The trigger key, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RpcOptions rpcOptions;

  /**
   * The slice_fire_time_us is automatically computed and stored as part of the trigger write. It
   * represents the exact fire time at which the trigger will be queued to fire and will satisfy
   * fire_time_us < slice_fire_time_us <= fire_time_us + batch_time_us Triggers have an index row in
   * the slice trigger index with the row prefix matching this time. Note that this field is
   * internal to gmail_cp and is ignored if set by external clients when adding / updating triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sliceFireTimeUs;

  /**
   * Trigger action to perform. This should always be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TriggerAction triggerAction;

  /**
   * The TriggerKey will uniquely determine a trigger within a given context. A context is a single
   * message for message triggers or a single account for account triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TriggerKey triggerKey;

  /**
   * Each dispatcher should use an enum to for the actions that it supports. If a dispatcher has
   * only one action, this does not need to be set. (It can be expanded later, defining the default
   * behaviour as type 0.) For purposes such as batching, the type of a trigger is (dispatcher,
   * action_type).
   * @return value or {@code null} for none
   */
  public java.lang.Long getActionType() {
    return actionType;
  }

  /**
   * Each dispatcher should use an enum to for the actions that it supports. If a dispatcher has
   * only one action, this does not need to be set. (It can be expanded later, defining the default
   * behaviour as type 0.) For purposes such as batching, the type of a trigger is (dispatcher,
   * action_type).
   * @param actionType actionType or {@code null} for none
   */
  public Trigger setActionType(java.lang.Long actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * Maximum possible delay in micros that can be tolerated so triggers can be batched, which makes
   * processing more efficient compared to firing triggers individually. Note that the actual fire
   * time will be somewhere in the timerange interval [fire_time_us, fire_time_us + batch_time_us).
   * @return value or {@code null} for none
   */
  public java.lang.Long getBatchTimeUs() {
    return batchTimeUs;
  }

  /**
   * Maximum possible delay in micros that can be tolerated so triggers can be batched, which makes
   * processing more efficient compared to firing triggers individually. Note that the actual fire
   * time will be somewhere in the timerange interval [fire_time_us, fire_time_us + batch_time_us).
   * @param batchTimeUs batchTimeUs or {@code null} for none
   */
  public Trigger setBatchTimeUs(java.lang.Long batchTimeUs) {
    this.batchTimeUs = batchTimeUs;
    return this;
  }

  /**
   * Must be set for DISPATCHER_STUBBY_DISPATCHER.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDispatchId() {
    return dispatchId;
  }

  /**
   * Must be set for DISPATCHER_STUBBY_DISPATCHER.
   * @param dispatchId dispatchId or {@code null} for none
   */
  public Trigger setDispatchId(java.lang.Long dispatchId) {
    this.dispatchId = dispatchId;
    return this;
  }

  /**
   * Which server should interpret action_type.
   * @return value or {@code null} for none
   */
  public java.lang.String getDispatcher() {
    return dispatcher;
  }

  /**
   * Which server should interpret action_type.
   * @param dispatcher dispatcher or {@code null} for none
   */
  public Trigger setDispatcher(java.lang.String dispatcher) {
    this.dispatcher = dispatcher;
    return this;
  }

  /**
   * Earliest time to fire at in microseconds. The actual time that the trigger will fire will be in
   * the timerange: [fire_time_us, fire_time_us + batch_time_us).
   * @return value or {@code null} for none
   */
  public java.lang.Long getFireTimeUs() {
    return fireTimeUs;
  }

  /**
   * Earliest time to fire at in microseconds. The actual time that the trigger will fire will be in
   * the timerange: [fire_time_us, fire_time_us + batch_time_us).
   * @param fireTimeUs fireTimeUs or {@code null} for none
   */
  public Trigger setFireTimeUs(java.lang.Long fireTimeUs) {
    this.fireTimeUs = fireTimeUs;
    return this;
  }

  /**
   * Must be set for DISPATCHER_JOBSETTED_PRIMARY.
   * @return value or {@code null} for none
   */
  public JobsettedServerSpec getJobsettedServerSpec() {
    return jobsettedServerSpec;
  }

  /**
   * Must be set for DISPATCHER_JOBSETTED_PRIMARY.
   * @param jobsettedServerSpec jobsettedServerSpec or {@code null} for none
   */
  public Trigger setJobsettedServerSpec(JobsettedServerSpec jobsettedServerSpec) {
    this.jobsettedServerSpec = jobsettedServerSpec;
    return this;
  }

  /**
   * The trigger key, if applicable.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * The trigger key, if applicable.
   * @param key key or {@code null} for none
   */
  public Trigger setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public RpcOptions getRpcOptions() {
    return rpcOptions;
  }

  /**
   * @param rpcOptions rpcOptions or {@code null} for none
   */
  public Trigger setRpcOptions(RpcOptions rpcOptions) {
    this.rpcOptions = rpcOptions;
    return this;
  }

  /**
   * The slice_fire_time_us is automatically computed and stored as part of the trigger write. It
   * represents the exact fire time at which the trigger will be queued to fire and will satisfy
   * fire_time_us < slice_fire_time_us <= fire_time_us + batch_time_us Triggers have an index row in
   * the slice trigger index with the row prefix matching this time. Note that this field is
   * internal to gmail_cp and is ignored if set by external clients when adding / updating triggers.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSliceFireTimeUs() {
    return sliceFireTimeUs;
  }

  /**
   * The slice_fire_time_us is automatically computed and stored as part of the trigger write. It
   * represents the exact fire time at which the trigger will be queued to fire and will satisfy
   * fire_time_us < slice_fire_time_us <= fire_time_us + batch_time_us Triggers have an index row in
   * the slice trigger index with the row prefix matching this time. Note that this field is
   * internal to gmail_cp and is ignored if set by external clients when adding / updating triggers.
   * @param sliceFireTimeUs sliceFireTimeUs or {@code null} for none
   */
  public Trigger setSliceFireTimeUs(java.lang.Long sliceFireTimeUs) {
    this.sliceFireTimeUs = sliceFireTimeUs;
    return this;
  }

  /**
   * Trigger action to perform. This should always be set.
   * @return value or {@code null} for none
   */
  public TriggerAction getTriggerAction() {
    return triggerAction;
  }

  /**
   * Trigger action to perform. This should always be set.
   * @param triggerAction triggerAction or {@code null} for none
   */
  public Trigger setTriggerAction(TriggerAction triggerAction) {
    this.triggerAction = triggerAction;
    return this;
  }

  /**
   * The TriggerKey will uniquely determine a trigger within a given context. A context is a single
   * message for message triggers or a single account for account triggers.
   * @return value or {@code null} for none
   */
  public TriggerKey getTriggerKey() {
    return triggerKey;
  }

  /**
   * The TriggerKey will uniquely determine a trigger within a given context. A context is a single
   * message for message triggers or a single account for account triggers.
   * @param triggerKey triggerKey or {@code null} for none
   */
  public Trigger setTriggerKey(TriggerKey triggerKey) {
    this.triggerKey = triggerKey;
    return this;
  }

  @Override
  public Trigger set(String fieldName, Object value) {
    return (Trigger) super.set(fieldName, value);
  }

  @Override
  public Trigger clone() {
    return (Trigger) super.clone();
  }

}
