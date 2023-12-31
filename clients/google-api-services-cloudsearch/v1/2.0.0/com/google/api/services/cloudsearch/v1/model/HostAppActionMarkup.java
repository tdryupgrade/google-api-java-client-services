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
 * Actions handled by individual host apps.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HostAppActionMarkup extends com.google.api.client.json.GenericJson {

  /**
   * Actions handled by Calendar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CalendarClientActionMarkup calendarAction;

  /**
   * Actions handled by Chat.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChatClientActionMarkup chatAction;

  /**
   * Actions handled by Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveClientActionMarkup driveAction;

  /**
   * Actions handled by Docs, Sheets, or Slides.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EditorClientActionMarkup editorAction;

  /**
   * Actions handled by Gmail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GmailClientActionMarkup gmailAction;

  /**
   * Actions handled by Sheets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SheetsClientActionMarkup sheetsAction;

  /**
   * Actions handled by Calendar.
   * @return value or {@code null} for none
   */
  public CalendarClientActionMarkup getCalendarAction() {
    return calendarAction;
  }

  /**
   * Actions handled by Calendar.
   * @param calendarAction calendarAction or {@code null} for none
   */
  public HostAppActionMarkup setCalendarAction(CalendarClientActionMarkup calendarAction) {
    this.calendarAction = calendarAction;
    return this;
  }

  /**
   * Actions handled by Chat.
   * @return value or {@code null} for none
   */
  public ChatClientActionMarkup getChatAction() {
    return chatAction;
  }

  /**
   * Actions handled by Chat.
   * @param chatAction chatAction or {@code null} for none
   */
  public HostAppActionMarkup setChatAction(ChatClientActionMarkup chatAction) {
    this.chatAction = chatAction;
    return this;
  }

  /**
   * Actions handled by Drive.
   * @return value or {@code null} for none
   */
  public DriveClientActionMarkup getDriveAction() {
    return driveAction;
  }

  /**
   * Actions handled by Drive.
   * @param driveAction driveAction or {@code null} for none
   */
  public HostAppActionMarkup setDriveAction(DriveClientActionMarkup driveAction) {
    this.driveAction = driveAction;
    return this;
  }

  /**
   * Actions handled by Docs, Sheets, or Slides.
   * @return value or {@code null} for none
   */
  public EditorClientActionMarkup getEditorAction() {
    return editorAction;
  }

  /**
   * Actions handled by Docs, Sheets, or Slides.
   * @param editorAction editorAction or {@code null} for none
   */
  public HostAppActionMarkup setEditorAction(EditorClientActionMarkup editorAction) {
    this.editorAction = editorAction;
    return this;
  }

  /**
   * Actions handled by Gmail.
   * @return value or {@code null} for none
   */
  public GmailClientActionMarkup getGmailAction() {
    return gmailAction;
  }

  /**
   * Actions handled by Gmail.
   * @param gmailAction gmailAction or {@code null} for none
   */
  public HostAppActionMarkup setGmailAction(GmailClientActionMarkup gmailAction) {
    this.gmailAction = gmailAction;
    return this;
  }

  /**
   * Actions handled by Sheets.
   * @return value or {@code null} for none
   */
  public SheetsClientActionMarkup getSheetsAction() {
    return sheetsAction;
  }

  /**
   * Actions handled by Sheets.
   * @param sheetsAction sheetsAction or {@code null} for none
   */
  public HostAppActionMarkup setSheetsAction(SheetsClientActionMarkup sheetsAction) {
    this.sheetsAction = sheetsAction;
    return this;
  }

  @Override
  public HostAppActionMarkup set(String fieldName, Object value) {
    return (HostAppActionMarkup) super.set(fieldName, value);
  }

  @Override
  public HostAppActionMarkup clone() {
    return (HostAppActionMarkup) super.clone();
  }

}
