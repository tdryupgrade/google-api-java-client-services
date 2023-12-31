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

package com.google.api.services.domains.v1.model;

/**
 * Details required for a contact associated with a `Registration`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Domains API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Contact extends com.google.api.client.json.GenericJson {

  /**
   * Required. Email address of the contact.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * Fax number of the contact in international format. For example, `"+1-800-555-0123"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String faxNumber;

  /**
   * Required. Phone number of the contact in international format. For example,
   * `"+1-800-555-0123"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumber;

  /**
   * Required. Postal address of the contact.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PostalAddress postalAddress;

  /**
   * Required. Email address of the contact.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Required. Email address of the contact.
   * @param email email or {@code null} for none
   */
  public Contact setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * Fax number of the contact in international format. For example, `"+1-800-555-0123"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFaxNumber() {
    return faxNumber;
  }

  /**
   * Fax number of the contact in international format. For example, `"+1-800-555-0123"`.
   * @param faxNumber faxNumber or {@code null} for none
   */
  public Contact setFaxNumber(java.lang.String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * Required. Phone number of the contact in international format. For example,
   * `"+1-800-555-0123"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Required. Phone number of the contact in international format. For example,
   * `"+1-800-555-0123"`.
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  public Contact setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Required. Postal address of the contact.
   * @return value or {@code null} for none
   */
  public PostalAddress getPostalAddress() {
    return postalAddress;
  }

  /**
   * Required. Postal address of the contact.
   * @param postalAddress postalAddress or {@code null} for none
   */
  public Contact setPostalAddress(PostalAddress postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  @Override
  public Contact set(String fieldName, Object value) {
    return (Contact) super.set(fieldName, value);
  }

  @Override
  public Contact clone() {
    return (Contact) super.clone();
  }

}
