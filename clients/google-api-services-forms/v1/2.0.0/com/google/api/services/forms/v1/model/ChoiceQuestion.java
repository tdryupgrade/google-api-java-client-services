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
 * A radio/checkbox/dropdown question.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Forms API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChoiceQuestion extends com.google.api.client.json.GenericJson {

  /**
   * Required. List of options that a respondent must choose from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Option> options;

  /**
   * Whether the options should be displayed in random order for different instances of the quiz.
   * This is often used to prevent cheating by respondents who might be looking at another
   * respondent's screen, or to address bias in a survey that might be introduced by always putting
   * the same options first or last.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean shuffle;

  /**
   * Required. The type of choice question.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Required. List of options that a respondent must choose from.
   * @return value or {@code null} for none
   */
  public java.util.List<Option> getOptions() {
    return options;
  }

  /**
   * Required. List of options that a respondent must choose from.
   * @param options options or {@code null} for none
   */
  public ChoiceQuestion setOptions(java.util.List<Option> options) {
    this.options = options;
    return this;
  }

  /**
   * Whether the options should be displayed in random order for different instances of the quiz.
   * This is often used to prevent cheating by respondents who might be looking at another
   * respondent's screen, or to address bias in a survey that might be introduced by always putting
   * the same options first or last.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShuffle() {
    return shuffle;
  }

  /**
   * Whether the options should be displayed in random order for different instances of the quiz.
   * This is often used to prevent cheating by respondents who might be looking at another
   * respondent's screen, or to address bias in a survey that might be introduced by always putting
   * the same options first or last.
   * @param shuffle shuffle or {@code null} for none
   */
  public ChoiceQuestion setShuffle(java.lang.Boolean shuffle) {
    this.shuffle = shuffle;
    return this;
  }

  /**
   * Required. The type of choice question.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The type of choice question.
   * @param type type or {@code null} for none
   */
  public ChoiceQuestion setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ChoiceQuestion set(String fieldName, Object value) {
    return (ChoiceQuestion) super.set(fieldName, value);
  }

  @Override
  public ChoiceQuestion clone() {
    return (ChoiceQuestion) super.clone();
  }

}
