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

package com.google.api.services.playdeveloperreporting.v1beta1.model;

/**
 * Response message for SearchAccessibleApps.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePlayDeveloperReportingV1beta1SearchAccessibleAppsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The apps accessible to the user calling the endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePlayDeveloperReportingV1beta1App> apps;

  static {
    // hack to force ProGuard to consider GooglePlayDeveloperReportingV1beta1App used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePlayDeveloperReportingV1beta1App.class);
  }

  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The apps accessible to the user calling the endpoint.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePlayDeveloperReportingV1beta1App> getApps() {
    return apps;
  }

  /**
   * The apps accessible to the user calling the endpoint.
   * @param apps apps or {@code null} for none
   */
  public GooglePlayDeveloperReportingV1beta1SearchAccessibleAppsResponse setApps(java.util.List<GooglePlayDeveloperReportingV1beta1App> apps) {
    this.apps = apps;
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
  public GooglePlayDeveloperReportingV1beta1SearchAccessibleAppsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GooglePlayDeveloperReportingV1beta1SearchAccessibleAppsResponse set(String fieldName, Object value) {
    return (GooglePlayDeveloperReportingV1beta1SearchAccessibleAppsResponse) super.set(fieldName, value);
  }

  @Override
  public GooglePlayDeveloperReportingV1beta1SearchAccessibleAppsResponse clone() {
    return (GooglePlayDeveloperReportingV1beta1SearchAccessibleAppsResponse) super.clone();
  }

}
