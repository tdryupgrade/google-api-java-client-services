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
 * Represents both long and short phone number that can be called or texted. Short telephone numbers
 * are used to reach local services. Short numbers and their purpose differ from country to country.
 * These numbers in US are in the form of N11 which is a three-digit abbreviated dialing telephone
 * number.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VoicePhoneNumber extends com.google.api.client.json.GenericJson {

  /**
   * E.164 formatted full phone number with leading +. This field also represents encoded form of
   * short telephone numbers in E.164 format. e.g. "911" is encoded as "+1911".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String e164;

  /**
   * Additional data that could be added using the libphonenumber API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VoicePhoneNumberI18nData i18nData;

  /**
   * E.164 formatted full phone number with leading +. This field also represents encoded form of
   * short telephone numbers in E.164 format. e.g. "911" is encoded as "+1911".
   * @return value or {@code null} for none
   */
  public java.lang.String getE164() {
    return e164;
  }

  /**
   * E.164 formatted full phone number with leading +. This field also represents encoded form of
   * short telephone numbers in E.164 format. e.g. "911" is encoded as "+1911".
   * @param e164 e164 or {@code null} for none
   */
  public VoicePhoneNumber setE164(java.lang.String e164) {
    this.e164 = e164;
    return this;
  }

  /**
   * Additional data that could be added using the libphonenumber API.
   * @return value or {@code null} for none
   */
  public VoicePhoneNumberI18nData getI18nData() {
    return i18nData;
  }

  /**
   * Additional data that could be added using the libphonenumber API.
   * @param i18nData i18nData or {@code null} for none
   */
  public VoicePhoneNumber setI18nData(VoicePhoneNumberI18nData i18nData) {
    this.i18nData = i18nData;
    return this;
  }

  @Override
  public VoicePhoneNumber set(String fieldName, Object value) {
    return (VoicePhoneNumber) super.set(fieldName, value);
  }

  @Override
  public VoicePhoneNumber clone() {
    return (VoicePhoneNumber) super.clone();
  }

}
