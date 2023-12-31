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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * The Pub/Sub output destination. The Cloud Healthcare Service Agent requires the
 * `roles/pubsub.publisher` Cloud IAM role on the Pub/Sub topic.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PubsubDestination extends com.google.api.client.json.GenericJson {

  /**
   * The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that Pub/Sub messages are published
   * on. Supplied by the client. The `PubsubMessage` contains the following fields: *
   * `PubsubMessage.Data` contains the resource name. * `PubsubMessage.MessageId` is the ID of this
   * notification. It is guaranteed to be unique within the topic. * `PubsubMessage.PublishTime` is
   * the time when the message was published. [Topic
   * names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. The
   * Cloud Healthcare API service account, service-PROJECT_NUMBER@gcp-sa-
   * healthcare.iam.gserviceaccount.com, must have publisher permissions on the given Pub/Sub topic.
   * Not having adequate permissions causes the calls that send notifications to fail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pubsubTopic;

  /**
   * The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that Pub/Sub messages are published
   * on. Supplied by the client. The `PubsubMessage` contains the following fields: *
   * `PubsubMessage.Data` contains the resource name. * `PubsubMessage.MessageId` is the ID of this
   * notification. It is guaranteed to be unique within the topic. * `PubsubMessage.PublishTime` is
   * the time when the message was published. [Topic
   * names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. The
   * Cloud Healthcare API service account, service-PROJECT_NUMBER@gcp-sa-
   * healthcare.iam.gserviceaccount.com, must have publisher permissions on the given Pub/Sub topic.
   * Not having adequate permissions causes the calls that send notifications to fail.
   * @return value or {@code null} for none
   */
  public java.lang.String getPubsubTopic() {
    return pubsubTopic;
  }

  /**
   * The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that Pub/Sub messages are published
   * on. Supplied by the client. The `PubsubMessage` contains the following fields: *
   * `PubsubMessage.Data` contains the resource name. * `PubsubMessage.MessageId` is the ID of this
   * notification. It is guaranteed to be unique within the topic. * `PubsubMessage.PublishTime` is
   * the time when the message was published. [Topic
   * names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. The
   * Cloud Healthcare API service account, service-PROJECT_NUMBER@gcp-sa-
   * healthcare.iam.gserviceaccount.com, must have publisher permissions on the given Pub/Sub topic.
   * Not having adequate permissions causes the calls that send notifications to fail.
   * @param pubsubTopic pubsubTopic or {@code null} for none
   */
  public PubsubDestination setPubsubTopic(java.lang.String pubsubTopic) {
    this.pubsubTopic = pubsubTopic;
    return this;
  }

  @Override
  public PubsubDestination set(String fieldName, Object value) {
    return (PubsubDestination) super.set(fieldName, value);
  }

  @Override
  public PubsubDestination clone() {
    return (PubsubDestination) super.clone();
  }

}
