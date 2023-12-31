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

package com.google.api.services.recommendationengine.v1beta1.model;

/**
 * Response message for predict method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommendations AI (Beta). For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommendationengineV1beta1PredictResponse extends com.google.api.client.json.GenericJson {

  /**
   * True if the dryRun property was set in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dryRun;

  /**
   * IDs of items in the request that were missing from the catalog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> itemsMissingInCatalog;

  /**
   * Additional domain specific prediction response metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> metadata;

  /**
   * If empty, the list is complete. If nonempty, the token to pass to the next request's
   * PredictRequest.page_token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A unique recommendation token. This should be included in the user event logs resulting from
   * this recommendation, which enables accurate attribution of recommendation model performance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recommendationToken;

  /**
   * A list of recommended items. The order represents the ranking (from the most relevant item to
   * the least).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult> results;

  /**
   * True if the dryRun property was set in the request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDryRun() {
    return dryRun;
  }

  /**
   * True if the dryRun property was set in the request.
   * @param dryRun dryRun or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictResponse setDryRun(java.lang.Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * IDs of items in the request that were missing from the catalog.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getItemsMissingInCatalog() {
    return itemsMissingInCatalog;
  }

  /**
   * IDs of items in the request that were missing from the catalog.
   * @param itemsMissingInCatalog itemsMissingInCatalog or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictResponse setItemsMissingInCatalog(java.util.List<java.lang.String> itemsMissingInCatalog) {
    this.itemsMissingInCatalog = itemsMissingInCatalog;
    return this;
  }

  /**
   * Additional domain specific prediction response metadata.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getMetadata() {
    return metadata;
  }

  /**
   * Additional domain specific prediction response metadata.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictResponse setMetadata(java.util.Map<String, java.lang.Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * If empty, the list is complete. If nonempty, the token to pass to the next request's
   * PredictRequest.page_token.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If empty, the list is complete. If nonempty, the token to pass to the next request's
   * PredictRequest.page_token.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A unique recommendation token. This should be included in the user event logs resulting from
   * this recommendation, which enables accurate attribution of recommendation model performance.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecommendationToken() {
    return recommendationToken;
  }

  /**
   * A unique recommendation token. This should be included in the user event logs resulting from
   * this recommendation, which enables accurate attribution of recommendation model performance.
   * @param recommendationToken recommendationToken or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictResponse setRecommendationToken(java.lang.String recommendationToken) {
    this.recommendationToken = recommendationToken;
    return this;
  }

  /**
   * A list of recommended items. The order represents the ranking (from the most relevant item to
   * the least).
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult> getResults() {
    return results;
  }

  /**
   * A list of recommended items. The order represents the ranking (from the most relevant item to
   * the least).
   * @param results results or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictResponse setResults(java.util.List<GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult> results) {
    this.results = results;
    return this;
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1PredictResponse set(String fieldName, Object value) {
    return (GoogleCloudRecommendationengineV1beta1PredictResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1PredictResponse clone() {
    return (GoogleCloudRecommendationengineV1beta1PredictResponse) super.clone();
  }

}
