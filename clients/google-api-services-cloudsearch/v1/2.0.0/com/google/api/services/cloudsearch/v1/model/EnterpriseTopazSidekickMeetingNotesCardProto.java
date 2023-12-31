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
 * Information about the meeting notes created.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnterpriseTopazSidekickMeetingNotesCardProto extends com.google.api.client.json.GenericJson {

  /**
   * The event to request meeting notes creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseTopazSidekickAgendaEntry event;

  /**
   * Google Drive ID (a.k.a. resource ID) of the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileId;

  /**
   * Title we want to show for meeting notes in the answer card
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * New URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The event to request meeting notes creation.
   * @return value or {@code null} for none
   */
  public EnterpriseTopazSidekickAgendaEntry getEvent() {
    return event;
  }

  /**
   * The event to request meeting notes creation.
   * @param event event or {@code null} for none
   */
  public EnterpriseTopazSidekickMeetingNotesCardProto setEvent(EnterpriseTopazSidekickAgendaEntry event) {
    this.event = event;
    return this;
  }

  /**
   * Google Drive ID (a.k.a. resource ID) of the file.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileId() {
    return fileId;
  }

  /**
   * Google Drive ID (a.k.a. resource ID) of the file.
   * @param fileId fileId or {@code null} for none
   */
  public EnterpriseTopazSidekickMeetingNotesCardProto setFileId(java.lang.String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * Title we want to show for meeting notes in the answer card
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title we want to show for meeting notes in the answer card
   * @param title title or {@code null} for none
   */
  public EnterpriseTopazSidekickMeetingNotesCardProto setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * New URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * New URL.
   * @param url url or {@code null} for none
   */
  public EnterpriseTopazSidekickMeetingNotesCardProto setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public EnterpriseTopazSidekickMeetingNotesCardProto set(String fieldName, Object value) {
    return (EnterpriseTopazSidekickMeetingNotesCardProto) super.set(fieldName, value);
  }

  @Override
  public EnterpriseTopazSidekickMeetingNotesCardProto clone() {
    return (EnterpriseTopazSidekickMeetingNotesCardProto) super.clone();
  }

}
