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

package com.google.api.services.networkservices.v1.model;

/**
 * The specification for modifying HTTP header in HTTP request and HTTP response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpRouteHeaderModifier extends com.google.api.client.json.GenericJson {

  /**
   * Add the headers with given map where key is the name of the header, value is the value of the
   * header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> add;

  /**
   * Remove headers (matching by header names) specified in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> remove;

  /**
   * Completely overwrite/replace the headers with given map where key is the name of the header,
   * value is the value of the header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> set;

  /**
   * Add the headers with given map where key is the name of the header, value is the value of the
   * header.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAdd() {
    return add;
  }

  /**
   * Add the headers with given map where key is the name of the header, value is the value of the
   * header.
   * @param add add or {@code null} for none
   */
  public HttpRouteHeaderModifier setAdd(java.util.Map<String, java.lang.String> add) {
    this.add = add;
    return this;
  }

  /**
   * Remove headers (matching by header names) specified in the list.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRemove() {
    return remove;
  }

  /**
   * Remove headers (matching by header names) specified in the list.
   * @param remove remove or {@code null} for none
   */
  public HttpRouteHeaderModifier setRemove(java.util.List<java.lang.String> remove) {
    this.remove = remove;
    return this;
  }

  /**
   * Completely overwrite/replace the headers with given map where key is the name of the header,
   * value is the value of the header.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getSet() {
    return set;
  }

  /**
   * Completely overwrite/replace the headers with given map where key is the name of the header,
   * value is the value of the header.
   * @param set set or {@code null} for none
   */
  public HttpRouteHeaderModifier setSet(java.util.Map<String, java.lang.String> set) {
    this.set = set;
    return this;
  }

  @Override
  public HttpRouteHeaderModifier set(String fieldName, Object value) {
    return (HttpRouteHeaderModifier) super.set(fieldName, value);
  }

  @Override
  public HttpRouteHeaderModifier clone() {
    return (HttpRouteHeaderModifier) super.clone();
  }

}
