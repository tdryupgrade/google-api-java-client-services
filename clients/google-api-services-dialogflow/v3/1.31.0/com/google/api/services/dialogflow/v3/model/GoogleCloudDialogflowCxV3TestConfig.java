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

package com.google.api.services.dialogflow.v3.model;

/**
 * Represents configurations for a test case.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3TestConfig extends com.google.api.client.json.GenericJson {

  /**
   * Flow name. If not set, default start flow is assumed. Format:
   * `projects//locations//agents//flows/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String flow;

  /**
   * Session parameters to be compared when calculating differences.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> trackingParameters;

  /**
   * Flow name. If not set, default start flow is assumed. Format:
   * `projects//locations//agents//flows/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFlow() {
    return flow;
  }

  /**
   * Flow name. If not set, default start flow is assumed. Format:
   * `projects//locations//agents//flows/`.
   * @param flow flow or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestConfig setFlow(java.lang.String flow) {
    this.flow = flow;
    return this;
  }

  /**
   * Session parameters to be compared when calculating differences.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTrackingParameters() {
    return trackingParameters;
  }

  /**
   * Session parameters to be compared when calculating differences.
   * @param trackingParameters trackingParameters or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3TestConfig setTrackingParameters(java.util.List<java.lang.String> trackingParameters) {
    this.trackingParameters = trackingParameters;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3TestConfig set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3TestConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3TestConfig clone() {
    return (GoogleCloudDialogflowCxV3TestConfig) super.clone();
  }

}
