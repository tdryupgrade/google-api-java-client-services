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

package com.google.api.services.directory.model;

/**
 * JSON response template for List Schema operation in Directory API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Schemas extends com.google.api.client.json.GenericJson {

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Kind of resource this is.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A list of UserSchema objects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Schema> schemas;

  static {
    // hack to force ProGuard to consider Schema used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Schema.class);
  }

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public Schemas setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Kind of resource this is.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind of resource this is.
   * @param kind kind or {@code null} for none
   */
  public Schemas setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A list of UserSchema objects.
   * @return value or {@code null} for none
   */
  public java.util.List<Schema> getSchemas() {
    return schemas;
  }

  /**
   * A list of UserSchema objects.
   * @param schemas schemas or {@code null} for none
   */
  public Schemas setSchemas(java.util.List<Schema> schemas) {
    this.schemas = schemas;
    return this;
  }

  @Override
  public Schemas set(String fieldName, Object value) {
    return (Schemas) super.set(fieldName, value);
  }

  @Override
  public Schemas clone() {
    return (Schemas) super.clone();
  }

}
