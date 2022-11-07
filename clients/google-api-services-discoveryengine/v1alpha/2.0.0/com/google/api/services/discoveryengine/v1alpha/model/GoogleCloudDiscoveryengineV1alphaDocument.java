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

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * Document captures all raw metadata information of items to be recommended or searched.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaDocument extends com.google.api.client.json.GenericJson {

  /**
   * Immutable. The identifier of the document. Id should conform to
   * [RFC-1034](https://tools.ietf.org/html/rfc1034) standard with a length limit of 63 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The JSON string representation of the document. It should conform to the registered schema or
   * an INVALID_ARGUMENT error is thrown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jsonData;

  /**
   * Immutable. The full resource name of the document. Format: `projects/{project}/locations/{locat
   * ion}/dataStores/{data_store}/branches/{branch}/documents/{document_id}`. This field must be a
   * UTF-8 encoded string with a length limit of 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The identifier of the parent document. Currently supports at most two level document hierarchy.
   * Id should conform to [RFC-1034](https://tools.ietf.org/html/rfc1034) standard with a length
   * limit of 63 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentDocumentId;

  /**
   * Required. The identifier of the schema located in the same data store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schemaId;

  /**
   * The structured JSON data for the document. It should conform to the registered schema or an
   * INVALID_ARGUMENT error is thrown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> structData;

  /**
   * Immutable. The identifier of the document. Id should conform to
   * [RFC-1034](https://tools.ietf.org/html/rfc1034) standard with a length limit of 63 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Immutable. The identifier of the document. Id should conform to
   * [RFC-1034](https://tools.ietf.org/html/rfc1034) standard with a length limit of 63 characters.
   * @param id id or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaDocument setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The JSON string representation of the document. It should conform to the registered schema or
   * an INVALID_ARGUMENT error is thrown.
   * @return value or {@code null} for none
   */
  public java.lang.String getJsonData() {
    return jsonData;
  }

  /**
   * The JSON string representation of the document. It should conform to the registered schema or
   * an INVALID_ARGUMENT error is thrown.
   * @param jsonData jsonData or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaDocument setJsonData(java.lang.String jsonData) {
    this.jsonData = jsonData;
    return this;
  }

  /**
   * Immutable. The full resource name of the document. Format: `projects/{project}/locations/{locat
   * ion}/dataStores/{data_store}/branches/{branch}/documents/{document_id}`. This field must be a
   * UTF-8 encoded string with a length limit of 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The full resource name of the document. Format: `projects/{project}/locations/{locat
   * ion}/dataStores/{data_store}/branches/{branch}/documents/{document_id}`. This field must be a
   * UTF-8 encoded string with a length limit of 1024 characters.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaDocument setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The identifier of the parent document. Currently supports at most two level document hierarchy.
   * Id should conform to [RFC-1034](https://tools.ietf.org/html/rfc1034) standard with a length
   * limit of 63 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentDocumentId() {
    return parentDocumentId;
  }

  /**
   * The identifier of the parent document. Currently supports at most two level document hierarchy.
   * Id should conform to [RFC-1034](https://tools.ietf.org/html/rfc1034) standard with a length
   * limit of 63 characters.
   * @param parentDocumentId parentDocumentId or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaDocument setParentDocumentId(java.lang.String parentDocumentId) {
    this.parentDocumentId = parentDocumentId;
    return this;
  }

  /**
   * Required. The identifier of the schema located in the same data store.
   * @return value or {@code null} for none
   */
  public java.lang.String getSchemaId() {
    return schemaId;
  }

  /**
   * Required. The identifier of the schema located in the same data store.
   * @param schemaId schemaId or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaDocument setSchemaId(java.lang.String schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  /**
   * The structured JSON data for the document. It should conform to the registered schema or an
   * INVALID_ARGUMENT error is thrown.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getStructData() {
    return structData;
  }

  /**
   * The structured JSON data for the document. It should conform to the registered schema or an
   * INVALID_ARGUMENT error is thrown.
   * @param structData structData or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaDocument setStructData(java.util.Map<String, java.lang.Object> structData) {
    this.structData = structData;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaDocument set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaDocument) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaDocument clone() {
    return (GoogleCloudDiscoveryengineV1alphaDocument) super.clone();
  }

}