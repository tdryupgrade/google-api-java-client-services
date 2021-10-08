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
 * Column properties for TableCard.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2IntentMessageColumnProperties extends com.google.api.client.json.GenericJson {

  /**
   * Required. Column heading.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String header;

  /**
   * Optional. Defines text alignment for all cells in this column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String horizontalAlignment;

  /**
   * Required. Column heading.
   * @return value or {@code null} for none
   */
  public java.lang.String getHeader() {
    return header;
  }

  /**
   * Required. Column heading.
   * @param header header or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageColumnProperties setHeader(java.lang.String header) {
    this.header = header;
    return this;
  }

  /**
   * Optional. Defines text alignment for all cells in this column.
   * @return value or {@code null} for none
   */
  public java.lang.String getHorizontalAlignment() {
    return horizontalAlignment;
  }

  /**
   * Optional. Defines text alignment for all cells in this column.
   * @param horizontalAlignment horizontalAlignment or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageColumnProperties setHorizontalAlignment(java.lang.String horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageColumnProperties set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2IntentMessageColumnProperties) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageColumnProperties clone() {
    return (GoogleCloudDialogflowV2IntentMessageColumnProperties) super.clone();
  }

}
