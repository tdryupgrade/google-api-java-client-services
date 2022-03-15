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

package com.google.api.services.documentai.v1beta3.model;

/**
 * Model definition for GoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The basic metadata of the long running operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiUiv1beta3CommonOperationMetadata commonMetadata;

  /**
   * The destination dataset split type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destDatasetType;

  /**
   * The destination dataset split type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destSplitType;

  /**
   * The list of response details of each document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadataIndividualBatchMoveStatus> individualBatchMoveStatuses;

  /**
   * The basic metadata of the long running operation.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3CommonOperationMetadata getCommonMetadata() {
    return commonMetadata;
  }

  /**
   * The basic metadata of the long running operation.
   * @param commonMetadata commonMetadata or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata setCommonMetadata(GoogleCloudDocumentaiUiv1beta3CommonOperationMetadata commonMetadata) {
    this.commonMetadata = commonMetadata;
    return this;
  }

  /**
   * The destination dataset split type.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestDatasetType() {
    return destDatasetType;
  }

  /**
   * The destination dataset split type.
   * @param destDatasetType destDatasetType or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata setDestDatasetType(java.lang.String destDatasetType) {
    this.destDatasetType = destDatasetType;
    return this;
  }

  /**
   * The destination dataset split type.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestSplitType() {
    return destSplitType;
  }

  /**
   * The destination dataset split type.
   * @param destSplitType destSplitType or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata setDestSplitType(java.lang.String destSplitType) {
    this.destSplitType = destSplitType;
    return this;
  }

  /**
   * The list of response details of each document.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadataIndividualBatchMoveStatus> getIndividualBatchMoveStatuses() {
    return individualBatchMoveStatuses;
  }

  /**
   * The list of response details of each document.
   * @param individualBatchMoveStatuses individualBatchMoveStatuses or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata setIndividualBatchMoveStatuses(java.util.List<GoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadataIndividualBatchMoveStatus> individualBatchMoveStatuses) {
    this.individualBatchMoveStatuses = individualBatchMoveStatuses;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata clone() {
    return (GoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata) super.clone();
  }

}
