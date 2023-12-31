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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Markup that defines conference data associated to a Google Calendar event.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkup extends com.google.api.client.json.GenericJson {

  /**
   * Unique identifier for this conference data. Maximum 512 characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conferenceId;

  /**
   * An identifier of the conferencing solution. Must match a value from the deployment's
   * `calendar.conferenceSolution.id` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conferenceSolutionId;

  /**
   * Entry points to the conference. Maximum 300 entry points are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkupEntryPointMarkup> entryPoints;

  /**
   * If set, it means an error occurred during conference creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkupError error;

  /**
   * Additional notes (such as instructions from the administrator, legal notices) to display to the
   * user. Can contain HTML. Max length 2048 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String note;

  /**
   * Additional add-on parameters. Maximum 300 parameters are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkupParameter> parameters;

  /**
   * Unique identifier for this conference data. Maximum 512 characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getConferenceId() {
    return conferenceId;
  }

  /**
   * Unique identifier for this conference data. Maximum 512 characters long.
   * @param conferenceId conferenceId or {@code null} for none
   */
  public AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkup setConferenceId(java.lang.String conferenceId) {
    this.conferenceId = conferenceId;
    return this;
  }

  /**
   * An identifier of the conferencing solution. Must match a value from the deployment's
   * `calendar.conferenceSolution.id` field.
   * @return value or {@code null} for none
   */
  public java.lang.String getConferenceSolutionId() {
    return conferenceSolutionId;
  }

  /**
   * An identifier of the conferencing solution. Must match a value from the deployment's
   * `calendar.conferenceSolution.id` field.
   * @param conferenceSolutionId conferenceSolutionId or {@code null} for none
   */
  public AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkup setConferenceSolutionId(java.lang.String conferenceSolutionId) {
    this.conferenceSolutionId = conferenceSolutionId;
    return this;
  }

  /**
   * Entry points to the conference. Maximum 300 entry points are allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkupEntryPointMarkup> getEntryPoints() {
    return entryPoints;
  }

  /**
   * Entry points to the conference. Maximum 300 entry points are allowed.
   * @param entryPoints entryPoints or {@code null} for none
   */
  public AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkup setEntryPoints(java.util.List<AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkupEntryPointMarkup> entryPoints) {
    this.entryPoints = entryPoints;
    return this;
  }

  /**
   * If set, it means an error occurred during conference creation.
   * @return value or {@code null} for none
   */
  public AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkupError getError() {
    return error;
  }

  /**
   * If set, it means an error occurred during conference creation.
   * @param error error or {@code null} for none
   */
  public AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkup setError(AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkupError error) {
    this.error = error;
    return this;
  }

  /**
   * Additional notes (such as instructions from the administrator, legal notices) to display to the
   * user. Can contain HTML. Max length 2048 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getNote() {
    return note;
  }

  /**
   * Additional notes (such as instructions from the administrator, legal notices) to display to the
   * user. Can contain HTML. Max length 2048 characters.
   * @param note note or {@code null} for none
   */
  public AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkup setNote(java.lang.String note) {
    this.note = note;
    return this;
  }

  /**
   * Additional add-on parameters. Maximum 300 parameters are allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkupParameter> getParameters() {
    return parameters;
  }

  /**
   * Additional add-on parameters. Maximum 300 parameters are allowed.
   * @param parameters parameters or {@code null} for none
   */
  public AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkup setParameters(java.util.List<AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkupParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkup set(String fieldName, Object value) {
    return (AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkup) super.set(fieldName, value);
  }

  @Override
  public AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkup clone() {
    return (AppsExtensionsMarkupCalendarClientActionMarkupConferenceDataMarkup) super.clone();
  }

}
