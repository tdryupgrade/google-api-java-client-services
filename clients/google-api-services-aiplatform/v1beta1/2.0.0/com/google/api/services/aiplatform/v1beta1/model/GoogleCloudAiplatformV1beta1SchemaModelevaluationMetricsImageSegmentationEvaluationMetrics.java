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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Metrics for image segmentation evaluation results.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Metrics for each confidenceThreshold in 0.00,0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 Precision-
   * recall curve can be derived from it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry> confidenceMetricsEntries;

  /**
   * Metrics for each confidenceThreshold in 0.00,0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 Precision-
   * recall curve can be derived from it.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry> getConfidenceMetricsEntries() {
    return confidenceMetricsEntries;
  }

  /**
   * Metrics for each confidenceThreshold in 0.00,0.05,0.10,...,0.95,0.96,0.97,0.98,0.99 Precision-
   * recall curve can be derived from it.
   * @param confidenceMetricsEntries confidenceMetricsEntries or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetrics setConfidenceMetricsEntries(java.util.List<GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetricsConfidenceMetricsEntry> confidenceMetricsEntries) {
    this.confidenceMetricsEntries = confidenceMetricsEntries;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetrics set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetrics) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetrics clone() {
    return (GoogleCloudAiplatformV1beta1SchemaModelevaluationMetricsImageSegmentationEvaluationMetrics) super.clone();
  }

}
