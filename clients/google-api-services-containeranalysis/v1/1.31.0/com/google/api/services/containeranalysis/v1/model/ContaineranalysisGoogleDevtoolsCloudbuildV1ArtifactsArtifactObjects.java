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

package com.google.api.services.containeranalysis.v1.model;

/**
 * Files in the workspace to upload to Cloud Storage upon successful completion of all build steps.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsArtifactObjects extends com.google.api.client.json.GenericJson {

  /**
   * Cloud Storage bucket and optional object path, in the form "gs://bucket/path/to/somewhere/".
   * (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-
   * naming#requirements)). Files in the workspace matching any path pattern will be uploaded to
   * Cloud Storage with this location as a prefix.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Path globs used to match files in the build's workspace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> paths;

  /**
   * Output only. Stores timing information for pushing all artifact objects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan timing;

  /**
   * Cloud Storage bucket and optional object path, in the form "gs://bucket/path/to/somewhere/".
   * (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-
   * naming#requirements)). Files in the workspace matching any path pattern will be uploaded to
   * Cloud Storage with this location as a prefix.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Cloud Storage bucket and optional object path, in the form "gs://bucket/path/to/somewhere/".
   * (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-
   * naming#requirements)). Files in the workspace matching any path pattern will be uploaded to
   * Cloud Storage with this location as a prefix.
   * @param location location or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsArtifactObjects setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Path globs used to match files in the build's workspace.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPaths() {
    return paths;
  }

  /**
   * Path globs used to match files in the build's workspace.
   * @param paths paths or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsArtifactObjects setPaths(java.util.List<java.lang.String> paths) {
    this.paths = paths;
    return this;
  }

  /**
   * Output only. Stores timing information for pushing all artifact objects.
   * @return value or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan getTiming() {
    return timing;
  }

  /**
   * Output only. Stores timing information for pushing all artifact objects.
   * @param timing timing or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsArtifactObjects setTiming(ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan timing) {
    this.timing = timing;
    return this;
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsArtifactObjects set(String fieldName, Object value) {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsArtifactObjects) super.set(fieldName, value);
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsArtifactObjects clone() {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1ArtifactsArtifactObjects) super.clone();
  }

}
