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

package com.google.api.services.bigquery.model;

/**
 * Search space for a double hyperparameter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DoubleHparamSearchSpace extends com.google.api.client.json.GenericJson {

  /**
   * Candidates of the double hyperparameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DoubleCandidates candidates;

  /**
   * Range of the double hyperparameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DoubleRange range;

  /**
   * Candidates of the double hyperparameter.
   * @return value or {@code null} for none
   */
  public DoubleCandidates getCandidates() {
    return candidates;
  }

  /**
   * Candidates of the double hyperparameter.
   * @param candidates candidates or {@code null} for none
   */
  public DoubleHparamSearchSpace setCandidates(DoubleCandidates candidates) {
    this.candidates = candidates;
    return this;
  }

  /**
   * Range of the double hyperparameter.
   * @return value or {@code null} for none
   */
  public DoubleRange getRange() {
    return range;
  }

  /**
   * Range of the double hyperparameter.
   * @param range range or {@code null} for none
   */
  public DoubleHparamSearchSpace setRange(DoubleRange range) {
    this.range = range;
    return this;
  }

  @Override
  public DoubleHparamSearchSpace set(String fieldName, Object value) {
    return (DoubleHparamSearchSpace) super.set(fieldName, value);
  }

  @Override
  public DoubleHparamSearchSpace clone() {
    return (DoubleHparamSearchSpace) super.clone();
  }

}
