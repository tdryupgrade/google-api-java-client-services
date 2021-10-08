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

package com.google.api.services.dialogflow.v3.model;

/**
 * An **entity entry** for an associated entity type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2EntityTypeEntity extends com.google.api.client.json.GenericJson {

  /**
   * Required. A collection of value synonyms. For example, if the entity type is *vegetable*, and
   * `value` is *scallions*, a synonym could be *green onions*. For `KIND_LIST` entity types: * This
   * collection must contain exactly one synonym equal to `value`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> synonyms;

  /**
   * Required. The primary value associated with this entity entry. For example, if the entity type
   * is *vegetable*, the value could be *scallions*. For `KIND_MAP` entity types: * A reference
   * value to be used in place of synonyms. For `KIND_LIST` entity types: * A string that can
   * contain references to other entity types (with or without aliases).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Required. A collection of value synonyms. For example, if the entity type is *vegetable*, and
   * `value` is *scallions*, a synonym could be *green onions*. For `KIND_LIST` entity types: * This
   * collection must contain exactly one synonym equal to `value`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSynonyms() {
    return synonyms;
  }

  /**
   * Required. A collection of value synonyms. For example, if the entity type is *vegetable*, and
   * `value` is *scallions*, a synonym could be *green onions*. For `KIND_LIST` entity types: * This
   * collection must contain exactly one synonym equal to `value`.
   * @param synonyms synonyms or {@code null} for none
   */
  public GoogleCloudDialogflowV2EntityTypeEntity setSynonyms(java.util.List<java.lang.String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  /**
   * Required. The primary value associated with this entity entry. For example, if the entity type
   * is *vegetable*, the value could be *scallions*. For `KIND_MAP` entity types: * A reference
   * value to be used in place of synonyms. For `KIND_LIST` entity types: * A string that can
   * contain references to other entity types (with or without aliases).
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Required. The primary value associated with this entity entry. For example, if the entity type
   * is *vegetable*, the value could be *scallions*. For `KIND_MAP` entity types: * A reference
   * value to be used in place of synonyms. For `KIND_LIST` entity types: * A string that can
   * contain references to other entity types (with or without aliases).
   * @param value value or {@code null} for none
   */
  public GoogleCloudDialogflowV2EntityTypeEntity setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2EntityTypeEntity set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2EntityTypeEntity) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2EntityTypeEntity clone() {
    return (GoogleCloudDialogflowV2EntityTypeEntity) super.clone();
  }

}
