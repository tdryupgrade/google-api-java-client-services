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

package com.google.api.services.videointelligence.v1p2beta1.model;

/**
 * Explicit content annotation (based on per-frame visual signals only). If no explicit content has
 * been detected in a frame, no annotations are present for that frame.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * All video frames where explicit content was detected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame> frames;

  /**
   * Feature version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * All video frames where explicit content was detected.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame> getFrames() {
    return frames;
  }

  /**
   * All video frames where explicit content was detected.
   * @param frames frames or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation setFrames(java.util.List<GoogleCloudVideointelligenceV1p3beta1ExplicitContentFrame> frames) {
    this.frames = frames;
    return this;
  }

  /**
   * Feature version.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Feature version.
   * @param version version or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation clone() {
    return (GoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation) super.clone();
  }

}
