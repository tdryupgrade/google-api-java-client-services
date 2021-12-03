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
 * For load balancers that have configurable failover: [Internal TCP/UDP Load
 * Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external
 * TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-
 * overview). On failover or failback, this field indicates whether connection draining will be
 * honored. Google Cloud has a fixed connection draining timeout of 10 minutes. A setting of true
 * terminates existing TCP connections to the active pool during failover and failback, immediately
 * draining traffic. A setting of false allows existing TCP connections to persist, even on VMs no
 * longer in the active pool, for up to the duration of the connection draining timeout (10
 * minutes).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BackendServiceFailoverPolicy extends com.google.api.client.json.GenericJson {

  /**
   * This can be set to true only if the protocol is TCP. The default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableConnectionDrainOnFailover;

  /**
   * If set to true, connections to the load balancer are dropped when all primary and all backup
   * backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs
   * when all primary and all backup backend VMs are unhealthy. For load balancers that have
   * configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-
   * balancing/docs/internal/failover-overview) and [external TCP/UDP Load
   * Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
   * The default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dropTrafficIfUnhealthy;

  /**
   * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer
   * performs a failover when the number of healthy primary VMs equals zero. For all other values,
   * the load balancer performs a failover when the total number of healthy primary VMs is less than
   * this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load
   * Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and
   * [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network
   * /networklb-failover-overview).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float failoverRatio;

  /**
   * This can be set to true only if the protocol is TCP. The default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableConnectionDrainOnFailover() {
    return disableConnectionDrainOnFailover;
  }

  /**
   * This can be set to true only if the protocol is TCP. The default is false.
   * @param disableConnectionDrainOnFailover disableConnectionDrainOnFailover or {@code null} for none
   */
  public BackendServiceFailoverPolicy setDisableConnectionDrainOnFailover(java.lang.Boolean disableConnectionDrainOnFailover) {
    this.disableConnectionDrainOnFailover = disableConnectionDrainOnFailover;
    return this;
  }

  /**
   * If set to true, connections to the load balancer are dropped when all primary and all backup
   * backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs
   * when all primary and all backup backend VMs are unhealthy. For load balancers that have
   * configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-
   * balancing/docs/internal/failover-overview) and [external TCP/UDP Load
   * Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
   * The default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDropTrafficIfUnhealthy() {
    return dropTrafficIfUnhealthy;
  }

  /**
   * If set to true, connections to the load balancer are dropped when all primary and all backup
   * backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs
   * when all primary and all backup backend VMs are unhealthy. For load balancers that have
   * configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-
   * balancing/docs/internal/failover-overview) and [external TCP/UDP Load
   * Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
   * The default is false.
   * @param dropTrafficIfUnhealthy dropTrafficIfUnhealthy or {@code null} for none
   */
  public BackendServiceFailoverPolicy setDropTrafficIfUnhealthy(java.lang.Boolean dropTrafficIfUnhealthy) {
    this.dropTrafficIfUnhealthy = dropTrafficIfUnhealthy;
    return this;
  }

  /**
   * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer
   * performs a failover when the number of healthy primary VMs equals zero. For all other values,
   * the load balancer performs a failover when the total number of healthy primary VMs is less than
   * this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load
   * Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and
   * [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network
   * /networklb-failover-overview).
   * @return value or {@code null} for none
   */
  public java.lang.Float getFailoverRatio() {
    return failoverRatio;
  }

  /**
   * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer
   * performs a failover when the number of healthy primary VMs equals zero. For all other values,
   * the load balancer performs a failover when the total number of healthy primary VMs is less than
   * this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load
   * Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and
   * [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network
   * /networklb-failover-overview).
   * @param failoverRatio failoverRatio or {@code null} for none
   */
  public BackendServiceFailoverPolicy setFailoverRatio(java.lang.Float failoverRatio) {
    this.failoverRatio = failoverRatio;
    return this;
  }

  @Override
  public BackendServiceFailoverPolicy set(String fieldName, Object value) {
    return (BackendServiceFailoverPolicy) super.set(fieldName, value);
  }

  @Override
  public BackendServiceFailoverPolicy clone() {
    return (BackendServiceFailoverPolicy) super.clone();
  }

}
