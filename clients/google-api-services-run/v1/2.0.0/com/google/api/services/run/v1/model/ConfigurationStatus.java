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

package com.google.api.services.run.v1.model;

/**
 * ConfigurationStatus communicates the observed state of the Configuration (from the controller).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigurationStatus extends com.google.api.client.json.GenericJson {

  /**
   * Conditions communicate information about ongoing/complete reconciliation processes that bring
   * the "spec" inline with the observed state of the world.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV1Condition> conditions;

  /**
   * LatestCreatedRevisionName is the last revision that was created from this Configuration. It
   * might not be ready yet, so for the latest ready revision, use LatestReadyRevisionName.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latestCreatedRevisionName;

  /**
   * LatestReadyRevisionName holds the name of the latest Revision stamped out from this
   * Configuration that has had its "Ready" condition become "True".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latestReadyRevisionName;

  /**
   * ObservedGeneration is the 'Generation' of the Configuration that was last processed by the
   * controller. The observed generation is updated even if the controller failed to process the
   * spec and create the Revision. Clients polling for completed reconciliation should poll until
   * observedGeneration = metadata.generation, and the Ready condition's status is True or False.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer observedGeneration;

  /**
   * Conditions communicate information about ongoing/complete reconciliation processes that bring
   * the "spec" inline with the observed state of the world.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV1Condition> getConditions() {
    return conditions;
  }

  /**
   * Conditions communicate information about ongoing/complete reconciliation processes that bring
   * the "spec" inline with the observed state of the world.
   * @param conditions conditions or {@code null} for none
   */
  public ConfigurationStatus setConditions(java.util.List<GoogleCloudRunV1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * LatestCreatedRevisionName is the last revision that was created from this Configuration. It
   * might not be ready yet, so for the latest ready revision, use LatestReadyRevisionName.
   * @return value or {@code null} for none
   */
  public java.lang.String getLatestCreatedRevisionName() {
    return latestCreatedRevisionName;
  }

  /**
   * LatestCreatedRevisionName is the last revision that was created from this Configuration. It
   * might not be ready yet, so for the latest ready revision, use LatestReadyRevisionName.
   * @param latestCreatedRevisionName latestCreatedRevisionName or {@code null} for none
   */
  public ConfigurationStatus setLatestCreatedRevisionName(java.lang.String latestCreatedRevisionName) {
    this.latestCreatedRevisionName = latestCreatedRevisionName;
    return this;
  }

  /**
   * LatestReadyRevisionName holds the name of the latest Revision stamped out from this
   * Configuration that has had its "Ready" condition become "True".
   * @return value or {@code null} for none
   */
  public java.lang.String getLatestReadyRevisionName() {
    return latestReadyRevisionName;
  }

  /**
   * LatestReadyRevisionName holds the name of the latest Revision stamped out from this
   * Configuration that has had its "Ready" condition become "True".
   * @param latestReadyRevisionName latestReadyRevisionName or {@code null} for none
   */
  public ConfigurationStatus setLatestReadyRevisionName(java.lang.String latestReadyRevisionName) {
    this.latestReadyRevisionName = latestReadyRevisionName;
    return this;
  }

  /**
   * ObservedGeneration is the 'Generation' of the Configuration that was last processed by the
   * controller. The observed generation is updated even if the controller failed to process the
   * spec and create the Revision. Clients polling for completed reconciliation should poll until
   * observedGeneration = metadata.generation, and the Ready condition's status is True or False.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getObservedGeneration() {
    return observedGeneration;
  }

  /**
   * ObservedGeneration is the 'Generation' of the Configuration that was last processed by the
   * controller. The observed generation is updated even if the controller failed to process the
   * spec and create the Revision. Clients polling for completed reconciliation should poll until
   * observedGeneration = metadata.generation, and the Ready condition's status is True or False.
   * @param observedGeneration observedGeneration or {@code null} for none
   */
  public ConfigurationStatus setObservedGeneration(java.lang.Integer observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  @Override
  public ConfigurationStatus set(String fieldName, Object value) {
    return (ConfigurationStatus) super.set(fieldName, value);
  }

  @Override
  public ConfigurationStatus clone() {
    return (ConfigurationStatus) super.clone();
  }

}
