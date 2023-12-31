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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * A message representing a rule in the phrase matcher.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup extends com.google.api.client.json.GenericJson {

  /**
   * A list of phrase match rules that are included in this group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudContactcenterinsightsV1PhraseMatchRule> phraseMatchRules;

  static {
    // hack to force ProGuard to consider GoogleCloudContactcenterinsightsV1PhraseMatchRule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudContactcenterinsightsV1PhraseMatchRule.class);
  }

  /**
   * Required. The type of this phrase match rule group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * A list of phrase match rules that are included in this group.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudContactcenterinsightsV1PhraseMatchRule> getPhraseMatchRules() {
    return phraseMatchRules;
  }

  /**
   * A list of phrase match rules that are included in this group.
   * @param phraseMatchRules phraseMatchRules or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup setPhraseMatchRules(java.util.List<GoogleCloudContactcenterinsightsV1PhraseMatchRule> phraseMatchRules) {
    this.phraseMatchRules = phraseMatchRules;
    return this;
  }

  /**
   * Required. The type of this phrase match rule group.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The type of this phrase match rule group.
   * @param type type or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup clone() {
    return (GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup) super.clone();
  }

}
