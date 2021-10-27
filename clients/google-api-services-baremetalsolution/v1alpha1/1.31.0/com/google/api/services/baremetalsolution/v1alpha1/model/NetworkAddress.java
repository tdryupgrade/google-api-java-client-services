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

package com.google.api.services.baremetalsolution.v1alpha1.model;

/**
 * A network.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Bare Metal Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkAddress extends com.google.api.client.json.GenericJson {

  /**
   * IP address to be assigned to the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * Id of the network to use, within the same ProvisioningConfig request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkId;

  /**
   * IP address to be assigned to the server.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * IP address to be assigned to the server.
   * @param address address or {@code null} for none
   */
  public NetworkAddress setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * Id of the network to use, within the same ProvisioningConfig request.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkId() {
    return networkId;
  }

  /**
   * Id of the network to use, within the same ProvisioningConfig request.
   * @param networkId networkId or {@code null} for none
   */
  public NetworkAddress setNetworkId(java.lang.String networkId) {
    this.networkId = networkId;
    return this;
  }

  @Override
  public NetworkAddress set(String fieldName, Object value) {
    return (NetworkAddress) super.set(fieldName, value);
  }

  @Override
  public NetworkAddress clone() {
    return (NetworkAddress) super.clone();
  }

}
