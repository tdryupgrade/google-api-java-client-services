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

package com.google.api.services.firebase.v1beta1.model;

/**
 * A high-level summary of an App.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FirebaseAppInfo extends com.google.api.client.json.GenericJson {

  /**
   * The key_id of the GCP ApiKey associated with this App. If set must have no restrictions, or
   * only have restrictions that are valid for the associated Firebase App. Cannot be set to an
   * empty value in update requests. If left unset on create requests, an existing valid API Key
   * will be chosen, or if no valid API Keys exist, one will be provisioned for you.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiKeyId;

  /**
   * Output only. Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`.
   * This identifier should be treated as an opaque token, as the data format is not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appId;

  /**
   * The user-assigned display name of the Firebase App.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The resource name of the Firebase App, in the format: projects/PROJECT_ID /iosApps/APP_ID or
   * projects/PROJECT_ID/androidApps/APP_ID or projects/ PROJECT_ID/webApps/APP_ID
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Immutable. The platform-specific identifier of the App. *Note:* For most use
   * cases, use `appId`, which is the canonical, globally unique identifier for referencing an App.
   * This string is derived from a native identifier for each platform: `packageName` for an
   * `AndroidApp`, `bundleId` for an `IosApp`, and `webId` for a `WebApp`. Its contents should be
   * treated as opaque, as the native identifier format may change as platforms evolve. This string
   * is only unique within a `FirebaseProject` and its associated Apps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namespace;

  /**
   * The platform of the Firebase App.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String platform;

  /**
   * Output only. The lifecycle state of the App.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The key_id of the GCP ApiKey associated with this App. If set must have no restrictions, or
   * only have restrictions that are valid for the associated Firebase App. Cannot be set to an
   * empty value in update requests. If left unset on create requests, an existing valid API Key
   * will be chosen, or if no valid API Keys exist, one will be provisioned for you.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiKeyId() {
    return apiKeyId;
  }

  /**
   * The key_id of the GCP ApiKey associated with this App. If set must have no restrictions, or
   * only have restrictions that are valid for the associated Firebase App. Cannot be set to an
   * empty value in update requests. If left unset on create requests, an existing valid API Key
   * will be chosen, or if no valid API Keys exist, one will be provisioned for you.
   * @param apiKeyId apiKeyId or {@code null} for none
   */
  public FirebaseAppInfo setApiKeyId(java.lang.String apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

  /**
   * Output only. Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`.
   * This identifier should be treated as an opaque token, as the data format is not specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppId() {
    return appId;
  }

  /**
   * Output only. Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`.
   * This identifier should be treated as an opaque token, as the data format is not specified.
   * @param appId appId or {@code null} for none
   */
  public FirebaseAppInfo setAppId(java.lang.String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * The user-assigned display name of the Firebase App.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The user-assigned display name of the Firebase App.
   * @param displayName displayName or {@code null} for none
   */
  public FirebaseAppInfo setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The resource name of the Firebase App, in the format: projects/PROJECT_ID /iosApps/APP_ID or
   * projects/PROJECT_ID/androidApps/APP_ID or projects/ PROJECT_ID/webApps/APP_ID
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the Firebase App, in the format: projects/PROJECT_ID /iosApps/APP_ID or
   * projects/PROJECT_ID/androidApps/APP_ID or projects/ PROJECT_ID/webApps/APP_ID
   * @param name name or {@code null} for none
   */
  public FirebaseAppInfo setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Immutable. The platform-specific identifier of the App. *Note:* For most use
   * cases, use `appId`, which is the canonical, globally unique identifier for referencing an App.
   * This string is derived from a native identifier for each platform: `packageName` for an
   * `AndroidApp`, `bundleId` for an `IosApp`, and `webId` for a `WebApp`. Its contents should be
   * treated as opaque, as the native identifier format may change as platforms evolve. This string
   * is only unique within a `FirebaseProject` and its associated Apps.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamespace() {
    return namespace;
  }

  /**
   * Output only. Immutable. The platform-specific identifier of the App. *Note:* For most use
   * cases, use `appId`, which is the canonical, globally unique identifier for referencing an App.
   * This string is derived from a native identifier for each platform: `packageName` for an
   * `AndroidApp`, `bundleId` for an `IosApp`, and `webId` for a `WebApp`. Its contents should be
   * treated as opaque, as the native identifier format may change as platforms evolve. This string
   * is only unique within a `FirebaseProject` and its associated Apps.
   * @param namespace namespace or {@code null} for none
   */
  public FirebaseAppInfo setNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * The platform of the Firebase App.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlatform() {
    return platform;
  }

  /**
   * The platform of the Firebase App.
   * @param platform platform or {@code null} for none
   */
  public FirebaseAppInfo setPlatform(java.lang.String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Output only. The lifecycle state of the App.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The lifecycle state of the App.
   * @param state state or {@code null} for none
   */
  public FirebaseAppInfo setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public FirebaseAppInfo set(String fieldName, Object value) {
    return (FirebaseAppInfo) super.set(fieldName, value);
  }

  @Override
  public FirebaseAppInfo clone() {
    return (FirebaseAppInfo) super.clone();
  }

}
