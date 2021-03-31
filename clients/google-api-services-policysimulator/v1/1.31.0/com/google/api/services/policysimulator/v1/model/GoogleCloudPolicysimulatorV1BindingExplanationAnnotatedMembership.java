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

package com.google.api.services.policysimulator.v1.model;

/**
 * Details about whether the binding includes the member.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Policy Simulator API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPolicysimulatorV1BindingExplanationAnnotatedMembership extends com.google.api.client.json.GenericJson {

  /**
   * Indicates whether the binding includes the member.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String membership;

  /**
   * The relevance of the member's status to the overall determination for the binding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relevance;

  /**
   * Indicates whether the binding includes the member.
   * @return value or {@code null} for none
   */
  public java.lang.String getMembership() {
    return membership;
  }

  /**
   * Indicates whether the binding includes the member.
   * @param membership membership or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1BindingExplanationAnnotatedMembership setMembership(java.lang.String membership) {
    this.membership = membership;
    return this;
  }

  /**
   * The relevance of the member's status to the overall determination for the binding.
   * @return value or {@code null} for none
   */
  public java.lang.String getRelevance() {
    return relevance;
  }

  /**
   * The relevance of the member's status to the overall determination for the binding.
   * @param relevance relevance or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1BindingExplanationAnnotatedMembership setRelevance(java.lang.String relevance) {
    this.relevance = relevance;
    return this;
  }

  @Override
  public GoogleCloudPolicysimulatorV1BindingExplanationAnnotatedMembership set(String fieldName, Object value) {
    return (GoogleCloudPolicysimulatorV1BindingExplanationAnnotatedMembership) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPolicysimulatorV1BindingExplanationAnnotatedMembership clone() {
    return (GoogleCloudPolicysimulatorV1BindingExplanationAnnotatedMembership) super.clone();
  }

}
