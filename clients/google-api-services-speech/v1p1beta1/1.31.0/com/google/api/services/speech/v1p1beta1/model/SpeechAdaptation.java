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

package com.google.api.services.speech.v1p1beta1.model;

/**
 * Speech adaptation configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech-to-Text API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SpeechAdaptation extends com.google.api.client.json.GenericJson {

  /**
   * A collection of custom classes. To specify the classes inline, leave the class' `name` blank
   * and fill in the rest of its fields, giving it a unique `custom_class_id`. Refer to the inline
   * defined class in phrase hints by its `custom_class_id`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomClass> customClasses;

  static {
    // hack to force ProGuard to consider CustomClass used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CustomClass.class);
  }

  /**
   * A collection of phrase set resource names to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> phraseSetReferences;

  /**
   * A collection of phrase sets. To specify the hints inline, leave the phrase set's `name` blank
   * and fill in the rest of its fields. Any phrase set can use any custom class.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PhraseSet> phraseSets;

  static {
    // hack to force ProGuard to consider PhraseSet used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PhraseSet.class);
  }

  /**
   * A collection of custom classes. To specify the classes inline, leave the class' `name` blank
   * and fill in the rest of its fields, giving it a unique `custom_class_id`. Refer to the inline
   * defined class in phrase hints by its `custom_class_id`.
   * @return value or {@code null} for none
   */
  public java.util.List<CustomClass> getCustomClasses() {
    return customClasses;
  }

  /**
   * A collection of custom classes. To specify the classes inline, leave the class' `name` blank
   * and fill in the rest of its fields, giving it a unique `custom_class_id`. Refer to the inline
   * defined class in phrase hints by its `custom_class_id`.
   * @param customClasses customClasses or {@code null} for none
   */
  public SpeechAdaptation setCustomClasses(java.util.List<CustomClass> customClasses) {
    this.customClasses = customClasses;
    return this;
  }

  /**
   * A collection of phrase set resource names to use.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPhraseSetReferences() {
    return phraseSetReferences;
  }

  /**
   * A collection of phrase set resource names to use.
   * @param phraseSetReferences phraseSetReferences or {@code null} for none
   */
  public SpeechAdaptation setPhraseSetReferences(java.util.List<java.lang.String> phraseSetReferences) {
    this.phraseSetReferences = phraseSetReferences;
    return this;
  }

  /**
   * A collection of phrase sets. To specify the hints inline, leave the phrase set's `name` blank
   * and fill in the rest of its fields. Any phrase set can use any custom class.
   * @return value or {@code null} for none
   */
  public java.util.List<PhraseSet> getPhraseSets() {
    return phraseSets;
  }

  /**
   * A collection of phrase sets. To specify the hints inline, leave the phrase set's `name` blank
   * and fill in the rest of its fields. Any phrase set can use any custom class.
   * @param phraseSets phraseSets or {@code null} for none
   */
  public SpeechAdaptation setPhraseSets(java.util.List<PhraseSet> phraseSets) {
    this.phraseSets = phraseSets;
    return this;
  }

  @Override
  public SpeechAdaptation set(String fieldName, Object value) {
    return (SpeechAdaptation) super.set(fieldName, value);
  }

  @Override
  public SpeechAdaptation clone() {
    return (SpeechAdaptation) super.clone();
  }

}
