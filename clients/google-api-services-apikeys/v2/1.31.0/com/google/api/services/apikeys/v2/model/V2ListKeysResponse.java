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

package com.google.api.services.apikeys.v2.model;

/**
 * Response message for `ListKeys` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API Keys API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class V2ListKeysResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of API keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<V2Key> keys;

  static {
    // hack to force ProGuard to consider V2Key used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(V2Key.class);
  }

  /**
   * The pagination token for the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of API keys.
   * @return value or {@code null} for none
   */
  public java.util.List<V2Key> getKeys() {
    return keys;
  }

  /**
   * A list of API keys.
   * @param keys keys or {@code null} for none
   */
  public V2ListKeysResponse setKeys(java.util.List<V2Key> keys) {
    this.keys = keys;
    return this;
  }

  /**
   * The pagination token for the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The pagination token for the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public V2ListKeysResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public V2ListKeysResponse set(String fieldName, Object value) {
    return (V2ListKeysResponse) super.set(fieldName, value);
  }

  @Override
  public V2ListKeysResponse clone() {
    return (V2ListKeysResponse) super.clone();
  }

}
