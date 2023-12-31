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

package com.google.api.services.apigee.v1.model;

/**
 * Security configurations to manage scoring.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1SecurityProfileScoringConfig extends com.google.api.client.json.GenericJson {

  /**
   * Description of the config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Path of the component config used for scoring.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scorePath;

  /**
   * Title of the config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Description of the config.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the config.
   * @param description description or {@code null} for none
   */
  public GoogleCloudApigeeV1SecurityProfileScoringConfig setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Path of the component config used for scoring.
   * @return value or {@code null} for none
   */
  public java.lang.String getScorePath() {
    return scorePath;
  }

  /**
   * Path of the component config used for scoring.
   * @param scorePath scorePath or {@code null} for none
   */
  public GoogleCloudApigeeV1SecurityProfileScoringConfig setScorePath(java.lang.String scorePath) {
    this.scorePath = scorePath;
    return this;
  }

  /**
   * Title of the config.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title of the config.
   * @param title title or {@code null} for none
   */
  public GoogleCloudApigeeV1SecurityProfileScoringConfig setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1SecurityProfileScoringConfig set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1SecurityProfileScoringConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1SecurityProfileScoringConfig clone() {
    return (GoogleCloudApigeeV1SecurityProfileScoringConfig) super.clone();
  }

}
