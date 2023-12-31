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
 * Response to find meeting time among a set of people.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnterpriseTopazSidekickFindMeetingTimeCardProto extends com.google.api.client.json.GenericJson {

  /**
   * Slots when all attendees have availability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseTopazSidekickTimeSlot> commonAvailableTimeSlots;

  /**
   * Invitees to the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseTopazSidekickPerson> invitees;

  /**
   * Requester.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseTopazSidekickPerson requester;

  /**
   * Details about the scheduled meeting, if one exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseTopazSidekickScheduledMeeting scheduledMeeting;

  /**
   * Invitees that have been skipped in the computation, most likely because they are groups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseTopazSidekickPerson> skippedInvitees;

  /**
   * Min and max timestamp used to find a common available timeslot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseTopazSidekickTimeSlot timeBoundaries;

  /**
   * Timezone ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timezoneId;

  /**
   * Slots when all attendees have availability.
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseTopazSidekickTimeSlot> getCommonAvailableTimeSlots() {
    return commonAvailableTimeSlots;
  }

  /**
   * Slots when all attendees have availability.
   * @param commonAvailableTimeSlots commonAvailableTimeSlots or {@code null} for none
   */
  public EnterpriseTopazSidekickFindMeetingTimeCardProto setCommonAvailableTimeSlots(java.util.List<EnterpriseTopazSidekickTimeSlot> commonAvailableTimeSlots) {
    this.commonAvailableTimeSlots = commonAvailableTimeSlots;
    return this;
  }

  /**
   * Invitees to the event.
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseTopazSidekickPerson> getInvitees() {
    return invitees;
  }

  /**
   * Invitees to the event.
   * @param invitees invitees or {@code null} for none
   */
  public EnterpriseTopazSidekickFindMeetingTimeCardProto setInvitees(java.util.List<EnterpriseTopazSidekickPerson> invitees) {
    this.invitees = invitees;
    return this;
  }

  /**
   * Requester.
   * @return value or {@code null} for none
   */
  public EnterpriseTopazSidekickPerson getRequester() {
    return requester;
  }

  /**
   * Requester.
   * @param requester requester or {@code null} for none
   */
  public EnterpriseTopazSidekickFindMeetingTimeCardProto setRequester(EnterpriseTopazSidekickPerson requester) {
    this.requester = requester;
    return this;
  }

  /**
   * Details about the scheduled meeting, if one exists.
   * @return value or {@code null} for none
   */
  public EnterpriseTopazSidekickScheduledMeeting getScheduledMeeting() {
    return scheduledMeeting;
  }

  /**
   * Details about the scheduled meeting, if one exists.
   * @param scheduledMeeting scheduledMeeting or {@code null} for none
   */
  public EnterpriseTopazSidekickFindMeetingTimeCardProto setScheduledMeeting(EnterpriseTopazSidekickScheduledMeeting scheduledMeeting) {
    this.scheduledMeeting = scheduledMeeting;
    return this;
  }

  /**
   * Invitees that have been skipped in the computation, most likely because they are groups.
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseTopazSidekickPerson> getSkippedInvitees() {
    return skippedInvitees;
  }

  /**
   * Invitees that have been skipped in the computation, most likely because they are groups.
   * @param skippedInvitees skippedInvitees or {@code null} for none
   */
  public EnterpriseTopazSidekickFindMeetingTimeCardProto setSkippedInvitees(java.util.List<EnterpriseTopazSidekickPerson> skippedInvitees) {
    this.skippedInvitees = skippedInvitees;
    return this;
  }

  /**
   * Min and max timestamp used to find a common available timeslot.
   * @return value or {@code null} for none
   */
  public EnterpriseTopazSidekickTimeSlot getTimeBoundaries() {
    return timeBoundaries;
  }

  /**
   * Min and max timestamp used to find a common available timeslot.
   * @param timeBoundaries timeBoundaries or {@code null} for none
   */
  public EnterpriseTopazSidekickFindMeetingTimeCardProto setTimeBoundaries(EnterpriseTopazSidekickTimeSlot timeBoundaries) {
    this.timeBoundaries = timeBoundaries;
    return this;
  }

  /**
   * Timezone ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimezoneId() {
    return timezoneId;
  }

  /**
   * Timezone ID.
   * @param timezoneId timezoneId or {@code null} for none
   */
  public EnterpriseTopazSidekickFindMeetingTimeCardProto setTimezoneId(java.lang.String timezoneId) {
    this.timezoneId = timezoneId;
    return this;
  }

  @Override
  public EnterpriseTopazSidekickFindMeetingTimeCardProto set(String fieldName, Object value) {
    return (EnterpriseTopazSidekickFindMeetingTimeCardProto) super.set(fieldName, value);
  }

  @Override
  public EnterpriseTopazSidekickFindMeetingTimeCardProto clone() {
    return (EnterpriseTopazSidekickFindMeetingTimeCardProto) super.clone();
  }

}
