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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Model definition for GeostorePriceInfoSourceDetails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostorePriceInfoSourceDetails extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GeostorePriceInfoSourceDetailsSourceData> lastUpdateSources;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GeostorePriceInfoSourceDetailsSourceData> sourceData;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<GeostorePriceInfoSourceDetailsSourceData> getLastUpdateSources() {
    return lastUpdateSources;
  }

  /**
   * @param lastUpdateSources lastUpdateSources or {@code null} for none
   */
  public GeostorePriceInfoSourceDetails setLastUpdateSources(java.util.List<GeostorePriceInfoSourceDetailsSourceData> lastUpdateSources) {
    this.lastUpdateSources = lastUpdateSources;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<GeostorePriceInfoSourceDetailsSourceData> getSourceData() {
    return sourceData;
  }

  /**
   * @param sourceData sourceData or {@code null} for none
   */
  public GeostorePriceInfoSourceDetails setSourceData(java.util.List<GeostorePriceInfoSourceDetailsSourceData> sourceData) {
    this.sourceData = sourceData;
    return this;
  }

  @Override
  public GeostorePriceInfoSourceDetails set(String fieldName, Object value) {
    return (GeostorePriceInfoSourceDetails) super.set(fieldName, value);
  }

  @Override
  public GeostorePriceInfoSourceDetails clone() {
    return (GeostorePriceInfoSourceDetails) super.clone();
  }

}
