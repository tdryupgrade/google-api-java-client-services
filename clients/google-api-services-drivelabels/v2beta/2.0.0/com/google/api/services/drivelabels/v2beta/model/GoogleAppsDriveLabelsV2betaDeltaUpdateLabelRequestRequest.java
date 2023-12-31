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

package com.google.api.services.drivelabels.v2beta.model;

/**
 * A single kind of update to apply to a Label.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Labels API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest extends com.google.api.client.json.GenericJson {

  /**
   * Creates a new Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateFieldRequest createField;

  /**
   * Creates Choice within a Selection field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateSelectionChoiceRequest createSelectionChoice;

  /**
   * Deletes a Field from the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteFieldRequest deleteField;

  /**
   * Delete a Choice within a Selection Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteSelectionChoiceRequest deleteSelectionChoice;

  /**
   * Disables the Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableFieldRequest disableField;

  /**
   * Disable a Choice within a Selection Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableSelectionChoiceRequest disableSelectionChoice;

  /**
   * Enables the Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestEnableFieldRequest enableField;

  /**
   * Enable a Choice within a Selection Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestEnableSelectionChoiceRequest enableSelectionChoice;

  /**
   * Updates basic properties of a Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldPropertiesRequest updateField;

  /**
   * Update Field type and/or type options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldTypeRequest updateFieldType;

  /**
   * Updates the Label properties.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateLabelPropertiesRequest updateLabel;

  /**
   * Update a Choice properties within a Selection Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest updateSelectionChoiceProperties;

  /**
   * Creates a new Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateFieldRequest getCreateField() {
    return createField;
  }

  /**
   * Creates a new Field.
   * @param createField createField or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest setCreateField(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateFieldRequest createField) {
    this.createField = createField;
    return this;
  }

  /**
   * Creates Choice within a Selection field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateSelectionChoiceRequest getCreateSelectionChoice() {
    return createSelectionChoice;
  }

  /**
   * Creates Choice within a Selection field.
   * @param createSelectionChoice createSelectionChoice or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest setCreateSelectionChoice(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestCreateSelectionChoiceRequest createSelectionChoice) {
    this.createSelectionChoice = createSelectionChoice;
    return this;
  }

  /**
   * Deletes a Field from the label.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteFieldRequest getDeleteField() {
    return deleteField;
  }

  /**
   * Deletes a Field from the label.
   * @param deleteField deleteField or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest setDeleteField(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteFieldRequest deleteField) {
    this.deleteField = deleteField;
    return this;
  }

  /**
   * Delete a Choice within a Selection Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteSelectionChoiceRequest getDeleteSelectionChoice() {
    return deleteSelectionChoice;
  }

  /**
   * Delete a Choice within a Selection Field.
   * @param deleteSelectionChoice deleteSelectionChoice or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest setDeleteSelectionChoice(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteSelectionChoiceRequest deleteSelectionChoice) {
    this.deleteSelectionChoice = deleteSelectionChoice;
    return this;
  }

  /**
   * Disables the Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableFieldRequest getDisableField() {
    return disableField;
  }

  /**
   * Disables the Field.
   * @param disableField disableField or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest setDisableField(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableFieldRequest disableField) {
    this.disableField = disableField;
    return this;
  }

  /**
   * Disable a Choice within a Selection Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableSelectionChoiceRequest getDisableSelectionChoice() {
    return disableSelectionChoice;
  }

  /**
   * Disable a Choice within a Selection Field.
   * @param disableSelectionChoice disableSelectionChoice or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest setDisableSelectionChoice(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDisableSelectionChoiceRequest disableSelectionChoice) {
    this.disableSelectionChoice = disableSelectionChoice;
    return this;
  }

  /**
   * Enables the Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestEnableFieldRequest getEnableField() {
    return enableField;
  }

  /**
   * Enables the Field.
   * @param enableField enableField or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest setEnableField(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestEnableFieldRequest enableField) {
    this.enableField = enableField;
    return this;
  }

  /**
   * Enable a Choice within a Selection Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestEnableSelectionChoiceRequest getEnableSelectionChoice() {
    return enableSelectionChoice;
  }

  /**
   * Enable a Choice within a Selection Field.
   * @param enableSelectionChoice enableSelectionChoice or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest setEnableSelectionChoice(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestEnableSelectionChoiceRequest enableSelectionChoice) {
    this.enableSelectionChoice = enableSelectionChoice;
    return this;
  }

  /**
   * Updates basic properties of a Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldPropertiesRequest getUpdateField() {
    return updateField;
  }

  /**
   * Updates basic properties of a Field.
   * @param updateField updateField or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest setUpdateField(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldPropertiesRequest updateField) {
    this.updateField = updateField;
    return this;
  }

  /**
   * Update Field type and/or type options.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldTypeRequest getUpdateFieldType() {
    return updateFieldType;
  }

  /**
   * Update Field type and/or type options.
   * @param updateFieldType updateFieldType or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest setUpdateFieldType(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateFieldTypeRequest updateFieldType) {
    this.updateFieldType = updateFieldType;
    return this;
  }

  /**
   * Updates the Label properties.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateLabelPropertiesRequest getUpdateLabel() {
    return updateLabel;
  }

  /**
   * Updates the Label properties.
   * @param updateLabel updateLabel or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest setUpdateLabel(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateLabelPropertiesRequest updateLabel) {
    this.updateLabel = updateLabel;
    return this;
  }

  /**
   * Update a Choice properties within a Selection Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest getUpdateSelectionChoiceProperties() {
    return updateSelectionChoiceProperties;
  }

  /**
   * Update a Choice properties within a Selection Field.
   * @param updateSelectionChoiceProperties updateSelectionChoiceProperties or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest setUpdateSelectionChoiceProperties(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestUpdateSelectionChoicePropertiesRequest updateSelectionChoiceProperties) {
    this.updateSelectionChoiceProperties = updateSelectionChoiceProperties;
    return this;
  }

  @Override
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest set(String fieldName, Object value) {
    return (GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest clone() {
    return (GoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestRequest) super.clone();
  }

}
