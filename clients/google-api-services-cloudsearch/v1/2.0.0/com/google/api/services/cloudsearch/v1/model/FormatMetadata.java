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
 * Annotation metadata for markup formatting
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FormatMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Font color is set if and only if format_type is FONT_COLOR. The components are stored as (alpha
   * << 24) | (red << 16) | (green << 8) | blue. Clients should always set the alpha component to
   * 0xFF. NEXT TAG: 3
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long fontColor;

  /**
   * LINT.ThenChange(//depot/google3/apps/dynamite/v1/web/datakeys/annotated_span.proto)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formatType;

  /**
   * Font color is set if and only if format_type is FONT_COLOR. The components are stored as (alpha
   * << 24) | (red << 16) | (green << 8) | blue. Clients should always set the alpha component to
   * 0xFF. NEXT TAG: 3
   * @return value or {@code null} for none
   */
  public java.lang.Long getFontColor() {
    return fontColor;
  }

  /**
   * Font color is set if and only if format_type is FONT_COLOR. The components are stored as (alpha
   * << 24) | (red << 16) | (green << 8) | blue. Clients should always set the alpha component to
   * 0xFF. NEXT TAG: 3
   * @param fontColor fontColor or {@code null} for none
   */
  public FormatMetadata setFontColor(java.lang.Long fontColor) {
    this.fontColor = fontColor;
    return this;
  }

  /**
   * LINT.ThenChange(//depot/google3/apps/dynamite/v1/web/datakeys/annotated_span.proto)
   * @return value or {@code null} for none
   */
  public java.lang.String getFormatType() {
    return formatType;
  }

  /**
   * LINT.ThenChange(//depot/google3/apps/dynamite/v1/web/datakeys/annotated_span.proto)
   * @param formatType formatType or {@code null} for none
   */
  public FormatMetadata setFormatType(java.lang.String formatType) {
    this.formatType = formatType;
    return this;
  }

  @Override
  public FormatMetadata set(String fieldName, Object value) {
    return (FormatMetadata) super.set(fieldName, value);
  }

  @Override
  public FormatMetadata clone() {
    return (FormatMetadata) super.clone();
  }

}
