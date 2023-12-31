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

package com.google.api.services.people.v1.model;

/**
 * A person's past or current organization. Overlapping date ranges are permitted.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Organization extends com.google.api.client.json.GenericJson {

  /**
   * The person's cost center at the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String costCenter;

  /**
   * True if the organization is the person's current organization; false if the organization is a
   * past organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean current;

  /**
   * The person's department at the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String department;

  /**
   * The domain name associated with the organization; for example, `google.com`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * The end date when the person left the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date endDate;

  /**
   * Output only. The type of the organization translated and formatted in the viewer's account
   * locale or the `Accept-Language` HTTP header locale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedType;

  /**
   * The person's full-time equivalent millipercent within the organization (100000 = 100%).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer fullTimeEquivalentMillipercent;

  /**
   * The person's job description at the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobDescription;

  /**
   * The location of the organization office the person works at.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Metadata about the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FieldMetadata metadata;

  /**
   * The name of the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The phonetic name of the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneticName;

  /**
   * The start date when the person joined the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date startDate;

  /**
   * The symbol associated with the organization; for example, a stock ticker symbol, abbreviation,
   * or acronym.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String symbol;

  /**
   * The person's job title at the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The type of the organization. The type can be custom or one of these predefined values: *
   * `work` * `school`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The person's cost center at the organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getCostCenter() {
    return costCenter;
  }

  /**
   * The person's cost center at the organization.
   * @param costCenter costCenter or {@code null} for none
   */
  public Organization setCostCenter(java.lang.String costCenter) {
    this.costCenter = costCenter;
    return this;
  }

  /**
   * True if the organization is the person's current organization; false if the organization is a
   * past organization.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCurrent() {
    return current;
  }

  /**
   * True if the organization is the person's current organization; false if the organization is a
   * past organization.
   * @param current current or {@code null} for none
   */
  public Organization setCurrent(java.lang.Boolean current) {
    this.current = current;
    return this;
  }

  /**
   * The person's department at the organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getDepartment() {
    return department;
  }

  /**
   * The person's department at the organization.
   * @param department department or {@code null} for none
   */
  public Organization setDepartment(java.lang.String department) {
    this.department = department;
    return this;
  }

  /**
   * The domain name associated with the organization; for example, `google.com`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * The domain name associated with the organization; for example, `google.com`.
   * @param domain domain or {@code null} for none
   */
  public Organization setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The end date when the person left the organization.
   * @return value or {@code null} for none
   */
  public Date getEndDate() {
    return endDate;
  }

  /**
   * The end date when the person left the organization.
   * @param endDate endDate or {@code null} for none
   */
  public Organization setEndDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Output only. The type of the organization translated and formatted in the viewer's account
   * locale or the `Accept-Language` HTTP header locale.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedType() {
    return formattedType;
  }

  /**
   * Output only. The type of the organization translated and formatted in the viewer's account
   * locale or the `Accept-Language` HTTP header locale.
   * @param formattedType formattedType or {@code null} for none
   */
  public Organization setFormattedType(java.lang.String formattedType) {
    this.formattedType = formattedType;
    return this;
  }

  /**
   * The person's full-time equivalent millipercent within the organization (100000 = 100%).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFullTimeEquivalentMillipercent() {
    return fullTimeEquivalentMillipercent;
  }

  /**
   * The person's full-time equivalent millipercent within the organization (100000 = 100%).
   * @param fullTimeEquivalentMillipercent fullTimeEquivalentMillipercent or {@code null} for none
   */
  public Organization setFullTimeEquivalentMillipercent(java.lang.Integer fullTimeEquivalentMillipercent) {
    this.fullTimeEquivalentMillipercent = fullTimeEquivalentMillipercent;
    return this;
  }

  /**
   * The person's job description at the organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobDescription() {
    return jobDescription;
  }

  /**
   * The person's job description at the organization.
   * @param jobDescription jobDescription or {@code null} for none
   */
  public Organization setJobDescription(java.lang.String jobDescription) {
    this.jobDescription = jobDescription;
    return this;
  }

  /**
   * The location of the organization office the person works at.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The location of the organization office the person works at.
   * @param location location or {@code null} for none
   */
  public Organization setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Metadata about the organization.
   * @return value or {@code null} for none
   */
  public FieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata about the organization.
   * @param metadata metadata or {@code null} for none
   */
  public Organization setMetadata(FieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The name of the organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the organization.
   * @param name name or {@code null} for none
   */
  public Organization setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The phonetic name of the organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneticName() {
    return phoneticName;
  }

  /**
   * The phonetic name of the organization.
   * @param phoneticName phoneticName or {@code null} for none
   */
  public Organization setPhoneticName(java.lang.String phoneticName) {
    this.phoneticName = phoneticName;
    return this;
  }

  /**
   * The start date when the person joined the organization.
   * @return value or {@code null} for none
   */
  public Date getStartDate() {
    return startDate;
  }

  /**
   * The start date when the person joined the organization.
   * @param startDate startDate or {@code null} for none
   */
  public Organization setStartDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The symbol associated with the organization; for example, a stock ticker symbol, abbreviation,
   * or acronym.
   * @return value or {@code null} for none
   */
  public java.lang.String getSymbol() {
    return symbol;
  }

  /**
   * The symbol associated with the organization; for example, a stock ticker symbol, abbreviation,
   * or acronym.
   * @param symbol symbol or {@code null} for none
   */
  public Organization setSymbol(java.lang.String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * The person's job title at the organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The person's job title at the organization.
   * @param title title or {@code null} for none
   */
  public Organization setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The type of the organization. The type can be custom or one of these predefined values: *
   * `work` * `school`
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the organization. The type can be custom or one of these predefined values: *
   * `work` * `school`
   * @param type type or {@code null} for none
   */
  public Organization setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Organization set(String fieldName, Object value) {
    return (Organization) super.set(fieldName, value);
  }

  @Override
  public Organization clone() {
    return (Organization) super.clone();
  }

}
