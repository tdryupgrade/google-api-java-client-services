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

package com.google.api.services.searchads360.v0.model;

/**
 * A container for ad group criterion quality information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Ads 360 Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAdsSearchads360V0ResourcesAdGroupCriterionQualityInfo extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The quality score. This field may not be populated if Google does not have enough
   * information to determine a value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer qualityScore;

  /**
   * Output only. The quality score. This field may not be populated if Google does not have enough
   * information to determine a value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getQualityScore() {
    return qualityScore;
  }

  /**
   * Output only. The quality score. This field may not be populated if Google does not have enough
   * information to determine a value.
   * @param qualityScore qualityScore or {@code null} for none
   */
  public GoogleAdsSearchads360V0ResourcesAdGroupCriterionQualityInfo setQualityScore(java.lang.Integer qualityScore) {
    this.qualityScore = qualityScore;
    return this;
  }

  @Override
  public GoogleAdsSearchads360V0ResourcesAdGroupCriterionQualityInfo set(String fieldName, Object value) {
    return (GoogleAdsSearchads360V0ResourcesAdGroupCriterionQualityInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleAdsSearchads360V0ResourcesAdGroupCriterionQualityInfo clone() {
    return (GoogleAdsSearchads360V0ResourcesAdGroupCriterionQualityInfo) super.clone();
  }

}
