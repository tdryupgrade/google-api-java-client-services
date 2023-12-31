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

package com.google.api.services.advisorynotifications.v1.model;

/**
 * A message which contains notification details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Advisory Notifications API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAdvisorynotificationsV1Message extends com.google.api.client.json.GenericJson {

  /**
   * The attachments to download.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAdvisorynotificationsV1Attachment> attachments;

  static {
    // hack to force ProGuard to consider GoogleCloudAdvisorynotificationsV1Attachment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudAdvisorynotificationsV1Attachment.class);
  }

  /**
   * The message content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAdvisorynotificationsV1MessageBody body;

  /**
   * The Message creation timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Time when Message was localized
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String localizationTime;

  /**
   * The attachments to download.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAdvisorynotificationsV1Attachment> getAttachments() {
    return attachments;
  }

  /**
   * The attachments to download.
   * @param attachments attachments or {@code null} for none
   */
  public GoogleCloudAdvisorynotificationsV1Message setAttachments(java.util.List<GoogleCloudAdvisorynotificationsV1Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  /**
   * The message content.
   * @return value or {@code null} for none
   */
  public GoogleCloudAdvisorynotificationsV1MessageBody getBody() {
    return body;
  }

  /**
   * The message content.
   * @param body body or {@code null} for none
   */
  public GoogleCloudAdvisorynotificationsV1Message setBody(GoogleCloudAdvisorynotificationsV1MessageBody body) {
    this.body = body;
    return this;
  }

  /**
   * The Message creation timestamp.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The Message creation timestamp.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudAdvisorynotificationsV1Message setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Time when Message was localized
   * @return value or {@code null} for none
   */
  public String getLocalizationTime() {
    return localizationTime;
  }

  /**
   * Time when Message was localized
   * @param localizationTime localizationTime or {@code null} for none
   */
  public GoogleCloudAdvisorynotificationsV1Message setLocalizationTime(String localizationTime) {
    this.localizationTime = localizationTime;
    return this;
  }

  @Override
  public GoogleCloudAdvisorynotificationsV1Message set(String fieldName, Object value) {
    return (GoogleCloudAdvisorynotificationsV1Message) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAdvisorynotificationsV1Message clone() {
    return (GoogleCloudAdvisorynotificationsV1Message) super.clone();
  }

}
