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

package com.google.api.services.privateca.v1beta1.model;

/**
 * The allowed types for [VALUE] in a `[KEY]:[VALUE]` attribute.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleApiServicecontrolV1AttributeValue extends com.google.api.client.json.GenericJson {

  /**
   * A Boolean value represented by `true` or `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean boolValue;

  /**
   * A 64-bit signed integer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long intValue;

  /**
   * A string up to 256 bytes long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleApiServicecontrolV1TruncatableString stringValue;

  /**
   * A Boolean value represented by `true` or `false`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBoolValue() {
    return boolValue;
  }

  /**
   * A Boolean value represented by `true` or `false`.
   * @param boolValue boolValue or {@code null} for none
   */
  public GoogleApiServicecontrolV1AttributeValue setBoolValue(java.lang.Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  /**
   * A 64-bit signed integer.
   * @return value or {@code null} for none
   */
  public java.lang.Long getIntValue() {
    return intValue;
  }

  /**
   * A 64-bit signed integer.
   * @param intValue intValue or {@code null} for none
   */
  public GoogleApiServicecontrolV1AttributeValue setIntValue(java.lang.Long intValue) {
    this.intValue = intValue;
    return this;
  }

  /**
   * A string up to 256 bytes long.
   * @return value or {@code null} for none
   */
  public GoogleApiServicecontrolV1TruncatableString getStringValue() {
    return stringValue;
  }

  /**
   * A string up to 256 bytes long.
   * @param stringValue stringValue or {@code null} for none
   */
  public GoogleApiServicecontrolV1AttributeValue setStringValue(GoogleApiServicecontrolV1TruncatableString stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  @Override
  public GoogleApiServicecontrolV1AttributeValue set(String fieldName, Object value) {
    return (GoogleApiServicecontrolV1AttributeValue) super.set(fieldName, value);
  }

  @Override
  public GoogleApiServicecontrolV1AttributeValue clone() {
    return (GoogleApiServicecontrolV1AttributeValue) super.clone();
  }

}
