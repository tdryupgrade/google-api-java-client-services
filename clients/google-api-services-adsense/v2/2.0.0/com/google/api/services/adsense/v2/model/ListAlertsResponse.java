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

package com.google.api.services.adsense.v2.model;

/**
 * Response definition for the alerts list rpc.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListAlertsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The alerts returned in this list response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Alert> alerts;

  static {
    // hack to force ProGuard to consider Alert used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Alert.class);
  }

  /**
   * The alerts returned in this list response.
   * @return value or {@code null} for none
   */
  public java.util.List<Alert> getAlerts() {
    return alerts;
  }

  /**
   * The alerts returned in this list response.
   * @param alerts alerts or {@code null} for none
   */
  public ListAlertsResponse setAlerts(java.util.List<Alert> alerts) {
    this.alerts = alerts;
    return this;
  }

  @Override
  public ListAlertsResponse set(String fieldName, Object value) {
    return (ListAlertsResponse) super.set(fieldName, value);
  }

  @Override
  public ListAlertsResponse clone() {
    return (ListAlertsResponse) super.clone();
  }

}
