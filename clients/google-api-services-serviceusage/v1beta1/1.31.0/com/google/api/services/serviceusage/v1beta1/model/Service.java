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

package com.google.api.services.serviceusage.v1beta1.model;

/**
 * A service that is available for use by the consumer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Service extends com.google.api.client.json.GenericJson {

  /**
   * The service configuration of the available service. Some fields may be filtered out of the
   * configuration in responses to the `ListServices` method. These fields are present only in
   * responses to the `GetService` method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceConfig config;

  /**
   * The resource name of the consumer and service. A valid name would be: -
   * `projects/123/services/serviceusage.googleapis.com`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The resource name of the consumer. A valid name would be: - `projects/123`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Whether or not the service has been enabled for use by the consumer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The service configuration of the available service. Some fields may be filtered out of the
   * configuration in responses to the `ListServices` method. These fields are present only in
   * responses to the `GetService` method.
   * @return value or {@code null} for none
   */
  public ServiceConfig getConfig() {
    return config;
  }

  /**
   * The service configuration of the available service. Some fields may be filtered out of the
   * configuration in responses to the `ListServices` method. These fields are present only in
   * responses to the `GetService` method.
   * @param config config or {@code null} for none
   */
  public Service setConfig(ServiceConfig config) {
    this.config = config;
    return this;
  }

  /**
   * The resource name of the consumer and service. A valid name would be: -
   * `projects/123/services/serviceusage.googleapis.com`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the consumer and service. A valid name would be: -
   * `projects/123/services/serviceusage.googleapis.com`
   * @param name name or {@code null} for none
   */
  public Service setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The resource name of the consumer. A valid name would be: - `projects/123`
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * The resource name of the consumer. A valid name would be: - `projects/123`
   * @param parent parent or {@code null} for none
   */
  public Service setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Whether or not the service has been enabled for use by the consumer.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Whether or not the service has been enabled for use by the consumer.
   * @param state state or {@code null} for none
   */
  public Service setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Service set(String fieldName, Object value) {
    return (Service) super.set(fieldName, value);
  }

  @Override
  public Service clone() {
    return (Service) super.clone();
  }

}
