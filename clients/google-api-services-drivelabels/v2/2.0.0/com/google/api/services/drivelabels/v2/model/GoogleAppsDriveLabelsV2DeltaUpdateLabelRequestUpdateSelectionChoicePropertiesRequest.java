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
 * Request to update a Choice properties.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Labels API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The Selection Field to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fieldId;

  /**
   * Required. The Choice to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Required. The Choice properties to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceProperties properties;

  /**
   * The fields that should be updated. At least one field must be specified. The root `properties`
   * is implied and should not be specified. A single `*` can be used as short-hand for updating
   * every field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * Required. The Selection Field to update.
   * @return value or {@code null} for none
   */
  public java.lang.String getFieldId() {
    return fieldId;
  }

  /**
   * Required. The Selection Field to update.
   * @param fieldId fieldId or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest setFieldId(java.lang.String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * Required. The Choice to update.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Required. The Choice to update.
   * @param id id or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Required. The Choice properties to update.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceProperties getProperties() {
    return properties;
  }

  /**
   * Required. The Choice properties to update.
   * @param properties properties or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest setProperties(GoogleAppsDriveLabelsV2FieldSelectionOptionsChoiceProperties properties) {
    this.properties = properties;
    return this;
  }

  /**
   * The fields that should be updated. At least one field must be specified. The root `properties`
   * is implied and should not be specified. A single `*` can be used as short-hand for updating
   * every field.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * The fields that should be updated. At least one field must be specified. The root `properties`
   * is implied and should not be specified. A single `*` can be used as short-hand for updating
   * every field.
   * @param updateMask updateMask or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest set(String fieldName, Object value) {
    return (GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest clone() {
    return (GoogleAppsDriveLabelsV2DeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest) super.clone();
  }

}
