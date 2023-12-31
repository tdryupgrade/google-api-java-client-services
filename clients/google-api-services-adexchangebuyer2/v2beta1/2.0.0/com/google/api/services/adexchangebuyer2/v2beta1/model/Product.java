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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * A product is a segment of inventory that a seller wants to sell. It is associated with certain
 * terms and targeting information which helps the buyer know more about the inventory.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Product extends com.google.api.client.json.GenericJson {

  /**
   * The proposed end time for the deal. The field will be truncated to the order of seconds during
   * serving.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String availableEndTime;

  /**
   * Inventory availability dates. The start time will be truncated to seconds during serving. Thus,
   * a field specified as 3:23:34.456 (HH:mm:ss.SSS) will be truncated to 3:23:34 when serving.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String availableStartTime;

  /**
   * Creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional contact information for the creator of this product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContactInformation> creatorContacts;

  static {
    // hack to force ProGuard to consider ContactInformation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContactInformation.class);
  }

  /**
   * The display name for this product as set by the seller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * If the creator has already signed off on the product, then the buyer can finalize the deal by
   * accepting the product as is. When copying to a proposal, if any of the terms are changed, then
   * auto_finalize is automatically set to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasCreatorSignedOff;

  /**
   * The unique ID for the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The revision number of the product (auto-assigned by Marketplace).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long productRevision;

  /**
   * An ID which can be used by the Publisher Profile API to get more information about the seller
   * that created this product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publisherProfileId;

  /**
   * Information about the seller that created this product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Seller seller;

  /**
   * The syndication product associated with the deal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String syndicationProduct;

  /**
   * Targeting that is shared between the buyer and the seller. Each targeting criterion has a
   * specified key and for each key there is a list of inclusion value or exclusion values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TargetingCriteria> targetingCriterion;

  /**
   * The negotiable terms of the deal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DealTerms terms;

  /**
   * Time of last update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The web-property code for the seller. This needs to be copied as is when adding a new deal to a
   * proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webPropertyCode;

  /**
   * The proposed end time for the deal. The field will be truncated to the order of seconds during
   * serving.
   * @return value or {@code null} for none
   */
  public String getAvailableEndTime() {
    return availableEndTime;
  }

  /**
   * The proposed end time for the deal. The field will be truncated to the order of seconds during
   * serving.
   * @param availableEndTime availableEndTime or {@code null} for none
   */
  public Product setAvailableEndTime(String availableEndTime) {
    this.availableEndTime = availableEndTime;
    return this;
  }

  /**
   * Inventory availability dates. The start time will be truncated to seconds during serving. Thus,
   * a field specified as 3:23:34.456 (HH:mm:ss.SSS) will be truncated to 3:23:34 when serving.
   * @return value or {@code null} for none
   */
  public String getAvailableStartTime() {
    return availableStartTime;
  }

  /**
   * Inventory availability dates. The start time will be truncated to seconds during serving. Thus,
   * a field specified as 3:23:34.456 (HH:mm:ss.SSS) will be truncated to 3:23:34 when serving.
   * @param availableStartTime availableStartTime or {@code null} for none
   */
  public Product setAvailableStartTime(String availableStartTime) {
    this.availableStartTime = availableStartTime;
    return this;
  }

  /**
   * Creation time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Creation time.
   * @param createTime createTime or {@code null} for none
   */
  public Product setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional contact information for the creator of this product.
   * @return value or {@code null} for none
   */
  public java.util.List<ContactInformation> getCreatorContacts() {
    return creatorContacts;
  }

  /**
   * Optional contact information for the creator of this product.
   * @param creatorContacts creatorContacts or {@code null} for none
   */
  public Product setCreatorContacts(java.util.List<ContactInformation> creatorContacts) {
    this.creatorContacts = creatorContacts;
    return this;
  }

  /**
   * The display name for this product as set by the seller.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name for this product as set by the seller.
   * @param displayName displayName or {@code null} for none
   */
  public Product setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * If the creator has already signed off on the product, then the buyer can finalize the deal by
   * accepting the product as is. When copying to a proposal, if any of the terms are changed, then
   * auto_finalize is automatically set to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasCreatorSignedOff() {
    return hasCreatorSignedOff;
  }

  /**
   * If the creator has already signed off on the product, then the buyer can finalize the deal by
   * accepting the product as is. When copying to a proposal, if any of the terms are changed, then
   * auto_finalize is automatically set to false.
   * @param hasCreatorSignedOff hasCreatorSignedOff or {@code null} for none
   */
  public Product setHasCreatorSignedOff(java.lang.Boolean hasCreatorSignedOff) {
    this.hasCreatorSignedOff = hasCreatorSignedOff;
    return this;
  }

  /**
   * The unique ID for the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The unique ID for the product.
   * @param productId productId or {@code null} for none
   */
  public Product setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The revision number of the product (auto-assigned by Marketplace).
   * @return value or {@code null} for none
   */
  public java.lang.Long getProductRevision() {
    return productRevision;
  }

  /**
   * The revision number of the product (auto-assigned by Marketplace).
   * @param productRevision productRevision or {@code null} for none
   */
  public Product setProductRevision(java.lang.Long productRevision) {
    this.productRevision = productRevision;
    return this;
  }

  /**
   * An ID which can be used by the Publisher Profile API to get more information about the seller
   * that created this product.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublisherProfileId() {
    return publisherProfileId;
  }

  /**
   * An ID which can be used by the Publisher Profile API to get more information about the seller
   * that created this product.
   * @param publisherProfileId publisherProfileId or {@code null} for none
   */
  public Product setPublisherProfileId(java.lang.String publisherProfileId) {
    this.publisherProfileId = publisherProfileId;
    return this;
  }

  /**
   * Information about the seller that created this product.
   * @return value or {@code null} for none
   */
  public Seller getSeller() {
    return seller;
  }

  /**
   * Information about the seller that created this product.
   * @param seller seller or {@code null} for none
   */
  public Product setSeller(Seller seller) {
    this.seller = seller;
    return this;
  }

  /**
   * The syndication product associated with the deal.
   * @return value or {@code null} for none
   */
  public java.lang.String getSyndicationProduct() {
    return syndicationProduct;
  }

  /**
   * The syndication product associated with the deal.
   * @param syndicationProduct syndicationProduct or {@code null} for none
   */
  public Product setSyndicationProduct(java.lang.String syndicationProduct) {
    this.syndicationProduct = syndicationProduct;
    return this;
  }

  /**
   * Targeting that is shared between the buyer and the seller. Each targeting criterion has a
   * specified key and for each key there is a list of inclusion value or exclusion values.
   * @return value or {@code null} for none
   */
  public java.util.List<TargetingCriteria> getTargetingCriterion() {
    return targetingCriterion;
  }

  /**
   * Targeting that is shared between the buyer and the seller. Each targeting criterion has a
   * specified key and for each key there is a list of inclusion value or exclusion values.
   * @param targetingCriterion targetingCriterion or {@code null} for none
   */
  public Product setTargetingCriterion(java.util.List<TargetingCriteria> targetingCriterion) {
    this.targetingCriterion = targetingCriterion;
    return this;
  }

  /**
   * The negotiable terms of the deal.
   * @return value or {@code null} for none
   */
  public DealTerms getTerms() {
    return terms;
  }

  /**
   * The negotiable terms of the deal.
   * @param terms terms or {@code null} for none
   */
  public Product setTerms(DealTerms terms) {
    this.terms = terms;
    return this;
  }

  /**
   * Time of last update.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Time of last update.
   * @param updateTime updateTime or {@code null} for none
   */
  public Product setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * The web-property code for the seller. This needs to be copied as is when adding a new deal to a
   * proposal.
   * @return value or {@code null} for none
   */
  public java.lang.String getWebPropertyCode() {
    return webPropertyCode;
  }

  /**
   * The web-property code for the seller. This needs to be copied as is when adding a new deal to a
   * proposal.
   * @param webPropertyCode webPropertyCode or {@code null} for none
   */
  public Product setWebPropertyCode(java.lang.String webPropertyCode) {
    this.webPropertyCode = webPropertyCode;
    return this;
  }

  @Override
  public Product set(String fieldName, Object value) {
    return (Product) super.set(fieldName, value);
  }

  @Override
  public Product clone() {
    return (Product) super.clone();
  }

}
