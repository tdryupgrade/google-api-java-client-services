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
 * Model definition for QueryRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryRequest extends com.google.api.client.json.GenericJson {

  /**
   * Connection properties.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ConnectionProperty> connectionProperties;

  static {
    // hack to force ProGuard to consider ConnectionProperty used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ConnectionProperty.class);
  }

  /**
   * If true, creates a new session, where session id will be a server generated random id. If
   * false, runs query with an existing session_id passed in ConnectionProperty, otherwise runs
   * query in non-session mode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean createSession;

  /**
   * [Optional] Specifies the default datasetId and projectId to assume for any unqualified table
   * names in the query. If not set, all table names in the query string must be qualified in the
   * format 'datasetId.tableId'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DatasetReference defaultDataset;

  /**
   * [Optional] If set to true, BigQuery doesn't run the job. Instead, if the query is valid,
   * BigQuery returns statistics about the job such as how many bytes would be processed. If the
   * query is invalid, an error returns. The default value is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dryRun;

  /**
   * The resource type of the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The labels associated with this job. You can use these to organize and group your jobs. Label
   * keys and values can be no longer than 63 characters, can only contain lowercase letters,
   * numeric characters, underscores and dashes. International characters are allowed. Label values
   * are optional. Label keys must start with a letter and each label in the list must have a
   * different key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The geographic location where the job should run. See details at
   * https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * [Optional] The maximum number of rows of data to return per page of results. Setting this flag
   * to a small value such as 1000 and then paging through results might improve reliability when
   * the query result set is large. In addition to this limit, responses are also limited to 10 MB.
   * By default, there is no maximum row count, and only the byte limit applies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long maxResults;

  /**
   * [Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond
   * this limit will fail (without incurring a charge). If unspecified, this will be set to your
   * project default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maximumBytesBilled;

  /**
   * Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use
   * named (@myparam) query parameters in this query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parameterMode;

  /**
   * [Deprecated] This property is deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean preserveNulls;

  /**
   * [Required] A query string, following the BigQuery query syntax, of the query to execute.
   * Example: "SELECT count(f1) FROM [myProjectId:myDatasetId.myTableId]".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * Query parameters for Standard SQL queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QueryParameter> queryParameters;

  static {
    // hack to force ProGuard to consider QueryParameter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(QueryParameter.class);
  }

  /**
   * A unique user provided identifier to ensure idempotent behavior for queries. Note that this is
   * different from the job_id. It has the following properties: 1. It is case-sensitive, limited to
   * up to 36 ASCII characters. A UUID is recommended. 2. Read only queries can ignore this token
   * since they are nullipotent by definition. 3. For the purposes of idempotency ensured by the
   * request_id, a request is considered duplicate of another only if they have the same request_id
   * and are actually duplicates. When determining whether a request is a duplicate of the previous
   * request, all parameters in the request that may affect the behavior are considered. For
   * example, query, connection_properties, query_parameters, use_legacy_sql are parameters that
   * affect the result and are considered when determining whether a request is a duplicate, but
   * properties like timeout_ms don't affect the result and are thus not considered. Dry run query
   * requests are never considered duplicate of another request. 4. When a duplicate mutating query
   * request is detected, it returns: a. the results of the mutation if it completes successfully
   * within the timeout. b. the running operation if it is still in progress at the end of the
   * timeout. 5. Its lifetime is limited to 15 minutes. In other words, if two requests are sent
   * with the same request_id, but more than 15 minutes apart, idempotency is not guaranteed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * [Optional] How long to wait for the query to complete, in milliseconds, before the request
   * times out and returns. Note that this is only a timeout for the request, not the query. If the
   * query takes longer to run than the timeout value, the call returns without any results and with
   * the 'jobComplete' flag set to false. You can call GetQueryResults() to wait for the query to
   * complete and read the results. The default value is 10000 milliseconds (10 seconds).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long timeoutMs;

  /**
   * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is
   * true. If set to false, the query will use BigQuery's standard SQL:
   * https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value
   * of flattenResults is ignored; query will be run as if flattenResults is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useLegacySql;

  /**
   * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort
   * cache that will be flushed whenever tables in the query are modified. The default value is
   * true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useQueryCache;

  /**
   * Connection properties.
   * @return value or {@code null} for none
   */
  public java.util.List<ConnectionProperty> getConnectionProperties() {
    return connectionProperties;
  }

  /**
   * Connection properties.
   * @param connectionProperties connectionProperties or {@code null} for none
   */
  public QueryRequest setConnectionProperties(java.util.List<ConnectionProperty> connectionProperties) {
    this.connectionProperties = connectionProperties;
    return this;
  }

  /**
   * If true, creates a new session, where session id will be a server generated random id. If
   * false, runs query with an existing session_id passed in ConnectionProperty, otherwise runs
   * query in non-session mode.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCreateSession() {
    return createSession;
  }

  /**
   * If true, creates a new session, where session id will be a server generated random id. If
   * false, runs query with an existing session_id passed in ConnectionProperty, otherwise runs
   * query in non-session mode.
   * @param createSession createSession or {@code null} for none
   */
  public QueryRequest setCreateSession(java.lang.Boolean createSession) {
    this.createSession = createSession;
    return this;
  }

  /**
   * [Optional] Specifies the default datasetId and projectId to assume for any unqualified table
   * names in the query. If not set, all table names in the query string must be qualified in the
   * format 'datasetId.tableId'.
   * @return value or {@code null} for none
   */
  public DatasetReference getDefaultDataset() {
    return defaultDataset;
  }

  /**
   * [Optional] Specifies the default datasetId and projectId to assume for any unqualified table
   * names in the query. If not set, all table names in the query string must be qualified in the
   * format 'datasetId.tableId'.
   * @param defaultDataset defaultDataset or {@code null} for none
   */
  public QueryRequest setDefaultDataset(DatasetReference defaultDataset) {
    this.defaultDataset = defaultDataset;
    return this;
  }

  /**
   * [Optional] If set to true, BigQuery doesn't run the job. Instead, if the query is valid,
   * BigQuery returns statistics about the job such as how many bytes would be processed. If the
   * query is invalid, an error returns. The default value is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDryRun() {
    return dryRun;
  }

  /**
   * [Optional] If set to true, BigQuery doesn't run the job. Instead, if the query is valid,
   * BigQuery returns statistics about the job such as how many bytes would be processed. If the
   * query is invalid, an error returns. The default value is false.
   * @param dryRun dryRun or {@code null} for none
   */
  public QueryRequest setDryRun(java.lang.Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * The resource type of the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The resource type of the request.
   * @param kind kind or {@code null} for none
   */
  public QueryRequest setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The labels associated with this job. You can use these to organize and group your jobs. Label
   * keys and values can be no longer than 63 characters, can only contain lowercase letters,
   * numeric characters, underscores and dashes. International characters are allowed. Label values
   * are optional. Label keys must start with a letter and each label in the list must have a
   * different key.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels associated with this job. You can use these to organize and group your jobs. Label
   * keys and values can be no longer than 63 characters, can only contain lowercase letters,
   * numeric characters, underscores and dashes. International characters are allowed. Label values
   * are optional. Label keys must start with a letter and each label in the list must have a
   * different key.
   * @param labels labels or {@code null} for none
   */
  public QueryRequest setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The geographic location where the job should run. See details at
   * https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The geographic location where the job should run. See details at
   * https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
   * @param location location or {@code null} for none
   */
  public QueryRequest setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * [Optional] The maximum number of rows of data to return per page of results. Setting this flag
   * to a small value such as 1000 and then paging through results might improve reliability when
   * the query result set is large. In addition to this limit, responses are also limited to 10 MB.
   * By default, there is no maximum row count, and only the byte limit applies.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxResults() {
    return maxResults;
  }

  /**
   * [Optional] The maximum number of rows of data to return per page of results. Setting this flag
   * to a small value such as 1000 and then paging through results might improve reliability when
   * the query result set is large. In addition to this limit, responses are also limited to 10 MB.
   * By default, there is no maximum row count, and only the byte limit applies.
   * @param maxResults maxResults or {@code null} for none
   */
  public QueryRequest setMaxResults(java.lang.Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * [Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond
   * this limit will fail (without incurring a charge). If unspecified, this will be set to your
   * project default.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaximumBytesBilled() {
    return maximumBytesBilled;
  }

  /**
   * [Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond
   * this limit will fail (without incurring a charge). If unspecified, this will be set to your
   * project default.
   * @param maximumBytesBilled maximumBytesBilled or {@code null} for none
   */
  public QueryRequest setMaximumBytesBilled(java.lang.Long maximumBytesBilled) {
    this.maximumBytesBilled = maximumBytesBilled;
    return this;
  }

  /**
   * Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use
   * named (@myparam) query parameters in this query.
   * @return value or {@code null} for none
   */
  public java.lang.String getParameterMode() {
    return parameterMode;
  }

  /**
   * Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use
   * named (@myparam) query parameters in this query.
   * @param parameterMode parameterMode or {@code null} for none
   */
  public QueryRequest setParameterMode(java.lang.String parameterMode) {
    this.parameterMode = parameterMode;
    return this;
  }

  /**
   * [Deprecated] This property is deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPreserveNulls() {
    return preserveNulls;
  }

  /**
   * [Deprecated] This property is deprecated.
   * @param preserveNulls preserveNulls or {@code null} for none
   */
  public QueryRequest setPreserveNulls(java.lang.Boolean preserveNulls) {
    this.preserveNulls = preserveNulls;
    return this;
  }

  /**
   * [Required] A query string, following the BigQuery query syntax, of the query to execute.
   * Example: "SELECT count(f1) FROM [myProjectId:myDatasetId.myTableId]".
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * [Required] A query string, following the BigQuery query syntax, of the query to execute.
   * Example: "SELECT count(f1) FROM [myProjectId:myDatasetId.myTableId]".
   * @param query query or {@code null} for none
   */
  public QueryRequest setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * Query parameters for Standard SQL queries.
   * @return value or {@code null} for none
   */
  public java.util.List<QueryParameter> getQueryParameters() {
    return queryParameters;
  }

  /**
   * Query parameters for Standard SQL queries.
   * @param queryParameters queryParameters or {@code null} for none
   */
  public QueryRequest setQueryParameters(java.util.List<QueryParameter> queryParameters) {
    this.queryParameters = queryParameters;
    return this;
  }

  /**
   * A unique user provided identifier to ensure idempotent behavior for queries. Note that this is
   * different from the job_id. It has the following properties: 1. It is case-sensitive, limited to
   * up to 36 ASCII characters. A UUID is recommended. 2. Read only queries can ignore this token
   * since they are nullipotent by definition. 3. For the purposes of idempotency ensured by the
   * request_id, a request is considered duplicate of another only if they have the same request_id
   * and are actually duplicates. When determining whether a request is a duplicate of the previous
   * request, all parameters in the request that may affect the behavior are considered. For
   * example, query, connection_properties, query_parameters, use_legacy_sql are parameters that
   * affect the result and are considered when determining whether a request is a duplicate, but
   * properties like timeout_ms don't affect the result and are thus not considered. Dry run query
   * requests are never considered duplicate of another request. 4. When a duplicate mutating query
   * request is detected, it returns: a. the results of the mutation if it completes successfully
   * within the timeout. b. the running operation if it is still in progress at the end of the
   * timeout. 5. Its lifetime is limited to 15 minutes. In other words, if two requests are sent
   * with the same request_id, but more than 15 minutes apart, idempotency is not guaranteed.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * A unique user provided identifier to ensure idempotent behavior for queries. Note that this is
   * different from the job_id. It has the following properties: 1. It is case-sensitive, limited to
   * up to 36 ASCII characters. A UUID is recommended. 2. Read only queries can ignore this token
   * since they are nullipotent by definition. 3. For the purposes of idempotency ensured by the
   * request_id, a request is considered duplicate of another only if they have the same request_id
   * and are actually duplicates. When determining whether a request is a duplicate of the previous
   * request, all parameters in the request that may affect the behavior are considered. For
   * example, query, connection_properties, query_parameters, use_legacy_sql are parameters that
   * affect the result and are considered when determining whether a request is a duplicate, but
   * properties like timeout_ms don't affect the result and are thus not considered. Dry run query
   * requests are never considered duplicate of another request. 4. When a duplicate mutating query
   * request is detected, it returns: a. the results of the mutation if it completes successfully
   * within the timeout. b. the running operation if it is still in progress at the end of the
   * timeout. 5. Its lifetime is limited to 15 minutes. In other words, if two requests are sent
   * with the same request_id, but more than 15 minutes apart, idempotency is not guaranteed.
   * @param requestId requestId or {@code null} for none
   */
  public QueryRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * [Optional] How long to wait for the query to complete, in milliseconds, before the request
   * times out and returns. Note that this is only a timeout for the request, not the query. If the
   * query takes longer to run than the timeout value, the call returns without any results and with
   * the 'jobComplete' flag set to false. You can call GetQueryResults() to wait for the query to
   * complete and read the results. The default value is 10000 milliseconds (10 seconds).
   * @return value or {@code null} for none
   */
  public java.lang.Long getTimeoutMs() {
    return timeoutMs;
  }

  /**
   * [Optional] How long to wait for the query to complete, in milliseconds, before the request
   * times out and returns. Note that this is only a timeout for the request, not the query. If the
   * query takes longer to run than the timeout value, the call returns without any results and with
   * the 'jobComplete' flag set to false. You can call GetQueryResults() to wait for the query to
   * complete and read the results. The default value is 10000 milliseconds (10 seconds).
   * @param timeoutMs timeoutMs or {@code null} for none
   */
  public QueryRequest setTimeoutMs(java.lang.Long timeoutMs) {
    this.timeoutMs = timeoutMs;
    return this;
  }

  /**
   * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is
   * true. If set to false, the query will use BigQuery's standard SQL:
   * https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value
   * of flattenResults is ignored; query will be run as if flattenResults is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseLegacySql() {
    return useLegacySql;
  }

  /**
   * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is
   * true. If set to false, the query will use BigQuery's standard SQL:
   * https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value
   * of flattenResults is ignored; query will be run as if flattenResults is false.
   * @param useLegacySql useLegacySql or {@code null} for none
   */
  public QueryRequest setUseLegacySql(java.lang.Boolean useLegacySql) {
    this.useLegacySql = useLegacySql;
    return this;
  }

  /**
   * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
   *
   * <p>
   * Boolean properties can have four possible values:
   * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
   * or {@link Boolean#FALSE}.
   * </p>
   *
   * <p>
   * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
   * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
   * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
   * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
   * </p>
   *
   * <p>
   * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true.
 If set to false, the query will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-
 reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be
 run as if flattenResults is false.
   * </p>
   */
  public boolean isUseLegacySql() {
    if (useLegacySql == null || useLegacySql == com.google.api.client.util.Data.NULL_BOOLEAN) {
      return true;
    }
    return useLegacySql;
  }

  /**
   * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort
   * cache that will be flushed whenever tables in the query are modified. The default value is
   * true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseQueryCache() {
    return useQueryCache;
  }

  /**
   * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort
   * cache that will be flushed whenever tables in the query are modified. The default value is
   * true.
   * @param useQueryCache useQueryCache or {@code null} for none
   */
  public QueryRequest setUseQueryCache(java.lang.Boolean useQueryCache) {
    this.useQueryCache = useQueryCache;
    return this;
  }

  /**
   * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
   *
   * <p>
   * Boolean properties can have four possible values:
   * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
   * or {@link Boolean#FALSE}.
   * </p>
   *
   * <p>
   * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
   * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
   * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
   * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
   * </p>
   *
   * <p>
   *[ Optional] Whether to look for the result in the query cache. The query cache is a best-effort
[ cache that will be flushed whenever tables in the query are modified. The default value is true.
   * </p>
   */
  public boolean isUseQueryCache() {
    if (useQueryCache == null || useQueryCache == com.google.api.client.util.Data.NULL_BOOLEAN) {
      return true;
    }
    return useQueryCache;
  }

  @Override
  public QueryRequest set(String fieldName, Object value) {
    return (QueryRequest) super.set(fieldName, value);
  }

  @Override
  public QueryRequest clone() {
    return (QueryRequest) super.clone();
  }

}
