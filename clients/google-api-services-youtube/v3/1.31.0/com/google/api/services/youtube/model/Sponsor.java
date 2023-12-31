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

package com.google.api.services.youtube.model;

/**
 * A `__sponsor__` resource represents a sponsor for a YouTube channel. A sponsor provides recurring
 * monetary support to a creator and receives special benefits.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Sponsor extends com.google.api.client.json.GenericJson {

  /**
   * Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Identifies what kind of resource this is. Value: the fixed string `"youtube#sponsor"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The `snippet` object contains basic details about the sponsor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SponsorSnippet snippet;

  /**
   * Etag of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of this resource.
   * @param etag etag or {@code null} for none
   */
  public Sponsor setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string `"youtube#sponsor"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string `"youtube#sponsor"`.
   * @param kind kind or {@code null} for none
   */
  public Sponsor setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The `snippet` object contains basic details about the sponsor.
   * @return value or {@code null} for none
   */
  public SponsorSnippet getSnippet() {
    return snippet;
  }

  /**
   * The `snippet` object contains basic details about the sponsor.
   * @param snippet snippet or {@code null} for none
   */
  public Sponsor setSnippet(SponsorSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  @Override
  public Sponsor set(String fieldName, Object value) {
    return (Sponsor) super.set(fieldName, value);
  }

  @Override
  public Sponsor clone() {
    return (Sponsor) super.clone();
  }

}
