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

package com.google.api.services.migrationcenter.v1alpha1.model;

/**
 * Message containing insights list.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migration Center API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InsightList extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Insights of the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Insight> insights;

  static {
    // hack to force ProGuard to consider Insight used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Insight.class);
  }

  /**
   * Output only. Update timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Insights of the list.
   * @return value or {@code null} for none
   */
  public java.util.List<Insight> getInsights() {
    return insights;
  }

  /**
   * Output only. Insights of the list.
   * @param insights insights or {@code null} for none
   */
  public InsightList setInsights(java.util.List<Insight> insights) {
    this.insights = insights;
    return this;
  }

  /**
   * Output only. Update timestamp.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Update timestamp.
   * @param updateTime updateTime or {@code null} for none
   */
  public InsightList setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public InsightList set(String fieldName, Object value) {
    return (InsightList) super.set(fieldName, value);
  }

  @Override
  public InsightList clone() {
    return (InsightList) super.clone();
  }

}
