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
 * Model definition for SlsaProvenance.
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
public final class SlsaProvenance extends com.google.api.client.json.GenericJson {

  /**
   * required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SlsaBuilder builder;

  /**
   * The collection of artifacts that influenced the build including sources, dependencies, build
   * tools, base images, and so on. This is considered to be incomplete unless
   * metadata.completeness.materials is true. Unset or null is equivalent to empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Material> materials;

  static {
    // hack to force ProGuard to consider Material used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Material.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SlsaMetadata metadata;

  /**
   * Identifies the configuration used for the build. When combined with materials, this SHOULD
   * fully describe the build, such that re-running this recipe results in bit-for-bit identical
   * output (if the build is reproducible). required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SlsaRecipe recipe;

  /**
   * required
   * @return value or {@code null} for none
   */
  public SlsaBuilder getBuilder() {
    return builder;
  }

  /**
   * required
   * @param builder builder or {@code null} for none
   */
  public SlsaProvenance setBuilder(SlsaBuilder builder) {
    this.builder = builder;
    return this;
  }

  /**
   * The collection of artifacts that influenced the build including sources, dependencies, build
   * tools, base images, and so on. This is considered to be incomplete unless
   * metadata.completeness.materials is true. Unset or null is equivalent to empty.
   * @return value or {@code null} for none
   */
  public java.util.List<Material> getMaterials() {
    return materials;
  }

  /**
   * The collection of artifacts that influenced the build including sources, dependencies, build
   * tools, base images, and so on. This is considered to be incomplete unless
   * metadata.completeness.materials is true. Unset or null is equivalent to empty.
   * @param materials materials or {@code null} for none
   */
  public SlsaProvenance setMaterials(java.util.List<Material> materials) {
    this.materials = materials;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public SlsaMetadata getMetadata() {
    return metadata;
  }

  /**
   * @param metadata metadata or {@code null} for none
   */
  public SlsaProvenance setMetadata(SlsaMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Identifies the configuration used for the build. When combined with materials, this SHOULD
   * fully describe the build, such that re-running this recipe results in bit-for-bit identical
   * output (if the build is reproducible). required
   * @return value or {@code null} for none
   */
  public SlsaRecipe getRecipe() {
    return recipe;
  }

  /**
   * Identifies the configuration used for the build. When combined with materials, this SHOULD
   * fully describe the build, such that re-running this recipe results in bit-for-bit identical
   * output (if the build is reproducible). required
   * @param recipe recipe or {@code null} for none
   */
  public SlsaProvenance setRecipe(SlsaRecipe recipe) {
    this.recipe = recipe;
    return this;
  }

  @Override
  public SlsaProvenance set(String fieldName, Object value) {
    return (SlsaProvenance) super.set(fieldName, value);
  }

  @Override
  public SlsaProvenance clone() {
    return (SlsaProvenance) super.clone();
  }

}
