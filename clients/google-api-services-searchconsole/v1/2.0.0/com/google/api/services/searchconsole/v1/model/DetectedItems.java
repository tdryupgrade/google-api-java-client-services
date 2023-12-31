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

package com.google.api.services.searchconsole.v1.model;

/**
 * Rich Results items grouped by type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Search Console API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DetectedItems extends com.google.api.client.json.GenericJson {

  /**
   * List of Rich Results items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Item> items;

  /**
   * Rich Results type
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String richResultType;

  /**
   * List of Rich Results items.
   * @return value or {@code null} for none
   */
  public java.util.List<Item> getItems() {
    return items;
  }

  /**
   * List of Rich Results items.
   * @param items items or {@code null} for none
   */
  public DetectedItems setItems(java.util.List<Item> items) {
    this.items = items;
    return this;
  }

  /**
   * Rich Results type
   * @return value or {@code null} for none
   */
  public java.lang.String getRichResultType() {
    return richResultType;
  }

  /**
   * Rich Results type
   * @param richResultType richResultType or {@code null} for none
   */
  public DetectedItems setRichResultType(java.lang.String richResultType) {
    this.richResultType = richResultType;
    return this;
  }

  @Override
  public DetectedItems set(String fieldName, Object value) {
    return (DetectedItems) super.set(fieldName, value);
  }

  @Override
  public DetectedItems clone() {
    return (DetectedItems) super.clone();
  }

}
