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

package com.google.api.services.content.model;

/**
 * Model definition for ReturnaddressCustomBatchResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReturnaddressCustomBatchResponse extends com.google.api.client.json.GenericJson {

  /**
   * The result of the execution of the batch requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReturnaddressCustomBatchResponseEntry> entries;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#returnaddressCustomBatchResponse`".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The result of the execution of the batch requests.
   * @return value or {@code null} for none
   */
  public java.util.List<ReturnaddressCustomBatchResponseEntry> getEntries() {
    return entries;
  }

  /**
   * The result of the execution of the batch requests.
   * @param entries entries or {@code null} for none
   */
  public ReturnaddressCustomBatchResponse setEntries(java.util.List<ReturnaddressCustomBatchResponseEntry> entries) {
    this.entries = entries;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#returnaddressCustomBatchResponse`".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#returnaddressCustomBatchResponse`".
   * @param kind kind or {@code null} for none
   */
  public ReturnaddressCustomBatchResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public ReturnaddressCustomBatchResponse set(String fieldName, Object value) {
    return (ReturnaddressCustomBatchResponse) super.set(fieldName, value);
  }

  @Override
  public ReturnaddressCustomBatchResponse clone() {
    return (ReturnaddressCustomBatchResponse) super.clone();
  }

}
