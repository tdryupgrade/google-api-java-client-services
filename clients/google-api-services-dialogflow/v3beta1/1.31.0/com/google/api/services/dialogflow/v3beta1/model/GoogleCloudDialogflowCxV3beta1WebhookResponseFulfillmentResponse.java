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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Represents a fulfillment response to the user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse extends com.google.api.client.json.GenericJson {

  /**
   * Merge behavior for `messages`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mergeBehavior;

  /**
   * The list of rich message responses to present to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3beta1ResponseMessage> messages;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowCxV3beta1ResponseMessage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowCxV3beta1ResponseMessage.class);
  }

  /**
   * Merge behavior for `messages`.
   * @return value or {@code null} for none
   */
  public java.lang.String getMergeBehavior() {
    return mergeBehavior;
  }

  /**
   * Merge behavior for `messages`.
   * @param mergeBehavior mergeBehavior or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse setMergeBehavior(java.lang.String mergeBehavior) {
    this.mergeBehavior = mergeBehavior;
    return this;
  }

  /**
   * The list of rich message responses to present to the user.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3beta1ResponseMessage> getMessages() {
    return messages;
  }

  /**
   * The list of rich message responses to present to the user.
   * @param messages messages or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse setMessages(java.util.List<GoogleCloudDialogflowCxV3beta1ResponseMessage> messages) {
    this.messages = messages;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse clone() {
    return (GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse) super.clone();
  }

}
