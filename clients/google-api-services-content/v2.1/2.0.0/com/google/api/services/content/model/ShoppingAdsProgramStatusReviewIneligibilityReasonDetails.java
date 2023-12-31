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

package com.google.api.services.content.model;

/**
 * Additional details for review ineligibility reasons.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ShoppingAdsProgramStatusReviewIneligibilityReasonDetails extends com.google.api.client.json.GenericJson {

  /**
   * This timestamp represents end of cooldown period for review ineligbility reason
   * `IN_COOLDOWN_PERIOD`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String cooldownTime;

  /**
   * This timestamp represents end of cooldown period for review ineligbility reason
   * `IN_COOLDOWN_PERIOD`.
   * @return value or {@code null} for none
   */
  public String getCooldownTime() {
    return cooldownTime;
  }

  /**
   * This timestamp represents end of cooldown period for review ineligbility reason
   * `IN_COOLDOWN_PERIOD`.
   * @param cooldownTime cooldownTime or {@code null} for none
   */
  public ShoppingAdsProgramStatusReviewIneligibilityReasonDetails setCooldownTime(String cooldownTime) {
    this.cooldownTime = cooldownTime;
    return this;
  }

  @Override
  public ShoppingAdsProgramStatusReviewIneligibilityReasonDetails set(String fieldName, Object value) {
    return (ShoppingAdsProgramStatusReviewIneligibilityReasonDetails) super.set(fieldName, value);
  }

  @Override
  public ShoppingAdsProgramStatusReviewIneligibilityReasonDetails clone() {
    return (ShoppingAdsProgramStatusReviewIneligibilityReasonDetails) super.clone();
  }

}
