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

package com.google.api.services.kmsinventory.v1.model;

/**
 * Response message for KeyTrackingService.SearchProtectedResources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the KMS Inventory API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudKmsInventoryV1SearchProtectedResourcesResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Protected resources for this page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudKmsInventoryV1ProtectedResource> protectedResources;

  static {
    // hack to force ProGuard to consider GoogleCloudKmsInventoryV1ProtectedResource used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudKmsInventoryV1ProtectedResource.class);
  }

  /**
   * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudKmsInventoryV1SearchProtectedResourcesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Protected resources for this page.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudKmsInventoryV1ProtectedResource> getProtectedResources() {
    return protectedResources;
  }

  /**
   * Protected resources for this page.
   * @param protectedResources protectedResources or {@code null} for none
   */
  public GoogleCloudKmsInventoryV1SearchProtectedResourcesResponse setProtectedResources(java.util.List<GoogleCloudKmsInventoryV1ProtectedResource> protectedResources) {
    this.protectedResources = protectedResources;
    return this;
  }

  @Override
  public GoogleCloudKmsInventoryV1SearchProtectedResourcesResponse set(String fieldName, Object value) {
    return (GoogleCloudKmsInventoryV1SearchProtectedResourcesResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudKmsInventoryV1SearchProtectedResourcesResponse clone() {
    return (GoogleCloudKmsInventoryV1SearchProtectedResourcesResponse) super.clone();
  }

}
