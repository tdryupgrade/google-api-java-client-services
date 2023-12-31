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

package com.google.api.services.aiplatform.v1.model;

/**
 * The decay curve automated stopping rule builds a Gaussian Process Regressor to predict the final
 * objective value of a Trial based on the already completed Trials and the intermediate
 * measurements of the current Trial. Early stopping is requested for the current Trial if there is
 * very low probability to exceed the optimal value found so far.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec extends com.google.api.client.json.GenericJson {

  /**
   * True if Measurement.elapsed_duration is used as the x-axis of each Trials Decay Curve.
   * Otherwise, Measurement.step_count will be used as the x-axis.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useElapsedDuration;

  /**
   * True if Measurement.elapsed_duration is used as the x-axis of each Trials Decay Curve.
   * Otherwise, Measurement.step_count will be used as the x-axis.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseElapsedDuration() {
    return useElapsedDuration;
  }

  /**
   * True if Measurement.elapsed_duration is used as the x-axis of each Trials Decay Curve.
   * Otherwise, Measurement.step_count will be used as the x-axis.
   * @param useElapsedDuration useElapsedDuration or {@code null} for none
   */
  public GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec setUseElapsedDuration(java.lang.Boolean useElapsedDuration) {
    this.useElapsedDuration = useElapsedDuration;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec clone() {
    return (GoogleCloudAiplatformV1StudySpecDecayCurveAutomatedStoppingSpec) super.clone();
  }

}
