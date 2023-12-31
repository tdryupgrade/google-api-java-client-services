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
 * A single response from an update.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Labels API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse extends com.google.api.client.json.GenericJson {

  /**
   * Creates a new Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseCreateFieldResponse createField;

  /**
   * Creates a new selection list option to add to a Selection Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseCreateSelectionChoiceResponse createSelectionChoice;

  /**
   * Deletes a Field from the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDeleteFieldResponse deleteField;

  /**
   * Deletes a Choice from a Selection Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDeleteSelectionChoiceResponse deleteSelectionChoice;

  /**
   * Disables Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDisableFieldResponse disableField;

  /**
   * Disables a Choice within a Selection Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDisableSelectionChoiceResponse disableSelectionChoice;

  /**
   * Enables Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseEnableFieldResponse enableField;

  /**
   * Enables a Choice within a Selection Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseEnableSelectionChoiceResponse enableSelectionChoice;

  /**
   * Updates basic properties of a Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateFieldPropertiesResponse updateField;

  /**
   * Update Field type and/or type options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateFieldTypeResponse updateFieldType;

  /**
   * Updated basic properties of a Label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateLabelPropertiesResponse updateLabel;

  /**
   * Updates a Choice within a Selection Field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateSelectionChoicePropertiesResponse updateSelectionChoiceProperties;

  /**
   * Creates a new Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseCreateFieldResponse getCreateField() {
    return createField;
  }

  /**
   * Creates a new Field.
   * @param createField createField or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse setCreateField(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseCreateFieldResponse createField) {
    this.createField = createField;
    return this;
  }

  /**
   * Creates a new selection list option to add to a Selection Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseCreateSelectionChoiceResponse getCreateSelectionChoice() {
    return createSelectionChoice;
  }

  /**
   * Creates a new selection list option to add to a Selection Field.
   * @param createSelectionChoice createSelectionChoice or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse setCreateSelectionChoice(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseCreateSelectionChoiceResponse createSelectionChoice) {
    this.createSelectionChoice = createSelectionChoice;
    return this;
  }

  /**
   * Deletes a Field from the label.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDeleteFieldResponse getDeleteField() {
    return deleteField;
  }

  /**
   * Deletes a Field from the label.
   * @param deleteField deleteField or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse setDeleteField(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDeleteFieldResponse deleteField) {
    this.deleteField = deleteField;
    return this;
  }

  /**
   * Deletes a Choice from a Selection Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDeleteSelectionChoiceResponse getDeleteSelectionChoice() {
    return deleteSelectionChoice;
  }

  /**
   * Deletes a Choice from a Selection Field.
   * @param deleteSelectionChoice deleteSelectionChoice or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse setDeleteSelectionChoice(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDeleteSelectionChoiceResponse deleteSelectionChoice) {
    this.deleteSelectionChoice = deleteSelectionChoice;
    return this;
  }

  /**
   * Disables Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDisableFieldResponse getDisableField() {
    return disableField;
  }

  /**
   * Disables Field.
   * @param disableField disableField or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse setDisableField(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDisableFieldResponse disableField) {
    this.disableField = disableField;
    return this;
  }

  /**
   * Disables a Choice within a Selection Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDisableSelectionChoiceResponse getDisableSelectionChoice() {
    return disableSelectionChoice;
  }

  /**
   * Disables a Choice within a Selection Field.
   * @param disableSelectionChoice disableSelectionChoice or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse setDisableSelectionChoice(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseDisableSelectionChoiceResponse disableSelectionChoice) {
    this.disableSelectionChoice = disableSelectionChoice;
    return this;
  }

  /**
   * Enables Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseEnableFieldResponse getEnableField() {
    return enableField;
  }

  /**
   * Enables Field.
   * @param enableField enableField or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse setEnableField(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseEnableFieldResponse enableField) {
    this.enableField = enableField;
    return this;
  }

  /**
   * Enables a Choice within a Selection Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseEnableSelectionChoiceResponse getEnableSelectionChoice() {
    return enableSelectionChoice;
  }

  /**
   * Enables a Choice within a Selection Field.
   * @param enableSelectionChoice enableSelectionChoice or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse setEnableSelectionChoice(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseEnableSelectionChoiceResponse enableSelectionChoice) {
    this.enableSelectionChoice = enableSelectionChoice;
    return this;
  }

  /**
   * Updates basic properties of a Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateFieldPropertiesResponse getUpdateField() {
    return updateField;
  }

  /**
   * Updates basic properties of a Field.
   * @param updateField updateField or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse setUpdateField(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateFieldPropertiesResponse updateField) {
    this.updateField = updateField;
    return this;
  }

  /**
   * Update Field type and/or type options.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateFieldTypeResponse getUpdateFieldType() {
    return updateFieldType;
  }

  /**
   * Update Field type and/or type options.
   * @param updateFieldType updateFieldType or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse setUpdateFieldType(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateFieldTypeResponse updateFieldType) {
    this.updateFieldType = updateFieldType;
    return this;
  }

  /**
   * Updated basic properties of a Label.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateLabelPropertiesResponse getUpdateLabel() {
    return updateLabel;
  }

  /**
   * Updated basic properties of a Label.
   * @param updateLabel updateLabel or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse setUpdateLabel(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateLabelPropertiesResponse updateLabel) {
    this.updateLabel = updateLabel;
    return this;
  }

  /**
   * Updates a Choice within a Selection Field.
   * @return value or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateSelectionChoicePropertiesResponse getUpdateSelectionChoiceProperties() {
    return updateSelectionChoiceProperties;
  }

  /**
   * Updates a Choice within a Selection Field.
   * @param updateSelectionChoiceProperties updateSelectionChoiceProperties or {@code null} for none
   */
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse setUpdateSelectionChoiceProperties(GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseUpdateSelectionChoicePropertiesResponse updateSelectionChoiceProperties) {
    this.updateSelectionChoiceProperties = updateSelectionChoiceProperties;
    return this;
  }

  @Override
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse set(String fieldName, Object value) {
    return (GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse clone() {
    return (GoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse) super.clone();
  }

}
