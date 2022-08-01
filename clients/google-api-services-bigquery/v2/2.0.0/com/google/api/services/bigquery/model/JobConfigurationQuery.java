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
 * Model definition for JobConfigurationQuery.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobConfigurationQuery extends com.google.api.client.json.GenericJson {

  /**
   * [Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily
   * large result tables at a slight cost in performance. Requires destinationTable to be set. For
   * standard SQL queries, this flag is ignored and large results are always allowed. However, you
   * must still set destinationTable when result size exceeds the allowed maximum response size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowLargeResults;

  /**
   * [Beta] Clustering specification for the destination table. Must be specified with time-based
   * partitioning, data in the table will be first partitioned and subsequently clustered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Clustering clustering;

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
   * [Optional] Specifies whether the job is allowed to create new tables. The following values are
   * supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
   * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in
   * the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions
   * occur as one atomic update upon job completion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String createDisposition;

  /**
   * If true, creates a new session, where session id will be a server generated random id. If
   * false, runs query with an existing session_id passed in ConnectionProperty, otherwise runs
   * query in non-session mode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean createSession;

  /**
   * [Optional] Specifies the default dataset to use for unqualified table names in the query. Note
   * that this does not alter behavior of unqualified dataset names.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DatasetReference defaultDataset;

  /**
   * Custom encryption configuration (e.g., Cloud KMS keys).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EncryptionConfiguration destinationEncryptionConfiguration;

  /**
   * [Optional] Describes the table where the query results should be stored. If not present, a new
   * table will be created to store the results. This property must be set for large results that
   * exceed the maximum response size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableReference destinationTable;

  /**
   * [Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields
   * in the query results. allowLargeResults must be true if this is set to false. For standard SQL
   * queries, this flag is ignored and results are never flattened.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean flattenResults;

  /**
   * [Optional] Limits the billing tier for this job. Queries that have resource usage beyond this
   * tier will fail (without incurring a charge). If unspecified, this will be set to your project
   * default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maximumBillingTier;

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
   * [Optional] Specifies a priority for the query. Possible values include INTERACTIVE and BATCH.
   * The default value is INTERACTIVE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String priority;

  /**
   * [Required] SQL query text to execute. The useLegacySql field can be used to indicate whether
   * the query uses legacy SQL or standard SQL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * Query parameters for standard SQL queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QueryParameter> queryParameters;

  /**
   * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning
   * and rangePartitioning should be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RangePartitioning rangePartitioning;

  /**
   * Allows the schema of the destination table to be updated as a side effect of the query job.
   * Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when
   * writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table,
   * specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the
   * schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a
   * nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the
   * original schema to nullable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> schemaUpdateOptions;

  /**
   * [Optional] If querying an external data source outside of BigQuery, describes the data format,
   * location and other properties of the data source. By defining these properties, the data source
   * can then be queried as if it were a standard BigQuery table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ExternalDataConfiguration> tableDefinitions;

  static {
    // hack to force ProGuard to consider ExternalDataConfiguration used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ExternalDataConfiguration.class);
  }

  /**
   * Time-based partitioning specification for the destination table. Only one of timePartitioning
   * and rangePartitioning should be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimePartitioning timePartitioning;

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
   * cache that will be flushed whenever tables in the query are modified. Moreover, the query cache
   * is only available when a query does not have a destination table specified. The default value
   * is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useQueryCache;

  /**
   * Describes user-defined function resources used in the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UserDefinedFunctionResource> userDefinedFunctionResources;

  /**
   * [Optional] Specifies the action that occurs if the destination table already exists. The
   * following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery
   * overwrites the table data and uses the schema from the query result. WRITE_APPEND: If the table
   * already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already
   * exists and contains data, a 'duplicate' error is returned in the job result. The default value
   * is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job
   * successfully. Creation, truncation and append actions occur as one atomic update upon job
   * completion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String writeDisposition;

  /**
   * [Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily
   * large result tables at a slight cost in performance. Requires destinationTable to be set. For
   * standard SQL queries, this flag is ignored and large results are always allowed. However, you
   * must still set destinationTable when result size exceeds the allowed maximum response size.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowLargeResults() {
    return allowLargeResults;
  }

  /**
   * [Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily
   * large result tables at a slight cost in performance. Requires destinationTable to be set. For
   * standard SQL queries, this flag is ignored and large results are always allowed. However, you
   * must still set destinationTable when result size exceeds the allowed maximum response size.
   * @param allowLargeResults allowLargeResults or {@code null} for none
   */
  public JobConfigurationQuery setAllowLargeResults(java.lang.Boolean allowLargeResults) {
    this.allowLargeResults = allowLargeResults;
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
   *[ Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large
[ result tables at a slight cost in performance. Requires destinationTable to be set. For standard
[ SQL queries, this flag is ignored and large results are always allowed. However, you must still
[ set destinationTable when result size exceeds the allowed maximum response size.
   * </p>
   */
  public boolean isAllowLargeResults() {
    if (allowLargeResults == null || allowLargeResults == com.google.api.client.util.Data.NULL_BOOLEAN) {
      return false;
    }
    return allowLargeResults;
  }

  /**
   * [Beta] Clustering specification for the destination table. Must be specified with time-based
   * partitioning, data in the table will be first partitioned and subsequently clustered.
   * @return value or {@code null} for none
   */
  public Clustering getClustering() {
    return clustering;
  }

  /**
   * [Beta] Clustering specification for the destination table. Must be specified with time-based
   * partitioning, data in the table will be first partitioned and subsequently clustered.
   * @param clustering clustering or {@code null} for none
   */
  public JobConfigurationQuery setClustering(Clustering clustering) {
    this.clustering = clustering;
    return this;
  }

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
  public JobConfigurationQuery setConnectionProperties(java.util.List<ConnectionProperty> connectionProperties) {
    this.connectionProperties = connectionProperties;
    return this;
  }

  /**
   * [Optional] Specifies whether the job is allowed to create new tables. The following values are
   * supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
   * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in
   * the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions
   * occur as one atomic update upon job completion.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreateDisposition() {
    return createDisposition;
  }

  /**
   * [Optional] Specifies whether the job is allowed to create new tables. The following values are
   * supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
   * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in
   * the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions
   * occur as one atomic update upon job completion.
   * @param createDisposition createDisposition or {@code null} for none
   */
  public JobConfigurationQuery setCreateDisposition(java.lang.String createDisposition) {
    this.createDisposition = createDisposition;
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
  public JobConfigurationQuery setCreateSession(java.lang.Boolean createSession) {
    this.createSession = createSession;
    return this;
  }

  /**
   * [Optional] Specifies the default dataset to use for unqualified table names in the query. Note
   * that this does not alter behavior of unqualified dataset names.
   * @return value or {@code null} for none
   */
  public DatasetReference getDefaultDataset() {
    return defaultDataset;
  }

  /**
   * [Optional] Specifies the default dataset to use for unqualified table names in the query. Note
   * that this does not alter behavior of unqualified dataset names.
   * @param defaultDataset defaultDataset or {@code null} for none
   */
  public JobConfigurationQuery setDefaultDataset(DatasetReference defaultDataset) {
    this.defaultDataset = defaultDataset;
    return this;
  }

  /**
   * Custom encryption configuration (e.g., Cloud KMS keys).
   * @return value or {@code null} for none
   */
  public EncryptionConfiguration getDestinationEncryptionConfiguration() {
    return destinationEncryptionConfiguration;
  }

  /**
   * Custom encryption configuration (e.g., Cloud KMS keys).
   * @param destinationEncryptionConfiguration destinationEncryptionConfiguration or {@code null} for none
   */
  public JobConfigurationQuery setDestinationEncryptionConfiguration(EncryptionConfiguration destinationEncryptionConfiguration) {
    this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
    return this;
  }

  /**
   * [Optional] Describes the table where the query results should be stored. If not present, a new
   * table will be created to store the results. This property must be set for large results that
   * exceed the maximum response size.
   * @return value or {@code null} for none
   */
  public TableReference getDestinationTable() {
    return destinationTable;
  }

  /**
   * [Optional] Describes the table where the query results should be stored. If not present, a new
   * table will be created to store the results. This property must be set for large results that
   * exceed the maximum response size.
   * @param destinationTable destinationTable or {@code null} for none
   */
  public JobConfigurationQuery setDestinationTable(TableReference destinationTable) {
    this.destinationTable = destinationTable;
    return this;
  }

  /**
   * [Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields
   * in the query results. allowLargeResults must be true if this is set to false. For standard SQL
   * queries, this flag is ignored and results are never flattened.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFlattenResults() {
    return flattenResults;
  }

  /**
   * [Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields
   * in the query results. allowLargeResults must be true if this is set to false. For standard SQL
   * queries, this flag is ignored and results are never flattened.
   * @param flattenResults flattenResults or {@code null} for none
   */
  public JobConfigurationQuery setFlattenResults(java.lang.Boolean flattenResults) {
    this.flattenResults = flattenResults;
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
   *[ Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields in
[ the query results. allowLargeResults must be true if this is set to false. For standard SQL
[ queries, this flag is ignored and results are never flattened.
   * </p>
   */
  public boolean isFlattenResults() {
    if (flattenResults == null || flattenResults == com.google.api.client.util.Data.NULL_BOOLEAN) {
      return true;
    }
    return flattenResults;
  }

  /**
   * [Optional] Limits the billing tier for this job. Queries that have resource usage beyond this
   * tier will fail (without incurring a charge). If unspecified, this will be set to your project
   * default.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaximumBillingTier() {
    return maximumBillingTier;
  }

  /**
   * [Optional] Limits the billing tier for this job. Queries that have resource usage beyond this
   * tier will fail (without incurring a charge). If unspecified, this will be set to your project
   * default.
   * @param maximumBillingTier maximumBillingTier or {@code null} for none
   */
  public JobConfigurationQuery setMaximumBillingTier(java.lang.Integer maximumBillingTier) {
    this.maximumBillingTier = maximumBillingTier;
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
  public JobConfigurationQuery setMaximumBytesBilled(java.lang.Long maximumBytesBilled) {
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
  public JobConfigurationQuery setParameterMode(java.lang.String parameterMode) {
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
  public JobConfigurationQuery setPreserveNulls(java.lang.Boolean preserveNulls) {
    this.preserveNulls = preserveNulls;
    return this;
  }

  /**
   * [Optional] Specifies a priority for the query. Possible values include INTERACTIVE and BATCH.
   * The default value is INTERACTIVE.
   * @return value or {@code null} for none
   */
  public java.lang.String getPriority() {
    return priority;
  }

  /**
   * [Optional] Specifies a priority for the query. Possible values include INTERACTIVE and BATCH.
   * The default value is INTERACTIVE.
   * @param priority priority or {@code null} for none
   */
  public JobConfigurationQuery setPriority(java.lang.String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * [Required] SQL query text to execute. The useLegacySql field can be used to indicate whether
   * the query uses legacy SQL or standard SQL.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * [Required] SQL query text to execute. The useLegacySql field can be used to indicate whether
   * the query uses legacy SQL or standard SQL.
   * @param query query or {@code null} for none
   */
  public JobConfigurationQuery setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * Query parameters for standard SQL queries.
   * @return value or {@code null} for none
   */
  public java.util.List<QueryParameter> getQueryParameters() {
    return queryParameters;
  }

  /**
   * Query parameters for standard SQL queries.
   * @param queryParameters queryParameters or {@code null} for none
   */
  public JobConfigurationQuery setQueryParameters(java.util.List<QueryParameter> queryParameters) {
    this.queryParameters = queryParameters;
    return this;
  }

  /**
   * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning
   * and rangePartitioning should be specified.
   * @return value or {@code null} for none
   */
  public RangePartitioning getRangePartitioning() {
    return rangePartitioning;
  }

  /**
   * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning
   * and rangePartitioning should be specified.
   * @param rangePartitioning rangePartitioning or {@code null} for none
   */
  public JobConfigurationQuery setRangePartitioning(RangePartitioning rangePartitioning) {
    this.rangePartitioning = rangePartitioning;
    return this;
  }

  /**
   * Allows the schema of the destination table to be updated as a side effect of the query job.
   * Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when
   * writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table,
   * specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the
   * schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a
   * nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the
   * original schema to nullable.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSchemaUpdateOptions() {
    return schemaUpdateOptions;
  }

  /**
   * Allows the schema of the destination table to be updated as a side effect of the query job.
   * Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when
   * writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table,
   * specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the
   * schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a
   * nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the
   * original schema to nullable.
   * @param schemaUpdateOptions schemaUpdateOptions or {@code null} for none
   */
  public JobConfigurationQuery setSchemaUpdateOptions(java.util.List<java.lang.String> schemaUpdateOptions) {
    this.schemaUpdateOptions = schemaUpdateOptions;
    return this;
  }

  /**
   * [Optional] If querying an external data source outside of BigQuery, describes the data format,
   * location and other properties of the data source. By defining these properties, the data source
   * can then be queried as if it were a standard BigQuery table.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ExternalDataConfiguration> getTableDefinitions() {
    return tableDefinitions;
  }

  /**
   * [Optional] If querying an external data source outside of BigQuery, describes the data format,
   * location and other properties of the data source. By defining these properties, the data source
   * can then be queried as if it were a standard BigQuery table.
   * @param tableDefinitions tableDefinitions or {@code null} for none
   */
  public JobConfigurationQuery setTableDefinitions(java.util.Map<String, ExternalDataConfiguration> tableDefinitions) {
    this.tableDefinitions = tableDefinitions;
    return this;
  }

  /**
   * Time-based partitioning specification for the destination table. Only one of timePartitioning
   * and rangePartitioning should be specified.
   * @return value or {@code null} for none
   */
  public TimePartitioning getTimePartitioning() {
    return timePartitioning;
  }

  /**
   * Time-based partitioning specification for the destination table. Only one of timePartitioning
   * and rangePartitioning should be specified.
   * @param timePartitioning timePartitioning or {@code null} for none
   */
  public JobConfigurationQuery setTimePartitioning(TimePartitioning timePartitioning) {
    this.timePartitioning = timePartitioning;
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
  public JobConfigurationQuery setUseLegacySql(java.lang.Boolean useLegacySql) {
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
   * cache that will be flushed whenever tables in the query are modified. Moreover, the query cache
   * is only available when a query does not have a destination table specified. The default value
   * is true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseQueryCache() {
    return useQueryCache;
  }

  /**
   * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort
   * cache that will be flushed whenever tables in the query are modified. Moreover, the query cache
   * is only available when a query does not have a destination table specified. The default value
   * is true.
   * @param useQueryCache useQueryCache or {@code null} for none
   */
  public JobConfigurationQuery setUseQueryCache(java.lang.Boolean useQueryCache) {
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
[ cache that will be flushed whenever tables in the query are modified. Moreover, the query cache is
[ only available when a query does not have a destination table specified. The default value is
[ true.
   * </p>
   */
  public boolean isUseQueryCache() {
    if (useQueryCache == null || useQueryCache == com.google.api.client.util.Data.NULL_BOOLEAN) {
      return true;
    }
    return useQueryCache;
  }

  /**
   * Describes user-defined function resources used in the query.
   * @return value or {@code null} for none
   */
  public java.util.List<UserDefinedFunctionResource> getUserDefinedFunctionResources() {
    return userDefinedFunctionResources;
  }

  /**
   * Describes user-defined function resources used in the query.
   * @param userDefinedFunctionResources userDefinedFunctionResources or {@code null} for none
   */
  public JobConfigurationQuery setUserDefinedFunctionResources(java.util.List<UserDefinedFunctionResource> userDefinedFunctionResources) {
    this.userDefinedFunctionResources = userDefinedFunctionResources;
    return this;
  }

  /**
   * [Optional] Specifies the action that occurs if the destination table already exists. The
   * following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery
   * overwrites the table data and uses the schema from the query result. WRITE_APPEND: If the table
   * already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already
   * exists and contains data, a 'duplicate' error is returned in the job result. The default value
   * is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job
   * successfully. Creation, truncation and append actions occur as one atomic update upon job
   * completion.
   * @return value or {@code null} for none
   */
  public java.lang.String getWriteDisposition() {
    return writeDisposition;
  }

  /**
   * [Optional] Specifies the action that occurs if the destination table already exists. The
   * following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery
   * overwrites the table data and uses the schema from the query result. WRITE_APPEND: If the table
   * already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already
   * exists and contains data, a 'duplicate' error is returned in the job result. The default value
   * is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job
   * successfully. Creation, truncation and append actions occur as one atomic update upon job
   * completion.
   * @param writeDisposition writeDisposition or {@code null} for none
   */
  public JobConfigurationQuery setWriteDisposition(java.lang.String writeDisposition) {
    this.writeDisposition = writeDisposition;
    return this;
  }

  @Override
  public JobConfigurationQuery set(String fieldName, Object value) {
    return (JobConfigurationQuery) super.set(fieldName, value);
  }

  @Override
  public JobConfigurationQuery clone() {
    return (JobConfigurationQuery) super.clone();
  }

}
