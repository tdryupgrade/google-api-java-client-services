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

package com.google.api.services.dfareporting.model;

/**
 * Contains properties of a Campaign Manager Billing Profile.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BillingProfile extends com.google.api.client.json.GenericJson {

  /**
   * Consolidated invoice option for this billing profile. Used to get a single, consolidated
   * invoice across the chosen invoice level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean consolidatedInvoice;

  /**
   * Country code of this billing profile.This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countryCode;

  /**
   * Billing currency code in ISO 4217 format.This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * ID of this billing profile. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Invoice level for this billing profile. Used to group fees into separate invoices by account,
   * advertiser, or campaign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String invoiceLevel;

  /**
   * True if the billing profile is the account default profile. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDefault;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#billingProfile".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of this billing profile. This is a required field and must be less than 256 characters
   * long and must be unique among billing profile in the same account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The ID of the payment account the billing profile belongs to. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String paymentsAccountId;

  /**
   * The ID of the payment customer the billing profile belongs to. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String paymentsCustomerId;

  /**
   * Purchase order (PO) for this billing profile. This PO number is used in the invoices for all of
   * the advertisers in this billing profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purchaseOrder;

  /**
   * The ID of the secondary payment customer the billing profile belongs to. This is a read-only
   * field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secondaryPaymentsCustomerId;

  /**
   * Status of this billing profile.This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Consolidated invoice option for this billing profile. Used to get a single, consolidated
   * invoice across the chosen invoice level.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getConsolidatedInvoice() {
    return consolidatedInvoice;
  }

  /**
   * Consolidated invoice option for this billing profile. Used to get a single, consolidated
   * invoice across the chosen invoice level.
   * @param consolidatedInvoice consolidatedInvoice or {@code null} for none
   */
  public BillingProfile setConsolidatedInvoice(java.lang.Boolean consolidatedInvoice) {
    this.consolidatedInvoice = consolidatedInvoice;
    return this;
  }

  /**
   * Country code of this billing profile.This is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountryCode() {
    return countryCode;
  }

  /**
   * Country code of this billing profile.This is a read-only field.
   * @param countryCode countryCode or {@code null} for none
   */
  public BillingProfile setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Billing currency code in ISO 4217 format.This is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Billing currency code in ISO 4217 format.This is a read-only field.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public BillingProfile setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * ID of this billing profile. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this billing profile. This is a read-only, auto-generated field.
   * @param id id or {@code null} for none
   */
  public BillingProfile setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Invoice level for this billing profile. Used to group fees into separate invoices by account,
   * advertiser, or campaign.
   * @return value or {@code null} for none
   */
  public java.lang.String getInvoiceLevel() {
    return invoiceLevel;
  }

  /**
   * Invoice level for this billing profile. Used to group fees into separate invoices by account,
   * advertiser, or campaign.
   * @param invoiceLevel invoiceLevel or {@code null} for none
   */
  public BillingProfile setInvoiceLevel(java.lang.String invoiceLevel) {
    this.invoiceLevel = invoiceLevel;
    return this;
  }

  /**
   * True if the billing profile is the account default profile. This is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * True if the billing profile is the account default profile. This is a read-only field.
   * @param isDefault isDefault or {@code null} for none
   */
  public BillingProfile setIsDefault(java.lang.Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#billingProfile".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#billingProfile".
   * @param kind kind or {@code null} for none
   */
  public BillingProfile setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of this billing profile. This is a required field and must be less than 256 characters
   * long and must be unique among billing profile in the same account.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this billing profile. This is a required field and must be less than 256 characters
   * long and must be unique among billing profile in the same account.
   * @param name name or {@code null} for none
   */
  public BillingProfile setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The ID of the payment account the billing profile belongs to. This is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.String getPaymentsAccountId() {
    return paymentsAccountId;
  }

  /**
   * The ID of the payment account the billing profile belongs to. This is a read-only field.
   * @param paymentsAccountId paymentsAccountId or {@code null} for none
   */
  public BillingProfile setPaymentsAccountId(java.lang.String paymentsAccountId) {
    this.paymentsAccountId = paymentsAccountId;
    return this;
  }

  /**
   * The ID of the payment customer the billing profile belongs to. This is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.String getPaymentsCustomerId() {
    return paymentsCustomerId;
  }

  /**
   * The ID of the payment customer the billing profile belongs to. This is a read-only field.
   * @param paymentsCustomerId paymentsCustomerId or {@code null} for none
   */
  public BillingProfile setPaymentsCustomerId(java.lang.String paymentsCustomerId) {
    this.paymentsCustomerId = paymentsCustomerId;
    return this;
  }

  /**
   * Purchase order (PO) for this billing profile. This PO number is used in the invoices for all of
   * the advertisers in this billing profile.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurchaseOrder() {
    return purchaseOrder;
  }

  /**
   * Purchase order (PO) for this billing profile. This PO number is used in the invoices for all of
   * the advertisers in this billing profile.
   * @param purchaseOrder purchaseOrder or {@code null} for none
   */
  public BillingProfile setPurchaseOrder(java.lang.String purchaseOrder) {
    this.purchaseOrder = purchaseOrder;
    return this;
  }

  /**
   * The ID of the secondary payment customer the billing profile belongs to. This is a read-only
   * field.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecondaryPaymentsCustomerId() {
    return secondaryPaymentsCustomerId;
  }

  /**
   * The ID of the secondary payment customer the billing profile belongs to. This is a read-only
   * field.
   * @param secondaryPaymentsCustomerId secondaryPaymentsCustomerId or {@code null} for none
   */
  public BillingProfile setSecondaryPaymentsCustomerId(java.lang.String secondaryPaymentsCustomerId) {
    this.secondaryPaymentsCustomerId = secondaryPaymentsCustomerId;
    return this;
  }

  /**
   * Status of this billing profile.This is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of this billing profile.This is a read-only field.
   * @param status status or {@code null} for none
   */
  public BillingProfile setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public BillingProfile set(String fieldName, Object value) {
    return (BillingProfile) super.set(fieldName, value);
  }

  @Override
  public BillingProfile clone() {
    return (BillingProfile) super.clone();
  }

}
