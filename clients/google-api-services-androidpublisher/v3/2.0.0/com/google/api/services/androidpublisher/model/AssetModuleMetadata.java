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

package com.google.api.services.androidpublisher.model;

/**
 * Metadata of an asset module.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssetModuleMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Indicates the delivery type for persistent install.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deliveryType;

  /**
   * Module name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Indicates the delivery type for persistent install.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeliveryType() {
    return deliveryType;
  }

  /**
   * Indicates the delivery type for persistent install.
   * @param deliveryType deliveryType or {@code null} for none
   */
  public AssetModuleMetadata setDeliveryType(java.lang.String deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

  /**
   * Module name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Module name.
   * @param name name or {@code null} for none
   */
  public AssetModuleMetadata setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public AssetModuleMetadata set(String fieldName, Object value) {
    return (AssetModuleMetadata) super.set(fieldName, value);
  }

  @Override
  public AssetModuleMetadata clone() {
    return (AssetModuleMetadata) super.clone();
  }

}
