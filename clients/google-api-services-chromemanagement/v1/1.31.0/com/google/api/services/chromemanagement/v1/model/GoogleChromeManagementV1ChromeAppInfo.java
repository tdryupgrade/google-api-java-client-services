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

package com.google.api.services.chromemanagement.v1.model;

/**
 * Chrome Web Store app information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromeManagementV1ChromeAppInfo extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Whether the app or extension is built and maintained by Google. Version-specific
   * field that will only be set when the requested app version is found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean googleOwned;

  /**
   * Output only. Whether the app or extension is in a published state in the Chrome Web Store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isCwsHosted;

  /**
   * Output only. Whether the app or extension is a theme.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isTheme;

  /**
   * Output only. The minimum number of users using this app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minUserCount;

  /**
   * Output only. Every custom permission requested by the app. Version-specific field that will
   * only be set when the requested app version is found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1ChromeAppPermission> permissions;

  /**
   * Output only. Every permission giving access to domains or broad host patterns. ( e.g.
   * www.google.com). This includes the matches from content scripts as well as hosts in the
   * permissions node of the manifest. Version-specific field that will only be set when the
   * requested app version is found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1ChromeAppSiteAccess> siteAccess;

  /**
   * Output only. The app developer has enabled support for their app. Version-specific field that
   * will only be set when the requested app version is found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean supportEnabled;

  /**
   * Output only. Whether the app or extension is built and maintained by Google. Version-specific
   * field that will only be set when the requested app version is found.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGoogleOwned() {
    return googleOwned;
  }

  /**
   * Output only. Whether the app or extension is built and maintained by Google. Version-specific
   * field that will only be set when the requested app version is found.
   * @param googleOwned googleOwned or {@code null} for none
   */
  public GoogleChromeManagementV1ChromeAppInfo setGoogleOwned(java.lang.Boolean googleOwned) {
    this.googleOwned = googleOwned;
    return this;
  }

  /**
   * Output only. Whether the app or extension is in a published state in the Chrome Web Store.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsCwsHosted() {
    return isCwsHosted;
  }

  /**
   * Output only. Whether the app or extension is in a published state in the Chrome Web Store.
   * @param isCwsHosted isCwsHosted or {@code null} for none
   */
  public GoogleChromeManagementV1ChromeAppInfo setIsCwsHosted(java.lang.Boolean isCwsHosted) {
    this.isCwsHosted = isCwsHosted;
    return this;
  }

  /**
   * Output only. Whether the app or extension is a theme.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsTheme() {
    return isTheme;
  }

  /**
   * Output only. Whether the app or extension is a theme.
   * @param isTheme isTheme or {@code null} for none
   */
  public GoogleChromeManagementV1ChromeAppInfo setIsTheme(java.lang.Boolean isTheme) {
    this.isTheme = isTheme;
    return this;
  }

  /**
   * Output only. The minimum number of users using this app.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinUserCount() {
    return minUserCount;
  }

  /**
   * Output only. The minimum number of users using this app.
   * @param minUserCount minUserCount or {@code null} for none
   */
  public GoogleChromeManagementV1ChromeAppInfo setMinUserCount(java.lang.Integer minUserCount) {
    this.minUserCount = minUserCount;
    return this;
  }

  /**
   * Output only. Every custom permission requested by the app. Version-specific field that will
   * only be set when the requested app version is found.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1ChromeAppPermission> getPermissions() {
    return permissions;
  }

  /**
   * Output only. Every custom permission requested by the app. Version-specific field that will
   * only be set when the requested app version is found.
   * @param permissions permissions or {@code null} for none
   */
  public GoogleChromeManagementV1ChromeAppInfo setPermissions(java.util.List<GoogleChromeManagementV1ChromeAppPermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Output only. Every permission giving access to domains or broad host patterns. ( e.g.
   * www.google.com). This includes the matches from content scripts as well as hosts in the
   * permissions node of the manifest. Version-specific field that will only be set when the
   * requested app version is found.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1ChromeAppSiteAccess> getSiteAccess() {
    return siteAccess;
  }

  /**
   * Output only. Every permission giving access to domains or broad host patterns. ( e.g.
   * www.google.com). This includes the matches from content scripts as well as hosts in the
   * permissions node of the manifest. Version-specific field that will only be set when the
   * requested app version is found.
   * @param siteAccess siteAccess or {@code null} for none
   */
  public GoogleChromeManagementV1ChromeAppInfo setSiteAccess(java.util.List<GoogleChromeManagementV1ChromeAppSiteAccess> siteAccess) {
    this.siteAccess = siteAccess;
    return this;
  }

  /**
   * Output only. The app developer has enabled support for their app. Version-specific field that
   * will only be set when the requested app version is found.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSupportEnabled() {
    return supportEnabled;
  }

  /**
   * Output only. The app developer has enabled support for their app. Version-specific field that
   * will only be set when the requested app version is found.
   * @param supportEnabled supportEnabled or {@code null} for none
   */
  public GoogleChromeManagementV1ChromeAppInfo setSupportEnabled(java.lang.Boolean supportEnabled) {
    this.supportEnabled = supportEnabled;
    return this;
  }

  @Override
  public GoogleChromeManagementV1ChromeAppInfo set(String fieldName, Object value) {
    return (GoogleChromeManagementV1ChromeAppInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1ChromeAppInfo clone() {
    return (GoogleChromeManagementV1ChromeAppInfo) super.clone();
  }

}
