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

package com.google.api.services.content.model;

/**
 * Stores that provide local delivery. Only valid with local delivery fulfillment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceStoreConfig extends com.google.api.client.json.GenericJson {

  /**
   * Time local delivery ends for the day. This can be either `local_cutoff_time` or
   * `store_close_offset_hours`, if both are provided an error is thrown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceStoreConfigCutoffConfig cutoffConfig;

  /**
   * Maximum delivery radius. Only needed for local delivery fulfillment type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Distance serviceRadius;

  /**
   * A list of store codes that provide local delivery. If empty, then `store_service_type` must be
   * `all_stores`, or an error is thrown. If not empty, then `store_service_type` must be
   * `selected_stores`, or an error is thrown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> storeCodes;

  /**
   * Indicates whether all stores listed by this merchant provide local delivery or not. Acceptable
   * values are `all stores` and `selected stores`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storeServiceType;

  /**
   * Time local delivery ends for the day. This can be either `local_cutoff_time` or
   * `store_close_offset_hours`, if both are provided an error is thrown.
   * @return value or {@code null} for none
   */
  public ServiceStoreConfigCutoffConfig getCutoffConfig() {
    return cutoffConfig;
  }

  /**
   * Time local delivery ends for the day. This can be either `local_cutoff_time` or
   * `store_close_offset_hours`, if both are provided an error is thrown.
   * @param cutoffConfig cutoffConfig or {@code null} for none
   */
  public ServiceStoreConfig setCutoffConfig(ServiceStoreConfigCutoffConfig cutoffConfig) {
    this.cutoffConfig = cutoffConfig;
    return this;
  }

  /**
   * Maximum delivery radius. Only needed for local delivery fulfillment type.
   * @return value or {@code null} for none
   */
  public Distance getServiceRadius() {
    return serviceRadius;
  }

  /**
   * Maximum delivery radius. Only needed for local delivery fulfillment type.
   * @param serviceRadius serviceRadius or {@code null} for none
   */
  public ServiceStoreConfig setServiceRadius(Distance serviceRadius) {
    this.serviceRadius = serviceRadius;
    return this;
  }

  /**
   * A list of store codes that provide local delivery. If empty, then `store_service_type` must be
   * `all_stores`, or an error is thrown. If not empty, then `store_service_type` must be
   * `selected_stores`, or an error is thrown.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStoreCodes() {
    return storeCodes;
  }

  /**
   * A list of store codes that provide local delivery. If empty, then `store_service_type` must be
   * `all_stores`, or an error is thrown. If not empty, then `store_service_type` must be
   * `selected_stores`, or an error is thrown.
   * @param storeCodes storeCodes or {@code null} for none
   */
  public ServiceStoreConfig setStoreCodes(java.util.List<java.lang.String> storeCodes) {
    this.storeCodes = storeCodes;
    return this;
  }

  /**
   * Indicates whether all stores listed by this merchant provide local delivery or not. Acceptable
   * values are `all stores` and `selected stores`
   * @return value or {@code null} for none
   */
  public java.lang.String getStoreServiceType() {
    return storeServiceType;
  }

  /**
   * Indicates whether all stores listed by this merchant provide local delivery or not. Acceptable
   * values are `all stores` and `selected stores`
   * @param storeServiceType storeServiceType or {@code null} for none
   */
  public ServiceStoreConfig setStoreServiceType(java.lang.String storeServiceType) {
    this.storeServiceType = storeServiceType;
    return this;
  }

  @Override
  public ServiceStoreConfig set(String fieldName, Object value) {
    return (ServiceStoreConfig) super.set(fieldName, value);
  }

  @Override
  public ServiceStoreConfig clone() {
    return (ServiceStoreConfig) super.clone();
  }

}
