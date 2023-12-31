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

package com.google.api.services.manufacturers.v1.model;

/**
 * Product certification data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Manufacturer Center API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductCertification extends com.google.api.client.json.GenericJson {

  /**
   * Required. This is the product's brand name. The brand is used to help identify your product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String brand;

  /**
   * Required. A list of certifications to link to the described product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Certification> certification;

  static {
    // hack to force ProGuard to consider Certification used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Certification.class);
  }

  /**
   * Optional. A 2-letter country code (ISO 3166-1 Alpha 2).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> countryCode;

  /**
   * Output only. The statuses of the destinations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DestinationStatus> destinationStatuses;

  static {
    // hack to force ProGuard to consider DestinationStatus used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DestinationStatus.class);
  }

  /**
   * Output only. A server-generated list of issues associated with the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Issue> issues;

  static {
    // hack to force ProGuard to consider Issue used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Issue.class);
  }

  /**
   * Optional. These are the Manufacturer Part Numbers (MPN). MPNs are used to uniquely identify a
   * specific product among all products from the same manufacturer
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> mpn;

  /**
   * Required. The unique name identifier of a product certification Format:
   * accounts/{account}/languages/{language_code}/productCertifications/{id} Where `id` is a some
   * unique identifier and `language_code` is a 2-letter ISO 639-1 code of a Shopping supported
   * language according to https://support.google.com/merchants/answer/160637.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Another name for GTIN.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> productCode;

  /**
   * Optional. These are your own product categorization system in your product data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> productType;

  /**
   * Required. This is to clearly identify the product you are certifying.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Required. This is the product's brand name. The brand is used to help identify your product.
   * @return value or {@code null} for none
   */
  public java.lang.String getBrand() {
    return brand;
  }

  /**
   * Required. This is the product's brand name. The brand is used to help identify your product.
   * @param brand brand or {@code null} for none
   */
  public ProductCertification setBrand(java.lang.String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Required. A list of certifications to link to the described product.
   * @return value or {@code null} for none
   */
  public java.util.List<Certification> getCertification() {
    return certification;
  }

  /**
   * Required. A list of certifications to link to the described product.
   * @param certification certification or {@code null} for none
   */
  public ProductCertification setCertification(java.util.List<Certification> certification) {
    this.certification = certification;
    return this;
  }

  /**
   * Optional. A 2-letter country code (ISO 3166-1 Alpha 2).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCountryCode() {
    return countryCode;
  }

  /**
   * Optional. A 2-letter country code (ISO 3166-1 Alpha 2).
   * @param countryCode countryCode or {@code null} for none
   */
  public ProductCertification setCountryCode(java.util.List<java.lang.String> countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Output only. The statuses of the destinations.
   * @return value or {@code null} for none
   */
  public java.util.List<DestinationStatus> getDestinationStatuses() {
    return destinationStatuses;
  }

  /**
   * Output only. The statuses of the destinations.
   * @param destinationStatuses destinationStatuses or {@code null} for none
   */
  public ProductCertification setDestinationStatuses(java.util.List<DestinationStatus> destinationStatuses) {
    this.destinationStatuses = destinationStatuses;
    return this;
  }

  /**
   * Output only. A server-generated list of issues associated with the product.
   * @return value or {@code null} for none
   */
  public java.util.List<Issue> getIssues() {
    return issues;
  }

  /**
   * Output only. A server-generated list of issues associated with the product.
   * @param issues issues or {@code null} for none
   */
  public ProductCertification setIssues(java.util.List<Issue> issues) {
    this.issues = issues;
    return this;
  }

  /**
   * Optional. These are the Manufacturer Part Numbers (MPN). MPNs are used to uniquely identify a
   * specific product among all products from the same manufacturer
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMpn() {
    return mpn;
  }

  /**
   * Optional. These are the Manufacturer Part Numbers (MPN). MPNs are used to uniquely identify a
   * specific product among all products from the same manufacturer
   * @param mpn mpn or {@code null} for none
   */
  public ProductCertification setMpn(java.util.List<java.lang.String> mpn) {
    this.mpn = mpn;
    return this;
  }

  /**
   * Required. The unique name identifier of a product certification Format:
   * accounts/{account}/languages/{language_code}/productCertifications/{id} Where `id` is a some
   * unique identifier and `language_code` is a 2-letter ISO 639-1 code of a Shopping supported
   * language according to https://support.google.com/merchants/answer/160637.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The unique name identifier of a product certification Format:
   * accounts/{account}/languages/{language_code}/productCertifications/{id} Where `id` is a some
   * unique identifier and `language_code` is a 2-letter ISO 639-1 code of a Shopping supported
   * language according to https://support.google.com/merchants/answer/160637.
   * @param name name or {@code null} for none
   */
  public ProductCertification setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Another name for GTIN.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProductCode() {
    return productCode;
  }

  /**
   * Optional. Another name for GTIN.
   * @param productCode productCode or {@code null} for none
   */
  public ProductCertification setProductCode(java.util.List<java.lang.String> productCode) {
    this.productCode = productCode;
    return this;
  }

  /**
   * Optional. These are your own product categorization system in your product data.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProductType() {
    return productType;
  }

  /**
   * Optional. These are your own product categorization system in your product data.
   * @param productType productType or {@code null} for none
   */
  public ProductCertification setProductType(java.util.List<java.lang.String> productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Required. This is to clearly identify the product you are certifying.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Required. This is to clearly identify the product you are certifying.
   * @param title title or {@code null} for none
   */
  public ProductCertification setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public ProductCertification set(String fieldName, Object value) {
    return (ProductCertification) super.set(fieldName, value);
  }

  @Override
  public ProductCertification clone() {
    return (ProductCertification) super.clone();
  }

}
