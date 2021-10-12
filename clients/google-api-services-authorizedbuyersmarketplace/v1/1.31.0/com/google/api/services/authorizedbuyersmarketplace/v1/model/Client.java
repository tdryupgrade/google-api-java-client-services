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
 * A client represents an agency, a brand, or an advertiser customer of the buyer. Based on the
 * client's role, its client users will have varying levels of restricted access to the Marketplace
 * and certain other sections of the Authorized Buyers UI.
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
public final class Client extends com.google.api.client.json.GenericJson {

  /**
   * Required. Display name shown to publishers. Must be unique for clients without partnerClientId
   * specified. Maximum length of 255 characters is allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. The resource name of the client. Format:
   * `buyers/{accountId}/clients/{clientAccountId}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Arbitrary unique identifier provided by the buyer. This field can be used to associate a client
   * with an identifier in the namespace of the buyer, lookup clients by that identifier and verify
   * whether an Authorized Buyers account of the client already exists. If present, must be unique
   * across all the clients.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String partnerClientId;

  /**
   * Required. The role assigned to the client. Each role implies a set of permissions granted to
   * the client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * Whether the client will be visible to sellers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean sellerVisible;

  /**
   * Output only. The state of the client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. Display name shown to publishers. Must be unique for clients without partnerClientId
   * specified. Maximum length of 255 characters is allowed.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. Display name shown to publishers. Must be unique for clients without partnerClientId
   * specified. Maximum length of 255 characters is allowed.
   * @param displayName displayName or {@code null} for none
   */
  public Client setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. The resource name of the client. Format:
   * `buyers/{accountId}/clients/{clientAccountId}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the client. Format:
   * `buyers/{accountId}/clients/{clientAccountId}`
   * @param name name or {@code null} for none
   */
  public Client setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Arbitrary unique identifier provided by the buyer. This field can be used to associate a client
   * with an identifier in the namespace of the buyer, lookup clients by that identifier and verify
   * whether an Authorized Buyers account of the client already exists. If present, must be unique
   * across all the clients.
   * @return value or {@code null} for none
   */
  public java.lang.String getPartnerClientId() {
    return partnerClientId;
  }

  /**
   * Arbitrary unique identifier provided by the buyer. This field can be used to associate a client
   * with an identifier in the namespace of the buyer, lookup clients by that identifier and verify
   * whether an Authorized Buyers account of the client already exists. If present, must be unique
   * across all the clients.
   * @param partnerClientId partnerClientId or {@code null} for none
   */
  public Client setPartnerClientId(java.lang.String partnerClientId) {
    this.partnerClientId = partnerClientId;
    return this;
  }

  /**
   * Required. The role assigned to the client. Each role implies a set of permissions granted to
   * the client.
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * Required. The role assigned to the client. Each role implies a set of permissions granted to
   * the client.
   * @param role role or {@code null} for none
   */
  public Client setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  /**
   * Whether the client will be visible to sellers.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSellerVisible() {
    return sellerVisible;
  }

  /**
   * Whether the client will be visible to sellers.
   * @param sellerVisible sellerVisible or {@code null} for none
   */
  public Client setSellerVisible(java.lang.Boolean sellerVisible) {
    this.sellerVisible = sellerVisible;
    return this;
  }

  /**
   * Output only. The state of the client.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the client.
   * @param state state or {@code null} for none
   */
  public Client setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Client set(String fieldName, Object value) {
    return (Client) super.set(fieldName, value);
  }

  @Override
  public Client clone() {
    return (Client) super.clone();
  }

}
