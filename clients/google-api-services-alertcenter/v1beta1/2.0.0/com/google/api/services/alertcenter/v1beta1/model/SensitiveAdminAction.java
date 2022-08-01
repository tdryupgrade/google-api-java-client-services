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
 * Alert that is triggered when Sensitive Admin Action occur in customer account.
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
public final class SensitiveAdminAction extends com.google.api.client.json.GenericJson {

  /**
   * Email of person who performed the action
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String actorEmail;

  /**
   * The time at which event occurred
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String eventTime;

  /**
   * Event occurred when primary admin changed in customer's account
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrimaryAdminChangedEvent primaryAdminChangedEvent;

  /**
   * Event occurred when SSO Profile created in customer's account
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SSOProfileCreatedEvent ssoProfileCreatedEvent;

  /**
   * Event occurred when SSO Profile deleted in customer's account
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SSOProfileDeletedEvent ssoProfileDeletedEvent;

  /**
   * Event occurred when SSO Profile updated in customer's account
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SSOProfileUpdatedEvent ssoProfileUpdatedEvent;

  /**
   * Event occurred when password was reset for super admin in customer's account
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SuperAdminPasswordResetEvent superAdminPasswordResetEvent;

  /**
   * Email of person who performed the action
   * @return value or {@code null} for none
   */
  public java.lang.String getActorEmail() {
    return actorEmail;
  }

  /**
   * Email of person who performed the action
   * @param actorEmail actorEmail or {@code null} for none
   */
  public SensitiveAdminAction setActorEmail(java.lang.String actorEmail) {
    this.actorEmail = actorEmail;
    return this;
  }

  /**
   * The time at which event occurred
   * @return value or {@code null} for none
   */
  public String getEventTime() {
    return eventTime;
  }

  /**
   * The time at which event occurred
   * @param eventTime eventTime or {@code null} for none
   */
  public SensitiveAdminAction setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Event occurred when primary admin changed in customer's account
   * @return value or {@code null} for none
   */
  public PrimaryAdminChangedEvent getPrimaryAdminChangedEvent() {
    return primaryAdminChangedEvent;
  }

  /**
   * Event occurred when primary admin changed in customer's account
   * @param primaryAdminChangedEvent primaryAdminChangedEvent or {@code null} for none
   */
  public SensitiveAdminAction setPrimaryAdminChangedEvent(PrimaryAdminChangedEvent primaryAdminChangedEvent) {
    this.primaryAdminChangedEvent = primaryAdminChangedEvent;
    return this;
  }

  /**
   * Event occurred when SSO Profile created in customer's account
   * @return value or {@code null} for none
   */
  public SSOProfileCreatedEvent getSsoProfileCreatedEvent() {
    return ssoProfileCreatedEvent;
  }

  /**
   * Event occurred when SSO Profile created in customer's account
   * @param ssoProfileCreatedEvent ssoProfileCreatedEvent or {@code null} for none
   */
  public SensitiveAdminAction setSsoProfileCreatedEvent(SSOProfileCreatedEvent ssoProfileCreatedEvent) {
    this.ssoProfileCreatedEvent = ssoProfileCreatedEvent;
    return this;
  }

  /**
   * Event occurred when SSO Profile deleted in customer's account
   * @return value or {@code null} for none
   */
  public SSOProfileDeletedEvent getSsoProfileDeletedEvent() {
    return ssoProfileDeletedEvent;
  }

  /**
   * Event occurred when SSO Profile deleted in customer's account
   * @param ssoProfileDeletedEvent ssoProfileDeletedEvent or {@code null} for none
   */
  public SensitiveAdminAction setSsoProfileDeletedEvent(SSOProfileDeletedEvent ssoProfileDeletedEvent) {
    this.ssoProfileDeletedEvent = ssoProfileDeletedEvent;
    return this;
  }

  /**
   * Event occurred when SSO Profile updated in customer's account
   * @return value or {@code null} for none
   */
  public SSOProfileUpdatedEvent getSsoProfileUpdatedEvent() {
    return ssoProfileUpdatedEvent;
  }

  /**
   * Event occurred when SSO Profile updated in customer's account
   * @param ssoProfileUpdatedEvent ssoProfileUpdatedEvent or {@code null} for none
   */
  public SensitiveAdminAction setSsoProfileUpdatedEvent(SSOProfileUpdatedEvent ssoProfileUpdatedEvent) {
    this.ssoProfileUpdatedEvent = ssoProfileUpdatedEvent;
    return this;
  }

  /**
   * Event occurred when password was reset for super admin in customer's account
   * @return value or {@code null} for none
   */
  public SuperAdminPasswordResetEvent getSuperAdminPasswordResetEvent() {
    return superAdminPasswordResetEvent;
  }

  /**
   * Event occurred when password was reset for super admin in customer's account
   * @param superAdminPasswordResetEvent superAdminPasswordResetEvent or {@code null} for none
   */
  public SensitiveAdminAction setSuperAdminPasswordResetEvent(SuperAdminPasswordResetEvent superAdminPasswordResetEvent) {
    this.superAdminPasswordResetEvent = superAdminPasswordResetEvent;
    return this;
  }

  @Override
  public SensitiveAdminAction set(String fieldName, Object value) {
    return (SensitiveAdminAction) super.set(fieldName, value);
  }

  @Override
  public SensitiveAdminAction clone() {
    return (SensitiveAdminAction) super.clone();
  }

}
