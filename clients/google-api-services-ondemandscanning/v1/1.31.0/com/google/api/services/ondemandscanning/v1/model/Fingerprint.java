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

package com.google.api.services.ondemandscanning.v1.model;

/**
 * A set of properties that uniquely identify a given Docker image.
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
public final class Fingerprint extends com.google.api.client.json.GenericJson {

  /**
   * Required. The layer ID of the final layer in the Docker image's v1 representation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String v1Name;

  /**
   * Required. The ordered list of v2 blobs that represent a given image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> v2Blob;

  /**
   * Output only. The name of the image's v2 blobs computed via: [bottom] := v2_blobbottom :=
   * sha256(v2_blob[N] + " " + v2_name[N+1]) Only the name of the final blob is kept.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String v2Name;

  /**
   * Required. The layer ID of the final layer in the Docker image's v1 representation.
   * @return value or {@code null} for none
   */
  public java.lang.String getV1Name() {
    return v1Name;
  }

  /**
   * Required. The layer ID of the final layer in the Docker image's v1 representation.
   * @param v1Name v1Name or {@code null} for none
   */
  public Fingerprint setV1Name(java.lang.String v1Name) {
    this.v1Name = v1Name;
    return this;
  }

  /**
   * Required. The ordered list of v2 blobs that represent a given image.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getV2Blob() {
    return v2Blob;
  }

  /**
   * Required. The ordered list of v2 blobs that represent a given image.
   * @param v2Blob v2Blob or {@code null} for none
   */
  public Fingerprint setV2Blob(java.util.List<java.lang.String> v2Blob) {
    this.v2Blob = v2Blob;
    return this;
  }

  /**
   * Output only. The name of the image's v2 blobs computed via: [bottom] := v2_blobbottom :=
   * sha256(v2_blob[N] + " " + v2_name[N+1]) Only the name of the final blob is kept.
   * @return value or {@code null} for none
   */
  public java.lang.String getV2Name() {
    return v2Name;
  }

  /**
   * Output only. The name of the image's v2 blobs computed via: [bottom] := v2_blobbottom :=
   * sha256(v2_blob[N] + " " + v2_name[N+1]) Only the name of the final blob is kept.
   * @param v2Name v2Name or {@code null} for none
   */
  public Fingerprint setV2Name(java.lang.String v2Name) {
    this.v2Name = v2Name;
    return this;
  }

  @Override
  public Fingerprint set(String fieldName, Object value) {
    return (Fingerprint) super.set(fieldName, value);
  }

  @Override
  public Fingerprint clone() {
    return (Fingerprint) super.clone();
  }

}
