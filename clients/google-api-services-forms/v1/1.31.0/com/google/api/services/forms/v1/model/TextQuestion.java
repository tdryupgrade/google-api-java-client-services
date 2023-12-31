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

package com.google.api.services.forms.v1.model;

/**
 * A text-based question.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Forms API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TextQuestion extends com.google.api.client.json.GenericJson {

  /**
   * Whether the question is a paragraph question or not. If not, the question is a short text
   * question.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean paragraph;

  /**
   * Whether the question is a paragraph question or not. If not, the question is a short text
   * question.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getParagraph() {
    return paragraph;
  }

  /**
   * Whether the question is a paragraph question or not. If not, the question is a short text
   * question.
   * @param paragraph paragraph or {@code null} for none
   */
  public TextQuestion setParagraph(java.lang.Boolean paragraph) {
    this.paragraph = paragraph;
    return this;
  }

  @Override
  public TextQuestion set(String fieldName, Object value) {
    return (TextQuestion) super.set(fieldName, value);
  }

  @Override
  public TextQuestion clone() {
    return (TextQuestion) super.clone();
  }

}
