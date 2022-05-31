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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Source specific facet response
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FacetResult extends com.google.api.client.json.GenericJson {

  /**
   * FacetBuckets for values in response containing at least a single result with the corresponding
   * filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FacetBucket> buckets;

  static {
    // hack to force ProGuard to consider FacetBucket used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FacetBucket.class);
  }

  /**
   * Object type for which facet results are returned. Can be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectType;

  /**
   * Name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operatorName;

  /**
   * Source name for which facet results are returned. Will not be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceName;

  /**
   * FacetBuckets for values in response containing at least a single result with the corresponding
   * filter.
   * @return value or {@code null} for none
   */
  public java.util.List<FacetBucket> getBuckets() {
    return buckets;
  }

  /**
   * FacetBuckets for values in response containing at least a single result with the corresponding
   * filter.
   * @param buckets buckets or {@code null} for none
   */
  public FacetResult setBuckets(java.util.List<FacetBucket> buckets) {
    this.buckets = buckets;
    return this;
  }

  /**
   * Object type for which facet results are returned. Can be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectType() {
    return objectType;
  }

  /**
   * Object type for which facet results are returned. Can be empty.
   * @param objectType objectType or {@code null} for none
   */
  public FacetResult setObjectType(java.lang.String objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * Name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions
   * @return value or {@code null} for none
   */
  public java.lang.String getOperatorName() {
    return operatorName;
  }

  /**
   * Name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions
   * @param operatorName operatorName or {@code null} for none
   */
  public FacetResult setOperatorName(java.lang.String operatorName) {
    this.operatorName = operatorName;
    return this;
  }

  /**
   * Source name for which facet results are returned. Will not be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceName() {
    return sourceName;
  }

  /**
   * Source name for which facet results are returned. Will not be empty.
   * @param sourceName sourceName or {@code null} for none
   */
  public FacetResult setSourceName(java.lang.String sourceName) {
    this.sourceName = sourceName;
    return this;
  }

  @Override
  public FacetResult set(String fieldName, Object value) {
    return (FacetResult) super.set(fieldName, value);
  }

  @Override
  public FacetResult clone() {
    return (FacetResult) super.clone();
  }

}
