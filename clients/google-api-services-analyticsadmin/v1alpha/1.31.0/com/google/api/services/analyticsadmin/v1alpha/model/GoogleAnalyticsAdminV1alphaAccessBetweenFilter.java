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
 * To express that the result needs to be between two numbers (inclusive).
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
public final class GoogleAnalyticsAdminV1alphaAccessBetweenFilter extends com.google.api.client.json.GenericJson {

  /**
   * Begins with this number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaNumericValue fromValue;

  /**
   * Ends with this number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAnalyticsAdminV1alphaNumericValue toValue;

  /**
   * Begins with this number.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaNumericValue getFromValue() {
    return fromValue;
  }

  /**
   * Begins with this number.
   * @param fromValue fromValue or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaAccessBetweenFilter setFromValue(GoogleAnalyticsAdminV1alphaNumericValue fromValue) {
    this.fromValue = fromValue;
    return this;
  }

  /**
   * Ends with this number.
   * @return value or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaNumericValue getToValue() {
    return toValue;
  }

  /**
   * Ends with this number.
   * @param toValue toValue or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaAccessBetweenFilter setToValue(GoogleAnalyticsAdminV1alphaNumericValue toValue) {
    this.toValue = toValue;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaAccessBetweenFilter set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaAccessBetweenFilter) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaAccessBetweenFilter clone() {
    return (GoogleAnalyticsAdminV1alphaAccessBetweenFilter) super.clone();
  }

}
