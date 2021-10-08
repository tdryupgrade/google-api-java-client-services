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

package com.google.api.services.dialogflow.v3.model;

/**
 * Represents an example that the agent is trained on.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1IntentTrainingPhrase extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The unique identifier of this training phrase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The ordered list of training phrase parts. The parts are concatenated in order to
   * form the training phrase. Note: The API does not automatically annotate training phrases like
   * the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so
   * the training phrase is well formatted when the parts are concatenated. If the training phrase
   * does not need to be annotated with parameters, you just need a single part with only the
   * Part.text field set. If you want to annotate the training phrase, you must create multiple
   * parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to
   * a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that
   * you want to annotate, and the `entity_type`, `alias`, and `user_defined` fields are all set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart> parts;

  /**
   * Optional. Indicates how many times this example was added to the intent. Each time a developer
   * adds an existing sample by editing an intent or training, this counter is increased.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timesAddedCount;

  /**
   * Required. The type of the training phrase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. The unique identifier of this training phrase.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The unique identifier of this training phrase.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentTrainingPhrase setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The ordered list of training phrase parts. The parts are concatenated in order to
   * form the training phrase. Note: The API does not automatically annotate training phrases like
   * the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so
   * the training phrase is well formatted when the parts are concatenated. If the training phrase
   * does not need to be annotated with parameters, you just need a single part with only the
   * Part.text field set. If you want to annotate the training phrase, you must create multiple
   * parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to
   * a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that
   * you want to annotate, and the `entity_type`, `alias`, and `user_defined` fields are all set.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart> getParts() {
    return parts;
  }

  /**
   * Required. The ordered list of training phrase parts. The parts are concatenated in order to
   * form the training phrase. Note: The API does not automatically annotate training phrases like
   * the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so
   * the training phrase is well formatted when the parts are concatenated. If the training phrase
   * does not need to be annotated with parameters, you just need a single part with only the
   * Part.text field set. If you want to annotate the training phrase, you must create multiple
   * parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to
   * a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that
   * you want to annotate, and the `entity_type`, `alias`, and `user_defined` fields are all set.
   * @param parts parts or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentTrainingPhrase setParts(java.util.List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart> parts) {
    this.parts = parts;
    return this;
  }

  /**
   * Optional. Indicates how many times this example was added to the intent. Each time a developer
   * adds an existing sample by editing an intent or training, this counter is increased.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimesAddedCount() {
    return timesAddedCount;
  }

  /**
   * Optional. Indicates how many times this example was added to the intent. Each time a developer
   * adds an existing sample by editing an intent or training, this counter is increased.
   * @param timesAddedCount timesAddedCount or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentTrainingPhrase setTimesAddedCount(java.lang.Integer timesAddedCount) {
    this.timesAddedCount = timesAddedCount;
    return this;
  }

  /**
   * Required. The type of the training phrase.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The type of the training phrase.
   * @param type type or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentTrainingPhrase setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentTrainingPhrase set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1IntentTrainingPhrase) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentTrainingPhrase clone() {
    return (GoogleCloudDialogflowV2beta1IntentTrainingPhrase) super.clone();
  }

}
