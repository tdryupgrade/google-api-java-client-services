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

package com.google.api.services.cloudasset.v1.model;

/**
 * The detailed related resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RelatedResource extends com.google.api.client.json.GenericJson {

  /**
   * The type of the asset. Example: `compute.googleapis.com/Instance`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assetType;

  /**
   * The full resource name of the related resource. Example:
   * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullResourceName;

  /**
   * The type of the asset. Example: `compute.googleapis.com/Instance`
   * @return value or {@code null} for none
   */
  public java.lang.String getAssetType() {
    return assetType;
  }

  /**
   * The type of the asset. Example: `compute.googleapis.com/Instance`
   * @param assetType assetType or {@code null} for none
   */
  public RelatedResource setAssetType(java.lang.String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * The full resource name of the related resource. Example:
   * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
   * @return value or {@code null} for none
   */
  public java.lang.String getFullResourceName() {
    return fullResourceName;
  }

  /**
   * The full resource name of the related resource. Example:
   * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
   * @param fullResourceName fullResourceName or {@code null} for none
   */
  public RelatedResource setFullResourceName(java.lang.String fullResourceName) {
    this.fullResourceName = fullResourceName;
    return this;
  }

  @Override
  public RelatedResource set(String fieldName, Object value) {
    return (RelatedResource) super.set(fieldName, value);
  }

  @Override
  public RelatedResource clone() {
    return (RelatedResource) super.clone();
  }

}
