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

package com.google.api.services.serviceusage.v1beta1.model;

/**
 * Configuration controlling usage of a service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Usage extends com.google.api.client.json.GenericJson {

  /**
   * The full resource name of a channel used for sending notifications to the service producer.
   * Google Service Management currently only supports [Google Cloud
   * Pub/Sub](https://cloud.google.com/pubsub) as a notification channel. To use Google Cloud
   * Pub/Sub as the channel, this must be the name of a Cloud Pub/Sub topic that uses the Cloud
   * Pub/Sub topic name format documented in https://cloud.google.com/pubsub/docs/overview.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String producerNotificationChannel;

  /**
   * Requirements that must be satisfied before a consumer project can use the service. Each
   * requirement is of the form /; for example 'serviceusage.googleapis.com/billing-enabled'. For
   * Google APIs, a Terms of Service requirement must be included here. Google Cloud APIs must
   * include "serviceusage.googleapis.com/tos/cloud". Other Google APIs should include
   * "serviceusage.googleapis.com/tos/universal". Additional ToS can be included based on the
   * business needs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> requirements;

  /**
   * A list of usage rules that apply to individual API methods. **NOTE:** All service configuration
   * rules follow "last one wins" order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UsageRule> rules;

  /**
   * The full resource name of a channel used for sending notifications to the service producer.
   * Google Service Management currently only supports [Google Cloud
   * Pub/Sub](https://cloud.google.com/pubsub) as a notification channel. To use Google Cloud
   * Pub/Sub as the channel, this must be the name of a Cloud Pub/Sub topic that uses the Cloud
   * Pub/Sub topic name format documented in https://cloud.google.com/pubsub/docs/overview.
   * @return value or {@code null} for none
   */
  public java.lang.String getProducerNotificationChannel() {
    return producerNotificationChannel;
  }

  /**
   * The full resource name of a channel used for sending notifications to the service producer.
   * Google Service Management currently only supports [Google Cloud
   * Pub/Sub](https://cloud.google.com/pubsub) as a notification channel. To use Google Cloud
   * Pub/Sub as the channel, this must be the name of a Cloud Pub/Sub topic that uses the Cloud
   * Pub/Sub topic name format documented in https://cloud.google.com/pubsub/docs/overview.
   * @param producerNotificationChannel producerNotificationChannel or {@code null} for none
   */
  public Usage setProducerNotificationChannel(java.lang.String producerNotificationChannel) {
    this.producerNotificationChannel = producerNotificationChannel;
    return this;
  }

  /**
   * Requirements that must be satisfied before a consumer project can use the service. Each
   * requirement is of the form /; for example 'serviceusage.googleapis.com/billing-enabled'. For
   * Google APIs, a Terms of Service requirement must be included here. Google Cloud APIs must
   * include "serviceusage.googleapis.com/tos/cloud". Other Google APIs should include
   * "serviceusage.googleapis.com/tos/universal". Additional ToS can be included based on the
   * business needs.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRequirements() {
    return requirements;
  }

  /**
   * Requirements that must be satisfied before a consumer project can use the service. Each
   * requirement is of the form /; for example 'serviceusage.googleapis.com/billing-enabled'. For
   * Google APIs, a Terms of Service requirement must be included here. Google Cloud APIs must
   * include "serviceusage.googleapis.com/tos/cloud". Other Google APIs should include
   * "serviceusage.googleapis.com/tos/universal". Additional ToS can be included based on the
   * business needs.
   * @param requirements requirements or {@code null} for none
   */
  public Usage setRequirements(java.util.List<java.lang.String> requirements) {
    this.requirements = requirements;
    return this;
  }

  /**
   * A list of usage rules that apply to individual API methods. **NOTE:** All service configuration
   * rules follow "last one wins" order.
   * @return value or {@code null} for none
   */
  public java.util.List<UsageRule> getRules() {
    return rules;
  }

  /**
   * A list of usage rules that apply to individual API methods. **NOTE:** All service configuration
   * rules follow "last one wins" order.
   * @param rules rules or {@code null} for none
   */
  public Usage setRules(java.util.List<UsageRule> rules) {
    this.rules = rules;
    return this;
  }

  @Override
  public Usage set(String fieldName, Object value) {
    return (Usage) super.set(fieldName, value);
  }

  @Override
  public Usage clone() {
    return (Usage) super.clone();
  }

}
