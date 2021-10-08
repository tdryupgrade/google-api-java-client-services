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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * Indicates that the conversation should be handed off to a human agent. Dialogflow only uses this
 * to determine which conversations were handed off to a human agent for measurement purposes. What
 * else to do with this signal is up to you and your handoff procedures. You may set this, for
 * example: * In the entry fulfillment of a CX Page if entering the page indicates something went
 * extremely wrong in the conversation. * In a webhook response when you determine that the customer
 * issue can only be handled by a human.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1ResponseMessageLiveAgentHandoff extends com.google.api.client.json.GenericJson {

  /**
   * Custom metadata for your handoff procedure. Dialogflow doesn't impose any structure on this.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> metadata;

  /**
   * Custom metadata for your handoff procedure. Dialogflow doesn't impose any structure on this.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getMetadata() {
    return metadata;
  }

  /**
   * Custom metadata for your handoff procedure. Dialogflow doesn't impose any structure on this.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1ResponseMessageLiveAgentHandoff setMetadata(java.util.Map<String, java.lang.Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1ResponseMessageLiveAgentHandoff set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1ResponseMessageLiveAgentHandoff) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1ResponseMessageLiveAgentHandoff clone() {
    return (GoogleCloudDialogflowV2beta1ResponseMessageLiveAgentHandoff) super.clone();
  }

}
