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
 * An incident reported by Google Operations for a Google Workspace application.
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
public final class GoogleOperations extends com.google.api.client.json.GenericJson {

  /**
   * The list of emails which correspond to the users directly affected by the incident.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> affectedUserEmails;

  /**
   * Optional. Application-specific data for an incident, provided when the Google Workspace
   * application which reported the incident cannot be completely restored to a valid state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Attachment attachmentData;

  /**
   * A detailed, freeform incident description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Customer domain for email template personalization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * A header to display above the incident message. Typically used to attach a localized notice on
   * the timeline for followup comms translations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String header;

  /**
   * A one-line incident description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The list of emails which correspond to the users directly affected by the incident.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAffectedUserEmails() {
    return affectedUserEmails;
  }

  /**
   * The list of emails which correspond to the users directly affected by the incident.
   * @param affectedUserEmails affectedUserEmails or {@code null} for none
   */
  public GoogleOperations setAffectedUserEmails(java.util.List<java.lang.String> affectedUserEmails) {
    this.affectedUserEmails = affectedUserEmails;
    return this;
  }

  /**
   * Optional. Application-specific data for an incident, provided when the Google Workspace
   * application which reported the incident cannot be completely restored to a valid state.
   * @return value or {@code null} for none
   */
  public Attachment getAttachmentData() {
    return attachmentData;
  }

  /**
   * Optional. Application-specific data for an incident, provided when the Google Workspace
   * application which reported the incident cannot be completely restored to a valid state.
   * @param attachmentData attachmentData or {@code null} for none
   */
  public GoogleOperations setAttachmentData(Attachment attachmentData) {
    this.attachmentData = attachmentData;
    return this;
  }

  /**
   * A detailed, freeform incident description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A detailed, freeform incident description.
   * @param description description or {@code null} for none
   */
  public GoogleOperations setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Customer domain for email template personalization.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * Customer domain for email template personalization.
   * @param domain domain or {@code null} for none
   */
  public GoogleOperations setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * A header to display above the incident message. Typically used to attach a localized notice on
   * the timeline for followup comms translations.
   * @return value or {@code null} for none
   */
  public java.lang.String getHeader() {
    return header;
  }

  /**
   * A header to display above the incident message. Typically used to attach a localized notice on
   * the timeline for followup comms translations.
   * @param header header or {@code null} for none
   */
  public GoogleOperations setHeader(java.lang.String header) {
    this.header = header;
    return this;
  }

  /**
   * A one-line incident description.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * A one-line incident description.
   * @param title title or {@code null} for none
   */
  public GoogleOperations setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleOperations set(String fieldName, Object value) {
    return (GoogleOperations) super.set(fieldName, value);
  }

  @Override
  public GoogleOperations clone() {
    return (GoogleOperations) super.clone();
  }

}
