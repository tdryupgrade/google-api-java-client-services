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

package com.google.api.services.androidpublisher.model;

/**
 * Localized text in given language.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LocalizedText extends com.google.api.client.json.GenericJson {

  /**
   * Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * The text in the given language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German).
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German).
   * @param language language or {@code null} for none
   */
  public LocalizedText setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * The text in the given language.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * The text in the given language.
   * @param text text or {@code null} for none
   */
  public LocalizedText setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public LocalizedText set(String fieldName, Object value) {
    return (LocalizedText) super.set(fieldName, value);
  }

  @Override
  public LocalizedText clone() {
    return (LocalizedText) super.clone();
  }

}
