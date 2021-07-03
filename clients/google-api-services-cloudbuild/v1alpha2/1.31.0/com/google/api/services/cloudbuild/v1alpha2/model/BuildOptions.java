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

package com.google.api.services.cloudbuild.v1alpha2.model;

/**
 * Optional arguments to enable specific features of builds.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildOptions extends com.google.api.client.json.GenericJson {

  /**
   * Requested disk size for the VM that runs the build. Note that this is *NOT* "disk free"; some
   * of the space will be used by the operating system and build utilities. Also note that this is
   * the minimum disk size that will be allocated for the build -- the build may run with a larger
   * disk than requested. At present, the maximum disk size is 1000GB; builds that request more than
   * the maximum are rejected with an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long diskSizeGb;

  /**
   * Option to specify whether or not to apply bash style string operations to the substitutions.
   * NOTE: this is always enabled for triggered builds and cannot be overridden in the build
   * configuration file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dynamicSubstitutions;

  /**
   * A list of global environment variable definitions that will exist for all build steps in this
   * build. If a variable is defined in both globally and in a build step, the variable will use the
   * build step value. The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> env;

  /**
   * Option to define build log streaming behavior to Google Cloud Storage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logStreamingOption;

  /**
   * Option to specify the logging mode, which determines if and where build logs are stored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logging;

  /**
   * Compute Engine machine type on which to run the build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * Optional. Specification for execution on a `WorkerPool`. See [running builds in a custom worker
   * pool](https://cloud.google.com/build/docs/custom-workers/run-builds-in-custom-worker-pool) for
   * more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PoolOption pool;

  /**
   * Requested verifiability options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestedVerifyOption;

  /**
   * A list of global environment variables, which are encrypted using a Cloud Key Management
   * Service crypto key. These values must be specified in the build's `Secret`. These variables
   * will be available to all build steps in this build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> secretEnv;

  /**
   * Requested hash for SourceProvenance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sourceProvenanceHash;

  /**
   * Option to specify behavior when there is an error in the substitution checks. NOTE: this is
   * always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build
   * configuration file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String substitutionOption;

  /**
   * Global list of volumes to mount for ALL build steps Each volume is created as an empty volume
   * prior to starting the build process. Upon completion of the build, volumes and their contents
   * are discarded. Global volume names and paths cannot conflict with the volumes defined a build
   * step. Using a global volume in a build with only one step is not valid as it is indicative of a
   * build request with an incorrect configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Volume> volumes;

  /**
   * This field deprecated; please use `pool.name` instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workerPool;

  /**
   * Requested disk size for the VM that runs the build. Note that this is *NOT* "disk free"; some
   * of the space will be used by the operating system and build utilities. Also note that this is
   * the minimum disk size that will be allocated for the build -- the build may run with a larger
   * disk than requested. At present, the maximum disk size is 1000GB; builds that request more than
   * the maximum are rejected with an error.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDiskSizeGb() {
    return diskSizeGb;
  }

  /**
   * Requested disk size for the VM that runs the build. Note that this is *NOT* "disk free"; some
   * of the space will be used by the operating system and build utilities. Also note that this is
   * the minimum disk size that will be allocated for the build -- the build may run with a larger
   * disk than requested. At present, the maximum disk size is 1000GB; builds that request more than
   * the maximum are rejected with an error.
   * @param diskSizeGb diskSizeGb or {@code null} for none
   */
  public BuildOptions setDiskSizeGb(java.lang.Long diskSizeGb) {
    this.diskSizeGb = diskSizeGb;
    return this;
  }

  /**
   * Option to specify whether or not to apply bash style string operations to the substitutions.
   * NOTE: this is always enabled for triggered builds and cannot be overridden in the build
   * configuration file.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDynamicSubstitutions() {
    return dynamicSubstitutions;
  }

  /**
   * Option to specify whether or not to apply bash style string operations to the substitutions.
   * NOTE: this is always enabled for triggered builds and cannot be overridden in the build
   * configuration file.
   * @param dynamicSubstitutions dynamicSubstitutions or {@code null} for none
   */
  public BuildOptions setDynamicSubstitutions(java.lang.Boolean dynamicSubstitutions) {
    this.dynamicSubstitutions = dynamicSubstitutions;
    return this;
  }

  /**
   * A list of global environment variable definitions that will exist for all build steps in this
   * build. If a variable is defined in both globally and in a build step, the variable will use the
   * build step value. The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnv() {
    return env;
  }

  /**
   * A list of global environment variable definitions that will exist for all build steps in this
   * build. If a variable is defined in both globally and in a build step, the variable will use the
   * build step value. The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * @param env env or {@code null} for none
   */
  public BuildOptions setEnv(java.util.List<java.lang.String> env) {
    this.env = env;
    return this;
  }

  /**
   * Option to define build log streaming behavior to Google Cloud Storage.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogStreamingOption() {
    return logStreamingOption;
  }

  /**
   * Option to define build log streaming behavior to Google Cloud Storage.
   * @param logStreamingOption logStreamingOption or {@code null} for none
   */
  public BuildOptions setLogStreamingOption(java.lang.String logStreamingOption) {
    this.logStreamingOption = logStreamingOption;
    return this;
  }

  /**
   * Option to specify the logging mode, which determines if and where build logs are stored.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogging() {
    return logging;
  }

  /**
   * Option to specify the logging mode, which determines if and where build logs are stored.
   * @param logging logging or {@code null} for none
   */
  public BuildOptions setLogging(java.lang.String logging) {
    this.logging = logging;
    return this;
  }

  /**
   * Compute Engine machine type on which to run the build.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * Compute Engine machine type on which to run the build.
   * @param machineType machineType or {@code null} for none
   */
  public BuildOptions setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * Optional. Specification for execution on a `WorkerPool`. See [running builds in a custom worker
   * pool](https://cloud.google.com/build/docs/custom-workers/run-builds-in-custom-worker-pool) for
   * more information.
   * @return value or {@code null} for none
   */
  public PoolOption getPool() {
    return pool;
  }

  /**
   * Optional. Specification for execution on a `WorkerPool`. See [running builds in a custom worker
   * pool](https://cloud.google.com/build/docs/custom-workers/run-builds-in-custom-worker-pool) for
   * more information.
   * @param pool pool or {@code null} for none
   */
  public BuildOptions setPool(PoolOption pool) {
    this.pool = pool;
    return this;
  }

  /**
   * Requested verifiability options.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestedVerifyOption() {
    return requestedVerifyOption;
  }

  /**
   * Requested verifiability options.
   * @param requestedVerifyOption requestedVerifyOption or {@code null} for none
   */
  public BuildOptions setRequestedVerifyOption(java.lang.String requestedVerifyOption) {
    this.requestedVerifyOption = requestedVerifyOption;
    return this;
  }

  /**
   * A list of global environment variables, which are encrypted using a Cloud Key Management
   * Service crypto key. These values must be specified in the build's `Secret`. These variables
   * will be available to all build steps in this build.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSecretEnv() {
    return secretEnv;
  }

  /**
   * A list of global environment variables, which are encrypted using a Cloud Key Management
   * Service crypto key. These values must be specified in the build's `Secret`. These variables
   * will be available to all build steps in this build.
   * @param secretEnv secretEnv or {@code null} for none
   */
  public BuildOptions setSecretEnv(java.util.List<java.lang.String> secretEnv) {
    this.secretEnv = secretEnv;
    return this;
  }

  /**
   * Requested hash for SourceProvenance.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSourceProvenanceHash() {
    return sourceProvenanceHash;
  }

  /**
   * Requested hash for SourceProvenance.
   * @param sourceProvenanceHash sourceProvenanceHash or {@code null} for none
   */
  public BuildOptions setSourceProvenanceHash(java.util.List<java.lang.String> sourceProvenanceHash) {
    this.sourceProvenanceHash = sourceProvenanceHash;
    return this;
  }

  /**
   * Option to specify behavior when there is an error in the substitution checks. NOTE: this is
   * always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build
   * configuration file.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubstitutionOption() {
    return substitutionOption;
  }

  /**
   * Option to specify behavior when there is an error in the substitution checks. NOTE: this is
   * always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build
   * configuration file.
   * @param substitutionOption substitutionOption or {@code null} for none
   */
  public BuildOptions setSubstitutionOption(java.lang.String substitutionOption) {
    this.substitutionOption = substitutionOption;
    return this;
  }

  /**
   * Global list of volumes to mount for ALL build steps Each volume is created as an empty volume
   * prior to starting the build process. Upon completion of the build, volumes and their contents
   * are discarded. Global volume names and paths cannot conflict with the volumes defined a build
   * step. Using a global volume in a build with only one step is not valid as it is indicative of a
   * build request with an incorrect configuration.
   * @return value or {@code null} for none
   */
  public java.util.List<Volume> getVolumes() {
    return volumes;
  }

  /**
   * Global list of volumes to mount for ALL build steps Each volume is created as an empty volume
   * prior to starting the build process. Upon completion of the build, volumes and their contents
   * are discarded. Global volume names and paths cannot conflict with the volumes defined a build
   * step. Using a global volume in a build with only one step is not valid as it is indicative of a
   * build request with an incorrect configuration.
   * @param volumes volumes or {@code null} for none
   */
  public BuildOptions setVolumes(java.util.List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  /**
   * This field deprecated; please use `pool.name` instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkerPool() {
    return workerPool;
  }

  /**
   * This field deprecated; please use `pool.name` instead.
   * @param workerPool workerPool or {@code null} for none
   */
  public BuildOptions setWorkerPool(java.lang.String workerPool) {
    this.workerPool = workerPool;
    return this;
  }

  @Override
  public BuildOptions set(String fieldName, Object value) {
    return (BuildOptions) super.set(fieldName, value);
  }

  @Override
  public BuildOptions clone() {
    return (BuildOptions) super.clone();
  }

}
