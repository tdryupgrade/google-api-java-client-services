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

package com.google.api.services.datacatalog.v1beta1.model;

/**
 * Specification for vertex model resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1VertexModelSpec extends com.google.api.client.json.GenericJson {

  /**
   * URI of the Docker image to be used as the custom container for serving predictions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerImageUri;

  /**
   * User provided version aliases so that a model version can be referenced via alias
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> versionAliases;

  /**
   * The description of this version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionDescription;

  /**
   * The version ID of the model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionId;

  /**
   * Source of a Vertex model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatacatalogV1VertexModelSourceInfo vertexModelSourceInfo;

  /**
   * URI of the Docker image to be used as the custom container for serving predictions.
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerImageUri() {
    return containerImageUri;
  }

  /**
   * URI of the Docker image to be used as the custom container for serving predictions.
   * @param containerImageUri containerImageUri or {@code null} for none
   */
  public GoogleCloudDatacatalogV1VertexModelSpec setContainerImageUri(java.lang.String containerImageUri) {
    this.containerImageUri = containerImageUri;
    return this;
  }

  /**
   * User provided version aliases so that a model version can be referenced via alias
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getVersionAliases() {
    return versionAliases;
  }

  /**
   * User provided version aliases so that a model version can be referenced via alias
   * @param versionAliases versionAliases or {@code null} for none
   */
  public GoogleCloudDatacatalogV1VertexModelSpec setVersionAliases(java.util.List<java.lang.String> versionAliases) {
    this.versionAliases = versionAliases;
    return this;
  }

  /**
   * The description of this version.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionDescription() {
    return versionDescription;
  }

  /**
   * The description of this version.
   * @param versionDescription versionDescription or {@code null} for none
   */
  public GoogleCloudDatacatalogV1VertexModelSpec setVersionDescription(java.lang.String versionDescription) {
    this.versionDescription = versionDescription;
    return this;
  }

  /**
   * The version ID of the model.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionId() {
    return versionId;
  }

  /**
   * The version ID of the model.
   * @param versionId versionId or {@code null} for none
   */
  public GoogleCloudDatacatalogV1VertexModelSpec setVersionId(java.lang.String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Source of a Vertex model.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatacatalogV1VertexModelSourceInfo getVertexModelSourceInfo() {
    return vertexModelSourceInfo;
  }

  /**
   * Source of a Vertex model.
   * @param vertexModelSourceInfo vertexModelSourceInfo or {@code null} for none
   */
  public GoogleCloudDatacatalogV1VertexModelSpec setVertexModelSourceInfo(GoogleCloudDatacatalogV1VertexModelSourceInfo vertexModelSourceInfo) {
    this.vertexModelSourceInfo = vertexModelSourceInfo;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1VertexModelSpec set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1VertexModelSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1VertexModelSpec clone() {
    return (GoogleCloudDatacatalogV1VertexModelSpec) super.clone();
  }

}
