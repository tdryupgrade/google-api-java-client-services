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
 * An provisioning configuration.
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
public final class ProvisioningConfig extends com.google.api.client.json.GenericJson {

  /**
   * Instances to be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InstanceConfig> instances;

  static {
    // hack to force ProGuard to consider InstanceConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(InstanceConfig.class);
  }

  /**
   * Networks to be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NetworkConfig> networks;

  static {
    // hack to force ProGuard to consider NetworkConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(NetworkConfig.class);
  }

  /**
   * A reference to track the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ticketId;

  /**
   * Volumes to be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VolumeConfig> volumes;

  /**
   * Instances to be created.
   * @return value or {@code null} for none
   */
  public java.util.List<InstanceConfig> getInstances() {
    return instances;
  }

  /**
   * Instances to be created.
   * @param instances instances or {@code null} for none
   */
  public ProvisioningConfig setInstances(java.util.List<InstanceConfig> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * Networks to be created.
   * @return value or {@code null} for none
   */
  public java.util.List<NetworkConfig> getNetworks() {
    return networks;
  }

  /**
   * Networks to be created.
   * @param networks networks or {@code null} for none
   */
  public ProvisioningConfig setNetworks(java.util.List<NetworkConfig> networks) {
    this.networks = networks;
    return this;
  }

  /**
   * A reference to track the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getTicketId() {
    return ticketId;
  }

  /**
   * A reference to track the request.
   * @param ticketId ticketId or {@code null} for none
   */
  public ProvisioningConfig setTicketId(java.lang.String ticketId) {
    this.ticketId = ticketId;
    return this;
  }

  /**
   * Volumes to be created.
   * @return value or {@code null} for none
   */
  public java.util.List<VolumeConfig> getVolumes() {
    return volumes;
  }

  /**
   * Volumes to be created.
   * @param volumes volumes or {@code null} for none
   */
  public ProvisioningConfig setVolumes(java.util.List<VolumeConfig> volumes) {
    this.volumes = volumes;
    return this;
  }

  @Override
  public ProvisioningConfig set(String fieldName, Object value) {
    return (ProvisioningConfig) super.set(fieldName, value);
  }

  @Override
  public ProvisioningConfig clone() {
    return (ProvisioningConfig) super.clone();
  }

}
