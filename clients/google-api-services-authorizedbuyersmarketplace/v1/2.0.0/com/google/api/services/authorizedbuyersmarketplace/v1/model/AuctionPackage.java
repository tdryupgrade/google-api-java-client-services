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

package com.google.api.services.authorizedbuyersmarketplace.v1.model;

/**
 * Defines a segment of inventory that buyer wants to buy. It's created by buyer and could be shared
 * with multiple buyers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Authorized Buyers Marketplace API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuctionPackage extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Time the auction package was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The buyer that created this auction package. Format: `buyers/{buyerAccountId}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creator;

  /**
   * Output only. A description of the auction package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The display_name assigned to the auction package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Immutable. The unique identifier for the auction package. Format:
   * `buyers/{accountId}/auctionPackages/{auctionPackageId}` The auction_package_id part of name is
   * sent in the BidRequest to all RTB bidders and is returned as deal_id by the bidder in the
   * BidResponse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The list of clients of the current buyer that are subscribed to the
   * AuctionPackage. Format: `buyers/{buyerAccountId}/clients/{clientAccountId}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> subscribedClients;

  /**
   * Output only. Time the auction package was last updated. This value is only increased when this
   * auction package is updated but never when a buyer subscribed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Time the auction package was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time the auction package was created.
   * @param createTime createTime or {@code null} for none
   */
  public AuctionPackage setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The buyer that created this auction package. Format: `buyers/{buyerAccountId}`
   * @return value or {@code null} for none
   */
  public java.lang.String getCreator() {
    return creator;
  }

  /**
   * Output only. The buyer that created this auction package. Format: `buyers/{buyerAccountId}`
   * @param creator creator or {@code null} for none
   */
  public AuctionPackage setCreator(java.lang.String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Output only. A description of the auction package.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Output only. A description of the auction package.
   * @param description description or {@code null} for none
   */
  public AuctionPackage setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The display_name assigned to the auction package.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display_name assigned to the auction package.
   * @param displayName displayName or {@code null} for none
   */
  public AuctionPackage setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Immutable. The unique identifier for the auction package. Format:
   * `buyers/{accountId}/auctionPackages/{auctionPackageId}` The auction_package_id part of name is
   * sent in the BidRequest to all RTB bidders and is returned as deal_id by the bidder in the
   * BidResponse.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The unique identifier for the auction package. Format:
   * `buyers/{accountId}/auctionPackages/{auctionPackageId}` The auction_package_id part of name is
   * sent in the BidRequest to all RTB bidders and is returned as deal_id by the bidder in the
   * BidResponse.
   * @param name name or {@code null} for none
   */
  public AuctionPackage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The list of clients of the current buyer that are subscribed to the
   * AuctionPackage. Format: `buyers/{buyerAccountId}/clients/{clientAccountId}`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSubscribedClients() {
    return subscribedClients;
  }

  /**
   * Output only. The list of clients of the current buyer that are subscribed to the
   * AuctionPackage. Format: `buyers/{buyerAccountId}/clients/{clientAccountId}`
   * @param subscribedClients subscribedClients or {@code null} for none
   */
  public AuctionPackage setSubscribedClients(java.util.List<java.lang.String> subscribedClients) {
    this.subscribedClients = subscribedClients;
    return this;
  }

  /**
   * Output only. Time the auction package was last updated. This value is only increased when this
   * auction package is updated but never when a buyer subscribed.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time the auction package was last updated. This value is only increased when this
   * auction package is updated but never when a buyer subscribed.
   * @param updateTime updateTime or {@code null} for none
   */
  public AuctionPackage setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public AuctionPackage set(String fieldName, Object value) {
    return (AuctionPackage) super.set(fieldName, value);
  }

  @Override
  public AuctionPackage clone() {
    return (AuctionPackage) super.clone();
  }

}
