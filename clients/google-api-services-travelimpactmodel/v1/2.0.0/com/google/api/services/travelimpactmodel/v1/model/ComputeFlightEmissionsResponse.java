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

package com.google.api.services.travelimpactmodel.v1.model;

/**
 * Output definition for the ComputeFlightEmissions response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Travel Impact Model API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ComputeFlightEmissionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of flight legs with emission estimates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FlightWithEmissions> flightEmissions;

  /**
   * The model version under which emission estimates for all flights in this response were
   * computed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ModelVersion modelVersion;

  /**
   * List of flight legs with emission estimates.
   * @return value or {@code null} for none
   */
  public java.util.List<FlightWithEmissions> getFlightEmissions() {
    return flightEmissions;
  }

  /**
   * List of flight legs with emission estimates.
   * @param flightEmissions flightEmissions or {@code null} for none
   */
  public ComputeFlightEmissionsResponse setFlightEmissions(java.util.List<FlightWithEmissions> flightEmissions) {
    this.flightEmissions = flightEmissions;
    return this;
  }

  /**
   * The model version under which emission estimates for all flights in this response were
   * computed.
   * @return value or {@code null} for none
   */
  public ModelVersion getModelVersion() {
    return modelVersion;
  }

  /**
   * The model version under which emission estimates for all flights in this response were
   * computed.
   * @param modelVersion modelVersion or {@code null} for none
   */
  public ComputeFlightEmissionsResponse setModelVersion(ModelVersion modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  @Override
  public ComputeFlightEmissionsResponse set(String fieldName, Object value) {
    return (ComputeFlightEmissionsResponse) super.set(fieldName, value);
  }

  @Override
  public ComputeFlightEmissionsResponse clone() {
    return (ComputeFlightEmissionsResponse) super.clone();
  }

}
