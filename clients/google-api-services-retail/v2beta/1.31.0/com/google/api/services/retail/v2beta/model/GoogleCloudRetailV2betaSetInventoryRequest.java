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

package com.google.api.services.retail.v2beta.model;

/**
 * Request message for SetInventory method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaSetInventoryRequest extends com.google.api.client.json.GenericJson {

  /**
   * If set to true, and the Product with name Product.name is not found, the inventory update will
   * still be processed and retained for at most 1 day until the Product is created. If set to
   * false, a NOT_FOUND error is returned if the Product is not found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowMissing;

  /**
   * Required. The inventory information to update. The allowable fields to update are: *
   * Product.price_info * Product.availability * Product.available_quantity *
   * Product.fulfillment_info The updated inventory fields must be specified in
   * SetInventoryRequest.set_mask. If SetInventoryRequest.inventory.name is empty or invalid, an
   * INVALID_ARGUMENT error is returned. If the caller does not have permission to update the
   * Product named in Product.name, regardless of whether or not it exists, a PERMISSION_DENIED
   * error is returned. If the Product to update does not have existing inventory information, the
   * provided inventory information will be inserted. If the Product to update has existing
   * inventory information, the provided inventory information will be merged while respecting the
   * last update time for each inventory field, using the provided or default value for
   * SetInventoryRequest.set_time. The last update time is recorded for the following inventory
   * fields: * Product.price_info * Product.availability * Product.available_quantity *
   * Product.fulfillment_info If a full overwrite of inventory information while ignoring timestamps
   * is needed, UpdateProduct should be invoked instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaProduct inventory;

  /**
   * Indicates which inventory fields in the provided Product to update. If not set or set with
   * empty paths, all inventory fields will be updated. If an unsupported or unknown field is
   * provided, an INVALID_ARGUMENT error is returned and the entire update will be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String setMask;

  /**
   * The time when the request is issued, used to prevent out-of-order updates on inventory fields
   * with the last update time recorded. If not provided, the internal system time will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String setTime;

  /**
   * If set to true, and the Product with name Product.name is not found, the inventory update will
   * still be processed and retained for at most 1 day until the Product is created. If set to
   * false, a NOT_FOUND error is returned if the Product is not found.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowMissing() {
    return allowMissing;
  }

  /**
   * If set to true, and the Product with name Product.name is not found, the inventory update will
   * still be processed and retained for at most 1 day until the Product is created. If set to
   * false, a NOT_FOUND error is returned if the Product is not found.
   * @param allowMissing allowMissing or {@code null} for none
   */
  public GoogleCloudRetailV2betaSetInventoryRequest setAllowMissing(java.lang.Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  /**
   * Required. The inventory information to update. The allowable fields to update are: *
   * Product.price_info * Product.availability * Product.available_quantity *
   * Product.fulfillment_info The updated inventory fields must be specified in
   * SetInventoryRequest.set_mask. If SetInventoryRequest.inventory.name is empty or invalid, an
   * INVALID_ARGUMENT error is returned. If the caller does not have permission to update the
   * Product named in Product.name, regardless of whether or not it exists, a PERMISSION_DENIED
   * error is returned. If the Product to update does not have existing inventory information, the
   * provided inventory information will be inserted. If the Product to update has existing
   * inventory information, the provided inventory information will be merged while respecting the
   * last update time for each inventory field, using the provided or default value for
   * SetInventoryRequest.set_time. The last update time is recorded for the following inventory
   * fields: * Product.price_info * Product.availability * Product.available_quantity *
   * Product.fulfillment_info If a full overwrite of inventory information while ignoring timestamps
   * is needed, UpdateProduct should be invoked instead.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaProduct getInventory() {
    return inventory;
  }

  /**
   * Required. The inventory information to update. The allowable fields to update are: *
   * Product.price_info * Product.availability * Product.available_quantity *
   * Product.fulfillment_info The updated inventory fields must be specified in
   * SetInventoryRequest.set_mask. If SetInventoryRequest.inventory.name is empty or invalid, an
   * INVALID_ARGUMENT error is returned. If the caller does not have permission to update the
   * Product named in Product.name, regardless of whether or not it exists, a PERMISSION_DENIED
   * error is returned. If the Product to update does not have existing inventory information, the
   * provided inventory information will be inserted. If the Product to update has existing
   * inventory information, the provided inventory information will be merged while respecting the
   * last update time for each inventory field, using the provided or default value for
   * SetInventoryRequest.set_time. The last update time is recorded for the following inventory
   * fields: * Product.price_info * Product.availability * Product.available_quantity *
   * Product.fulfillment_info If a full overwrite of inventory information while ignoring timestamps
   * is needed, UpdateProduct should be invoked instead.
   * @param inventory inventory or {@code null} for none
   */
  public GoogleCloudRetailV2betaSetInventoryRequest setInventory(GoogleCloudRetailV2betaProduct inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * Indicates which inventory fields in the provided Product to update. If not set or set with
   * empty paths, all inventory fields will be updated. If an unsupported or unknown field is
   * provided, an INVALID_ARGUMENT error is returned and the entire update will be ignored.
   * @return value or {@code null} for none
   */
  public String getSetMask() {
    return setMask;
  }

  /**
   * Indicates which inventory fields in the provided Product to update. If not set or set with
   * empty paths, all inventory fields will be updated. If an unsupported or unknown field is
   * provided, an INVALID_ARGUMENT error is returned and the entire update will be ignored.
   * @param setMask setMask or {@code null} for none
   */
  public GoogleCloudRetailV2betaSetInventoryRequest setSetMask(String setMask) {
    this.setMask = setMask;
    return this;
  }

  /**
   * The time when the request is issued, used to prevent out-of-order updates on inventory fields
   * with the last update time recorded. If not provided, the internal system time will be used.
   * @return value or {@code null} for none
   */
  public String getSetTime() {
    return setTime;
  }

  /**
   * The time when the request is issued, used to prevent out-of-order updates on inventory fields
   * with the last update time recorded. If not provided, the internal system time will be used.
   * @param setTime setTime or {@code null} for none
   */
  public GoogleCloudRetailV2betaSetInventoryRequest setSetTime(String setTime) {
    this.setTime = setTime;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaSetInventoryRequest set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaSetInventoryRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaSetInventoryRequest clone() {
    return (GoogleCloudRetailV2betaSetInventoryRequest) super.clone();
  }

}
