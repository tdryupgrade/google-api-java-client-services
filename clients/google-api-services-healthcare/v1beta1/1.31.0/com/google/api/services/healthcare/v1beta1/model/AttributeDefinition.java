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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * A client-defined consent attribute.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AttributeDefinition extends com.google.api.client.json.GenericJson {

  /**
   * Required. Possible values for the attribute. The number of allowed values must not exceed 100.
   * An empty list is invalid. The list can only be expanded after creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedValues;

  /**
   * Required. The category of the attribute. The value of this field cannot be changed after
   * creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * Optional. Default values of the attribute in Consents. If no default values are specified, it
   * defaults to an empty value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> consentDefaultValues;

  /**
   * Optional. Default value of the attribute in User data mappings. If no default value is
   * specified, it defaults to an empty value. This field is only applicable to attributes of the
   * category `RESOURCE`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataMappingDefaultValue;

  /**
   * Optional. A description of the attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{locati
   * on_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_d
   * efinition_id}`. Cannot be changed after creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Possible values for the attribute. The number of allowed values must not exceed 100.
   * An empty list is invalid. The list can only be expanded after creation.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedValues() {
    return allowedValues;
  }

  /**
   * Required. Possible values for the attribute. The number of allowed values must not exceed 100.
   * An empty list is invalid. The list can only be expanded after creation.
   * @param allowedValues allowedValues or {@code null} for none
   */
  public AttributeDefinition setAllowedValues(java.util.List<java.lang.String> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  /**
   * Required. The category of the attribute. The value of this field cannot be changed after
   * creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * Required. The category of the attribute. The value of this field cannot be changed after
   * creation.
   * @param category category or {@code null} for none
   */
  public AttributeDefinition setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * Optional. Default values of the attribute in Consents. If no default values are specified, it
   * defaults to an empty value.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getConsentDefaultValues() {
    return consentDefaultValues;
  }

  /**
   * Optional. Default values of the attribute in Consents. If no default values are specified, it
   * defaults to an empty value.
   * @param consentDefaultValues consentDefaultValues or {@code null} for none
   */
  public AttributeDefinition setConsentDefaultValues(java.util.List<java.lang.String> consentDefaultValues) {
    this.consentDefaultValues = consentDefaultValues;
    return this;
  }

  /**
   * Optional. Default value of the attribute in User data mappings. If no default value is
   * specified, it defaults to an empty value. This field is only applicable to attributes of the
   * category `RESOURCE`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataMappingDefaultValue() {
    return dataMappingDefaultValue;
  }

  /**
   * Optional. Default value of the attribute in User data mappings. If no default value is
   * specified, it defaults to an empty value. This field is only applicable to attributes of the
   * category `RESOURCE`.
   * @param dataMappingDefaultValue dataMappingDefaultValue or {@code null} for none
   */
  public AttributeDefinition setDataMappingDefaultValue(java.lang.String dataMappingDefaultValue) {
    this.dataMappingDefaultValue = dataMappingDefaultValue;
    return this;
  }

  /**
   * Optional. A description of the attribute.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A description of the attribute.
   * @param description description or {@code null} for none
   */
  public AttributeDefinition setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{locati
   * on_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_d
   * efinition_id}`. Cannot be changed after creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{locati
   * on_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_d
   * efinition_id}`. Cannot be changed after creation.
   * @param name name or {@code null} for none
   */
  public AttributeDefinition setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public AttributeDefinition set(String fieldName, Object value) {
    return (AttributeDefinition) super.set(fieldName, value);
  }

  @Override
  public AttributeDefinition clone() {
    return (AttributeDefinition) super.clone();
  }

}
