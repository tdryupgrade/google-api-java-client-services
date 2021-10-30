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

package com.google.api.services.searchconsole.v1.model;

/**
 * Model definition for SearchAnalyticsQueryRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Search Console API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchAnalyticsQueryRequest extends com.google.api.client.json.GenericJson {

  /**
   * [Optional; Default is \"auto\"] How data is aggregated. If aggregated by property, all data for
   * the same property is aggregated; if aggregated by page, all data is aggregated by canonical
   * URI. If you filter or group by page, choose AUTO; otherwise you can aggregate either by
   * property or by page, depending on how you want your data calculated; see the help documentation
   * to learn how data is calculated differently by site versus by page. **Note:** If you group or
   * filter by page, you cannot aggregate by property. If you specify any value other than AUTO, the
   * aggregation type in the result will match the requested type, or if you request an invalid
   * type, you will get an error. The API will never change your aggregation type if the requested
   * type is invalid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aggregationType;

  /**
   * The data state to be fetched, can be full or all, the latter including full and partial data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataState;

  /**
   * [Optional] Zero or more filters to apply to the dimension grouping values; for example, 'query
   * contains \"buy\"' to see only data where the query string contains the substring \"buy\" (not
   * case-sensitive). You can filter by a dimension without grouping by it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ApiDimensionFilterGroup> dimensionFilterGroups;

  static {
    // hack to force ProGuard to consider ApiDimensionFilterGroup used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ApiDimensionFilterGroup.class);
  }

  /**
   * [Optional] Zero or more dimensions to group results by. Dimensions are the group-by values in
   * the Search Analytics page. Dimensions are combined to create a unique row key for each row.
   * Results are grouped in the order that you supply these dimensions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dimensions;

  /**
   * [Required] End date of the requested date range, in YYYY-MM-DD format, in PST (UTC - 8:00).
   * Must be greater than or equal to the start date. This value is included in the range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endDate;

  /**
   * [Optional; Default is 1000] The maximum number of rows to return. Must be a number from 1 to
   * 25,000 (inclusive).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rowLimit;

  /**
   * [Optional; Default is \"web\"] The search type to filter for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchType;

  /**
   * [Required] Start date of the requested date range, in YYYY-MM-DD format, in PST time (UTC -
   * 8:00). Must be less than or equal to the end date. This value is included in the range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startDate;

  /**
   * [Optional; Default is 0] Zero-based index of the first row in the response. Must be a non-
   * negative number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startRow;

  /**
   * Optional. [Optional; Default is \"web\"] Type of report: search type, or either Discover or
   * Gnews.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * [Optional; Default is \"auto\"] How data is aggregated. If aggregated by property, all data for
   * the same property is aggregated; if aggregated by page, all data is aggregated by canonical
   * URI. If you filter or group by page, choose AUTO; otherwise you can aggregate either by
   * property or by page, depending on how you want your data calculated; see the help documentation
   * to learn how data is calculated differently by site versus by page. **Note:** If you group or
   * filter by page, you cannot aggregate by property. If you specify any value other than AUTO, the
   * aggregation type in the result will match the requested type, or if you request an invalid
   * type, you will get an error. The API will never change your aggregation type if the requested
   * type is invalid.
   * @return value or {@code null} for none
   */
  public java.lang.String getAggregationType() {
    return aggregationType;
  }

  /**
   * [Optional; Default is \"auto\"] How data is aggregated. If aggregated by property, all data for
   * the same property is aggregated; if aggregated by page, all data is aggregated by canonical
   * URI. If you filter or group by page, choose AUTO; otherwise you can aggregate either by
   * property or by page, depending on how you want your data calculated; see the help documentation
   * to learn how data is calculated differently by site versus by page. **Note:** If you group or
   * filter by page, you cannot aggregate by property. If you specify any value other than AUTO, the
   * aggregation type in the result will match the requested type, or if you request an invalid
   * type, you will get an error. The API will never change your aggregation type if the requested
   * type is invalid.
   * @param aggregationType aggregationType or {@code null} for none
   */
  public SearchAnalyticsQueryRequest setAggregationType(java.lang.String aggregationType) {
    this.aggregationType = aggregationType;
    return this;
  }

  /**
   * The data state to be fetched, can be full or all, the latter including full and partial data.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataState() {
    return dataState;
  }

  /**
   * The data state to be fetched, can be full or all, the latter including full and partial data.
   * @param dataState dataState or {@code null} for none
   */
  public SearchAnalyticsQueryRequest setDataState(java.lang.String dataState) {
    this.dataState = dataState;
    return this;
  }

  /**
   * [Optional] Zero or more filters to apply to the dimension grouping values; for example, 'query
   * contains \"buy\"' to see only data where the query string contains the substring \"buy\" (not
   * case-sensitive). You can filter by a dimension without grouping by it.
   * @return value or {@code null} for none
   */
  public java.util.List<ApiDimensionFilterGroup> getDimensionFilterGroups() {
    return dimensionFilterGroups;
  }

  /**
   * [Optional] Zero or more filters to apply to the dimension grouping values; for example, 'query
   * contains \"buy\"' to see only data where the query string contains the substring \"buy\" (not
   * case-sensitive). You can filter by a dimension without grouping by it.
   * @param dimensionFilterGroups dimensionFilterGroups or {@code null} for none
   */
  public SearchAnalyticsQueryRequest setDimensionFilterGroups(java.util.List<ApiDimensionFilterGroup> dimensionFilterGroups) {
    this.dimensionFilterGroups = dimensionFilterGroups;
    return this;
  }

  /**
   * [Optional] Zero or more dimensions to group results by. Dimensions are the group-by values in
   * the Search Analytics page. Dimensions are combined to create a unique row key for each row.
   * Results are grouped in the order that you supply these dimensions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDimensions() {
    return dimensions;
  }

  /**
   * [Optional] Zero or more dimensions to group results by. Dimensions are the group-by values in
   * the Search Analytics page. Dimensions are combined to create a unique row key for each row.
   * Results are grouped in the order that you supply these dimensions.
   * @param dimensions dimensions or {@code null} for none
   */
  public SearchAnalyticsQueryRequest setDimensions(java.util.List<java.lang.String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * [Required] End date of the requested date range, in YYYY-MM-DD format, in PST (UTC - 8:00).
   * Must be greater than or equal to the start date. This value is included in the range.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndDate() {
    return endDate;
  }

  /**
   * [Required] End date of the requested date range, in YYYY-MM-DD format, in PST (UTC - 8:00).
   * Must be greater than or equal to the start date. This value is included in the range.
   * @param endDate endDate or {@code null} for none
   */
  public SearchAnalyticsQueryRequest setEndDate(java.lang.String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * [Optional; Default is 1000] The maximum number of rows to return. Must be a number from 1 to
   * 25,000 (inclusive).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRowLimit() {
    return rowLimit;
  }

  /**
   * [Optional; Default is 1000] The maximum number of rows to return. Must be a number from 1 to
   * 25,000 (inclusive).
   * @param rowLimit rowLimit or {@code null} for none
   */
  public SearchAnalyticsQueryRequest setRowLimit(java.lang.Integer rowLimit) {
    this.rowLimit = rowLimit;
    return this;
  }

  /**
   * [Optional; Default is \"web\"] The search type to filter for.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchType() {
    return searchType;
  }

  /**
   * [Optional; Default is \"web\"] The search type to filter for.
   * @param searchType searchType or {@code null} for none
   */
  public SearchAnalyticsQueryRequest setSearchType(java.lang.String searchType) {
    this.searchType = searchType;
    return this;
  }

  /**
   * [Required] Start date of the requested date range, in YYYY-MM-DD format, in PST time (UTC -
   * 8:00). Must be less than or equal to the end date. This value is included in the range.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartDate() {
    return startDate;
  }

  /**
   * [Required] Start date of the requested date range, in YYYY-MM-DD format, in PST time (UTC -
   * 8:00). Must be less than or equal to the end date. This value is included in the range.
   * @param startDate startDate or {@code null} for none
   */
  public SearchAnalyticsQueryRequest setStartDate(java.lang.String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * [Optional; Default is 0] Zero-based index of the first row in the response. Must be a non-
   * negative number.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartRow() {
    return startRow;
  }

  /**
   * [Optional; Default is 0] Zero-based index of the first row in the response. Must be a non-
   * negative number.
   * @param startRow startRow or {@code null} for none
   */
  public SearchAnalyticsQueryRequest setStartRow(java.lang.Integer startRow) {
    this.startRow = startRow;
    return this;
  }

  /**
   * Optional. [Optional; Default is \"web\"] Type of report: search type, or either Discover or
   * Gnews.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Optional. [Optional; Default is \"web\"] Type of report: search type, or either Discover or
   * Gnews.
   * @param type type or {@code null} for none
   */
  public SearchAnalyticsQueryRequest setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public SearchAnalyticsQueryRequest set(String fieldName, Object value) {
    return (SearchAnalyticsQueryRequest) super.set(fieldName, value);
  }

  @Override
  public SearchAnalyticsQueryRequest clone() {
    return (SearchAnalyticsQueryRequest) super.clone();
  }

}
