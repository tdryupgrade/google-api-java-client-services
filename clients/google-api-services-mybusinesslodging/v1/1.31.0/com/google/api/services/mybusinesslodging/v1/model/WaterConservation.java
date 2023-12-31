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

package com.google.api.services.mybusinesslodging.v1.model;

/**
 * Water conservation practices implemented at the hotel.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the My Business Lodging API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WaterConservation extends com.google.api.client.json.GenericJson {

  /**
   * Independent organization audits water use. The property conducts a water conservation audit
   * every 5 years, the results of which are either verified by a third-party and/or published in
   * external communications. A water conservation audit is a detailed assessment of the facility,
   * providing recommendations to existing operations and procedures to improve water efficiency,
   * available incentives or rebates, and opportunities for improvements through renovations or
   * upgrades. Examples of organizations who conduct credible third party audits include: Engie
   * Impact, and local utility providers (they often provide energy and water audits).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean independentOrganizationAuditsWaterUse;

  /**
   * Independent organization audits water use exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String independentOrganizationAuditsWaterUseException;

  /**
   * Linen reuse program. The property offers a linen reuse program.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean linenReuseProgram;

  /**
   * Linen reuse program exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linenReuseProgramException;

  /**
   * Towel reuse program. The property offers a towel reuse program.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean towelReuseProgram;

  /**
   * Towel reuse program exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String towelReuseProgramException;

  /**
   * Water saving showers. All of the property's guest rooms have shower heads that use no more than
   * 2.0 gallons per minute (gpm).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean waterSavingShowers;

  /**
   * Water saving showers exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String waterSavingShowersException;

  /**
   * Water saving sinks. All of the property's guest rooms have bathroom faucets that use a maximum
   * of 1.5 gallons per minute (gpm), public restroom faucets do not exceed 0.5 gpm, and kitchen
   * faucets (excluding faucets used exclusively for filling operations) do not exceed 2.2 gpm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean waterSavingSinks;

  /**
   * Water saving sinks exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String waterSavingSinksException;

  /**
   * Water saving toilets. All of the property's toilets use 1.6 gallons per flush, or less.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean waterSavingToilets;

  /**
   * Water saving toilets exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String waterSavingToiletsException;

  /**
   * Independent organization audits water use. The property conducts a water conservation audit
   * every 5 years, the results of which are either verified by a third-party and/or published in
   * external communications. A water conservation audit is a detailed assessment of the facility,
   * providing recommendations to existing operations and procedures to improve water efficiency,
   * available incentives or rebates, and opportunities for improvements through renovations or
   * upgrades. Examples of organizations who conduct credible third party audits include: Engie
   * Impact, and local utility providers (they often provide energy and water audits).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIndependentOrganizationAuditsWaterUse() {
    return independentOrganizationAuditsWaterUse;
  }

  /**
   * Independent organization audits water use. The property conducts a water conservation audit
   * every 5 years, the results of which are either verified by a third-party and/or published in
   * external communications. A water conservation audit is a detailed assessment of the facility,
   * providing recommendations to existing operations and procedures to improve water efficiency,
   * available incentives or rebates, and opportunities for improvements through renovations or
   * upgrades. Examples of organizations who conduct credible third party audits include: Engie
   * Impact, and local utility providers (they often provide energy and water audits).
   * @param independentOrganizationAuditsWaterUse independentOrganizationAuditsWaterUse or {@code null} for none
   */
  public WaterConservation setIndependentOrganizationAuditsWaterUse(java.lang.Boolean independentOrganizationAuditsWaterUse) {
    this.independentOrganizationAuditsWaterUse = independentOrganizationAuditsWaterUse;
    return this;
  }

  /**
   * Independent organization audits water use exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getIndependentOrganizationAuditsWaterUseException() {
    return independentOrganizationAuditsWaterUseException;
  }

  /**
   * Independent organization audits water use exception.
   * @param independentOrganizationAuditsWaterUseException independentOrganizationAuditsWaterUseException or {@code null} for none
   */
  public WaterConservation setIndependentOrganizationAuditsWaterUseException(java.lang.String independentOrganizationAuditsWaterUseException) {
    this.independentOrganizationAuditsWaterUseException = independentOrganizationAuditsWaterUseException;
    return this;
  }

  /**
   * Linen reuse program. The property offers a linen reuse program.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLinenReuseProgram() {
    return linenReuseProgram;
  }

  /**
   * Linen reuse program. The property offers a linen reuse program.
   * @param linenReuseProgram linenReuseProgram or {@code null} for none
   */
  public WaterConservation setLinenReuseProgram(java.lang.Boolean linenReuseProgram) {
    this.linenReuseProgram = linenReuseProgram;
    return this;
  }

  /**
   * Linen reuse program exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinenReuseProgramException() {
    return linenReuseProgramException;
  }

  /**
   * Linen reuse program exception.
   * @param linenReuseProgramException linenReuseProgramException or {@code null} for none
   */
  public WaterConservation setLinenReuseProgramException(java.lang.String linenReuseProgramException) {
    this.linenReuseProgramException = linenReuseProgramException;
    return this;
  }

  /**
   * Towel reuse program. The property offers a towel reuse program.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTowelReuseProgram() {
    return towelReuseProgram;
  }

  /**
   * Towel reuse program. The property offers a towel reuse program.
   * @param towelReuseProgram towelReuseProgram or {@code null} for none
   */
  public WaterConservation setTowelReuseProgram(java.lang.Boolean towelReuseProgram) {
    this.towelReuseProgram = towelReuseProgram;
    return this;
  }

  /**
   * Towel reuse program exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getTowelReuseProgramException() {
    return towelReuseProgramException;
  }

  /**
   * Towel reuse program exception.
   * @param towelReuseProgramException towelReuseProgramException or {@code null} for none
   */
  public WaterConservation setTowelReuseProgramException(java.lang.String towelReuseProgramException) {
    this.towelReuseProgramException = towelReuseProgramException;
    return this;
  }

  /**
   * Water saving showers. All of the property's guest rooms have shower heads that use no more than
   * 2.0 gallons per minute (gpm).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWaterSavingShowers() {
    return waterSavingShowers;
  }

  /**
   * Water saving showers. All of the property's guest rooms have shower heads that use no more than
   * 2.0 gallons per minute (gpm).
   * @param waterSavingShowers waterSavingShowers or {@code null} for none
   */
  public WaterConservation setWaterSavingShowers(java.lang.Boolean waterSavingShowers) {
    this.waterSavingShowers = waterSavingShowers;
    return this;
  }

  /**
   * Water saving showers exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getWaterSavingShowersException() {
    return waterSavingShowersException;
  }

  /**
   * Water saving showers exception.
   * @param waterSavingShowersException waterSavingShowersException or {@code null} for none
   */
  public WaterConservation setWaterSavingShowersException(java.lang.String waterSavingShowersException) {
    this.waterSavingShowersException = waterSavingShowersException;
    return this;
  }

  /**
   * Water saving sinks. All of the property's guest rooms have bathroom faucets that use a maximum
   * of 1.5 gallons per minute (gpm), public restroom faucets do not exceed 0.5 gpm, and kitchen
   * faucets (excluding faucets used exclusively for filling operations) do not exceed 2.2 gpm.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWaterSavingSinks() {
    return waterSavingSinks;
  }

  /**
   * Water saving sinks. All of the property's guest rooms have bathroom faucets that use a maximum
   * of 1.5 gallons per minute (gpm), public restroom faucets do not exceed 0.5 gpm, and kitchen
   * faucets (excluding faucets used exclusively for filling operations) do not exceed 2.2 gpm.
   * @param waterSavingSinks waterSavingSinks or {@code null} for none
   */
  public WaterConservation setWaterSavingSinks(java.lang.Boolean waterSavingSinks) {
    this.waterSavingSinks = waterSavingSinks;
    return this;
  }

  /**
   * Water saving sinks exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getWaterSavingSinksException() {
    return waterSavingSinksException;
  }

  /**
   * Water saving sinks exception.
   * @param waterSavingSinksException waterSavingSinksException or {@code null} for none
   */
  public WaterConservation setWaterSavingSinksException(java.lang.String waterSavingSinksException) {
    this.waterSavingSinksException = waterSavingSinksException;
    return this;
  }

  /**
   * Water saving toilets. All of the property's toilets use 1.6 gallons per flush, or less.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWaterSavingToilets() {
    return waterSavingToilets;
  }

  /**
   * Water saving toilets. All of the property's toilets use 1.6 gallons per flush, or less.
   * @param waterSavingToilets waterSavingToilets or {@code null} for none
   */
  public WaterConservation setWaterSavingToilets(java.lang.Boolean waterSavingToilets) {
    this.waterSavingToilets = waterSavingToilets;
    return this;
  }

  /**
   * Water saving toilets exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getWaterSavingToiletsException() {
    return waterSavingToiletsException;
  }

  /**
   * Water saving toilets exception.
   * @param waterSavingToiletsException waterSavingToiletsException or {@code null} for none
   */
  public WaterConservation setWaterSavingToiletsException(java.lang.String waterSavingToiletsException) {
    this.waterSavingToiletsException = waterSavingToiletsException;
    return this;
  }

  @Override
  public WaterConservation set(String fieldName, Object value) {
    return (WaterConservation) super.set(fieldName, value);
  }

  @Override
  public WaterConservation clone() {
    return (WaterConservation) super.clone();
  }

}
