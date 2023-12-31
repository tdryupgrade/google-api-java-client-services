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

package com.google.api.services.connectors.v1.model;

/**
 * Global Settings details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Settings extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Resource name of the Connection. Format:
   * projects/{project}/locations/global/settings}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Flag indicates if user is in PayG model
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean payg;

  /**
   * Output only. Tenant project id of the consumer project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tenantProjectId;

  /**
   * Optional. Flag indicates whether vpc-sc is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean vpcsc;

  /**
   * Output only. Resource name of the Connection. Format:
   * projects/{project}/locations/global/settings}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the Connection. Format:
   * projects/{project}/locations/global/settings}
   * @param name name or {@code null} for none
   */
  public Settings setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Flag indicates if user is in PayG model
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPayg() {
    return payg;
  }

  /**
   * Output only. Flag indicates if user is in PayG model
   * @param payg payg or {@code null} for none
   */
  public Settings setPayg(java.lang.Boolean payg) {
    this.payg = payg;
    return this;
  }

  /**
   * Output only. Tenant project id of the consumer project.
   * @return value or {@code null} for none
   */
  public java.lang.String getTenantProjectId() {
    return tenantProjectId;
  }

  /**
   * Output only. Tenant project id of the consumer project.
   * @param tenantProjectId tenantProjectId or {@code null} for none
   */
  public Settings setTenantProjectId(java.lang.String tenantProjectId) {
    this.tenantProjectId = tenantProjectId;
    return this;
  }

  /**
   * Optional. Flag indicates whether vpc-sc is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVpcsc() {
    return vpcsc;
  }

  /**
   * Optional. Flag indicates whether vpc-sc is enabled.
   * @param vpcsc vpcsc or {@code null} for none
   */
  public Settings setVpcsc(java.lang.Boolean vpcsc) {
    this.vpcsc = vpcsc;
    return this;
  }

  @Override
  public Settings set(String fieldName, Object value) {
    return (Settings) super.set(fieldName, value);
  }

  @Override
  public Settings clone() {
    return (Settings) super.clone();
  }

}
