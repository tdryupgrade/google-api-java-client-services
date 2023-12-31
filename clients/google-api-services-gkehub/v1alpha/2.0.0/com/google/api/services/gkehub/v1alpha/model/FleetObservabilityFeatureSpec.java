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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * **Fleet Observability**: The Hub-wide input for the FleetObservability feature.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FleetObservabilityFeatureSpec extends com.google.api.client.json.GenericJson {

  /**
   * Specified if fleet logging feature is enabled for the entire fleet. If UNSPECIFIED, fleet
   * logging feature is disabled for the entire fleet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FleetObservabilityLoggingConfig loggingConfig;

  /**
   * Specified if fleet logging feature is enabled for the entire fleet. If UNSPECIFIED, fleet
   * logging feature is disabled for the entire fleet.
   * @return value or {@code null} for none
   */
  public FleetObservabilityLoggingConfig getLoggingConfig() {
    return loggingConfig;
  }

  /**
   * Specified if fleet logging feature is enabled for the entire fleet. If UNSPECIFIED, fleet
   * logging feature is disabled for the entire fleet.
   * @param loggingConfig loggingConfig or {@code null} for none
   */
  public FleetObservabilityFeatureSpec setLoggingConfig(FleetObservabilityLoggingConfig loggingConfig) {
    this.loggingConfig = loggingConfig;
    return this;
  }

  @Override
  public FleetObservabilityFeatureSpec set(String fieldName, Object value) {
    return (FleetObservabilityFeatureSpec) super.set(fieldName, value);
  }

  @Override
  public FleetObservabilityFeatureSpec clone() {
    return (FleetObservabilityFeatureSpec) super.clone();
  }

}
