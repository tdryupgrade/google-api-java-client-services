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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Message that gets returned from the Provider Selection Library (PSL). It encodes the scores,
 * applied policies, and pruning decisions for a given provider candidate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantContextProviderSelectionResult extends com.google.api.client.json.GenericJson {

  /**
   * Alternative bucketed score for use by downstream ranking providers. A raw numeric score is
   * subject to semantic-drift, while a bucket is not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bucketedFinalScore;

  /**
   * Final score in the range [0,1] that can be used for ranking providers. Incorporates both policy
   * rules and quality considerations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float finalScore;

  /**
   * List of business policies applied to the candidate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AssistantContextProviderSelectionPolicy> policyApplied;

  static {
    // hack to force ProGuard to consider AssistantContextProviderSelectionPolicy used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AssistantContextProviderSelectionPolicy.class);
  }

  /**
   * Indicates whether the candidate should be pruned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean shouldPrune;

  /**
   * Alternative bucketed score for use by downstream ranking providers. A raw numeric score is
   * subject to semantic-drift, while a bucket is not.
   * @return value or {@code null} for none
   */
  public java.lang.String getBucketedFinalScore() {
    return bucketedFinalScore;
  }

  /**
   * Alternative bucketed score for use by downstream ranking providers. A raw numeric score is
   * subject to semantic-drift, while a bucket is not.
   * @param bucketedFinalScore bucketedFinalScore or {@code null} for none
   */
  public AssistantContextProviderSelectionResult setBucketedFinalScore(java.lang.String bucketedFinalScore) {
    this.bucketedFinalScore = bucketedFinalScore;
    return this;
  }

  /**
   * Final score in the range [0,1] that can be used for ranking providers. Incorporates both policy
   * rules and quality considerations.
   * @return value or {@code null} for none
   */
  public java.lang.Float getFinalScore() {
    return finalScore;
  }

  /**
   * Final score in the range [0,1] that can be used for ranking providers. Incorporates both policy
   * rules and quality considerations.
   * @param finalScore finalScore or {@code null} for none
   */
  public AssistantContextProviderSelectionResult setFinalScore(java.lang.Float finalScore) {
    this.finalScore = finalScore;
    return this;
  }

  /**
   * List of business policies applied to the candidate.
   * @return value or {@code null} for none
   */
  public java.util.List<AssistantContextProviderSelectionPolicy> getPolicyApplied() {
    return policyApplied;
  }

  /**
   * List of business policies applied to the candidate.
   * @param policyApplied policyApplied or {@code null} for none
   */
  public AssistantContextProviderSelectionResult setPolicyApplied(java.util.List<AssistantContextProviderSelectionPolicy> policyApplied) {
    this.policyApplied = policyApplied;
    return this;
  }

  /**
   * Indicates whether the candidate should be pruned.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShouldPrune() {
    return shouldPrune;
  }

  /**
   * Indicates whether the candidate should be pruned.
   * @param shouldPrune shouldPrune or {@code null} for none
   */
  public AssistantContextProviderSelectionResult setShouldPrune(java.lang.Boolean shouldPrune) {
    this.shouldPrune = shouldPrune;
    return this;
  }

  @Override
  public AssistantContextProviderSelectionResult set(String fieldName, Object value) {
    return (AssistantContextProviderSelectionResult) super.set(fieldName, value);
  }

  @Override
  public AssistantContextProviderSelectionResult clone() {
    return (AssistantContextProviderSelectionResult) super.clone();
  }

}
