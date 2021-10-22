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

package com.google.api.services.analyticsdata.v1beta.model;

/**
 * The schema restrictions actively enforced in creating this report. To learn more, see [Access and
 * data-restriction management](https://support.google.com/analytics/answer/10851388).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Data API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SchemaRestrictionResponse extends com.google.api.client.json.GenericJson {

  /**
   * All restrictions actively enforced in creating the report. For example, `purchaseRevenue`
   * always has the restriction type `REVENUE_DATA`. However, this active response restriction is
   * only populated if the user's custom role disallows access to `REVENUE_DATA`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ActiveMetricRestriction> activeMetricRestrictions;

  static {
    // hack to force ProGuard to consider ActiveMetricRestriction used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ActiveMetricRestriction.class);
  }

  /**
   * All restrictions actively enforced in creating the report. For example, `purchaseRevenue`
   * always has the restriction type `REVENUE_DATA`. However, this active response restriction is
   * only populated if the user's custom role disallows access to `REVENUE_DATA`.
   * @return value or {@code null} for none
   */
  public java.util.List<ActiveMetricRestriction> getActiveMetricRestrictions() {
    return activeMetricRestrictions;
  }

  /**
   * All restrictions actively enforced in creating the report. For example, `purchaseRevenue`
   * always has the restriction type `REVENUE_DATA`. However, this active response restriction is
   * only populated if the user's custom role disallows access to `REVENUE_DATA`.
   * @param activeMetricRestrictions activeMetricRestrictions or {@code null} for none
   */
  public SchemaRestrictionResponse setActiveMetricRestrictions(java.util.List<ActiveMetricRestriction> activeMetricRestrictions) {
    this.activeMetricRestrictions = activeMetricRestrictions;
    return this;
  }

  @Override
  public SchemaRestrictionResponse set(String fieldName, Object value) {
    return (SchemaRestrictionResponse) super.set(fieldName, value);
  }

  @Override
  public SchemaRestrictionResponse clone() {
    return (SchemaRestrictionResponse) super.clone();
  }

}
