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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Metadata for a ConversationDatasets.ImportConversationData operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2ImportConversationDataOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the imported conversation dataset. Format:
   * `projects//locations//conversationDatasets/`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversationDataset;

  /**
   * Timestamp when import conversation data request was created. The time is measured on server
   * side.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Partial failures are failures that don't fail the whole long running operation, e.g. single
   * files that couldn't be read.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleRpcStatus> partialFailures;

  /**
   * The resource name of the imported conversation dataset. Format:
   * `projects//locations//conversationDatasets/`
   * @return value or {@code null} for none
   */
  public java.lang.String getConversationDataset() {
    return conversationDataset;
  }

  /**
   * The resource name of the imported conversation dataset. Format:
   * `projects//locations//conversationDatasets/`
   * @param conversationDataset conversationDataset or {@code null} for none
   */
  public GoogleCloudDialogflowV2ImportConversationDataOperationMetadata setConversationDataset(java.lang.String conversationDataset) {
    this.conversationDataset = conversationDataset;
    return this;
  }

  /**
   * Timestamp when import conversation data request was created. The time is measured on server
   * side.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Timestamp when import conversation data request was created. The time is measured on server
   * side.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDialogflowV2ImportConversationDataOperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Partial failures are failures that don't fail the whole long running operation, e.g. single
   * files that couldn't be read.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleRpcStatus> getPartialFailures() {
    return partialFailures;
  }

  /**
   * Partial failures are failures that don't fail the whole long running operation, e.g. single
   * files that couldn't be read.
   * @param partialFailures partialFailures or {@code null} for none
   */
  public GoogleCloudDialogflowV2ImportConversationDataOperationMetadata setPartialFailures(java.util.List<GoogleRpcStatus> partialFailures) {
    this.partialFailures = partialFailures;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2ImportConversationDataOperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2ImportConversationDataOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2ImportConversationDataOperationMetadata clone() {
    return (GoogleCloudDialogflowV2ImportConversationDataOperationMetadata) super.clone();
  }

}
