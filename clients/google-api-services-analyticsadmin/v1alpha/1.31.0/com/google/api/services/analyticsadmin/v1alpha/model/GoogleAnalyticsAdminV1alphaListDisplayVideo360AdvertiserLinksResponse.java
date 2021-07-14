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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * Response message for ListDisplayVideo360AdvertiserLinks RPC.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of DisplayVideo360AdvertiserLinks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink> displayVideo360AdvertiserLinks;

  static {
    // hack to force ProGuard to consider GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink.class);
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of DisplayVideo360AdvertiserLinks.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink> getDisplayVideo360AdvertiserLinks() {
    return displayVideo360AdvertiserLinks;
  }

  /**
   * List of DisplayVideo360AdvertiserLinks.
   * @param displayVideo360AdvertiserLinks displayVideo360AdvertiserLinks or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse setDisplayVideo360AdvertiserLinks(java.util.List<GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink> displayVideo360AdvertiserLinks) {
    this.displayVideo360AdvertiserLinks = displayVideo360AdvertiserLinks;
    return this;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse clone() {
    return (GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse) super.clone();
  }

}
