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

package com.google.api.services.content.model;

/**
 * Response message for the GetProgramStatus method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuyOnGoogleProgramStatus extends com.google.api.client.json.GenericJson {

  /**
   * The business models in which merchant participates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> businessModel;

  /**
   * The customer service pending email. After verification this field becomes empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerServicePendingEmail;

  /**
   * The pending phone number specified for BuyOnGoogle program. It might be different than account
   * level phone number. In order to update this field the
   * customer_service_pending_phone_region_code must also be set. After verification this field
   * becomes empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerServicePendingPhoneNumber;

  /**
   * Two letter country code for the pending phone number, for example `CA` for Canadian numbers.
   * See the [ISO 3166-1
   * alpha-2](https://wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements)
   * officially assigned codes. In order to update this field the
   * customer_service_pending_phone_number must also be set. After verification this field becomes
   * empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerServicePendingPhoneRegionCode;

  /**
   * Output only. The customer service verified email.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerServiceVerifiedEmail;

  /**
   * Output only. The verified phone number specified for BuyOnGoogle program. It might be different
   * than account level phone number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerServiceVerifiedPhoneNumber;

  /**
   * Output only. Two letter country code for the verified phone number, for example `CA` for
   * Canadian numbers. See the [ISO 3166-1
   * alpha-2](https://wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements)
   * officially assigned codes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerServiceVerifiedPhoneRegionCode;

  /**
   * The channels through which the merchant is selling.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String onlineSalesChannel;

  /**
   * Output only. The current participation stage for the program.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String participationStage;

  /**
   * The business models in which merchant participates.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBusinessModel() {
    return businessModel;
  }

  /**
   * The business models in which merchant participates.
   * @param businessModel businessModel or {@code null} for none
   */
  public BuyOnGoogleProgramStatus setBusinessModel(java.util.List<java.lang.String> businessModel) {
    this.businessModel = businessModel;
    return this;
  }

  /**
   * The customer service pending email. After verification this field becomes empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerServicePendingEmail() {
    return customerServicePendingEmail;
  }

  /**
   * The customer service pending email. After verification this field becomes empty.
   * @param customerServicePendingEmail customerServicePendingEmail or {@code null} for none
   */
  public BuyOnGoogleProgramStatus setCustomerServicePendingEmail(java.lang.String customerServicePendingEmail) {
    this.customerServicePendingEmail = customerServicePendingEmail;
    return this;
  }

  /**
   * The pending phone number specified for BuyOnGoogle program. It might be different than account
   * level phone number. In order to update this field the
   * customer_service_pending_phone_region_code must also be set. After verification this field
   * becomes empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerServicePendingPhoneNumber() {
    return customerServicePendingPhoneNumber;
  }

  /**
   * The pending phone number specified for BuyOnGoogle program. It might be different than account
   * level phone number. In order to update this field the
   * customer_service_pending_phone_region_code must also be set. After verification this field
   * becomes empty.
   * @param customerServicePendingPhoneNumber customerServicePendingPhoneNumber or {@code null} for none
   */
  public BuyOnGoogleProgramStatus setCustomerServicePendingPhoneNumber(java.lang.String customerServicePendingPhoneNumber) {
    this.customerServicePendingPhoneNumber = customerServicePendingPhoneNumber;
    return this;
  }

  /**
   * Two letter country code for the pending phone number, for example `CA` for Canadian numbers.
   * See the [ISO 3166-1
   * alpha-2](https://wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements)
   * officially assigned codes. In order to update this field the
   * customer_service_pending_phone_number must also be set. After verification this field becomes
   * empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerServicePendingPhoneRegionCode() {
    return customerServicePendingPhoneRegionCode;
  }

  /**
   * Two letter country code for the pending phone number, for example `CA` for Canadian numbers.
   * See the [ISO 3166-1
   * alpha-2](https://wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements)
   * officially assigned codes. In order to update this field the
   * customer_service_pending_phone_number must also be set. After verification this field becomes
   * empty.
   * @param customerServicePendingPhoneRegionCode customerServicePendingPhoneRegionCode or {@code null} for none
   */
  public BuyOnGoogleProgramStatus setCustomerServicePendingPhoneRegionCode(java.lang.String customerServicePendingPhoneRegionCode) {
    this.customerServicePendingPhoneRegionCode = customerServicePendingPhoneRegionCode;
    return this;
  }

  /**
   * Output only. The customer service verified email.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerServiceVerifiedEmail() {
    return customerServiceVerifiedEmail;
  }

  /**
   * Output only. The customer service verified email.
   * @param customerServiceVerifiedEmail customerServiceVerifiedEmail or {@code null} for none
   */
  public BuyOnGoogleProgramStatus setCustomerServiceVerifiedEmail(java.lang.String customerServiceVerifiedEmail) {
    this.customerServiceVerifiedEmail = customerServiceVerifiedEmail;
    return this;
  }

  /**
   * Output only. The verified phone number specified for BuyOnGoogle program. It might be different
   * than account level phone number.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerServiceVerifiedPhoneNumber() {
    return customerServiceVerifiedPhoneNumber;
  }

  /**
   * Output only. The verified phone number specified for BuyOnGoogle program. It might be different
   * than account level phone number.
   * @param customerServiceVerifiedPhoneNumber customerServiceVerifiedPhoneNumber or {@code null} for none
   */
  public BuyOnGoogleProgramStatus setCustomerServiceVerifiedPhoneNumber(java.lang.String customerServiceVerifiedPhoneNumber) {
    this.customerServiceVerifiedPhoneNumber = customerServiceVerifiedPhoneNumber;
    return this;
  }

  /**
   * Output only. Two letter country code for the verified phone number, for example `CA` for
   * Canadian numbers. See the [ISO 3166-1
   * alpha-2](https://wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements)
   * officially assigned codes.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerServiceVerifiedPhoneRegionCode() {
    return customerServiceVerifiedPhoneRegionCode;
  }

  /**
   * Output only. Two letter country code for the verified phone number, for example `CA` for
   * Canadian numbers. See the [ISO 3166-1
   * alpha-2](https://wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements)
   * officially assigned codes.
   * @param customerServiceVerifiedPhoneRegionCode customerServiceVerifiedPhoneRegionCode or {@code null} for none
   */
  public BuyOnGoogleProgramStatus setCustomerServiceVerifiedPhoneRegionCode(java.lang.String customerServiceVerifiedPhoneRegionCode) {
    this.customerServiceVerifiedPhoneRegionCode = customerServiceVerifiedPhoneRegionCode;
    return this;
  }

  /**
   * The channels through which the merchant is selling.
   * @return value or {@code null} for none
   */
  public java.lang.String getOnlineSalesChannel() {
    return onlineSalesChannel;
  }

  /**
   * The channels through which the merchant is selling.
   * @param onlineSalesChannel onlineSalesChannel or {@code null} for none
   */
  public BuyOnGoogleProgramStatus setOnlineSalesChannel(java.lang.String onlineSalesChannel) {
    this.onlineSalesChannel = onlineSalesChannel;
    return this;
  }

  /**
   * Output only. The current participation stage for the program.
   * @return value or {@code null} for none
   */
  public java.lang.String getParticipationStage() {
    return participationStage;
  }

  /**
   * Output only. The current participation stage for the program.
   * @param participationStage participationStage or {@code null} for none
   */
  public BuyOnGoogleProgramStatus setParticipationStage(java.lang.String participationStage) {
    this.participationStage = participationStage;
    return this;
  }

  @Override
  public BuyOnGoogleProgramStatus set(String fieldName, Object value) {
    return (BuyOnGoogleProgramStatus) super.set(fieldName, value);
  }

  @Override
  public BuyOnGoogleProgramStatus clone() {
    return (BuyOnGoogleProgramStatus) super.clone();
  }

}
