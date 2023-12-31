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
 * Model definition for DomainAliases.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DomainAliases extends com.google.api.client.json.GenericJson {

  /**
   * A list of domain alias objects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DomainAlias> domainAliases;

  static {
    // hack to force ProGuard to consider DomainAlias used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DomainAlias.class);
  }

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
   * A list of domain alias objects.
   * @return value or {@code null} for none
   */
  public java.util.List<DomainAlias> getDomainAliases() {
    return domainAliases;
  }

  /**
   * A list of domain alias objects.
   * @param domainAliases domainAliases or {@code null} for none
   */
  public DomainAliases setDomainAliases(java.util.List<DomainAlias> domainAliases) {
    this.domainAliases = domainAliases;
    return this;
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
  public DomainAliases setEtag(java.lang.String etag) {
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
  public DomainAliases setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public DomainAliases set(String fieldName, Object value) {
    return (DomainAliases) super.set(fieldName, value);
  }

  @Override
  public DomainAliases clone() {
    return (DomainAliases) super.clone();
  }

}
