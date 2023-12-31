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
 * Model definition for RunDetails.
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
public final class RunDetails extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProvenanceBuilder builder;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceDescriptor> byproducts;

  static {
    // hack to force ProGuard to consider ResourceDescriptor used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ResourceDescriptor.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildMetadata metadata;

  /**
   * @return value or {@code null} for none
   */
  public ProvenanceBuilder getBuilder() {
    return builder;
  }

  /**
   * @param builder builder or {@code null} for none
   */
  public RunDetails setBuilder(ProvenanceBuilder builder) {
    this.builder = builder;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceDescriptor> getByproducts() {
    return byproducts;
  }

  /**
   * @param byproducts byproducts or {@code null} for none
   */
  public RunDetails setByproducts(java.util.List<ResourceDescriptor> byproducts) {
    this.byproducts = byproducts;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public BuildMetadata getMetadata() {
    return metadata;
  }

  /**
   * @param metadata metadata or {@code null} for none
   */
  public RunDetails setMetadata(BuildMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  @Override
  public RunDetails set(String fieldName, Object value) {
    return (RunDetails) super.set(fieldName, value);
  }

  @Override
  public RunDetails clone() {
    return (RunDetails) super.clone();
  }

}
