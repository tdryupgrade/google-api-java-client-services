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
 * A mask that indicates which of the fields on the base EmbeddedObjectBorder have been changed in
 * this suggestion. For any field set to true, there's a new suggested value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EmbeddedObjectBorderSuggestionState extends com.google.api.client.json.GenericJson {

  /**
   * Indicates if there was a suggested change to color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean colorSuggested;

  /**
   * Indicates if there was a suggested change to dash_style.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dashStyleSuggested;

  /**
   * Indicates if there was a suggested change to property_state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean propertyStateSuggested;

  /**
   * Indicates if there was a suggested change to width.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean widthSuggested;

  /**
   * Indicates if there was a suggested change to color.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getColorSuggested() {
    return colorSuggested;
  }

  /**
   * Indicates if there was a suggested change to color.
   * @param colorSuggested colorSuggested or {@code null} for none
   */
  public EmbeddedObjectBorderSuggestionState setColorSuggested(java.lang.Boolean colorSuggested) {
    this.colorSuggested = colorSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to dash_style.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDashStyleSuggested() {
    return dashStyleSuggested;
  }

  /**
   * Indicates if there was a suggested change to dash_style.
   * @param dashStyleSuggested dashStyleSuggested or {@code null} for none
   */
  public EmbeddedObjectBorderSuggestionState setDashStyleSuggested(java.lang.Boolean dashStyleSuggested) {
    this.dashStyleSuggested = dashStyleSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to property_state.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPropertyStateSuggested() {
    return propertyStateSuggested;
  }

  /**
   * Indicates if there was a suggested change to property_state.
   * @param propertyStateSuggested propertyStateSuggested or {@code null} for none
   */
  public EmbeddedObjectBorderSuggestionState setPropertyStateSuggested(java.lang.Boolean propertyStateSuggested) {
    this.propertyStateSuggested = propertyStateSuggested;
    return this;
  }

  /**
   * Indicates if there was a suggested change to width.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWidthSuggested() {
    return widthSuggested;
  }

  /**
   * Indicates if there was a suggested change to width.
   * @param widthSuggested widthSuggested or {@code null} for none
   */
  public EmbeddedObjectBorderSuggestionState setWidthSuggested(java.lang.Boolean widthSuggested) {
    this.widthSuggested = widthSuggested;
    return this;
  }

  @Override
  public EmbeddedObjectBorderSuggestionState set(String fieldName, Object value) {
    return (EmbeddedObjectBorderSuggestionState) super.set(fieldName, value);
  }

  @Override
  public EmbeddedObjectBorderSuggestionState clone() {
    return (EmbeddedObjectBorderSuggestionState) super.clone();
  }

}
