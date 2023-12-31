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

package com.google.api.services.playcustomapp.model;

/**
 * This resource represents a custom app.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Custom App Publishing API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomApp extends com.google.api.client.json.GenericJson {

  /**
   * Default listing language in BCP 47 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Organizations to which the custom app should be made available. If the request contains any
   * organizations, then the app will be restricted to only these organizations. To support the
   * organization linked to the developer account, the organization ID should be provided explicitly
   * together with other organizations. If no organizations are provided, then the app is only
   * available to the organization linked to the developer account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Organization> organizations;

  /**
   * Output only. Package name of the created Android app. Only present in the API response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageName;

  /**
   * Title for the Android app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Default listing language in BCP 47 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Default listing language in BCP 47 format.
   * @param languageCode languageCode or {@code null} for none
   */
  public CustomApp setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Organizations to which the custom app should be made available. If the request contains any
   * organizations, then the app will be restricted to only these organizations. To support the
   * organization linked to the developer account, the organization ID should be provided explicitly
   * together with other organizations. If no organizations are provided, then the app is only
   * available to the organization linked to the developer account.
   * @return value or {@code null} for none
   */
  public java.util.List<Organization> getOrganizations() {
    return organizations;
  }

  /**
   * Organizations to which the custom app should be made available. If the request contains any
   * organizations, then the app will be restricted to only these organizations. To support the
   * organization linked to the developer account, the organization ID should be provided explicitly
   * together with other organizations. If no organizations are provided, then the app is only
   * available to the organization linked to the developer account.
   * @param organizations organizations or {@code null} for none
   */
  public CustomApp setOrganizations(java.util.List<Organization> organizations) {
    this.organizations = organizations;
    return this;
  }

  /**
   * Output only. Package name of the created Android app. Only present in the API response.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * Output only. Package name of the created Android app. Only present in the API response.
   * @param packageName packageName or {@code null} for none
   */
  public CustomApp setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Title for the Android app.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title for the Android app.
   * @param title title or {@code null} for none
   */
  public CustomApp setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public CustomApp set(String fieldName, Object value) {
    return (CustomApp) super.set(fieldName, value);
  }

  @Override
  public CustomApp clone() {
    return (CustomApp) super.clone();
  }

}
