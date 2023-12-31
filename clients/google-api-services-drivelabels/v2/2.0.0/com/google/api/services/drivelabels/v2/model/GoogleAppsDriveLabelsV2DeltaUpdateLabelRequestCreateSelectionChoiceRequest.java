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

package com.google.api.services.drivelabels.v2.model;

/**
 * Request to create a Selection Choice.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Labels API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestCreateSelectionChoiceRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The Choice to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2FieldSelectionOptionsChoice choice;

  /**
   * Required. The Selection Field in which a Choice will be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fieldId;

  /**
   * Required. The Choice to create.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2FieldSelectionOptionsChoice getChoice() {
    return choice;
  }

  /**
   * Required. The Choice to create.
   * @param choice choice or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestCreateSelectionChoiceRequest setChoice(GoogleAppsDriveLabelsV2FieldSelectionOptionsChoice choice) {
    this.choice = choice;
    return this;
  }

  /**
   * Required. The Selection Field in which a Choice will be created.
   * @return value or {@code null} for none
   */
  public java.lang.String getFieldId() {
    return fieldId;
  }

  /**
   * Required. The Selection Field in which a Choice will be created.
   * @param fieldId fieldId or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestCreateSelectionChoiceRequest setFieldId(java.lang.String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  @Override
  public GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestCreateSelectionChoiceRequest set(String fieldName, Object value) {
    return (GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestCreateSelectionChoiceRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestCreateSelectionChoiceRequest clone() {
    return (GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestCreateSelectionChoiceRequest) super.clone();
  }

}
