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

package com.google.api.services.translate.v3.model;

/**
 * The request message for synchronous romanization.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Translation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RomanizeTextRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The content of the input in string format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> contents;

  /**
   * Optional. The ISO-639 language code of the input text if known, for example, "hi" or "zh". If
   * the source language isn't specified, the API attempts to identify the source language
   * automatically and returns the source language for each content in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceLanguageCode;

  /**
   * Required. The content of the input in string format.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getContents() {
    return contents;
  }

  /**
   * Required. The content of the input in string format.
   * @param contents contents or {@code null} for none
   */
  public RomanizeTextRequest setContents(java.util.List<java.lang.String> contents) {
    this.contents = contents;
    return this;
  }

  /**
   * Optional. The ISO-639 language code of the input text if known, for example, "hi" or "zh". If
   * the source language isn't specified, the API attempts to identify the source language
   * automatically and returns the source language for each content in the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceLanguageCode() {
    return sourceLanguageCode;
  }

  /**
   * Optional. The ISO-639 language code of the input text if known, for example, "hi" or "zh". If
   * the source language isn't specified, the API attempts to identify the source language
   * automatically and returns the source language for each content in the response.
   * @param sourceLanguageCode sourceLanguageCode or {@code null} for none
   */
  public RomanizeTextRequest setSourceLanguageCode(java.lang.String sourceLanguageCode) {
    this.sourceLanguageCode = sourceLanguageCode;
    return this;
  }

  @Override
  public RomanizeTextRequest set(String fieldName, Object value) {
    return (RomanizeTextRequest) super.set(fieldName, value);
  }

  @Override
  public RomanizeTextRequest clone() {
    return (RomanizeTextRequest) super.clone();
  }

}
