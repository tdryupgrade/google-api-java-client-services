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
 * Model definition for ImapsyncFolderAttributeFolderMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImapsyncFolderAttributeFolderMessage extends com.google.api.client.json.GenericJson {

  /**
   * Flags of the message. Represents unseen and flagged state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImapsyncFolderAttributeFolderMessageFlags flags;

  /**
   * UID of the message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger uid;

  /**
   * Flags of the message. Represents unseen and flagged state.
   * @return value or {@code null} for none
   */
  public ImapsyncFolderAttributeFolderMessageFlags getFlags() {
    return flags;
  }

  /**
   * Flags of the message. Represents unseen and flagged state.
   * @param flags flags or {@code null} for none
   */
  public ImapsyncFolderAttributeFolderMessage setFlags(ImapsyncFolderAttributeFolderMessageFlags flags) {
    this.flags = flags;
    return this;
  }

  /**
   * UID of the message.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getUid() {
    return uid;
  }

  /**
   * UID of the message.
   * @param uid uid or {@code null} for none
   */
  public ImapsyncFolderAttributeFolderMessage setUid(java.math.BigInteger uid) {
    this.uid = uid;
    return this;
  }

  @Override
  public ImapsyncFolderAttributeFolderMessage set(String fieldName, Object value) {
    return (ImapsyncFolderAttributeFolderMessage) super.set(fieldName, value);
  }

  @Override
  public ImapsyncFolderAttributeFolderMessage clone() {
    return (ImapsyncFolderAttributeFolderMessage) super.clone();
  }

}
