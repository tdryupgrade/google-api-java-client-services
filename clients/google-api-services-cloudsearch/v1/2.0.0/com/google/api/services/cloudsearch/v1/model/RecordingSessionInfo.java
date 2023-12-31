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
 * Information about a recording session.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RecordingSessionInfo extends com.google.api.client.json.GenericJson {

  /**
   * Input only. Deprecated field, should not be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ownerEmail;

  /**
   * A unique server-generated ID for the recording session.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recordingSessionId;

  /**
   * Recording session's state information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SessionStateInfo sessionStateInfo;

  /**
   * Input only. Deprecated field, should not be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getOwnerEmail() {
    return ownerEmail;
  }

  /**
   * Input only. Deprecated field, should not be used.
   * @param ownerEmail ownerEmail or {@code null} for none
   */
  public RecordingSessionInfo setOwnerEmail(java.lang.String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }

  /**
   * A unique server-generated ID for the recording session.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecordingSessionId() {
    return recordingSessionId;
  }

  /**
   * A unique server-generated ID for the recording session.
   * @param recordingSessionId recordingSessionId or {@code null} for none
   */
  public RecordingSessionInfo setRecordingSessionId(java.lang.String recordingSessionId) {
    this.recordingSessionId = recordingSessionId;
    return this;
  }

  /**
   * Recording session's state information.
   * @return value or {@code null} for none
   */
  public SessionStateInfo getSessionStateInfo() {
    return sessionStateInfo;
  }

  /**
   * Recording session's state information.
   * @param sessionStateInfo sessionStateInfo or {@code null} for none
   */
  public RecordingSessionInfo setSessionStateInfo(SessionStateInfo sessionStateInfo) {
    this.sessionStateInfo = sessionStateInfo;
    return this;
  }

  @Override
  public RecordingSessionInfo set(String fieldName, Object value) {
    return (RecordingSessionInfo) super.set(fieldName, value);
  }

  @Override
  public RecordingSessionInfo clone() {
    return (RecordingSessionInfo) super.clone();
  }

}
