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
 * Dimensions' values in a single pivot.
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
public final class PivotHeader extends com.google.api.client.json.GenericJson {

  /**
   * The size is the same as the cardinality of the corresponding dimension combinations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PivotDimensionHeader> pivotDimensionHeaders;

  static {
    // hack to force ProGuard to consider PivotDimensionHeader used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PivotDimensionHeader.class);
  }

  /**
   * The cardinality of the pivot. The total number of rows for this pivot's fields regardless of
   * how the parameters `offset` and `limit` are specified in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rowCount;

  /**
   * The size is the same as the cardinality of the corresponding dimension combinations.
   * @return value or {@code null} for none
   */
  public java.util.List<PivotDimensionHeader> getPivotDimensionHeaders() {
    return pivotDimensionHeaders;
  }

  /**
   * The size is the same as the cardinality of the corresponding dimension combinations.
   * @param pivotDimensionHeaders pivotDimensionHeaders or {@code null} for none
   */
  public PivotHeader setPivotDimensionHeaders(java.util.List<PivotDimensionHeader> pivotDimensionHeaders) {
    this.pivotDimensionHeaders = pivotDimensionHeaders;
    return this;
  }

  /**
   * The cardinality of the pivot. The total number of rows for this pivot's fields regardless of
   * how the parameters `offset` and `limit` are specified in the request.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRowCount() {
    return rowCount;
  }

  /**
   * The cardinality of the pivot. The total number of rows for this pivot's fields regardless of
   * how the parameters `offset` and `limit` are specified in the request.
   * @param rowCount rowCount or {@code null} for none
   */
  public PivotHeader setRowCount(java.lang.Integer rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  @Override
  public PivotHeader set(String fieldName, Object value) {
    return (PivotHeader) super.set(fieldName, value);
  }

  @Override
  public PivotHeader clone() {
    return (PivotHeader) super.clone();
  }

}
