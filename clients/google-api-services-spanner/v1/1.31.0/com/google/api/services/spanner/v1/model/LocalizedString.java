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

package com.google.api.services.spanner.v1.model;

/**
 * A message representing a user-facing string whose value may need to be translated before being
 * displayed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LocalizedString extends com.google.api.client.json.GenericJson {

  /**
   * A map of arguments used when creating the localized message. Keys represent parameter names
   * which may be used by the localized version when substituting dynamic values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> args;

  /**
   * The canonical English version of this message. If no token is provided or the front-end has no
   * message associated with the token, this text will be displayed as-is.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * The token identifying the message, e.g. 'METRIC_READ_CPU'. This should be unique within the
   * service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String token;

  /**
   * A map of arguments used when creating the localized message. Keys represent parameter names
   * which may be used by the localized version when substituting dynamic values.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getArgs() {
    return args;
  }

  /**
   * A map of arguments used when creating the localized message. Keys represent parameter names
   * which may be used by the localized version when substituting dynamic values.
   * @param args args or {@code null} for none
   */
  public LocalizedString setArgs(java.util.Map<String, java.lang.String> args) {
    this.args = args;
    return this;
  }

  /**
   * The canonical English version of this message. If no token is provided or the front-end has no
   * message associated with the token, this text will be displayed as-is.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * The canonical English version of this message. If no token is provided or the front-end has no
   * message associated with the token, this text will be displayed as-is.
   * @param message message or {@code null} for none
   */
  public LocalizedString setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * The token identifying the message, e.g. 'METRIC_READ_CPU'. This should be unique within the
   * service.
   * @return value or {@code null} for none
   */
  public java.lang.String getToken() {
    return token;
  }

  /**
   * The token identifying the message, e.g. 'METRIC_READ_CPU'. This should be unique within the
   * service.
   * @param token token or {@code null} for none
   */
  public LocalizedString setToken(java.lang.String token) {
    this.token = token;
    return this;
  }

  @Override
  public LocalizedString set(String fieldName, Object value) {
    return (LocalizedString) super.set(fieldName, value);
  }

  @Override
  public LocalizedString clone() {
    return (LocalizedString) super.clone();
  }

}
