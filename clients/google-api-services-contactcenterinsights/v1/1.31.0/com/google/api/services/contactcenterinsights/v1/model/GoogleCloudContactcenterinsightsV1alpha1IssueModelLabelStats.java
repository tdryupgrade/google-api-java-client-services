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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * Aggregated statistics about an issue model.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats extends com.google.api.client.json.GenericJson {

  /**
   * Number of conversations the issue model has analyzed at this point in time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long analyzedConversationsCount;

  /**
   * Statistics on each issue. Key is the issue's resource name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStatsIssueStats> issueStats;

  /**
   * Number of analyzed conversations for which no issue was applicable at this point in time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long unclassifiedConversationsCount;

  /**
   * Number of conversations the issue model has analyzed at this point in time.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAnalyzedConversationsCount() {
    return analyzedConversationsCount;
  }

  /**
   * Number of conversations the issue model has analyzed at this point in time.
   * @param analyzedConversationsCount analyzedConversationsCount or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats setAnalyzedConversationsCount(java.lang.Long analyzedConversationsCount) {
    this.analyzedConversationsCount = analyzedConversationsCount;
    return this;
  }

  /**
   * Statistics on each issue. Key is the issue's resource name.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStatsIssueStats> getIssueStats() {
    return issueStats;
  }

  /**
   * Statistics on each issue. Key is the issue's resource name.
   * @param issueStats issueStats or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats setIssueStats(java.util.Map<String, GoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStatsIssueStats> issueStats) {
    this.issueStats = issueStats;
    return this;
  }

  /**
   * Number of analyzed conversations for which no issue was applicable at this point in time.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUnclassifiedConversationsCount() {
    return unclassifiedConversationsCount;
  }

  /**
   * Number of analyzed conversations for which no issue was applicable at this point in time.
   * @param unclassifiedConversationsCount unclassifiedConversationsCount or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats setUnclassifiedConversationsCount(java.lang.Long unclassifiedConversationsCount) {
    this.unclassifiedConversationsCount = unclassifiedConversationsCount;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats clone() {
    return (GoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats) super.clone();
  }

}
