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

package com.google.api.services.alertcenter.v1beta1.model;

/**
 * Details of a message in phishing spike alert.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Workspace Alert Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GmailMessageInfo extends com.google.api.client.json.GenericJson {

  /**
   * The `SHA256` hash of email's attachment and all MIME parts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> attachmentsSha256Hash;

  /**
   * The date of the event related to this email.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String date;

  /**
   * The hash of the message body text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String md5HashMessageBody;

  /**
   * The MD5 Hash of email's subject (only available for reported emails).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String md5HashSubject;

  /**
   * The snippet of the message body text (only available for reported emails).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String messageBodySnippet;

  /**
   * The message ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String messageId;

  /**
   * The recipient of this email.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recipient;

  /**
   * The email subject text (only available for reported emails).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subjectText;

  /**
   * The `SHA256` hash of email's attachment and all MIME parts.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAttachmentsSha256Hash() {
    return attachmentsSha256Hash;
  }

  /**
   * The `SHA256` hash of email's attachment and all MIME parts.
   * @param attachmentsSha256Hash attachmentsSha256Hash or {@code null} for none
   */
  public GmailMessageInfo setAttachmentsSha256Hash(java.util.List<java.lang.String> attachmentsSha256Hash) {
    this.attachmentsSha256Hash = attachmentsSha256Hash;
    return this;
  }

  /**
   * The date of the event related to this email.
   * @return value or {@code null} for none
   */
  public String getDate() {
    return date;
  }

  /**
   * The date of the event related to this email.
   * @param date date or {@code null} for none
   */
  public GmailMessageInfo setDate(String date) {
    this.date = date;
    return this;
  }

  /**
   * The hash of the message body text.
   * @return value or {@code null} for none
   */
  public java.lang.String getMd5HashMessageBody() {
    return md5HashMessageBody;
  }

  /**
   * The hash of the message body text.
   * @param md5HashMessageBody md5HashMessageBody or {@code null} for none
   */
  public GmailMessageInfo setMd5HashMessageBody(java.lang.String md5HashMessageBody) {
    this.md5HashMessageBody = md5HashMessageBody;
    return this;
  }

  /**
   * The MD5 Hash of email's subject (only available for reported emails).
   * @return value or {@code null} for none
   */
  public java.lang.String getMd5HashSubject() {
    return md5HashSubject;
  }

  /**
   * The MD5 Hash of email's subject (only available for reported emails).
   * @param md5HashSubject md5HashSubject or {@code null} for none
   */
  public GmailMessageInfo setMd5HashSubject(java.lang.String md5HashSubject) {
    this.md5HashSubject = md5HashSubject;
    return this;
  }

  /**
   * The snippet of the message body text (only available for reported emails).
   * @return value or {@code null} for none
   */
  public java.lang.String getMessageBodySnippet() {
    return messageBodySnippet;
  }

  /**
   * The snippet of the message body text (only available for reported emails).
   * @param messageBodySnippet messageBodySnippet or {@code null} for none
   */
  public GmailMessageInfo setMessageBodySnippet(java.lang.String messageBodySnippet) {
    this.messageBodySnippet = messageBodySnippet;
    return this;
  }

  /**
   * The message ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessageId() {
    return messageId;
  }

  /**
   * The message ID.
   * @param messageId messageId or {@code null} for none
   */
  public GmailMessageInfo setMessageId(java.lang.String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * The recipient of this email.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecipient() {
    return recipient;
  }

  /**
   * The recipient of this email.
   * @param recipient recipient or {@code null} for none
   */
  public GmailMessageInfo setRecipient(java.lang.String recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * The email subject text (only available for reported emails).
   * @return value or {@code null} for none
   */
  public java.lang.String getSubjectText() {
    return subjectText;
  }

  /**
   * The email subject text (only available for reported emails).
   * @param subjectText subjectText or {@code null} for none
   */
  public GmailMessageInfo setSubjectText(java.lang.String subjectText) {
    this.subjectText = subjectText;
    return this;
  }

  @Override
  public GmailMessageInfo set(String fieldName, Object value) {
    return (GmailMessageInfo) super.set(fieldName, value);
  }

  @Override
  public GmailMessageInfo clone() {
    return (GmailMessageInfo) super.clone();
  }

}
