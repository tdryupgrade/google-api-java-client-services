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

package com.google.api.services.compute.model;

/**
 * Model definition for RegionAddressesMoveRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RegionAddressesMoveRequest extends com.google.api.client.json.GenericJson {

  /**
   * An optional destination address description if intended to be different from the source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The URL of the destination address to move to. This can be a full or partial URL. For example,
   * the following are all valid URLs to a address: -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region /addresses/address -
   * projects/project/regions/region/addresses/address Note that destination project must be
   * different from the source project. So /regions/region/addresses/address is not valid partial
   * url.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationAddress;

  /**
   * An optional destination address description if intended to be different from the source.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional destination address description if intended to be different from the source.
   * @param description description or {@code null} for none
   */
  public RegionAddressesMoveRequest setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The URL of the destination address to move to. This can be a full or partial URL. For example,
   * the following are all valid URLs to a address: -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region /addresses/address -
   * projects/project/regions/region/addresses/address Note that destination project must be
   * different from the source project. So /regions/region/addresses/address is not valid partial
   * url.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationAddress() {
    return destinationAddress;
  }

  /**
   * The URL of the destination address to move to. This can be a full or partial URL. For example,
   * the following are all valid URLs to a address: -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region /addresses/address -
   * projects/project/regions/region/addresses/address Note that destination project must be
   * different from the source project. So /regions/region/addresses/address is not valid partial
   * url.
   * @param destinationAddress destinationAddress or {@code null} for none
   */
  public RegionAddressesMoveRequest setDestinationAddress(java.lang.String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

  @Override
  public RegionAddressesMoveRequest set(String fieldName, Object value) {
    return (RegionAddressesMoveRequest) super.set(fieldName, value);
  }

  @Override
  public RegionAddressesMoveRequest clone() {
    return (RegionAddressesMoveRequest) super.clone();
  }

}
