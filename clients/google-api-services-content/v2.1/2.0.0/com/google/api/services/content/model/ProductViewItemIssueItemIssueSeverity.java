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

package com.google.api.services.content.model;

/**
 * Severity of an issue per destination in a region, and aggregated severity.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductViewItemIssueItemIssueSeverity extends com.google.api.client.json.GenericJson {

  /**
   * Severity of an issue aggregated for destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aggregatedSeverity;

  /**
   * Item issue severity for every destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ProductViewItemIssueIssueSeverityPerDestination> severityPerDestination;

  static {
    // hack to force ProGuard to consider ProductViewItemIssueIssueSeverityPerDestination used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ProductViewItemIssueIssueSeverityPerDestination.class);
  }

  /**
   * Severity of an issue aggregated for destination.
   * @return value or {@code null} for none
   */
  public java.lang.String getAggregatedSeverity() {
    return aggregatedSeverity;
  }

  /**
   * Severity of an issue aggregated for destination.
   * @param aggregatedSeverity aggregatedSeverity or {@code null} for none
   */
  public ProductViewItemIssueItemIssueSeverity setAggregatedSeverity(java.lang.String aggregatedSeverity) {
    this.aggregatedSeverity = aggregatedSeverity;
    return this;
  }

  /**
   * Item issue severity for every destination.
   * @return value or {@code null} for none
   */
  public java.util.List<ProductViewItemIssueIssueSeverityPerDestination> getSeverityPerDestination() {
    return severityPerDestination;
  }

  /**
   * Item issue severity for every destination.
   * @param severityPerDestination severityPerDestination or {@code null} for none
   */
  public ProductViewItemIssueItemIssueSeverity setSeverityPerDestination(java.util.List<ProductViewItemIssueIssueSeverityPerDestination> severityPerDestination) {
    this.severityPerDestination = severityPerDestination;
    return this;
  }

  @Override
  public ProductViewItemIssueItemIssueSeverity set(String fieldName, Object value) {
    return (ProductViewItemIssueItemIssueSeverity) super.set(fieldName, value);
  }

  @Override
  public ProductViewItemIssueItemIssueSeverity clone() {
    return (ProductViewItemIssueItemIssueSeverity) super.clone();
  }

}
