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
 * Exact match configuration.
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
public final class GoogleCloudContactcenterinsightsV1ExactMatchConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether to consider case sensitivity when performing an exact match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean caseSensitive;

  /**
   * Whether to consider case sensitivity when performing an exact match.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCaseSensitive() {
    return caseSensitive;
  }

  /**
   * Whether to consider case sensitivity when performing an exact match.
   * @param caseSensitive caseSensitive or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1ExactMatchConfig setCaseSensitive(java.lang.Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1ExactMatchConfig set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1ExactMatchConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1ExactMatchConfig clone() {
    return (GoogleCloudContactcenterinsightsV1ExactMatchConfig) super.clone();
  }

}
