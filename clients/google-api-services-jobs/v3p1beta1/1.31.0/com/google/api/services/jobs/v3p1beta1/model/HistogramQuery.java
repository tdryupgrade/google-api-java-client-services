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
 * Input Only. The histogram request.
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
public final class HistogramQuery extends com.google.api.client.json.GenericJson {

  /**
   * An expression specifies a histogram request against matching resources (for example, jobs) for
   * searches. Expression syntax is a aggregation function call with histogram facets and other
   * options. Available aggregation function calls are: * `count(string_histogram_facet)`: Count the
   * number of matching entity, for each distinct attribute value. * `count(numeric_histogram_facet,
   * list of buckets)`: Count the number of matching entity within each bucket. A maximum of 200
   * histogram buckets are supported. Data types: * Histogram facet: facet names with format
   * a-zA-Z+. * String: string like "any string with backslash escape for quote(\")." * Number:
   * whole number and floating point number like 10, -1 and -0.01. * List: list of elements with
   * comma(,) separator surrounded by square brackets. For example, [1, 2, 3] and ["one", "two",
   * "three"]. Built-in constants: * MIN (minimum number similar to java Double.MIN_VALUE) * MAX
   * (maximum number similar to java Double.MAX_VALUE) Built-in functions: * bucket(start, end[,
   * label]): bucket built-in function creates a bucket with range of start, end). Note that the end
   * is exclusive. For example, bucket(1, MAX, "positive number") or bucket(1, 10). Job histogram
   * facets: * company_id: histogram by [Job.distributor_company_id. * company_display_name:
   * histogram by Job.company_display_name. * employment_type: histogram by Job.employment_types.
   * For example, "FULL_TIME", "PART_TIME". * company_size: histogram by CompanySize, for example,
   * "SMALL", "MEDIUM", "BIG". * publish_time_in_day: histogram by the Job.publish_time in days.
   * Must specify list of numeric buckets in spec. * publish_time_in_month: histogram by the
   * Job.publish_time in months. Must specify list of numeric buckets in spec. *
   * publish_time_in_year: histogram by the Job.publish_time in years. Must specify list of numeric
   * buckets in spec. * degree_type: histogram by the Job.degree_type. For example, "Bachelors",
   * "Masters". * job_level: histogram by the Job.job_level. For example, "Entry Level". * country:
   * histogram by the country code of jobs. For example, "US", "FR". * admin1: histogram by the
   * admin1 code of jobs, which is a global placeholder referring to the state, province, or the
   * particular term a country uses to define the geographic structure below the country level. For
   * example, "CA", "IL". * city: histogram by a combination of the "city name, admin1 code". For
   * example, "Mountain View, CA", "New York, NY". * admin1_country: histogram by a combination of
   * the "admin1 code, country". For example, "CA, US", "IL, US". * city_coordinate: histogram by
   * the city center's GPS coordinates (latitude and longitude). For example,
   * 37.4038522,-122.0987765. Since the coordinates of a city center can change, customers may need
   * to refresh them periodically. * locale: histogram by the Job.language_code. For example, "en-
   * US", "fr-FR". * language: histogram by the language subtag of the Job.language_code. For
   * example, "en", "fr". * category: histogram by the JobCategory. For example, "COMPUTER_AND_IT",
   * "HEALTHCARE". * base_compensation_unit: histogram by the CompensationUnit of base salary. For
   * example, "WEEKLY", "MONTHLY". * base_compensation: histogram by the base salary. Must specify
   * list of numeric buckets to group results by. * annualized_base_compensation: histogram by the
   * base annualized salary. Must specify list of numeric buckets to group results by. *
   * annualized_total_compensation: histogram by the total annualized salary. Must specify list of
   * numeric buckets to group results by. * string_custom_attribute: histogram by string
   * Job.custom_attributes. Values can be accessed via square bracket notations like
   * string_custom_attribute["key1"]. * numeric_custom_attribute: histogram by numeric
   * Job.custom_attributes. Values can be accessed via square bracket notations like
   * numeric_custom_attribute["key1"]. Must specify list of numeric buckets to group results by.
   * Example expressions: * count(admin1) * count(base_compensation, [bucket(1000, 10000),
   * bucket(10000, 100000), bucket(100000, MAX)]) * count(string_custom_attribute["some-string-
   * custom-attribute"]) * count(numeric_custom_attribute["some-numeric-custom-attribute"],
   * [bucket(MIN, 0, "negative"), bucket(0, MAX, "non-negative")])
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String histogramQuery;

  /**
   * An expression specifies a histogram request against matching resources (for example, jobs) for
   * searches. Expression syntax is a aggregation function call with histogram facets and other
   * options. Available aggregation function calls are: * `count(string_histogram_facet)`: Count the
   * number of matching entity, for each distinct attribute value. * `count(numeric_histogram_facet,
   * list of buckets)`: Count the number of matching entity within each bucket. A maximum of 200
   * histogram buckets are supported. Data types: * Histogram facet: facet names with format
   * a-zA-Z+. * String: string like "any string with backslash escape for quote(\")." * Number:
   * whole number and floating point number like 10, -1 and -0.01. * List: list of elements with
   * comma(,) separator surrounded by square brackets. For example, [1, 2, 3] and ["one", "two",
   * "three"]. Built-in constants: * MIN (minimum number similar to java Double.MIN_VALUE) * MAX
   * (maximum number similar to java Double.MAX_VALUE) Built-in functions: * bucket(start, end[,
   * label]): bucket built-in function creates a bucket with range of start, end). Note that the end
   * is exclusive. For example, bucket(1, MAX, "positive number") or bucket(1, 10). Job histogram
   * facets: * company_id: histogram by [Job.distributor_company_id. * company_display_name:
   * histogram by Job.company_display_name. * employment_type: histogram by Job.employment_types.
   * For example, "FULL_TIME", "PART_TIME". * company_size: histogram by CompanySize, for example,
   * "SMALL", "MEDIUM", "BIG". * publish_time_in_day: histogram by the Job.publish_time in days.
   * Must specify list of numeric buckets in spec. * publish_time_in_month: histogram by the
   * Job.publish_time in months. Must specify list of numeric buckets in spec. *
   * publish_time_in_year: histogram by the Job.publish_time in years. Must specify list of numeric
   * buckets in spec. * degree_type: histogram by the Job.degree_type. For example, "Bachelors",
   * "Masters". * job_level: histogram by the Job.job_level. For example, "Entry Level". * country:
   * histogram by the country code of jobs. For example, "US", "FR". * admin1: histogram by the
   * admin1 code of jobs, which is a global placeholder referring to the state, province, or the
   * particular term a country uses to define the geographic structure below the country level. For
   * example, "CA", "IL". * city: histogram by a combination of the "city name, admin1 code". For
   * example, "Mountain View, CA", "New York, NY". * admin1_country: histogram by a combination of
   * the "admin1 code, country". For example, "CA, US", "IL, US". * city_coordinate: histogram by
   * the city center's GPS coordinates (latitude and longitude). For example,
   * 37.4038522,-122.0987765. Since the coordinates of a city center can change, customers may need
   * to refresh them periodically. * locale: histogram by the Job.language_code. For example, "en-
   * US", "fr-FR". * language: histogram by the language subtag of the Job.language_code. For
   * example, "en", "fr". * category: histogram by the JobCategory. For example, "COMPUTER_AND_IT",
   * "HEALTHCARE". * base_compensation_unit: histogram by the CompensationUnit of base salary. For
   * example, "WEEKLY", "MONTHLY". * base_compensation: histogram by the base salary. Must specify
   * list of numeric buckets to group results by. * annualized_base_compensation: histogram by the
   * base annualized salary. Must specify list of numeric buckets to group results by. *
   * annualized_total_compensation: histogram by the total annualized salary. Must specify list of
   * numeric buckets to group results by. * string_custom_attribute: histogram by string
   * Job.custom_attributes. Values can be accessed via square bracket notations like
   * string_custom_attribute["key1"]. * numeric_custom_attribute: histogram by numeric
   * Job.custom_attributes. Values can be accessed via square bracket notations like
   * numeric_custom_attribute["key1"]. Must specify list of numeric buckets to group results by.
   * Example expressions: * count(admin1) * count(base_compensation, [bucket(1000, 10000),
   * bucket(10000, 100000), bucket(100000, MAX)]) * count(string_custom_attribute["some-string-
   * custom-attribute"]) * count(numeric_custom_attribute["some-numeric-custom-attribute"],
   * [bucket(MIN, 0, "negative"), bucket(0, MAX, "non-negative")])
   * @return value or {@code null} for none
   */
  public java.lang.String getHistogramQuery() {
    return histogramQuery;
  }

  /**
   * An expression specifies a histogram request against matching resources (for example, jobs) for
   * searches. Expression syntax is a aggregation function call with histogram facets and other
   * options. Available aggregation function calls are: * `count(string_histogram_facet)`: Count the
   * number of matching entity, for each distinct attribute value. * `count(numeric_histogram_facet,
   * list of buckets)`: Count the number of matching entity within each bucket. A maximum of 200
   * histogram buckets are supported. Data types: * Histogram facet: facet names with format
   * a-zA-Z+. * String: string like "any string with backslash escape for quote(\")." * Number:
   * whole number and floating point number like 10, -1 and -0.01. * List: list of elements with
   * comma(,) separator surrounded by square brackets. For example, [1, 2, 3] and ["one", "two",
   * "three"]. Built-in constants: * MIN (minimum number similar to java Double.MIN_VALUE) * MAX
   * (maximum number similar to java Double.MAX_VALUE) Built-in functions: * bucket(start, end[,
   * label]): bucket built-in function creates a bucket with range of start, end). Note that the end
   * is exclusive. For example, bucket(1, MAX, "positive number") or bucket(1, 10). Job histogram
   * facets: * company_id: histogram by [Job.distributor_company_id. * company_display_name:
   * histogram by Job.company_display_name. * employment_type: histogram by Job.employment_types.
   * For example, "FULL_TIME", "PART_TIME". * company_size: histogram by CompanySize, for example,
   * "SMALL", "MEDIUM", "BIG". * publish_time_in_day: histogram by the Job.publish_time in days.
   * Must specify list of numeric buckets in spec. * publish_time_in_month: histogram by the
   * Job.publish_time in months. Must specify list of numeric buckets in spec. *
   * publish_time_in_year: histogram by the Job.publish_time in years. Must specify list of numeric
   * buckets in spec. * degree_type: histogram by the Job.degree_type. For example, "Bachelors",
   * "Masters". * job_level: histogram by the Job.job_level. For example, "Entry Level". * country:
   * histogram by the country code of jobs. For example, "US", "FR". * admin1: histogram by the
   * admin1 code of jobs, which is a global placeholder referring to the state, province, or the
   * particular term a country uses to define the geographic structure below the country level. For
   * example, "CA", "IL". * city: histogram by a combination of the "city name, admin1 code". For
   * example, "Mountain View, CA", "New York, NY". * admin1_country: histogram by a combination of
   * the "admin1 code, country". For example, "CA, US", "IL, US". * city_coordinate: histogram by
   * the city center's GPS coordinates (latitude and longitude). For example,
   * 37.4038522,-122.0987765. Since the coordinates of a city center can change, customers may need
   * to refresh them periodically. * locale: histogram by the Job.language_code. For example, "en-
   * US", "fr-FR". * language: histogram by the language subtag of the Job.language_code. For
   * example, "en", "fr". * category: histogram by the JobCategory. For example, "COMPUTER_AND_IT",
   * "HEALTHCARE". * base_compensation_unit: histogram by the CompensationUnit of base salary. For
   * example, "WEEKLY", "MONTHLY". * base_compensation: histogram by the base salary. Must specify
   * list of numeric buckets to group results by. * annualized_base_compensation: histogram by the
   * base annualized salary. Must specify list of numeric buckets to group results by. *
   * annualized_total_compensation: histogram by the total annualized salary. Must specify list of
   * numeric buckets to group results by. * string_custom_attribute: histogram by string
   * Job.custom_attributes. Values can be accessed via square bracket notations like
   * string_custom_attribute["key1"]. * numeric_custom_attribute: histogram by numeric
   * Job.custom_attributes. Values can be accessed via square bracket notations like
   * numeric_custom_attribute["key1"]. Must specify list of numeric buckets to group results by.
   * Example expressions: * count(admin1) * count(base_compensation, [bucket(1000, 10000),
   * bucket(10000, 100000), bucket(100000, MAX)]) * count(string_custom_attribute["some-string-
   * custom-attribute"]) * count(numeric_custom_attribute["some-numeric-custom-attribute"],
   * [bucket(MIN, 0, "negative"), bucket(0, MAX, "non-negative")])
   * @param histogramQuery histogramQuery or {@code null} for none
   */
  public HistogramQuery setHistogramQuery(java.lang.String histogramQuery) {
    this.histogramQuery = histogramQuery;
    return this;
  }

  @Override
  public HistogramQuery set(String fieldName, Object value) {
    return (HistogramQuery) super.set(fieldName, value);
  }

  @Override
  public HistogramQuery clone() {
    return (HistogramQuery) super.clone();
  }

}
