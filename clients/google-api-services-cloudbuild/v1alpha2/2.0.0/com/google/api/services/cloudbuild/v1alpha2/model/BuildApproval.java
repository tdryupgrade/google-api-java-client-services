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
 * BuildApproval describes a build's approval configuration, state, and result.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildApproval extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Configuration for manual approval of this build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApprovalConfig config;

  /**
   * Output only. Result of manual approval for this Build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApprovalResult result;

  /**
   * Output only. The state of this build's approval.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Configuration for manual approval of this build.
   * @return value or {@code null} for none
   */
  public ApprovalConfig getConfig() {
    return config;
  }

  /**
   * Output only. Configuration for manual approval of this build.
   * @param config config or {@code null} for none
   */
  public BuildApproval setConfig(ApprovalConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Output only. Result of manual approval for this Build.
   * @return value or {@code null} for none
   */
  public ApprovalResult getResult() {
    return result;
  }

  /**
   * Output only. Result of manual approval for this Build.
   * @param result result or {@code null} for none
   */
  public BuildApproval setResult(ApprovalResult result) {
    this.result = result;
    return this;
  }

  /**
   * Output only. The state of this build's approval.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of this build's approval.
   * @param state state or {@code null} for none
   */
  public BuildApproval setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public BuildApproval set(String fieldName, Object value) {
    return (BuildApproval) super.set(fieldName, value);
  }

  @Override
  public BuildApproval clone() {
    return (BuildApproval) super.clone();
  }

}
