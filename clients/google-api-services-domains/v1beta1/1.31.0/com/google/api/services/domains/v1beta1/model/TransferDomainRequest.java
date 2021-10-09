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

package com.google.api.services.domains.v1beta1.model;

/**
 * Request for the `TransferDomain` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Domains API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TransferDomainRequest extends com.google.api.client.json.GenericJson {

  /**
   * The domain's transfer authorization code. You can obtain this from the domain's current
   * registrar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AuthorizationCode authorizationCode;

  /**
   * The list of contact notices that you acknowledge. The notices needed here depend on the values
   * specified in `registration.contact_settings`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> contactNotices;

  /**
   * Required. The complete `Registration` resource to be created. You can leave
   * `registration.dns_settings` unset to import the domain's current DNS configuration from its
   * current registrar. Use this option only if you are sure that the domain's current DNS service
   * will not cease upon transfer, as is often the case for DNS services provided for free by the
   * registrar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Registration registration;

  /**
   * Validate the request without actually transferring the domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean validateOnly;

  /**
   * Required. Acknowledgement of the price to transfer or renew the domain for one year. Call
   * `RetrieveTransferParameters` to obtain the price, which you must acknowledge.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money yearlyPrice;

  /**
   * The domain's transfer authorization code. You can obtain this from the domain's current
   * registrar.
   * @return value or {@code null} for none
   */
  public AuthorizationCode getAuthorizationCode() {
    return authorizationCode;
  }

  /**
   * The domain's transfer authorization code. You can obtain this from the domain's current
   * registrar.
   * @param authorizationCode authorizationCode or {@code null} for none
   */
  public TransferDomainRequest setAuthorizationCode(AuthorizationCode authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

  /**
   * The list of contact notices that you acknowledge. The notices needed here depend on the values
   * specified in `registration.contact_settings`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getContactNotices() {
    return contactNotices;
  }

  /**
   * The list of contact notices that you acknowledge. The notices needed here depend on the values
   * specified in `registration.contact_settings`.
   * @param contactNotices contactNotices or {@code null} for none
   */
  public TransferDomainRequest setContactNotices(java.util.List<java.lang.String> contactNotices) {
    this.contactNotices = contactNotices;
    return this;
  }

  /**
   * Required. The complete `Registration` resource to be created. You can leave
   * `registration.dns_settings` unset to import the domain's current DNS configuration from its
   * current registrar. Use this option only if you are sure that the domain's current DNS service
   * will not cease upon transfer, as is often the case for DNS services provided for free by the
   * registrar.
   * @return value or {@code null} for none
   */
  public Registration getRegistration() {
    return registration;
  }

  /**
   * Required. The complete `Registration` resource to be created. You can leave
   * `registration.dns_settings` unset to import the domain's current DNS configuration from its
   * current registrar. Use this option only if you are sure that the domain's current DNS service
   * will not cease upon transfer, as is often the case for DNS services provided for free by the
   * registrar.
   * @param registration registration or {@code null} for none
   */
  public TransferDomainRequest setRegistration(Registration registration) {
    this.registration = registration;
    return this;
  }

  /**
   * Validate the request without actually transferring the domain.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getValidateOnly() {
    return validateOnly;
  }

  /**
   * Validate the request without actually transferring the domain.
   * @param validateOnly validateOnly or {@code null} for none
   */
  public TransferDomainRequest setValidateOnly(java.lang.Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  /**
   * Required. Acknowledgement of the price to transfer or renew the domain for one year. Call
   * `RetrieveTransferParameters` to obtain the price, which you must acknowledge.
   * @return value or {@code null} for none
   */
  public Money getYearlyPrice() {
    return yearlyPrice;
  }

  /**
   * Required. Acknowledgement of the price to transfer or renew the domain for one year. Call
   * `RetrieveTransferParameters` to obtain the price, which you must acknowledge.
   * @param yearlyPrice yearlyPrice or {@code null} for none
   */
  public TransferDomainRequest setYearlyPrice(Money yearlyPrice) {
    this.yearlyPrice = yearlyPrice;
    return this;
  }

  @Override
  public TransferDomainRequest set(String fieldName, Object value) {
    return (TransferDomainRequest) super.set(fieldName, value);
  }

  @Override
  public TransferDomainRequest clone() {
    return (TransferDomainRequest) super.clone();
  }

}
