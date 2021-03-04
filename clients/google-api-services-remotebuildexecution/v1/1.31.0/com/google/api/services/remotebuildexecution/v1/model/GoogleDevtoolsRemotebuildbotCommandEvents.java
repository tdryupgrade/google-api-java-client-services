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

package com.google.api.services.remotebuildexecution.v1.model;

/**
 * CommandEvents contains counters for the number of warnings and errors that occurred during the
 * execution of a command.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemotebuildbotCommandEvents extends com.google.api.client.json.GenericJson {

  /**
   * Indicates if and how Container Manager is being used for task execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cmUsage;

  /**
   * Indicates whether we are using a cached Docker image (true) or had to pull the Docker image
   * (false) for this command.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dockerCacheHit;

  /**
   * Docker Image name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dockerImageName;

  /**
   * The input cache miss ratio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float inputCacheMiss;

  /**
   * The number of errors reported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger numErrors;

  /**
   * The number of warnings reported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger numWarnings;

  /**
   * Indicates whether output files and/or output directories were found relative to the execution
   * root or to the user provided work directory or both or none.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputLocation;

  /**
   * Indicates whether an asynchronous container was used for execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean usedAsyncContainer;

  /**
   * Indicates if and how Container Manager is being used for task execution.
   * @return value or {@code null} for none
   */
  public java.lang.String getCmUsage() {
    return cmUsage;
  }

  /**
   * Indicates if and how Container Manager is being used for task execution.
   * @param cmUsage cmUsage or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandEvents setCmUsage(java.lang.String cmUsage) {
    this.cmUsage = cmUsage;
    return this;
  }

  /**
   * Indicates whether we are using a cached Docker image (true) or had to pull the Docker image
   * (false) for this command.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDockerCacheHit() {
    return dockerCacheHit;
  }

  /**
   * Indicates whether we are using a cached Docker image (true) or had to pull the Docker image
   * (false) for this command.
   * @param dockerCacheHit dockerCacheHit or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandEvents setDockerCacheHit(java.lang.Boolean dockerCacheHit) {
    this.dockerCacheHit = dockerCacheHit;
    return this;
  }

  /**
   * Docker Image name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDockerImageName() {
    return dockerImageName;
  }

  /**
   * Docker Image name.
   * @param dockerImageName dockerImageName or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandEvents setDockerImageName(java.lang.String dockerImageName) {
    this.dockerImageName = dockerImageName;
    return this;
  }

  /**
   * The input cache miss ratio.
   * @return value or {@code null} for none
   */
  public java.lang.Float getInputCacheMiss() {
    return inputCacheMiss;
  }

  /**
   * The input cache miss ratio.
   * @param inputCacheMiss inputCacheMiss or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandEvents setInputCacheMiss(java.lang.Float inputCacheMiss) {
    this.inputCacheMiss = inputCacheMiss;
    return this;
  }

  /**
   * The number of errors reported.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getNumErrors() {
    return numErrors;
  }

  /**
   * The number of errors reported.
   * @param numErrors numErrors or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandEvents setNumErrors(java.math.BigInteger numErrors) {
    this.numErrors = numErrors;
    return this;
  }

  /**
   * The number of warnings reported.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getNumWarnings() {
    return numWarnings;
  }

  /**
   * The number of warnings reported.
   * @param numWarnings numWarnings or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandEvents setNumWarnings(java.math.BigInteger numWarnings) {
    this.numWarnings = numWarnings;
    return this;
  }

  /**
   * Indicates whether output files and/or output directories were found relative to the execution
   * root or to the user provided work directory or both or none.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputLocation() {
    return outputLocation;
  }

  /**
   * Indicates whether output files and/or output directories were found relative to the execution
   * root or to the user provided work directory or both or none.
   * @param outputLocation outputLocation or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandEvents setOutputLocation(java.lang.String outputLocation) {
    this.outputLocation = outputLocation;
    return this;
  }

  /**
   * Indicates whether an asynchronous container was used for execution.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUsedAsyncContainer() {
    return usedAsyncContainer;
  }

  /**
   * Indicates whether an asynchronous container was used for execution.
   * @param usedAsyncContainer usedAsyncContainer or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildbotCommandEvents setUsedAsyncContainer(java.lang.Boolean usedAsyncContainer) {
    this.usedAsyncContainer = usedAsyncContainer;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildbotCommandEvents set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildbotCommandEvents) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildbotCommandEvents clone() {
    return (GoogleDevtoolsRemotebuildbotCommandEvents) super.clone();
  }

}
