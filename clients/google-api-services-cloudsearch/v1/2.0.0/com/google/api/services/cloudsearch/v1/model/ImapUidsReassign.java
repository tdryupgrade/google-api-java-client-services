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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Model definition for ImapUidsReassign.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImapUidsReassign extends com.google.api.client.json.GenericJson {

  /**
   * Label
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelId;

  /**
   * The message Ids
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.math.BigInteger> messageId;

  /**
   * Label
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelId() {
    return labelId;
  }

  /**
   * Label
   * @param labelId labelId or {@code null} for none
   */
  public ImapUidsReassign setLabelId(java.lang.String labelId) {
    this.labelId = labelId;
    return this;
  }

  /**
   * The message Ids
   * @return value or {@code null} for none
   */
  public java.util.List<java.math.BigInteger> getMessageId() {
    return messageId;
  }

  /**
   * The message Ids
   * @param messageId messageId or {@code null} for none
   */
  public ImapUidsReassign setMessageId(java.util.List<java.math.BigInteger> messageId) {
    this.messageId = messageId;
    return this;
  }

  @Override
  public ImapUidsReassign set(String fieldName, Object value) {
    return (ImapUidsReassign) super.set(fieldName, value);
  }

  @Override
  public ImapUidsReassign clone() {
    return (ImapUidsReassign) super.clone();
  }

}
