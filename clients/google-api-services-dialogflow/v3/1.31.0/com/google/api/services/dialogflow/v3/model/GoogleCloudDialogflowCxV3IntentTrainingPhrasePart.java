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
 * Represents a part of a training phrase.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3IntentTrainingPhrasePart extends com.google.api.client.json.GenericJson {

  /**
   * The parameter used to annotate this part of the training phrase. This field is required for
   * annotated parts of the training phrase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parameterId;

  /**
   * Required. The text for this part.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * The parameter used to annotate this part of the training phrase. This field is required for
   * annotated parts of the training phrase.
   * @return value or {@code null} for none
   */
  public java.lang.String getParameterId() {
    return parameterId;
  }

  /**
   * The parameter used to annotate this part of the training phrase. This field is required for
   * annotated parts of the training phrase.
   * @param parameterId parameterId or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3IntentTrainingPhrasePart setParameterId(java.lang.String parameterId) {
    this.parameterId = parameterId;
    return this;
  }

  /**
   * Required. The text for this part.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Required. The text for this part.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3IntentTrainingPhrasePart setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3IntentTrainingPhrasePart set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3IntentTrainingPhrasePart) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3IntentTrainingPhrasePart clone() {
    return (GoogleCloudDialogflowCxV3IntentTrainingPhrasePart) super.clone();
  }

}
