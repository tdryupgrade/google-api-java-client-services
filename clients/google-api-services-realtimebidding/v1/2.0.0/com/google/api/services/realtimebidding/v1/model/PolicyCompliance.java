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

package com.google.api.services.realtimebidding.v1.model;

/**
 * Policy compliance of the creative for a transaction type or a region.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Real-time Bidding API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PolicyCompliance extends com.google.api.client.json.GenericJson {

  /**
   * Serving status for the given transaction type (for example, open auction, deals) or region (for
   * example, China, Russia). Can be used to filter the response of the creatives.list method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Topics related to the policy compliance for this transaction type (for example, open auction,
   * deals) or region (for example, China, Russia). Topics may be present only if status is
   * DISAPPROVED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PolicyTopicEntry> topics;

  /**
   * Serving status for the given transaction type (for example, open auction, deals) or region (for
   * example, China, Russia). Can be used to filter the response of the creatives.list method.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Serving status for the given transaction type (for example, open auction, deals) or region (for
   * example, China, Russia). Can be used to filter the response of the creatives.list method.
   * @param status status or {@code null} for none
   */
  public PolicyCompliance setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Topics related to the policy compliance for this transaction type (for example, open auction,
   * deals) or region (for example, China, Russia). Topics may be present only if status is
   * DISAPPROVED.
   * @return value or {@code null} for none
   */
  public java.util.List<PolicyTopicEntry> getTopics() {
    return topics;
  }

  /**
   * Topics related to the policy compliance for this transaction type (for example, open auction,
   * deals) or region (for example, China, Russia). Topics may be present only if status is
   * DISAPPROVED.
   * @param topics topics or {@code null} for none
   */
  public PolicyCompliance setTopics(java.util.List<PolicyTopicEntry> topics) {
    this.topics = topics;
    return this;
  }

  @Override
  public PolicyCompliance set(String fieldName, Object value) {
    return (PolicyCompliance) super.set(fieldName, value);
  }

  @Override
  public PolicyCompliance clone() {
    return (PolicyCompliance) super.clone();
  }

}
