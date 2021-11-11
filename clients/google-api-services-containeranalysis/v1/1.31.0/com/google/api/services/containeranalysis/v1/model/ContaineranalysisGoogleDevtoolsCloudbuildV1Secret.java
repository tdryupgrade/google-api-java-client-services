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

package com.google.api.services.containeranalysis.v1.model;

/**
 * Pairs a set of secret environment variables containing encrypted values with the Cloud KMS key to
 * use to decrypt the value. Note: Use `kmsKeyName` with `available_secrets` instead of using
 * `kmsKeyName` with `secret`. For instructions see: https://cloud.google.com/cloud-build/docs
 * /securing-builds/use-encrypted-credentials.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ContaineranalysisGoogleDevtoolsCloudbuildV1Secret extends com.google.api.client.json.GenericJson {

  /**
   * Cloud KMS key name to use to decrypt these envs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyName;

  /**
   * Map of environment variable name to its encrypted value. Secret environment variables must be
   * unique across all of a build's secrets, and must be used by at least one build step. Values can
   * be at most 64 KB in size. There can be at most 100 secret values across all of a build's
   * secrets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> secretEnv;

  /**
   * Cloud KMS key name to use to decrypt these envs.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyName() {
    return kmsKeyName;
  }

  /**
   * Cloud KMS key name to use to decrypt these envs.
   * @param kmsKeyName kmsKeyName or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1Secret setKmsKeyName(java.lang.String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  /**
   * Map of environment variable name to its encrypted value. Secret environment variables must be
   * unique across all of a build's secrets, and must be used by at least one build step. Values can
   * be at most 64 KB in size. There can be at most 100 secret values across all of a build's
   * secrets.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getSecretEnv() {
    return secretEnv;
  }

  /**
   * Map of environment variable name to its encrypted value. Secret environment variables must be
   * unique across all of a build's secrets, and must be used by at least one build step. Values can
   * be at most 64 KB in size. There can be at most 100 secret values across all of a build's
   * secrets.
   * @param secretEnv secretEnv or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1Secret setSecretEnv(java.util.Map<String, java.lang.String> secretEnv) {
    this.secretEnv = secretEnv;
    return this;
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1Secret set(String fieldName, Object value) {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1Secret) super.set(fieldName, value);
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1Secret clone() {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1Secret) super.clone();
  }

}
