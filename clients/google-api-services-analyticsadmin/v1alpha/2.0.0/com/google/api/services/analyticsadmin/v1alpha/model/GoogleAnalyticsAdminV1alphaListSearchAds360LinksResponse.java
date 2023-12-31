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
 * Response message for ListSearchAds360Links RPC.
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
public final class GoogleAnalyticsAdminV1alphaListSearchAds360LinksResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of SearchAds360Links.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAnalyticsAdminV1alphaSearchAds360Link> searchAds360Links;

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
  public GoogleAnalyticsAdminV1alphaListSearchAds360LinksResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * List of SearchAds360Links.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAnalyticsAdminV1alphaSearchAds360Link> getSearchAds360Links() {
    return searchAds360Links;
  }

  /**
   * List of SearchAds360Links.
   * @param searchAds360Links searchAds360Links or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaListSearchAds360LinksResponse setSearchAds360Links(java.util.List<GoogleAnalyticsAdminV1alphaSearchAds360Link> searchAds360Links) {
    this.searchAds360Links = searchAds360Links;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaListSearchAds360LinksResponse set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaListSearchAds360LinksResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaListSearchAds360LinksResponse clone() {
    return (GoogleAnalyticsAdminV1alphaListSearchAds360LinksResponse) super.clone();
  }

}
