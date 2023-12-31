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
 * Structure of a DeveloperSubscription.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1DeveloperSubscription extends com.google.api.client.json.GenericJson {

  /**
   * Name of the API product for which the developer is purchasing a subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiproduct;

  /**
   * Output only. Time when the API product subscription was created in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long createdAt;

  /**
   * Time when the API product subscription ends in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long endTime;

  /**
   * Output only. Time when the API product subscription was last modified in milliseconds since
   * epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastModifiedAt;

  /**
   * Output only. Name of the API product subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Time when the API product subscription starts in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startTime;

  /**
   * Name of the API product for which the developer is purchasing a subscription.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiproduct() {
    return apiproduct;
  }

  /**
   * Name of the API product for which the developer is purchasing a subscription.
   * @param apiproduct apiproduct or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperSubscription setApiproduct(java.lang.String apiproduct) {
    this.apiproduct = apiproduct;
    return this;
  }

  /**
   * Output only. Time when the API product subscription was created in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Output only. Time when the API product subscription was created in milliseconds since epoch.
   * @param createdAt createdAt or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperSubscription setCreatedAt(java.lang.Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time when the API product subscription ends in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEndTime() {
    return endTime;
  }

  /**
   * Time when the API product subscription ends in milliseconds since epoch.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperSubscription setEndTime(java.lang.Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Output only. Time when the API product subscription was last modified in milliseconds since
   * epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastModifiedAt() {
    return lastModifiedAt;
  }

  /**
   * Output only. Time when the API product subscription was last modified in milliseconds since
   * epoch.
   * @param lastModifiedAt lastModifiedAt or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperSubscription setLastModifiedAt(java.lang.Long lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

  /**
   * Output only. Name of the API product subscription.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Name of the API product subscription.
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperSubscription setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Time when the API product subscription starts in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartTime() {
    return startTime;
  }

  /**
   * Time when the API product subscription starts in milliseconds since epoch.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperSubscription setStartTime(java.lang.Long startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1DeveloperSubscription set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1DeveloperSubscription) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1DeveloperSubscription clone() {
    return (GoogleCloudApigeeV1DeveloperSubscription) super.clone();
  }

}
