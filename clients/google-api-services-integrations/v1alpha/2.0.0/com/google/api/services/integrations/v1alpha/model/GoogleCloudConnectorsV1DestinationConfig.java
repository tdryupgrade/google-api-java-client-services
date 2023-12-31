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

package com.google.api.services.integrations.v1alpha.model;

/**
 * Define the Connectors target endpoint.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudConnectorsV1DestinationConfig extends com.google.api.client.json.GenericJson {

  /**
   * The destinations for the key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudConnectorsV1Destination> destinations;

  static {
    // hack to force ProGuard to consider GoogleCloudConnectorsV1Destination used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudConnectorsV1Destination.class);
  }

  /**
   * The key is the destination identifier that is supported by the Connector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * The destinations for the key.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudConnectorsV1Destination> getDestinations() {
    return destinations;
  }

  /**
   * The destinations for the key.
   * @param destinations destinations or {@code null} for none
   */
  public GoogleCloudConnectorsV1DestinationConfig setDestinations(java.util.List<GoogleCloudConnectorsV1Destination> destinations) {
    this.destinations = destinations;
    return this;
  }

  /**
   * The key is the destination identifier that is supported by the Connector.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * The key is the destination identifier that is supported by the Connector.
   * @param key key or {@code null} for none
   */
  public GoogleCloudConnectorsV1DestinationConfig setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  @Override
  public GoogleCloudConnectorsV1DestinationConfig set(String fieldName, Object value) {
    return (GoogleCloudConnectorsV1DestinationConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudConnectorsV1DestinationConfig clone() {
    return (GoogleCloudConnectorsV1DestinationConfig) super.clone();
  }

}
