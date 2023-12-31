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

package com.google.api.services.aiplatform.v1.model;

/**
 * Request message for FeaturestoreService.ExportFeatureValues.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1ExportFeatureValuesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Specifies destination location and format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1FeatureValueDestination destination;

  /**
   * Required. Selects Features to export values of.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1FeatureSelector featureSelector;

  /**
   * Exports all historical values of all entities of the EntityType within a time range
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1ExportFeatureValuesRequestFullExport fullExport;

  /**
   * Per-Feature export settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1DestinationFeatureSetting> settings;

  static {
    // hack to force ProGuard to consider GoogleCloudAiplatformV1DestinationFeatureSetting used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudAiplatformV1DestinationFeatureSetting.class);
  }

  /**
   * Exports the latest Feature values of all entities of the EntityType within a time range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1ExportFeatureValuesRequestSnapshotExport snapshotExport;

  /**
   * Required. Specifies destination location and format.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1FeatureValueDestination getDestination() {
    return destination;
  }

  /**
   * Required. Specifies destination location and format.
   * @param destination destination or {@code null} for none
   */
  public GoogleCloudAiplatformV1ExportFeatureValuesRequest setDestination(GoogleCloudAiplatformV1FeatureValueDestination destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Required. Selects Features to export values of.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1FeatureSelector getFeatureSelector() {
    return featureSelector;
  }

  /**
   * Required. Selects Features to export values of.
   * @param featureSelector featureSelector or {@code null} for none
   */
  public GoogleCloudAiplatformV1ExportFeatureValuesRequest setFeatureSelector(GoogleCloudAiplatformV1FeatureSelector featureSelector) {
    this.featureSelector = featureSelector;
    return this;
  }

  /**
   * Exports all historical values of all entities of the EntityType within a time range
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1ExportFeatureValuesRequestFullExport getFullExport() {
    return fullExport;
  }

  /**
   * Exports all historical values of all entities of the EntityType within a time range
   * @param fullExport fullExport or {@code null} for none
   */
  public GoogleCloudAiplatformV1ExportFeatureValuesRequest setFullExport(GoogleCloudAiplatformV1ExportFeatureValuesRequestFullExport fullExport) {
    this.fullExport = fullExport;
    return this;
  }

  /**
   * Per-Feature export settings.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1DestinationFeatureSetting> getSettings() {
    return settings;
  }

  /**
   * Per-Feature export settings.
   * @param settings settings or {@code null} for none
   */
  public GoogleCloudAiplatformV1ExportFeatureValuesRequest setSettings(java.util.List<GoogleCloudAiplatformV1DestinationFeatureSetting> settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Exports the latest Feature values of all entities of the EntityType within a time range.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1ExportFeatureValuesRequestSnapshotExport getSnapshotExport() {
    return snapshotExport;
  }

  /**
   * Exports the latest Feature values of all entities of the EntityType within a time range.
   * @param snapshotExport snapshotExport or {@code null} for none
   */
  public GoogleCloudAiplatformV1ExportFeatureValuesRequest setSnapshotExport(GoogleCloudAiplatformV1ExportFeatureValuesRequestSnapshotExport snapshotExport) {
    this.snapshotExport = snapshotExport;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1ExportFeatureValuesRequest set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1ExportFeatureValuesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1ExportFeatureValuesRequest clone() {
    return (GoogleCloudAiplatformV1ExportFeatureValuesRequest) super.clone();
  }

}
