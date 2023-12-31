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

package com.google.api.services.beyondcorp.v1alpha.model;

/**
 * The response for the configured insight.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BeyondCorp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Applied insight config to generate the result data rows.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudBeyondcorpSaasplatformInsightsV1alphaAppliedConfig appliedConfig;

  /**
   * Output only. Next page token to be fetched. Set to empty or NULL if there are no more pages
   * available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Output only. Result rows returned containing the required value(s) for configured insight.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow> rows;

  /**
   * Output only. Applied insight config to generate the result data rows.
   * @return value or {@code null} for none
   */
  public GoogleCloudBeyondcorpSaasplatformInsightsV1alphaAppliedConfig getAppliedConfig() {
    return appliedConfig;
  }

  /**
   * Output only. Applied insight config to generate the result data rows.
   * @param appliedConfig appliedConfig or {@code null} for none
   */
  public GoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse setAppliedConfig(GoogleCloudBeyondcorpSaasplatformInsightsV1alphaAppliedConfig appliedConfig) {
    this.appliedConfig = appliedConfig;
    return this;
  }

  /**
   * Output only. Next page token to be fetched. Set to empty or NULL if there are no more pages
   * available.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Output only. Next page token to be fetched. Set to empty or NULL if there are no more pages
   * available.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Output only. Result rows returned containing the required value(s) for configured insight.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow> getRows() {
    return rows;
  }

  /**
   * Output only. Result rows returned containing the required value(s) for configured insight.
   * @param rows rows or {@code null} for none
   */
  public GoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse setRows(java.util.List<GoogleCloudBeyondcorpSaasplatformInsightsV1alphaRow> rows) {
    this.rows = rows;
    return this;
  }

  @Override
  public GoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse set(String fieldName, Object value) {
    return (GoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse clone() {
    return (GoogleCloudBeyondcorpSaasplatformInsightsV1alphaConfiguredInsightResponse) super.clone();
  }

}
