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

package com.google.api.services.mybusinessbusinessinformation.v1.model;

/**
 * A chain is a brand that your business's locations can be affiliated with.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the My Business Business Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Chain extends com.google.api.client.json.GenericJson {

  /**
   * Names of the chain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ChainName> chainNames;

  /**
   * Number of locations that are part of this chain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer locationCount;

  /**
   * Required. The chain's resource name, in the format `chains/{chain_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Websites of the chain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ChainUri> websites;

  /**
   * Names of the chain.
   * @return value or {@code null} for none
   */
  public java.util.List<ChainName> getChainNames() {
    return chainNames;
  }

  /**
   * Names of the chain.
   * @param chainNames chainNames or {@code null} for none
   */
  public Chain setChainNames(java.util.List<ChainName> chainNames) {
    this.chainNames = chainNames;
    return this;
  }

  /**
   * Number of locations that are part of this chain.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLocationCount() {
    return locationCount;
  }

  /**
   * Number of locations that are part of this chain.
   * @param locationCount locationCount or {@code null} for none
   */
  public Chain setLocationCount(java.lang.Integer locationCount) {
    this.locationCount = locationCount;
    return this;
  }

  /**
   * Required. The chain's resource name, in the format `chains/{chain_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The chain's resource name, in the format `chains/{chain_id}`.
   * @param name name or {@code null} for none
   */
  public Chain setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Websites of the chain.
   * @return value or {@code null} for none
   */
  public java.util.List<ChainUri> getWebsites() {
    return websites;
  }

  /**
   * Websites of the chain.
   * @param websites websites or {@code null} for none
   */
  public Chain setWebsites(java.util.List<ChainUri> websites) {
    this.websites = websites;
    return this;
  }

  @Override
  public Chain set(String fieldName, Object value) {
    return (Chain) super.set(fieldName, value);
  }

  @Override
  public Chain clone() {
    return (Chain) super.clone();
  }

}
