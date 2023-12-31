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

package com.google.api.services.container.model;

/**
 * Standard rollout policy is the default policy for blue-green.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StandardRolloutPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Number of blue nodes to drain in a batch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer batchNodeCount;

  /**
   * Percentage of the bool pool nodes to drain in a batch. The range of this field should be (0.0,
   * 1.0].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float batchPercentage;

  /**
   * Soak time after each batch gets drained. Default to zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String batchSoakDuration;

  /**
   * Number of blue nodes to drain in a batch.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBatchNodeCount() {
    return batchNodeCount;
  }

  /**
   * Number of blue nodes to drain in a batch.
   * @param batchNodeCount batchNodeCount or {@code null} for none
   */
  public StandardRolloutPolicy setBatchNodeCount(java.lang.Integer batchNodeCount) {
    this.batchNodeCount = batchNodeCount;
    return this;
  }

  /**
   * Percentage of the bool pool nodes to drain in a batch. The range of this field should be (0.0,
   * 1.0].
   * @return value or {@code null} for none
   */
  public java.lang.Float getBatchPercentage() {
    return batchPercentage;
  }

  /**
   * Percentage of the bool pool nodes to drain in a batch. The range of this field should be (0.0,
   * 1.0].
   * @param batchPercentage batchPercentage or {@code null} for none
   */
  public StandardRolloutPolicy setBatchPercentage(java.lang.Float batchPercentage) {
    this.batchPercentage = batchPercentage;
    return this;
  }

  /**
   * Soak time after each batch gets drained. Default to zero.
   * @return value or {@code null} for none
   */
  public String getBatchSoakDuration() {
    return batchSoakDuration;
  }

  /**
   * Soak time after each batch gets drained. Default to zero.
   * @param batchSoakDuration batchSoakDuration or {@code null} for none
   */
  public StandardRolloutPolicy setBatchSoakDuration(String batchSoakDuration) {
    this.batchSoakDuration = batchSoakDuration;
    return this;
  }

  @Override
  public StandardRolloutPolicy set(String fieldName, Object value) {
    return (StandardRolloutPolicy) super.set(fieldName, value);
  }

  @Override
  public StandardRolloutPolicy clone() {
    return (StandardRolloutPolicy) super.clone();
  }

}
