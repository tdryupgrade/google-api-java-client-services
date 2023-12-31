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

package com.google.api.services.docs.v1.model;

/**
 * A mask that indicates which of the fields on the base Shading have been changed in this suggested
 * change. For any field set to true, there's a new suggested value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ShadingSuggestionState extends com.google.api.client.json.GenericJson {

  /**
   * Indicates if there was a suggested change to the Shading.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean backgroundColorSuggested;

  /**
   * Indicates if there was a suggested change to the Shading.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBackgroundColorSuggested() {
    return backgroundColorSuggested;
  }

  /**
   * Indicates if there was a suggested change to the Shading.
   * @param backgroundColorSuggested backgroundColorSuggested or {@code null} for none
   */
  public ShadingSuggestionState setBackgroundColorSuggested(java.lang.Boolean backgroundColorSuggested) {
    this.backgroundColorSuggested = backgroundColorSuggested;
    return this;
  }

  @Override
  public ShadingSuggestionState set(String fieldName, Object value) {
    return (ShadingSuggestionState) super.set(fieldName, value);
  }

  @Override
  public ShadingSuggestionState clone() {
    return (ShadingSuggestionState) super.clone();
  }

}
