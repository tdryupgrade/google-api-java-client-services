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
 * Model definition for CarriersCarrier.
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
public final class CarriersCarrier extends com.google.api.client.json.GenericJson {

  /**
   * The CLDR country code of the carrier (e.g., "US"). Always present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * A list of services supported for EDD (Estimated Delivery Date) calculation. This is the list of
   * valid values for WarehouseBasedDeliveryTime.carrierService.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> eddServices;

  /**
   * The name of the carrier (e.g., `"UPS"`). Always present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A list of supported services (e.g., `"ground"`) for that carrier. Contains at least one
   * service. This is the list of valid values for CarrierRate.carrierService.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> services;

  /**
   * The CLDR country code of the carrier (e.g., "US"). Always present.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * The CLDR country code of the carrier (e.g., "US"). Always present.
   * @param country country or {@code null} for none
   */
  public CarriersCarrier setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * A list of services supported for EDD (Estimated Delivery Date) calculation. This is the list of
   * valid values for WarehouseBasedDeliveryTime.carrierService.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEddServices() {
    return eddServices;
  }

  /**
   * A list of services supported for EDD (Estimated Delivery Date) calculation. This is the list of
   * valid values for WarehouseBasedDeliveryTime.carrierService.
   * @param eddServices eddServices or {@code null} for none
   */
  public CarriersCarrier setEddServices(java.util.List<java.lang.String> eddServices) {
    this.eddServices = eddServices;
    return this;
  }

  /**
   * The name of the carrier (e.g., `"UPS"`). Always present.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the carrier (e.g., `"UPS"`). Always present.
   * @param name name or {@code null} for none
   */
  public CarriersCarrier setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A list of supported services (e.g., `"ground"`) for that carrier. Contains at least one
   * service. This is the list of valid values for CarrierRate.carrierService.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getServices() {
    return services;
  }

  /**
   * A list of supported services (e.g., `"ground"`) for that carrier. Contains at least one
   * service. This is the list of valid values for CarrierRate.carrierService.
   * @param services services or {@code null} for none
   */
  public CarriersCarrier setServices(java.util.List<java.lang.String> services) {
    this.services = services;
    return this;
  }

  @Override
  public CarriersCarrier set(String fieldName, Object value) {
    return (CarriersCarrier) super.set(fieldName, value);
  }

  @Override
  public CarriersCarrier clone() {
    return (CarriersCarrier) super.clone();
  }

}
