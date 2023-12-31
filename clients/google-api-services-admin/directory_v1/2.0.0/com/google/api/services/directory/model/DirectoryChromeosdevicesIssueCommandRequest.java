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

package com.google.api.services.directory.model;

/**
 * A request for issuing a command.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DirectoryChromeosdevicesIssueCommandRequest extends com.google.api.client.json.GenericJson {

  /**
   * The type of command.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commandType;

  /**
   * The payload for the command, provide it only if command supports it. The following commands
   * support adding payload: * `SET_VOLUME`: Payload is a stringified JSON object in the form: {
   * "volume": 50 }. The volume has to be an integer in the range [0,100]. *
   * `DEVICE_START_CRD_SESSION`: Payload is optionally a stringified JSON object in the form: {
   * "ackedUserPresence": true }. `ackedUserPresence` is a boolean. By default, `ackedUserPresence`
   * is set to `false`. To start a Chrome Remote Desktop session for an active device, set
   * `ackedUserPresence` to `true`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String payload;

  /**
   * The type of command.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommandType() {
    return commandType;
  }

  /**
   * The type of command.
   * @param commandType commandType or {@code null} for none
   */
  public DirectoryChromeosdevicesIssueCommandRequest setCommandType(java.lang.String commandType) {
    this.commandType = commandType;
    return this;
  }

  /**
   * The payload for the command, provide it only if command supports it. The following commands
   * support adding payload: * `SET_VOLUME`: Payload is a stringified JSON object in the form: {
   * "volume": 50 }. The volume has to be an integer in the range [0,100]. *
   * `DEVICE_START_CRD_SESSION`: Payload is optionally a stringified JSON object in the form: {
   * "ackedUserPresence": true }. `ackedUserPresence` is a boolean. By default, `ackedUserPresence`
   * is set to `false`. To start a Chrome Remote Desktop session for an active device, set
   * `ackedUserPresence` to `true`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPayload() {
    return payload;
  }

  /**
   * The payload for the command, provide it only if command supports it. The following commands
   * support adding payload: * `SET_VOLUME`: Payload is a stringified JSON object in the form: {
   * "volume": 50 }. The volume has to be an integer in the range [0,100]. *
   * `DEVICE_START_CRD_SESSION`: Payload is optionally a stringified JSON object in the form: {
   * "ackedUserPresence": true }. `ackedUserPresence` is a boolean. By default, `ackedUserPresence`
   * is set to `false`. To start a Chrome Remote Desktop session for an active device, set
   * `ackedUserPresence` to `true`.
   * @param payload payload or {@code null} for none
   */
  public DirectoryChromeosdevicesIssueCommandRequest setPayload(java.lang.String payload) {
    this.payload = payload;
    return this;
  }

  @Override
  public DirectoryChromeosdevicesIssueCommandRequest set(String fieldName, Object value) {
    return (DirectoryChromeosdevicesIssueCommandRequest) super.set(fieldName, value);
  }

  @Override
  public DirectoryChromeosdevicesIssueCommandRequest clone() {
    return (DirectoryChromeosdevicesIssueCommandRequest) super.clone();
  }

}
