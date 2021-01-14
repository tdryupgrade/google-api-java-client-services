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

package com.google.api.services.recommendationengine.v1beta1.model;

/**
 * Information of end users.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommendations AI (Beta). For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommendationengineV1beta1UserInfo extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Indicates if the request is made directly from the end user in which case the
   * user_agent and ip_address fields can be populated from the HTTP request. This should *not* be
   * set when using the javascript pixel. This flag should be set only if the API request is made
   * directly from the end user such as a mobile app (and not if a gateway or a server is processing
   * and pushing the user events).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean directUserRequest;

  /**
   * Optional. IP address of the user. This could be either IPv4 (e.g. 104.133.9.80) or IPv6 (e.g.
   * 2001:0db8:85a3:0000:0000:8a2e:0370:7334). This should *not* be set when using the javascript
   * pixel or if `direct_user_request` is set. Used to extract location information for
   * personalization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * Optional. User agent as included in the HTTP header. UTF-8 encoded string with a length limit
   * of 1 KiB. This should *not* be set when using the JavaScript pixel or if `directUserRequest` is
   * set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userAgent;

  /**
   * Optional. Unique identifier for logged-in user with a length limit of 128 bytes. Required only
   * for logged-in users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * Required. A unique identifier for tracking visitors with a length limit of 128 bytes. For
   * example, this could be implemented with a http cookie, which should be able to uniquely
   * identify a visitor on a single device. This unique identifier should not change if the visitor
   * log in/out of the website. Maximum length 128 bytes. Cannot be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String visitorId;

  /**
   * Optional. Indicates if the request is made directly from the end user in which case the
   * user_agent and ip_address fields can be populated from the HTTP request. This should *not* be
   * set when using the javascript pixel. This flag should be set only if the API request is made
   * directly from the end user such as a mobile app (and not if a gateway or a server is processing
   * and pushing the user events).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDirectUserRequest() {
    return directUserRequest;
  }

  /**
   * Optional. Indicates if the request is made directly from the end user in which case the
   * user_agent and ip_address fields can be populated from the HTTP request. This should *not* be
   * set when using the javascript pixel. This flag should be set only if the API request is made
   * directly from the end user such as a mobile app (and not if a gateway or a server is processing
   * and pushing the user events).
   * @param directUserRequest directUserRequest or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1UserInfo setDirectUserRequest(java.lang.Boolean directUserRequest) {
    this.directUserRequest = directUserRequest;
    return this;
  }

  /**
   * Optional. IP address of the user. This could be either IPv4 (e.g. 104.133.9.80) or IPv6 (e.g.
   * 2001:0db8:85a3:0000:0000:8a2e:0370:7334). This should *not* be set when using the javascript
   * pixel or if `direct_user_request` is set. Used to extract location information for
   * personalization.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * Optional. IP address of the user. This could be either IPv4 (e.g. 104.133.9.80) or IPv6 (e.g.
   * 2001:0db8:85a3:0000:0000:8a2e:0370:7334). This should *not* be set when using the javascript
   * pixel or if `direct_user_request` is set. Used to extract location information for
   * personalization.
   * @param ipAddress ipAddress or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1UserInfo setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Optional. User agent as included in the HTTP header. UTF-8 encoded string with a length limit
   * of 1 KiB. This should *not* be set when using the JavaScript pixel or if `directUserRequest` is
   * set.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserAgent() {
    return userAgent;
  }

  /**
   * Optional. User agent as included in the HTTP header. UTF-8 encoded string with a length limit
   * of 1 KiB. This should *not* be set when using the JavaScript pixel or if `directUserRequest` is
   * set.
   * @param userAgent userAgent or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1UserInfo setUserAgent(java.lang.String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Optional. Unique identifier for logged-in user with a length limit of 128 bytes. Required only
   * for logged-in users.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * Optional. Unique identifier for logged-in user with a length limit of 128 bytes. Required only
   * for logged-in users.
   * @param userId userId or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1UserInfo setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Required. A unique identifier for tracking visitors with a length limit of 128 bytes. For
   * example, this could be implemented with a http cookie, which should be able to uniquely
   * identify a visitor on a single device. This unique identifier should not change if the visitor
   * log in/out of the website. Maximum length 128 bytes. Cannot be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getVisitorId() {
    return visitorId;
  }

  /**
   * Required. A unique identifier for tracking visitors with a length limit of 128 bytes. For
   * example, this could be implemented with a http cookie, which should be able to uniquely
   * identify a visitor on a single device. This unique identifier should not change if the visitor
   * log in/out of the website. Maximum length 128 bytes. Cannot be empty.
   * @param visitorId visitorId or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1UserInfo setVisitorId(java.lang.String visitorId) {
    this.visitorId = visitorId;
    return this;
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1UserInfo set(String fieldName, Object value) {
    return (GoogleCloudRecommendationengineV1beta1UserInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1UserInfo clone() {
    return (GoogleCloudRecommendationengineV1beta1UserInfo) super.clone();
  }

}
