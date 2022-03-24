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

package com.google.api.services.retail.v2.model;

/**
 * Metadata related to the progress of the Import operation. This will be returned by the
 * google.longrunning.Operation.metadata field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaImportMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Operation create time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Count of entries that encountered errors while processing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long failureCount;

  /**
   * Pub/Sub topic for receiving notification. If this field is set, when the import is finished, a
   * notification will be sent to specified Pub/Sub topic. The message data will be JSON string of a
   * Operation. Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notificationPubsubTopic;

  /**
   * Deprecated. This field is never set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Count of entries that were processed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long successCount;

  /**
   * Operation last update time. If the operation is done, this is also the finish time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Operation create time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Operation create time.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudRetailV2betaImportMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Count of entries that encountered errors while processing.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFailureCount() {
    return failureCount;
  }

  /**
   * Count of entries that encountered errors while processing.
   * @param failureCount failureCount or {@code null} for none
   */
  public GoogleCloudRetailV2betaImportMetadata setFailureCount(java.lang.Long failureCount) {
    this.failureCount = failureCount;
    return this;
  }

  /**
   * Pub/Sub topic for receiving notification. If this field is set, when the import is finished, a
   * notification will be sent to specified Pub/Sub topic. The message data will be JSON string of a
   * Operation. Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getNotificationPubsubTopic() {
    return notificationPubsubTopic;
  }

  /**
   * Pub/Sub topic for receiving notification. If this field is set, when the import is finished, a
   * notification will be sent to specified Pub/Sub topic. The message data will be JSON string of a
   * Operation. Format of the Pub/Sub topic is `projects/{project}/topics/{topic}`.
   * @param notificationPubsubTopic notificationPubsubTopic or {@code null} for none
   */
  public GoogleCloudRetailV2betaImportMetadata setNotificationPubsubTopic(java.lang.String notificationPubsubTopic) {
    this.notificationPubsubTopic = notificationPubsubTopic;
    return this;
  }

  /**
   * Deprecated. This field is never set.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Deprecated. This field is never set.
   * @param requestId requestId or {@code null} for none
   */
  public GoogleCloudRetailV2betaImportMetadata setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Count of entries that were processed successfully.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSuccessCount() {
    return successCount;
  }

  /**
   * Count of entries that were processed successfully.
   * @param successCount successCount or {@code null} for none
   */
  public GoogleCloudRetailV2betaImportMetadata setSuccessCount(java.lang.Long successCount) {
    this.successCount = successCount;
    return this;
  }

  /**
   * Operation last update time. If the operation is done, this is also the finish time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Operation last update time. If the operation is done, this is also the finish time.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudRetailV2betaImportMetadata setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaImportMetadata set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaImportMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaImportMetadata clone() {
    return (GoogleCloudRetailV2betaImportMetadata) super.clone();
  }

}
