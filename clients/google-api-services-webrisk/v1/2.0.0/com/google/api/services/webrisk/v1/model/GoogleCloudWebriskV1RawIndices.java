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

package com.google.api.services.webrisk.v1.model;

/**
 * A set of raw indices to remove from a local list.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Web Risk API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudWebriskV1RawIndices extends com.google.api.client.json.GenericJson {

  /**
   * The indices to remove from a lexicographically-sorted local list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> indices;

  /**
   * The indices to remove from a lexicographically-sorted local list.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getIndices() {
    return indices;
  }

  /**
   * The indices to remove from a lexicographically-sorted local list.
   * @param indices indices or {@code null} for none
   */
  public GoogleCloudWebriskV1RawIndices setIndices(java.util.List<java.lang.Integer> indices) {
    this.indices = indices;
    return this;
  }

  @Override
  public GoogleCloudWebriskV1RawIndices set(String fieldName, Object value) {
    return (GoogleCloudWebriskV1RawIndices) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudWebriskV1RawIndices clone() {
    return (GoogleCloudWebriskV1RawIndices) super.clone();
  }

}
