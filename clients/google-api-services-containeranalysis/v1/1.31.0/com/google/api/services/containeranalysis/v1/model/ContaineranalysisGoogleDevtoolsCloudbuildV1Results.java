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
 * Artifacts created by the build pipeline.
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
public final class ContaineranalysisGoogleDevtoolsCloudbuildV1Results extends com.google.api.client.json.GenericJson {

  /**
   * Path to the artifact manifest. Only populated when artifacts are uploaded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String artifactManifest;

  /**
   * Time to push all non-container artifacts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan artifactTiming;

  /**
   * List of build step digests, in the order corresponding to build step indices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> buildStepImages;

  /**
   * List of build step outputs, produced by builder images, in the order corresponding to build
   * step indices. [Cloud Builders](https://cloud.google.com/cloud-build/docs/cloud-builders) can
   * produce this output by writing to `$BUILDER_OUTPUT/output`. Only the first 4KB of data is
   * stored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> buildStepOutputs;

  /**
   * Container images that were built as a part of the build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage> images;

  static {
    // hack to force ProGuard to consider ContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage.class);
  }

  /**
   * Number of artifacts uploaded. Only populated when artifacts are uploaded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numArtifacts;

  /**
   * Path to the artifact manifest. Only populated when artifacts are uploaded.
   * @return value or {@code null} for none
   */
  public java.lang.String getArtifactManifest() {
    return artifactManifest;
  }

  /**
   * Path to the artifact manifest. Only populated when artifacts are uploaded.
   * @param artifactManifest artifactManifest or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results setArtifactManifest(java.lang.String artifactManifest) {
    this.artifactManifest = artifactManifest;
    return this;
  }

  /**
   * Time to push all non-container artifacts.
   * @return value or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan getArtifactTiming() {
    return artifactTiming;
  }

  /**
   * Time to push all non-container artifacts.
   * @param artifactTiming artifactTiming or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results setArtifactTiming(ContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan artifactTiming) {
    this.artifactTiming = artifactTiming;
    return this;
  }

  /**
   * List of build step digests, in the order corresponding to build step indices.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBuildStepImages() {
    return buildStepImages;
  }

  /**
   * List of build step digests, in the order corresponding to build step indices.
   * @param buildStepImages buildStepImages or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results setBuildStepImages(java.util.List<java.lang.String> buildStepImages) {
    this.buildStepImages = buildStepImages;
    return this;
  }

  /**
   * List of build step outputs, produced by builder images, in the order corresponding to build
   * step indices. [Cloud Builders](https://cloud.google.com/cloud-build/docs/cloud-builders) can
   * produce this output by writing to `$BUILDER_OUTPUT/output`. Only the first 4KB of data is
   * stored.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBuildStepOutputs() {
    return buildStepOutputs;
  }

  /**
   * List of build step outputs, produced by builder images, in the order corresponding to build
   * step indices. [Cloud Builders](https://cloud.google.com/cloud-build/docs/cloud-builders) can
   * produce this output by writing to `$BUILDER_OUTPUT/output`. Only the first 4KB of data is
   * stored.
   * @param buildStepOutputs buildStepOutputs or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results setBuildStepOutputs(java.util.List<java.lang.String> buildStepOutputs) {
    this.buildStepOutputs = buildStepOutputs;
    return this;
  }

  /**
   * Container images that were built as a part of the build.
   * @return value or {@code null} for none
   */
  public java.util.List<ContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage> getImages() {
    return images;
  }

  /**
   * Container images that were built as a part of the build.
   * @param images images or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results setImages(java.util.List<ContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage> images) {
    this.images = images;
    return this;
  }

  /**
   * Number of artifacts uploaded. Only populated when artifacts are uploaded.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumArtifacts() {
    return numArtifacts;
  }

  /**
   * Number of artifacts uploaded. Only populated when artifacts are uploaded.
   * @param numArtifacts numArtifacts or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results setNumArtifacts(java.lang.Long numArtifacts) {
    this.numArtifacts = numArtifacts;
    return this;
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results set(String fieldName, Object value) {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1Results) super.set(fieldName, value);
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1Results clone() {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1Results) super.clone();
  }

}
