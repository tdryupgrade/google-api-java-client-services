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
 * Model definition for GoogleCloudApigeeV1Developer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1Developer extends com.google.api.client.json.GenericJson {

  /**
   * Access type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessType;

  /**
   * Developer app family.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appFamily;

  /**
   * List of apps associated with the developer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> apps;

  /**
   * Optional. Developer attributes (name/value pairs). The custom attribute limit is 18.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1Attribute> attributes;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1Attribute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1Attribute.class);
  }

  /**
   * List of companies associated with the developer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> companies;

  /**
   * Output only. Time at which the developer was created in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long createdAt;

  /**
   * ID of the developer. **Note**: IDs are generated internally by Apigee and are not guaranteed to
   * stay the same over time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String developerId;

  /**
   * Required. Email address of the developer. This value is used to uniquely identify the developer
   * in Apigee hybrid. Note that the email address has to be in lowercase only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * Required. First name of the developer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firstName;

  /**
   * Output only. Time at which the developer was last modified in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastModifiedAt;

  /**
   * Required. Last name of the developer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastName;

  /**
   * Output only. Name of the Apigee organization in which the developer resides.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String organizationName;

  /**
   * Output only. Status of the developer. Valid values are `active` and `inactive`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Required. User name of the developer. Not used by Apigee hybrid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userName;

  /**
   * Access type.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessType() {
    return accessType;
  }

  /**
   * Access type.
   * @param accessType accessType or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setAccessType(java.lang.String accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Developer app family.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppFamily() {
    return appFamily;
  }

  /**
   * Developer app family.
   * @param appFamily appFamily or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setAppFamily(java.lang.String appFamily) {
    this.appFamily = appFamily;
    return this;
  }

  /**
   * List of apps associated with the developer.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getApps() {
    return apps;
  }

  /**
   * List of apps associated with the developer.
   * @param apps apps or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setApps(java.util.List<java.lang.String> apps) {
    this.apps = apps;
    return this;
  }

  /**
   * Optional. Developer attributes (name/value pairs). The custom attribute limit is 18.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1Attribute> getAttributes() {
    return attributes;
  }

  /**
   * Optional. Developer attributes (name/value pairs). The custom attribute limit is 18.
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setAttributes(java.util.List<GoogleCloudApigeeV1Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * List of companies associated with the developer.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCompanies() {
    return companies;
  }

  /**
   * List of companies associated with the developer.
   * @param companies companies or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setCompanies(java.util.List<java.lang.String> companies) {
    this.companies = companies;
    return this;
  }

  /**
   * Output only. Time at which the developer was created in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Output only. Time at which the developer was created in milliseconds since epoch.
   * @param createdAt createdAt or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setCreatedAt(java.lang.Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * ID of the developer. **Note**: IDs are generated internally by Apigee and are not guaranteed to
   * stay the same over time.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeveloperId() {
    return developerId;
  }

  /**
   * ID of the developer. **Note**: IDs are generated internally by Apigee and are not guaranteed to
   * stay the same over time.
   * @param developerId developerId or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setDeveloperId(java.lang.String developerId) {
    this.developerId = developerId;
    return this;
  }

  /**
   * Required. Email address of the developer. This value is used to uniquely identify the developer
   * in Apigee hybrid. Note that the email address has to be in lowercase only.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Required. Email address of the developer. This value is used to uniquely identify the developer
   * in Apigee hybrid. Note that the email address has to be in lowercase only.
   * @param email email or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * Required. First name of the developer.
   * @return value or {@code null} for none
   */
  public java.lang.String getFirstName() {
    return firstName;
  }

  /**
   * Required. First name of the developer.
   * @param firstName firstName or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setFirstName(java.lang.String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Output only. Time at which the developer was last modified in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastModifiedAt() {
    return lastModifiedAt;
  }

  /**
   * Output only. Time at which the developer was last modified in milliseconds since epoch.
   * @param lastModifiedAt lastModifiedAt or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setLastModifiedAt(java.lang.Long lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

  /**
   * Required. Last name of the developer.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastName() {
    return lastName;
  }

  /**
   * Required. Last name of the developer.
   * @param lastName lastName or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setLastName(java.lang.String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Output only. Name of the Apigee organization in which the developer resides.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrganizationName() {
    return organizationName;
  }

  /**
   * Output only. Name of the Apigee organization in which the developer resides.
   * @param organizationName organizationName or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setOrganizationName(java.lang.String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  /**
   * Output only. Status of the developer. Valid values are `active` and `inactive`.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Output only. Status of the developer. Valid values are `active` and `inactive`.
   * @param status status or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Required. User name of the developer. Not used by Apigee hybrid.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserName() {
    return userName;
  }

  /**
   * Required. User name of the developer. Not used by Apigee hybrid.
   * @param userName userName or {@code null} for none
   */
  public GoogleCloudApigeeV1Developer setUserName(java.lang.String userName) {
    this.userName = userName;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1Developer set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1Developer) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1Developer clone() {
    return (GoogleCloudApigeeV1Developer) super.clone();
  }

}
