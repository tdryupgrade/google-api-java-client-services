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

package com.google.api.services.spanner.v1.model;

/**
 * A message representing a (sparse) collection of KeyRangeInfos for specific key buckets.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IndexedKeyRangeInfos extends com.google.api.client.json.GenericJson {

  /**
   * A (sparse) mapping from key bucket index to the KeyRangeInfos for that key bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, KeyRangeInfos> keyRangeInfos;

  /**
   * A (sparse) mapping from key bucket index to the KeyRangeInfos for that key bucket.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, KeyRangeInfos> getKeyRangeInfos() {
    return keyRangeInfos;
  }

  /**
   * A (sparse) mapping from key bucket index to the KeyRangeInfos for that key bucket.
   * @param keyRangeInfos keyRangeInfos or {@code null} for none
   */
  public IndexedKeyRangeInfos setKeyRangeInfos(java.util.Map<String, KeyRangeInfos> keyRangeInfos) {
    this.keyRangeInfos = keyRangeInfos;
    return this;
  }

  @Override
  public IndexedKeyRangeInfos set(String fieldName, Object value) {
    return (IndexedKeyRangeInfos) super.set(fieldName, value);
  }

  @Override
  public IndexedKeyRangeInfos clone() {
    return (IndexedKeyRangeInfos) super.clone();
  }

}
