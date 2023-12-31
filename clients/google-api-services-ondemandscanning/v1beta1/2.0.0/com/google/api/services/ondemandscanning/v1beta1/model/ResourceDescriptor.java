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

package com.google.api.services.ondemandscanning.v1beta1.model;

/**
 * Model definition for ResourceDescriptor.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the On-Demand Scanning API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceDescriptor extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> annotations;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> digest;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String downloadLocation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mediaType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getAnnotations() {
    return annotations;
  }

  /**
   * @param annotations annotations or {@code null} for none
   */
  public ResourceDescriptor setAnnotations(java.util.Map<String, java.lang.Object> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * @see #decodeContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**

   * @see #getContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContent() {
    return com.google.api.client.util.Base64.decodeBase64(content);
  }

  /**
   * @see #encodeContent()
   * @param content content or {@code null} for none
   */
  public ResourceDescriptor setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**

   * @see #setContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ResourceDescriptor encodeContent(byte[] content) {
    this.content = com.google.api.client.util.Base64.encodeBase64URLSafeString(content);
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getDigest() {
    return digest;
  }

  /**
   * @param digest digest or {@code null} for none
   */
  public ResourceDescriptor setDigest(java.util.Map<String, java.lang.String> digest) {
    this.digest = digest;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDownloadLocation() {
    return downloadLocation;
  }

  /**
   * @param downloadLocation downloadLocation or {@code null} for none
   */
  public ResourceDescriptor setDownloadLocation(java.lang.String downloadLocation) {
    this.downloadLocation = downloadLocation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMediaType() {
    return mediaType;
  }

  /**
   * @param mediaType mediaType or {@code null} for none
   */
  public ResourceDescriptor setMediaType(java.lang.String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public ResourceDescriptor setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * @param uri uri or {@code null} for none
   */
  public ResourceDescriptor setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public ResourceDescriptor set(String fieldName, Object value) {
    return (ResourceDescriptor) super.set(fieldName, value);
  }

  @Override
  public ResourceDescriptor clone() {
    return (ResourceDescriptor) super.clone();
  }

}
