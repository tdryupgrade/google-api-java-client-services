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

package com.google.api.services.jobs.v3p1beta1.model;

/**
 * Input only. The query required to perform a search query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobQuery extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Allows filtering jobs by commute time with different travel methods (for example,
   * driving or public transit). Note: This only works with COMMUTE MODE. When specified,
   * [JobQuery.location_filters] is ignored. Currently we don't support sorting by commute time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CommuteFilter commuteFilter;

  /**
   * Optional. This filter specifies the company Company.display_name of the jobs to search against.
   * The company name must match the value exactly. Alternatively, if the value being searched for
   * is wrapped in SUBSTRING_MATCH([value]), the company name must contain a case insensitive
   * substring match of the value. Using this function may increase latency. Sample Value:
   * SUBSTRING_MATCH(google) If a value isn't specified, jobs within the search results are
   * associated with any company. If multiple values are specified, jobs within the search results
   * may be associated with any of the specified companies. At most 20 company display name filters
   * are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> companyDisplayNames;

  /**
   * Optional. This filter specifies the company entities to search against. If a value isn't
   * specified, jobs are searched for against all companies. If multiple values are specified, jobs
   * are searched against the companies specified. The format is
   * "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-
   * project/companies/foo". At most 20 company filters are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> companyNames;

  /**
   * Optional. This search filter is applied only to Job.compensation_info. For example, if the
   * filter is specified as "Hourly job with per-hour compensation > $15", only jobs meeting these
   * criteria are searched. If a filter isn't defined, all open jobs are searched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CompensationFilter compensationFilter;

  /**
   * Optional. This filter specifies a structured syntax to match against the Job.custom_attributes
   * marked as `filterable`. The syntax for this expression is a subset of SQL syntax. Supported
   * operators are: `=`, `!=`, `<`, `<=`, `>`, and `>=` where the left of the operator is a custom
   * field key and the right of the operator is a number or a quoted string. You must escape
   * backslash (\\) and quote (\") characters. Supported functions are `LOWER([field_name])` to
   * perform a case insensitive match and `EMPTY([field_name])` to filter on the existence of a key.
   * Boolean expressions (AND/OR/NOT) are supported up to 3 levels of nesting (for example, "((A AND
   * B AND C) OR NOT D) AND E"), a maximum of 100 comparisons or functions are allowed in the
   * expression. The expression must be < 10000 bytes in length. Sample Query:
   * `(LOWER(driving_license)="class \"a\"" OR EMPTY(driving_license)) AND driving_years > 10`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customAttributeFilter;

  /**
   * Optional. This flag controls the spell-check feature. If false, the service attempts to correct
   * a misspelled query, for example, "enginee" is corrected to "engineer". Defaults to false: a
   * spell check is performed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableSpellCheck;

  /**
   * Optional. The employment type filter specifies the employment type of jobs to search against,
   * such as EmploymentType.FULL_TIME. If a value is not specified, jobs in the search results
   * includes any employment type. If multiple values are specified, jobs in the search results
   * include any of the specified employment types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> employmentTypes;

  /**
   * Optional. This filter specifies a list of job names to be excluded during search. At most 400
   * excluded job names are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> excludedJobs;

  /**
   * Optional. The category filter specifies the categories of jobs to search against. See Category
   * for more information. If a value is not specified, jobs from any category are searched against.
   * If multiple values are specified, jobs from any of the specified categories are searched
   * against.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> jobCategories;

  /**
   * Optional. This filter specifies the locale of jobs to search against, for example, "en-US". If
   * a value isn't specified, the search results can contain jobs in any locale. Language codes
   * should be in BCP-47 format, such as "en-US" or "sr-Latn". For more information, see [Tags for
   * Identifying Languages](https://tools.ietf.org/html/bcp47). At most 10 language code filters are
   * allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> languageCodes;

  /**
   * Optional. The location filter specifies geo-regions containing the jobs to search against. See
   * LocationFilter for more information. If a location value isn't specified, jobs fitting the
   * other search criteria are retrieved regardless of where they're located. If multiple values are
   * specified, jobs are retrieved from any of the specified locations. If different values are
   * specified for the LocationFilter.distance_in_miles parameter, the maximum provided distance is
   * used for all locations. At most 5 location filters are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LocationFilter> locationFilters;

  /**
   * Optional. Jobs published within a range specified by this filter are searched against.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimestampRange publishTimeRange;

  /**
   * Optional. The query string that matches against the job title, description, and location
   * fields. The maximum number of allowed characters is 255.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * The language code of query. For example, "en-US". This field helps to better interpret the
   * query. If a value isn't specified, the query language code is automatically detected, which may
   * not be accurate. Language code should be in BCP-47 format, such as "en-US" or "sr-Latn". For
   * more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queryLanguageCode;

  /**
   * Optional. Allows filtering jobs by commute time with different travel methods (for example,
   * driving or public transit). Note: This only works with COMMUTE MODE. When specified,
   * [JobQuery.location_filters] is ignored. Currently we don't support sorting by commute time.
   * @return value or {@code null} for none
   */
  public CommuteFilter getCommuteFilter() {
    return commuteFilter;
  }

  /**
   * Optional. Allows filtering jobs by commute time with different travel methods (for example,
   * driving or public transit). Note: This only works with COMMUTE MODE. When specified,
   * [JobQuery.location_filters] is ignored. Currently we don't support sorting by commute time.
   * @param commuteFilter commuteFilter or {@code null} for none
   */
  public JobQuery setCommuteFilter(CommuteFilter commuteFilter) {
    this.commuteFilter = commuteFilter;
    return this;
  }

  /**
   * Optional. This filter specifies the company Company.display_name of the jobs to search against.
   * The company name must match the value exactly. Alternatively, if the value being searched for
   * is wrapped in SUBSTRING_MATCH([value]), the company name must contain a case insensitive
   * substring match of the value. Using this function may increase latency. Sample Value:
   * SUBSTRING_MATCH(google) If a value isn't specified, jobs within the search results are
   * associated with any company. If multiple values are specified, jobs within the search results
   * may be associated with any of the specified companies. At most 20 company display name filters
   * are allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCompanyDisplayNames() {
    return companyDisplayNames;
  }

  /**
   * Optional. This filter specifies the company Company.display_name of the jobs to search against.
   * The company name must match the value exactly. Alternatively, if the value being searched for
   * is wrapped in SUBSTRING_MATCH([value]), the company name must contain a case insensitive
   * substring match of the value. Using this function may increase latency. Sample Value:
   * SUBSTRING_MATCH(google) If a value isn't specified, jobs within the search results are
   * associated with any company. If multiple values are specified, jobs within the search results
   * may be associated with any of the specified companies. At most 20 company display name filters
   * are allowed.
   * @param companyDisplayNames companyDisplayNames or {@code null} for none
   */
  public JobQuery setCompanyDisplayNames(java.util.List<java.lang.String> companyDisplayNames) {
    this.companyDisplayNames = companyDisplayNames;
    return this;
  }

  /**
   * Optional. This filter specifies the company entities to search against. If a value isn't
   * specified, jobs are searched for against all companies. If multiple values are specified, jobs
   * are searched against the companies specified. The format is
   * "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-
   * project/companies/foo". At most 20 company filters are allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCompanyNames() {
    return companyNames;
  }

  /**
   * Optional. This filter specifies the company entities to search against. If a value isn't
   * specified, jobs are searched for against all companies. If multiple values are specified, jobs
   * are searched against the companies specified. The format is
   * "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-
   * project/companies/foo". At most 20 company filters are allowed.
   * @param companyNames companyNames or {@code null} for none
   */
  public JobQuery setCompanyNames(java.util.List<java.lang.String> companyNames) {
    this.companyNames = companyNames;
    return this;
  }

  /**
   * Optional. This search filter is applied only to Job.compensation_info. For example, if the
   * filter is specified as "Hourly job with per-hour compensation > $15", only jobs meeting these
   * criteria are searched. If a filter isn't defined, all open jobs are searched.
   * @return value or {@code null} for none
   */
  public CompensationFilter getCompensationFilter() {
    return compensationFilter;
  }

  /**
   * Optional. This search filter is applied only to Job.compensation_info. For example, if the
   * filter is specified as "Hourly job with per-hour compensation > $15", only jobs meeting these
   * criteria are searched. If a filter isn't defined, all open jobs are searched.
   * @param compensationFilter compensationFilter or {@code null} for none
   */
  public JobQuery setCompensationFilter(CompensationFilter compensationFilter) {
    this.compensationFilter = compensationFilter;
    return this;
  }

  /**
   * Optional. This filter specifies a structured syntax to match against the Job.custom_attributes
   * marked as `filterable`. The syntax for this expression is a subset of SQL syntax. Supported
   * operators are: `=`, `!=`, `<`, `<=`, `>`, and `>=` where the left of the operator is a custom
   * field key and the right of the operator is a number or a quoted string. You must escape
   * backslash (\\) and quote (\") characters. Supported functions are `LOWER([field_name])` to
   * perform a case insensitive match and `EMPTY([field_name])` to filter on the existence of a key.
   * Boolean expressions (AND/OR/NOT) are supported up to 3 levels of nesting (for example, "((A AND
   * B AND C) OR NOT D) AND E"), a maximum of 100 comparisons or functions are allowed in the
   * expression. The expression must be < 10000 bytes in length. Sample Query:
   * `(LOWER(driving_license)="class \"a\"" OR EMPTY(driving_license)) AND driving_years > 10`
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomAttributeFilter() {
    return customAttributeFilter;
  }

  /**
   * Optional. This filter specifies a structured syntax to match against the Job.custom_attributes
   * marked as `filterable`. The syntax for this expression is a subset of SQL syntax. Supported
   * operators are: `=`, `!=`, `<`, `<=`, `>`, and `>=` where the left of the operator is a custom
   * field key and the right of the operator is a number or a quoted string. You must escape
   * backslash (\\) and quote (\") characters. Supported functions are `LOWER([field_name])` to
   * perform a case insensitive match and `EMPTY([field_name])` to filter on the existence of a key.
   * Boolean expressions (AND/OR/NOT) are supported up to 3 levels of nesting (for example, "((A AND
   * B AND C) OR NOT D) AND E"), a maximum of 100 comparisons or functions are allowed in the
   * expression. The expression must be < 10000 bytes in length. Sample Query:
   * `(LOWER(driving_license)="class \"a\"" OR EMPTY(driving_license)) AND driving_years > 10`
   * @param customAttributeFilter customAttributeFilter or {@code null} for none
   */
  public JobQuery setCustomAttributeFilter(java.lang.String customAttributeFilter) {
    this.customAttributeFilter = customAttributeFilter;
    return this;
  }

  /**
   * Optional. This flag controls the spell-check feature. If false, the service attempts to correct
   * a misspelled query, for example, "enginee" is corrected to "engineer". Defaults to false: a
   * spell check is performed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableSpellCheck() {
    return disableSpellCheck;
  }

  /**
   * Optional. This flag controls the spell-check feature. If false, the service attempts to correct
   * a misspelled query, for example, "enginee" is corrected to "engineer". Defaults to false: a
   * spell check is performed.
   * @param disableSpellCheck disableSpellCheck or {@code null} for none
   */
  public JobQuery setDisableSpellCheck(java.lang.Boolean disableSpellCheck) {
    this.disableSpellCheck = disableSpellCheck;
    return this;
  }

  /**
   * Optional. The employment type filter specifies the employment type of jobs to search against,
   * such as EmploymentType.FULL_TIME. If a value is not specified, jobs in the search results
   * includes any employment type. If multiple values are specified, jobs in the search results
   * include any of the specified employment types.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEmploymentTypes() {
    return employmentTypes;
  }

  /**
   * Optional. The employment type filter specifies the employment type of jobs to search against,
   * such as EmploymentType.FULL_TIME. If a value is not specified, jobs in the search results
   * includes any employment type. If multiple values are specified, jobs in the search results
   * include any of the specified employment types.
   * @param employmentTypes employmentTypes or {@code null} for none
   */
  public JobQuery setEmploymentTypes(java.util.List<java.lang.String> employmentTypes) {
    this.employmentTypes = employmentTypes;
    return this;
  }

  /**
   * Optional. This filter specifies a list of job names to be excluded during search. At most 400
   * excluded job names are allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExcludedJobs() {
    return excludedJobs;
  }

  /**
   * Optional. This filter specifies a list of job names to be excluded during search. At most 400
   * excluded job names are allowed.
   * @param excludedJobs excludedJobs or {@code null} for none
   */
  public JobQuery setExcludedJobs(java.util.List<java.lang.String> excludedJobs) {
    this.excludedJobs = excludedJobs;
    return this;
  }

  /**
   * Optional. The category filter specifies the categories of jobs to search against. See Category
   * for more information. If a value is not specified, jobs from any category are searched against.
   * If multiple values are specified, jobs from any of the specified categories are searched
   * against.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getJobCategories() {
    return jobCategories;
  }

  /**
   * Optional. The category filter specifies the categories of jobs to search against. See Category
   * for more information. If a value is not specified, jobs from any category are searched against.
   * If multiple values are specified, jobs from any of the specified categories are searched
   * against.
   * @param jobCategories jobCategories or {@code null} for none
   */
  public JobQuery setJobCategories(java.util.List<java.lang.String> jobCategories) {
    this.jobCategories = jobCategories;
    return this;
  }

  /**
   * Optional. This filter specifies the locale of jobs to search against, for example, "en-US". If
   * a value isn't specified, the search results can contain jobs in any locale. Language codes
   * should be in BCP-47 format, such as "en-US" or "sr-Latn". For more information, see [Tags for
   * Identifying Languages](https://tools.ietf.org/html/bcp47). At most 10 language code filters are
   * allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLanguageCodes() {
    return languageCodes;
  }

  /**
   * Optional. This filter specifies the locale of jobs to search against, for example, "en-US". If
   * a value isn't specified, the search results can contain jobs in any locale. Language codes
   * should be in BCP-47 format, such as "en-US" or "sr-Latn". For more information, see [Tags for
   * Identifying Languages](https://tools.ietf.org/html/bcp47). At most 10 language code filters are
   * allowed.
   * @param languageCodes languageCodes or {@code null} for none
   */
  public JobQuery setLanguageCodes(java.util.List<java.lang.String> languageCodes) {
    this.languageCodes = languageCodes;
    return this;
  }

  /**
   * Optional. The location filter specifies geo-regions containing the jobs to search against. See
   * LocationFilter for more information. If a location value isn't specified, jobs fitting the
   * other search criteria are retrieved regardless of where they're located. If multiple values are
   * specified, jobs are retrieved from any of the specified locations. If different values are
   * specified for the LocationFilter.distance_in_miles parameter, the maximum provided distance is
   * used for all locations. At most 5 location filters are allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<LocationFilter> getLocationFilters() {
    return locationFilters;
  }

  /**
   * Optional. The location filter specifies geo-regions containing the jobs to search against. See
   * LocationFilter for more information. If a location value isn't specified, jobs fitting the
   * other search criteria are retrieved regardless of where they're located. If multiple values are
   * specified, jobs are retrieved from any of the specified locations. If different values are
   * specified for the LocationFilter.distance_in_miles parameter, the maximum provided distance is
   * used for all locations. At most 5 location filters are allowed.
   * @param locationFilters locationFilters or {@code null} for none
   */
  public JobQuery setLocationFilters(java.util.List<LocationFilter> locationFilters) {
    this.locationFilters = locationFilters;
    return this;
  }

  /**
   * Optional. Jobs published within a range specified by this filter are searched against.
   * @return value or {@code null} for none
   */
  public TimestampRange getPublishTimeRange() {
    return publishTimeRange;
  }

  /**
   * Optional. Jobs published within a range specified by this filter are searched against.
   * @param publishTimeRange publishTimeRange or {@code null} for none
   */
  public JobQuery setPublishTimeRange(TimestampRange publishTimeRange) {
    this.publishTimeRange = publishTimeRange;
    return this;
  }

  /**
   * Optional. The query string that matches against the job title, description, and location
   * fields. The maximum number of allowed characters is 255.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Optional. The query string that matches against the job title, description, and location
   * fields. The maximum number of allowed characters is 255.
   * @param query query or {@code null} for none
   */
  public JobQuery setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * The language code of query. For example, "en-US". This field helps to better interpret the
   * query. If a value isn't specified, the query language code is automatically detected, which may
   * not be accurate. Language code should be in BCP-47 format, such as "en-US" or "sr-Latn". For
   * more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * @return value or {@code null} for none
   */
  public java.lang.String getQueryLanguageCode() {
    return queryLanguageCode;
  }

  /**
   * The language code of query. For example, "en-US". This field helps to better interpret the
   * query. If a value isn't specified, the query language code is automatically detected, which may
   * not be accurate. Language code should be in BCP-47 format, such as "en-US" or "sr-Latn". For
   * more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * @param queryLanguageCode queryLanguageCode or {@code null} for none
   */
  public JobQuery setQueryLanguageCode(java.lang.String queryLanguageCode) {
    this.queryLanguageCode = queryLanguageCode;
    return this;
  }

  @Override
  public JobQuery set(String fieldName, Object value) {
    return (JobQuery) super.set(fieldName, value);
  }

  @Override
  public JobQuery clone() {
    return (JobQuery) super.clone();
  }

}
