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

package com.google.api.services.bigquery.model;

/**
 * Explanation for a single feature.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Explanation extends com.google.api.client.json.GenericJson {

  /**
   * Attribution of feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double attribution;

  /**
   * The full feature name. For non-numerical features, will be formatted like `.`. Overall size of
   * feature name will always be truncated to first 120 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String featureName;

  /**
   * Attribution of feature.
   * @return value or {@code null} for none
   */
  public java.lang.Double getAttribution() {
    return attribution;
  }

  /**
   * Attribution of feature.
   * @param attribution attribution or {@code null} for none
   */
  public Explanation setAttribution(java.lang.Double attribution) {
    this.attribution = attribution;
    return this;
  }

  /**
   * The full feature name. For non-numerical features, will be formatted like `.`. Overall size of
   * feature name will always be truncated to first 120 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getFeatureName() {
    return featureName;
  }

  /**
   * The full feature name. For non-numerical features, will be formatted like `.`. Overall size of
   * feature name will always be truncated to first 120 characters.
   * @param featureName featureName or {@code null} for none
   */
  public Explanation setFeatureName(java.lang.String featureName) {
    this.featureName = featureName;
    return this;
  }

  @Override
  public Explanation set(String fieldName, Object value) {
    return (Explanation) super.set(fieldName, value);
  }

  @Override
  public Explanation clone() {
    return (Explanation) super.clone();
  }

}
