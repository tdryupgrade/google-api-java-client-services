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
 * Request to send an RFP. All fields in this request are proposed to publisher and subject to
 * changes by publisher during later negotiation.
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
public final class SendRfpRequest extends com.google.api.client.json.GenericJson {

  /**
   * Contact information for the buyer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Contact> buyerContacts;

  static {
    // hack to force ProGuard to consider Contact used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Contact.class);
  }

  /**
   * If the current buyer is sending the RFP on behalf of its client, use this field to specify the
   * name of the client in the format: `buyers/{accountId}/clients/{clientAccountid}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String client;

  /**
   * Required. The display name of the proposal being created by this RFP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Specified by buyers in request for proposal (RFP) to notify publisher the total estimated spend
   * for the proposal. Publishers will receive this information and send back proposed deals
   * accordingly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money estimatedGrossSpend;

  /**
   * Required. Proposed flight end time of the RFP. A timestamp in RFC3339 UTC "Zulu" format. Note
   * that the specified value will be truncated to a granularity of one second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String flightEndTime;

  /**
   * Required. Proposed flight start time of the RFP. A timestamp in RFC3339 UTC "Zulu" format. Note
   * that the specified value will be truncated to a granularity of one second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String flightStartTime;

  /**
   * Geo criteria IDs to be targeted. Refer to Geo tables.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CriteriaTargeting geoTargeting;

  /**
   * Inventory sizes to be targeted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InventorySizeTargeting inventorySizeTargeting;

  /**
   * A message that is sent to the publisher. Maximum length is 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String note;

  /**
   * The terms for preferred deals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PreferredDealTerms preferredDealTerms;

  /**
   * The terms for programmatic guaranteed deals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProgrammaticGuaranteedTerms programmaticGuaranteedTerms;

  /**
   * Required. The profile of the publisher who will receive this RFP in the format:
   * `buyers/{accountId}/publisherProfiles/{publisherProfileId}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publisherProfile;

  /**
   * Contact information for the buyer.
   * @return value or {@code null} for none
   */
  public java.util.List<Contact> getBuyerContacts() {
    return buyerContacts;
  }

  /**
   * Contact information for the buyer.
   * @param buyerContacts buyerContacts or {@code null} for none
   */
  public SendRfpRequest setBuyerContacts(java.util.List<Contact> buyerContacts) {
    this.buyerContacts = buyerContacts;
    return this;
  }

  /**
   * If the current buyer is sending the RFP on behalf of its client, use this field to specify the
   * name of the client in the format: `buyers/{accountId}/clients/{clientAccountid}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getClient() {
    return client;
  }

  /**
   * If the current buyer is sending the RFP on behalf of its client, use this field to specify the
   * name of the client in the format: `buyers/{accountId}/clients/{clientAccountid}`.
   * @param client client or {@code null} for none
   */
  public SendRfpRequest setClient(java.lang.String client) {
    this.client = client;
    return this;
  }

  /**
   * Required. The display name of the proposal being created by this RFP.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the proposal being created by this RFP.
   * @param displayName displayName or {@code null} for none
   */
  public SendRfpRequest setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Specified by buyers in request for proposal (RFP) to notify publisher the total estimated spend
   * for the proposal. Publishers will receive this information and send back proposed deals
   * accordingly.
   * @return value or {@code null} for none
   */
  public Money getEstimatedGrossSpend() {
    return estimatedGrossSpend;
  }

  /**
   * Specified by buyers in request for proposal (RFP) to notify publisher the total estimated spend
   * for the proposal. Publishers will receive this information and send back proposed deals
   * accordingly.
   * @param estimatedGrossSpend estimatedGrossSpend or {@code null} for none
   */
  public SendRfpRequest setEstimatedGrossSpend(Money estimatedGrossSpend) {
    this.estimatedGrossSpend = estimatedGrossSpend;
    return this;
  }

  /**
   * Required. Proposed flight end time of the RFP. A timestamp in RFC3339 UTC "Zulu" format. Note
   * that the specified value will be truncated to a granularity of one second.
   * @return value or {@code null} for none
   */
  public String getFlightEndTime() {
    return flightEndTime;
  }

  /**
   * Required. Proposed flight end time of the RFP. A timestamp in RFC3339 UTC "Zulu" format. Note
   * that the specified value will be truncated to a granularity of one second.
   * @param flightEndTime flightEndTime or {@code null} for none
   */
  public SendRfpRequest setFlightEndTime(String flightEndTime) {
    this.flightEndTime = flightEndTime;
    return this;
  }

  /**
   * Required. Proposed flight start time of the RFP. A timestamp in RFC3339 UTC "Zulu" format. Note
   * that the specified value will be truncated to a granularity of one second.
   * @return value or {@code null} for none
   */
  public String getFlightStartTime() {
    return flightStartTime;
  }

  /**
   * Required. Proposed flight start time of the RFP. A timestamp in RFC3339 UTC "Zulu" format. Note
   * that the specified value will be truncated to a granularity of one second.
   * @param flightStartTime flightStartTime or {@code null} for none
   */
  public SendRfpRequest setFlightStartTime(String flightStartTime) {
    this.flightStartTime = flightStartTime;
    return this;
  }

  /**
   * Geo criteria IDs to be targeted. Refer to Geo tables.
   * @return value or {@code null} for none
   */
  public CriteriaTargeting getGeoTargeting() {
    return geoTargeting;
  }

  /**
   * Geo criteria IDs to be targeted. Refer to Geo tables.
   * @param geoTargeting geoTargeting or {@code null} for none
   */
  public SendRfpRequest setGeoTargeting(CriteriaTargeting geoTargeting) {
    this.geoTargeting = geoTargeting;
    return this;
  }

  /**
   * Inventory sizes to be targeted.
   * @return value or {@code null} for none
   */
  public InventorySizeTargeting getInventorySizeTargeting() {
    return inventorySizeTargeting;
  }

  /**
   * Inventory sizes to be targeted.
   * @param inventorySizeTargeting inventorySizeTargeting or {@code null} for none
   */
  public SendRfpRequest setInventorySizeTargeting(InventorySizeTargeting inventorySizeTargeting) {
    this.inventorySizeTargeting = inventorySizeTargeting;
    return this;
  }

  /**
   * A message that is sent to the publisher. Maximum length is 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getNote() {
    return note;
  }

  /**
   * A message that is sent to the publisher. Maximum length is 1024 characters.
   * @param note note or {@code null} for none
   */
  public SendRfpRequest setNote(java.lang.String note) {
    this.note = note;
    return this;
  }

  /**
   * The terms for preferred deals.
   * @return value or {@code null} for none
   */
  public PreferredDealTerms getPreferredDealTerms() {
    return preferredDealTerms;
  }

  /**
   * The terms for preferred deals.
   * @param preferredDealTerms preferredDealTerms or {@code null} for none
   */
  public SendRfpRequest setPreferredDealTerms(PreferredDealTerms preferredDealTerms) {
    this.preferredDealTerms = preferredDealTerms;
    return this;
  }

  /**
   * The terms for programmatic guaranteed deals.
   * @return value or {@code null} for none
   */
  public ProgrammaticGuaranteedTerms getProgrammaticGuaranteedTerms() {
    return programmaticGuaranteedTerms;
  }

  /**
   * The terms for programmatic guaranteed deals.
   * @param programmaticGuaranteedTerms programmaticGuaranteedTerms or {@code null} for none
   */
  public SendRfpRequest setProgrammaticGuaranteedTerms(ProgrammaticGuaranteedTerms programmaticGuaranteedTerms) {
    this.programmaticGuaranteedTerms = programmaticGuaranteedTerms;
    return this;
  }

  /**
   * Required. The profile of the publisher who will receive this RFP in the format:
   * `buyers/{accountId}/publisherProfiles/{publisherProfileId}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublisherProfile() {
    return publisherProfile;
  }

  /**
   * Required. The profile of the publisher who will receive this RFP in the format:
   * `buyers/{accountId}/publisherProfiles/{publisherProfileId}`.
   * @param publisherProfile publisherProfile or {@code null} for none
   */
  public SendRfpRequest setPublisherProfile(java.lang.String publisherProfile) {
    this.publisherProfile = publisherProfile;
    return this;
  }

  @Override
  public SendRfpRequest set(String fieldName, Object value) {
    return (SendRfpRequest) super.set(fieldName, value);
  }

  @Override
  public SendRfpRequest clone() {
    return (SendRfpRequest) super.clone();
  }

}
