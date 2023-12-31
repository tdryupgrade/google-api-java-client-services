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

package com.google.api.services.cloudasset.v1.model;

/**
 * The response message for AssetService.AnalyzeOrgPolicies.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnalyzeOrgPoliciesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The definition of the constraint in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AnalyzerOrgPolicyConstraint constraint;

  /**
   * The page token to fetch the next page for AnalyzeOrgPoliciesResponse.org_policy_results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The organization policies under the AnalyzeOrgPoliciesRequest.scope with the
   * AnalyzeOrgPoliciesRequest.constraint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrgPolicyResult> orgPolicyResults;

  /**
   * The definition of the constraint in the request.
   * @return value or {@code null} for none
   */
  public AnalyzerOrgPolicyConstraint getConstraint() {
    return constraint;
  }

  /**
   * The definition of the constraint in the request.
   * @param constraint constraint or {@code null} for none
   */
  public AnalyzeOrgPoliciesResponse setConstraint(AnalyzerOrgPolicyConstraint constraint) {
    this.constraint = constraint;
    return this;
  }

  /**
   * The page token to fetch the next page for AnalyzeOrgPoliciesResponse.org_policy_results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The page token to fetch the next page for AnalyzeOrgPoliciesResponse.org_policy_results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public AnalyzeOrgPoliciesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The organization policies under the AnalyzeOrgPoliciesRequest.scope with the
   * AnalyzeOrgPoliciesRequest.constraint.
   * @return value or {@code null} for none
   */
  public java.util.List<OrgPolicyResult> getOrgPolicyResults() {
    return orgPolicyResults;
  }

  /**
   * The organization policies under the AnalyzeOrgPoliciesRequest.scope with the
   * AnalyzeOrgPoliciesRequest.constraint.
   * @param orgPolicyResults orgPolicyResults or {@code null} for none
   */
  public AnalyzeOrgPoliciesResponse setOrgPolicyResults(java.util.List<OrgPolicyResult> orgPolicyResults) {
    this.orgPolicyResults = orgPolicyResults;
    return this;
  }

  @Override
  public AnalyzeOrgPoliciesResponse set(String fieldName, Object value) {
    return (AnalyzeOrgPoliciesResponse) super.set(fieldName, value);
  }

  @Override
  public AnalyzeOrgPoliciesResponse clone() {
    return (AnalyzeOrgPoliciesResponse) super.clone();
  }

}
