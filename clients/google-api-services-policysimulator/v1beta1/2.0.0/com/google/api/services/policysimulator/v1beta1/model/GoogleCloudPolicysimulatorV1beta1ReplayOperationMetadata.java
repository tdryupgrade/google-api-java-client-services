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

package com.google.api.services.policysimulator.v1beta1.model;

/**
 * Metadata about a Replay operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Policy Simulator API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPolicysimulatorV1beta1ReplayOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Time when the request was received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Time when the request was received.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Time when the request was received.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudPolicysimulatorV1beta1ReplayOperationMetadata setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public GoogleCloudPolicysimulatorV1beta1ReplayOperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudPolicysimulatorV1beta1ReplayOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPolicysimulatorV1beta1ReplayOperationMetadata clone() {
    return (GoogleCloudPolicysimulatorV1beta1ReplayOperationMetadata) super.clone();
  }

}
