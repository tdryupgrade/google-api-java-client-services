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

package com.google.api.services.apigee.v1.model;

/**
 * Response for ListEndpointAttachments method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ListEndpointAttachmentsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Endpoint attachments in the specified organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1EndpointAttachment> endpointAttachments;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1EndpointAttachment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1EndpointAttachment.class);
  }

  /**
   * Page token that you can include in an `ListEndpointAttachments` request to retrieve the next
   * page. If omitted, no subsequent pages exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Endpoint attachments in the specified organization.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1EndpointAttachment> getEndpointAttachments() {
    return endpointAttachments;
  }

  /**
   * Endpoint attachments in the specified organization.
   * @param endpointAttachments endpointAttachments or {@code null} for none
   */
  public GoogleCloudApigeeV1ListEndpointAttachmentsResponse setEndpointAttachments(java.util.List<GoogleCloudApigeeV1EndpointAttachment> endpointAttachments) {
    this.endpointAttachments = endpointAttachments;
    return this;
  }

  /**
   * Page token that you can include in an `ListEndpointAttachments` request to retrieve the next
   * page. If omitted, no subsequent pages exist.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Page token that you can include in an `ListEndpointAttachments` request to retrieve the next
   * page. If omitted, no subsequent pages exist.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudApigeeV1ListEndpointAttachmentsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ListEndpointAttachmentsResponse set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ListEndpointAttachmentsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ListEndpointAttachmentsResponse clone() {
    return (GoogleCloudApigeeV1ListEndpointAttachmentsResponse) super.clone();
  }

}
