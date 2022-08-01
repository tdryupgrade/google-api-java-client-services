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

package com.google.api.services.osconfig.v1alpha.model;

/**
 * A response message for listing inventory data for all VMs in a specified location.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListInventoriesResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of inventory objects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Inventory> inventories;

  static {
    // hack to force ProGuard to consider Inventory used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Inventory.class);
  }

  /**
   * The pagination token to retrieve the next page of inventory objects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of inventory objects.
   * @return value or {@code null} for none
   */
  public java.util.List<Inventory> getInventories() {
    return inventories;
  }

  /**
   * List of inventory objects.
   * @param inventories inventories or {@code null} for none
   */
  public ListInventoriesResponse setInventories(java.util.List<Inventory> inventories) {
    this.inventories = inventories;
    return this;
  }

  /**
   * The pagination token to retrieve the next page of inventory objects.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The pagination token to retrieve the next page of inventory objects.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListInventoriesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListInventoriesResponse set(String fieldName, Object value) {
    return (ListInventoriesResponse) super.set(fieldName, value);
  }

  @Override
  public ListInventoriesResponse clone() {
    return (ListInventoriesResponse) super.clone();
  }

}
