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

package com.google.api.services.gmail.model;

/**
 * Settings associated with a send-as alias, which can be either the primary login address
 * associated with the account or a custom "from" address. Send-as aliases correspond to the "Send
 * Mail As" feature in the web interface.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Gmail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SendAs extends com.google.api.client.json.GenericJson {

  /**
   * A name that appears in the "From:" header for mail sent using this alias. For custom "from"
   * addresses, when this is empty, Gmail will populate the "From:" header with the name that is
   * used for the primary address associated with the account. If the admin has disabled the ability
   * for users to update their name format, requests to update this field for the primary login will
   * silently fail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Whether this address is selected as the default "From:" address in situations such as composing
   * a new message or sending a vacation auto-reply. Every Gmail account has exactly one default
   * send-as address, so the only legal value that clients may write to this field is `true`.
   * Changing this from `false` to `true` for an address will result in this field becoming `false`
   * for the other previous default address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDefault;

  /**
   * Whether this address is the primary address used to login to the account. Every Gmail account
   * has exactly one primary address, and it cannot be deleted from the collection of send-as
   * aliases. This field is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isPrimary;

  /**
   * An optional email address that is included in a "Reply-To:" header for mail sent using this
   * alias. If this is empty, Gmail will not generate a "Reply-To:" header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String replyToAddress;

  /**
   * The email address that appears in the "From:" header for mail sent using this alias. This is
   * read-only for all operations except create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sendAsEmail;

  /**
   * An optional HTML signature that is included in messages composed with this alias in the Gmail
   * web UI. This signature is added to new emails only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String signature;

  /**
   * An optional SMTP service that will be used as an outbound relay for mail sent using this alias.
   * If this is empty, outbound mail will be sent directly from Gmail's servers to the destination
   * SMTP service. This setting only applies to custom "from" aliases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SmtpMsa smtpMsa;

  /**
   * Whether Gmail should treat this address as an alias for the user's primary email address. This
   * setting only applies to custom "from" aliases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean treatAsAlias;

  /**
   * Indicates whether this address has been verified for use as a send-as alias. Read-only. This
   * setting only applies to custom "from" aliases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verificationStatus;

  /**
   * A name that appears in the "From:" header for mail sent using this alias. For custom "from"
   * addresses, when this is empty, Gmail will populate the "From:" header with the name that is
   * used for the primary address associated with the account. If the admin has disabled the ability
   * for users to update their name format, requests to update this field for the primary login will
   * silently fail.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * A name that appears in the "From:" header for mail sent using this alias. For custom "from"
   * addresses, when this is empty, Gmail will populate the "From:" header with the name that is
   * used for the primary address associated with the account. If the admin has disabled the ability
   * for users to update their name format, requests to update this field for the primary login will
   * silently fail.
   * @param displayName displayName or {@code null} for none
   */
  public SendAs setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Whether this address is selected as the default "From:" address in situations such as composing
   * a new message or sending a vacation auto-reply. Every Gmail account has exactly one default
   * send-as address, so the only legal value that clients may write to this field is `true`.
   * Changing this from `false` to `true` for an address will result in this field becoming `false`
   * for the other previous default address.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * Whether this address is selected as the default "From:" address in situations such as composing
   * a new message or sending a vacation auto-reply. Every Gmail account has exactly one default
   * send-as address, so the only legal value that clients may write to this field is `true`.
   * Changing this from `false` to `true` for an address will result in this field becoming `false`
   * for the other previous default address.
   * @param isDefault isDefault or {@code null} for none
   */
  public SendAs setIsDefault(java.lang.Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether this address is the primary address used to login to the account. Every Gmail account
   * has exactly one primary address, and it cannot be deleted from the collection of send-as
   * aliases. This field is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPrimary() {
    return isPrimary;
  }

  /**
   * Whether this address is the primary address used to login to the account. Every Gmail account
   * has exactly one primary address, and it cannot be deleted from the collection of send-as
   * aliases. This field is read-only.
   * @param isPrimary isPrimary or {@code null} for none
   */
  public SendAs setIsPrimary(java.lang.Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

  /**
   * An optional email address that is included in a "Reply-To:" header for mail sent using this
   * alias. If this is empty, Gmail will not generate a "Reply-To:" header.
   * @return value or {@code null} for none
   */
  public java.lang.String getReplyToAddress() {
    return replyToAddress;
  }

  /**
   * An optional email address that is included in a "Reply-To:" header for mail sent using this
   * alias. If this is empty, Gmail will not generate a "Reply-To:" header.
   * @param replyToAddress replyToAddress or {@code null} for none
   */
  public SendAs setReplyToAddress(java.lang.String replyToAddress) {
    this.replyToAddress = replyToAddress;
    return this;
  }

  /**
   * The email address that appears in the "From:" header for mail sent using this alias. This is
   * read-only for all operations except create.
   * @return value or {@code null} for none
   */
  public java.lang.String getSendAsEmail() {
    return sendAsEmail;
  }

  /**
   * The email address that appears in the "From:" header for mail sent using this alias. This is
   * read-only for all operations except create.
   * @param sendAsEmail sendAsEmail or {@code null} for none
   */
  public SendAs setSendAsEmail(java.lang.String sendAsEmail) {
    this.sendAsEmail = sendAsEmail;
    return this;
  }

  /**
   * An optional HTML signature that is included in messages composed with this alias in the Gmail
   * web UI. This signature is added to new emails only.
   * @return value or {@code null} for none
   */
  public java.lang.String getSignature() {
    return signature;
  }

  /**
   * An optional HTML signature that is included in messages composed with this alias in the Gmail
   * web UI. This signature is added to new emails only.
   * @param signature signature or {@code null} for none
   */
  public SendAs setSignature(java.lang.String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * An optional SMTP service that will be used as an outbound relay for mail sent using this alias.
   * If this is empty, outbound mail will be sent directly from Gmail's servers to the destination
   * SMTP service. This setting only applies to custom "from" aliases.
   * @return value or {@code null} for none
   */
  public SmtpMsa getSmtpMsa() {
    return smtpMsa;
  }

  /**
   * An optional SMTP service that will be used as an outbound relay for mail sent using this alias.
   * If this is empty, outbound mail will be sent directly from Gmail's servers to the destination
   * SMTP service. This setting only applies to custom "from" aliases.
   * @param smtpMsa smtpMsa or {@code null} for none
   */
  public SendAs setSmtpMsa(SmtpMsa smtpMsa) {
    this.smtpMsa = smtpMsa;
    return this;
  }

  /**
   * Whether Gmail should treat this address as an alias for the user's primary email address. This
   * setting only applies to custom "from" aliases.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTreatAsAlias() {
    return treatAsAlias;
  }

  /**
   * Whether Gmail should treat this address as an alias for the user's primary email address. This
   * setting only applies to custom "from" aliases.
   * @param treatAsAlias treatAsAlias or {@code null} for none
   */
  public SendAs setTreatAsAlias(java.lang.Boolean treatAsAlias) {
    this.treatAsAlias = treatAsAlias;
    return this;
  }

  /**
   * Indicates whether this address has been verified for use as a send-as alias. Read-only. This
   * setting only applies to custom "from" aliases.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerificationStatus() {
    return verificationStatus;
  }

  /**
   * Indicates whether this address has been verified for use as a send-as alias. Read-only. This
   * setting only applies to custom "from" aliases.
   * @param verificationStatus verificationStatus or {@code null} for none
   */
  public SendAs setVerificationStatus(java.lang.String verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

  @Override
  public SendAs set(String fieldName, Object value) {
    return (SendAs) super.set(fieldName, value);
  }

  @Override
  public SendAs clone() {
    return (SendAs) super.clone();
  }

}
