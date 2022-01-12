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

package com.google.api.services.servicemanagement.model;

/**
 * Selects and configures the service controller used by the service. The service controller handles
 * two things: - **What is allowed:** for each API request, Chemist checks the project status,
 * activation status, abuse status, billing status, service status, location restrictions, VPC
 * Service Controls, SuperQuota, and other policies. - **What has happened:** for each API response,
 * Chemist reports the telemetry data to analytics, auditing, billing, eventing, logging,
 * monitoring, sawmill, and tracing. Chemist also accepts telemetry data not associated with API
 * traffic, such as billing metrics. Example: control: environment: servicecontrol.googleapis.com
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Control extends com.google.api.client.json.GenericJson {

  /**
   * The service controller environment to use. If empty, no control plane feature (like quota and
   * billing) will be enabled. The recommended value for most services is
   * servicecontrol.googleapis.com
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String environment;

  /**
   * The service controller environment to use. If empty, no control plane feature (like quota and
   * billing) will be enabled. The recommended value for most services is
   * servicecontrol.googleapis.com
   * @return value or {@code null} for none
   */
  public java.lang.String getEnvironment() {
    return environment;
  }

  /**
   * The service controller environment to use. If empty, no control plane feature (like quota and
   * billing) will be enabled. The recommended value for most services is
   * servicecontrol.googleapis.com
   * @param environment environment or {@code null} for none
   */
  public Control setEnvironment(java.lang.String environment) {
    this.environment = environment;
    return this;
  }

  @Override
  public Control set(String fieldName, Object value) {
    return (Control) super.set(fieldName, value);
  }

  @Override
  public Control clone() {
    return (Control) super.clone();
  }

}
