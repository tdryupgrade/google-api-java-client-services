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
 * Response message for ListDisplayVideo360AdvertiserLinkProposals RPC.
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
public final class GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of DisplayVideo360AdvertiserLinkProposals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal> displayVideo360AdvertiserLinkProposals;

  static {
    // hack to force ProGuard to consider GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal.class);
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of DisplayVideo360AdvertiserLinkProposals.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal> getDisplayVideo360AdvertiserLinkProposals() {
    return displayVideo360AdvertiserLinkProposals;
  }

  /**
   * List of DisplayVideo360AdvertiserLinkProposals.
   * @param displayVideo360AdvertiserLinkProposals displayVideo360AdvertiserLinkProposals or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse setDisplayVideo360AdvertiserLinkProposals(java.util.List<GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal> displayVideo360AdvertiserLinkProposals) {
    this.displayVideo360AdvertiserLinkProposals = displayVideo360AdvertiserLinkProposals;
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
  public GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse clone() {
    return (GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse) super.clone();
  }

}
