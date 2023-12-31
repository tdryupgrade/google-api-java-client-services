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

package com.google.api.services.jobs.v4.model;

/**
 * Custom ranking information for SearchJobsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomRankingInfo extends com.google.api.client.json.GenericJson {

  /**
   * Required. Controls over how important the score of CustomRankingInfo.ranking_expression gets
   * applied to job's final ranking position. An error is thrown if not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String importanceLevel;

  /**
   * Required. Controls over how job documents get ranked on top of existing relevance score
   * (determined by API algorithm). A combination of the ranking expression and relevance score is
   * used to determine job's final ranking position. The syntax for this expression is a subset of
   * Google SQL syntax. Supported operators are: +, -, *, /, where the left and right side of the
   * operator is either a numeric Job.custom_attributes key, integer/double value or an expression
   * that can be evaluated to a number. Parenthesis are supported to adjust calculation precedence.
   * The expression must be < 200 characters in length. The expression is considered invalid for a
   * job if the expression references custom attributes that are not populated on the job or if the
   * expression results in a divide by zero. If an expression is invalid for a job, that job is
   * demoted to the end of the results. Sample ranking expression (year + 25) * 0.25 - (freshness /
   * 0.5)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rankingExpression;

  /**
   * Required. Controls over how important the score of CustomRankingInfo.ranking_expression gets
   * applied to job's final ranking position. An error is thrown if not specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getImportanceLevel() {
    return importanceLevel;
  }

  /**
   * Required. Controls over how important the score of CustomRankingInfo.ranking_expression gets
   * applied to job's final ranking position. An error is thrown if not specified.
   * @param importanceLevel importanceLevel or {@code null} for none
   */
  public CustomRankingInfo setImportanceLevel(java.lang.String importanceLevel) {
    this.importanceLevel = importanceLevel;
    return this;
  }

  /**
   * Required. Controls over how job documents get ranked on top of existing relevance score
   * (determined by API algorithm). A combination of the ranking expression and relevance score is
   * used to determine job's final ranking position. The syntax for this expression is a subset of
   * Google SQL syntax. Supported operators are: +, -, *, /, where the left and right side of the
   * operator is either a numeric Job.custom_attributes key, integer/double value or an expression
   * that can be evaluated to a number. Parenthesis are supported to adjust calculation precedence.
   * The expression must be < 200 characters in length. The expression is considered invalid for a
   * job if the expression references custom attributes that are not populated on the job or if the
   * expression results in a divide by zero. If an expression is invalid for a job, that job is
   * demoted to the end of the results. Sample ranking expression (year + 25) * 0.25 - (freshness /
   * 0.5)
   * @return value or {@code null} for none
   */
  public java.lang.String getRankingExpression() {
    return rankingExpression;
  }

  /**
   * Required. Controls over how job documents get ranked on top of existing relevance score
   * (determined by API algorithm). A combination of the ranking expression and relevance score is
   * used to determine job's final ranking position. The syntax for this expression is a subset of
   * Google SQL syntax. Supported operators are: +, -, *, /, where the left and right side of the
   * operator is either a numeric Job.custom_attributes key, integer/double value or an expression
   * that can be evaluated to a number. Parenthesis are supported to adjust calculation precedence.
   * The expression must be < 200 characters in length. The expression is considered invalid for a
   * job if the expression references custom attributes that are not populated on the job or if the
   * expression results in a divide by zero. If an expression is invalid for a job, that job is
   * demoted to the end of the results. Sample ranking expression (year + 25) * 0.25 - (freshness /
   * 0.5)
   * @param rankingExpression rankingExpression or {@code null} for none
   */
  public CustomRankingInfo setRankingExpression(java.lang.String rankingExpression) {
    this.rankingExpression = rankingExpression;
    return this;
  }

  @Override
  public CustomRankingInfo set(String fieldName, Object value) {
    return (CustomRankingInfo) super.set(fieldName, value);
  }

  @Override
  public CustomRankingInfo clone() {
    return (CustomRankingInfo) super.clone();
  }

}
