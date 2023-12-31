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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * The data for an entity mention annotation. This represents a mention of an `Entity` in the
 * conversation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1EntityMentionData extends com.google.api.client.json.GenericJson {

  /**
   * The key of this entity in conversation entities. Can be used to retrieve the exact `Entity`
   * this mention is attached to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityUniqueId;

  /**
   * Sentiment expressed for this mention of the entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1SentimentData sentiment;

  /**
   * The type of the entity mention.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The key of this entity in conversation entities. Can be used to retrieve the exact `Entity`
   * this mention is attached to.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityUniqueId() {
    return entityUniqueId;
  }

  /**
   * The key of this entity in conversation entities. Can be used to retrieve the exact `Entity`
   * this mention is attached to.
   * @param entityUniqueId entityUniqueId or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1EntityMentionData setEntityUniqueId(java.lang.String entityUniqueId) {
    this.entityUniqueId = entityUniqueId;
    return this;
  }

  /**
   * Sentiment expressed for this mention of the entity.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1SentimentData getSentiment() {
    return sentiment;
  }

  /**
   * Sentiment expressed for this mention of the entity.
   * @param sentiment sentiment or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1EntityMentionData setSentiment(GoogleCloudContactcenterinsightsV1SentimentData sentiment) {
    this.sentiment = sentiment;
    return this;
  }

  /**
   * The type of the entity mention.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the entity mention.
   * @param type type or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1EntityMentionData setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1EntityMentionData set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1EntityMentionData) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1EntityMentionData clone() {
    return (GoogleCloudContactcenterinsightsV1EntityMentionData) super.clone();
  }

}
