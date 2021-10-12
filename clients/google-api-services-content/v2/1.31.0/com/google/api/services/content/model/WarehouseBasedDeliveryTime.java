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
 * Model definition for WarehouseBasedDeliveryTime.
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
public final class WarehouseBasedDeliveryTime extends com.google.api.client.json.GenericJson {

  /**
   * Required. Carrier, such as `"UPS"` or `"Fedex"`. The list of supported carriers can be
   * retrieved via the `listSupportedCarriers` method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String carrier;

  /**
   * Required. Carrier service, such as `"ground"` or `"2 days"`. The list of supported services for
   * a carrier can be retrieved via the `listSupportedCarriers` method. The name of the service must
   * be in the eddSupportedServices list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String carrierService;

  /**
   * Shipping origin's state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originAdministrativeArea;

  /**
   * Shipping origin's city.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originCity;

  /**
   * Shipping origin's country represented as a [CLDR territory
   * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originCountry;

  /**
   * Shipping origin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originPostalCode;

  /**
   * Shipping origin's street address
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originStreetAddress;

  /**
   * The name of the warehouse. Warehouse name need to be matched with name. If warehouseName is
   * set, the below fields will be ignored. The warehouse info will be read from warehouse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String warehouseName;

  /**
   * Required. Carrier, such as `"UPS"` or `"Fedex"`. The list of supported carriers can be
   * retrieved via the `listSupportedCarriers` method.
   * @return value or {@code null} for none
   */
  public java.lang.String getCarrier() {
    return carrier;
  }

  /**
   * Required. Carrier, such as `"UPS"` or `"Fedex"`. The list of supported carriers can be
   * retrieved via the `listSupportedCarriers` method.
   * @param carrier carrier or {@code null} for none
   */
  public WarehouseBasedDeliveryTime setCarrier(java.lang.String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Required. Carrier service, such as `"ground"` or `"2 days"`. The list of supported services for
   * a carrier can be retrieved via the `listSupportedCarriers` method. The name of the service must
   * be in the eddSupportedServices list.
   * @return value or {@code null} for none
   */
  public java.lang.String getCarrierService() {
    return carrierService;
  }

  /**
   * Required. Carrier service, such as `"ground"` or `"2 days"`. The list of supported services for
   * a carrier can be retrieved via the `listSupportedCarriers` method. The name of the service must
   * be in the eddSupportedServices list.
   * @param carrierService carrierService or {@code null} for none
   */
  public WarehouseBasedDeliveryTime setCarrierService(java.lang.String carrierService) {
    this.carrierService = carrierService;
    return this;
  }

  /**
   * Shipping origin's state.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginAdministrativeArea() {
    return originAdministrativeArea;
  }

  /**
   * Shipping origin's state.
   * @param originAdministrativeArea originAdministrativeArea or {@code null} for none
   */
  public WarehouseBasedDeliveryTime setOriginAdministrativeArea(java.lang.String originAdministrativeArea) {
    this.originAdministrativeArea = originAdministrativeArea;
    return this;
  }

  /**
   * Shipping origin's city.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginCity() {
    return originCity;
  }

  /**
   * Shipping origin's city.
   * @param originCity originCity or {@code null} for none
   */
  public WarehouseBasedDeliveryTime setOriginCity(java.lang.String originCity) {
    this.originCity = originCity;
    return this;
  }

  /**
   * Shipping origin's country represented as a [CLDR territory
   * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml).
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginCountry() {
    return originCountry;
  }

  /**
   * Shipping origin's country represented as a [CLDR territory
   * code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml).
   * @param originCountry originCountry or {@code null} for none
   */
  public WarehouseBasedDeliveryTime setOriginCountry(java.lang.String originCountry) {
    this.originCountry = originCountry;
    return this;
  }

  /**
   * Shipping origin.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginPostalCode() {
    return originPostalCode;
  }

  /**
   * Shipping origin.
   * @param originPostalCode originPostalCode or {@code null} for none
   */
  public WarehouseBasedDeliveryTime setOriginPostalCode(java.lang.String originPostalCode) {
    this.originPostalCode = originPostalCode;
    return this;
  }

  /**
   * Shipping origin's street address
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginStreetAddress() {
    return originStreetAddress;
  }

  /**
   * Shipping origin's street address
   * @param originStreetAddress originStreetAddress or {@code null} for none
   */
  public WarehouseBasedDeliveryTime setOriginStreetAddress(java.lang.String originStreetAddress) {
    this.originStreetAddress = originStreetAddress;
    return this;
  }

  /**
   * The name of the warehouse. Warehouse name need to be matched with name. If warehouseName is
   * set, the below fields will be ignored. The warehouse info will be read from warehouse.
   * @return value or {@code null} for none
   */
  public java.lang.String getWarehouseName() {
    return warehouseName;
  }

  /**
   * The name of the warehouse. Warehouse name need to be matched with name. If warehouseName is
   * set, the below fields will be ignored. The warehouse info will be read from warehouse.
   * @param warehouseName warehouseName or {@code null} for none
   */
  public WarehouseBasedDeliveryTime setWarehouseName(java.lang.String warehouseName) {
    this.warehouseName = warehouseName;
    return this;
  }

  @Override
  public WarehouseBasedDeliveryTime set(String fieldName, Object value) {
    return (WarehouseBasedDeliveryTime) super.set(fieldName, value);
  }

  @Override
  public WarehouseBasedDeliveryTime clone() {
    return (WarehouseBasedDeliveryTime) super.clone();
  }

}
