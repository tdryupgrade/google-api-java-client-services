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
 * The values in the publisher profile are supplied by the publisher. All fields are not filterable
 * unless stated otherwise.
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
public final class PublisherProfile extends com.google.api.client.json.GenericJson {

  /**
   * Description on the publisher's audience.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audienceDescription;

  /**
   * Contact information for direct reservation deals. This is free text entered by the publisher
   * and may include information like names, phone numbers and email addresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String directDealsContact;

  /**
   * Display name of the publisher profile. Can be used to filter the response of the
   * publisherProfiles.list method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The list of domains represented in this publisher profile. Empty if this is a parent profile.
   * These are top private domains, meaning that these will not contain a string like
   * "photos.google.co.uk/123", but will instead contain "google.co.uk". Can be used to filter the
   * response of the publisherProfiles.list method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> domains;

  /**
   * Indicates if this profile is the parent profile of the seller. A parent profile represents all
   * the inventory from the seller, as opposed to child profile that is created to brand a portion
   * of inventory. One seller has only one parent publisher profile, and can have multiple child
   * profiles. See https://support.google.com/admanager/answer/6035806 for details. Can be used to
   * filter the response of the publisherProfiles.list method by setting the filter to "is_parent:
   * true".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isParent;

  /**
   * A Google public URL to the logo for this publisher profile. The logo is stored as a PNG, JPG,
   * or GIF image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logoUrl;

  /**
   * URL to additional marketing and sales materials.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mediaKitUrl;

  /**
   * The list of apps represented in this publisher profile. Empty if this is a parent profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PublisherProfileMobileApplication> mobileApps;

  /**
   * Name of the publisher profile. Format: `buyers/{buyer}/publisherProfiles/{publisher_profile}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Overview of the publisher.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String overview;

  /**
   * Statement explaining what's unique about publisher's business, and why buyers should partner
   * with the publisher.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pitchStatement;

  /**
   * Contact information for programmatic deals. This is free text entered by the publisher and may
   * include information like names, phone numbers and email addresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String programmaticDealsContact;

  /**
   * A unique identifying code for the seller. This value is the same for all of the seller's parent
   * and child publisher profiles. Can be used to filter the response of the publisherProfiles.list
   * method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publisherCode;

  /**
   * URL to a sample content page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String samplePageUrl;

  /**
   * Up to three key metrics and rankings. For example "#1 Mobile News Site for 20 Straight Months".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> topHeadlines;

  /**
   * Description on the publisher's audience.
   * @return value or {@code null} for none
   */
  public java.lang.String getAudienceDescription() {
    return audienceDescription;
  }

  /**
   * Description on the publisher's audience.
   * @param audienceDescription audienceDescription or {@code null} for none
   */
  public PublisherProfile setAudienceDescription(java.lang.String audienceDescription) {
    this.audienceDescription = audienceDescription;
    return this;
  }

  /**
   * Contact information for direct reservation deals. This is free text entered by the publisher
   * and may include information like names, phone numbers and email addresses.
   * @return value or {@code null} for none
   */
  public java.lang.String getDirectDealsContact() {
    return directDealsContact;
  }

  /**
   * Contact information for direct reservation deals. This is free text entered by the publisher
   * and may include information like names, phone numbers and email addresses.
   * @param directDealsContact directDealsContact or {@code null} for none
   */
  public PublisherProfile setDirectDealsContact(java.lang.String directDealsContact) {
    this.directDealsContact = directDealsContact;
    return this;
  }

  /**
   * Display name of the publisher profile. Can be used to filter the response of the
   * publisherProfiles.list method.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name of the publisher profile. Can be used to filter the response of the
   * publisherProfiles.list method.
   * @param displayName displayName or {@code null} for none
   */
  public PublisherProfile setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The list of domains represented in this publisher profile. Empty if this is a parent profile.
   * These are top private domains, meaning that these will not contain a string like
   * "photos.google.co.uk/123", but will instead contain "google.co.uk". Can be used to filter the
   * response of the publisherProfiles.list method.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDomains() {
    return domains;
  }

  /**
   * The list of domains represented in this publisher profile. Empty if this is a parent profile.
   * These are top private domains, meaning that these will not contain a string like
   * "photos.google.co.uk/123", but will instead contain "google.co.uk". Can be used to filter the
   * response of the publisherProfiles.list method.
   * @param domains domains or {@code null} for none
   */
  public PublisherProfile setDomains(java.util.List<java.lang.String> domains) {
    this.domains = domains;
    return this;
  }

  /**
   * Indicates if this profile is the parent profile of the seller. A parent profile represents all
   * the inventory from the seller, as opposed to child profile that is created to brand a portion
   * of inventory. One seller has only one parent publisher profile, and can have multiple child
   * profiles. See https://support.google.com/admanager/answer/6035806 for details. Can be used to
   * filter the response of the publisherProfiles.list method by setting the filter to "is_parent:
   * true".
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsParent() {
    return isParent;
  }

  /**
   * Indicates if this profile is the parent profile of the seller. A parent profile represents all
   * the inventory from the seller, as opposed to child profile that is created to brand a portion
   * of inventory. One seller has only one parent publisher profile, and can have multiple child
   * profiles. See https://support.google.com/admanager/answer/6035806 for details. Can be used to
   * filter the response of the publisherProfiles.list method by setting the filter to "is_parent:
   * true".
   * @param isParent isParent or {@code null} for none
   */
  public PublisherProfile setIsParent(java.lang.Boolean isParent) {
    this.isParent = isParent;
    return this;
  }

  /**
   * A Google public URL to the logo for this publisher profile. The logo is stored as a PNG, JPG,
   * or GIF image.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogoUrl() {
    return logoUrl;
  }

  /**
   * A Google public URL to the logo for this publisher profile. The logo is stored as a PNG, JPG,
   * or GIF image.
   * @param logoUrl logoUrl or {@code null} for none
   */
  public PublisherProfile setLogoUrl(java.lang.String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

  /**
   * URL to additional marketing and sales materials.
   * @return value or {@code null} for none
   */
  public java.lang.String getMediaKitUrl() {
    return mediaKitUrl;
  }

  /**
   * URL to additional marketing and sales materials.
   * @param mediaKitUrl mediaKitUrl or {@code null} for none
   */
  public PublisherProfile setMediaKitUrl(java.lang.String mediaKitUrl) {
    this.mediaKitUrl = mediaKitUrl;
    return this;
  }

  /**
   * The list of apps represented in this publisher profile. Empty if this is a parent profile.
   * @return value or {@code null} for none
   */
  public java.util.List<PublisherProfileMobileApplication> getMobileApps() {
    return mobileApps;
  }

  /**
   * The list of apps represented in this publisher profile. Empty if this is a parent profile.
   * @param mobileApps mobileApps or {@code null} for none
   */
  public PublisherProfile setMobileApps(java.util.List<PublisherProfileMobileApplication> mobileApps) {
    this.mobileApps = mobileApps;
    return this;
  }

  /**
   * Name of the publisher profile. Format: `buyers/{buyer}/publisherProfiles/{publisher_profile}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the publisher profile. Format: `buyers/{buyer}/publisherProfiles/{publisher_profile}`
   * @param name name or {@code null} for none
   */
  public PublisherProfile setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Overview of the publisher.
   * @return value or {@code null} for none
   */
  public java.lang.String getOverview() {
    return overview;
  }

  /**
   * Overview of the publisher.
   * @param overview overview or {@code null} for none
   */
  public PublisherProfile setOverview(java.lang.String overview) {
    this.overview = overview;
    return this;
  }

  /**
   * Statement explaining what's unique about publisher's business, and why buyers should partner
   * with the publisher.
   * @return value or {@code null} for none
   */
  public java.lang.String getPitchStatement() {
    return pitchStatement;
  }

  /**
   * Statement explaining what's unique about publisher's business, and why buyers should partner
   * with the publisher.
   * @param pitchStatement pitchStatement or {@code null} for none
   */
  public PublisherProfile setPitchStatement(java.lang.String pitchStatement) {
    this.pitchStatement = pitchStatement;
    return this;
  }

  /**
   * Contact information for programmatic deals. This is free text entered by the publisher and may
   * include information like names, phone numbers and email addresses.
   * @return value or {@code null} for none
   */
  public java.lang.String getProgrammaticDealsContact() {
    return programmaticDealsContact;
  }

  /**
   * Contact information for programmatic deals. This is free text entered by the publisher and may
   * include information like names, phone numbers and email addresses.
   * @param programmaticDealsContact programmaticDealsContact or {@code null} for none
   */
  public PublisherProfile setProgrammaticDealsContact(java.lang.String programmaticDealsContact) {
    this.programmaticDealsContact = programmaticDealsContact;
    return this;
  }

  /**
   * A unique identifying code for the seller. This value is the same for all of the seller's parent
   * and child publisher profiles. Can be used to filter the response of the publisherProfiles.list
   * method.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublisherCode() {
    return publisherCode;
  }

  /**
   * A unique identifying code for the seller. This value is the same for all of the seller's parent
   * and child publisher profiles. Can be used to filter the response of the publisherProfiles.list
   * method.
   * @param publisherCode publisherCode or {@code null} for none
   */
  public PublisherProfile setPublisherCode(java.lang.String publisherCode) {
    this.publisherCode = publisherCode;
    return this;
  }

  /**
   * URL to a sample content page.
   * @return value or {@code null} for none
   */
  public java.lang.String getSamplePageUrl() {
    return samplePageUrl;
  }

  /**
   * URL to a sample content page.
   * @param samplePageUrl samplePageUrl or {@code null} for none
   */
  public PublisherProfile setSamplePageUrl(java.lang.String samplePageUrl) {
    this.samplePageUrl = samplePageUrl;
    return this;
  }

  /**
   * Up to three key metrics and rankings. For example "#1 Mobile News Site for 20 Straight Months".
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTopHeadlines() {
    return topHeadlines;
  }

  /**
   * Up to three key metrics and rankings. For example "#1 Mobile News Site for 20 Straight Months".
   * @param topHeadlines topHeadlines or {@code null} for none
   */
  public PublisherProfile setTopHeadlines(java.util.List<java.lang.String> topHeadlines) {
    this.topHeadlines = topHeadlines;
    return this;
  }

  @Override
  public PublisherProfile set(String fieldName, Object value) {
    return (PublisherProfile) super.set(fieldName, value);
  }

  @Override
  public PublisherProfile clone() {
    return (PublisherProfile) super.clone();
  }

}
