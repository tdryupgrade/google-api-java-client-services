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
 * The analysis resource.
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
public final class GoogleCloudContactcenterinsightsV1Analysis extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The result of the analysis, which is populated when the analysis finishes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1AnalysisResult analysisResult;

  /**
   * Output only. The time at which the analysis was created, which occurs when the long-running
   * operation completes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Immutable. The resource name of the analysis. Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The time at which the analysis was requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String requestTime;

  /**
   * Output only. The result of the analysis, which is populated when the analysis finishes.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AnalysisResult getAnalysisResult() {
    return analysisResult;
  }

  /**
   * Output only. The result of the analysis, which is populated when the analysis finishes.
   * @param analysisResult analysisResult or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1Analysis setAnalysisResult(GoogleCloudContactcenterinsightsV1AnalysisResult analysisResult) {
    this.analysisResult = analysisResult;
    return this;
  }

  /**
   * Output only. The time at which the analysis was created, which occurs when the long-running
   * operation completes.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time at which the analysis was created, which occurs when the long-running
   * operation completes.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1Analysis setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Immutable. The resource name of the analysis. Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The resource name of the analysis. Format:
   * projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
   * @param name name or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1Analysis setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The time at which the analysis was requested.
   * @return value or {@code null} for none
   */
  public String getRequestTime() {
    return requestTime;
  }

  /**
   * Output only. The time at which the analysis was requested.
   * @param requestTime requestTime or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1Analysis setRequestTime(String requestTime) {
    this.requestTime = requestTime;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1Analysis set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1Analysis) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1Analysis clone() {
    return (GoogleCloudContactcenterinsightsV1Analysis) super.clone();
  }

}
