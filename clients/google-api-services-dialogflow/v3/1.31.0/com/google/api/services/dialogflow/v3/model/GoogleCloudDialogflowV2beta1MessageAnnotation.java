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
 * Represents the result of annotation for the message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1MessageAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * Required. Indicates whether the text message contains entities.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean containEntities;

  /**
   * Optional. The collection of annotated message parts ordered by their position in the message.
   * You can recover the annotated message by concatenating [AnnotatedMessagePart.text].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1AnnotatedMessagePart> parts;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2beta1AnnotatedMessagePart used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2beta1AnnotatedMessagePart.class);
  }

  /**
   * Required. Indicates whether the text message contains entities.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getContainEntities() {
    return containEntities;
  }

  /**
   * Required. Indicates whether the text message contains entities.
   * @param containEntities containEntities or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1MessageAnnotation setContainEntities(java.lang.Boolean containEntities) {
    this.containEntities = containEntities;
    return this;
  }

  /**
   * Optional. The collection of annotated message parts ordered by their position in the message.
   * You can recover the annotated message by concatenating [AnnotatedMessagePart.text].
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1AnnotatedMessagePart> getParts() {
    return parts;
  }

  /**
   * Optional. The collection of annotated message parts ordered by their position in the message.
   * You can recover the annotated message by concatenating [AnnotatedMessagePart.text].
   * @param parts parts or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1MessageAnnotation setParts(java.util.List<GoogleCloudDialogflowV2beta1AnnotatedMessagePart> parts) {
    this.parts = parts;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1MessageAnnotation set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1MessageAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1MessageAnnotation clone() {
    return (GoogleCloudDialogflowV2beta1MessageAnnotation) super.clone();
  }

}
