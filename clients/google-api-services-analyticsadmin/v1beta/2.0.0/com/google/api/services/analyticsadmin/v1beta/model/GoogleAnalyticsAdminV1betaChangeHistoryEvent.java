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

package com.google.api.services.analyticsadmin.v1beta.model;

/**
 * A set of changes within a Google Analytics account or its child properties that resulted from the
 * same cause. Common causes would be updates made in the Google Analytics UI, changes from customer
 * support, or automatic Google Analytics system changes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1betaChangeHistoryEvent extends com.google.api.client.json.GenericJson {

  /**
   * The type of actor that made this change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String actorType;

  /**
   * Time when change was made.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String changeTime;

  /**
   * A list of changes made in this change history event that fit the filters specified in
   * SearchChangeHistoryEventsRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAnalyticsAdminV1betaChangeHistoryChange> changes;

  static {
    // hack to force ProGuard to consider GoogleAnalyticsAdminV1betaChangeHistoryChange used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAnalyticsAdminV1betaChangeHistoryChange.class);
  }

  /**
   * If true, then the list of changes returned was filtered, and does not represent all changes
   * that occurred in this event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean changesFiltered;

  /**
   * ID of this change history event. This ID is unique across Google Analytics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Email address of the Google account that made the change. This will be a valid email address if
   * the actor field is set to USER, and empty otherwise. Google accounts that have been deleted
   * will cause an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userActorEmail;

  /**
   * The type of actor that made this change.
   * @return value or {@code null} for none
   */
  public java.lang.String getActorType() {
    return actorType;
  }

  /**
   * The type of actor that made this change.
   * @param actorType actorType or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaChangeHistoryEvent setActorType(java.lang.String actorType) {
    this.actorType = actorType;
    return this;
  }

  /**
   * Time when change was made.
   * @return value or {@code null} for none
   */
  public String getChangeTime() {
    return changeTime;
  }

  /**
   * Time when change was made.
   * @param changeTime changeTime or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaChangeHistoryEvent setChangeTime(String changeTime) {
    this.changeTime = changeTime;
    return this;
  }

  /**
   * A list of changes made in this change history event that fit the filters specified in
   * SearchChangeHistoryEventsRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAnalyticsAdminV1betaChangeHistoryChange> getChanges() {
    return changes;
  }

  /**
   * A list of changes made in this change history event that fit the filters specified in
   * SearchChangeHistoryEventsRequest.
   * @param changes changes or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaChangeHistoryEvent setChanges(java.util.List<GoogleAnalyticsAdminV1betaChangeHistoryChange> changes) {
    this.changes = changes;
    return this;
  }

  /**
   * If true, then the list of changes returned was filtered, and does not represent all changes
   * that occurred in this event.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getChangesFiltered() {
    return changesFiltered;
  }

  /**
   * If true, then the list of changes returned was filtered, and does not represent all changes
   * that occurred in this event.
   * @param changesFiltered changesFiltered or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaChangeHistoryEvent setChangesFiltered(java.lang.Boolean changesFiltered) {
    this.changesFiltered = changesFiltered;
    return this;
  }

  /**
   * ID of this change history event. This ID is unique across Google Analytics.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * ID of this change history event. This ID is unique across Google Analytics.
   * @param id id or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaChangeHistoryEvent setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Email address of the Google account that made the change. This will be a valid email address if
   * the actor field is set to USER, and empty otherwise. Google accounts that have been deleted
   * will cause an error.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserActorEmail() {
    return userActorEmail;
  }

  /**
   * Email address of the Google account that made the change. This will be a valid email address if
   * the actor field is set to USER, and empty otherwise. Google accounts that have been deleted
   * will cause an error.
   * @param userActorEmail userActorEmail or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaChangeHistoryEvent setUserActorEmail(java.lang.String userActorEmail) {
    this.userActorEmail = userActorEmail;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1betaChangeHistoryEvent set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1betaChangeHistoryEvent) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1betaChangeHistoryEvent clone() {
    return (GoogleAnalyticsAdminV1betaChangeHistoryEvent) super.clone();
  }

}
